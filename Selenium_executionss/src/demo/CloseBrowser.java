package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		// driver.close(); closes only one tab
		driver.quit();
		
	}
}
