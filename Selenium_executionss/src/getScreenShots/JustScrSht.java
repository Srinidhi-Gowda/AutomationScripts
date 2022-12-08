package getScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JustScrSht 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thesouledstore.com/");
		Thread.sleep(5000);
		
		//Step-1 Typecast
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Step-2 Get Screenshot
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Step-3 get Destination
		File dst = new File("C:\\Users\\GAGANA GOWDA\\Desktop\\selenium related\\Screenshots\\f1.jpeg");
		
		//Step-4 mention the source and destination
		FileUtils.copyFile(src,dst);
		driver.quit();
	}
}
