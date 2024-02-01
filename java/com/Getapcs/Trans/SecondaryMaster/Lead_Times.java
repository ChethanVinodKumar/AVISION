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

public class Lead_Times extends TestBase {
	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;

	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Lead Times'])[1]")
	WebElement lead_Times;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createlead_Times;

	@FindBy(xpath = "(//input[@placeholder='Enter Days '])[1]")
	WebElement days;

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

	public Lead_Times() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Lead_TimesCreate(String day, String week, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		lead_Times.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createlead_Times);

		// 1Verifying that Lead times Days Text Field is Enabled or not
		boolean isEnabledLeadTimesField = days.isEnabled();
		assertTrue(isEnabledLeadTimesField);
		boolean isDisabledLeadTimesTextField = !days.isEnabled();
		assertFalse(isDisabledLeadTimesTextField);

		// Verifying that Lead times Days Text Field is displayed or hidden.
		boolean isDisplayedLeadTimesTextField = days.isDisplayed();
		assertTrue(isDisplayedLeadTimesTextField);
		boolean isHiddenLeadTimesTextField = !days.isDisplayed();
		assertFalse(isHiddenLeadTimesTextField);

		// Verifying that Lead times Days Text Field is Selected or unselected
		boolean isSelectedLeadTimesTextField = days.isSelected();
		assertFalse(isSelectedLeadTimesTextField);
		boolean isDeselectedLeadTimesTextField = !days.isSelected();
		assertTrue(isDeselectedLeadTimesTextField);

		// Verifying the Placeholder which is present in Lead times Days text field.
		String displayedTextInDays = days.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Days ";

		assertEquals(displayedTextInDays, expected_placeholder3);
		// 1Verifying that Lead times Days Text Field is Enabled or not
		boolean isEnabledLeadTimesWeeks = weeks.isEnabled();
		assertTrue(isEnabledLeadTimesWeeks);
		boolean isDisabledLeadTimesWeeks = !weeks.isEnabled();
		assertFalse(isDisabledLeadTimesWeeks);

		// Verifying that Lead times Days Text Field is displayed or hidden.
		boolean isDisplayedLeadTimesWeeks = weeks.isDisplayed();
		assertTrue(isDisplayedLeadTimesWeeks);
		boolean isHiddenLeadTimesWeeks = !weeks.isDisplayed();
		assertFalse(isHiddenLeadTimesWeeks);

		// Verifying that Lead times Days Text Field is Selected or unselected
		boolean isSelectedLeadTimesWeeks = weeks.isSelected();
		assertFalse(isSelectedLeadTimesWeeks);
		boolean isDeselectedLeadTimesWeeks = !weeks.isSelected();
		assertTrue(isDeselectedLeadTimesWeeks);

		// Verifying the Placeholder which is present in Lead times Days text field.
		String displayedTextInLeadTimes1 = weeks.getAttribute("placeholder");

		String expected_placeholder = "Enter Weeks ";

		assertEquals(displayedTextInLeadTimes1, expected_placeholder);

		// 3Verifying that Lead Times Description Field is Enabled or not
		boolean isEnabledLeadTimesDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledLeadTimesDescriptionField);
		boolean isDisabledLeadTimesDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledLeadTimesDescriptionField);

		// Verifying that Lead Times Description Field is displayed or hidden.
		boolean isDisplayedLeadTimesDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedLeadTimesDescriptionField);
		boolean isHiddenLeadTimesDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenLeadTimesDescriptionField);

		// Verifying that Lead Times Description Field is Selected or unselected
		boolean isSelectedLeadTimesDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedLeadTimesDescriptionField);
		boolean isDeselectedLeadTimesDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedLeadTimesDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder1 = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder1);
		// 3Verifying that Lead Times Remarks Field is Enabled or not
		boolean isEnabledLeadTimesRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledLeadTimesRemarksField);
		boolean isDisabledLeadTimesRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledLeadTimesRemarksField);

		// Verifying that Lead Times Remarks Field is displayed or hidden.
		boolean isDisplayedLeadTimesRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedLeadTimesRemarksField);
		boolean isHiddenLeadTimesRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenLeadTimesRemarksField);

		// Verifying that Lead Times Remarks Field is Selected or unselected
		boolean isSelectedLeadTimesRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedLeadTimesRemarksField);
		boolean isDeselectedLeadTimesRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedLeadTimesRemarksField);

		// Verifying the Placeholder which is present in Remarks text field.
		String displayedTextInRemarks = remarksTextField.getAttribute("placeholder");

		String expected_placeholder10 = "Enter Remarks";

		assertEquals(displayedTextInRemarks, expected_placeholder10);

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

		days.clear();
		days.sendKeys(day);
		weeks.clear();
		weeks.sendKeys(week);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();

	}

	public HomePage Lead_TimesEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		lead_Times.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Lead Times Description Field is Enabled or not
		boolean isEnabledLeadTimesDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledLeadTimesDescriptionField);
		boolean isDisabledLeadTimesDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledLeadTimesDescriptionField);

		// Verifying that Lead Times Description Field is displayed or hidden.
		boolean isDisplayedLeadTimesDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedLeadTimesDescriptionField);
		boolean isHiddenLeadTimesDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenLeadTimesDescriptionField);

		// Verifying that Lead Times Description Field is Selected or unselected
		boolean isSelectedLeadTimesDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedLeadTimesDescriptionField);
		boolean isDeselectedLeadTimesDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedLeadTimesDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder1 = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder1);
		// 3Verifying that Lead Times Remarks Field is Enabled or not
		boolean isEnabledLeadTimesRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledLeadTimesRemarksField);
		boolean isDisabledLeadTimesRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledLeadTimesRemarksField);

		// Verifying that Lead Times Remarks Field is displayed or hidden.
		boolean isDisplayedLeadTimesRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedLeadTimesRemarksField);
		boolean isHiddenLeadTimesRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenLeadTimesRemarksField);

		// Verifying that Lead Times Remarks Field is Selected or unselected
		boolean isSelectedLeadTimesRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedLeadTimesRemarksField);
		boolean isDeselectedLeadTimesRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedLeadTimesRemarksField);

		// Verifying the Placeholder which is present in Remarks text field.
		String displayedTextInRemarks = remarksTextField.getAttribute("placeholder");

		String expected_placeholder10 = "Enter Remarks";

		assertEquals(displayedTextInRemarks, expected_placeholder10);

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
