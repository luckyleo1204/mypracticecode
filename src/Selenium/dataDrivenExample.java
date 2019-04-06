package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDrivenExample {
	WebDriver driver;
	
	@Test(dataProvider="TestuserData")
	public void testDatafromDataProvider(int i, int j)
	{
		System.out.print(i+":"+j+"\n");
	}
	
	@DataProvider(name="TestuserData")
	public Object[][] testData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]=1;
		data[0][1]=2;
		data[1][0]=1;
		data[1][1]=2;
		
		return data;
		
	}
	@Test(dataProvider="FacebookData")
	public void facebookTest(String uname, String pwd) throws InterruptedException
	{
		driver=utility.getBrowser(driver, "chrome", "http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}
	
	@DataProvider(name="FacebookData")
	public Object[][] facebookDta()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="cp.murali@gmail.com";
		data[0][1]="mu5ra5li";
		data[1][0]="cp.murali@gmail.com";
		data[1][1]="mu5ra5li";
		
		return data;
	}
	
	@AfterMethod
	public void teardown()
	{
		if(driver!=null)
		driver.quit();
	}

}
