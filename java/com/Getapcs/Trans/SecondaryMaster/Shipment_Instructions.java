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

public class Shipment_Instructions extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Shipment Instructions'])[1]")
	WebElement shipment_Instructions;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createshipment_Instructions;

	@FindBy(xpath = "(//input[@placeholder='Enter Shipment Instructions Name'])[1]")
	WebElement shipment_InstructionsField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Shipment_Instructions() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Shipment_InstructionsCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		shipment_Instructions.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createshipment_Instructions);

		// 1Verifying that ShipmentInstructions Name Text Field is Enabled or not
		boolean isEnabledAuditShipmentInstructionsField = shipment_InstructionsField.isEnabled();
		assertTrue(isEnabledAuditShipmentInstructionsField);
		boolean isDisabledShipmentInstructionsTextFieldn = !shipment_InstructionsField.isEnabled();
		assertFalse(isDisabledShipmentInstructionsTextFieldn);

		// Verifying that ShipmentInstructions Name Text Field is displayed or hidden.
		boolean isDisplayedShipmentInstructionsTextField = shipment_InstructionsField.isDisplayed();
		assertTrue(isDisplayedShipmentInstructionsTextField);
		boolean isHiddenShipmentInstructionsTextField = !shipment_InstructionsField.isDisplayed();
		assertFalse(isHiddenShipmentInstructionsTextField);

		// Verifying that ShipmentInstructions Name Text Field is Selected or unselected
		boolean isSelectedShipmentInstructionsTextField = shipment_InstructionsField.isSelected();
		assertFalse(isSelectedShipmentInstructionsTextField);
		boolean isDeselectedShipmentInstructionsTextField = !shipment_InstructionsField.isSelected();
		assertTrue(isDeselectedShipmentInstructionsTextField);

		// Verifying the Placeholder which is present in ShipmentInstructions Name text
		// field.
		String displayedTextInShipmentInstructions = shipment_InstructionsField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Shipment Instructions Name";

		assertEquals(displayedTextInShipmentInstructions, expected_placeholder3);

		// 3Verifying that ShipmentInstructions Description Field is Enabled or not
		boolean isEnabledShipmentInstructionsDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledShipmentInstructionsDescriptionField);
		boolean isDisabledShipmentInstructionsDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledShipmentInstructionsDescriptionField);

		// Verifying that ShipmentInstructions Description Field is displayed or hidden.
		boolean isDisplayedShipmentInstructionsDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedShipmentInstructionsDescriptionField);
		boolean isHiddenShipmentInstructionsDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenShipmentInstructionsDescriptionField);

		// Verifying that ShipmentInstructions Description Field is Selected or
		// unselected
		boolean isSelectedShipmentInstructionsDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedShipmentInstructionsDescriptionField);
		boolean isDeselectedShipmentInstructionsDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedShipmentInstructionsDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that ShipmentInstructions Remarks Field is Enabled or not
		boolean isEnabledShipmentInstructionsRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledShipmentInstructionsRemarksField);
		boolean isDisabledShipmentInstructionsRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledShipmentInstructionsRemarksField);

		// Verifying that ShipmentInstructions Remarks Field is displayed or hidden.
		boolean isDisplayedShipmentInstructionsRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedShipmentInstructionsRemarksField);
		boolean isHiddenShipmentInstructionsRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenShipmentInstructionsRemarksField);

		// Verifying that ShipmentInstructions Remarks Field is Selected or unselected
		boolean isSelectedShipmentInstructionsRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedShipmentInstructionsRemarksField);
		boolean isDeselectedShipmentInstructionsRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedShipmentInstructionsRemarksField);

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

		shipment_InstructionsField.clear();
		shipment_InstructionsField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Shipment_InstructionsEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		shipment_Instructions.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that ShipmentInstructions Description Field is Enabled or not
		boolean isEnabledShipmentInstructionsDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledShipmentInstructionsDescriptionField);
		boolean isDisabledShipmentInstructionsDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledShipmentInstructionsDescriptionField);

		// Verifying that ShipmentInstructions Description Field is displayed or hidden.
		boolean isDisplayedShipmentInstructionsDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedShipmentInstructionsDescriptionField);
		boolean isHiddenShipmentInstructionsDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenShipmentInstructionsDescriptionField);

		// Verifying that ShipmentInstructions Description Field is Selected or
		// unselected
		boolean isSelectedShipmentInstructionsDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedShipmentInstructionsDescriptionField);
		boolean isDeselectedShipmentInstructionsDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedShipmentInstructionsDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that ShipmentInstructions Remarks Field is Enabled or not
		boolean isEnabledShipmentInstructionsRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledShipmentInstructionsRemarksField);
		boolean isDisabledShipmentInstructionsRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledShipmentInstructionsRemarksField);

		// Verifying that ShipmentInstructions Remarks Field is displayed or hidden.
		boolean isDisplayedShipmentInstructionsRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedShipmentInstructionsRemarksField);
		boolean isHiddenShipmentInstructionsRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenShipmentInstructionsRemarksField);

		// Verifying that ShipmentInstructions Remarks Field is Selected or unselected
		boolean isSelectedShipmentInstructionsRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedShipmentInstructionsRemarksField);
		boolean isDeselectedShipmentInstructionsRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedShipmentInstructionsRemarksField);

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
