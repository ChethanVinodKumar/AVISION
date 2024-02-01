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

public class UOM extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='UOM'])[1]")
	WebElement uom;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createuom;

	@FindBy(xpath = "(//input[@placeholder='Enter UOM Name'])[1]")
	WebElement uomField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public UOM() {

		PageFactory.initElements(driver, this);
	}

	public HomePage UOMCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		uom.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createuom);

		// 1Verifying that UOM Name Text Field is Enabled or not
		boolean isEnabledAuditUOMField = uomField.isEnabled();
		assertTrue(isEnabledAuditUOMField);
		boolean isDisabledUOMTextFieldn = !uomField.isEnabled();
		assertFalse(isDisabledUOMTextFieldn);

		// Verifying that UOM Name Text Field is displayed or hidden.
		boolean isDisplayedUOMTextField = uomField.isDisplayed();
		assertTrue(isDisplayedUOMTextField);
		boolean isHiddenUOMTextField = !uomField.isDisplayed();
		assertFalse(isHiddenUOMTextField);

		// Verifying that UOM Name Text Field is Selected or unselected
		boolean isSelectedUOMTextField = uomField.isSelected();
		assertFalse(isSelectedUOMTextField);
		boolean isDeselectedUOMTextField = !uomField.isSelected();
		assertTrue(isDeselectedUOMTextField);

		// Verifying the Placeholder which is present in UOM Name text field.
		String displayedTextInUOM = uomField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter UOM Name";

		assertEquals(displayedTextInUOM, expected_placeholder3);

		// 3Verifying that UOM Description Field is Enabled or not
		boolean isEnabledUOMDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledUOMDescriptionField);
		boolean isDisabledUOMDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledUOMDescriptionField);

		// Verifying that UOM Description Field is displayed or hidden.
		boolean isDisplayedUOMDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedUOMDescriptionField);
		boolean isHiddenUOMDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenUOMDescriptionField);

		// Verifying that UOM Description Field is Selected or unselected
		boolean isSelectedUOMDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedUOMDescriptionField);
		boolean isDeselectedUOMDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedUOMDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that UOM Remarks Field is Enabled or not
		boolean isEnabledUOMRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledUOMRemarksField);
		boolean isDisabledUOMRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledUOMRemarksField);

		// Verifying that UOM Remarks Field is displayed or hidden.
		boolean isDisplayedUOMRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedUOMRemarksField);
		boolean isHiddenUOMRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenUOMRemarksField);

		// Verifying that UOM Remarks Field is Selected or unselected
		boolean isSelectedUOMRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedUOMRemarksField);
		boolean isDeselectedUOMRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedUOMRemarksField);

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
		uomField.clear();
		uomField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage UOMEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		uom.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that UOM Description Field is Enabled or not
		boolean isEnabledUOMDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledUOMDescriptionField);
		boolean isDisabledUOMDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledUOMDescriptionField);

		// Verifying that UOM Description Field is displayed or hidden.
		boolean isDisplayedUOMDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedUOMDescriptionField);
		boolean isHiddenUOMDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenUOMDescriptionField);

		// Verifying that UOM Description Field is Selected or unselected
		boolean isSelectedUOMDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedUOMDescriptionField);
		boolean isDeselectedUOMDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedUOMDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that UOM Remarks Field is Enabled or not
		boolean isEnabledUOMRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledUOMRemarksField);
		boolean isDisabledUOMRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledUOMRemarksField);

		// Verifying that UOM Remarks Field is displayed or hidden.
		boolean isDisplayedUOMRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedUOMRemarksField);
		boolean isHiddenUOMRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenUOMRemarksField);

		// Verifying that UOM Remarks Field is Selected or unselected
		boolean isSelectedUOMRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedUOMRemarksField);
		boolean isDeselectedUOMRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedUOMRemarksField);

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
