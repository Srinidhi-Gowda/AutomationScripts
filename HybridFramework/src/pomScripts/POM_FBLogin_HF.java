package pomScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_FBLogin_HF 
{
			//declaration of elements
			@FindBy(id="email") private WebElement unTextfield;
			
			@FindBy(id = "pass") private WebElement pswTextfield;
			
			@FindBy(xpath = "//button[@type='submit']") private WebElement LoginBtn;
			
			
			//initialization of elements
			public POM_FBLogin_HF(WebDriver driver)//if prompted to change to void dont / instead change to constructor
			{
				PageFactory.initElements(driver, this);
			}
			
			//utilization 
			public void username(String un)// here were generalizing the scripts as we should have generic pom scripts, by giving parameters here itself 
			{
				unTextfield.sendKeys(un);
			}
			public void pasword(String psw)
			{
				pswTextfield.sendKeys(psw);
			}
			public void LoginBtn()
			{
				LoginBtn.click();
			}
}
