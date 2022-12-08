package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TrialonBewakoof
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.bewakoof.com/");
		
		WebElement login = driver.findElement(By.xpath("//a[.='Login']"));
		login.click();
		driver.findElement(By.xpath("//button[.=' CONTINUE WITH EMAIL']")).click();
		driver.findElement(By.xpath("//input[@id='email_input']")).sendKeys("snats77@gmail.com");
		driver.findElement(By.xpath("//input[@id='mob_password']")).sendKeys("8105237664SRSG");
		driver.findElement(By.xpath("//button[@id='mob_login_password_submit']")).click();
		
		WebElement men = driver.findElement(By.xpath("(//span[.='MEN'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(men).perform();
		driver.findElement(By.xpath("(//span[.='Jackets'])[1]")).click();
		
		
		driver.quit();
	}
}
