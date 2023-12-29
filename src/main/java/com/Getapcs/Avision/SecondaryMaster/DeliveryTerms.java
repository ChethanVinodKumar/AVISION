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

public class DeliveryTerms extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Delivery Terms'])[1]")
	WebElement deliveryTerms;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createdeliveryTerms;

	@FindBy(xpath = "(//input[@placeholder='Enter Location Name'])[1]")
	WebElement deliveryTermsField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public DeliveryTerms() {

		PageFactory.initElements(driver, this);
	}

	public HomePage DeliveryTermsCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		deliveryTerms.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createdeliveryTerms);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditDeliveryTermsField = deliveryTermsField.isEnabled();
		assertTrue(isEnabledAuditDeliveryTermsField);
		boolean isDisabledDeliveryTermsTextFieldn = !deliveryTermsField.isEnabled();
		assertFalse(isDisabledDeliveryTermsTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedDeliveryTermsTextField = deliveryTermsField.isDisplayed();
		assertTrue(isDisplayedDeliveryTermsTextField);
		boolean isHiddenDeliveryTermsTextField = !deliveryTermsField.isDisplayed();
		assertFalse(isHiddenDeliveryTermsTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedDeliveryTermsTextField = deliveryTermsField.isSelected();
		assertFalse(isSelectedDeliveryTermsTextField);
		boolean isDeselectedDeliveryTermsTextField = !deliveryTermsField.isSelected();
		assertTrue(isDeselectedDeliveryTermsTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInDeliveryTerms = deliveryTermsField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Location Name";

		assertEquals(displayedTextInDeliveryTerms, expected_placeholder3);
		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledDeliveryTermsDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledDeliveryTermsDescriptionField);
		boolean isDisabledDeliveryTermsDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledDeliveryTermsDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedDeliveryTermsDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedDeliveryTermsDescriptionField);
		boolean isHiddenDeliveryTermsDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenDeliveryTermsDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedDeliveryTermsDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedDeliveryTermsDescriptionField);
		boolean isDeselectedDeliveryTermsDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedDeliveryTermsDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledDeliveryTermsRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledDeliveryTermsRemarksField);
		boolean isDisabledDeliveryTermsRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledDeliveryTermsRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedDeliveryTermsRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedDeliveryTermsRemarksField);
		boolean isHiddenDeliveryTermsRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenDeliveryTermsRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedDeliveryTermsRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedDeliveryTermsRemarksField);
		boolean isDeselectedDeliveryTermsRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedDeliveryTermsRemarksField);

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

		deliveryTermsField.clear();
		deliveryTermsField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage DeliveryTermsEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		deliveryTerms.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledDeliveryTermsDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledDeliveryTermsDescriptionField);
		boolean isDisabledDeliveryTermsDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledDeliveryTermsDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedDeliveryTermsDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedDeliveryTermsDescriptionField);
		boolean isHiddenDeliveryTermsDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenDeliveryTermsDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedDeliveryTermsDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedDeliveryTermsDescriptionField);
		boolean isDeselectedDeliveryTermsDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedDeliveryTermsDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledDeliveryTermsRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledDeliveryTermsRemarksField);
		boolean isDisabledDeliveryTermsRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledDeliveryTermsRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedDeliveryTermsRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedDeliveryTermsRemarksField);
		boolean isHiddenDeliveryTermsRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenDeliveryTermsRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedDeliveryTermsRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedDeliveryTermsRemarksField);
		boolean isDeselectedDeliveryTermsRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedDeliveryTermsRemarksField);

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
