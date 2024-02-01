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

public class Payment_Term extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Payment Term'])[1]")
	WebElement Payment_Term;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createPayment_Term;

	@FindBy(xpath = "(//input[@placeholder='Enter Location Name'])[1]")
	WebElement Payment_TermField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Payment_Term() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Payment_TeamCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		Payment_Term.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createPayment_Term);

		// 1Verifying that PaymentTerm Name Text Field is Enabled or not
		boolean isEnabledAuditPaymentTermField = Payment_TermField.isEnabled();
		assertTrue(isEnabledAuditPaymentTermField);
		boolean isDisabledPaymentTermTextFieldn = !Payment_TermField.isEnabled();
		assertFalse(isDisabledPaymentTermTextFieldn);

		// Verifying that PaymentTerm Name Text Field is displayed or hidden.
		boolean isDisplayedPaymentTermTextField = Payment_TermField.isDisplayed();
		assertTrue(isDisplayedPaymentTermTextField);
		boolean isHiddenPaymentTermTextField = !Payment_TermField.isDisplayed();
		assertFalse(isHiddenPaymentTermTextField);

		// Verifying that PaymentTerm Name Text Field is Selected or unselected
		boolean isSelectedPaymentTermTextField = Payment_TermField.isSelected();
		assertFalse(isSelectedPaymentTermTextField);
		boolean isDeselectedPaymentTermTextField = !Payment_TermField.isSelected();
		assertTrue(isDeselectedPaymentTermTextField);

		// Verifying the Placeholder which is present in PaymentTerm Name text field.
		String displayedTextInPaymentTerm = Payment_TermField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Location Name";

		assertEquals(displayedTextInPaymentTerm, expected_placeholder3);

		// 3Verifying that PaymentTerm Description Field is Enabled or not
		boolean isEnabledPaymentTermDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledPaymentTermDescriptionField);
		boolean isDisabledPaymentTermDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledPaymentTermDescriptionField);

		// Verifying that PaymentTerm Description Field is displayed or hidden.
		boolean isDisplayedPaymentTermDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedPaymentTermDescriptionField);
		boolean isHiddenPaymentTermDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenPaymentTermDescriptionField);

		// Verifying that PaymentTerm Description Field is Selected or unselected
		boolean isSelectedPaymentTermDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedPaymentTermDescriptionField);
		boolean isDeselectedPaymentTermDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedPaymentTermDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that PaymentTerm Remarks Field is Enabled or not
		boolean isEnabledPaymentTermRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledPaymentTermRemarksField);
		boolean isDisabledPaymentTermRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledPaymentTermRemarksField);

		// Verifying that PaymentTerm Remarks Field is displayed or hidden.
		boolean isDisplayedPaymentTermRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedPaymentTermRemarksField);
		boolean isHiddenPaymentTermRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenPaymentTermRemarksField);

		// Verifying that PaymentTerm Remarks Field is Selected or unselected
		boolean isSelectedPaymentTermRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedPaymentTermRemarksField);
		boolean isDeselectedPaymentTermRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedPaymentTermRemarksField);

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

		Payment_TermField.clear();
		Payment_TermField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Payment_TeamEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		Payment_Term.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that PaymentTerm Description Field is Enabled or not
		boolean isEnabledPaymentTermDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledPaymentTermDescriptionField);
		boolean isDisabledPaymentTermDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledPaymentTermDescriptionField);

		// Verifying that PaymentTerm Description Field is displayed or hidden.
		boolean isDisplayedPaymentTermDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedPaymentTermDescriptionField);
		boolean isHiddenPaymentTermDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenPaymentTermDescriptionField);

		// Verifying that PaymentTerm Description Field is Selected or unselected
		boolean isSelectedPaymentTermDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedPaymentTermDescriptionField);
		boolean isDeselectedPaymentTermDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedPaymentTermDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that PaymentTerm Remarks Field is Enabled or not
		boolean isEnabledPaymentTermRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledPaymentTermRemarksField);
		boolean isDisabledPaymentTermRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledPaymentTermRemarksField);

		// Verifying that PaymentTerm Remarks Field is displayed or hidden.
		boolean isDisplayedPaymentTermRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedPaymentTermRemarksField);
		boolean isHiddenPaymentTermRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenPaymentTermRemarksField);

		// Verifying that PaymentTerm Remarks Field is Selected or unselected
		boolean isSelectedPaymentTermRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedPaymentTermRemarksField);
		boolean isDeselectedPaymentTermRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedPaymentTermRemarksField);

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
