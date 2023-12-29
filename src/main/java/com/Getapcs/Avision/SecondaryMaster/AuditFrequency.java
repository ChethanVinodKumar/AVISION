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

public class AuditFrequency extends TestBase {
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;

	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Audit Frequency'])[1]")
	WebElement auditFrequency;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createAuditFrequency;

	@FindBy(xpath = "(//input[@placeholder='Enter Audit Frequency Name'])[1]")
	WebElement nameField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;

	public AuditFrequency() {

		PageFactory.initElements(driver, this);
	}

	public HomePage AuditFrequencyCreate(String name, String description, String remarks) throws InterruptedException {
		threeLinesSideBarIcon.click();
		master1.click();
		auditFrequency.click();
		Thread.sleep(2000);

		// verifying createadditionalCharges field Displayed or not
		boolean isDisplayed = createAuditFrequency.isDisplayed();
		assertTrue(isDisplayed);
		boolean isHidden = !createAuditFrequency.isDisplayed();
		assertFalse(isHidden);

		// verifying createadditionalCharges field Selected or unselected
		boolean isSelected = createAuditFrequency.isSelected();
		assertFalse(isSelected);
		boolean isDeselected = !createAuditFrequency.isSelected();
		assertTrue(isDeselected);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createAuditFrequency);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnablednameField = nameField.isEnabled();
		assertTrue(isEnablednameField);
		boolean isDisablednameFieldn = !nameField.isEnabled();
		assertFalse(isDisablednameFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayednameField = nameField.isDisplayed();
		assertTrue(isDisplayednameField);
		boolean isHiddennameField = !nameField.isDisplayed();
		assertFalse(isHiddennameField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectednameField = nameField.isSelected();
		assertFalse(isSelectednameField);
		boolean isDeselectednameField = !nameField.isSelected();
		assertTrue(isDeselectednameField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInAuditFrequencyName = nameField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Audit Frequency Name";

		assertEquals(displayedTextInAuditFrequencyName, expected_placeholder3);

		// 3Verifying that Audit Frequency descriptionTextField Field is Enabled or not
		boolean isEnabledAuditFrequencydescriptionTextFieldField = descriptionTextField.isEnabled();
		assertTrue(isEnabledAuditFrequencydescriptionTextFieldField);
		boolean isDisabledAuditFrequencydescriptionTextFieldField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledAuditFrequencydescriptionTextFieldField);

		// Verifying that Audit Frequency descriptionTextField Field is displayed or
		// hidden.
		boolean isDisplayedAuditFrequencydescriptionTextFieldField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedAuditFrequencydescriptionTextFieldField);
		boolean isHiddenAuditFrequencydescriptionTextFieldField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenAuditFrequencydescriptionTextFieldField);

