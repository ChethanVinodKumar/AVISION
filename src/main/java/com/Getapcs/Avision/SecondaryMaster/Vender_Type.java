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

public class Vender_Type extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Vendor Type'])[1]")
	WebElement vender_Type;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createvender_Type;

	@FindBy(xpath = "(//input[@placeholder='Enter Vendor Type Name'])[1]")
	WebElement vender_TypeField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Vender_Type() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Vender_TypeCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		vender_Type.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createvender_Type);

		// 1Verifying that VenderType Name Text Field is Enabled or not
		boolean isEnabledAuditVenderTypeField = vender_TypeField.isEnabled();
		assertTrue(isEnabledAuditVenderTypeField);
		boolean isDisabledVenderTypeTextFieldn = !vender_TypeField.isEnabled();
		assertFalse(isDisabledVenderTypeTextFieldn);

		// Verifying that VenderType Name Text Field is displayed or hidden.
		boolean isDisplayedVenderTypeTextField = vender_TypeField.isDisplayed();
		assertTrue(isDisplayedVenderTypeTextField);
		boolean isHiddenVenderTypeTextField = !vender_TypeField.isDisplayed();
		assertFalse(isHiddenVenderTypeTextField);

		// Verifying that VenderType Name Text Field is Selected or unselected
		boolean isSelectedVenderTypeTextField = vender_TypeField.isSelected();
		assertFalse(isSelectedVenderTypeTextField);
		boolean isDeselectedVenderTypeTextField = !vender_TypeField.isSelected();
		assertTrue(isDeselectedVenderTypeTextField);

		// Verifying the Placeholder which is present in VenderType Name text field.
		String displayedTextInVenderType = vender_TypeField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Vendor Type Name";

		assertEquals(displayedTextInVenderType, expected_placeholder3);

		// 3Verifying that VenderType Description Field is Enabled or not
		boolean isEnabledVenderTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledVenderTypeDescriptionField);
		boolean isDisabledVenderTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledVenderTypeDescriptionField);

		// Verifying that VenderType Description Field is displayed or hidden.
		boolean isDisplayedVenderTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedVenderTypeDescriptionField);
		boolean isHiddenVenderTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenVenderTypeDescriptionField);

		// Verifying that VenderType Description Field is Selected or unselected
		boolean isSelectedVenderTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedVenderTypeDescriptionField);
		boolean isDeselectedVenderTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedVenderTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that VenderType Remarks Field is Enabled or not
		boolean isEnabledVenderTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledVenderTypeRemarksField);
		boolean isDisabledVenderTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledVenderTypeRemarksField);

		// Verifying that VenderType Remarks Field is displayed or hidden.
		boolean isDisplayedVenderTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedVenderTypeRemarksField);
		boolean isHiddenVenderTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenVenderTypeRemarksField);

		// Verifying that VenderType Remarks Field is Selected or unselected
		boolean isSelectedVenderTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedVenderTypeRemarksField);
		boolean isDeselectedVenderTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedVenderTypeRemarksField);

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

		vender_TypeField.clear();
		vender_TypeField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Vender_TypeEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		vender_Type.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that VenderType Description Field is Enabled or not
		boolean isEnabledVenderTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledVenderTypeDescriptionField);
		boolean isDisabledVenderTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledVenderTypeDescriptionField);

		// Verifying that VenderType Description Field is displayed or hidden.
		boolean isDisplayedVenderTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedVenderTypeDescriptionField);
		boolean isHiddenVenderTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenVenderTypeDescriptionField);

		// Verifying that VenderType Description Field is Selected or unselected
		boolean isSelectedVenderTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedVenderTypeDescriptionField);
		boolean isDeselectedVenderTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedVenderTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that VenderType Remarks Field is Enabled or not
		boolean isEnabledVenderTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledVenderTypeRemarksField);
		boolean isDisabledVenderTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledVenderTypeRemarksField);

		// Verifying that VenderType Remarks Field is displayed or hidden.
		boolean isDisplayedVenderTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedVenderTypeRemarksField);
		boolean isHiddenVenderTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenVenderTypeRemarksField);

		// Verifying that VenderType Remarks Field is Selected or unselected
		boolean isSelectedVenderTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedVenderTypeRemarksField);
		boolean isDeselectedVenderTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedVenderTypeRemarksField);

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
