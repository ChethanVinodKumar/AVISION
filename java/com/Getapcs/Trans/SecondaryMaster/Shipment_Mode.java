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

public class Shipment_Mode extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Shipment Mode'])[1]")
	WebElement shipment_Mode;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createshipment_Mode;

	@FindBy(xpath = "(//input[@placeholder='Enter ShipmentMode name'])[1]")
	WebElement shipment_ModeField;

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

	public Shipment_Mode() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Shipment_ModeCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		shipment_Mode.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createshipment_Mode);

		// 1Verifying that ShipmentMode Name Text Field is Enabled or not
		boolean isEnabledAuditShipmentModeField = shipment_ModeField.isEnabled();
		assertTrue(isEnabledAuditShipmentModeField);
		boolean isDisabledShipmentModeTextFieldn = !shipment_ModeField.isEnabled();
		assertFalse(isDisabledShipmentModeTextFieldn);

		// Verifying that ShipmentMode Name Text Field is displayed or hidden.
		boolean isDisplayedShipmentModeTextField = shipment_ModeField.isDisplayed();
		assertTrue(isDisplayedShipmentModeTextField);
		boolean isHiddenShipmentModeTextField = !shipment_ModeField.isDisplayed();
		assertFalse(isHiddenShipmentModeTextField);

		// Verifying that ShipmentMode Name Text Field is Selected or unselected
		boolean isSelectedShipmentModeTextField = shipment_ModeField.isSelected();
		assertFalse(isSelectedShipmentModeTextField);
		boolean isDeselectedShipmentModeTextField = !shipment_ModeField.isSelected();
		assertTrue(isDeselectedShipmentModeTextField);

		// Verifying the Placeholder which is present in ShipmentMode Name text field.
		String displayedTextInShipmentMode = shipment_ModeField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter ShipmentMode name";

		assertEquals(displayedTextInShipmentMode, expected_placeholder3);

		// 3Verifying that ShipmentMode Description Field is Enabled or not
		boolean isEnabledShipmentModeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledShipmentModeDescriptionField);
		boolean isDisabledShipmentModeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledShipmentModeDescriptionField);

		// Verifying that ShipmentMode Description Field is displayed or hidden.
		boolean isDisplayedShipmentModeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedShipmentModeDescriptionField);
		boolean isHiddenShipmentModeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenShipmentModeDescriptionField);

		// Verifying that ShipmentMode Description Field is Selected or unselected
		boolean isSelectedShipmentModeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedShipmentModeDescriptionField);
		boolean isDeselectedShipmentModeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedShipmentModeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that ShipmentMode Remarks Field is Enabled or not
		boolean isEnabledShipmentModeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledShipmentModeRemarksField);
		boolean isDisabledShipmentModeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledShipmentModeRemarksField);

		// Verifying that ShipmentMode Remarks Field is displayed or hidden.
		boolean isDisplayedShipmentModeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedShipmentModeRemarksField);
		boolean isHiddenShipmentModeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenShipmentModeRemarksField);

		// Verifying that ShipmentMode Remarks Field is Selected or unselected
		boolean isSelectedShipmentModeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedShipmentModeRemarksField);
		boolean isDeselectedShipmentModeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedShipmentModeRemarksField);

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

		shipment_ModeField.clear();
		shipment_ModeField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Shipment_ModeEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		shipment_Mode.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that ShipmentMode Description Field is Enabled or not
		boolean isEnabledShipmentModeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledShipmentModeDescriptionField);
		boolean isDisabledShipmentModeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledShipmentModeDescriptionField);

		// Verifying that ShipmentMode Description Field is displayed or hidden.
		boolean isDisplayedShipmentModeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedShipmentModeDescriptionField);
		boolean isHiddenShipmentModeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenShipmentModeDescriptionField);

		// Verifying that ShipmentMode Description Field is Selected or unselected
		boolean isSelectedShipmentModeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedShipmentModeDescriptionField);
		boolean isDeselectedShipmentModeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedShipmentModeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that ShipmentMode Remarks Field is Enabled or not
		boolean isEnabledShipmentModeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledShipmentModeRemarksField);
		boolean isDisabledShipmentModeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledShipmentModeRemarksField);

		// Verifying that ShipmentMode Remarks Field is displayed or hidden.
		boolean isDisplayedShipmentModeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedShipmentModeRemarksField);
		boolean isHiddenShipmentModeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenShipmentModeRemarksField);

		// Verifying that ShipmentMode Remarks Field is Selected or unselected
		boolean isSelectedShipmentModeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedShipmentModeRemarksField);
		boolean isDeselectedShipmentModeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedShipmentModeRemarksField);

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
