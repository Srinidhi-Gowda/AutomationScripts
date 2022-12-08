package handlingMouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.xpath("//div[@id='box6']"));//fetch source address
		WebElement dst = driver.findElement(By.xpath("//div[@id='box106']"));// fetch the destination address
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src,dst).perform();
		Thread.sleep(2000);
		
		src=driver.findElement(By.xpath("//div[@id='box2']"));
		dst=driver.findElement(By.xpath("//div[@id='box102']"));
		act.dragAndDrop(src,dst).perform();
		Thread.sleep(2000);
		
		src=driver.findElement(By.xpath("//div[@id='box1']"));
		dst=driver.findElement(By.xpath("//div[@id='box101']"));
		act.dragAndDrop(src,dst).perform();
		Thread.sleep(2000);
		
		src=driver.findElement(By.xpath("//div[@id='box3']"));
		dst=driver.findElement(By.xpath("//div[@id='box103']"));
		act.dragAndDrop(src,dst).perform();
		Thread.sleep(2000);
		
		src=driver.findElement(By.xpath("//div[@id='box4']"));
		dst=driver.findElement(By.xpath("//div[@id='box104']"));
		act.dragAndDrop(src,dst).perform();
		Thread.sleep(2000);
		
		src=driver.findElement(By.xpath("//div[@id='box5']"));
		dst=driver.findElement(By.xpath("//div[@id='box105']"));
		act.dragAndDrop(src,dst).perform();
		Thread.sleep(2000);
		
		src=driver.findElement(By.xpath("//div[@id='box7']"));
		dst=driver.findElement(By.xpath("//div[@id='box107']"));
		act.dragAndDrop(src,dst).perform();
		
		Thread.sleep(10000);
		driver.quit();
	}
}
