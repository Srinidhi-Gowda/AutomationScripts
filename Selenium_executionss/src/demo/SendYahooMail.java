package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SendYahooMail 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='text' and @title='Sign In']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("srinidhi.gowda");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("/*diagonal*/");
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='icon mail']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@data-test-id='compose-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("snats77@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("sending via Automation");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hello prapancha, this is new ullassa");
		Thread.sleep(1000);
		/*driver.findElement(By.xpath("//button[@title='Attach files']")).click();
		driver.findElement(By.xpath("(//span[.='Attach files from computer'])[1]")).sendKeys("C:\\Users\\GAGANA GOWDA\\Desktop\\tc.txt");
		
		Thread.sleep(5000);
		
	//	driver.findElement(By.xpath("(//span[.='Attach files from computer'])[1]")).sendKeys("\"C:\\\\Users\\\\GAGANA GOWDA\\\\Desktop\\\\tc.txt\"");
		
		//driver.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
		Thread.sleep(5000);*/
		
		WebElement ele = driver.findElement(By.xpath("(//img[@alt='Profile image'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Sign out']")).click();
		//gaganagowda0810@gmail.com preethimuniraju@gmail.com
	}
}
