package testclasses;

import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class DashBoardTest extends ListenerClass{
	
	@Test(priority = 3)
	public void searchValidation()
	{
		db.clickOnGetStarted();
		test.info("Clicked on get started button");
		db.searchShares();
		test.info("Searched the shares");
		
	}
	
	@Test(priority = 4)
	public void buySharesValidation()
	{
		db.buyShares();
		test.info("Share has been buyed");
		
		
	}
	

}
