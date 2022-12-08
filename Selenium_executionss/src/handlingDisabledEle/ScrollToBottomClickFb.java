package handlingDisabledEle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollToBottomClickFb 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement fbloc = driver.findElement(By.xpath("//a[.='Facebook']"));
		Point loc = fbloc.getLocation();
		int xloc = loc.getX();
		int yloc = loc.getY();
		
		Thread.sleep(2000);
		
		for (int i=0; i<10; i++) 
		{
			js.executeScript("window.scrollBy(0,500)");
		}
		System.out.println(xloc+"and"+yloc);
		
		js.executeScript("window.scrollBy("+xloc+","+yloc+")");
		Thread.sleep(2000);
		
		fbloc.click();
		Thread.sleep(5000);
		
		driver.quit();
	}
}
