package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenYtAndplay //open youtube and play a video
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Sparkle");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Your name.') and @ class='style-scope ytd-video-renderer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Skip Ads']"));
		
		
		
		/*driver.findElement(By.cssSelector("input[id='search']")).click();
		driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("sparkle");
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		driver.findElement(By.xpath(null)//=a[@id='video-title']);*/
		//driver.findElement(By.cssSelector("yt-formatted-string[aria-lable='Sparkle | Your Name AMV by Tranquility 11 months ago 6 minutes, 50 seconds 17,155,246 views']")).click();
		//driver.findElement(By.cssSelector("yt-icon[classname='topbar-icons style-scope ytd-masthead']")).sendKeys("sparkle");
	}
}
