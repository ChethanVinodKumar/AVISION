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

public class Nature_Of_Relationship extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Nature of Relationship'])[1]")
	WebElement natureOfRelationship;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createnatureOfRelationship;

	@FindBy(xpath = "(//input[@placeholder='Enter Nature Of Relationship'])[1]")
	WebElement natureOfRelationshipField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Nature_Of_Relationship() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Nature_Of_RelationshipCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		natureOfRelationship.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createnatureOfRelationship);

		// 1Verifying that Nature of Relationship Name Text Field is Enabled or not
		boolean isEnabledAuditNatureOFRelationshipField = natureOfRelationshipField.isEnabled();
		assertTrue(isEnabledAuditNatureOFRelationshipField);
		boolean isDisabledNatureOFRelationshipTextFieldn = !natureOfRelationshipField.isEnabled();
		assertFalse(isDisabledNatureOFRelationshipTextFieldn);

		// Verifying that Nature of Relationship Name Text Field is displayed or hidden.
		boolean isDisplayedNatureOFRelationshipTextField = natureOfRelationshipField.isDisplayed();
		assertTrue(isDisplayedNatureOFRelationshipTextField);
		boolean isHiddenNatureOFRelationshipTextField = !natureOfRelationshipField.isDisplayed();
		assertFalse(isHiddenNatureOFRelationshipTextField);

		// Verifying that Nature of Relationship Name Text Field is Selected or
		// unselected
		boolean isSelectedNatureOFRelationshipTextField = natureOfRelationshipField.isSelected();
		assertFalse(isSelectedNatureOFRelationshipTextField);
		boolean isDeselectedNatureOFRelationshipTextField = !natureOfRelationshipField.isSelected();
		assertTrue(isDeselectedNatureOFRelationshipTextField);

		// Verifying the Placeholder which is present in Nature of Relationship Name
		// text field.
		String displayedTextInNatureOFRelationship = natureOfRelationshipField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Nature Of Relationship";

		assertEquals(displayedTextInNatureOFRelationship, expected_placeholder3);

		// 3Verifying that Nature of Relationship Description Field is Enabled or not
		boolean isEnabledNatureOFRelationshipDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledNatureOFRelationshipDescriptionField);
		boolean isDisabledNatureOFRelationshipDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledNatureOFRelationshipDescriptionField);

		// Verifying that Nature of Relationship Description Field is displayed or
		// hidden.
		boolean isDisplayedNatureOFRelationshipDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedNatureOFRelationshipDescriptionField);
		boolean isHiddenNatureOFRelationshipDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenNatureOFRelationshipDescriptionField);

		// Verifying that Nature of Relationship Description Field is Selected or
		// unselected
		boolean isSelectedNatureOFRelationshipDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedNatureOFRelationshipDescriptionField);
		boolean isDeselectedNatureOFRelationshipDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedNatureOFRelationshipDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Nature of Relationship Remarks Field is Enabled or not
		boolean isEnabledNatureOFRelationshipRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledNatureOFRelationshipRemarksField);
		boolean isDisabledNatureOFRelationshipRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledNatureOFRelationshipRemarksField);

		// Verifying that Nature of Relationship Remarks Field is displayed or hidden.
		boolean isDisplayedNatureOFRelationshipRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedNatureOFRelationshipRemarksField);
		boolean isHiddenNatureOFRelationshipRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenNatureOFRelationshipRemarksField);

		// Verifying that Nature of Relationship Remarks Field is Selected or unselected
		boolean isSelectedNatureOFRelationshipRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedNatureOFRelationshipRemarksField);
		boolean isDeselectedNatureOFRelationshipRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedNatureOFRelationshipRemarksField);

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

		natureOfRelationshipField.clear();
		natureOfRelationshipField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Nature_Of_RelationshipEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		natureOfRelationship.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that Nature of Relationship Description Field is Enabled or not
		boolean isEnabledNatureOFRelationshipDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledNatureOFRelationshipDescriptionField);
		boolean isDisabledNatureOFRelationshipDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledNatureOFRelationshipDescriptionField);

		// Verifying that Nature of Relationship Description Field is displayed or
		// hidden.
		boolean isDisplayedNatureOFRelationshipDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedNatureOFRelationshipDescriptionField);
		boolean isHiddenNatureOFRelationshipDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenNatureOFRelationshipDescriptionField);

		// Verifying that Nature of Relationship Description Field is Selected or
		// unselected
		boolean isSelectedNatureOFRelationshipDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedNatureOFRelationshipDescriptionField);
		boolean isDeselectedNatureOFRelationshipDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedNatureOFRelationshipDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that Nature of Relationship Remarks Field is Enabled or not
		boolean isEnabledNatureOFRelationshipRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledNatureOFRelationshipRemarksField);
		boolean isDisabledNatureOFRelationshipRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledNatureOFRelationshipRemarksField);

		// Verifying that Nature of Relationship Remarks Field is displayed or hidden.
		boolean isDisplayedNatureOFRelationshipRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedNatureOFRelationshipRemarksField);
		boolean isHiddenNatureOFRelationshipRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenNatureOFRelationshipRemarksField);

		// Verifying that Nature of Relationship Remarks Field is Selected or unselected
		boolean isSelectedNatureOFRelationshipRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedNatureOFRelationshipRemarksField);
		boolean isDeselectedNatureOFRelationshipRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedNatureOFRelationshipRemarksField);

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
