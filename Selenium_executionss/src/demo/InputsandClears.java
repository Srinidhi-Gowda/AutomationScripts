package demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InputsandClears 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/GAGANA%20GOWDA/Desktop/selenium%20related/txt%20fields.html");
		List<WebElement> textfield = driver.findElements(By.xpath("//input"));
		int count = textfield.size();
		for(WebElement we:textfield)
		{
			we.sendKeys("Srinidhi S Gowda");
			Thread.sleep(1000);
		}
		for (int i=count-1;i<=0;i--) 
		{
			WebElement TF = driver.findElement(By.xpath("//input"));
			TF.sendKeys(Keys.CONTROL+"a");
			TF.sendKeys(Keys.BACK_SPACE);
			Thread.sleep(1000);
		}
	/*	for (int i=count-1; i>=0; i--) 
		{
			WebElement we = textfield.get(i);
			we.clear();
			Thread.sleep(1000);
		}*/
		driver.quit();
	}
}
