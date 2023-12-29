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

public class Scope_Of_Supply extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Scope of supply'])[1]")
	WebElement scope_Of_Supply;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createscope_Of_Supply;

	@FindBy(xpath = "(//input[@placeholder='Enter Scope Of Supply Name'])[1]")
	WebElement scope_Of_SupplyField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Scope_Of_Supply() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Scope_Of_SupplyCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		scope_Of_Supply.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createscope_Of_Supply);

		// 1Verifying that ScopeOfSupply Name Text Field is Enabled or not
		boolean isEnabledAuditScopeOfSupplyField = scope_Of_SupplyField.isEnabled();
		assertTrue(isEnabledAuditScopeOfSupplyField);
		boolean isDisabledScopeOfSupplyTextFieldn = !scope_Of_SupplyField.isEnabled();
		assertFalse(isDisabledScopeOfSupplyTextFieldn);

		// Verifying that ScopeOfSupply Name Text Field is displayed or hidden.
		boolean isDisplayedScopeOfSupplyTextField = scope_Of_SupplyField.isDisplayed();
		assertTrue(isDisplayedScopeOfSupplyTextField);
		boolean isHiddenScopeOfSupplyTextField = !scope_Of_SupplyField.isDisplayed();
		assertFalse(isHiddenScopeOfSupplyTextField);

		// Verifying that ScopeOfSupply Name Text Field is Selected or unselected
		boolean isSelectedScopeOfSupplyTextField = scope_Of_SupplyField.isSelected();
		assertFalse(isSelectedScopeOfSupplyTextField);
		boolean isDeselectedScopeOfSupplyTextField = !scope_Of_SupplyField.isSelected();
		assertTrue(isDeselectedScopeOfSupplyTextField);

		// Verifying the Placeholder which is present in ScopeOfSupply Name text field.
		String displayedTextInScopeOfSupply = scope_Of_SupplyField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Scope Of Supply Name";

		assertEquals(displayedTextInScopeOfSupply, expected_placeholder3);

		// 3Verifying that ScopeOfSupply Description Field is Enabled or not
		boolean isEnabledScopeOfSupplyDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledScopeOfSupplyDescriptionField);
		boolean isDisabledScopeOfSupplyDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledScopeOfSupplyDescriptionField);

		// Verifying that ScopeOfSupply Description Field is displayed or hidden.
		boolean isDisplayedScopeOfSupplyDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedScopeOfSupplyDescriptionField);
		boolean isHiddenScopeOfSupplyDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenScopeOfSupplyDescriptionField);

		// Verifying that ScopeOfSupply Description Field is Selected or unselected
		boolean isSelectedScopeOfSupplyDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedScopeOfSupplyDescriptionField);
		boolean isDeselectedScopeOfSupplyDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedScopeOfSupplyDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that ScopeOfSupply Remarks Field is Enabled or not
		boolean isEnabledScopeOfSupplyRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledScopeOfSupplyRemarksField);
		boolean isDisabledScopeOfSupplyRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledScopeOfSupplyRemarksField);

		// Verifying that ScopeOfSupply Remarks Field is displayed or hidden.
		boolean isDisplayedScopeOfSupplyRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedScopeOfSupplyRemarksField);
		boolean isHiddenScopeOfSupplyRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenScopeOfSupplyRemarksField);

		// Verifying that ScopeOfSupply Remarks Field is Selected or unselected
		boolean isSelectedScopeOfSupplyRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedScopeOfSupplyRemarksField);
		boolean isDeselectedScopeOfSupplyRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedScopeOfSupplyRemarksField);

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

		scope_Of_SupplyField.clear();
		scope_Of_SupplyField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Scope_Of_SupplyEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		scope_Of_Supply.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that ScopeOfSupply Description Field is Enabled or not
		boolean isEnabledScopeOfSupplyDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledScopeOfSupplyDescriptionField);
		boolean isDisabledScopeOfSupplyDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledScopeOfSupplyDescriptionField);

		// Verifying that ScopeOfSupply Description Field is displayed or hidden.
		boolean isDisplayedScopeOfSupplyDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedScopeOfSupplyDescriptionField);
		boolean isHiddenScopeOfSupplyDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenScopeOfSupplyDescriptionField);

		// Verifying that ScopeOfSupply Description Field is Selected or unselected
		boolean isSelectedScopeOfSupplyDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedScopeOfSupplyDescriptionField);
		boolean isDeselectedScopeOfSupplyDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedScopeOfSupplyDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that ScopeOfSupply Remarks Field is Enabled or not
		boolean isEnabledScopeOfSupplyRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledScopeOfSupplyRemarksField);
		boolean isDisabledScopeOfSupplyRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledScopeOfSupplyRemarksField);

		// Verifying that ScopeOfSupply Remarks Field is displayed or hidden.
		boolean isDisplayedScopeOfSupplyRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedScopeOfSupplyRemarksField);
		boolean isHiddenScopeOfSupplyRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenScopeOfSupplyRemarksField);

		// Verifying that ScopeOfSupply Remarks Field is Selected or unselected
		boolean isSelectedScopeOfSupplyRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedScopeOfSupplyRemarksField);
		boolean isDeselectedScopeOfSupplyRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedScopeOfSupplyRemarksField);

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
