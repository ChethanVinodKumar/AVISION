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

public class Price_List extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	// Secondary Master

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Price List'])[1]")
	WebElement price_List;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createprice_List;

	@FindBy(xpath = "(//input[@placeholder='Enter Price List Name'])[1]")
	WebElement price_ListField;

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

	public Price_List() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Price_ListCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		price_List.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createprice_List);

		// 1Verifying that PriceList Name Text Field is Enabled or not
		boolean isEnabledAuditPriceListField = price_ListField.isEnabled();
		assertTrue(isEnabledAuditPriceListField);
		boolean isDisabledPriceListTextFieldn = !price_ListField.isEnabled();
		assertFalse(isDisabledPriceListTextFieldn);

		// Verifying that PriceList Name Text Field is displayed or hidden.
		boolean isDisplayedPriceListTextField = price_ListField.isDisplayed();
		assertTrue(isDisplayedPriceListTextField);
		boolean isHiddenPriceListTextField = !price_ListField.isDisplayed();
		assertFalse(isHiddenPriceListTextField);

		// Verifying that PriceList Name Text Field is Selected or unselected
		boolean isSelectedPriceListTextField = price_ListField.isSelected();
		assertFalse(isSelectedPriceListTextField);
		boolean isDeselectedPriceListTextField = !price_ListField.isSelected();
		assertTrue(isDeselectedPriceListTextField);

		// Verifying the Placeholder which is present in PriceList Name text field.
		String displayedTextInPriceList = price_ListField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Price List Name";

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

		price_ListField.clear();
		price_ListField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Price_ListEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		price_List.sendKeys(Keys.ENTER);

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
