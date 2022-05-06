package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterCredentials() {
		WebElement username = driver.findElement(By.xpath("//*[@id='userid']"));
		username.sendKeys("DAA677");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Velocity@123");

	}

	public void clickOnLogin() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	public void enterPin() {
		driver.findElement(By.xpath("//*[@id='pin']")).sendKeys("866918");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	public String getTitleOfPage() {
		String titleofpage = driver.getTitle();

		return titleofpage;

	}

}
