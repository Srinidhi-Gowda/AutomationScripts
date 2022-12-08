package eComDomain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Bewakoof 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bewakoof.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//span[.='MEN'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		
		driver.quit();
	}
}
