package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckifElementisEnab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		Thread.sleep(1000);
		if (btn.isDisplayed()) 
		{
			if (btn.isEnabled()) 
			{
				System.out.println("button is displayed and enabled");
			}
			else 
			{
				System.out.println("button is not enabled");
			}
		}
		else 
		{
			System.out.println("button is not displayed");
		}
		driver.quit();
	}
}
