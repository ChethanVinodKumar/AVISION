package com.Getapcs.Trans.SecondaryMaster;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;



public class Additionalcharges extends TestBase {

	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement createAdditionalCharges;

	@FindBy(xpath = "(//input[@placeholder='Enter Additional Charges Name'])[1]")
	WebElement additionalChargesNameTestField;

	@FindBy(xpath = "(//input[@placeholder='Addtional Charges Ammount'])[1]")
	WebElement additionalChargesAmountField;

	@FindBy(xpath = "(//input[@placeholder='Ebter IGST'])[1]")
	WebElement additionalChargesIGSTField;

	@FindBy(xpath = "(//input[@placeholder='Enter CGST'])[1]")
	WebElement additionalChargesCGSTField;

	@FindBy(xpath = "(//input[@placeholder='ENter SGST'])[1]")
	WebElement additionalChargesSGSTField;

	@FindBy(xpath = "(//input[@placeholder='Enter UTGST'])[1]")
	WebElement additionalChargesUTGSTField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement descriptionTextField;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarksTextField;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
	WebElement editButton;

	public Additionalcharges() {

		PageFactory.initElements(driver, this);
	}

	public HomePage additionalChargesCreate(String name, String amount, String igst, String cgst, String sgst,
			String utgst, String description, String remarks) {

		// verifying createadditionalCharges field Displayed or not
		boolean isDisplayed = createAdditionalCharges.isDisplayed();
		assertTrue(isDisplayed);
		boolean isHidden = !createAdditionalCharges.isDisplayed();
		assertFalse(isHidden);

		// verifying createadditionalCharges field Selected or unselected
		boolean isSelected = createAdditionalCharges.isSelected();
		assertFalse(isSelected);
		boolean isDeselected = !createAdditionalCharges.isSelected();
		assertTrue(isDeselected);

		createAdditionalCharges.click();

		// 1verifying additionalChargesNameTestField field is Enabled or disabled.
		boolean isEnabled1 = additionalChargesNameTestField.isEnabled();
		assertTrue(isEnabled1, "additionalChargesNameTestField is enabled");
		boolean isDisabled1 = !additionalChargesNameTestField.isEnabled();
		assertFalse(isDisabled1, "additionalChargesNameTestField is not enabled");

		// verifying additionalChargesNameTestField field is displayed or hidden.
		boolean isDisplayed1 = additionalChargesNameTestField.isDisplayed();
		assertTrue(isDisplayed1);
		boolean isHidden1 = !additionalChargesNameTestField.isDisplayed();
		assertFalse(isHidden1);

		// verifying additionalChargesNameTestField field Selected or unselected
		boolean isSelected1 = additionalChargesNameTestField.isSelected();
		assertFalse(isSelected1);
		boolean isDeselected1 = !additionalChargesNameTestField.isSelected();
		assertTrue(isDeselected1);

		// 2verifying AdditionalChargesAmountField field is Enabled or disabled.
		boolean isEnabled2 = additionalChargesAmountField.isEnabled();
		assertTrue(isEnabled2, "AdditionalChargesAmountField is enabled");
		boolean isDisabled2 = !additionalChargesAmountField.isEnabled();
		assertFalse(isDisabled2, "AdditionalChargesAmountField is not enabled");

		// verifying AdditionalChargesAmountField field is displayed or hidden.
		boolean isDisplayed2 = additionalChargesAmountField.isDisplayed();
		assertTrue(isDisplayed2);
		boolean isHidden2 = !additionalChargesAmountField.isDisplayed();
		assertFalse(isHidden2);

		// verifying AdditionalChargesAmountField field Selected or unselected
		boolean isSelected2 = additionalChargesAmountField.isSelected();
		assertFalse(isSelected2);
		boolean isDeselected2 = !additionalChargesAmountField.isSelected();
		assertTrue(isDeselected2);

		// 3verifying additionalChargesIGSTField field is Enabled or disabled.
		boolean isEnabled3 = additionalChargesIGSTField.isEnabled();
		assertTrue(isEnabled3, "additionalChargesIGSTField is enabled");
		boolean isDisabled3 = !additionalChargesIGSTField.isEnabled();
		assertFalse(isDisabled3, "additionalChargesIGSTField is not enabled");

		// verifying additionalChargesIGSTField field is displayed or hidden.
		boolean isDisplayed3 = additionalChargesIGSTField.isDisplayed();
		assertTrue(isDisplayed3);
		boolean isHidden3 = !additionalChargesIGSTField.isDisplayed();
		assertFalse(isHidden3);

		// verifying additionalChargesIGSTField field Selected or unselected
		boolean isSelected3 = additionalChargesIGSTField.isSelected();
		assertFalse(isSelected3);
		boolean isDeselected3 = !additionalChargesIGSTField.isSelected();
		assertTrue(isDeselected3);

		// 4verifying additionalChargesCGSTField field is Enabled or disabled.
		boolean isEnabled4 = additionalChargesCGSTField.isEnabled();
		assertTrue(isEnabled4, "additionalChargesCGSTField is enabled");
		boolean isDisabled4 = !additionalChargesCGSTField.isEnabled();
		assertFalse(isDisabled4, "additionalChargesCGSTField is not enabled");

		// verifying additionalChargesCGSTField field is displayed or hidden.
		boolean isDisplayed4 = additionalChargesCGSTField.isDisplayed();
		assertTrue(isDisplayed4);
		boolean isHidden4 = !additionalChargesCGSTField.isDisplayed();
		assertFalse(isHidden4);

		// verifying additionalChargesCGSTField field Selected or unselected
		boolean isSelected4 = additionalChargesCGSTField.isSelected();
		assertFalse(isSelected4);
		boolean isDeselected4 = !additionalChargesCGSTField.isSelected();
		assertTrue(isDeselected4);

		// 5verifying additionalChargesCGSTField field is Enabled or disabled.
		boolean isEnabled5 = additionalChargesCGSTField.isEnabled();
		assertTrue(isEnabled5, "additionalChargesCGSTField is enabled");
		boolean isDisabled5 = !additionalChargesCGSTField.isEnabled();
		assertFalse(isDisabled5, "additionalChargesCGSTField is not enabled");

		// verifying additionalChargesCGSTField field is displayed or hidden.
		boolean isDisplayed5 = additionalChargesCGSTField.isDisplayed();
		assertTrue(isDisplayed5);
		boolean isHidden5 = !additionalChargesCGSTField.isDisplayed();
		assertFalse(isHidden5);

		// verifying additionalChargesCGSTField field Selected or unselected
		boolean isSelected5 = additionalChargesCGSTField.isSelected();
		assertFalse(isSelected5);
		boolean isDeselected5 = !additionalChargesCGSTField.isSelected();
		assertTrue(isDeselected5);

		// 6verifying additionalChargesSGSTField field is Enabled or disabled.
		boolean isEnabled6 = additionalChargesSGSTField.isEnabled();
		assertTrue(isEnabled6, "additionalChargesSGSTField is enabled");
		boolean isDisabled6 = !additionalChargesSGSTField.isEnabled();
		assertFalse(isDisabled6, "additionalChargesSGSTField is not enabled");

		// verifying additionalChargesSGSTField field is displayed or hidden.
		boolean isDisplayed6 = additionalChargesSGSTField.isDisplayed();
		assertTrue(isDisplayed6);
		boolean isHidden6 = !additionalChargesSGSTField.isDisplayed();
		assertFalse(isHidden6);

		// verifying additionalChargesSGSTField field Selected or unselected
		boolean isSelected6 = additionalChargesSGSTField.isSelected();
		assertFalse(isSelected6);
		boolean isDeselected6 = !additionalChargesSGSTField.isSelected();
		assertTrue(isDeselected6);

		// 7verifying descriptionTextField field is Enabled or disabled.
		boolean isEnabled7 = descriptionTextField.isEnabled();
		assertTrue(isEnabled7, "descriptionTextField is enabled");
		boolean isDisabled7 = !descriptionTextField.isEnabled();
		assertFalse(isDisabled7, "descriptionTextField is not enabled");

		// verifying descriptionTextField field is displayed or hidden.
		boolean isDisplayed7 = descriptionTextField.isDisplayed();
		assertTrue(isDisplayed7);
		boolean isHidden7 = !descriptionTextField.isDisplayed();
		assertFalse(isHidden7);

		// verifying descriptionTextField field Selected or unselected
		boolean isSelected7 = descriptionTextField.isSelected();
		assertFalse(isSelected7);
		boolean isDeselected7 = !descriptionTextField.isSelected();
		assertTrue(isDeselected7);

		// 6verifying remarksTextField field is Enabled or disabled.
		boolean isEnabled8 = remarksTextField.isEnabled();
		assertTrue(isEnabled8, "remarksTextField is enabled");
		boolean isDisabled8 = !remarksTextField.isEnabled();
		assertFalse(isDisabled8, "remarksTextField is not enabled");

		// verifying remarksTextField field is displayed or hidden.
		boolean isDisplayed8 = remarksTextField.isDisplayed();
		assertTrue(isDisplayed8);
		boolean isHidden8 = !remarksTextField.isDisplayed();
		assertFalse(isHidden8);

		// verifying remarksTextField field Selected or unselected
		boolean isSelected8 = remarksTextField.isSelected();
		assertFalse(isSelected8);
		boolean isDeselected8 = !remarksTextField.isSelected();
		assertTrue(isDeselected8);

		// 6verifying that Save Button is Enabled or disabled.
		boolean isEnabled9 = saveButton.isEnabled();
		assertTrue(isEnabled9, "saveButton is enabled");
		boolean isDisabled9 = !saveButton.isEnabled();
		assertFalse(isDisabled9, "saveButton is not enabled");

		// verifying that Save Button is displayed or hidden.
		boolean isDisplayed9 = saveButton.isDisplayed();
		assertTrue(isDisplayed9);
		boolean isHidden9 = !saveButton.isDisplayed();
		assertFalse(isHidden9);

		additionalChargesNameTestField.clear();
		additionalChargesNameTestField.sendKeys(name);
		additionalChargesAmountField.clear();
		additionalChargesAmountField.sendKeys(amount);
		additionalChargesIGSTField.clear();
		additionalChargesIGSTField.sendKeys(igst);
		additionalChargesCGSTField.clear();
		additionalChargesCGSTField.sendKeys(cgst);
		additionalChargesSGSTField.clear();
		additionalChargesSGSTField.sendKeys(sgst);
		additionalChargesUTGSTField.clear();
		additionalChargesUTGSTField.sendKeys(utgst);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		saveButton.click();

		return new HomePage();
	}

