package handlingDropdown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RevDropdown 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s = new Select(ele);//its derived from ui package
		List<WebElement> alloptions = s.getOptions();
		TreeSet<String> t = new TreeSet<String>();
		int count = alloptions.size();
		for(WebElement opts:alloptions)//create a loop variable opti
		{
			String text = opts.getText();//fetch text from opti and store in text
			t.add(text);//the value in text store it in t of the tree set 
		}
		for(String sorted:t)
		{
			System.out.println(sorted);
			
		}
		
		driver.quit();
	}
}
