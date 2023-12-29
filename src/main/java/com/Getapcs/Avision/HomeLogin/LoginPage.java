package com.Getapcs.Avision.HomeLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Getapcs.Avision.BASECLASS.TestBase;

public class LoginPage extends TestBase {
	// Page Factory - Object Repository
	@FindBy(xpath = "(//input[@placeholder='Email'])[1]")
	WebElement email;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-login/div/div/div[1]/form/div[3]/select")
	WebElement selectUnit;

	@FindBy(xpath = "(//span[@class='button__text'])[1]")
	WebElement signIn;

	public HomePage loginloginTest;

	// initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean ValidateDisplayed() {
		return email.isDisplayed() && password.isDisplayed() && signIn.isDisplayed();
	}

	public boolean ValidateEnabled() {
		return email.isEnabled() && password.isEnabled() && signIn.isEnabled();
	}

	public String getUsernameFieldPlaceholder() {
		return email.getAttribute("placeholder");
	}

	public String getPasswordFieldPlaceholder() {
		return password.getAttribute("placeholder");
	}

	public HomePage login(String eml, String pwd) throws InterruptedException {
		email.clear();
		email.sendKeys(eml);
		password.clear();
		password.sendKeys(pwd);
		Select select = new Select(selectUnit);
		select.selectByValue("Hyderabad");
		signIn.click();
		Thread.sleep(2000);
		return new HomePage();
	}
}
