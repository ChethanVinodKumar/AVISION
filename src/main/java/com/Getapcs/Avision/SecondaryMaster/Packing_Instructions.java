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

public class Packing_Instructions extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;

	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Packing Instructions'])[1]")
	WebElement packing_Instructions;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createpacking_Instructions;

	@FindBy(xpath = "(//input[@placeholder='Enter Packing instructions Name'])[1]")
	WebElement packing_InstructionsField;

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

	public Packing_Instructions() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Packing_InstructionsCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		packing_Instructions.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createpacking_Instructions);

		// 1Verifying that PackingInstruction Name Text Field is Enabled or not
		boolean isEnabledAuditPackingInstructionField = packing_InstructionsField.isEnabled();
		assertTrue(isEnabledAuditPackingInstructionField);
		boolean isDisabledPackingInstructionTextFieldn = !packing_InstructionsField.isEnabled();
		assertFalse(isDisabledPackingInstructionTextFieldn);

		// Verifying that PackingInstruction Name Text Field is displayed or hidden.
		boolean isDisplayedPackingInstructionTextField = packing_InstructionsField.isDisplayed();
		assertTrue(isDisplayedPackingInstructionTextField);
		boolean isHiddenPackingInstructionTextField = !packing_InstructionsField.isDisplayed();
		assertFalse(isHiddenPackingInstructionTextField);

		// Verifying that PackingInstruction Name Text Field is Selected or unselected
		boolean isSelectedPackingInstructionTextField = packing_InstructionsField.isSelected();
		assertFalse(isSelectedPackingInstructionTextField);
		boolean isDeselectedPackingInstructionTextField = !packing_InstructionsField.isSelected();
		assertTrue(isDeselectedPackingInstructionTextField);

		// Verifying the Placeholder which is present in PackingInstruction Name text
		// field.
		String displayedTextInPackingInstruction = packing_InstructionsField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Packing instructions Name";

		assertEquals(displayedTextInPackingInstruction, expected_placeholder3);

		// 3Verifying that PackingInstruction Description Field is Enabled or not
		boolean isEnabledPackingInstructionDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledPackingInstructionDescriptionField);
		boolean isDisabledPackingInstructionDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledPackingInstructionDescriptionField);

		// Verifying that PackingInstruction Description Field is displayed or hidden.
		boolean isDisplayedPackingInstructionDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedPackingInstructionDescriptionField);
		boolean isHiddenPackingInstructionDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenPackingInstructionDescriptionField);

		// Verifying that PackingInstruction Description Field is Selected or unselected
		boolean isSelectedPackingInstructionDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedPackingInstructionDescriptionField);
		boolean isDeselectedPackingInstructionDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedPackingInstructionDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that PackingInstruction Remarks Field is Enabled or not
		boolean isEnabledPackingInstructionRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledPackingInstructionRemarksField);
		boolean isDisabledPackingInstructionRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledPackingInstructionRemarksField);

		// Verifying that PackingInstruction Remarks Field is displayed or hidden.
		boolean isDisplayedPackingInstructionRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedPackingInstructionRemarksField);
		boolean isHiddenPackingInstructionRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenPackingInstructionRemarksField);

		// Verifying that PackingInstruction Remarks Field is Selected or unselected
		boolean isSelectedPackingInstructionRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedPackingInstructionRemarksField);
		boolean isDeselectedPackingInstructionRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedPackingInstructionRemarksField);

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

		packing_InstructionsField.clear();
		packing_InstructionsField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	public HomePage Packing_InstructionsEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		packing_Instructions.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that PackingInstruction Description Field is Enabled or not
		boolean isEnabledPackingInstructionDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledPackingInstructionDescriptionField);
		boolean isDisabledPackingInstructionDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledPackingInstructionDescriptionField);

		// Verifying that PackingInstruction Description Field is displayed or hidden.
		boolean isDisplayedPackingInstructionDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedPackingInstructionDescriptionField);
		boolean isHiddenPackingInstructionDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenPackingInstructionDescriptionField);

		// Verifying that PackingInstruction Description Field is Selected or unselected
		boolean isSelectedPackingInstructionDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedPackingInstructionDescriptionField);
		boolean isDeselectedPackingInstructionDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedPackingInstructionDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that PackingInstruction Remarks Field is Enabled or not
		boolean isEnabledPackingInstructionRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledPackingInstructionRemarksField);
		boolean isDisabledPackingInstructionRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledPackingInstructionRemarksField);

		// Verifying that PackingInstruction Remarks Field is displayed or hidden.
		boolean isDisplayedPackingInstructionRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedPackingInstructionRemarksField);
		boolean isHiddenPackingInstructionRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenPackingInstructionRemarksField);

		// Verifying that PackingInstruction Remarks Field is Selected or unselected
		boolean isSelectedPackingInstructionRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedPackingInstructionRemarksField);
		boolean isDeselectedPackingInstructionRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedPackingInstructionRemarksField);

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
