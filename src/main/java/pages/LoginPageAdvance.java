package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAdvance extends BaseClass {

	WebDriver driver;
	@FindBy(xpath ="//*[@id='userid']")
	private WebElement username;
	
	@FindBy(xpath ="//*[@id='password']")
	private WebElement password;
	
	@FindBy(xpath ="//*[@type='submit']")
	private WebElement loginbutton;
	
	@FindBy(xpath ="//*[@id='pin']")
	private WebElement pintextfield;
	
	

	@FindBy(xpath ="//*[@type='button']")
	private WebElement button;
	

	public LoginPageAdvance(WebDriver driver) throws IOException {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public void enterCredentials() {
		
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));

	}

	public void clickOnLogin() {
		loginbutton.click();
	}

	public void enterPin() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pintextfield.sendKeys(prop.getProperty("pin"));
		loginbutton.click();
	}

	public String getTitleOfPage() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		button.isDisplayed();
		
		String titleofpage = driver.getTitle();

		return titleofpage;

	}
	
}
