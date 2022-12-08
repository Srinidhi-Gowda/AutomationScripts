package pomScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_Facebook_Everything

{
	//declaration of elements
		@FindBy(id="email") private WebElement unTextfield;
		
		@FindBy(id = "pass") private WebElement pswTextfield;
		
		@FindBy(xpath = "//button[@type='submit']") private WebElement LoginBtn;
		
		@FindBy(xpath = "//a[.='Create New Account']") private WebElement CreateAccButt;
		
		@FindBy(xpath = "//input[@name='firstname']") private WebElement FNTxtfield;
		
		@FindBy(xpath = "//input[@name='lastname']") private WebElement LNTxtfield;
		
		@FindBy(xpath = "//input[@name='reg_email__']") private WebElement EmailTxtfield;
		
		@FindBy(xpath = "//input[@name='reg_passwd__']") private WebElement PasswordTxtfiles;
		
		@FindBy(xpath = "(//input[@name='sex'])[1]") private WebElement genderFM;
		
		@FindBy(xpath = "(//input[@name='sex'])[2]") private WebElement genderMa;
		
		@FindBy(xpath = "(//input[@name='sex'])[3]") private WebElement genderCustomise;
		
		@FindBy(xpath = "//select[@name='birthday_day']") private WebElement Birthdate;
		
		@FindBy(xpath = "//select[@name='birthday_month']") private WebElement Birthmonth;
		
		@FindBy(xpath = "//select[@name='birthday_year']") private WebElement Birthyear;
		
		
		
		//initialization of elements
		public POM_Facebook_Everything(WebDriver driver)//if prompted to change to void dont / instead change to constructor
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
		public void CreateAccBut()
		{
			CreateAccButt.click();
		}
		public void FnTxtfield(String FirstName)
		{
			FNTxtfield.sendKeys(FirstName);
		}
		public void LnTxtfield(String LastName)
		{
			LNTxtfield.sendKeys(LastName);
		}
		public void Emailid(String email)
		{
			EmailTxtfield.sendKeys(email);
		}
		public void newPWDTxt(String newpwd)
		{
			PasswordTxtfiles.sendKeys(newpwd);
		}
		public void femaleGender()
		{
			genderFM.click();
		}
		public void MaleGender()
		{
			genderMa.click();
		}
		public void CustomGender()
		{
			genderCustomise.click();
		}
		public void BDate(String date)
		{
			WebElement bdte = Birthdate;
			Select s = new Select(bdte);
			s.selectByVisibleText(date);
		}
		public void BMon(String month)
		{
			WebElement bmon = Birthdate;
			Select s = new Select(bmon);
			s.selectByValue(month);
		}
		public void BYear(String year)
		{
			WebElement byear = Birthdate;
			Select s = new Select(byear);
			s.selectByValue(year);
		}
		
		
}
