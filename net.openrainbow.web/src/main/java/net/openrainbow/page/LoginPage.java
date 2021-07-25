package net.openrainbow.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import net.openrainbow.locators.login_locators;
 

public class LoginPage {
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void enterEmail(String arg) {
 		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login_locators.username));
		driver.findElement(login_locators.username).sendKeys(arg);
	}
	public void enterPassword(String arg1) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login_locators.password));
		driver.findElement(login_locators.password).sendKeys(arg1);

	}
 public void clickOnContinue() {
	 @SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login_locators.continueLogin));
		driver.findElement(login_locators.continueLogin).click();

}
 public void clickOnConnect() {
	 @SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login_locators.connect));
	 driver.findElement(login_locators.connect).click();

 }
 public void validationLogin() {
	 String expectedUrl="https://web.openrainbow.net/rb/2.91.7/index.html#/main/home";
	 String actualUrl="";
@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait (driver, 40);
		wait.until(ExpectedConditions.urlToBe(expectedUrl));
		 actualUrl= driver.getCurrentUrl();
		 System.out.println(actualUrl);
		Assert.assertEquals(expectedUrl,actualUrl);
  }
}
