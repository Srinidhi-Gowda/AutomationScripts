package popUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenKannadaLinkandSwitchtoNewtab 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement kan = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		
		Actions act = new Actions(driver);
		act.contextClick(kan).perform();
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		Set<String> alwin = driver.getWindowHandles();
		Thread.sleep(2000);
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.addAll(alwin);
		
		int c = list.size();
		System.out.println(c);
		
		String arrno1=list.get(1);
		driver.switchTo().window(arrno1);		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
