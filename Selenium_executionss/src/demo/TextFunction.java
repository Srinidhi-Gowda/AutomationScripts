package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextFunction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcdefg");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	
}
