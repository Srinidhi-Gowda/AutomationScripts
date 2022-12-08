package pomScripts;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SouledStorePOM 
{
	//declaration of ele
	@FindBy(xpath = "//img[@alt='Hoodies & Jackets']")
	private WebElement Hoodies;
	
	@FindBy(xpath = "//img[@alt='Sweatshirts']") private WebElement Sweatshirts;
	
	@FindBy(xpath = "//img[@alt='T-shirts']") private WebElement tshirt;
	
	@FindBy(xpath = "//span[.='Returns & Refunds']") private WebElement retandreflink;
	
	@FindBy(xpath = ("//a[@aria-label='Twitter']")) private WebElement twitter;
	
	@FindBy(xpath = "//span[@class='nav-link noTdropdown']") private WebElement tophome;
	
	@FindBy(xpath = "//span[@class='nav-link']") private WebElement registerbtn;
	
	@FindBy(xpath="//input[@placeholder='First Name *']") private WebElement FirstnameTxtfield;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']") private WebElement lastnameTxtfield;
	
	@FindBy(xpath="//input[@placeholder='Email ID *']") private WebElement emailTxtfield;
	
	@FindBy(xpath = "//input[@placeholder='Choose New Password *']") private WebElement PWDfirst;
	
	@FindBy(xpath = "//input[@placeholder='Confirm Password *']") private WebElement confPWD;
	
	@FindBy(xpath = "//input[@placeholder='Mobile Number(For order status update) *']") private WebElement MobNo;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement submitbtn;
	
	//initialization
	public SouledStorePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// utilization
	
	public void Hoodiesandjackets()
	{
		Hoodies.click();
	}
	public void Sweatshirt()
	{
		Sweatshirts.click();
	}
	public void tshirt()
	{
		tshirt.click();
	}
	public void referlink()
	{
		retandreflink.click();
	}
	public void twitter()
	{
		twitter.click();
	}
	public void topbtn()
	{
		tophome.click();
	}
	public void register()
	{
		registerbtn.click();
	}
	public void FNtxtfield(String FN)
	{
		FirstnameTxtfield.sendKeys(FN);
	}
	public void LNtxtfield(String LN)
	{
		lastnameTxtfield.sendKeys(LN);
	}
	public void Email(String email)
	{
		emailTxtfield.sendKeys(email);
	}
	public void pswFirst(String psw)
	{
		PWDfirst.sendKeys(psw);
	}
	public void confpsw(String confPwd)
	{
		confPWD.sendKeys(confPwd);
	}
	public void mobno(String mobNo)
	{
		MobNo.sendKeys(mobNo);
	}
	public void submitbtn()
	{
		submitbtn.click();
	}
}
