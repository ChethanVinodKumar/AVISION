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

public class Salutations extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Salutations'])[1]")
	WebElement salutations;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createsalutations;

	@FindBy(xpath = "(//input[@placeholder='Enter Salutations Name'])[1]")
	WebElement salutationsField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Salutations() {

		PageFactory.initElements(driver, this);
	}

	public HomePage SalutationsCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		salutations.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createsalutations);

		// 1Verifying that Salutations Name Text Field is Enabled or not
		boolean isEnabledAuditSalutationsField = salutationsField.isEnabled();
		assertTrue(isEnabledAuditSalutationsField);
		boolean isDisabledSalutationsTextFieldn = !salutationsField.isEnabled();
		assertFalse(isDisabledSalutationsTextFieldn);

		// Verifying that Salutations Name Text Field is displayed or hidden.
		boolean isDisplayedSalutationsTextField = salutationsField.isDisplayed();
		assertTrue(isDisplayedSalutationsTextField);
		boolean isHiddenSalutationsTextField = !salutationsField.isDisplayed();
		assertFalse(isHiddenSalutationsTextField);

		// Verifying that Salutations Name Text Field is Selected or unselected
		boolean isSelectedSalutationsTextField = salutationsField.isSelected();
		assertFalse(isSelectedSalutationsTextField);
		boolean isDeselectedSalutationsTextField = !salutationsField.isSelected();
		assertTrue(isDeselectedSalutationsTextField);

		// Verifying the Placeholder which is present in Salutations Name text field.
		String displayedTextInSalutations = salutationsField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Salutations Name";

		assertEquals(displayedTextInSalutations, expected_placeholder3);

		// 3Verifying that Salutations Description Field is Enabled or not
		boolean isEnabledSalutationsDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledSalutationsDescriptionField);
		boolean isDisabledSalutationsDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledSalutationsDescriptionField);

		// Verifying that Salutations Description Field is displayed or hidden.
		boolean isDisplayedSalutationsDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedSalutationsDescriptionField);
		boolean isHiddenSalutationsDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenSalutationsDescriptionField);

		// Verifying that Salutations Description Field is Selected or unselected
		boolean isSelectedSalutationsDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedSalutationsDescriptionField);
		boolean isDeselectedSalutationsDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedSalutationsDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Salutations Remarks Field is Enabled or not
		boolean isEnabledSalutationsRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledSalutationsRemarksField);
		boolean isDisabledSalutationsRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledSalutationsRemarksField);

		// Verifying that Salutations Remarks Field is displayed or hidden.
		boolean isDisplayedSalutationsRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedSalutationsRemarksField);
		boolean isHiddenSalutationsRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenSalutationsRemarksField);

		// Verifying that Salutations Remarks Field is Selected or unselected
		boolean isSelectedSalutationsRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedSalutationsRemarksField);
		boolean isDeselectedSalutationsRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedSalutationsRemarksField);

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

		salutationsField.clear();
		salutationsField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage SalutationsEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		salutations.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Salutations Description Field is Enabled or not
		boolean isEnabledSalutationsDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledSalutationsDescriptionField);
		boolean isDisabledSalutationsDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledSalutationsDescriptionField);

		// Verifying that Salutations Description Field is displayed or hidden.
		boolean isDisplayedSalutationsDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedSalutationsDescriptionField);
		boolean isHiddenSalutationsDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenSalutationsDescriptionField);

		// Verifying that Salutations Description Field is Selected or unselected
		boolean isSelectedSalutationsDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedSalutationsDescriptionField);
		boolean isDeselectedSalutationsDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedSalutationsDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Salutations Remarks Field is Enabled or not
		boolean isEnabledSalutationsRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledSalutationsRemarksField);
		boolean isDisabledSalutationsRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledSalutationsRemarksField);

		// Verifying that Salutations Remarks Field is displayed or hidden.
		boolean isDisplayedSalutationsRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedSalutationsRemarksField);
		boolean isHiddenSalutationsRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenSalutationsRemarksField);

		// Verifying that Salutations Remarks Field is Selected or unselected
		boolean isSelectedSalutationsRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedSalutationsRemarksField);
		boolean isDeselectedSalutationsRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedSalutationsRemarksField);

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
