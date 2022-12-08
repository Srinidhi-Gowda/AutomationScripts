package testScripts;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;

import genericScripts.Generic_ScreenGrab;

public class trial extends Generic_ScreenGrab
{
	public static void main(String[] args) throws InterruptedException, IOException {
		{
			System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
				
			driver.manage().window().maximize();
			driver.get("https://www.thesouledstore.com/");
			Thread.sleep(2000);
			SnapScreen(driver);
			Thread.sleep(2000);
			driver.quit();
		}
	}
}
