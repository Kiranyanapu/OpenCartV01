package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pagObjects.AccountRegistrationpage;
import pagObjects.HomePage;
import testBase.BaseClass;

public class TC_01_AccountReg_Test extends BaseClass{
	
	@Test(groups={"Sanity","Maser"})
	public void verify_Account_reg()
	{
		
		
		logger.info("****TC01****");
		
		try
		{
		
		HomePage hp=new HomePage(driver);
		hp.clickmyaccount();
		logger.info("Clicked on home page");
		hp.clickregister();
		
		AccountRegistrationpage arp=new AccountRegistrationpage(driver);
		
		arp.setFirstName(randomString().toUpperCase());
		arp.setLastName(randomString().toUpperCase());
		arp.setEmail(randomString()+"@gmail.com");
		arp.setTelephone(randomNumber());
		
		String password=randomAlphaNumeric();
		
		arp.setPassword(password);
		arp.setConfpassword(password);
		arp.setPrivacyPolicy();
		arp.clickContinue();
		
		String actmessage= arp.getConfirmationMessage();
		Assert.assertEquals(actmessage, "Your Account Has Been Created!");
		}
		
		catch(Exception e)
		{
			logger.error("Test Failed");
			logger.debug("Debug log");
			Assert.fail();
		}
		
		
		
		
		
	}
	
	

}
