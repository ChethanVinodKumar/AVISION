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

public class Location extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Location'])[1]")
	WebElement location;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createlocation;

	@FindBy(xpath = "(//input[@placeholder='Enter Location Name'])[1]")
	WebElement locationField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement selectWarehouseDropdown;

	public Location() {

		PageFactory.initElements(driver, this);
	}

	public HomePage LocationCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		location.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createlocation);

		// 1Verifying that Select WareHouse Dropdown is Enabled or not
		boolean isEnabledSelectWarehouseDropdown = selectWarehouseDropdown.isEnabled();
		assertTrue(isEnabledSelectWarehouseDropdown);
		boolean isDisabledSelectWarehouseDropdown = !selectWarehouseDropdown.isEnabled();
		assertFalse(isDisabledSelectWarehouseDropdown);

		// Verifying that Select WareHouse Dropdown is displayed or hidden.
		boolean isDisplayedSelectWarehouseDropdown = selectWarehouseDropdown.isDisplayed();
		assertTrue(isDisplayedSelectWarehouseDropdown);
		boolean isHiddenSelectWarehouseDropdown = !selectWarehouseDropdown.isDisplayed();
		assertFalse(isHiddenSelectWarehouseDropdown);

		// Verifying that Select WareHouse Dropdown is Selected or unselected
		boolean isSelectedSelectWarehouseDropdown = selectWarehouseDropdown.isSelected();
		assertFalse(isSelectedSelectWarehouseDropdown);
		boolean isDeselectedSelectWarehouseDropdown = !selectWarehouseDropdown.isSelected();
		assertTrue(isDeselectedSelectWarehouseDropdown);

		selectWarehouseDropdown.sendKeys("Test1");
		selectWarehouseDropdown.sendKeys(Keys.ENTER);

		// 1Verifying that Location Name Text Field is Enabled or not
		boolean isEnabledAuditLocationField = locationField.isEnabled();
		assertTrue(isEnabledAuditLocationField);
		boolean isDisabledLocationTextFieldn = !locationField.isEnabled();
		assertFalse(isDisabledLocationTextFieldn);

		// Verifying that Location Name Text Field is displayed or hidden.
		boolean isDisplayedLocationTextField = locationField.isDisplayed();
		assertTrue(isDisplayedLocationTextField);
		boolean isHiddenLocationTextField = !locationField.isDisplayed();
		assertFalse(isHiddenLocationTextField);

		// Verifying that Location Name Text Field is Selected or unselected
		boolean isSelectedLocationTextField = locationField.isSelected();
		assertFalse(isSelectedLocationTextField);
		boolean isDeselectedLocationTextField = !locationField.isSelected();
		assertTrue(isDeselectedLocationTextField);

		// Verifying the Placeholder which is present in Location Name text field.
		String displayedTextInLocation = locationField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Location Name";

		assertEquals(displayedTextInLocation, expected_placeholder3);

		// 3Verifying that Location Description Field is Enabled or not
		boolean isEnabledLocationDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledLocationDescriptionField);
		boolean isDisabledLocationDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledLocationDescriptionField);

		// Verifying that Location Description Field is displayed or hidden.
		boolean isDisplayedLocationDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedLocationDescriptionField);
		boolean isHiddenLocationDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenLocationDescriptionField);

		// Verifying that Location Description Field is Selected or unselected
		boolean isSelectedLocationDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedLocationDescriptionField);
		boolean isDeselectedLocationDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedLocationDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Location Remarks Field is Enabled or not
		boolean isEnabledLocationRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledLocationRemarksField);
		boolean isDisabledLocationRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledLocationRemarksField);

		// Verifying that Location Remarks Field is displayed or hidden.
		boolean isDisplayedLocationRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedLocationRemarksField);
		boolean isHiddenLocationRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenLocationRemarksField);

		// Verifying that Location Remarks Field is Selected or unselected
		boolean isSelectedLocationRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedLocationRemarksField);
		boolean isDeselectedLocationRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedLocationRemarksField);

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

		locationField.clear();
		locationField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	public HomePage LocationEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		location.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 1Verifying that Select WareHouse Dropdown is Enabled or not

		// 3Verifying that Location Description Field is Enabled or not
		boolean isEnabledLocationDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledLocationDescriptionField);
		boolean isDisabledLocationDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledLocationDescriptionField);

		// Verifying that Location Description Field is displayed or hidden.
		boolean isDisplayedLocationDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedLocationDescriptionField);
		boolean isHiddenLocationDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenLocationDescriptionField);

		// Verifying that Location Description Field is Selected or unselected
		boolean isSelectedLocationDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedLocationDescriptionField);
		boolean isDeselectedLocationDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedLocationDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Location Remarks Field is Enabled or not
		boolean isEnabledLocationRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledLocationRemarksField);
		boolean isDisabledLocationRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledLocationRemarksField);

		// Verifying that Location Remarks Field is displayed or hidden.
		boolean isDisplayedLocationRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedLocationRemarksField);
		boolean isHiddenLocationRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenLocationRemarksField);

		// Verifying that Location Remarks Field is Selected or unselected
		boolean isSelectedLocationRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedLocationRemarksField);
		boolean isDeselectedLocationRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedLocationRemarksField);

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
