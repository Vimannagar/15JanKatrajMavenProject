package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoard;
import pages.LoginPage;
import pages.LoginPageAdvance;

public class BaseTest {
	static WebDriver driver;
	LoginPageAdvance lp;
	DashBoard db;
	
	@BeforeSuite
	public void initBrowser() {
//		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\Chromedriver 101\\chromedriver.exe");

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://kite.zerodha.com/");
	}
	
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@BeforeClass
	public void objectCreation()
	{
		 lp = new LoginPageAdvance(driver);
		 db = new DashBoard(driver);
	}

}
