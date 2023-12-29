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

public class Risk_Category extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Risk Category'])[1]")
	WebElement risk_Category;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createrisk_Category;

	@FindBy(xpath = "(//input[@placeholder='Enter Risk Category'])[1]")
	WebElement risk_CategoryField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Risk_Category() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Risk_CategoryCreate(String name, String description) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		risk_Category.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createrisk_Category);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditRiskCategoryField = risk_CategoryField.isEnabled();
		assertTrue(isEnabledAuditRiskCategoryField);
		boolean isDisabledRiskCategoryTextFieldn = !risk_CategoryField.isEnabled();
		assertFalse(isDisabledRiskCategoryTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedRiskCategoryTextField = risk_CategoryField.isDisplayed();
		assertTrue(isDisplayedRiskCategoryTextField);
		boolean isHiddenRiskCategoryTextField = !risk_CategoryField.isDisplayed();
		assertFalse(isHiddenRiskCategoryTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedRiskCategoryTextField = risk_CategoryField.isSelected();
		assertFalse(isSelectedRiskCategoryTextField);
		boolean isDeselectedRiskCategoryTextField = !risk_CategoryField.isSelected();
		assertTrue(isDeselectedRiskCategoryTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInRiskCategory = risk_CategoryField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Risk Category";

		assertEquals(displayedTextInRiskCategory, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledRiskCategoryDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledRiskCategoryDescriptionField);
		boolean isDisabledRiskCategoryDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledRiskCategoryDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedRiskCategoryDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedRiskCategoryDescriptionField);
		boolean isHiddenRiskCategoryDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenRiskCategoryDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedRiskCategoryDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedRiskCategoryDescriptionField);
		boolean isDeselectedRiskCategoryDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedRiskCategoryDescriptionField);

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

		risk_CategoryField.clear();
		risk_CategoryField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);

		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Risk_CategoryEdit(String description) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		risk_Category.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledRiskCategoryDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledRiskCategoryDescriptionField);
		boolean isDisabledRiskCategoryDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledRiskCategoryDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedRiskCategoryDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedRiskCategoryDescriptionField);
		boolean isHiddenRiskCategoryDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenRiskCategoryDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedRiskCategoryDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedRiskCategoryDescriptionField);
		boolean isDeselectedRiskCategoryDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedRiskCategoryDescriptionField);

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
