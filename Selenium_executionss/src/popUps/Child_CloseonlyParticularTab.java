package popUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_CloseonlyParticularTab 
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
			//String p_id = driver.getWindowHandle();
			Set<String> allwind = driver.getWindowHandles();
			
			for(String wh:allwind)
			{
				
				driver.switchTo().window(wh);
				String tit = driver.getTitle();
				System.out.println(tit);
				Thread.sleep(5000);
				
				if(tit.equals("About me - qavalidation"))
				{
					driver.close();
				}
			}
			
			Thread.sleep(5000);
			driver.quit();
			
	}		
	
}
