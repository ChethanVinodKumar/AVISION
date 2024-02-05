package com.Getapcs.Avision.Transaction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class ReturnDO extends TestBase {

	// Return Delivery Order
	
	@FindBy(xpath = "(//i[@title='Click to view'])[1]")
	WebElement shopOrderViewButton;

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

	@FindBy(xpath = "(//i[@title='Return Delivery Order'])[1]")
	WebElement returnDO;
	
	@FindBy(xpath = "(//i[@title='Click to view'])[1]")
	WebElement viewDOButton;
	
	@FindBy(xpath = "//button[normalize-space()='Binning']")
	WebElement binningButton;

	public ReturnDO() {

		PageFactory.initElements(driver, this);
	}

//*************Return DO Create Page******************

	public HomePage ReturnDOCreate(String Quantity) throws InterruptedException {

		// Part Type

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/shop-order/table");
		
		click(driver, shopOrderViewButton);

		String tableXpath = "//table[@class='table table-striped']";
		String tableXpath1 = "//table[@class='table mb-2']";

		String projectNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[3]")).getText();

		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", projectNumber1);

		System.out.println(updatedXpath);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/delivery-order/table");
		click(driver, viewDOButton);
		click(driver, binningButton);
		
		String xPath = "(//span[normalize-space()='AVision Stores-III(General)'])[1]";
		
		
		String wareHouse1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[1]")).getText();
		String locationn1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();
		String qty1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText();
		
		String wareHouse2 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[1]")).getText();
		String locationn2 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();
		String qty2 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[3]")).getText();
		
		String updatedXpathW1 = xPath.replace("AVision Stores-III(General)", wareHouse1);
		String updatedXpathW2 = xPath.replace("AVision Stores-III(General)", wareHouse2);
		String updatedXpathL1 = xPath.replace("AVision Stores-III(General)", locationn1);
		String updatedXpathL2 = xPath.replace("AVision Stores-III(General)", locationn2);
		System.out.println(updatedXpathW1+"\n"+updatedXpathW2+"\n"+updatedXpathL1+"\n"+updatedXpathL2);
		
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/delivery-order/table");
		Thread.sleep(2000);
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
				WebElement warehouseSelect1 = driver.findElement(By.xpath(updatedXpathW1));
				click(driver, warehouseSelect1);
				// Location

				click(driver, location);

				isSelected(driver, location, "location");
				WebElement locationSelect1 = driver.findElement(By.xpath(updatedXpathL1));
				click(driver, locationSelect1);
				
				click(driver, quantityBinning);
				quantityBinning.sendKeys(qty1);

			}
			if (i == 2) {
				// Warehouse

				click(driver, warehouse1);

				isSelected(driver, warehouse1, "warehouse1");
				WebElement warehouseSelect2 = driver.findElement(By.xpath(updatedXpathW2));
				click(driver, warehouseSelect2);

				// Location

				click(driver, location1);

				isSelected(driver, location1, "location1");
				WebElement locationSelect2 = driver.findElement(By.xpath(updatedXpathL2));
				click(driver, locationSelect2);
				
				click(driver, quantityBinning);
				quantityBinning.sendKeys(qty2);
			}

			click(driver, add);
		}
		click(driver, save);
//Remarks Field

		click(driver, remarks);
		isSelected(driver, remarks, "remarks");
		remarks.sendKeys("Test Remark");


//Save Button

		click(driver, saveButton);

		return new HomePage();
	}

}
