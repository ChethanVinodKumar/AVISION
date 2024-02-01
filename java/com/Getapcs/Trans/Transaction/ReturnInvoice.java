package com.Getapcs.Trans.Transaction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class ReturnInvoice extends TestBase {

	@FindBy(xpath = "(//button[normalize-space()='Return Invoice'])[1]")
	WebElement returnInvoiceButtton;

	@FindBy(xpath = "//label[text()='Invoice Number']/..//label[@class='field2']")
	WebElement invoiceNumber;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[1]")
	WebElement doNum;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[2]")
	WebElement fgElement;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[3]")
	WebElement quantity;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[8]")
	WebElement salesOrderId;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement projectNumber;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement returnQty;

	@FindBy(xpath = "(//button[normalize-space()='Binning'])[1]")
	WebElement binning;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement warehouse;

	@FindBy(xpath = "(//span[normalize-space()='AVision Stores-I (Operational )'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='MB-01'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement warehouse1;

	@FindBy(xpath = "(//span[normalize-space()='AVision Stores-III(General)'])[1]")
	WebElement warehouseSelect1;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement location1;

	@FindBy(xpath = "(//span[normalize-space()='GLB-01'])[1]")
	WebElement locationSelect1;

	@FindBy(xpath = "(//input[@placeholder='Enter quantity'])[1]")
	WebElement binningQuantity;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
	WebElement save;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-return-invoice-form/div[2]/div/div/div/form/div/div[4]/div/div/div/table/tbody/tr/td[18]/div/textarea")
	WebElement remarks;

	public ReturnInvoice() {

		PageFactory.initElements(driver, this);
	}

//*************OQC Create Page******************

	public HomePage ReturnInvoicepage(String ReturnQunatity, String Quantity) throws InterruptedException {

		click(driver, returnInvoiceButtton);

//Invoice Number

		dataPrintFromInputtag(driver, invoiceNumber, "invoiceNumber");

//

		dataPrint(driver, doNum, "doNum");

		dataPrint(driver, fgElement, "fgElement");

		dataPrint(driver, quantity, "quantity");

		dataPrint(driver, salesOrderId, "salesOrderId");

//Project Number

		click(driver, projectNumber);

		projectNumber.sendKeys(Keys.ENTER);

//Return Qty

		click(driver, returnQty);

		isSelected(driver, returnQty, "returnQty");

		returnQty.sendKeys(ReturnQunatity);

//Binning 

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

			click(driver, binningQuantity);

			binningQuantity.sendKeys(Quantity);

			click(driver, add);
		}
		click(driver, save);

//Remarks

		click(driver, remarks);

		isSelected(driver, remarks, "remarks");

		remarks.sendKeys("TEST remarks");

//Save Button

		click(driver, saveButton);

		return new HomePage();
	}
}
