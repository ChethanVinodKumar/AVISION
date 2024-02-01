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

public class CustomerType extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Customer Type'])[1]")
	WebElement customerType;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createcustomerType;

	@FindBy(xpath = "(//input[@placeholder='Enter Customer Type'])[1]")
	WebElement customerTypeField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public CustomerType() {

		PageFactory.initElements(driver, this);
	}

	public HomePage CustomerTypeCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		customerType.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createcustomerType);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditCustomerTypeField = customerTypeField.isEnabled();
		assertTrue(isEnabledAuditCustomerTypeField);
		boolean isDisabledCustomerTypeTextFieldn = !customerTypeField.isEnabled();
		assertFalse(isDisabledCustomerTypeTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedCustomerTypeTextField = customerTypeField.isDisplayed();
		assertTrue(isDisplayedCustomerTypeTextField);
		boolean isHiddenCustomerTypeTextField = !customerTypeField.isDisplayed();
		assertFalse(isHiddenCustomerTypeTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedCustomerTypeTextField = customerTypeField.isSelected();
		assertFalse(isSelectedCustomerTypeTextField);
		boolean isDeselectedCustomerTypeTextField = !customerTypeField.isSelected();
		assertTrue(isDeselectedCustomerTypeTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInCustomerType = customerTypeField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Customer Type";

		assertEquals(displayedTextInCustomerType, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledCustomerTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledCustomerTypeDescriptionField);
		boolean isDisabledCustomerTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledCustomerTypeDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedCustomerTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedCustomerTypeDescriptionField);
		boolean isHiddenCustomerTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenCustomerTypeDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedCustomerTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedCustomerTypeDescriptionField);
		boolean isDeselectedCustomerTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedCustomerTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledCustomerTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledCustomerTypeRemarksField);
		boolean isDisabledCustomerTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledCustomerTypeRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedCustomerTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedCustomerTypeRemarksField);
		boolean isHiddenCustomerTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenCustomerTypeRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedCustomerTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedCustomerTypeRemarksField);
		boolean isDeselectedCustomerTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedCustomerTypeRemarksField);

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
		assertTrue(isEnabledSaveButton);
		boolean isDisabledSaveButton = !saveButton.isEnabled();
		assertFalse(isDisabledSaveButton);

		// verifying that Save Button is displayed or hidden.
		boolean isDisplayedSaveButton = saveButton.isDisplayed();
		assertTrue(isDisplayedSaveButton);
		boolean isHiddenSaveButton = !saveButton.isDisplayed();
		assertFalse(isHiddenSaveButton);

		customerTypeField.clear();
		customerTypeField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	public HomePage CustomerTypeEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		customerType.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledCustomerTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledCustomerTypeDescriptionField);
		boolean isDisabledCustomerTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledCustomerTypeDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedCustomerTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedCustomerTypeDescriptionField);
		boolean isHiddenCustomerTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenCustomerTypeDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedCustomerTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedCustomerTypeDescriptionField);
		boolean isDeselectedCustomerTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedCustomerTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledCustomerTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledCustomerTypeRemarksField);
		boolean isDisabledCustomerTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledCustomerTypeRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedCustomerTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedCustomerTypeRemarksField);
		boolean isHiddenCustomerTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenCustomerTypeRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedCustomerTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedCustomerTypeRemarksField);
		boolean isDeselectedCustomerTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedCustomerTypeRemarksField);

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
		assertTrue(isEnabledSaveButton);
		boolean isDisabledSaveButton = !saveButton.isEnabled();
		assertFalse(isDisabledSaveButton);

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
