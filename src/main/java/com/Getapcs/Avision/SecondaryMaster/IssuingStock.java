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

public class IssuingStock extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Issuing Stock'])[1]")
	WebElement issuingStock;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createissuingStock;

	@FindBy(xpath = "(//input[@placeholder='Enter Issuing Stock'])[1]")
	WebElement issuingStockField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public IssuingStock() {

		PageFactory.initElements(driver, this);
	}

	public HomePage IssuingStockCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		issuingStock.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createissuingStock);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditIssuingStockField = issuingStockField.isEnabled();
		assertTrue(isEnabledAuditIssuingStockField);
		boolean isDisabledIssuingStockTextFieldn = !issuingStockField.isEnabled();
		assertFalse(isDisabledIssuingStockTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedIssuingStockTextField = issuingStockField.isDisplayed();
		assertTrue(isDisplayedIssuingStockTextField);
		boolean isHiddenIssuingStockTextField = !issuingStockField.isDisplayed();
		assertFalse(isHiddenIssuingStockTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedIssuingStockTextField = issuingStockField.isSelected();
		assertFalse(isSelectedIssuingStockTextField);
		boolean isDeselectedIssuingStockTextField = !issuingStockField.isSelected();
		assertTrue(isDeselectedIssuingStockTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInIssuingStock = issuingStockField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Issuing Stock";

		assertEquals(displayedTextInIssuingStock, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledIssuingStockDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledIssuingStockDescriptionField);
		boolean isDisabledIssuingStockDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledIssuingStockDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedIssuingStockDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedIssuingStockDescriptionField);
		boolean isHiddenIssuingStockDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenIssuingStockDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedIssuingStockDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedIssuingStockDescriptionField);
		boolean isDeselectedIssuingStockDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedIssuingStockDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledIssuingStockRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledIssuingStockRemarksField);
		boolean isDisabledIssuingStockRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledIssuingStockRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedIssuingStockRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedIssuingStockRemarksField);
		boolean isHiddenIssuingStockRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenIssuingStockRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedIssuingStockRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedIssuingStockRemarksField);
		boolean isDeselectedIssuingStockRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedIssuingStockRemarksField);

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

		issuingStockField.clear();
		issuingStockField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage IssuingStockEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		issuingStock.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledIssuingStockDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledIssuingStockDescriptionField);
		boolean isDisabledIssuingStockDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledIssuingStockDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedIssuingStockDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedIssuingStockDescriptionField);
		boolean isHiddenIssuingStockDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenIssuingStockDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedIssuingStockDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedIssuingStockDescriptionField);
		boolean isDeselectedIssuingStockDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedIssuingStockDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledIssuingStockRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledIssuingStockRemarksField);
		boolean isDisabledIssuingStockRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledIssuingStockRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedIssuingStockRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedIssuingStockRemarksField);
		boolean isHiddenIssuingStockRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenIssuingStockRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedIssuingStockRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedIssuingStockRemarksField);
		boolean isDeselectedIssuingStockRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedIssuingStockRemarksField);

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
