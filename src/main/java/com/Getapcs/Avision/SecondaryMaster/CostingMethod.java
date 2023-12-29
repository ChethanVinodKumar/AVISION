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

public class CostingMethod extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Costing Method'])[1]")
	WebElement costingMethod;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createcostingMethod;

	@FindBy(xpath = "(//input[@placeholder='Enter Costing Method Name'])[1]")
	WebElement costingMethodField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public CostingMethod() {

		PageFactory.initElements(driver, this);
	}

	public HomePage CostingMethodCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		costingMethod.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createcostingMethod);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditCostingMethodField = costingMethodField.isEnabled();
		assertTrue(isEnabledAuditCostingMethodField);
		boolean isDisabledCostingMethodTextFieldn = !costingMethodField.isEnabled();
		assertFalse(isDisabledCostingMethodTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedCostingMethodTextField = costingMethodField.isDisplayed();
		assertTrue(isDisplayedCostingMethodTextField);
		boolean isHiddenCostingMethodTextField = !costingMethodField.isDisplayed();
		assertFalse(isHiddenCostingMethodTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedCostingMethodTextField = costingMethodField.isSelected();
		assertFalse(isSelectedCostingMethodTextField);
		boolean isDeselectedCostingMethodTextField = !costingMethodField.isSelected();
		assertTrue(isDeselectedCostingMethodTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInCostingMethod = costingMethodField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Costing Method Name";

		assertEquals(displayedTextInCostingMethod, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledCostingMethodDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledCostingMethodDescriptionField);
		boolean isDisabledCostingMethodDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledCostingMethodDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedCostingMethodDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedCostingMethodDescriptionField);
		boolean isHiddenCostingMethodDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenCostingMethodDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedCostingMethodDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedCostingMethodDescriptionField);
		boolean isDeselectedCostingMethodDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedCostingMethodDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledCostingMethodRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledCostingMethodRemarksField);
		boolean isDisabledCostingMethodRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledCostingMethodRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedCostingMethodRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedCostingMethodRemarksField);
		boolean isHiddenCostingMethodRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenCostingMethodRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedCostingMethodRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedCostingMethodRemarksField);
		boolean isDeselectedCostingMethodRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedCostingMethodRemarksField);

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

		costingMethodField.clear();
		costingMethodField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	public HomePage CostingMethodEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		costingMethod.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledCostingMethodDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledCostingMethodDescriptionField);
		boolean isDisabledCostingMethodDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledCostingMethodDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedCostingMethodDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedCostingMethodDescriptionField);
		boolean isHiddenCostingMethodDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenCostingMethodDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedCostingMethodDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedCostingMethodDescriptionField);
		boolean isDeselectedCostingMethodDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedCostingMethodDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledCostingMethodRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledCostingMethodRemarksField);
		boolean isDisabledCostingMethodRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledCostingMethodRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedCostingMethodRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedCostingMethodRemarksField);
		boolean isHiddenCostingMethodRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenCostingMethodRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedCostingMethodRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedCostingMethodRemarksField);
		boolean isDeselectedCostingMethodRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedCostingMethodRemarksField);

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
