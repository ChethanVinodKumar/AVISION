package com.Getapcs.Avision.SecondaryMaster;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class Language extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;

	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Language'])[1]")
	WebElement language;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createlanguage;

	@FindBy(xpath = "(//input[@placeholder='Enter Language Name'])[1]")
	WebElement languageField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Language() {

		PageFactory.initElements(driver, this);
	}

	public HomePage LanguageCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		language.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createlanguage);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditLanguageField = languageField.isEnabled();
		assertTrue(isEnabledAuditLanguageField);
		boolean isDisabledLanguageTextFieldn = !languageField.isEnabled();
		assertFalse(isDisabledLanguageTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedLanguageTextField = languageField.isDisplayed();
		assertTrue(isDisplayedLanguageTextField);
		boolean isHiddenLanguageTextField = !languageField.isDisplayed();
		assertFalse(isHiddenLanguageTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedLanguageTextField = languageField.isSelected();
		assertFalse(isSelectedLanguageTextField);
		boolean isDeselectedLanguageTextField = !languageField.isSelected();
		assertTrue(isDeselectedLanguageTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInLanguage = languageField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Language Name";

		assertEquals(displayedTextInLanguage, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledLanguageDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledLanguageDescriptionField);
		boolean isDisabledLanguageDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledLanguageDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedLanguageDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedLanguageDescriptionField);
		boolean isHiddenLanguageDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenLanguageDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedLanguageDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedLanguageDescriptionField);
		boolean isDeselectedLanguageDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedLanguageDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledLanguageRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledLanguageRemarksField);
		boolean isDisabledLanguageRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledLanguageRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedLanguageRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedLanguageRemarksField);
		boolean isHiddenLanguageRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenLanguageRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedLanguageRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedLanguageRemarksField);
		boolean isDeselectedLanguageRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedLanguageRemarksField);

		// Verifying the Placeholder which is present in Remarks text field.
		String displayedTextInRemarks = remarksTextField.getAttribute("placeholder");

		String expected_placeholder1 = "Enter Remarks";

		assertEquals(displayedTextInRemarks, expected_placeholder1);
		// Verifying the HeightSize and Width Size of DescriptionField and RemarksField
		int DescriptionfieldHeightSize = descriptionTextField.getSize().getHeight();
		int DescriptionfieldWidthSize = descriptionTextField.getSize().getWidth();

		int RemarksFieldHightSize = remarksTextField.getSize().getHeight();
		int RemarksFieldWidthSize = remarksTextField.getSize().getWidth();

		assertEquals(DescriptionfieldHeightSize, RemarksFieldHightSize);
		assertEquals(DescriptionfieldWidthSize, RemarksFieldWidthSize);

		// Verifying that Payload Text is displayed or not in Description field.

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

		languageField.clear();
		languageField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage LanguageEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		language.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledLanguageDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledLanguageDescriptionField);
		boolean isDisabledLanguageDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledLanguageDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedLanguageDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedLanguageDescriptionField);
		boolean isHiddenLanguageDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenLanguageDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedLanguageDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedLanguageDescriptionField);
		boolean isDeselectedLanguageDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedLanguageDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledLanguageRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledLanguageRemarksField);
		boolean isDisabledLanguageRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledLanguageRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedLanguageRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedLanguageRemarksField);
		boolean isHiddenLanguageRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenLanguageRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedLanguageRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedLanguageRemarksField);
		boolean isDeselectedLanguageRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedLanguageRemarksField);

		// Verifying the Placeholder which is present in Remarks text field.
		String displayedTextInRemarks = remarksTextField.getAttribute("placeholder");

		String expected_placeholder1 = "Enter Remarks";

		assertEquals(displayedTextInRemarks, expected_placeholder1);
		// Verifying the HeightSize and Width Size of DescriptionField and RemarksField
		int DescriptionfieldHeightSize = descriptionTextField.getSize().getHeight();
		int DescriptionfieldWidthSize = descriptionTextField.getSize().getWidth();

		int RemarksFieldHightSize = remarksTextField.getSize().getHeight();
		int RemarksFieldWidthSize = remarksTextField.getSize().getWidth();

		assertEquals(DescriptionfieldHeightSize, RemarksFieldHightSize);
		assertEquals(DescriptionfieldWidthSize, RemarksFieldWidthSize);

		// Verifying that Payload Text is displayed or not in Description field.

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
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);
		js.executeScript("arguments[0].click();", yesButton);

		return new HomePage();
	}
}
