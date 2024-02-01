package com.Getapcs.Trans.SecondaryMaster;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class Quote_Terms extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Quote Terms'])[1]")
	WebElement quote_Terms;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createquote_Terms;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Quote Terms'])[1]")
	WebElement quote_TermsField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Quote_Terms() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Quote_TermsCreate(String name, String description) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		quote_Terms.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createquote_Terms);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditQuoteTermsField = quote_TermsField.isEnabled();
		assertTrue(isEnabledAuditQuoteTermsField);
		boolean isDisabledQuoteTermsTextFieldn = !quote_TermsField.isEnabled();
		assertFalse(isDisabledQuoteTermsTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedQuoteTermsTextField = quote_TermsField.isDisplayed();
		assertTrue(isDisplayedQuoteTermsTextField);
		boolean isHiddenQuoteTermsTextField = !quote_TermsField.isDisplayed();
		assertFalse(isHiddenQuoteTermsTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedQuoteTermsTextField = quote_TermsField.isSelected();
		assertFalse(isSelectedQuoteTermsTextField);
		boolean isDeselectedQuoteTermsTextField = !quote_TermsField.isSelected();
		assertTrue(isDeselectedQuoteTermsTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInQuoteTerms = quote_TermsField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Quote Terms";

		assertEquals(displayedTextInQuoteTerms, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledQuoteTermsDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledQuoteTermsDescriptionField);
		boolean isDisabledQuoteTermsDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledQuoteTermsDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedQuoteTermsDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedQuoteTermsDescriptionField);
		boolean isHiddenQuoteTermsDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenQuoteTermsDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedQuoteTermsDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedQuoteTermsDescriptionField);
		boolean isDeselectedQuoteTermsDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedQuoteTermsDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 6verifying that Save Button is Enabled or disabled.
		boolean isEnabledSaveButton = saveButton.isEnabled();
		assertTrue(isEnabledSaveButton, "SaveButton is enabled");
		boolean isDisabledSaveButton = !saveButton.isEnabled();
		assertFalse(isDisabledSaveButton, "SaveButton is not enabled");

		// verifying that Save Button is displayed or hidden.
		boolean isDisplayedSaveButton = saveButton.isDisplayed();
		assertTrue(isDisplayedSaveButton);
		boolean isHiddenSaveButton = !saveButton.isDisplayed();
		assertFalse(isHiddenSaveButton);

		quote_TermsField.clear();
		quote_TermsField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);

		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	public HomePage Quote_TermsEdit(String description) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		quote_Terms.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledQuoteTermsDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledQuoteTermsDescriptionField);
		boolean isDisabledQuoteTermsDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledQuoteTermsDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedQuoteTermsDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedQuoteTermsDescriptionField);
		boolean isHiddenQuoteTermsDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenQuoteTermsDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedQuoteTermsDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedQuoteTermsDescriptionField);
		boolean isDeselectedQuoteTermsDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedQuoteTermsDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 6verifying that Save Button is Enabled or disabled.
		boolean isEnabledSaveButton = saveButton.isEnabled();
		assertTrue(isEnabledSaveButton, "SaveButton is enabled");
		boolean isDisabledSaveButton = !saveButton.isEnabled();
		assertFalse(isDisabledSaveButton, "SaveButton is not enabled");

		// verifying that Save Button is displayed or hidden.
		boolean isDisplayedSaveButton = saveButton.isDisplayed();
		assertTrue(isDisplayedSaveButton);
		boolean isHiddenSaveButton = !saveButton.isDisplayed();
		assertFalse(isHiddenSaveButton);

		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);

		js.executeScript("arguments[0].click();", saveButton);
		js.executeScript("arguments[0].click();", yesButton);

		return new HomePage();

	}

}
