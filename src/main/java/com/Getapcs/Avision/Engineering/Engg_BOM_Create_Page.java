package com.Getapcs.Avision.Engineering;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class Engg_BOM_Create_Page extends TestBase {

	@FindBy(xpath = "(//input[@autocorrect='off'])[1]")
	WebElement itemNumberForItem;

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

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addChildItemButton;

	// Alternates Tab
	@FindBy(linkText = "Alternates")
	WebElement alternatesTab;

	@FindBy(xpath = "//input[@formcontrolname='alterItemNoDesc']")
	WebElement alternateItemDropDown;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement alternateItemDropDownDataSeelect;

	@FindBy(xpath = "//label[normalize-space(text())='UOM']/following-sibling::div/input[@formcontrolname='alterUom']")
	WebElement alternateUOMElement;

	@FindBy(xpath = "//input[@placeholder='Enter Version']")
	WebElement versionField;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement customerNameField;

	@FindBy(xpath = "(//span[normalize-space()='Avision Systems Pvt Ltd'])[1]")
	WebElement customerNameFieldDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityPerFeild;

	@FindBy(xpath = "//input[@placeholder='Enter Probability of Usage']")
	WebElement probabilityofUsageField;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement alternateitemNumberDropDown;
	@FindBy(xpath = "//span[normalize-space()='76543456']")
	WebElement alternateitemNumberDropDownDataSeelect;

	@FindBy(xpath = "//textarea[@placeholder='Enter Remarks']")
	WebElement alternateRemarkField;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement alternateActiveToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement alternateAddButton;

	// NRE \ Consumable Tab
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-engg-bom[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")
	WebElement nreOrConsumableTab;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement itemNumberDropDowninNRE;
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	WebElement itemNumberDropDowninNREDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityFieldInNRE;

	@FindBy(xpath = "//input[@placeholder='Enter Cost']")
	WebElement costFieldInNRE;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addButtonInNRE;

	@FindBy(xpath = "//input[@placeholder='Upload Items']")
	WebElement fileUploadInBomCreate;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement fileCloseButton;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement closeButton;

	public Engg_BOM_Create_Page() {
		PageFactory.initElements(driver, this);

	}

	public HomePage bomCreate(String quantity, String scarpAllowance, String remark, String version, String quantityPer,
			String probability, String alternateRemark, String quantityNRE, String cost) throws Throwable {

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/item-master/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumber);

		System.out.println(updatedXpath);

		// *******************//

		String tableXpath2 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ItemNum = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", ItemNum + "-Test Description");

		System.out.println(updatedXpath1);

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/engg-bom/create");

		// Item Number

		// Verify that itemNumber Field is Displayed or not
		boolean isDisableditemNumberFieldn = !itemNumberForItem.isDisplayed();
		Assert.assertFalse(isDisableditemNumberFieldn);

		js.executeScript("arguments[0].scrollIntoView(true);", itemNumberForItem);
		Thread.sleep(5000);
		click(driver, itemNumberForItem);

		// Verify that itemNumber Field is clickable or not
		WebElement itemNumberFieldFocusedElement = driver.switchTo().activeElement();
		boolean itemNumberFieldIsSelected = itemNumberFieldFocusedElement.equals(itemNumberForItem);
		Assert.assertTrue(itemNumberFieldIsSelected, "itemNumber Text Field is not Selected");

		WebElement itemNumberDropDownDataSelect = driver.findElement(By.xpath(updatedXpath));
		js.executeScript("arguments[0].click();", itemNumberDropDownDataSelect);

		// Verifying that ItemDescription Field is displayed or hidden.
		boolean isDisplayedItemDescriptionField = itemDescriptionElement.isDisplayed();
		assertTrue(isDisplayedItemDescriptionField);
		String itemDescriptionElementText = itemDescriptionElement.getText().trim();
		System.out.println("Item Description : " + itemDescriptionElementText + "\n");

		// Verifying that Item Type Field is displayed or hidden.
		boolean isDisplayedItemTypeField = itemTypeElement.isDisplayed();
		assertTrue(isDisplayedItemTypeField);
		String itemTypeElementValue = (String) js.executeScript("return arguments[0].value;", itemTypeElement);
		System.out.println("Item Type : " + itemTypeElementValue + "\n");

//       activeStatusToggleButton.click();
//       activeStatusToggleButton.click();

		// ############## Child Item Tab ################

		// Verify that itemNumber Field is Displayed or not
		boolean isDisableditemNumberChildItem = !itemNumberForChildItem.isDisplayed();
		Assert.assertFalse(isDisableditemNumberChildItem);

		js.executeScript("arguments[0].scrollIntoView(true);", itemNumberForChildItem);
		Thread.sleep(5000);
		itemNumberForChildItem.click();
		itemNumberForChildItem.sendKeys(ItemNum);

		// Verify that itemNumber Field is clickable or not
		WebElement iitemNumberChildItemFocusedElement = driver.switchTo().activeElement();
		boolean itemNumberChildItemIsSelected = iitemNumberChildItemFocusedElement.equals(itemNumberForChildItem);
		Assert.assertTrue(itemNumberChildItemIsSelected, "itemNumber Text Field is not Selected");

		WebElement itemNumberForChildItemDataSelect = driver.findElement(By.xpath(updatedXpath1));
		js.executeScript("arguments[0].click();", itemNumberForChildItemDataSelect);

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

		remarkField.sendKeys(remark);

		boolean isDisplayedItemTypeChildItemsField = childItemTypeElement.isDisplayed();
		assertTrue(isDisplayedItemTypeChildItemsField);
		String childItemTypeElementValue = (String) js.executeScript("return arguments[0].value;",
				childItemTypeElement);
		System.out.println("Child Item Type : " + childItemTypeElementValue + "\n");

		// Verifying that UOM Field is displayed or hidden.
		boolean isDisplayedUOMField = uOMElement.isDisplayed();
		assertTrue(isDisplayedUOMField);
		String uOMElementValue = (String) js.executeScript("return arguments[0].value;", uOMElement);
		System.out.println("UOM : " + uOMElementValue + "\n");

		// Verifying that Version Field is displayed or hidden.
		boolean isDisplayedVersionField = versionElement.isDisplayed();
		assertTrue(isDisplayedVersionField);
		String versionElementValue = (String) js.executeScript("return arguments[0].value;", versionElement);
		System.out.println("Version : " + versionElementValue + "\n");

		childItemToggleButton.click();
		childItemToggleButton.click();

		addChildItemButton.click();

		alternatesTab.click();

		alternateItemDropDown.click();
		alternateItemDropDownDataSeelect.click();

		// Verifying that UOM Field is displayed or hidden.
		boolean isDisplayedUOMField1 = alternateUOMElement.isDisplayed();
		assertTrue(isDisplayedUOMField1);
		String alternateUOMElementValue = (String) js.executeScript("return arguments[0].value;", alternateUOMElement);
		System.out.println("Alternate Tab UOM : " + alternateUOMElementValue + "\n");

		// 1Verifying that VersionAlternates Field is Enabled or not
		boolean isEnabledVersionAlternatesField = versionField.isEnabled();
		assertTrue(isEnabledVersionAlternatesField);
		boolean isDisabledVersionAlternatesFieldn = !versionField.isEnabled();
		assertFalse(isDisabledVersionAlternatesFieldn);

		// Verifying that VersionAlternates Field is displayed or hidden.
		boolean isDisplayedVersionAlternatesField = versionField.isDisplayed();
		assertTrue(isDisplayedVersionAlternatesField);
		boolean isHiddenVersionAlternatesField = !versionField.isDisplayed();
		assertFalse(isHiddenVersionAlternatesField);

		versionField.sendKeys(version);

		customerNameField.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click();", customerNameFieldDataSelect);

		// 1Verifying that QualityPer Field is Enabled or not
		boolean isEnabledQualityPerField = quantityPerFeild.isEnabled();
		assertTrue(isEnabledQualityPerField);
		boolean isDisabledQualityPerFieldn = !quantityPerFeild.isEnabled();
		assertFalse(isDisabledQualityPerFieldn);

		// Verifying that QualityPer Field is displayed or hidden.
		boolean isDisplayedQualityPerField = quantityPerFeild.isDisplayed();
		assertTrue(isDisplayedQualityPerField);
		boolean isHiddenQualityPerField = !quantityPerFeild.isDisplayed();
		assertFalse(isHiddenQualityPerField);

		quantityPerFeild.sendKeys(quantityPer);

		// 1Verifying that ProbabilityofUsage Field is Enabled or not
		boolean isEnabledProbabilityofUsageField = probabilityofUsageField.isEnabled();
		assertTrue(isEnabledProbabilityofUsageField);
		boolean isDisabledProbabilityofUsageFieldn = !probabilityofUsageField.isEnabled();
		assertFalse(isDisabledProbabilityofUsageFieldn);

		// Verifying that ProbabilityofUsage Field is displayed or hidden.
		boolean isDisplayedProbabilityofUsageField = probabilityofUsageField.isDisplayed();
		assertTrue(isDisplayedProbabilityofUsageField);
		boolean isHiddenProbabilityofUsageField = !probabilityofUsageField.isDisplayed();
		assertFalse(isHiddenProbabilityofUsageField);

		probabilityofUsageField.sendKeys(probability);

		alternateitemNumberDropDown.click();
		alternateitemNumberDropDownDataSeelect.click();

//		WebElement RemarksAlternates = driver.findElement(By.xpath("//textarea[@placeholder='Enter Remarks']"));

		// 1Verifying that RemarksAlternates Field is Enabled or not
		boolean isEnabledRemarksAlternatesField = alternateRemarkField.isEnabled();
		assertTrue(isEnabledRemarksAlternatesField);
		boolean isDisabledRemarksAlternatesFieldn = !alternateRemarkField.isEnabled();
		assertFalse(isDisabledRemarksAlternatesFieldn);

		// Verifying that RemarksAlternates Field is displayed or hidden.
		boolean isDisplayedRemarksAlternatesField = alternateRemarkField.isDisplayed();
		assertTrue(isDisplayedRemarksAlternatesField);
		boolean isHiddenRemarksAlternatesField = !alternateRemarkField.isDisplayed();
		assertFalse(isHiddenRemarksAlternatesField);

		alternateRemarkField.sendKeys(alternateRemark);

		alternateActiveToggleButton.click();
		alternateActiveToggleButton.click();

		alternateAddButton.click();

		nreOrConsumableTab.click();

		itemNumberDropDowninNRE.click();
		itemNumberDropDowninNREDataSelect.click();

		// 1Verifying that QualityNRE Field is Enabled or not
		boolean isEnabledQualityNREField = quantityFieldInNRE.isEnabled();
		assertTrue(isEnabledQualityNREField);
		boolean isDisabledQualityNREFieldn = !quantityFieldInNRE.isEnabled();
		assertFalse(isDisabledQualityNREFieldn);

		// Verifying that QualityNRE Field is displayed or hidden.
		boolean isDisplayedQualityNREField = quantityFieldInNRE.isDisplayed();
		assertTrue(isDisplayedQualityNREField);
		boolean isHiddenQualityNREField = !quantityFieldInNRE.isDisplayed();
		assertFalse(isHiddenQualityNREField);

		quantityFieldInNRE.sendKeys(quantityNRE);

//		WebElement Cost = driver.findElement(By.xpath("//input[@placeholder='Enter Cost']"));

		// 1Verifying that Cost Field is Enabled or not
		boolean isEnabledCostField = costFieldInNRE.isEnabled();
		assertTrue(isEnabledCostField);
		boolean isDisabledCostFieldn = !costFieldInNRE.isEnabled();
		assertFalse(isDisabledCostFieldn);

		// Verifying that Cost Field is displayed or hidden.
		boolean isDisplayedCostField = costFieldInNRE.isDisplayed();
		assertTrue(isDisplayedCostField);
		boolean isHiddenCostField = !costFieldInNRE.isDisplayed();
		assertFalse(isHiddenCostField);

		costFieldInNRE.sendKeys(cost);

//		WebElement AddNRE = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		addButtonInNRE.click();

//Upload File

		uploadFile(driver, fileUploadInBomCreate, 1);

		click(driver, closeButton);

		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);

		saveButton.click();

		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());

//				assertNotEquals(beforeSaveButton, afterSaveButton, "URLs are the same");
		return new HomePage();
	}

}
