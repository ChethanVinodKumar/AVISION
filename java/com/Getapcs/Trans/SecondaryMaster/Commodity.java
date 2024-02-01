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

public class Commodity extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Commodity'])[1]")
	WebElement commodity;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createcommodity;

	@FindBy(xpath = "(//input[@placeholder='Enter Commodity Name'])[1]")
	WebElement commodityField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;

	public Commodity() {

		PageFactory.initElements(driver, this);
	}

	public HomePage CommodityCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		commodity.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createcommodity);

		// 1Verifying that Audit Frequency Name Text Field is Enabled or not
		boolean isEnabledAuditComodityField = commodityField.isEnabled();
		assertTrue(isEnabledAuditComodityField);
		boolean isDisabledComodityTextFieldn = !commodityField.isEnabled();
		assertFalse(isDisabledComodityTextFieldn);

		// Verifying that Audit Frequency Name Text Field is displayed or hidden.
		boolean isDisplayedComodityTextField = commodityField.isDisplayed();
		assertTrue(isDisplayedComodityTextField);
		boolean isHiddenComodityTextField = !commodityField.isDisplayed();
		assertFalse(isHiddenComodityTextField);

		// Verifying that Audit Frequency Name Text Field is Selected or unselected
		boolean isSelectedComodityTextField = commodityField.isSelected();
		assertFalse(isSelectedComodityTextField);
		boolean isDeselectedComodityTextField = !commodityField.isSelected();
		assertTrue(isDeselectedComodityTextField);

		// Verifying the Placeholder which is present in Audit Frequency Name text
		// field.
		String displayedTextInComodity = commodityField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Commodity Name";

		assertEquals(displayedTextInComodity, expected_placeholder3);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledComodityDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledComodityDescriptionField);
		boolean isDisabledComodityDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledComodityDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedComodityDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedComodityDescriptionField);
		boolean isHiddenComodityDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenComodityDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedComodityDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedComodityDescriptionField);
		boolean isDeselectedComodityDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedComodityDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledComodityRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledComodityRemarksField);
		boolean isDisabledComodityRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledComodityRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedComodityRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedComodityRemarksField);
		boolean isHiddenComodityRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenComodityRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedComodityRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedComodityRemarksField);
		boolean isDeselectedComodityRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedComodityRemarksField);

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

		commodityField.clear();
		commodityField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	public HomePage CommodityEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		commodity.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Audit Frequency Description Field is Enabled or not
		boolean isEnabledComodityDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledComodityDescriptionField);
		boolean isDisabledComodityDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledComodityDescriptionField);

		// Verifying that Audit Frequency Description Field is displayed or hidden.
		boolean isDisplayedComodityDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedComodityDescriptionField);
		boolean isHiddenComodityDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenComodityDescriptionField);

		// Verifying that Audit Frequency Description Field is Selected or unselected
		boolean isSelectedComodityDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedComodityDescriptionField);
		boolean isDeselectedComodityDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedComodityDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Audit Frequency Remarks Field is Enabled or not
		boolean isEnabledComodityRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledComodityRemarksField);
		boolean isDisabledComodityRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledComodityRemarksField);

		// Verifying that Audit Frequency Remarks Field is displayed or hidden.
		boolean isDisplayedComodityRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedComodityRemarksField);
		boolean isHiddenComodityRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenComodityRemarksField);

		// Verifying that Audit Frequency Remarks Field is Selected or unselected
		boolean isSelectedComodityRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedComodityRemarksField);
		boolean isDeselectedComodityRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedComodityRemarksField);

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
