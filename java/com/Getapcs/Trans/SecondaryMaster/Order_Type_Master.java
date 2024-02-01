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

public class Order_Type_Master extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Order Type Master'])[1]")
	WebElement orderType;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createorderType;

	@FindBy(xpath = "(//input[@placeholder='Enter Fields Order Type'])[1]")
	WebElement orderTypeField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Order_Type_Master() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Order_Type_MasterCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		orderType.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createorderType);

		// 1Verifying that OrderTypeMaster Name Text Field is Enabled or not
		boolean isEnabledAuditOrderTypeMasterField = orderTypeField.isEnabled();
		assertTrue(isEnabledAuditOrderTypeMasterField);
		boolean isDisabledOrderTypeMasterTextFieldn = !orderTypeField.isEnabled();
		assertFalse(isDisabledOrderTypeMasterTextFieldn);

		// Verifying that OrderTypeMaster Name Text Field is displayed or hidden.
		boolean isDisplayedOrderTypeMasterTextField = orderTypeField.isDisplayed();
		assertTrue(isDisplayedOrderTypeMasterTextField);
		boolean isHiddenOrderTypeMasterTextField = !orderTypeField.isDisplayed();
		assertFalse(isHiddenOrderTypeMasterTextField);

		// Verifying that OrderTypeMaster Name Text Field is Selected or unselected
		boolean isSelectedOrderTypeMasterTextField = orderTypeField.isSelected();
		assertFalse(isSelectedOrderTypeMasterTextField);
		boolean isDeselectedOrderTypeMasterTextField = !orderTypeField.isSelected();
		assertTrue(isDeselectedOrderTypeMasterTextField);

		// Verifying the Placeholder which is present in OrderTypeMaster Name text
		// field.
		String displayedTextInOrderTypeMaster = orderTypeField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Fields Order Type";

		assertEquals(displayedTextInOrderTypeMaster, expected_placeholder3);

		// 3Verifying that OrderTypeMaster Description Field is Enabled or not
		boolean isEnabledOrderTypeMasterDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledOrderTypeMasterDescriptionField);
		boolean isDisabledOrderTypeMasterDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledOrderTypeMasterDescriptionField);

		// Verifying that OrderTypeMaster Description Field is displayed or hidden.
		boolean isDisplayedOrderTypeMasterDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedOrderTypeMasterDescriptionField);
		boolean isHiddenOrderTypeMasterDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenOrderTypeMasterDescriptionField);

		// Verifying that OrderTypeMaster Description Field is Selected or unselected
		boolean isSelectedOrderTypeMasterDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedOrderTypeMasterDescriptionField);
		boolean isDeselectedOrderTypeMasterDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedOrderTypeMasterDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that OrderTypeMaster Remarks Field is Enabled or not
		boolean isEnabledOrderTypeMasterRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledOrderTypeMasterRemarksField);
		boolean isDisabledOrderTypeMasterRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledOrderTypeMasterRemarksField);

		// Verifying that OrderTypeMaster Remarks Field is displayed or hidden.
		boolean isDisplayedOrderTypeMasterRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedOrderTypeMasterRemarksField);
		boolean isHiddenOrderTypeMasterRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenOrderTypeMasterRemarksField);

		// Verifying that OrderTypeMaster Remarks Field is Selected or unselected
		boolean isSelectedOrderTypeMasterRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedOrderTypeMasterRemarksField);
		boolean isDeselectedOrderTypeMasterRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedOrderTypeMasterRemarksField);

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

		orderTypeField.clear();
		orderTypeField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Order_Type_MasterEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		orderType.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that OrderTypeMaster Description Field is Enabled or not
		boolean isEnabledOrderTypeMasterDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledOrderTypeMasterDescriptionField);
		boolean isDisabledOrderTypeMasterDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledOrderTypeMasterDescriptionField);

		// Verifying that OrderTypeMaster Description Field is displayed or hidden.
		boolean isDisplayedOrderTypeMasterDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedOrderTypeMasterDescriptionField);
		boolean isHiddenOrderTypeMasterDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenOrderTypeMasterDescriptionField);

		// Verifying that OrderTypeMaster Description Field is Selected or unselected
		boolean isSelectedOrderTypeMasterDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedOrderTypeMasterDescriptionField);
		boolean isDeselectedOrderTypeMasterDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedOrderTypeMasterDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that OrderTypeMaster Remarks Field is Enabled or not
		boolean isEnabledOrderTypeMasterRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledOrderTypeMasterRemarksField);
		boolean isDisabledOrderTypeMasterRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledOrderTypeMasterRemarksField);

		// Verifying that OrderTypeMaster Remarks Field is displayed or hidden.
		boolean isDisplayedOrderTypeMasterRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedOrderTypeMasterRemarksField);
		boolean isHiddenOrderTypeMasterRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenOrderTypeMasterRemarksField);

		// Verifying that OrderTypeMaster Remarks Field is Selected or unselected
		boolean isSelectedOrderTypeMasterRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedOrderTypeMasterRemarksField);
		boolean isDeselectedOrderTypeMasterRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedOrderTypeMasterRemarksField);

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
