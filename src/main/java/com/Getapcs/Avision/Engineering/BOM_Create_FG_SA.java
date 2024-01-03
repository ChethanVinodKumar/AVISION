package com.Getapcs.Avision.Engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class BOM_Create_FG_SA extends TestBase {

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

	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement alternateItemDropDownDataSeelect1;

	@FindBy(xpath = "//label[normalize-space(text())='UOM']/following-sibling::div/input[@formcontrolname='alterUom']")
	WebElement alternateUOMElement;

	@FindBy(xpath = "//input[@placeholder='Enter Version']")
	WebElement versionField;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement customerNameField;

	@FindBy(xpath = "(//span[normalize-space()='AVision Systems Pvt Ltd .'])[1]")
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
	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	WebElement itemNumberDropDowninNREDataSelect1;

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

	public BOM_Create_FG_SA() {
		PageFactory.initElements(driver, this);

	}

	public HomePage bomCreate(String quantity, String scarpAllowance, String remark, String version, String quantityPer,
			String probability, String alternateRemark, String quantityNRE, String cost) throws Throwable {

		System.out.println("\n" + "BOM Create For SA and FG Is Started" + "\n");

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/item-master/table");

		// ############## FG ################## //

		String tableXpath = "//table[@class='table table-striped']";

		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedFGXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumber);

		System.out.println(updatedFGXpath);

		// ############## PP ###########//

		String tableXpath2 = "//table[@class='table table-striped']";

		String ItemNum = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedPPXpath1 = elementXpath1.replace("Item-FG-11-TEST", ItemNum + "-Test Description");

		System.out.println(updatedPPXpath1);

		// ############ SA ###########//

		String tableXpath3 = "//table[@class='table table-striped']";

		String ItemNum2 = driver.findElement(By.xpath(tableXpath3 + "/tbody/tr[4]/td[2]")).getText();

		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedSAXpath12 = elementXpath2.replace("Item-FG-11-TEST", ItemNum2 + "-Test Description");

		System.out.println(updatedSAXpath12);

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/engg-bom/create");

		// Item Number

		js.executeScript("arguments[0].scrollIntoView(true);", itemNumberForItem);
		Thread.sleep(5000);
		click(driver, itemNumberForItem);
		isSelected(driver, itemNumberForItem, "itemNumberForItem");

		WebElement itemNumberDropDownDataSelect = driver.findElement(By.xpath(updatedFGXpath));
		click(driver, itemNumberDropDownDataSelect);

		dataPrintFromInputtag(driver, itemDescriptionElement, "itemDescriptionElement");

		dataPrintFromInputtag(driver, itemTypeElement, "itemTypeElement");

//       activeStatusToggleButton.click();
//       activeStatusToggleButton.click();

		// ############## Child Item Tab ################

		js.executeScript("arguments[0].scrollIntoView(true);", itemNumberForChildItem);
		Thread.sleep(3000);
		click(driver, itemNumberForChildItem);
		isSelected(driver, itemNumberForChildItem, "itemNumberForChildItem");
		itemNumberForChildItem.sendKeys(ItemNum);

		WebElement itemNumberForChildItemDataSelect = driver.findElement(By.xpath(updatedPPXpath1));
		click(driver, itemNumberForChildItemDataSelect);

		click(driver, quantityField);
		isSelected(driver, quantityField, "quantityField");
		quantityField.clear();
		quantityField.sendKeys(quantity);

		click(driver, scarpAllowanceField);
		isSelected(driver, scarpAllowanceField, "scarpAllowanceField");
		scarpAllowanceField.clear();
		scarpAllowanceField.sendKeys(scarpAllowance);

		click(driver, remarkField);
		isSelected(driver, remarkField, "remarkField");
		remarkField.clear();
		remarkField.sendKeys(remark);

		dataPrintFromInputtag(driver, childItemTypeElement, "childItemTypeElement");

		dataPrintFromInputtag(driver, uOMElement, "uOMElement");

		dataPrintFromInputtag(driver, versionElement, "versionElement");

		childItemToggleButton.click();
		childItemToggleButton.click();

		addChildItemButton.click();

		// ########################### 2nd Child-Item

		js.executeScript("arguments[0].scrollIntoView(true);", itemNumberForChildItem);
		Thread.sleep(3000);
		click(driver, itemNumberForChildItem);
		isSelected(driver, itemNumberForChildItem, "itemNumberForChildItem");
		itemNumberForChildItem.sendKeys(ItemNum2);

		WebElement itemNumberForChildItemDataSelect2 = driver.findElement(By.xpath(updatedSAXpath12));
		click(driver, itemNumberForChildItemDataSelect2);

		click(driver, quantityField);
		isSelected(driver, quantityField, "quantityField");
		quantityField.clear();
		quantityField.sendKeys(quantity);

		click(driver, scarpAllowanceField);
		isSelected(driver, scarpAllowanceField, "scarpAllowanceField");
		scarpAllowanceField.clear();
		scarpAllowanceField.sendKeys(scarpAllowance);

		click(driver, remarkField);
		isSelected(driver, remarkField, "remarkField");
		remarkField.clear();
		remarkField.sendKeys(remark);

		dataPrintFromInputtag(driver, childItemTypeElement, "childItemTypeElement");

		dataPrintFromInputtag(driver, uOMElement, "uOMElement");

		dataPrintFromInputtag(driver, versionElement, "versionElement");

		childItemToggleButton.click();
		childItemToggleButton.click();

		addChildItemButton.click();

		// ####### Alternates Tab ######

		alternatesTab.click();

		alternateItemDropDown.click();
		alternateItemDropDownDataSeelect.click();

		// Verifying that UOM Field is displayed or hidden.
		dataPrintFromInputtag(driver, alternateUOMElement, "alternateUOMElement");

		click(driver, versionField);
		isSelected(driver, versionField, "versionField");
		versionField.clear();
		versionField.sendKeys(version);

//		customerNameField.sendKeys(Keys.ENTER);
		click(driver, customerNameField);
		click(driver, customerNameFieldDataSelect);

		click(driver, quantityPerFeild);
		isSelected(driver, quantityPerFeild, "quantityPerFeild");
		quantityPerFeild.clear();
		quantityPerFeild.sendKeys(quantityPer);

		click(driver, probabilityofUsageField);
		isSelected(driver, probabilityofUsageField, "probabilityofUsageField");
		probabilityofUsageField.clear();
		probabilityofUsageField.sendKeys(probability);

		alternateitemNumberDropDown.click();
		alternateitemNumberDropDownDataSeelect.click();

		click(driver, alternateRemarkField);
		isSelected(driver, alternateRemarkField, "alternateRemarkField");
		alternateRemarkField.clear();
		alternateRemarkField.sendKeys(alternateRemark);

		alternateActiveToggleButton.click();
		alternateActiveToggleButton.click();

		alternateAddButton.click();

		// ******** 2nd Item ********

		alternateItemDropDown.click();
		alternateItemDropDownDataSeelect1.click();

		// Verifying that UOM Field is displayed or hidden.
		dataPrintFromInputtag(driver, alternateUOMElement, "alternateUOMElement");

		click(driver, versionField);
		isSelected(driver, versionField, "versionField");
		versionField.clear();
		versionField.sendKeys(version);

//		customerNameField.sendKeys(Keys.ENTER);
		click(driver, customerNameField);
		click(driver, customerNameFieldDataSelect);

		click(driver, quantityPerFeild);
		isSelected(driver, quantityPerFeild, "quantityPerFeild");
		quantityPerFeild.clear();
		quantityPerFeild.sendKeys(quantityPer);

		click(driver, probabilityofUsageField);
		isSelected(driver, probabilityofUsageField, "probabilityofUsageField");
		probabilityofUsageField.clear();
		probabilityofUsageField.sendKeys(probability);

		alternateitemNumberDropDown.click();
		alternateitemNumberDropDownDataSeelect.click();

		click(driver, alternateRemarkField);
		isSelected(driver, alternateRemarkField, "alternateRemarkField");
		alternateRemarkField.clear();
		alternateRemarkField.sendKeys(alternateRemark);

		alternateActiveToggleButton.click();
		alternateActiveToggleButton.click();

		alternateAddButton.click();

		// ########## NRE / Consumable Tab

		nreOrConsumableTab.click();

		itemNumberDropDowninNRE.click();
		itemNumberDropDowninNREDataSelect.click();

		click(driver, quantityFieldInNRE);
		isSelected(driver, quantityFieldInNRE, "quantityFieldInNRE");
		quantityFieldInNRE.clear();
		quantityFieldInNRE.sendKeys(quantityNRE);

		click(driver, costFieldInNRE);
		isSelected(driver, costFieldInNRE, "costFieldInNRE");
		costFieldInNRE.clear();
		costFieldInNRE.sendKeys(cost);

		addButtonInNRE.click();

		// ******* 2nd Item ***********

		itemNumberDropDowninNRE.click();
		itemNumberDropDowninNREDataSelect1.click();

		click(driver, quantityFieldInNRE);
		isSelected(driver, quantityFieldInNRE, "quantityFieldInNRE");
		quantityFieldInNRE.clear();
		quantityFieldInNRE.sendKeys(quantityNRE);

		click(driver, costFieldInNRE);
		isSelected(driver, costFieldInNRE, "costFieldInNRE");
		costFieldInNRE.clear();
		costFieldInNRE.sendKeys(cost);

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
