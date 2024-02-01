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

public class Warehouse extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Warehouse'])[1]")
	WebElement warehouse;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createwarehouse;

	@FindBy(xpath = "(//input[@placeholder='Enter Warehouse Name'])[1]")
	WebElement warehouseField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Warehouse() {

		PageFactory.initElements(driver, this);
	}

	public HomePage WarehouseCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		warehouse.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createwarehouse);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditWarehouseField = warehouseField.isEnabled();
		assertTrue(isEnabledAuditWarehouseField);
		boolean isDisabledWarehouseTextFieldn = !warehouseField.isEnabled();
		assertFalse(isDisabledWarehouseTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedWarehouseTextField = warehouseField.isDisplayed();
		assertTrue(isDisplayedWarehouseTextField);
		boolean isHiddenWarehouseTextField = !warehouseField.isDisplayed();
		assertFalse(isHiddenWarehouseTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedWarehouseTextField = warehouseField.isSelected();
		assertFalse(isSelectedWarehouseTextField);
		boolean isDeselectedWarehouseTextField = !warehouseField.isSelected();
		assertTrue(isDeselectedWarehouseTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInWarehouse = warehouseField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Warehouse Name";

		assertEquals(displayedTextInWarehouse, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledWarehouseDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledWarehouseDescriptionField);
		boolean isDisabledWarehouseDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledWarehouseDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedWarehouseDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedWarehouseDescriptionField);
		boolean isHiddenWarehouseDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenWarehouseDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedWarehouseDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedWarehouseDescriptionField);
		boolean isDeselectedWarehouseDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedWarehouseDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

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

		warehouseField.clear();
		warehouseField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);

		js.executeScript("arguments[0].click();", saveButton);
		return new HomePage();
	}

	public HomePage WarehouseEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		warehouse.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledWarehouseDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledWarehouseDescriptionField);
		boolean isDisabledWarehouseDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledWarehouseDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedWarehouseDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedWarehouseDescriptionField);
		boolean isHiddenWarehouseDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenWarehouseDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedWarehouseDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedWarehouseDescriptionField);
		boolean isDeselectedWarehouseDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedWarehouseDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

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

		js.executeScript("arguments[0].click();", saveButton);
		js.executeScript("arguments[0].click();", yesButton);

		return new HomePage();
	}
}
