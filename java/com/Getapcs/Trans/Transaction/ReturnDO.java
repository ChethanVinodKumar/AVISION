package com.Getapcs.Trans.Transaction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class ReturnDO extends TestBase {

	// Return Delivery Order

	@FindBy(xpath = "//label[text()='Customer Name']/..//input[@formcontrolname='customerName']")
	WebElement customerName;

	@FindBy(xpath = "//label[text()='Customer Id']/..//input[@formcontrolname='customerId']")
	WebElement customerId;

	@FindBy(xpath = "//label[text()='Sales Order Number']/..//input[@formcontrolname='salesOrderNumber']")
	WebElement salesOrderNumber;

	@FindBy(xpath = "//label[text()='PO Number']/..//input[@formcontrolname='poNumber']")
	WebElement poNumber;

	@FindBy(xpath = "//label[text()='Sales Order Rev Number']/..//input[@formcontrolname='salesOrderRevNo']")
	WebElement salesOrderRevNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter Return By'])[1]")
	WebElement returnBy;

	@FindBy(xpath = "//label[text()='Return DO Date']/..//input[@formcontrolname='doDate']")
	WebElement returnDoDate;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement returnQty;

	@FindBy(xpath = "(//button[normalize-space()='Binning'])[1]")
	WebElement binning;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement projectNumber;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	WebElement warehouse;

	@FindBy(xpath = "(//input[@type='text'])[14]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='AVision Stores-I (Operational )'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//span[normalize-space()='MB-01'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	WebElement warehouse1;

	@FindBy(xpath = "(//input[@type='text'])[14]")
	WebElement location1;

	@FindBy(xpath = "(//span[normalize-space()='AVision Stores-III(General)'])[1]")
	WebElement warehouseSelect1;

	@FindBy(xpath = "(//span[normalize-space()='GLB-01'])[1]")
	WebElement locationSelect1;

	@FindBy(xpath = "(//input[@placeholder='Enter quantity'])[1]")
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

	@FindBy(xpath = "(//button[normalize-space()='Return DO'])[1]")
	WebElement returnDO;

	public ReturnDO() {

		PageFactory.initElements(driver, this);
	}

//*************Return DO Create Page******************

	public HomePage ReturnDOCreate(String Quantity) throws InterruptedException {

		// Part Type

		driver.navigate().to("https://avision-demo.getapcs.com/sales/rfq/table");

		String tableXpath = "//table[@class='table table-striped']";

		String projectNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", projectNumber1);

		System.out.println(updatedXpath);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/delivery-order/table");

		click(driver, returnDO);

//Customer Name

		dataPrintFromInputtag(driver, customerName, "customerName");

//Customer Id

		dataPrintFromInputtag(driver, customerId, "customerId");

//Sales Order Number

		dataPrintFromInputtag(driver, salesOrderNumber, "salesOrderNumber");

//po Number

		dataPrintFromInputtag(driver, poNumber, "poNumber");

//Sales Order Rev Number

		dataPrintFromInputtag(driver, salesOrderRevNumber, "salesOrderRevNumber");

//return Do Date

		dataPrintFromInputtag(driver, returnDoDate, "returnDoDate");

//Dispatch Qty

		assertTrue(DispatchQty.isDisplayed(), DispatchQty + " is not IsDisplayed.");

		// To extract Value Attribute and use same approach to retrieve
		String DispatchQtyValue = DispatchQty.getText().trim();
		System.out.println("DispatchQty" + " : " + DispatchQtyValue + "\n");

//Return By

		click(driver, returnBy);

		isSelected(driver, returnBy, "returnBy");

		returnBy.sendKeys("TEST Return By");

//Return Qty

		click(driver, returnQty);

		isSelected(driver, returnQty, "returnQty");

		returnQty.sendKeys(DispatchQtyValue);

		// Binning

		click(driver, binning);

		for (int i = 1; i <= 2; i++) {

			click(driver, projectNumber);

			WebElement projectNumberSelect = driver.findElement(By.xpath(updatedXpath));

			click(driver, projectNumberSelect);

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

		returnBy.sendKeys("TEST remarks");

//Save Button

		click(driver, saveButton);

		return new HomePage();
	}

}
