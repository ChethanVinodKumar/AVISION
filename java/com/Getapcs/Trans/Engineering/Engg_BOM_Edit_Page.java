package com.Getapcs.Trans.Engineering;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;;

public class Engg_BOM_Edit_Page extends TestBase {

	// Item Tab
	@FindBy(xpath = "(//td[@class='active_status_color'])[1]")
	WebElement clickForUpdateChildItem;

	@FindBy(xpath = "//label[normalize-space(text())='Item Number']/following-sibling::div/input[@formcontrolname='itemNumber']")
	WebElement itemNumberElement;

	@FindBy(xpath = "//label[contains(text(), 'Item Description')]/following-sibling::textarea")
	WebElement itemDescriptionElement;

	@FindBy(xpath = "//label[normalize-space(text())='Item Type']/following-sibling::div/input[@formcontrolname='itemType']")
	WebElement itemTypeElement;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement activeStatusToggleButton;

	@FindBy(xpath = "//input[@formcontrolname='itemNoDesc']")
	WebElement itemNumberForChildItem;
	@FindBy(xpath = "//span[normalize-space()='88844455-Test Description']")
	WebElement itemNumberForChildItemDataSeelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityField;

	@FindBy(xpath = "//input[@placeholder='Enter Scrap Allowance']")
	WebElement scarpAllowanceField;

	@FindBy(xpath = "//textarea[@placeholder='Enter Remarks']")
	WebElement remarkField;

	@FindBy(xpath = "//label[normalize-space(text())='Item Type']/following-sibling::div/input[@formcontrolname='childItemType']")
	WebElement childItemTypeElement;

	@FindBy(xpath = "//label[normalize-space(text())='UOM']/following-sibling::div/input[@formcontrolname='uom']")
	WebElement uOMElement;

	@FindBy(xpath = "//label[normalize-space(text())='Version']/following-sibling::div/input[@formcontrolname='version']")
	WebElement versionElement;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement childItemToggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement updateChildItemButton;

	// Alternates Tab

	@FindBy(linkText = "Alternates")
	WebElement alternatesTab;

	@FindBy(xpath = "//td[normalize-space()='88844455']")
	WebElement clickForUpdateAlternateTab;

	@FindBy(xpath = "//input[@formcontrolname='alterItemNoDesc']")
	WebElement alternateItemNumberDropDown;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement alternateItemDropDownDataSeelect;

	@FindBy(xpath = "//label[normalize-space(text())='UOM']/following-sibling::div/input[@formcontrolname='alterUom']")
	WebElement alternateUOMElement;

	@FindBy(xpath = "//input[@placeholder='Enter Version']")
	WebElement versionField;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement customerNameField;

	@FindBy(xpath = "(//div[normalize-space()='Srikanth Reddy'])[1]")
	WebElement customerNameFieldDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityPerFeild;

	@FindBy(xpath = "//input[@placeholder='Enter Probability of Usage']")
	WebElement probabilityofUsageField;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement alternateitemNumberDropDown;
	@FindBy(xpath = "//span[normalize-space()='66334321']")
	WebElement alternateitemNumberDropDownDataSeelect;

	@FindBy(xpath = "//textarea[@placeholder='Enter Remarks']")
	WebElement alternateRemarkField;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement alternateActiveToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	WebElement alternateUpdateButton;

	// NRE \ Consumable Tab
	@FindBy(xpath = "//td[normalize-space()='88844455']")
	WebElement clickForUpdateNRETab;

	@FindBy(xpath = "//a[contains(text(),'NRE \\ Consumable')]")
	WebElement nreOrConsumableTab;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement itemNumberDropDowninNRE;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement itemNumberDropDowninNREDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityFieldInNRE;

	@FindBy(xpath = "//input[@placeholder='Enter Cost']")
	WebElement costFieldInNRE;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	WebElement nREUpdateButton;

	@FindBy(xpath = "//input[@placeholder='Upload Items']")
	WebElement fileUploadInBomCreate;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement fileCloseButton;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//input[@id='minor'])[1]")
	WebElement minor;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
	WebElement save;

	public Engg_BOM_Edit_Page() {
		PageFactory.initElements(driver, this);
	}