		// Verifying that Audit Frequency descriptionTextField Field is Selected or
		// unselected
		boolean isSelectedAuditFrequencydescriptionTextFieldField = descriptionTextField.isSelected();
		assertFalse(isSelectedAuditFrequencydescriptionTextFieldField);
		boolean isDeselectedAuditFrequencydescriptionTextFieldField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedAuditFrequencydescriptionTextFieldField);

		// Verifying the Placeholder which is present in descriptionTextField text
		// field.
		String displayedTextIndescriptionTextField = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextIndescriptionTextField, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledAuditFrequencyremarksTextField = remarksTextField.isEnabled();
		assertTrue(isEnabledAuditFrequencyremarksTextField);
		boolean isDisabledAuditFrequencyremarksTextField = !remarksTextField.isEnabled();
		assertFalse(isDisabledAuditFrequencyremarksTextField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedAuditFrequencyremarksTextField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedAuditFrequencyremarksTextField);
		boolean isHiddenAuditFrequencyremarksTextField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenAuditFrequencyremarksTextField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedAuditFrequencyremarksTextField = remarksTextField.isSelected();
		assertFalse(isSelectedAuditFrequencyremarksTextField);
		boolean isDeselectedAuditFrequencyremarksTextField = !remarksTextField.isSelected();
		assertTrue(isDeselectedAuditFrequencyremarksTextField);

		// Verifying the Placeholder which is present in Remarks text field.
		String displayedTextInRemarks = remarksTextField.getAttribute("placeholder");

		String expected_placeholder1 = "Enter Remarks";

		assertEquals(displayedTextInRemarks, expected_placeholder1);

		// Verifying the HeightSize and Width Size of DescriptionField and
		// remarksTextField
		int DescriptionfieldHeightSize = descriptionTextField.getSize().getHeight();
		int DescriptionfieldWidthSize = descriptionTextField.getSize().getWidth();

		int remarksTextFieldHightSize = remarksTextField.getSize().getHeight();
		int remarksTextFieldWidthSize = remarksTextField.getSize().getWidth();

		assertEquals(DescriptionfieldHeightSize, remarksTextFieldHightSize);
		assertEquals(DescriptionfieldWidthSize, remarksTextFieldWidthSize);

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

		nameField.clear();
		nameField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", saveButton);

		driver.navigate().back();
		return new HomePage();

	}

	public HomePage AuditFrequencyEdit(String description, String remarks) throws InterruptedException {
		threeLinesSideBarIcon.click();
		master1.click();
		auditFrequency.click();
		Thread.sleep(2000);

		// verifying createadditionalCharges field Displayed or not
		boolean isDisplayed = editButton.isDisplayed();
		assertTrue(isDisplayed);
		boolean isHidden = !editButton.isDisplayed();
		assertFalse(isHidden);

		// verifying createadditionalCharges field Selected or unselected
		boolean isSelected = editButton.isSelected();
		assertFalse(isSelected);
		boolean isDeselected = !editButton.isSelected();
		assertTrue(isDeselected);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency descriptionTextField Field is Enabled or not
		boolean isEnabledAuditFrequencydescriptionTextFieldField = descriptionTextField.isEnabled();
		assertTrue(isEnabledAuditFrequencydescriptionTextFieldField);
		boolean isDisabledAuditFrequencydescriptionTextFieldField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledAuditFrequencydescriptionTextFieldField);

		// Verifying that Audit Frequency descriptionTextField Field is displayed or
		// hidden.
		boolean isDisplayedAuditFrequencydescriptionTextFieldField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedAuditFrequencydescriptionTextFieldField);
		boolean isHiddenAuditFrequencydescriptionTextFieldField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenAuditFrequencydescriptionTextFieldField);

		// Verifying that Audit Frequency descriptionTextField Field is Selected or
		// unselected
		boolean isSelectedAuditFrequencydescriptionTextFieldField = descriptionTextField.isSelected();
		assertFalse(isSelectedAuditFrequencydescriptionTextFieldField);
		boolean isDeselectedAuditFrequencydescriptionTextFieldField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedAuditFrequencydescriptionTextFieldField);

		// Verifying the Placeholder which is present in descriptionTextField text
		// field.
		String displayedTextIndescriptionTextField = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextIndescriptionTextField, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledAuditFrequencyremarksTextField = remarksTextField.isEnabled();
		assertTrue(isEnabledAuditFrequencyremarksTextField);
		boolean isDisabledAuditFrequencyremarksTextField = !remarksTextField.isEnabled();
		assertFalse(isDisabledAuditFrequencyremarksTextField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedAuditFrequencyremarksTextField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedAuditFrequencyremarksTextField);
		boolean isHiddenAuditFrequencyremarksTextField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenAuditFrequencyremarksTextField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedAuditFrequencyremarksTextField = remarksTextField.isSelected();
		assertFalse(isSelectedAuditFrequencyremarksTextField);
		boolean isDeselectedAuditFrequencyremarksTextField = !remarksTextField.isSelected();
		assertTrue(isDeselectedAuditFrequencyremarksTextField);

		// Verifying the Placeholder which is present in Remarks text field.
		String displayedTextInRemarks = remarksTextField.getAttribute("placeholder");

		String expected_placeholder1 = "Enter Remarks";

		assertEquals(displayedTextInRemarks, expected_placeholder1);

		// Verifying the HeightSize and Width Size of DescriptionField and
		// remarksTextField
		int DescriptionfieldHeightSize = descriptionTextField.getSize().getHeight();
		int DescriptionfieldWidthSize = descriptionTextField.getSize().getWidth();

		int remarksTextFieldHightSize = remarksTextField.getSize().getHeight();
		int remarksTextFieldWidthSize = remarksTextField.getSize().getWidth();

		assertEquals(DescriptionfieldHeightSize, remarksTextFieldHightSize);
		assertEquals(DescriptionfieldWidthSize, remarksTextFieldWidthSize);

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
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", saveButton);
		yesButton.click();

		driver.navigate().back();
		return new HomePage();

	}
}
