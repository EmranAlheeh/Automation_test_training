package net.openrainbow.locators;

import org.openqa.selenium.By;

public class login_locators {
	public static final  By username= By.id("username");
	//input[@id='username']
	public static final By password = By.id("authPwd");
	public static final By continueLogin = By.xpath("//button[@class='squaredButtonComponent blueFill']");
	public static final By connect = By.xpath( "/html/body/div[1]/authentication-component/authentication-window/div/div/main/authenticationwindowcontent/authentication-form-component/form/footer/square-button/button");
	//squaredButtonComponent blueFill
}

 