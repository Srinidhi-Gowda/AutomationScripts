package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.reddit.com");
		Thread.sleep(2000);
		String title = driver.getTitle();//get title
		System.out.println(title);
		String url = driver.getCurrentUrl();//get the url
		System.out.println(url);
		//String src = driver.getPageSource();//get the page source code
		//System.out.println(src);
		driver.close();
	}
}
