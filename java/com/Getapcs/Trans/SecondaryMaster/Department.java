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

public class Department extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Department'])[1]")
	WebElement department;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createdepartment;

	@FindBy(xpath = "(//input[@placeholder='Enter Department Name'])[1]")
	WebElement departmentField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Department() {

		PageFactory.initElements(driver, this);
	}

	public HomePage DepartmentCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		department.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createdepartment);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditDepartmentField = departmentField.isEnabled();
		assertTrue(isEnabledAuditDepartmentField);
		boolean isDisabledDepartmentTextFieldn = !departmentField.isEnabled();
		assertFalse(isDisabledDepartmentTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedDepartmentTextField = departmentField.isDisplayed();
		assertTrue(isDisplayedDepartmentTextField);
		boolean isHiddenDepartmentTextField = !departmentField.isDisplayed();
		assertFalse(isHiddenDepartmentTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedDepartmentTextField = departmentField.isSelected();
		assertFalse(isSelectedDepartmentTextField);
		boolean isDeselectedDepartmentTextField = !departmentField.isSelected();
		assertTrue(isDeselectedDepartmentTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInDepartment = departmentField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Department Name";

		assertEquals(displayedTextInDepartment, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledDepartmentDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledDepartmentDescriptionField);
		boolean isDisabledDepartmentDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledDepartmentDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedDepartmentDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedDepartmentDescriptionField);
		boolean isHiddenDepartmentDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenDepartmentDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedDepartmentDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedDepartmentDescriptionField);
		boolean isDeselectedDepartmentDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedDepartmentDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledDepartmentRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledDepartmentRemarksField);
		boolean isDisabledDepartmentRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledDepartmentRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedDepartmentRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedDepartmentRemarksField);
		boolean isHiddenDepartmentRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenDepartmentRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedDepartmentRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedDepartmentRemarksField);
		boolean isDeselectedDepartmentRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedDepartmentRemarksField);

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

		departmentField.clear();
		departmentField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage DepartmentEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		department.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledDepartmentDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledDepartmentDescriptionField);
		boolean isDisabledDepartmentDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledDepartmentDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedDepartmentDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedDepartmentDescriptionField);
		boolean isHiddenDepartmentDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenDepartmentDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedDepartmentDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedDepartmentDescriptionField);
		boolean isDeselectedDepartmentDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedDepartmentDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledDepartmentRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledDepartmentRemarksField);
		boolean isDisabledDepartmentRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledDepartmentRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedDepartmentRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedDepartmentRemarksField);
		boolean isHiddenDepartmentRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenDepartmentRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedDepartmentRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedDepartmentRemarksField);
		boolean isDeselectedDepartmentRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedDepartmentRemarksField);

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