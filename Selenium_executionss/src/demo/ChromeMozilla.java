package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeMozilla 
{
	public static void main(String[] args) 
	{
		String key1="webdriver.gecko.driver";
		String value1="./Software/geckodriver.exe";
		System.setProperty(key1,value1);
		FirefoxDriver driver1=new FirefoxDriver();
		
		String key2="webdriver.chrome.driver";
		String value2="./Software/chromedriver.exe";
		System.setProperty(key2,value2);
		ChromeDriver driver2=new ChromeDriver();
	}
}
