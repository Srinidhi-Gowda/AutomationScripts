package testScripts;

import org.testng.annotations.Test;

import genericScripts.Base_Test;
import pomScripts.POM_Facebook_Everything;

public class Login_FaceBook_01 extends Base_Test
{
	@Test
	public void test01() throws InterruptedException
	{
		 POM_Facebook_Everything fb = new POM_Facebook_Everything(driver);
		
		//fb.username("mr Nobody");
		//fb.pasword("mr Myself");
		//fb.LoginBtn();
		//Thread.sleep(5000);
		
		//driver.navigate().back();
		Thread.sleep(2000);
		fb.CreateAccBut();
		Thread.sleep(2000);
		fb.FnTxtfield("hey");
		fb.LnTxtfield("goggi");
		fb.Emailid("me@my.com");
		fb.newPWDTxt("123456");
		fb.femaleGender();
		fb.MaleGender();
		fb.BDate("22");
		fb.BYear("1995");
		
		Thread.sleep(5000);
	}
}
