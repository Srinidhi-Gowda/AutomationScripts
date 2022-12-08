package handlingDropdown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropdownDescOrd 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s = new Select(ele);
		List<WebElement> opt = s.getOptions();
		TreeSet<String> l = new TreeSet<String>(Collections.reverseOrder());
		
		
		for (WebElement webele:opt) 
		{
			String txt = webele.getText();
			l.add(txt);
		}
		for(String t2:l)
		{
			System.out.println(t2);
		}	
		
		driver.quit();
	}
}
