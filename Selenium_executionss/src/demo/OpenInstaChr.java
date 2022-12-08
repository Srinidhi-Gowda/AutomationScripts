package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenInstaChr 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("srinidhi");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234567");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[classname='sqdOP yWX7d     _8A5w5    ']")).click();
		driver.findElement(By.cssSelector("button[class='sqdOP  L3NKy   y3zKF     ']")).click();
	}
}
  