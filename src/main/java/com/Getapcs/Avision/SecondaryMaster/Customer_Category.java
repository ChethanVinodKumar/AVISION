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

public class Customer_Category extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Customer Category'])[1]")
	WebElement customerCategory;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createcustomerCategory;

	@FindBy(xpath = "(//input[@placeholder='Enter Customer Category Name'])[1]")
	WebElement customerCategoryField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Customer_Category() {

		PageFactory.initElements(driver, this);
	}

	public HomePage CustomerCategoryCreate(String name, String description, String remarks)
			throws InterruptedException {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		customerCategory.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createcustomerCategory);

		// 1Verifying that CustomerCategory Name Text Field is Enabled or not
		boolean isEnabledAuditCustomerCategoryField = customerCategoryField.isEnabled();
		assertTrue(isEnabledAuditCustomerCategoryField);
		boolean isDisabledCustomerCategoryTextFieldn = !customerCategoryField.isEnabled();
		assertFalse(isDisabledCustomerCategoryTextFieldn);

		// Verifying that CustomerCategory Name Text Field is displayed or hidden.
		boolean isDisplayedCustomerCategoryTextField = customerCategoryField.isDisplayed();
		assertTrue(isDisplayedCustomerCategoryTextField);
		boolean isHiddenCustomerCategoryTextField = !customerCategoryField.isDisplayed();
		assertFalse(isHiddenCustomerCategoryTextField);

		// Verifying that CustomerCategory Name Text Field is Selected or unselected
		boolean isSelectedCustomerCategoryTextField = customerCategoryField.isSelected();
		assertFalse(isSelectedCustomerCategoryTextField);
		boolean isDeselectedCustomerCategoryTextField = !customerCategoryField.isSelected();
		assertTrue(isDeselectedCustomerCategoryTextField);

		// Verifying the Placeholder which is present in CustomerCategory Name text
		// field.
		String displayedTextInCustomerCategory = customerCategoryField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Customer Category Name";

		assertEquals(displayedTextInCustomerCategory, expected_placeholder3);

		// 3Verifying that CustomerCategory Description Field is Enabled or not
		boolean isEnabledCustomerCategoryDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledCustomerCategoryDescriptionField);
		boolean isDisabledCustomerCategoryDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledCustomerCategoryDescriptionField);

		// Verifying that CustomerCategory Description Field is displayed or hidden.
		boolean isDisplayedCustomerCategoryDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedCustomerCategoryDescriptionField);
		boolean isHiddenCustomerCategoryDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenCustomerCategoryDescriptionField);

		// Verifying that CustomerCategory Description Field is Selected or unselected
		boolean isSelectedCustomerCategoryDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedCustomerCategoryDescriptionField);
		boolean isDeselectedCustomerCategoryDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedCustomerCategoryDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that CustomerCategory Remarks Field is Enabled or not
		boolean isEnabledCustomerCategoryRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledCustomerCategoryRemarksField);
		boolean isDisabledCustomerCategoryRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledCustomerCategoryRemarksField);

		// Verifying that CustomerCategory Remarks Field is displayed or hidden.
		boolean isDisplayedCustomerCategoryRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedCustomerCategoryRemarksField);
		boolean isHiddenCustomerCategoryRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenCustomerCategoryRemarksField);

		// Verifying that CustomerCategory Remarks Field is Selected or unselected
		boolean isSelectedCustomerCategoryRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedCustomerCategoryRemarksField);
		boolean isDeselectedCustomerCategoryRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedCustomerCategoryRemarksField);

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

		customerCategoryField.clear();
		customerCategoryField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		Thread.sleep(2000);
		return new HomePage();
	}

	public HomePage CustomerCategoryEdit(String description, String remarks) throws InterruptedException {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		customerCategory.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that CustomerCategory Description Field is Enabled or not
		boolean isEnabledCustomerCategoryDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledCustomerCategoryDescriptionField);
		boolean isDisabledCustomerCategoryDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledCustomerCategoryDescriptionField);

		// Verifying that CustomerCategory Description Field is displayed or hidden.
		boolean isDisplayedCustomerCategoryDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedCustomerCategoryDescriptionField);
		boolean isHiddenCustomerCategoryDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenCustomerCategoryDescriptionField);

		// Verifying that CustomerCategory Description Field is Selected or unselected
		boolean isSelectedCustomerCategoryDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedCustomerCategoryDescriptionField);
		boolean isDeselectedCustomerCategoryDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedCustomerCategoryDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that CustomerCategory Remarks Field is Enabled or not
		boolean isEnabledCustomerCategoryRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledCustomerCategoryRemarksField);
		boolean isDisabledCustomerCategoryRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledCustomerCategoryRemarksField);

		// Verifying that CustomerCategory Remarks Field is displayed or hidden.
		boolean isDisplayedCustomerCategoryRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedCustomerCategoryRemarksField);
		boolean isHiddenCustomerCategoryRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenCustomerCategoryRemarksField);

		// Verifying that CustomerCategory Remarks Field is Selected or unselected
		boolean isSelectedCustomerCategoryRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedCustomerCategoryRemarksField);
		boolean isDeselectedCustomerCategoryRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedCustomerCategoryRemarksField);

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

		Thread.sleep(2000);
		return new HomePage();
	}
}
