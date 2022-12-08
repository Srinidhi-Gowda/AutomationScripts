package pomScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomConceptsActitime 
{
	//declaration of elements
	@FindBy(id="username")
	private WebElement unTextfield;
	
	@FindBy(name="pwd")
	private WebElement pwdTextfield;
	
	@FindBy (xpath = "//div[.='Login ']")
	private WebElement loginBtn;
	
	//initialization of elements
	public PomConceptsActitime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization 
	public void username(String un)// here were generalizing the scripts as we should have generic pom scripts, by giving parameters here itself 
	{
		unTextfield.sendKeys(un);
	}
	
	public void password(String pwd)
	{
		pwdTextfield.sendKeys(pwd);
	}
	
	public void loginbutton()
	{
		loginBtn.click();
	}
}
