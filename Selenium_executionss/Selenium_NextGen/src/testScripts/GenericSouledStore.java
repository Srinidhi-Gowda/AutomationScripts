package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericSouledStore 
{
	public WebDriver driver;
	@BeforeMethod
	public void openApp() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.thesouledstore.com/men");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
	
	
}
