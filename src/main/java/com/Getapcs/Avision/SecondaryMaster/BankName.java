package com.Getapcs.Avision.SecondaryMaster;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class BankName extends TestBase {
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Bank Name'])[1]")
	WebElement bankName;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createBankName;

	@FindBy(xpath = "(//input[@placeholder='Enter Bank Name Name'])[1]")
	WebElement bankNameField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public BankName() {

		PageFactory.initElements(driver, this);
	}

	public HomePage BankNameCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		bankName.click();
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//        js3.executeScript("arguments[0].click();", bankName);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", createBankName);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditBankNameField = bankNameField.isEnabled();
		assertTrue(isEnabledAuditBankNameField);
		boolean isDisabledBankNameTextFieldn = !bankNameField.isEnabled();
		assertFalse(isDisabledBankNameTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedBankNameTextField = bankNameField.isDisplayed();
		assertTrue(isDisplayedBankNameTextField);
		boolean isHiddenBankNameTextField = !bankNameField.isDisplayed();
		assertFalse(isHiddenBankNameTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedBankNameTextField = bankNameField.isSelected();
		assertFalse(isSelectedBankNameTextField);
		boolean isDeselectedBankNameTextField = !bankNameField.isSelected();
		assertTrue(isDeselectedBankNameTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInBankName = bankNameField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Bank Name Name";

		assertEquals(displayedTextInBankName, expected_placeholder3);
		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledBankNameDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledBankNameDescriptionField);
		boolean isDisabledBankNameDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledBankNameDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedBankNameDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedBankNameDescriptionField);
		boolean isHiddenBankNameDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenBankNameDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedBankNameDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedBankNameDescriptionField);
		boolean isDeselectedBankNameDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedBankNameDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledBankNameRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledBankNameRemarksField);
		boolean isDisabledBankNameRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledBankNameRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedBankNameRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedBankNameRemarksField);
		boolean isHiddenBankNameRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenBankNameRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedBankNameRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedBankNameRemarksField);
		boolean isDeselectedBankNameRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedBankNameRemarksField);

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

		bankNameField.clear();
		bankNameField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		saveButton.click();

		return new HomePage();

	}

	public HomePage BankNameEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		bankName.click();
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//        js3.executeScript("arguments[0].click();", bankName);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledBankNameDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledBankNameDescriptionField);
		boolean isDisabledBankNameDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledBankNameDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedBankNameDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedBankNameDescriptionField);
		boolean isHiddenBankNameDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenBankNameDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedBankNameDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedBankNameDescriptionField);
		boolean isDeselectedBankNameDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedBankNameDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledBankNameRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledBankNameRemarksField);
		boolean isDisabledBankNameRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledBankNameRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedBankNameRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedBankNameRemarksField);
		boolean isHiddenBankNameRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenBankNameRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedBankNameRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedBankNameRemarksField);
		boolean isDeselectedBankNameRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedBankNameRemarksField);

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
		saveButton.click();
		yesButton.click();
		return new HomePage();

	}
}
