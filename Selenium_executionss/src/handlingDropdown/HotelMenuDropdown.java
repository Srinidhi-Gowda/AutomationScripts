package handlingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelMenuDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/GAGANA%20GOWDA/Desktop/selenium%20related/hotel%20menu.html");
		WebElement ele = driver.findElement(By.id("maruthi military hotel multiple"));
		Select S=new Select(ele);
		S.selectByIndex(2);
		Thread.sleep(2000);
		S.selectByIndex(1);
		Thread.sleep(1000);
		
		S.selectByVisibleText("chicken kebab");
		Thread.sleep(2000);
		
		S.selectByValue("d");
		Thread.sleep(2000);
		
		S.selectByValue("e");
		Thread.sleep(2000);
		
		S.deselectAll();
		Thread.sleep(1000);
		
		boolean b = S.isMultiple();
		if (b) 
		{
			System.out.println("is a multiselect dropdown");
		}
		else 
		{
			System.out.println("is not a multiselect dd");
		}
		
		driver.quit();
	}
}
