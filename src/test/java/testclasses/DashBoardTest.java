package testclasses;

import org.testng.annotations.Test;

public class DashBoardTest extends BaseTest{
	
	@Test(priority = 3)
	public void searchValidation()
	{
		db.clickOnGetStarted();
		db.searchShares();
		
	}
	
	@Test(priority = 4)
	public void buySharesValidation()
	{
		db.buyShares();
		
		
	}
	

}
