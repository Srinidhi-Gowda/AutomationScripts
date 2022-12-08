package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFbcss //chrome
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Srinidhi Gowda");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("sri");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
		
	}
}