	public HomePage additionalChargesEdit(String amount, String igst, String cgst, String sgst, String utgst,
			String description, String remarks) {

		// verifying createadditionalCharges field Displayed or not
		boolean isDisplayed = editButton.isDisplayed();
		assertTrue(isDisplayed);
		boolean isHidden = !editButton.isDisplayed();
		assertFalse(isHidden);

		// verifying createadditionalCharges field Selected or unselected
		boolean isSelected = editButton.isSelected();
		assertFalse(isSelected);
		boolean isDeselected = !editButton.isSelected();
		assertTrue(isDeselected);

		editButton.click();

		// 2verifying AdditionalChargesAmountField field is Enabled or disabled.
		boolean isEnabled2 = additionalChargesAmountField.isEnabled();
		assertTrue(isEnabled2, "AdditionalChargesAmountField is enabled");
		boolean isDisabled2 = !additionalChargesAmountField.isEnabled();
		assertFalse(isDisabled2, "AdditionalChargesAmountField is not enabled");

		// verifying AdditionalChargesAmountField field is displayed or hidden.
		boolean isDisplayed2 = additionalChargesAmountField.isDisplayed();
		assertTrue(isDisplayed2);
		boolean isHidden2 = !additionalChargesAmountField.isDisplayed();
		assertFalse(isHidden2);

		// verifying AdditionalChargesAmountField field Selected or unselected
		boolean isSelected2 = additionalChargesAmountField.isSelected();
		assertFalse(isSelected2);
		boolean isDeselected2 = !additionalChargesAmountField.isSelected();
		assertTrue(isDeselected2);

		// 3verifying additionalChargesIGSTField field is Enabled or disabled.
		boolean isEnabled3 = additionalChargesIGSTField.isEnabled();
		assertTrue(isEnabled3, "additionalChargesIGSTField is enabled");
		boolean isDisabled3 = !additionalChargesIGSTField.isEnabled();
		assertFalse(isDisabled3, "additionalChargesIGSTField is not enabled");

		// verifying additionalChargesIGSTField field is displayed or hidden.
		boolean isDisplayed3 = additionalChargesIGSTField.isDisplayed();
		assertTrue(isDisplayed3);
		boolean isHidden3 = !additionalChargesIGSTField.isDisplayed();
		assertFalse(isHidden3);

		// verifying additionalChargesIGSTField field Selected or unselected
		boolean isSelected3 = additionalChargesIGSTField.isSelected();
		assertFalse(isSelected3);
		boolean isDeselected3 = !additionalChargesIGSTField.isSelected();
		assertTrue(isDeselected3);

		// 4verifying additionalChargesCGSTField field is Enabled or disabled.
		boolean isEnabled4 = additionalChargesCGSTField.isEnabled();
		assertTrue(isEnabled4, "additionalChargesCGSTField is enabled");
		boolean isDisabled4 = !additionalChargesCGSTField.isEnabled();
		assertFalse(isDisabled4, "additionalChargesCGSTField is not enabled");

		// verifying additionalChargesCGSTField field is displayed or hidden.
		boolean isDisplayed4 = additionalChargesCGSTField.isDisplayed();
		assertTrue(isDisplayed4);
		boolean isHidden4 = !additionalChargesCGSTField.isDisplayed();
		assertFalse(isHidden4);

		// verifying additionalChargesCGSTField field Selected or unselected
		boolean isSelected4 = additionalChargesCGSTField.isSelected();
		assertFalse(isSelected4);
		boolean isDeselected4 = !additionalChargesCGSTField.isSelected();
		assertTrue(isDeselected4);

		// 5verifying additionalChargesCGSTField field is Enabled or disabled.
		boolean isEnabled5 = additionalChargesCGSTField.isEnabled();
		assertTrue(isEnabled5, "additionalChargesCGSTField is enabled");
		boolean isDisabled5 = !additionalChargesCGSTField.isEnabled();
		assertFalse(isDisabled5, "additionalChargesCGSTField is not enabled");

		// verifying additionalChargesCGSTField field is displayed or hidden.
		boolean isDisplayed5 = additionalChargesCGSTField.isDisplayed();
		assertTrue(isDisplayed5);
		boolean isHidden5 = !additionalChargesCGSTField.isDisplayed();
		assertFalse(isHidden5);

		// verifying additionalChargesCGSTField field Selected or unselected
		boolean isSelected5 = additionalChargesCGSTField.isSelected();
		assertFalse(isSelected5);
		boolean isDeselected5 = !additionalChargesCGSTField.isSelected();
		assertTrue(isDeselected5);

		// 6verifying additionalChargesSGSTField field is Enabled or disabled.
		boolean isEnabled6 = additionalChargesSGSTField.isEnabled();
		assertTrue(isEnabled6, "additionalChargesSGSTField is enabled");
		boolean isDisabled6 = !additionalChargesSGSTField.isEnabled();
		assertFalse(isDisabled6, "additionalChargesSGSTField is not enabled");

		// verifying additionalChargesSGSTField field is displayed or hidden.
		boolean isDisplayed6 = additionalChargesSGSTField.isDisplayed();
		assertTrue(isDisplayed6);
		boolean isHidden6 = !additionalChargesSGSTField.isDisplayed();
		assertFalse(isHidden6);

		// verifying additionalChargesSGSTField field Selected or unselected
		boolean isSelected6 = additionalChargesSGSTField.isSelected();
		assertFalse(isSelected6);
		boolean isDeselected6 = !additionalChargesSGSTField.isSelected();
		assertTrue(isDeselected6);

		// 7verifying descriptionTextField field is Enabled or disabled.
		boolean isEnabled7 = descriptionTextField.isEnabled();
		assertTrue(isEnabled7, "descriptionTextField is enabled");
		boolean isDisabled7 = !descriptionTextField.isEnabled();
		assertFalse(isDisabled7, "descriptionTextField is not enabled");

		// verifying descriptionTextField field is displayed or hidden.
		boolean isDisplayed7 = descriptionTextField.isDisplayed();
		assertTrue(isDisplayed7);
		boolean isHidden7 = !descriptionTextField.isDisplayed();
		assertFalse(isHidden7);

		// verifying descriptionTextField field Selected or unselected
		boolean isSelected7 = descriptionTextField.isSelected();
		assertFalse(isSelected7);
		boolean isDeselected7 = !descriptionTextField.isSelected();
		assertTrue(isDeselected7);

		// 6verifying remarksTextField field is Enabled or disabled.
		boolean isEnabled8 = remarksTextField.isEnabled();
		assertTrue(isEnabled8, "remarksTextField is enabled");
		boolean isDisabled8 = !remarksTextField.isEnabled();
		assertFalse(isDisabled8, "remarksTextField is not enabled");

		// verifying remarksTextField field is displayed or hidden.
		boolean isDisplayed8 = remarksTextField.isDisplayed();
		assertTrue(isDisplayed8);
		boolean isHidden8 = !remarksTextField.isDisplayed();
		assertFalse(isHidden8);

		// verifying remarksTextField field Selected or unselected
		boolean isSelected8 = remarksTextField.isSelected();
		assertFalse(isSelected8);
		boolean isDeselected8 = !remarksTextField.isSelected();
		assertTrue(isDeselected8);

		// 6verifying that Save Button is Enabled or disabled.
		boolean isEnabled9 = saveButton.isEnabled();
		assertTrue(isEnabled9, "saveButton is enabled");
		boolean isDisabled9 = !saveButton.isEnabled();
		assertFalse(isDisabled9, "saveButton is not enabled");

		// verifying that Save Button is displayed or hidden.
		boolean isDisplayed9 = saveButton.isDisplayed();
		assertTrue(isDisplayed9);
		boolean isHidden9 = !saveButton.isDisplayed();
		assertFalse(isHidden9);

		additionalChargesAmountField.clear();
		additionalChargesAmountField.sendKeys(amount);
		additionalChargesIGSTField.clear();
		additionalChargesIGSTField.sendKeys(igst);
		additionalChargesCGSTField.clear();
		additionalChargesCGSTField.sendKeys(cgst);
		additionalChargesSGSTField.clear();
		additionalChargesSGSTField.sendKeys(sgst);
		additionalChargesUTGSTField.clear();
		additionalChargesUTGSTField.sendKeys(utgst);
		descriptionTextField.clear();
		descriptionTextField.sendKeys(description);
		remarksTextField.clear();
		remarksTextField.sendKeys(remarks);
		saveButton.click();
		yesButton.click();

		return new HomePage();
	}
}
