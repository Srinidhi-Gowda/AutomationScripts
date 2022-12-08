package popUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildFetchTitleofPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> allwind = driver.getWindowHandles();
		for(String wh:allwind)
		{
			driver.switchTo().window(wh);
			String tit = driver.getTitle();
			System.out.println(tit);//child title About me - qavalidation
			Thread.sleep(5000);
			driver.close();
			
		}
	}
}
