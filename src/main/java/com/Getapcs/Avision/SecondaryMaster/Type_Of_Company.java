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

public class Type_Of_Company extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Type of Company'])[1]")
	WebElement type_Of_Company;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createtype_Of_Company;

	@FindBy(xpath = "(//input[@placeholder='Enter Type Of Company Name'])[1]")
	WebElement type_Of_CompanyField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Type_Of_Company() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Type_Of_CompanyCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		type_Of_Company.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createtype_Of_Company);

		// 1Verifying that TypeOFCompany Name Text Field is Enabled or not
		boolean isEnabledAuditTypeOFCompanyField = type_Of_CompanyField.isEnabled();
		assertTrue(isEnabledAuditTypeOFCompanyField);
		boolean isDisabledTypeOFCompanyTextFieldn = !type_Of_CompanyField.isEnabled();
		assertFalse(isDisabledTypeOFCompanyTextFieldn);

		// Verifying that TypeOFCompany Name Text Field is displayed or hidden.
		boolean isDisplayedTypeOFCompanyTextField = type_Of_CompanyField.isDisplayed();
		assertTrue(isDisplayedTypeOFCompanyTextField);
		boolean isHiddenTypeOFCompanyTextField = !type_Of_CompanyField.isDisplayed();
		assertFalse(isHiddenTypeOFCompanyTextField);

		// Verifying that TypeOFCompany Name Text Field is Selected or unselected
		boolean isSelectedTypeOFCompanyTextField = type_Of_CompanyField.isSelected();
		assertFalse(isSelectedTypeOFCompanyTextField);
		boolean isDeselectedTypeOFCompanyTextField = !type_Of_CompanyField.isSelected();
		assertTrue(isDeselectedTypeOFCompanyTextField);

//		//Verifying the Placeholder which is present in TypeOFCompany Name text field.
		String displayedTextInTypeOFCompany = type_Of_CompanyField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Type Of Company Name";

		assertEquals(displayedTextInTypeOFCompany, expected_placeholder3);

		// 3Verifying that TypeOFCompany Description Field is Enabled or not
		boolean isEnabledTypeOFCompanyDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledTypeOFCompanyDescriptionField);
		boolean isDisabledTypeOFCompanyDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledTypeOFCompanyDescriptionField);

		// Verifying that TypeOFCompany Description Field is displayed or hidden.
		boolean isDisplayedTypeOFCompanyDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedTypeOFCompanyDescriptionField);
		boolean isHiddenTypeOFCompanyDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenTypeOFCompanyDescriptionField);

		// Verifying that TypeOFCompany Description Field is Selected or unselected
		boolean isSelectedTypeOFCompanyDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedTypeOFCompanyDescriptionField);
		boolean isDeselectedTypeOFCompanyDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedTypeOFCompanyDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that TypeOFCompany Remarks Field is Enabled or not
		boolean isEnabledTypeOFCompanyRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledTypeOFCompanyRemarksField);
		boolean isDisabledTypeOFCompanyRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledTypeOFCompanyRemarksField);

		// Verifying that TypeOFCompany Remarks Field is displayed or hidden.
		boolean isDisplayedTypeOFCompanyRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedTypeOFCompanyRemarksField);
		boolean isHiddenTypeOFCompanyRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenTypeOFCompanyRemarksField);

		// Verifying that TypeOFCompany Remarks Field is Selected or unselected
		boolean isSelectedTypeOFCompanyRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedTypeOFCompanyRemarksField);
		boolean isDeselectedTypeOFCompanyRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedTypeOFCompanyRemarksField);

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

		type_Of_CompanyField.clear();
		type_Of_CompanyField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Type_Of_CompanyEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		type_Of_Company.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that TypeOFCompany Description Field is Enabled or not
		boolean isEnabledTypeOFCompanyDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledTypeOFCompanyDescriptionField);
		boolean isDisabledTypeOFCompanyDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledTypeOFCompanyDescriptionField);

		// Verifying that TypeOFCompany Description Field is displayed or hidden.
		boolean isDisplayedTypeOFCompanyDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedTypeOFCompanyDescriptionField);
		boolean isHiddenTypeOFCompanyDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenTypeOFCompanyDescriptionField);

		// Verifying that TypeOFCompany Description Field is Selected or unselected
		boolean isSelectedTypeOFCompanyDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedTypeOFCompanyDescriptionField);
		boolean isDeselectedTypeOFCompanyDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedTypeOFCompanyDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that TypeOFCompany Remarks Field is Enabled or not
		boolean isEnabledTypeOFCompanyRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledTypeOFCompanyRemarksField);
		boolean isDisabledTypeOFCompanyRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledTypeOFCompanyRemarksField);

		// Verifying that TypeOFCompany Remarks Field is displayed or hidden.
		boolean isDisplayedTypeOFCompanyRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedTypeOFCompanyRemarksField);
		boolean isHiddenTypeOFCompanyRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenTypeOFCompanyRemarksField);

		// Verifying that TypeOFCompany Remarks Field is Selected or unselected
		boolean isSelectedTypeOFCompanyRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedTypeOFCompanyRemarksField);
		boolean isDeselectedTypeOFCompanyRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedTypeOFCompanyRemarksField);

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
