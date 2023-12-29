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

public class Export_Unit_Type extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Export unit type'])[1]")
	WebElement exportUnitType;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createexportUnitType;

	@FindBy(xpath = "(//input[@placeholder='Enter Export Unit Type Name'])[1]")
	WebElement exportUnitTypeField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Export_Unit_Type() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Export_Unit_TypeCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		exportUnitType.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createexportUnitType);

		// 1Verifying that ExportUnitType Name Text Field is Enabled or not
		boolean isEnabledAuditExportUnitTypeField = exportUnitTypeField.isEnabled();
		assertTrue(isEnabledAuditExportUnitTypeField);
		boolean isDisabledExportUnitTypeTextFieldn = !exportUnitTypeField.isEnabled();
		assertFalse(isDisabledExportUnitTypeTextFieldn);

		// Verifying that ExportUnitType Name Text Field is displayed or hidden.
		boolean isDisplayedExportUnitTypeTextField = exportUnitTypeField.isDisplayed();
		assertTrue(isDisplayedExportUnitTypeTextField);
		boolean isHiddenExportUnitTypeTextField = !exportUnitTypeField.isDisplayed();
		assertFalse(isHiddenExportUnitTypeTextField);

		// Verifying that ExportUnitType Name Text Field is Selected or unselected
		boolean isSelectedExportUnitTypeTextField = exportUnitTypeField.isSelected();
		assertFalse(isSelectedExportUnitTypeTextField);
		boolean isDeselectedExportUnitTypeTextField = !exportUnitTypeField.isSelected();
		assertTrue(isDeselectedExportUnitTypeTextField);

		// Verifying the Placeholder which is present in ExportUnitType Name text field.
		String displayedTextInExportUnitType = exportUnitTypeField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Export Unit Type Name";

		assertEquals(displayedTextInExportUnitType, expected_placeholder3);

		// 3Verifying that ExportUnitType Description Field is Enabled or not
		boolean isEnabledExportUnitTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledExportUnitTypeDescriptionField);
		boolean isDisabledExportUnitTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledExportUnitTypeDescriptionField);

		// Verifying that ExportUnitType Description Field is displayed or hidden.
		boolean isDisplayedExportUnitTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedExportUnitTypeDescriptionField);
		boolean isHiddenExportUnitTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenExportUnitTypeDescriptionField);

		// Verifying that ExportUnitType Description Field is Selected or unselected
		boolean isSelectedExportUnitTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedExportUnitTypeDescriptionField);
		boolean isDeselectedExportUnitTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedExportUnitTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that ExportUnitType Remarks Field is Enabled or not
		boolean isEnabledExportUnitTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledExportUnitTypeRemarksField);
		boolean isDisabledExportUnitTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledExportUnitTypeRemarksField);

		// Verifying that ExportUnitType Remarks Field is displayed or hidden.
		boolean isDisplayedExportUnitTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedExportUnitTypeRemarksField);
		boolean isHiddenExportUnitTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenExportUnitTypeRemarksField);

		// Verifying that ExportUnitType Remarks Field is Selected or unselected
		boolean isSelectedExportUnitTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedExportUnitTypeRemarksField);
		boolean isDeselectedExportUnitTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedExportUnitTypeRemarksField);

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

		exportUnitTypeField.clear();
		exportUnitTypeField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	public HomePage Export_Unit_TypeEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		exportUnitType.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that ExportUnitType Description Field is Enabled or not
		boolean isEnabledExportUnitTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledExportUnitTypeDescriptionField);
		boolean isDisabledExportUnitTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledExportUnitTypeDescriptionField);

		// Verifying that ExportUnitType Description Field is displayed or hidden.
		boolean isDisplayedExportUnitTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedExportUnitTypeDescriptionField);
		boolean isHiddenExportUnitTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenExportUnitTypeDescriptionField);

		// Verifying that ExportUnitType Description Field is Selected or unselected
		boolean isSelectedExportUnitTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedExportUnitTypeDescriptionField);
		boolean isDeselectedExportUnitTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedExportUnitTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that ExportUnitType Remarks Field is Enabled or not
		boolean isEnabledExportUnitTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledExportUnitTypeRemarksField);
		boolean isDisabledExportUnitTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledExportUnitTypeRemarksField);

		// Verifying that ExportUnitType Remarks Field is displayed or hidden.
		boolean isDisplayedExportUnitTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedExportUnitTypeRemarksField);
		boolean isHiddenExportUnitTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenExportUnitTypeRemarksField);

		// Verifying that ExportUnitType Remarks Field is Selected or unselected
		boolean isSelectedExportUnitTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedExportUnitTypeRemarksField);
		boolean isDeselectedExportUnitTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedExportUnitTypeRemarksField);

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
