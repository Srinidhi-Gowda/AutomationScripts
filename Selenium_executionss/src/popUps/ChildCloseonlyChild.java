package popUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildCloseonlyChild {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		
		String p_id = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		
		int count = allwin.size();
		System.out.println(count);//now count will be 2
		allwin.remove(p_id);
		int count2 = allwin.size();
		System.out.println(count2);//after removing the p-id count will be 1
		
		for(String wh:allwin)
		{
			driver.switchTo().window(wh);
			String tit = driver.getTitle();
			System.out.println(tit);
			Thread.sleep(5000);
			driver.close();
		}
		
	}

}
