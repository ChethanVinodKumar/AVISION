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

public class CostCenter extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Cost Center'])[1]")
	WebElement costCenter;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createcostCenter;

	@FindBy(xpath = "(//input[@placeholder='Enter Cost Center Name'])[1]")
	WebElement costCenterField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public CostCenter() {

		PageFactory.initElements(driver, this);
	}

	public HomePage CostCenterCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		costCenter.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createcostCenter);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditCostCenterField = costCenterField.isEnabled();
		assertTrue(isEnabledAuditCostCenterField);
		boolean isDisabledCostCenterTextFieldn = !costCenterField.isEnabled();
		assertFalse(isDisabledCostCenterTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedCostCenterTextField = costCenterField.isDisplayed();
		assertTrue(isDisplayedCostCenterTextField);
		boolean isHiddenCostCenterTextField = !costCenterField.isDisplayed();
		assertFalse(isHiddenCostCenterTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedCostCenterTextField = costCenterField.isSelected();
		assertFalse(isSelectedCostCenterTextField);
		boolean isDeselectedCostCenterTextField = !costCenterField.isSelected();
		assertTrue(isDeselectedCostCenterTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInCostCenter = costCenterField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Cost Center Name";

		assertEquals(displayedTextInCostCenter, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledCostCenterDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledCostCenterDescriptionField);
		boolean isDisabledCostCenterDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledCostCenterDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedCostCenterDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedCostCenterDescriptionField);
		boolean isHiddenCostCenterDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenCostCenterDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedCostCenterDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedCostCenterDescriptionField);
		boolean isDeselectedCostCenterDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedCostCenterDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledCostCenterRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledCostCenterRemarksField);
		boolean isDisabledCostCenterRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledCostCenterRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedCostCenterRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedCostCenterRemarksField);
		boolean isHiddenCostCenterRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenCostCenterRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedCostCenterRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedCostCenterRemarksField);
		boolean isDeselectedCostCenterRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedCostCenterRemarksField);

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

		costCenterField.clear();
		costCenterField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	public HomePage CostCenterEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		costCenter.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledCostCenterDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledCostCenterDescriptionField);
		boolean isDisabledCostCenterDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledCostCenterDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedCostCenterDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedCostCenterDescriptionField);
		boolean isHiddenCostCenterDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenCostCenterDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedCostCenterDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedCostCenterDescriptionField);
		boolean isDeselectedCostCenterDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedCostCenterDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledCostCenterRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledCostCenterRemarksField);
		boolean isDisabledCostCenterRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledCostCenterRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedCostCenterRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedCostCenterRemarksField);
		boolean isHiddenCostCenterRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenCostCenterRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedCostCenterRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedCostCenterRemarksField);
		boolean isDeselectedCostCenterRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedCostCenterRemarksField);

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
