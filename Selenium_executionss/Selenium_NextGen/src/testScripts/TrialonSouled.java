package testScripts;

import org.testng.annotations.Test;

import pomScripts.SouledStorePOM;

public class TrialonSouled extends GenericSouledStore
{
	@Test
	public void test01() throws InterruptedException
	{
		SouledStorePOM soul = new SouledStorePOM(driver);

		soul.Hoodiesandjackets();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		soul.Sweatshirt();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		soul.topbtn();
		Thread.sleep(2000);
		soul.register();
		Thread.sleep(2000);
		soul.FNtxtfield("Srinidhi");
		Thread.sleep(1000);
		soul.LNtxtfield("gowda");
		Thread.sleep(1000);
		soul.Email("abc.xyz@g.com");
		Thread.sleep(1000);
		soul.mobno("42069");
		Thread.sleep(1000);
		soul.pswFirst("123psw");
		Thread.sleep(1000);
		soul.confpsw("69420");
		Thread.sleep(1000);
		soul.submitbtn();
		Thread.sleep(5000);
	}
}
