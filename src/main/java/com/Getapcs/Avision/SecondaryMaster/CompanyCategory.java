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

public class CompanyCategory extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Company Category'])[1]")
	WebElement companyCategory;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createcompanyCategory;

	@FindBy(xpath = "(//input[@placeholder='Enter Company Category Name'])[1]")
	WebElement companyCategoryField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public CompanyCategory() {

		PageFactory.initElements(driver, this);
	}

	public HomePage CompanyCategoryCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		companyCategory.sendKeys(Keys.ENTER);
		;

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", createcompanyCategory);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditCompanyCategoryField = companyCategoryField.isEnabled();
		assertTrue(isEnabledAuditCompanyCategoryField);
		boolean isDisabledCompanyCategoryTextFieldn = !companyCategoryField.isEnabled();
		assertFalse(isDisabledCompanyCategoryTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedCompanyCategoryTextField = companyCategoryField.isDisplayed();
		assertTrue(isDisplayedCompanyCategoryTextField);
		boolean isHiddenCompanyCategoryTextField = !companyCategoryField.isDisplayed();
		assertFalse(isHiddenCompanyCategoryTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedCompanyCategoryTextField = companyCategoryField.isSelected();
		assertFalse(isSelectedCompanyCategoryTextField);
		boolean isDeselectedCompanyCategoryTextField = !companyCategoryField.isSelected();
		assertTrue(isDeselectedCompanyCategoryTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInCompanyCategory = companyCategoryField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Company Category Name";

		assertEquals(displayedTextInCompanyCategory, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledCompanyCategoryDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledCompanyCategoryDescriptionField);
		boolean isDisabledCompanyCategoryDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledCompanyCategoryDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedCompanyCategoryDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedCompanyCategoryDescriptionField);
		boolean isHiddenCompanyCategoryDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenCompanyCategoryDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedCompanyCategoryDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedCompanyCategoryDescriptionField);
		boolean isDeselectedCompanyCategoryDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedCompanyCategoryDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledCompanyCategoryRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledCompanyCategoryRemarksField);
		boolean isDisabledCompanyCategoryRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledCompanyCategoryRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedCompanyCategoryRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedCompanyCategoryRemarksField);
		boolean isHiddenCompanyCategoryRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenCompanyCategoryRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedCompanyCategoryRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedCompanyCategoryRemarksField);
		boolean isDeselectedCompanyCategoryRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedCompanyCategoryRemarksField);

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

		companyCategoryField.clear();
		companyCategoryField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		driver.navigate().back();
		return new HomePage();
	}

	public HomePage CompanyCategoryEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		companyCategory.sendKeys(Keys.ENTER);
		;

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledCompanyCategoryDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledCompanyCategoryDescriptionField);
		boolean isDisabledCompanyCategoryDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledCompanyCategoryDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedCompanyCategoryDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedCompanyCategoryDescriptionField);
		boolean isHiddenCompanyCategoryDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenCompanyCategoryDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedCompanyCategoryDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedCompanyCategoryDescriptionField);
		boolean isDeselectedCompanyCategoryDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedCompanyCategoryDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledCompanyCategoryRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledCompanyCategoryRemarksField);
		boolean isDisabledCompanyCategoryRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledCompanyCategoryRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedCompanyCategoryRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedCompanyCategoryRemarksField);
		boolean isHiddenCompanyCategoryRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenCompanyCategoryRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedCompanyCategoryRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedCompanyCategoryRemarksField);
		boolean isDeselectedCompanyCategoryRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedCompanyCategoryRemarksField);

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

		driver.navigate().back();
		return new HomePage();
	}
}
