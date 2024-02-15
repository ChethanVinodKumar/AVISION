package com.Getapcs.Avision.Sales;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class CS_Release extends TestBase {

	@FindBy(xpath = "(//i[@title='CS'])[1]")
	WebElement csButton;
	
	@FindBy(xpath = "//table[@class='table table-striped']//th[1]//input")
	WebElement itemTabCheckBox;

	@FindBy(xpath = "(//button[normalize-space()='Release'])[1]")
	WebElement releaseButtonInCSRelease;

	public CS_Release() {
		PageFactory.initElements(driver, this);
	}
	public HomePage RFQCs() throws Throwable {



		// Verify and Release the CS
		
		click(driver, csButton);

		Thread.sleep(2000);

		// Verify and Click on Check Box which is Present in Item Tab-CS Release
//		click(driver, itemTabCheckBox);
		itemTabCheckBox.sendKeys(Keys.SPACE);
		// itemTabCheckBox1.sendKeys(Keys.SPACE);

		Thread.sleep(2000);

		click(driver, releaseButtonInCSRelease);
		return new HomePage();

	}

}