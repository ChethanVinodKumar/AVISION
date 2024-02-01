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

public class UOC extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='UOC'])[1]")
	WebElement uoc;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createuoc;

	@FindBy(xpath = "(//input[@placeholder='Enter UOC Type'])[1]")
	WebElement uocField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public UOC() {

		PageFactory.initElements(driver, this);
	}

	public HomePage UOCCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		uoc.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createuoc);

		// 1Verifying that UOC Name Text Field is Enabled or not
		boolean isEnabledAuditUOCField = uocField.isEnabled();
		assertTrue(isEnabledAuditUOCField);
		boolean isDisabledUOCTextFieldn = !uocField.isEnabled();
		assertFalse(isDisabledUOCTextFieldn);

		// Verifying that UOC Name Text Field is displayed or hidden.
		boolean isDisplayedUOCTextField = uocField.isDisplayed();
		assertTrue(isDisplayedUOCTextField);
		boolean isHiddenUOCTextField = !uocField.isDisplayed();
		assertFalse(isHiddenUOCTextField);

		// Verifying that UOC Name Text Field is Selected or unselected
		boolean isSelectedUOCTextField = uocField.isSelected();
		assertFalse(isSelectedUOCTextField);
		boolean isDeselectedUOCTextField = !uocField.isSelected();
		assertTrue(isDeselectedUOCTextField);

		// Verifying the Placeholder which is present in UOC Name text field.
		String displayedTextInUOC = uocField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter UOC Type";

		assertEquals(displayedTextInUOC, expected_placeholder3);

		// 3Verifying that UOC Description Field is Enabled or not
		boolean isEnabledUOCDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledUOCDescriptionField);
		boolean isDisabledUOCDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledUOCDescriptionField);

		// Verifying that UOC Description Field is displayed or hidden.
		boolean isDisplayedUOCDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedUOCDescriptionField);
		boolean isHiddenUOCDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenUOCDescriptionField);

		// Verifying that UOC Description Field is Selected or unselected
		boolean isSelectedUOCDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedUOCDescriptionField);
		boolean isDeselectedUOCDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedUOCDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that UOC Remarks Field is Enabled or not
		boolean isEnabledUOCRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledUOCRemarksField);
		boolean isDisabledUOCRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledUOCRemarksField);

		// Verifying that UOC Remarks Field is displayed or hidden.
		boolean isDisplayedUOCRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedUOCRemarksField);
		boolean isHiddenUOCRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenUOCRemarksField);

		// Verifying that UOC Remarks Field is Selected or unselected
		boolean isSelectedUOCRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedUOCRemarksField);
		boolean isDeselectedUOCRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedUOCRemarksField);

		// Verifying the Placeholder which is present in Remarks text field.
		String displayedTextInRemarks = remarksTextField.getAttribute("placeholder");

		String expected_placeholder1 = "Enter Remarks";

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

		uocField.clear();
		uocField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage UOCEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		uoc.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that UOC Description Field is Enabled or not
		boolean isEnabledUOCDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledUOCDescriptionField);
		boolean isDisabledUOCDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledUOCDescriptionField);

		// Verifying that UOC Description Field is displayed or hidden.
		boolean isDisplayedUOCDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedUOCDescriptionField);
		boolean isHiddenUOCDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenUOCDescriptionField);

		// Verifying that UOC Description Field is Selected or unselected
		boolean isSelectedUOCDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedUOCDescriptionField);
		boolean isDeselectedUOCDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedUOCDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that UOC Remarks Field is Enabled or not
		boolean isEnabledUOCRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledUOCRemarksField);
		boolean isDisabledUOCRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledUOCRemarksField);

		// Verifying that UOC Remarks Field is displayed or hidden.
		boolean isDisplayedUOCRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedUOCRemarksField);
		boolean isHiddenUOCRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenUOCRemarksField);

		// Verifying that UOC Remarks Field is Selected or unselected
		boolean isSelectedUOCRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedUOCRemarksField);
		boolean isDeselectedUOCRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedUOCRemarksField);

		// Verifying the Placeholder which is present in Remarks text field.
		String displayedTextInRemarks = remarksTextField.getAttribute("placeholder");

		String expected_placeholder1 = "Enter Remarks";

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
