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

public class Preferred_Freight_Forwarder extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Preferred Freight Forwarder'])[1]")
	WebElement preferred_Freight_Forwarder;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createpreferred_Freight_Forwarder;

	@FindBy(xpath = "(//input[@placeholder='Enter Location Name'])[1]")
	WebElement preferred_Freight_ForwarderField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Preferred_Freight_Forwarder() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Preferred_Freight_ForwarderCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		preferred_Freight_Forwarder.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createpreferred_Freight_Forwarder);

		// 1Verifying that PreferredFreightForwarder Name Text Field is Enabled or not
		boolean isEnabledAuditPreferredFreightForwarderField = preferred_Freight_ForwarderField.isEnabled();
		assertTrue(isEnabledAuditPreferredFreightForwarderField);
		boolean isDisabledPreferredFreightForwarderTextFieldn = !preferred_Freight_ForwarderField.isEnabled();
		assertFalse(isDisabledPreferredFreightForwarderTextFieldn);

		// Verifying that PreferredFreightForwarder Name Text Field is displayed or
		// hidden.
		boolean isDisplayedPreferredFreightForwarderTextField = preferred_Freight_ForwarderField.isDisplayed();
		assertTrue(isDisplayedPreferredFreightForwarderTextField);
		boolean isHiddenPreferredFreightForwarderTextField = !preferred_Freight_ForwarderField.isDisplayed();
		assertFalse(isHiddenPreferredFreightForwarderTextField);

		// Verifying that PreferredFreightForwarder Name Text Field is Selected or
		// unselected
		boolean isSelectedPreferredFreightForwarderTextField = preferred_Freight_ForwarderField.isSelected();
		assertFalse(isSelectedPreferredFreightForwarderTextField);
		boolean isDeselectedPreferredFreightForwarderTextField = !preferred_Freight_ForwarderField.isSelected();
		assertTrue(isDeselectedPreferredFreightForwarderTextField);

		// Verifying the Placeholder which is present in PreferredFreightForwarder Name
		// text field.
		String displayedTextInPreferredFreightForwarder = preferred_Freight_ForwarderField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Location Name";

		assertEquals(displayedTextInPreferredFreightForwarder, expected_placeholder3);

		// 3Verifying that PreferredFreightForwarder Description Field is Enabled or not
		boolean isEnabledPreferredFreightForwarderDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledPreferredFreightForwarderDescriptionField);
		boolean isDisabledPreferredFreightForwarderDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledPreferredFreightForwarderDescriptionField);

		// Verifying that PreferredFreightForwarder Description Field is displayed or
		// hidden.
		boolean isDisplayedPreferredFreightForwarderDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedPreferredFreightForwarderDescriptionField);
		boolean isHiddenPreferredFreightForwarderDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenPreferredFreightForwarderDescriptionField);

		// Verifying that PreferredFreightForwarder Description Field is Selected or
		// unselected
		boolean isSelectedPreferredFreightForwarderDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedPreferredFreightForwarderDescriptionField);
		boolean isDeselectedPreferredFreightForwarderDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedPreferredFreightForwarderDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that PreferredFreightForwarder Remarks Field is Enabled or not
		boolean isEnabledPreferredFreightForwarderRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledPreferredFreightForwarderRemarksField);
		boolean isDisabledPreferredFreightForwarderRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledPreferredFreightForwarderRemarksField);

		// Verifying that PreferredFreightForwarder Remarks Field is displayed or
		// hidden.
		boolean isDisplayedPreferredFreightForwarderRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedPreferredFreightForwarderRemarksField);
		boolean isHiddenPreferredFreightForwarderRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenPreferredFreightForwarderRemarksField);

		// Verifying that PreferredFreightForwarder Remarks Field is Selected or
		// unselected
		boolean isSelectedPreferredFreightForwarderRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedPreferredFreightForwarderRemarksField);
		boolean isDeselectedPreferredFreightForwarderRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedPreferredFreightForwarderRemarksField);

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

		preferred_Freight_ForwarderField.clear();
		preferred_Freight_ForwarderField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Preferred_Freight_ForwarderEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		preferred_Freight_Forwarder.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that PreferredFreightForwarder Description Field is Enabled or not
		boolean isEnabledPreferredFreightForwarderDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledPreferredFreightForwarderDescriptionField);
		boolean isDisabledPreferredFreightForwarderDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledPreferredFreightForwarderDescriptionField);

		// Verifying that PreferredFreightForwarder Description Field is displayed or
		// hidden.
		boolean isDisplayedPreferredFreightForwarderDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedPreferredFreightForwarderDescriptionField);
		boolean isHiddenPreferredFreightForwarderDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenPreferredFreightForwarderDescriptionField);

		// Verifying that PreferredFreightForwarder Description Field is Selected or
		// unselected
		boolean isSelectedPreferredFreightForwarderDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedPreferredFreightForwarderDescriptionField);
		boolean isDeselectedPreferredFreightForwarderDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedPreferredFreightForwarderDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that PreferredFreightForwarder Remarks Field is Enabled or not
		boolean isEnabledPreferredFreightForwarderRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledPreferredFreightForwarderRemarksField);
		boolean isDisabledPreferredFreightForwarderRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledPreferredFreightForwarderRemarksField);

		// Verifying that PreferredFreightForwarder Remarks Field is displayed or
		// hidden.
		boolean isDisplayedPreferredFreightForwarderRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedPreferredFreightForwarderRemarksField);
		boolean isHiddenPreferredFreightForwarderRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenPreferredFreightForwarderRemarksField);

		// Verifying that PreferredFreightForwarder Remarks Field is Selected or
		// unselected
		boolean isSelectedPreferredFreightForwarderRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedPreferredFreightForwarderRemarksField);
		boolean isDeselectedPreferredFreightForwarderRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedPreferredFreightForwarderRemarksField);

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
