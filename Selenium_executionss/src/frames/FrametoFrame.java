package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrametoFrame 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/frames");
		WebElement frame1 = driver.findElement(By.id("frame1"));//switch to using web element
		driver.switchTo().frame(frame1);
		String frame1txt = driver.findElement(By.xpath("//h1[.='This is a sample page']")).getText();
		System.out.println("Text from frame 1 is "+frame1txt);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");// switch to using name
		String frame2txt = driver.findElement(By.xpath("//h1[.='This is a sample page']")).getText();
		System.out.println("Text from frame 2 is "+frame2txt);
		
		driver.switchTo().defaultContent();
		driver.close();
		
		
	}
}
