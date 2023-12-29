package com.Getapcs.Avision.SecondaryMaster;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class Category extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Category'])[1]")
	WebElement category;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createCategory;

	@FindBy(xpath = "(//input[@placeholder='Enter Category'])[1]")
	WebElement categoryField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Category() {

		PageFactory.initElements(driver, this);
	}

	public HomePage CategoryCreate(String name, String description) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		category.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createCategory);

//1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledACategoryField = categoryField.isEnabled();
		assertTrue(isEnabledACategoryField);
		boolean isDisabledCategoryTextField = !categoryField.isEnabled();
		assertFalse(isDisabledCategoryTextField);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedCategoryTextField = categoryField.isDisplayed();
		assertTrue(isDisplayedCategoryTextField);
		boolean isHiddenCategoryTextField = !categoryField.isDisplayed();
		assertFalse(isHiddenCategoryTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedCategoryTextField = categoryField.isSelected();
		assertFalse(isSelectedCategoryTextField);
		boolean isDeselectedCategoryTextField = !categoryField.isSelected();
		assertTrue(isDeselectedCategoryTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInCategory = categoryField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Category";

		assertEquals(displayedTextInCategory, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledCategoryDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledCategoryDescriptionField);
		boolean isDisabledCategoryDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledCategoryDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedCategoryDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedCategoryDescriptionField);
		boolean isHiddenCategoryDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenCategoryDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedCategoryDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedCategoryDescriptionField);
		boolean isDeselectedCategoryDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedCategoryDescriptionField);

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

		categoryField.clear();
		categoryField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);

		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	public HomePage CategoryEdit(String description) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		category.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledCategoryDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledCategoryDescriptionField);
		boolean isDisabledCategoryDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledCategoryDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedCategoryDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedCategoryDescriptionField);
		boolean isHiddenCategoryDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenCategoryDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedCategoryDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedCategoryDescriptionField);
		boolean isDeselectedCategoryDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedCategoryDescriptionField);

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
