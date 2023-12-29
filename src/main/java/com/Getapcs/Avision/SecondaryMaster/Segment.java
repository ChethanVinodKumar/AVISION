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

public class Segment extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Segment'])[1]")
	WebElement segment_Create_Page;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createsegment_Create_Page;

	@FindBy(xpath = "(//input[@placeholder='Enter Segment Type'])[1]")
	WebElement segment_Create_PageField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Segment() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Segment_Create_PageCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		segment_Create_Page.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createsegment_Create_Page);

		// 1Verifying that Segment Name Text Field is Enabled or not
		boolean isEnabledAuditSegmentField = segment_Create_Page.isEnabled();
		assertTrue(isEnabledAuditSegmentField);
		boolean isDisabledSegmentTextFieldn = !segment_Create_Page.isEnabled();
		assertFalse(isDisabledSegmentTextFieldn);

		// Verifying that Segment Name Text Field is displayed or hidden.
		boolean isDisplayedSegmentTextField = segment_Create_Page.isDisplayed();
		assertTrue(isDisplayedSegmentTextField);
		boolean isHiddenSegmentTextField = !segment_Create_Page.isDisplayed();
		assertFalse(isHiddenSegmentTextField);

		// Verifying that Segment Name Text Field is Selected or unselected
		boolean isSelectedSegmentTextField = segment_Create_Page.isSelected();
		assertFalse(isSelectedSegmentTextField);
		boolean isDeselectedSegmentTextField = !segment_Create_Page.isSelected();
		assertTrue(isDeselectedSegmentTextField);

		// 3Verifying that Segment Description Field is Enabled or not
		boolean isEnabledSegmentDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledSegmentDescriptionField);
		boolean isDisabledSegmentDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledSegmentDescriptionField);

		// Verifying that Segment Description Field is displayed or hidden.
		boolean isDisplayedSegmentDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedSegmentDescriptionField);
		boolean isHiddenSegmentDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenSegmentDescriptionField);

		// Verifying that Segment Description Field is Selected or unselected
		boolean isSelectedSegmentDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedSegmentDescriptionField);
		boolean isDeselectedSegmentDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedSegmentDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Segment Remarks Field is Enabled or not
		boolean isEnabledSegmentRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledSegmentRemarksField);
		boolean isDisabledSegmentRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledSegmentRemarksField);

		// Verifying that Segment Remarks Field is displayed or hidden.
		boolean isDisplayedSegmentRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedSegmentRemarksField);
		boolean isHiddenSegmentRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenSegmentRemarksField);

		// Verifying that Segment Remarks Field is Selected or unselected
		boolean isSelectedSegmentRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedSegmentRemarksField);
		boolean isDeselectedSegmentRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedSegmentRemarksField);

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

		segment_Create_PageField.clear();
		segment_Create_PageField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Segment_Create_PageEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		segment_Create_Page.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Segment Description Field is Enabled or not
		boolean isEnabledSegmentDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledSegmentDescriptionField);
		boolean isDisabledSegmentDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledSegmentDescriptionField);

		// Verifying that Segment Description Field is displayed or hidden.
		boolean isDisplayedSegmentDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedSegmentDescriptionField);
		boolean isHiddenSegmentDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenSegmentDescriptionField);

		// Verifying that Segment Description Field is Selected or unselected
		boolean isSelectedSegmentDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedSegmentDescriptionField);
		boolean isDeselectedSegmentDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedSegmentDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Segment Remarks Field is Enabled or not
		boolean isEnabledSegmentRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledSegmentRemarksField);
		boolean isDisabledSegmentRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledSegmentRemarksField);

		// Verifying that Segment Remarks Field is displayed or hidden.
		boolean isDisplayedSegmentRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedSegmentRemarksField);
		boolean isHiddenSegmentRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenSegmentRemarksField);

		// Verifying that Segment Remarks Field is Selected or unselected
		boolean isSelectedSegmentRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedSegmentRemarksField);
		boolean isDeselectedSegmentRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedSegmentRemarksField);

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
