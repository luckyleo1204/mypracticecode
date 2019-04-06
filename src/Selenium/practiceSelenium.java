package Selenium;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class practiceSelenium {

	WebDriver driver;
	
	@Test
	public void verifyLinksonPage() throws  IOException
	{
		driver=utility.getBrowser(driver, "chrome", "http://www.google.com");
		List<WebElement> al=driver.findElements(By.tagName("a"));
		System.out.println(al.size());
		al.addAll(driver.findElements(By.tagName("img")));
		System.out.println(al.size());
		List<WebElement> fl=new ArrayList<WebElement>();
		for(WebElement i: al){
			
			if(i.getAttribute("href")!=null){
				fl.add(i);
			}
		}
		System.out.println(fl.size());
		for(WebElement i:fl)
		{
			System.out.println("URL:"+i.getAttribute("href")+":"+urlStatus(new URL(i.getAttribute("href"))));
		}
		driver.quit();
		
	}
	
	@Test
	public void webTableExample()
	{
		driver=utility.getBrowser(driver, "chrome", "https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		WebElement webTable=driver.findElement(By.xpath("//table[@class='dataTable']"));
		List<WebElement> rows=webTable.findElements(By.tagName("tr"));
		int rcount=rows.size();
		for(int i=0;i<rcount;i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			int ccount=cols.size();
			for(int j=0;j<ccount;j++)
			{
				System.out.print(cols.get(j).getText());
			}
			System.out.println();
		}
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

	private String urlStatus(URL url) throws IOException {
		String statusmessage=null;
		 HttpURLConnection con=(HttpURLConnection) url.openConnection();
		 con.connect();
		 statusmessage=con.getResponseMessage();
		 con.disconnect(); 
		return statusmessage;
	}
	
}
