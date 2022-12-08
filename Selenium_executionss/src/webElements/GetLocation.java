package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLocation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement career = driver.findElement(By.xpath("//a[.='Careers']"));
		Point loc = career.getLocation();
		System.out.println(loc);
		Thread.sleep(2000);
		int x = loc.getX();
		Thread.sleep(1000);
		int y = loc.getY();
		System.out.println(x+"     "+y);
		driver.quit();
		
	}
}
