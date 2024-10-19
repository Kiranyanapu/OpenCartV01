package pagObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationpage extends BasePage {
	
	public AccountRegistrationpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txttelephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtconfpassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkagree;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btncontinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirm;
	
	public void setFirstName(String fname)
	{
		txtfirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void setTelephone(String tel)
	{
		txttelephone.sendKeys(tel);
	}
	
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void setConfpassword(String pwd)
	{
		txtconfpassword.sendKeys(pwd);
	}
	
	public void setPrivacyPolicy()
	{
		chkagree.click();
	}
	
	public void clickContinue()
	{
		btncontinue.click();
	}
	
	public String getConfirmationMessage()
	{
		try
		{
			return(msgconfirm.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	

}
