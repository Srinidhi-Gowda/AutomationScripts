package handlingDropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckifOptisPresent 
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
	
	ArrayList<String> l = new ArrayList<String>();
	
	for (WebElement we:opt) 
	{
		String txt = we.getText();
		l.add(txt);
	}
	
	if (l.contains("Nov")) 
	{
		System.out.println("option is present");
	}
	else 
	{
		System.out.println("option is not present");
	}
	driver.quit();
}
}