	public HomePage enggBomEdit(String quantity, String scarpAllowance, String remark, String version,
			String quantityPer, String probability, String alternateRemark, String quantityNRE, String cost)
			throws Throwable {

//      activeStatusToggleButton.click();
//      activeStatusToggleButton.click();

		// ############## Child Item Tab ################
		js.executeScript("arguments[0].click();", clickForUpdateChildItem);

		// 1Verifying that Quality Field is Enabled or not
		boolean isEnabledQualityField = quantityField.isEnabled();
		assertTrue(isEnabledQualityField);
		boolean isDisabledQualityFieldn = !quantityField.isEnabled();
		assertFalse(isDisabledQualityFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedQualityField = quantityField.isDisplayed();
		assertTrue(isDisplayedQualityField);
		boolean isHiddenQualityField = !quantityField.isDisplayed();
		assertFalse(isHiddenQualityField);
		quantityField.clear();
		quantityField.sendKeys(quantity);

		// 1Verifying that ScrapAllowance Field is Enabled or not
		boolean isEnabledScrapAllowanceField = scarpAllowanceField.isEnabled();
		assertTrue(isEnabledScrapAllowanceField);
		boolean isDisabledScrapAllowanceFieldn = !scarpAllowanceField.isEnabled();
		assertFalse(isDisabledScrapAllowanceFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedScrapAllowanceField = scarpAllowanceField.isDisplayed();
		assertTrue(isDisplayedScrapAllowanceField);
		boolean isHiddenScrapAllowanceField = !scarpAllowanceField.isDisplayed();
		assertFalse(isHiddenScrapAllowanceField);
		scarpAllowanceField.clear();
		scarpAllowanceField.sendKeys(scarpAllowance);

		// 1Verifying that Remarks Field is Enabled or not
		boolean isEnabledRemarksField = remarkField.isEnabled();
		assertTrue(isEnabledRemarksField);
		boolean isDisabledRemarksFieldn = !remarkField.isEnabled();
		assertFalse(isDisabledRemarksFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedRemarksField = remarkField.isDisplayed();
		assertTrue(isDisplayedRemarksField);
		boolean isHiddenRemarksField = !remarkField.isDisplayed();
		assertFalse(isHiddenRemarksField);
		remarkField.clear();
		remarkField.sendKeys(remark);

//		boolean isDisplayedItemTypeChildItemsField = childItemTypeElement.isDisplayed();
//		assertTrue(isDisplayedItemTypeChildItemsField);
//		String childItemTypeElementValue = (String) js.executeScript("return arguments[0].value;",
//				childItemTypeElement);
//		System.out.println("Child Item Type : " + childItemTypeElementValue + "\n");
//
//		// Verifying that UOM Field is displayed or hidden.
//		boolean isDisplayedUOMField = uOMElement.isDisplayed();
//		assertTrue(isDisplayedUOMField);
//		String uOMElementValue = (String) js.executeScript("return arguments[0].value;", uOMElement);
//		System.out.println("UOM : " + uOMElementValue + "\n");
//
//		// Verifying that Version Field is displayed or hidden.
//		boolean isDisplayedVersionField = versionElement.isDisplayed();
//		assertTrue(isDisplayedVersionField);
//		String versionElementValue = (String) js.executeScript("return arguments[0].value;", versionElement);
//		System.out.println("Version : " + versionElementValue + "\n");

//		childItemToggleButton.click();
//		childItemToggleButton.click();

		click(driver, updateChildItemButton);

//		// Alternate Tab
		click(driver, alternatesTab);
		Thread.sleep(2000);
//		clickForUpdateAlternateTab.click();

		/*
		 * alternateItemNumberDropDown.clear(); alternateItemNumberDropDown.click();
		 * alternateItemDropDownDataSeelect.click();
		 * 
		 * //Verifying that UOM Field is displayed or hidden. boolean
		 * isDisplayedUOMField1 = alternateUOMElement.isDisplayed();
		 * assertTrue(isDisplayedUOMField1); String alternateUOMElementValue = (String)
		 * js.executeScript( "return arguments[0].value;", alternateUOMElement );
		 * System.out.println("Alternate Tab UOM : " + alternateUOMElementValue+"\n");
		 * 
		 * 
		 * 
		 * //1Verifying that VersionAlternates Field is Enabled or not boolean
		 * isEnabledVersionAlternatesField = versionField.isEnabled();
		 * assertTrue(isEnabledVersionAlternatesField); boolean
		 * isDisabledVersionAlternatesFieldn = !versionField.isEnabled();
		 * assertFalse(isDisabledVersionAlternatesFieldn);
		 * 
		 * //Verifying that VersionAlternates Field is displayed or hidden. boolean
		 * isDisplayedVersionAlternatesField = versionField.isDisplayed();
		 * assertTrue(isDisplayedVersionAlternatesField); boolean
		 * isHiddenVersionAlternatesField = !versionField.isDisplayed();
		 * assertFalse(isHiddenVersionAlternatesField); versionField.clear();
		 * versionField.sendKeys(version);
		 * 
		 * customerNameField.click(); customerNameFieldDataSelect.click();
		 * 
		 * //1Verifying that QualityPer Field is Enabled or not boolean
		 * isEnabledQualityPerField = quantityPerFeild.isEnabled();
		 * assertTrue(isEnabledQualityPerField); boolean isDisabledQualityPerFieldn =
		 * !quantityPerFeild.isEnabled(); assertFalse(isDisabledQualityPerFieldn);
		 * 
		 * //Verifying that QualityPer Field is displayed or hidden. boolean
		 * isDisplayedQualityPerField = quantityPerFeild.isDisplayed();
		 * assertTrue(isDisplayedQualityPerField); boolean isHiddenQualityPerField =
		 * !quantityPerFeild.isDisplayed(); assertFalse(isHiddenQualityPerField);
		 * quantityPerFeild.clear(); quantityPerFeild.sendKeys(quantityPer);
		 * 
		 * 
		 * //1Verifying that ProbabilityofUsage Field is Enabled or not boolean
		 * isEnabledProbabilityofUsageField = probabilityofUsageField.isEnabled();
		 * assertTrue(isEnabledProbabilityofUsageField); boolean
		 * isDisabledProbabilityofUsageFieldn = !probabilityofUsageField.isEnabled();
		 * assertFalse(isDisabledProbabilityofUsageFieldn);
		 * 
		 * //Verifying that ProbabilityofUsage Field is displayed or hidden. boolean
		 * isDisplayedProbabilityofUsageField = probabilityofUsageField.isDisplayed();
		 * assertTrue(isDisplayedProbabilityofUsageField); boolean
		 * isHiddenProbabilityofUsageField = !probabilityofUsageField.isDisplayed();
		 * assertFalse(isHiddenProbabilityofUsageField);
		 * probabilityofUsageField.clear();
		 * probabilityofUsageField.sendKeys(probability);
		 * 
		 * alternateitemNumberDropDown.click();
		 * alternateitemNumberDropDownDataSeelect.click();
		 */

//		// 1Verifying that RemarksAlternates Field is Enabled or not
//		boolean isEnabledRemarksAlternatesField = alternateRemarkField.isEnabled();
//		assertTrue(isEnabledRemarksAlternatesField);
//		boolean isDisabledRemarksAlternatesFieldn = !alternateRemarkField.isEnabled();
//		assertFalse(isDisabledRemarksAlternatesFieldn);
//
//		// Verifying that RemarksAlternates Field is displayed or hidden.
//		boolean isDisplayedRemarksAlternatesField = alternateRemarkField.isDisplayed();
//		assertTrue(isDisplayedRemarksAlternatesField);
//		boolean isHiddenRemarksAlternatesField = !alternateRemarkField.isDisplayed();
//		assertFalse(isHiddenRemarksAlternatesField);
//		alternateRemarkField.clear();
//		alternateRemarkField.sendKeys(alternateRemark);
//
//		alternateActiveToggleButton.click();
//		alternateActiveToggleButton.click();
//
//		alternateUpdateButton.click();
//
//		// NRE / Consumable Tab
		click(driver, nreOrConsumableTab);
		Thread.sleep(2000);
//
//		clickForUpdateNRETab.click();
//
//		itemNumberDropDowninNRE.click();
//		itemNumberDropDowninNREDataSelect.click();
//
//		// 1Verifying that QualityNRE Field is Enabled or not
//		boolean isEnabledQualityNREField = quantityFieldInNRE.isEnabled();
//		assertTrue(isEnabledQualityNREField);
//		boolean isDisabledQualityNREFieldn = !quantityFieldInNRE.isEnabled();
//		assertFalse(isDisabledQualityNREFieldn);
//
//		// Verifying that QualityNRE Field is displayed or hidden.
//		boolean isDisplayedQualityNREField = quantityFieldInNRE.isDisplayed();
//		assertTrue(isDisplayedQualityNREField);
//		boolean isHiddenQualityNREField = !quantityFieldInNRE.isDisplayed();
//		assertFalse(isHiddenQualityNREField);
//
//		quantityFieldInNRE.sendKeys(quantityNRE);
//
//		// 1Verifying that Cost Field is Enabled or not
//		boolean isEnabledCostField = costFieldInNRE.isEnabled();
//		assertTrue(isEnabledCostField);
//		boolean isDisabledCostFieldn = !costFieldInNRE.isEnabled();
//		assertFalse(isDisabledCostFieldn);
//
//		// Verifying that Cost Field is displayed or hidden.
//		boolean isDisplayedCostField = costFieldInNRE.isDisplayed();
//		assertTrue(isDisplayedCostField);
//		boolean isHiddenCostField = !costFieldInNRE.isDisplayed();
//		assertFalse(isHiddenCostField);
//		costFieldInNRE.clear();
//		costFieldInNRE.sendKeys(cost);
//
//		nREUpdateButton.click();
		click(driver, saveButton);
		click(driver, minor);
		click(driver, save);
		return new HomePage();

	}

}
