package com.Getapcs.Avision.SecondaryMaster;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class BasisOfApproval extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Basis of Approval'])[1]")
	WebElement basisOfApproval;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createbasisOfApproval;

	@FindBy(xpath = "(//input[@placeholder='Enter Basis Of Approval Name'])[1]")
	WebElement basisOfApprovalField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public BasisOfApproval() {

		PageFactory.initElements(driver, this);
	}

	public HomePage BasisOfApprovalCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		basisOfApproval.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", createbasisOfApproval);
		// 1Verifying that Basis Of Approval Name Text Field is Enabled or not
		boolean isEnabledAuditBasisOfApprovalField = basisOfApprovalField.isEnabled();
		assertTrue(isEnabledAuditBasisOfApprovalField);
		boolean isDisabledBasisOfApprovalTextFieldn = !basisOfApprovalField.isEnabled();
		assertFalse(isDisabledBasisOfApprovalTextFieldn);

		// Verifying that Basis Of Approval Name Text Field is displayed or hidden.
		boolean isDisplayedBasisOfApprovalTextField = basisOfApprovalField.isDisplayed();
		assertTrue(isDisplayedBasisOfApprovalTextField);
		boolean isHiddenBasisOfApprovalTextField = !basisOfApprovalField.isDisplayed();
		assertFalse(isHiddenBasisOfApprovalTextField);

		// Verifying that Basis Of Approval Name Text Field is Selected or unselected
		boolean isSelectedBasisOfApprovalTextField = basisOfApprovalField.isSelected();
		assertFalse(isSelectedBasisOfApprovalTextField);
		boolean isDeselectedBasisOfApprovalTextField = !basisOfApprovalField.isSelected();
		assertTrue(isDeselectedBasisOfApprovalTextField);

		// Verifying the Placeholder which is present in Basis Of Approval Name text
		// field.
		String displayedTextInBasisOfApprovalName = basisOfApprovalField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Basis Of Approval Name";

		assertEquals(displayedTextInBasisOfApprovalName, expected_placeholder3);

		// 3Verifying that Basis Of Approval Description Field is Enabled or not
		boolean isEnabledBasisOfApprovalDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledBasisOfApprovalDescriptionField);
		boolean isDisabledBasisOfApprovalDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledBasisOfApprovalDescriptionField);

		// Verifying that Basis Of Approval Description Field is displayed or hidden.
		boolean isDisplayedBasisOfApprovalDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedBasisOfApprovalDescriptionField);
		boolean isHiddenBasisOfApprovalDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenBasisOfApprovalDescriptionField);

		// Verifying that Basis Of Approval Description Field is Selected or unselected
		boolean isSelectedBasisOfApprovalDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedBasisOfApprovalDescriptionField);
		boolean isDeselectedBasisOfApprovalDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedBasisOfApprovalDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Basis Of Approval Remarks Field is Enabled or not
		boolean isEnabledBasisOfApprovalRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledBasisOfApprovalRemarksField);
		boolean isDisabledBasisOfApprovalRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledBasisOfApprovalRemarksField);

		// Verifying that Basis Of Approval Remarks Field is displayed or hidden.
		boolean isDisplayedBasisOfApprovalRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedBasisOfApprovalRemarksField);
		boolean isHiddenBasisOfApprovalRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenBasisOfApprovalRemarksField);

		// Verifying that Basis Of Approval Remarks Field is Selected or unselected
		boolean isSelectedBasisOfApprovalRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedBasisOfApprovalRemarksField);
		boolean isDeselectedBasisOfApprovalRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedBasisOfApprovalRemarksField);

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

		basisOfApprovalField.clear();
		basisOfApprovalField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage BasisOfApprovalEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		basisOfApproval.click();

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Basis Of Approval Description Field is Enabled or not
		boolean isEnabledBasisOfApprovalDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledBasisOfApprovalDescriptionField);
		boolean isDisabledBasisOfApprovalDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledBasisOfApprovalDescriptionField);

		// Verifying that Basis Of Approval Description Field is displayed or hidden.
		boolean isDisplayedBasisOfApprovalDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedBasisOfApprovalDescriptionField);
		boolean isHiddenBasisOfApprovalDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenBasisOfApprovalDescriptionField);

		// Verifying that Basis Of Approval Description Field is Selected or unselected
		boolean isSelectedBasisOfApprovalDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedBasisOfApprovalDescriptionField);
		boolean isDeselectedBasisOfApprovalDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedBasisOfApprovalDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Basis Of Approval Remarks Field is Enabled or not
		boolean isEnabledBasisOfApprovalRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledBasisOfApprovalRemarksField);
		boolean isDisabledBasisOfApprovalRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledBasisOfApprovalRemarksField);

		// Verifying that Basis Of Approval Remarks Field is displayed or hidden.
		boolean isDisplayedBasisOfApprovalRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedBasisOfApprovalRemarksField);
		boolean isHiddenBasisOfApprovalRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenBasisOfApprovalRemarksField);

		// Verifying that Basis Of Approval Remarks Field is Selected or unselected
		boolean isSelectedBasisOfApprovalRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedBasisOfApprovalRemarksField);
		boolean isDeselectedBasisOfApprovalRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedBasisOfApprovalRemarksField);

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
