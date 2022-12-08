package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class CompareIphonePrice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone 14 128gb");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		WebElement flipprice = driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Blue, 128 GB)']/../../div[2]/div[1]/div[1]"));
		Thread.sleep(2000);
		String price1 = flipprice.getText();
		System.out.println(price1);
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("iphone 14 128gb");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(1000);
		WebElement amaprice = driver.findElement(By.xpath("(//span[.='Apple iPhone 14 128GB Blue']/../../../../div[3]//span[2])[1]"));
		Thread.sleep(1000);
		String price2 = amaprice.getText();
		//double amazon=price2;
		System.out.println("the price in flipkart is "+price1);
		System.out.println("the price in amazon is "+price2);
		driver.quit();
	}
}
