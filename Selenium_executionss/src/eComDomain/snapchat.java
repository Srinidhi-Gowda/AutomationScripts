package eComDomain;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class snapchat 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.snapchat.com/accounts/login?continue=%2Faccounts%2Fwelcome");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("srinidhi.mamahome@gmail.com");
		driver.findElement(By.name("password")).sendKeys("8105237664snapchatSRSG");
		driver.findElement(By.id("loginTrigger")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.='SnapChat for Web 💻']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
