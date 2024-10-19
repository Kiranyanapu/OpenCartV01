package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pagObjects.HomePage;
import pagObjects.LoginPage;
import pagObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_02_LoginPage extends BaseClass {
	
	@Test(groups= {"Regression","Master"})
	public void verifyloginpage()
	{
		logger.info("****Test Started****");
		logger.debug("Capturing application debug logs....");
		
		try
		{
		//Homepage
		HomePage hmpg = new HomePage(driver);
		hmpg.clickmyaccount();
		logger.info("Clicked on MyAccount option");
		hmpg.clicklogin();
		logger.info("Clicked on Login option");
		
		//loginpage
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		logger.info("Clicked on email");
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.isMyAccountPageExists();
		
		Assert.assertEquals(targetpage, true, "Login Failed");
		
		
		
		}
		
		catch(Exception e)		
		{
			Assert.fail();
		}
		
		logger.info("********Test case is completed********");
	}
	
}
