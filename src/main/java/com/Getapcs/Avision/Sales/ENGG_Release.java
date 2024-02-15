package com.Getapcs.Avision.Sales;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class ENGG_Release extends TestBase {

	@FindBy(xpath = "(//i[@title='Engg'])[1]")
	WebElement enggButton;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement itemNumber;

	@FindBy(xpath = "(//a[normalize-space()='Engg Risk Identification'])[1]")
	WebElement enggRiskIdentificationTab;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement category;

	@FindBy(xpath = "(//span[normalize-space()='TEST Risk_Category1'])[1]")
	WebElement categorySelect;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Note.'])[1]")
	WebElement note;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "//table[@class='table table-striped']//th[1]//input")
	WebElement itemTabCheckBox;

	@FindBy(xpath = "(//input[@value='1400'])[1]")
	WebElement itemTabCheckBox1;

	@FindBy(xpath = "(//button[normalize-space()='Release'])[1]")
	WebElement releaseButtonInCSRelease;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addButton;

	public ENGG_Release() {
		PageFactory.initElements(driver, this);
	}

	public HomePage RFQEnggRelease(String QuantityInaddShedule, String Note) throws Throwable {

		// Verify and Release the CS
		click(driver, enggButton);

		// Verify and Click on Check Box which is Present in Item Tab-CS Release
		itemTabCheckBox.sendKeys(Keys.SPACE);

		// Verify and Click on Release Button in Notes Tab -CS Release Page
		click(driver, releaseButtonInCSRelease);
		
		return new HomePage();

	}

}