package com.Getapcs.Avision.Engineering;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class Engg_BOM_Create_Page_FOR_FG extends TestBase {

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
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement alternateItemDropDownDataSeelect2;

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
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	WebElement itemNumberDropDowninNREDataSelect2;

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

	public Engg_BOM_Create_Page_FOR_FG() {
		PageFactory.initElements(driver, this);

	}

	public HomePage bomCreate(String quantity, String scarpAllowance, String remark, String version, String quantityPer,
			String probability, String alternateRemark, String quantityNRE, String cost) throws Throwable {
		System.out.println("\n" + "Engg_BOM_Create_Page_FOR_FG  Started" + "\n");

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/item-master/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[9]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathFG = elementXpath.replace("Item-FG-11-TEST", ItemNumber);

		System.out.println(updatedXpathFG);

		// *******************//

		// Get the first PR number text from table
		String ItemNum = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathPP1 = elementXpath1.replace("Item-FG-11-TEST", ItemNum + "-Test Description");

		System.out.println(updatedXpathPP1);

		// Get the first PR number text from table
		String ItemNum1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathPP2 = elementXpath2.replace("Item-FG-11-TEST", ItemNum1 + "-Test Description");

		System.out.println(updatedXpathPP2);

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/engg-bom/table");

		// Get the first PR number text from table
		String ItemNum3 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath3 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathSA1 = elementXpath3.replace("Item-FG-11-TEST", ItemNum3 + "-Test Description");

		System.out.println(updatedXpathSA1);

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/engg-bom/create");

		// Item Number

		js.executeScript("arguments[0].scrollIntoView(true);", itemNumberForItem);
		Thread.sleep(5000);
		click(driver, itemNumberForItem);
		isSelected(driver, itemNumberForItem, "itemNumberForItem");

		itemNumberForItem.sendKeys(ItemNumber);
		WebElement itemNumberDropDownDataSelect = driver.findElement(By.xpath(updatedXpathFG));
		click(driver, itemNumberDropDownDataSelect);

		dataPrintFromInputtag(driver, itemDescriptionElement, "itemDescriptionElement");

		dataPrintFromInputtag(driver, itemTypeElement, "itemTypeElement");

//       activeStatusToggleButton.click();
//       activeStatusToggleButton.click();

		// ############## Child Item Tab ################

		for (int i = 1; i <= 3; i++) {
			Thread.sleep(3000);
			click(driver, itemNumberForChildItem);
			isSelected(driver, itemNumberForChildItem, "itemNumberForChildItem");

			if (i == 1) {
				itemNumberForChildItem.sendKeys(ItemNum3);

				WebElement itemNumberForChildItemDataSelect = driver.findElement(By.xpath(updatedXpathSA1));
				click(driver, itemNumberForChildItemDataSelect);
			}
			if (i == 2) {
				itemNumberForChildItem.sendKeys(ItemNum);

				WebElement itemNumberForChildItemDataSelect1 = driver.findElement(By.xpath(updatedXpathPP1));
				click(driver, itemNumberForChildItemDataSelect1);
			}
			if (i == 3) {
				itemNumberForChildItem.sendKeys(ItemNum1);

				WebElement itemNumberForChildItemDataSelect2 = driver.findElement(By.xpath(updatedXpathPP2));
				click(driver, itemNumberForChildItemDataSelect2);
			}

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

		}

		// ####### Alternates Tab ######

		alternatesTab.click();

		for (int j = 1; j <= 3; j++) {

			alternateItemDropDown.click();

			if (j == 1) {
				alternateItemDropDownDataSeelect.click();
			}

			if (j == 2) {
				alternateItemDropDownDataSeelect1.click();
			}

			if (j == 3) {
				alternateItemDropDownDataSeelect2.click();
			}
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
		}

		// ########## NRE / Consumable Tab

		for (int k = 1; k <= 3; k++) {

			nreOrConsumableTab.click();

			itemNumberDropDowninNRE.click();

			if (k == 1) {
				itemNumberDropDowninNREDataSelect.click();
			}
			if (k == 2) {
				itemNumberDropDowninNREDataSelect1.click();
			}
			if (k == 3) {
				itemNumberDropDowninNREDataSelect2.click();
			}

			click(driver, quantityFieldInNRE);
			isSelected(driver, quantityFieldInNRE, "quantityFieldInNRE");
			quantityFieldInNRE.clear();
			quantityFieldInNRE.sendKeys(quantityNRE);

			click(driver, costFieldInNRE);
			isSelected(driver, costFieldInNRE, "costFieldInNRE");
			costFieldInNRE.clear();
			costFieldInNRE.sendKeys(cost);

			addButtonInNRE.click();
		}

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
