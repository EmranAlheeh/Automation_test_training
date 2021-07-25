package net.openrainbow.test;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import net.openrainbow.page.LoginPage;
import net.openrainbow.utility.ConfigReader;

public class LoginTest {
	WebDriver driver; 
	ConfigReader config =new ConfigReader();
	LoginPage login;
	 
	@BeforeMethod
	public void setup(){
 		System.setProperty(config.getWebDriver(), config.getChromeDriver());
		 driver = new ChromeDriver();
		driver.get(config.getUrl());
 		 
	}
	@Parameters({"username","password"})
	 
	@Test
	public void validLogin( String username,String password) {
		 
		login = new LoginPage(driver);
 		login.enterEmail(username);
		login.clickOnContinue();
		login.enterPassword(password);
		login.clickOnConnect();
		login.validationLogin();
	}
	@Test
	public void invalidLogin() {
		 
		login = new LoginPage(driver);
 		login.enterEmail("ealheeh@asaltech.com");
		login.clickOnContinue();
		login.enterPassword("Asal1234");
		login.clickOnConnect();
 	}
 
}
