package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivPopUps 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Sringeri");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='13']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		
		//driver.quit();
	}
}
