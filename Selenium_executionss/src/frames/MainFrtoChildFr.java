package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainFrtoChildFr 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// implicitly wait 
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.findElement(By.xpath("//li[@id='iFrame']")).click();
		driver.switchTo().frame("globalSqa");
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("Selenium");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.close();
		
	}
}
