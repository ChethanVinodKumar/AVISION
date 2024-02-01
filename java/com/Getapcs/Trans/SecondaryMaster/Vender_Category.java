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

public class Vender_Category extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Vendor Category'])[1]")
	WebElement vender_Category;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createvender_Category;

	@FindBy(xpath = "(//input[@placeholder='Enter Vendor Category Name'])[1]")
	WebElement vender_CategoryField;

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

	public Vender_Category() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Vender_CategoryCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		vender_Category.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createvender_Category);

		// 1Verifying that VenderCategory Name Text Field is Enabled or not
		boolean isEnabledAuditVenderCategoryField = vender_CategoryField.isEnabled();
		assertTrue(isEnabledAuditVenderCategoryField);
		boolean isDisabledVenderCategoryTextFieldn = !vender_CategoryField.isEnabled();
		assertFalse(isDisabledVenderCategoryTextFieldn);

		// Verifying that VenderCategory Name Text Field is displayed or hidden.
		boolean isDisplayedVenderCategoryTextField = vender_CategoryField.isDisplayed();
		assertTrue(isDisplayedVenderCategoryTextField);
		boolean isHiddenVenderCategoryTextField = !vender_CategoryField.isDisplayed();
		assertFalse(isHiddenVenderCategoryTextField);

		// Verifying that VenderCategory Name Text Field is Selected or unselected
		boolean isSelectedVenderCategoryTextField = vender_CategoryField.isSelected();
		assertFalse(isSelectedVenderCategoryTextField);
		boolean isDeselectedVenderCategoryTextField = !vender_CategoryField.isSelected();
		assertTrue(isDeselectedVenderCategoryTextField);

		// Verifying the Placeholder which is present in VenderCategory Name text field.
		String displayedTextInVenderCategory = vender_CategoryField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Vendor Category Name";

		assertEquals(displayedTextInVenderCategory, expected_placeholder3);

		// 3Verifying that VenderCategory Description Field is Enabled or not
		boolean isEnabledVenderCategoryDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledVenderCategoryDescriptionField);
		boolean isDisabledVenderCategoryDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledVenderCategoryDescriptionField);

		// Verifying that VenderCategory Description Field is displayed or hidden.
		boolean isDisplayedVenderCategoryDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedVenderCategoryDescriptionField);
		boolean isHiddenVenderCategoryDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenVenderCategoryDescriptionField);

		// Verifying that VenderCategory Description Field is Selected or unselected
		boolean isSelectedVenderCategoryDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedVenderCategoryDescriptionField);
		boolean isDeselectedVenderCategoryDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedVenderCategoryDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that VenderCategory Remarks Field is Enabled or not
		boolean isEnabledVenderCategoryRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledVenderCategoryRemarksField);
		boolean isDisabledVenderCategoryRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledVenderCategoryRemarksField);

		// Verifying that VenderCategory Remarks Field is displayed or hidden.
		boolean isDisplayedVenderCategoryRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedVenderCategoryRemarksField);
		boolean isHiddenVenderCategoryRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenVenderCategoryRemarksField);

		// Verifying that VenderCategory Remarks Field is Selected or unselected
		boolean isSelectedVenderCategoryRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedVenderCategoryRemarksField);
		boolean isDeselectedVenderCategoryRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedVenderCategoryRemarksField);

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

		vender_CategoryField.clear();
		vender_CategoryField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Vender_CategoryEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		vender_Category.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that VenderCategory Description Field is Enabled or not
		boolean isEnabledVenderCategoryDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledVenderCategoryDescriptionField);
		boolean isDisabledVenderCategoryDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledVenderCategoryDescriptionField);

		// Verifying that VenderCategory Description Field is displayed or hidden.
		boolean isDisplayedVenderCategoryDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedVenderCategoryDescriptionField);
		boolean isHiddenVenderCategoryDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenVenderCategoryDescriptionField);

		// Verifying that VenderCategory Description Field is Selected or unselected
		boolean isSelectedVenderCategoryDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedVenderCategoryDescriptionField);
		boolean isDeselectedVenderCategoryDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedVenderCategoryDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that VenderCategory Remarks Field is Enabled or not
		boolean isEnabledVenderCategoryRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledVenderCategoryRemarksField);
		boolean isDisabledVenderCategoryRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledVenderCategoryRemarksField);

		// Verifying that VenderCategory Remarks Field is displayed or hidden.
		boolean isDisplayedVenderCategoryRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedVenderCategoryRemarksField);
		boolean isHiddenVenderCategoryRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenVenderCategoryRemarksField);

		// Verifying that VenderCategory Remarks Field is Selected or unselected
		boolean isSelectedVenderCategoryRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedVenderCategoryRemarksField);
		boolean isDeselectedVenderCategoryRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedVenderCategoryRemarksField);

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
