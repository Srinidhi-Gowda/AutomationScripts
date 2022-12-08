package testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedAssert extends Generic
{

	@Test
	public void trialRun()
	{
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("banglore");
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("Sringeri");
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[.='28']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		String tit = driver.getTitle();
		System.out.println(tit);
		Assert.assertEquals(tit,"Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India");
	}
}
