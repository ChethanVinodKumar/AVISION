package com.Getapcs.Trans.SecondaryMaster;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class GST_Persentage extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='GST Percentage'])[1]")
	WebElement GST_Persentage;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createGST_Persentage;

	@FindBy(xpath = "(//input[@placeholder='Enter GST Percentage'])[1]")
	WebElement GST_PersentageField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public GST_Persentage() {

		PageFactory.initElements(driver, this);
	}

	public HomePage GST_PersentageCreate(String name, String description) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		GST_Persentage.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createGST_Persentage);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditGSTPersentageField = GST_PersentageField.isEnabled();
		assertTrue(isEnabledAuditGSTPersentageField);
		boolean isDisabledGSTPersentageTextFieldn = !GST_PersentageField.isEnabled();
		assertFalse(isDisabledGSTPersentageTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedGSTPersentageTextField = GST_PersentageField.isDisplayed();
		assertTrue(isDisplayedGSTPersentageTextField);
		boolean isHiddenGSTPersentageTextField = !GST_PersentageField.isDisplayed();
		assertFalse(isHiddenGSTPersentageTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedGSTPersentageTextField = GST_PersentageField.isSelected();
		assertFalse(isSelectedGSTPersentageTextField);
		boolean isDeselectedGSTPersentageTextField = !GST_PersentageField.isSelected();
		assertTrue(isDeselectedGSTPersentageTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInGSTPersentage = GST_PersentageField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter GST Percentage";

		assertEquals(displayedTextInGSTPersentage, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledGSTPersentageDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledGSTPersentageDescriptionField);
		boolean isDisabledGSTPersentageDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledGSTPersentageDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedGSTPersentageDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedGSTPersentageDescriptionField);
		boolean isHiddenGSTPersentageDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenGSTPersentageDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedGSTPersentageDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedGSTPersentageDescriptionField);
		boolean isDeselectedGSTPersentageDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedGSTPersentageDescriptionField);

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

		GST_PersentageField.clear();
		GST_PersentageField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	@AfterTest
	public HomePage GST_PersentageEdit(String description) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		GST_Persentage.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledGSTPersentageDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledGSTPersentageDescriptionField);
		boolean isDisabledGSTPersentageDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledGSTPersentageDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedGSTPersentageDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedGSTPersentageDescriptionField);
		boolean isHiddenGSTPersentageDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenGSTPersentageDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedGSTPersentageDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedGSTPersentageDescriptionField);
		boolean isDeselectedGSTPersentageDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedGSTPersentageDescriptionField);

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
