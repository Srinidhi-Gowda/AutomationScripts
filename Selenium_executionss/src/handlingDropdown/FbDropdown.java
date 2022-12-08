package handlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropdown 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
		int count = options.size();
		System.out.println(count);
		
		
		driver.get("https://www.facebook.com/r.php");
		WebElement ele1 = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s1=new Select(ele1);
		List<WebElement> options1 = s1.getOptions();
		int count1 = options1.size();
		for(WebElement opt:options1)
		{
			String t = opt.getText();
			System.out.println(t);
		}
		
		driver.quit();
	}
}
