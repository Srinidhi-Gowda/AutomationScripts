package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickLink 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/GAGANA%20GOWDA/Desktop/selenium%20related/reddit.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
		
	}
}
