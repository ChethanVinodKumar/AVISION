package com.Getapcs.Avision.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class ReturnOpenDO extends TestBase {

	// Return Delivery Order

	@FindBy(xpath = "//label[text()='Customer Name']/..//input[@formcontrolname='customerName']")
	WebElement customerName;

	@FindBy(xpath = "//label[text()='Customer Id']/..//input[@formcontrolname='customerId']")
	WebElement customerId;

	@FindBy(xpath = "//label[text()='ODO Type']/..//input[@formcontrolname='doType']")
	WebElement odoType;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[2]")
	WebElement itemType;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[6]")
	WebElement avilableStock;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[7]")
	WebElement dispatvhQty;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement projectNumber;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement returnQty;

	@FindBy(xpath = "(//button[normalize-space()='Binning'])[1]")
	WebElement binning;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement warehouse;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='AVision Stores-I (Operational )'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//span[normalize-space()='MB-01'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement warehouse1;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement location1;

	@FindBy(xpath = "(//span[normalize-space()='AVision Stores-III(General)'])[1]")
	WebElement warehouseSelect1;

	@FindBy(xpath = "(//span[normalize-space()='GLB-01'])[1]")
	WebElement locationSelect1;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	WebElement quantityBinning;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement save;

	@FindBy(xpath = "(//textarea)[1]")
	WebElement remarks;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[7]")
	WebElement DispatchQty;

	@FindBy(xpath = "(//button[normalize-space()='Return ODO'])[1]")
	WebElement returnODO;

	public ReturnOpenDO() {

		PageFactory.initElements(driver, this);
	}

//*************Return DO Create Page******************

	public HomePage ReturnOpenDOCreate(String returnQtyValue, String Quantity) throws InterruptedException {

		// Part Type

		driver.navigate().to("https://avision-demo.getapcs.com/sales/rfq/table");

		String tableXpath = "//table[@class='table table-striped']";

		String projectNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", projectNumber1);

		System.out.println(updatedXpath);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/open-delivery-order/table");

		click(driver, returnODO);

//Customer Name

		dataPrintFromInputtag(driver, customerName, "customerName");

//Customer Id

		dataPrintFromInputtag(driver, customerId, "customerId");

//po Number

		dataPrintFromInputtag(driver, odoType, "poNumber");

//item Type

		dataPrint(driver, itemType, "itemType");

//avilable Stock

		dataPrint(driver, avilableStock, "returnDoDate");

//Dispatch Qty

		String DispatchQtyValue = DispatchQty.getText().trim();
		System.out.println("DispatchQty" + " : " + DispatchQtyValue + "\n");

//Item Type

		click(driver, projectNumber);

		isSelected(driver, projectNumber, "projectNumber");

		WebElement projectNumberSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, projectNumberSelect);

//Return Qty

		click(driver, returnQty);

		isSelected(driver, returnQty, "returnQty");

		returnQty.sendKeys(DispatchQtyValue);

// Binning

		click(driver, binning);

		for (int i = 1; i <= 2; i++) {

			if (i == 1) {

				// Warehouse

				click(driver, warehouse);

				isSelected(driver, warehouse, "warehouse");

				click(driver, warehouseSelect);

				// Location

				click(driver, location);

				isSelected(driver, location, "location");

				click(driver, locationSelect);
			}
			if (i == 2) {
				// Warehouse

				click(driver, warehouse1);

				isSelected(driver, warehouse1, "warehouse1");

				click(driver, warehouseSelect1);

				// Location

				click(driver, location1);

				isSelected(driver, location1, "location1");

				click(driver, locationSelect1);
			}
			click(driver, quantityBinning);

			quantityBinning.sendKeys(Quantity);

			click(driver, add);
		}
		click(driver, save);
//Remarks Field

		click(driver, remarks);

		isSelected(driver, remarks, "remarks");

		itemType.sendKeys("TEST remarks");

//Save Button

		click(driver, saveButton);

		return new HomePage();
	}

}
