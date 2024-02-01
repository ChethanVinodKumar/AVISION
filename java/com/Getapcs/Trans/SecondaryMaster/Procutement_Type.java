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

public class Procutement_Type extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Procurement Type'])[1]")
	WebElement procutement_Type;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createprocutement_Type;

	@FindBy(xpath = "(//input[@placeholder='Enter Location Name'])[1]")
	WebElement procutement_TypeField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Procutement_Type() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Procutement_TypeCreate(String name, String description, String remarks)
			throws InterruptedException {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		procutement_Type.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createprocutement_Type);

		// 1Verifying that ProcutementType Name Text Field is Enabled or not
		boolean isEnabledAuditProcutementTypeField = procutement_TypeField.isEnabled();
		assertTrue(isEnabledAuditProcutementTypeField);
		boolean isDisabledProcutementTypeTextFieldn = !procutement_TypeField.isEnabled();
		assertFalse(isDisabledProcutementTypeTextFieldn);

		// Verifying that ProcutementType Name Text Field is displayed or hidden.
		boolean isDisplayedProcutementTypeTextField = procutement_TypeField.isDisplayed();
		assertTrue(isDisplayedProcutementTypeTextField);
		boolean isHiddenProcutementTypeTextField = !procutement_TypeField.isDisplayed();
		assertFalse(isHiddenProcutementTypeTextField);

		// Verifying that ProcutementType Name Text Field is Selected or unselected
		boolean isSelectedProcutementTypeTextField = procutement_TypeField.isSelected();
		assertFalse(isSelectedProcutementTypeTextField);
		boolean isDeselectedProcutementTypeTextField = !procutement_TypeField.isSelected();
		assertTrue(isDeselectedProcutementTypeTextField);

		// Verifying the Placeholder which is present in ProcutementType Name text
		// field.
		String displayedTextInProcutementType = procutement_TypeField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Location Name";

		assertEquals(displayedTextInProcutementType, expected_placeholder3);

		// 3Verifying that ProcutementType Description Field is Enabled or not
		boolean isEnabledProcutementTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledProcutementTypeDescriptionField);
		boolean isDisabledProcutementTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledProcutementTypeDescriptionField);

		// Verifying that ProcutementType Description Field is displayed or hidden.
		boolean isDisplayedProcutementTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedProcutementTypeDescriptionField);
		boolean isHiddenProcutementTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenProcutementTypeDescriptionField);

		// Verifying that ProcutementType Description Field is Selected or unselected
		boolean isSelectedProcutementTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedProcutementTypeDescriptionField);
		boolean isDeselectedProcutementTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedProcutementTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that ProcutementType Remarks Field is Enabled or not
		boolean isEnabledProcutementTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledProcutementTypeRemarksField);
		boolean isDisabledProcutementTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledProcutementTypeRemarksField);

		// Verifying that ProcutementType Remarks Field is displayed or hidden.
		boolean isDisplayedProcutementTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedProcutementTypeRemarksField);
		boolean isHiddenProcutementTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenProcutementTypeRemarksField);

		// Verifying that ProcutementType Remarks Field is Selected or unselected
		boolean isSelectedProcutementTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedProcutementTypeRemarksField);
		boolean isDeselectedProcutementTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedProcutementTypeRemarksField);

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

		procutement_TypeField.clear();
		procutement_TypeField.sendKeys("TEST Procutement");
		descriptionTextField.clear();
		descriptionTextField.sendKeys("TEST Description");
		remarksTextField.clear();
		remarksTextField.sendKeys("TEST Remarks");
		js.executeScript("arguments[0].click();", saveButton);

		Thread.sleep(2000);
		return new HomePage();

	}

	public HomePage Procutement_TypeEdit(String description, String remarks) throws InterruptedException {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		procutement_Type.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);
		// 3Verifying that ProcutementType Description Field is Enabled or not
		boolean isEnabledProcutementTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledProcutementTypeDescriptionField);
		boolean isDisabledProcutementTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledProcutementTypeDescriptionField);

		// Verifying that ProcutementType Description Field is displayed or hidden.
		boolean isDisplayedProcutementTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedProcutementTypeDescriptionField);
		boolean isHiddenProcutementTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenProcutementTypeDescriptionField);

		// Verifying that ProcutementType Description Field is Selected or unselected
		boolean isSelectedProcutementTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedProcutementTypeDescriptionField);
		boolean isDeselectedProcutementTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedProcutementTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that ProcutementType Remarks Field is Enabled or not
		boolean isEnabledProcutementTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledProcutementTypeRemarksField);
		boolean isDisabledProcutementTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledProcutementTypeRemarksField);

		// Verifying that ProcutementType Remarks Field is displayed or hidden.
		boolean isDisplayedProcutementTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedProcutementTypeRemarksField);
		boolean isHiddenProcutementTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenProcutementTypeRemarksField);

		// Verifying that ProcutementType Remarks Field is Selected or unselected
		boolean isSelectedProcutementTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedProcutementTypeRemarksField);
		boolean isDeselectedProcutementTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedProcutementTypeRemarksField);

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
		descriptionTextField.sendKeys("TEST Description");
		remarksTextField.clear();
		remarksTextField.sendKeys("TEST Remarks");
		js.executeScript("arguments[0].click();", saveButton);
		js.executeScript("arguments[0].click();", yesButton);

		Thread.sleep(2000);
		return new HomePage();

	}
}
