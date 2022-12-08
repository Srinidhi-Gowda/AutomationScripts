package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFlipkart//and add products forr cart
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("ugaoo fiddle leaf fig");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/ugaoo-fiddle-leaf-fig-plant/p/itmd835b78074000?pid=PSGG3UVRJCFAXEBH&lid=LSTPSGG3UVRJCFAXEBHSFVLOO&marketplace=FLIPKART&q=ugaoo+fiddle+leaf+fig&store=h1m%2Fum7%2Fsd1%2Fa6l&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=9f239611-b2f3-446d-bb8a-5c62933257bb.PSGG3UVRJCFAXEBH.SEARCH&ppt=hp&ppn=homepage&ssid=7t2m4hvev985lnnk1666419708132&qH=005a5f389a8d3a10' and .='UGAOO Fiddle Leaf Fig Plant']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
	}
}
