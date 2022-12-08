package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFilePopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/GAGANA%20GOWDA/Desktop/selenium%20related/Upload%20popup.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("upload file here"));
		ele.sendKeys("C:\\Users\\GAGANA GOWDA\\Desktop\\tc.txt");
		Thread.sleep(5000);
		driver.quit();
	}
}
