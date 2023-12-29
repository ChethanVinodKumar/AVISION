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

public class Part_Type extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Part Type'])[1]")
	WebElement part_Type;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createpart_Type;

	@FindBy(xpath = "(//input[@placeholder='Enter Location Name'])[1]")
	WebElement part_TypeField;

	@FindBy(xpath = "(//input[@placeholder='Enter Weeks '])[1]")
	WebElement weeks;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Part_Type() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Part_TypeCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		part_Type.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createpart_Type);

		// 1Verifying that PartType Name Text Field is Enabled or not
		boolean isEnabledAuditPartTypeField = part_TypeField.isEnabled();
		assertTrue(isEnabledAuditPartTypeField);
		boolean isDisabledPartTypeTextFieldn = !part_TypeField.isEnabled();
		assertFalse(isDisabledPartTypeTextFieldn);

		// Verifying that PartType Name Text Field is displayed or hidden.
		boolean isDisplayedPartTypeTextField = part_TypeField.isDisplayed();
		assertTrue(isDisplayedPartTypeTextField);
		boolean isHiddenPartTypeTextField = !part_TypeField.isDisplayed();
		assertFalse(isHiddenPartTypeTextField);

		// Verifying that PartType Name Text Field is Selected or unselected
		boolean isSelectedPartTypeTextField = part_TypeField.isSelected();
		assertFalse(isSelectedPartTypeTextField);
		boolean isDeselectedPartTypeTextField = !part_TypeField.isSelected();
		assertTrue(isDeselectedPartTypeTextField);

		// Verifying the Placeholder which is present in PartType Name text field.
		String displayedTextInPartType = part_TypeField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Location Name";

		assertEquals(displayedTextInPartType, expected_placeholder3);
		// 3Verifying that PartType Description Field is Enabled or not
		boolean isEnabledPartTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledPartTypeDescriptionField);
		boolean isDisabledPartTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledPartTypeDescriptionField);

		// Verifying that PartType Description Field is displayed or hidden.
		boolean isDisplayedPartTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedPartTypeDescriptionField);
		boolean isHiddenPartTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenPartTypeDescriptionField);

		// Verifying that PartType Description Field is Selected or unselected
		boolean isSelectedPartTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedPartTypeDescriptionField);
		boolean isDeselectedPartTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedPartTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that PartType Remarks Field is Enabled or not
		boolean isEnabledPartTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledPartTypeRemarksField);
		boolean isDisabledPartTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledPartTypeRemarksField);

		// Verifying that PartType Remarks Field is displayed or hidden.
		boolean isDisplayedPartTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedPartTypeRemarksField);
		boolean isHiddenPartTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenPartTypeRemarksField);

		// Verifying that PartType Remarks Field is Selected or unselected
		boolean isSelectedPartTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedPartTypeRemarksField);
		boolean isDeselectedPartTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedPartTypeRemarksField);

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

		part_TypeField.clear();
		part_TypeField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Part_TypeEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		part_Type.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// Verifying that PartType Description Field is displayed or hidden.
		boolean isDisplayedPartTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedPartTypeDescriptionField);
		boolean isHiddenPartTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenPartTypeDescriptionField);

		// Verifying that PartType Description Field is Selected or unselected
		boolean isSelectedPartTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedPartTypeDescriptionField);
		boolean isDeselectedPartTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedPartTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that PartType Remarks Field is Enabled or not
		boolean isEnabledPartTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledPartTypeRemarksField);
		boolean isDisabledPartTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledPartTypeRemarksField);

		// Verifying that PartType Remarks Field is displayed or hidden.
		boolean isDisplayedPartTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedPartTypeRemarksField);
		boolean isHiddenPartTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenPartTypeRemarksField);

		// Verifying that PartType Remarks Field is Selected or unselected
		boolean isSelectedPartTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedPartTypeRemarksField);
		boolean isDeselectedPartTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedPartTypeRemarksField);

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
