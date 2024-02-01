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

public class Purchase_Group extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;

	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Purchase Group'])[1]")
	WebElement purchase_Group;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createpurchase_Group;

	@FindBy(xpath = "(//input[@placeholder='Enter Purchase Group Name'])[1]")
	WebElement purchase_GroupField;

	@FindBy(xpath = "(//input[@placeholder='Enter Weeks '])[1]")
	WebElement weeks;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Purchase_Group() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Purchase_GroupCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		purchase_Group.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createpurchase_Group);

		// 1Verifying that PriceList Name Text Field is Enabled or not
		boolean isEnabledAuditPriceListField = purchase_GroupField.isEnabled();
		assertTrue(isEnabledAuditPriceListField);
		boolean isDisabledPriceListTextFieldn = !purchase_GroupField.isEnabled();
		assertFalse(isDisabledPriceListTextFieldn);

		// Verifying that PriceList Name Text Field is displayed or hidden.
		boolean isDisplayedPriceListTextField = purchase_GroupField.isDisplayed();
		assertTrue(isDisplayedPriceListTextField);
		boolean isHiddenPriceListTextField = !purchase_GroupField.isDisplayed();
		assertFalse(isHiddenPriceListTextField);

		// Verifying that PriceList Name Text Field is Selected or unselected
		boolean isSelectedPriceListTextField = purchase_GroupField.isSelected();
		assertFalse(isSelectedPriceListTextField);
		boolean isDeselectedPriceListTextField = !purchase_GroupField.isSelected();
		assertTrue(isDeselectedPriceListTextField);

		// Verifying the Placeholder which is present in PriceList Name text field.
		String displayedTextInPriceList = purchase_GroupField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Purchase Group Name";

		assertEquals(displayedTextInPriceList, expected_placeholder3);

		// 3Verifying that PriceList Description Field is Enabled or not
		boolean isEnabledPriceListDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledPriceListDescriptionField);
		boolean isDisabledPriceListDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledPriceListDescriptionField);

		// Verifying that PriceList Description Field is displayed or hidden.
		boolean isDisplayedPriceListDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedPriceListDescriptionField);
		boolean isHiddenPriceListDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenPriceListDescriptionField);

		// Verifying that PriceList Description Field is Selected or unselected
		boolean isSelectedPriceListDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedPriceListDescriptionField);
		boolean isDeselectedPriceListDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedPriceListDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that PriceList Remarks Field is Enabled or not
		boolean isEnabledPriceListRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledPriceListRemarksField);
		boolean isDisabledPriceListRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledPriceListRemarksField);

		// Verifying that PriceList Remarks Field is displayed or hidden.
		boolean isDisplayedPriceListRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedPriceListRemarksField);
		boolean isHiddenPriceListRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenPriceListRemarksField);

		// Verifying that PriceList Remarks Field is Selected or unselected
		boolean isSelectedPriceListRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedPriceListRemarksField);
		boolean isDeselectedPriceListRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedPriceListRemarksField);

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

		purchase_GroupField.clear();
		purchase_GroupField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	public HomePage Purchase_GroupEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		purchase_Group.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that PriceList Description Field is Enabled or not
		boolean isEnabledPriceListDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledPriceListDescriptionField);
		boolean isDisabledPriceListDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledPriceListDescriptionField);

		// Verifying that PriceList Description Field is displayed or hidden.
		boolean isDisplayedPriceListDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedPriceListDescriptionField);
		boolean isHiddenPriceListDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenPriceListDescriptionField);

		// Verifying that PriceList Description Field is Selected or unselected
		boolean isSelectedPriceListDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedPriceListDescriptionField);
		boolean isDeselectedPriceListDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedPriceListDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that PriceList Remarks Field is Enabled or not
		boolean isEnabledPriceListRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledPriceListRemarksField);
		boolean isDisabledPriceListRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledPriceListRemarksField);

		// Verifying that PriceList Remarks Field is displayed or hidden.
		boolean isDisplayedPriceListRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedPriceListRemarksField);
		boolean isHiddenPriceListRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenPriceListRemarksField);

		// Verifying that PriceList Remarks Field is Selected or unselected
		boolean isSelectedPriceListRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedPriceListRemarksField);
		boolean isDeselectedPriceListRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedPriceListRemarksField);

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
