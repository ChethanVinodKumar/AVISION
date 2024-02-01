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

public class INCO_Term extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='INCO Term'])[1]")
	WebElement inco_Term;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createinco_Term;

	@FindBy(xpath = "(//input[@placeholder='Enter Inci Term Name'])[1]")
	WebElement inco_TermField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public INCO_Term() {

		PageFactory.initElements(driver, this);
	}

	public HomePage INCO_TermCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		inco_Term.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createinco_Term);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditIncoTypeField = inco_TermField.isEnabled();
		assertTrue(isEnabledAuditIncoTypeField);
		boolean isDisabledIncoTypeTextFieldn = !inco_TermField.isEnabled();
		assertFalse(isDisabledIncoTypeTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedIncoTypeTextField = inco_TermField.isDisplayed();
		assertTrue(isDisplayedIncoTypeTextField);
		boolean isHiddenIncoTypeTextField = !inco_TermField.isDisplayed();
		assertFalse(isHiddenIncoTypeTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedIncoTypeTextField = inco_TermField.isSelected();
		assertFalse(isSelectedIncoTypeTextField);
		boolean isDeselectedIncoTypeTextField = !inco_TermField.isSelected();
		assertTrue(isDeselectedIncoTypeTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInIncoType = inco_TermField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Inci Term Name";

		assertEquals(displayedTextInIncoType, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledIncoTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledIncoTypeDescriptionField);
		boolean isDisabledIncoTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledIncoTypeDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedIncoTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedIncoTypeDescriptionField);
		boolean isHiddenIncoTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenIncoTypeDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedIncoTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedIncoTypeDescriptionField);
		boolean isDeselectedIncoTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedIncoTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledIncoTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledIncoTypeRemarksField);
		boolean isDisabledIncoTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledIncoTypeRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedIncoTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedIncoTypeRemarksField);
		boolean isHiddenIncoTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenIncoTypeRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedIncoTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedIncoTypeRemarksField);
		boolean isDeselectedIncoTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedIncoTypeRemarksField);

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

		inco_TermField.clear();
		inco_TermField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	public HomePage INCO_TermEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		inco_Term.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledIncoTypeDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledIncoTypeDescriptionField);
		boolean isDisabledIncoTypeDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledIncoTypeDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedIncoTypeDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedIncoTypeDescriptionField);
		boolean isHiddenIncoTypeDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenIncoTypeDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedIncoTypeDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedIncoTypeDescriptionField);
		boolean isDeselectedIncoTypeDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedIncoTypeDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledIncoTypeRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledIncoTypeRemarksField);
		boolean isDisabledIncoTypeRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledIncoTypeRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedIncoTypeRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedIncoTypeRemarksField);
		boolean isHiddenIncoTypeRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenIncoTypeRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedIncoTypeRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedIncoTypeRemarksField);
		boolean isDeselectedIncoTypeRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedIncoTypeRemarksField);

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
