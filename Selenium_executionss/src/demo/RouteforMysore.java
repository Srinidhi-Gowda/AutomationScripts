package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RouteforMysore
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps/@12.9794048,77.5979008,12z");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @placeholder='Choose starting point, or click on the map...']")).sendKeys("BK Nagar bangalore");
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @placeholder='Choose destination, or click on the map...']")).sendKeys("hasanamba temple hassan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@data-tooltip='Driving']")).click();
		//driver.findElement(By.xpath(""))
	}
}
