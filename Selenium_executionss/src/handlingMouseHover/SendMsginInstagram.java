package handlingMouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendMsginInstagram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("dark420phoenix");
		//driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("dark420phoenix");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Srigowda007");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Log in']")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Not Now']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//span[.='Search']")).sendKeys("srinidhi");
		driver.findElement(By.xpath("//a[@href='/direct/inbox/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Srinidhi ಗೌಡ'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Message...']")).sendKeys("yo sri from sent via automation");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Send']")).click();
		//driver.quit();
	}
}
