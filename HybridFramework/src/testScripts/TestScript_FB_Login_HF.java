package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericScripts.Base_Test;
import pomScripts.POM_FBLogin_HF;

public class TestScript_FB_Login_HF extends Base_Test
{
	@Test
	public void script01() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String username = genericScripts.Generic_FetchFromExcel.getData("Sheet1",0, 0);
		String password = genericScripts.Generic_FetchFromExcel.getData("Sheet1",0,1);
		
		POM_FBLogin_HF pmc = new POM_FBLogin_HF(driver);
		
		pmc.username(username);
		pmc.pasword(password);
		pmc.LoginBtn();
		Assert.fail();
		Thread.sleep(5000);
		
	}
}
