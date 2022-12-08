package handlingDropdown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropdownAsc 
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
		
		/*ArrayList<String> l = new ArrayList<String>();
		
		int count = options.size();
		
		for(WebElement opt:options)
		{
			String txt = opt.getText();
			l.add(txt);
		}
		Collections.sort(l);
		for(String sorted:l) 
		{
			System.out.println(sorted);
		}*/
		TreeSet<String> t = new TreeSet<String>();
		int count = options.size();
		for(WebElement opti:options)
		{
			String text = opti.getText();
			t.add(text);
		
		}
		for(String sort:t)
		{
			System.out.println(sort);
		}
		driver.quit();
	}
}
