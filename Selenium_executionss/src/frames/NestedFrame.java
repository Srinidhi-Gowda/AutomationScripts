package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedFrame 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		String parenttxt = driver.findElement(By.xpath("frame1")).getText();
		System.out.println("parent frame txt is "+parenttxt);
		
		driver.switchTo().frame("//iframe[@srcdoc='<p>Child Iframe</p>']");;
		String childtxt = driver.findElement(By.xpath("<p>Child Iframe")).getText();
		System.out.println("Child frame txt is "+childtxt);
		
		
	}
}
