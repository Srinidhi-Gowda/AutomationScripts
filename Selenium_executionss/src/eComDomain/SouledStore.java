package eComDomain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SouledStore 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thesouledstore.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='moe-dontallow_button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='MEN ']")).click();
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("(//li[@class='nav-item dropdown'])[1]"));
		/*Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		System.out.println(count);*/
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(.,'Hoodies & Jackets')])[1]")).click();
		Thread.sleep(10000);
		
		driver.quit();
	}
}
