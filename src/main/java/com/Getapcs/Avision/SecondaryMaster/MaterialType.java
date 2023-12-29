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

public class MaterialType extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Material Type'])[1]")
	WebElement materialType;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement creatematerialType;

	@FindBy(xpath = "(//input[@placeholder='Enter Location Name'])[1]")
	WebElement materialTypeField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public MaterialType() {

		PageFactory.initElements(driver, this);
	}

	public HomePage MaterialTypeCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		materialType.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", creatematerialType);

		// 1Verifying that Material Type Name Text Field is Enabled or not
		boolean isEnabledAuditMaterialTypeField = materialTypeField.isEnabled();
		assertTrue(isEnabledAuditMaterialTypeField);
		boolean isDisabledMaterialTypeTextFieldn = !materialTypeField.isEnabled();
		assertFalse(isDisabledMaterialTypeTextFieldn);

		// Verifying that Material Type Name Text Field is displayed or hidden.
		boolean isDisplayedMaterialTypeTextField = materialTypeField.isDisplayed();
		assertTrue(isDisplayedMaterialTypeTextField);
		boolean isHiddenMaterialTypeTextField = !materialTypeField.isDisplayed();
		assertFalse(isHiddenMaterialTypeTextField);

		// Verifying that Material Type Name Text Field is Selected or unselected
		boolean isSelectedMaterialTypeTextField = materialTypeField.isSelected();
		assertFalse(isSelectedMaterialTypeTextField);
		boolean isDeselectedMaterialTypeTextField = !materialTypeField.isSelected();
		assertTrue(isDeselectedMaterialTypeTextField);

		// Verifying the Placeholder which is present in Material Type Name text field.
		String displayedTextInMaterialType = materialTypeField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Location Name";

		assertEquals(displayedTextInMaterialType, expected_placeholder3);

		// 3Verifying that Material Type Description Field is Enabled or not
		boolean isEnabledMaterialTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledMaterialTypeDescriptionField);
		boolean isDisabledMaterialTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledMaterialTypeDescriptionField);

		// Verifying that Material Type Description Field is displayed or hidden.
		boolean isDisplayedMaterialTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedMaterialTypeDescriptionField);
		boolean isHiddenMaterialTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenMaterialTypeDescriptionField);

		// Verifying that Material Type Description Field is Selected or unselected
		boolean isSelectedMaterialTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedMaterialTypeDescriptionField);
		boolean isDeselectedMaterialTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedMaterialTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Material Type Remarks Field is Enabled or not
		boolean isEnabledMaterialTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledMaterialTypeRemarksField);
		boolean isDisabledMaterialTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledMaterialTypeRemarksField);

		// Verifying that Material Type Remarks Field is displayed or hidden.
		boolean isDisplayedMaterialTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedMaterialTypeRemarksField);
		boolean isHiddenMaterialTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenMaterialTypeRemarksField);

		// Verifying that Material Type Remarks Field is Selected or unselected
		boolean isSelectedMaterialTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedMaterialTypeRemarksField);
		boolean isDeselectedMaterialTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedMaterialTypeRemarksField);

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

		materialTypeField.clear();
		materialTypeField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage MaterialTypeEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		materialType.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Material Type Description Field is Enabled or not
		boolean isEnabledMaterialTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledMaterialTypeDescriptionField);
		boolean isDisabledMaterialTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledMaterialTypeDescriptionField);

		// Verifying that Material Type Description Field is displayed or hidden.
		boolean isDisplayedMaterialTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedMaterialTypeDescriptionField);
		boolean isHiddenMaterialTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenMaterialTypeDescriptionField);

		// Verifying that Material Type Description Field is Selected or unselected
		boolean isSelectedMaterialTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedMaterialTypeDescriptionField);
		boolean isDeselectedMaterialTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedMaterialTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Material Type Remarks Field is Enabled or not
		boolean isEnabledMaterialTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledMaterialTypeRemarksField);
		boolean isDisabledMaterialTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledMaterialTypeRemarksField);

		// Verifying that Material Type Remarks Field is displayed or hidden.
		boolean isDisplayedMaterialTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedMaterialTypeRemarksField);
		boolean isHiddenMaterialTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenMaterialTypeRemarksField);

		// Verifying that Material Type Remarks Field is Selected or unselected
		boolean isSelectedMaterialTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedMaterialTypeRemarksField);
		boolean isDeselectedMaterialTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedMaterialTypeRemarksField);

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
