package com.Getapcs.Avision.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class ReturnInvoice extends TestBase {

	@FindBy(xpath = "(//i[@title='Click to view'])[1]")
	WebElement shopOrderViewButton;

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

	@FindBy(xpath = "(//i[@title='Click to view'])[1]")
	WebElement viewDOButton;

	@FindBy(xpath = "//button[normalize-space()='Binning']")
	WebElement binningButton;

	public ReturnInvoice() {

		PageFactory.initElements(driver, this);
	}

//*************OQC Create Page******************

	public HomePage ReturnInvoicepage() throws InterruptedException {

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/shop-order/table");

		click(driver, shopOrderViewButton);

		String tableXpath = "//table[@class='table table-striped']";
		String tableXpath1 = "//table[@class='table mb-2']";
		
		Thread.sleep(2000);

		String projectNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[3]")).getText();

		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", projectNumber1);

		System.out.println(updatedXpath);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/delivery-order/table");

		click(driver, viewDOButton);
		click(driver, binningButton);
		
		Thread.sleep(2000);
		String returnQty1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[13]")).getText();

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
		System.out.println(updatedXpathW1 + "\n" + updatedXpathW2 + "\n" + updatedXpathL1 + "\n" + updatedXpathL2);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/invoice/table");
		
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
		WebElement projectNumberSelect = driver.findElement(By.xpath(updatedXpath));
		click(driver, projectNumberSelect);
		

		

//Return Qty

		click(driver, returnQty);

		isSelected(driver, returnQty, "returnQty");

		returnQty.sendKeys(returnQty1);

//Binning 

		click(driver, binning);

		for (int i = 1; i <= 2; i++) {

			if (i == 1) {

				// Warehouse

				click(driver, warehouse);

				WebElement warehouseSelect1 = driver.findElement(By.xpath(updatedXpathW1));
				click(driver, warehouseSelect1);

				// Location

				click(driver, location);
				WebElement locationSelect1 = driver.findElement(By.xpath(updatedXpathL1));
				click(driver, locationSelect1);
				
				click(driver, binningQuantity);

				binningQuantity.sendKeys(qty1);
			}
			if (i == 2) {
				// Warehouse

				click(driver, warehouse1);

				WebElement warehouseSelect2 = driver.findElement(By.xpath(updatedXpathW2));
				click(driver, warehouseSelect2);

				// Location

				click(driver, location1);

				WebElement locationSelect2 = driver.findElement(By.xpath(updatedXpathL2));
				click(driver, locationSelect2);
				
				click(driver, binningQuantity);

				binningQuantity.sendKeys(qty2);
			}


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
