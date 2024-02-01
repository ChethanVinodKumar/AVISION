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

public class Type_OF_Solution extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;
	// Secondary Master
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;
	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement master1;

	@FindBy(xpath = "(//a[normalize-space()='Type Of Solution'])[1]")
	WebElement type_OF_Solution;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createtype_OF_Solution;

	@FindBy(xpath = "(//input[@placeholder='Enter Type Of Company Name'])[1]")
	WebElement type_OF_SolutionField;

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

	public Type_OF_Solution() {

		PageFactory.initElements(driver, this);
	}

	public HomePage Type_OF_SolutionCreate(String name, String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		type_OF_Solution.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", createtype_OF_Solution);

		// 1Verifying that TypeOfSolution Name Text Field is Enabled or not
		boolean isEnabledAuditTypeOfSolutionField = type_OF_SolutionField.isEnabled();
		assertTrue(isEnabledAuditTypeOfSolutionField);
		boolean isDisabledTypeOfSolutionTextFieldn = !type_OF_SolutionField.isEnabled();
		assertFalse(isDisabledTypeOfSolutionTextFieldn);

		// Verifying that TypeOfSolution Name Text Field is displayed or hidden.
		boolean isDisplayedTypeOfSolutionTextField = type_OF_SolutionField.isDisplayed();
		assertTrue(isDisplayedTypeOfSolutionTextField);
		boolean isHiddenTypeOfSolutionTextField = !type_OF_SolutionField.isDisplayed();
		assertFalse(isHiddenTypeOfSolutionTextField);

		// Verifying that TypeOfSolution Name Text Field is Selected or unselected
		boolean isSelectedTypeOfSolutionTextField = type_OF_SolutionField.isSelected();
		assertFalse(isSelectedTypeOfSolutionTextField);
		boolean isDeselectedTypeOfSolutionTextField = !type_OF_SolutionField.isSelected();
		assertTrue(isDeselectedTypeOfSolutionTextField);

		// Verifying the Placeholder which is present in TypeOfSolution Name text field.
		String displayedTextInTypeOfSolution = type_OF_SolutionField.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Type Of Company Name";

		assertEquals(displayedTextInTypeOfSolution, expected_placeholder3);

		// 3Verifying that TypeOfSolution Description Field is Enabled or not
		boolean isEnabledTypeOfSolutionDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledTypeOfSolutionDescriptionField);
		boolean isDisabledTypeOfSolutionDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledTypeOfSolutionDescriptionField);

		// Verifying that TypeOfSolution Description Field is displayed or hidden.
		boolean isDisplayedTypeOfSolutionDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedTypeOfSolutionDescriptionField);
		boolean isHiddenTypeOfSolutionDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenTypeOfSolutionDescriptionField);

		// Verifying that TypeOfSolution Description Field is Selected or unselected
		boolean isSelectedTypeOfSolutionDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedTypeOfSolutionDescriptionField);
		boolean isDeselectedTypeOfSolutionDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedTypeOfSolutionDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that TypeOfSolution Remarks Field is Enabled or not
		boolean isEnabledTypeOfSolutionRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledTypeOfSolutionRemarksField);
		boolean isDisabledTypeOfSolutionRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledTypeOfSolutionRemarksField);

		// Verifying that TypeOfSolution Remarks Field is displayed or hidden.
		boolean isDisplayedTypeOfSolutionRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedTypeOfSolutionRemarksField);
		boolean isHiddenTypeOfSolutionRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenTypeOfSolutionRemarksField);

		// Verifying that TypeOfSolution Remarks Field is Selected or unselected
		boolean isSelectedTypeOfSolutionRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedTypeOfSolutionRemarksField);
		boolean isDeselectedTypeOfSolutionRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedTypeOfSolutionRemarksField);

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

		type_OF_SolutionField.clear();
		type_OF_SolutionField.sendKeys(name);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		js.executeScript("arguments[0].click();", saveButton);

		return new HomePage();
	}

	public HomePage Type_OF_SolutionEdit(String description, String remarks) {
		// TODO Auto-generated method stub

		threeLinesSideBarIcon.click();
		master1.click();
		type_OF_Solution.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

		// 3Verifying that TypeOfSolution Description Field is Enabled or not
		boolean isEnabledTypeOfSolutionDescriptionField = descriptionTextField.isEnabled();
		assertTrue(isEnabledTypeOfSolutionDescriptionField);
		boolean isDisabledTypeOfSolutionDescriptionField = !descriptionTextField.isEnabled();
		assertFalse(isDisabledTypeOfSolutionDescriptionField);

		// Verifying that TypeOfSolution Description Field is displayed or hidden.
		boolean isDisplayedTypeOfSolutionDescriptionField = descriptionTextField.isDisplayed();
		assertTrue(isDisplayedTypeOfSolutionDescriptionField);
		boolean isHiddenTypeOfSolutionDescriptionField = !descriptionTextField.isDisplayed();
		assertFalse(isHiddenTypeOfSolutionDescriptionField);

		// Verifying that TypeOfSolution Description Field is Selected or unselected
		boolean isSelectedTypeOfSolutionDescriptionField = descriptionTextField.isSelected();
		assertFalse(isSelectedTypeOfSolutionDescriptionField);
		boolean isDeselectedTypeOfSolutionDescriptionField = !descriptionTextField.isSelected();
		assertTrue(isDeselectedTypeOfSolutionDescriptionField);

		// Verifying the Placeholder which is present in Description text field.
		String displayedTextInDescription = descriptionTextField.getAttribute("placeholder");

		String expected_placeholder = "Enter Description";

		assertEquals(displayedTextInDescription, expected_placeholder);

		// 3Verifying that TypeOfSolution Remarks Field is Enabled or not
		boolean isEnabledTypeOfSolutionRemarksField = remarksTextField.isEnabled();
		assertTrue(isEnabledTypeOfSolutionRemarksField);
		boolean isDisabledTypeOfSolutionRemarksField = !remarksTextField.isEnabled();
		assertFalse(isDisabledTypeOfSolutionRemarksField);

		// Verifying that TypeOfSolution Remarks Field is displayed or hidden.
		boolean isDisplayedTypeOfSolutionRemarksField = remarksTextField.isDisplayed();
		assertTrue(isDisplayedTypeOfSolutionRemarksField);
		boolean isHiddenTypeOfSolutionRemarksField = !remarksTextField.isDisplayed();
		assertFalse(isHiddenTypeOfSolutionRemarksField);

		// Verifying that TypeOfSolution Remarks Field is Selected or unselected
		boolean isSelectedTypeOfSolutionRemarksField = remarksTextField.isSelected();
		assertFalse(isSelectedTypeOfSolutionRemarksField);
		boolean isDeselectedTypeOfSolutionRemarksField = !remarksTextField.isSelected();
		assertTrue(isDeselectedTypeOfSolutionRemarksField);

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
