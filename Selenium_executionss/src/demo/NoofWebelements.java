package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NoofWebelements 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		List<WebElement> LandIcount = driver.findElements(By.xpath("//img | //a"));
		int count = LandIcount.size();
		System.out.println(count);
		for (int i=0; i<count; i++) 
		{
			WebElement we = LandIcount.get(i);
			String text = we.getText();
			System.out.println(text);
		}
		driver.quit();
	}
}
