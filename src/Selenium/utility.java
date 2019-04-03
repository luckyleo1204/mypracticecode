package Selenium;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class utility {
	
	public WebDriver driver;
	
	public static WebDriver getBrowser(WebDriver driver,String BrowserType,String url )
	{
		if(BrowserType.equalsIgnoreCase("Firefox"))
		{
			//FirefoxProfile profile=new FirefoxProfile();
			 
			// This will set the true value
			//profile.setAcceptUntrustedCertificates(true);
			 
			// This will open  firefox browser using above created profile
			//WebDriver driver=new FirefoxDriver(profile);
			 
			driver.get("pass the url as per your requirement");
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\WorkingDrivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		if(BrowserType.equalsIgnoreCase("Chrome"))
		{
			//DesiredCapabilities cap=DesiredCapabilities.chrome();
			 
			// Set ACCEPT_SSL_CERTS  variable to true
			//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			 
			// Set the driver path
			//System.setProperty("webdriver.chrome.driver","Chrome driver path");
			 
			// Open browser with capability
			//WebDriver driver=new ChromeDriver(cap)
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\WorkingDrivers\\chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			co.setExperimentalOption("prefs", prefs);
			co.addArguments("--disable-extensions");
			driver=new ChromeDriver(co);
	
		}
		if(BrowserType.equalsIgnoreCase("ie")){
			//DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
			 
			// Set ACCEPT_SSL_CERTS  variable to true
			//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			 
			// Set the driver path
			//System.setProperty("webdriver.ie.driver","IE driver path");
			 
			// Open browser with capability
			//WebDriver driver=newInternetExplorerDriver(cap);

			System.setProperty("webdriver.ieDriver.driver", "");
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.get(url);
		return driver;

}
	
	public static void takeScreenshot(WebDriver driver)
	{
		//File f=takeScreenshotas(driver)
		
	}
	
	public static WebElement isElementPresnt(WebDriver driver, String locator,int time)
	{
		WebElement ele=null;
		
		for(int i=0;i<time;i++)
		{
		try{
		ele=driver.findElement(By.xpath(locator));
		break;
		}
		catch(Exception e)
		{
		try 
		{
		Thread.sleep(1000);
		} catch (InterruptedException e1) 
		{
		System.out.println("Waiting for element to appear on DOM");
		}
		}
		 
		 
		}
		return ele;
		
	}
	
	
	
}
