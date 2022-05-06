package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	@Test(priority = 1)
	public void verifyLogin()
	{		
		lp.enterCredentials();
		lp.clickOnLogin();
		lp.enterPin();
	}
	
	@Test(priority = 2)
	public void titleValidation()
	{
		
		String actualtitle = lp.getTitleOfPage();
		
		Assert.assertEquals(actualtitle, "Dashboard / Kite");
		
	}

}
