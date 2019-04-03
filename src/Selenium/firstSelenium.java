package Selenium;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;







import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class firstSelenium {
	
	WebDriver driver;
	@Test(enabled=false)
	public void Test()
	{
		driver=utility.getBrowser(driver,"Chrome","http://www.facebook.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
		
	}
	
	@Test(enabled=false)
	public void validateRadiobutton()
	{
		WebElement male=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		System.out.println(male.isDisplayed());
		System.out.println(male.isEnabled());
		System.out.println(male.isSelected());
		male.click();
		System.out.println(male.isSelected());
		System.out.println(male.isEnabled());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(enabled=false)
	public void ValidateDropDown() throws InterruptedException
	{
		WebElement day=driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByValue("12");
		
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(4);
		
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1978");
		Thread.sleep(1000);
		driver.close();
		
	  
	}
	@Test(priority=1)
	public void BootStrapDropDown(){
		driver=utility.getBrowser(driver, "chrome", "http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		List<WebElement> al=driver.findElements(By.xpath("//ul[@class='dropdown-menu']"));
		for(WebElement i:al)
		{
			System.out.println(i.getText());
			if(i.getAttribute("innerHTML").contains("JavaScript"))
			{
				i.click();
				break;
			}
		}
		
	}
	
	
	
	
	
	

}
