package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pomScripts.PomConceptsActitime;

public class LoginMultitimes 
{
	@Test
	public void test01() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		PomConceptsActitime p=new PomConceptsActitime(driver);
		
		p.loginbutton();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.loginbutton();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
