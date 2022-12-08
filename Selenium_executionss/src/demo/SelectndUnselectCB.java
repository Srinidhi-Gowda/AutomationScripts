package demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectndUnselectCB 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/GAGANA%20GOWDA/Desktop/selenium%20related/checkbox.html");
		List<WebElement> cbox = driver.findElements(By.xpath("//input"));
		int count = cbox.size();
		System.out.println(count);
		for (int i=0; i<count ; i++) 
		{
			WebElement we = cbox.get(i);
			we.click();
			Thread.sleep(1000);
		}
		for (int i=count-1; i>=0; i--) 
		{
			WebElement we = cbox.get(i);
			we.click();
			Thread.sleep(1000);
		}
		driver.quit();
		
	}
}
