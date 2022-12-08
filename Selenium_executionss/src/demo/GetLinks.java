package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLinks 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		for(WebElement linkadress:link)
		{
			String x = linkadress.getAttribute("href");
			System.out.println(x);
		}
		driver.quit();
	}
}
