package popUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenMaxMinCloseUnconventional 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thesouledstore.com/");
		
		Thread.sleep(5000);
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_WINDOWS);
		rob.keyPress(KeyEvent.VK_M);
		rob.keyRelease(KeyEvent.VK_WINDOWS);
		rob.keyRelease(KeyEvent.VK_M);
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		rob.keyPress(KeyEvent.VK_ALT);
		rob.keyPress(KeyEvent.VK_F4);
		rob.keyRelease(KeyEvent.VK_ALT);
		rob.keyRelease(KeyEvent.VK_F4);
		//driver.quit();
	}
}
