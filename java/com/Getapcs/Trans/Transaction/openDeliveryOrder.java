package com.Getapcs.Trans.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class openDeliveryOrder extends TestBase {

	// Open Delivery Order

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement receipientNameDropdown;

	@FindBy(xpath = "(//span[normalize-space()='ASPL|CS|23-24|004 - AVision Systems Pvt Ltd .'])[1]")
	WebElement receipientNameSelect;

	@FindBy(xpath = "(//input[@placeholder='Responsible Person'])[1]")
	WebElement responsiblePerson;

	@FindBy(xpath = "(//textarea[@formcontrolname='description'])[1]")
	WebElement descriptionField;

	@FindBy(xpath = "(//select[@formcontrolname='doType'])[1]")
	WebElement doTypeDropdown;

	@FindBy(xpath = "//label[text()='Sales order Rev no']/..//input[@formcontrolname='salesOrderRevNo']")
	WebElement salesOrderRevNo;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement issuedToDropdown;

	@FindBy(xpath = "(//span[normalize-space()='AVision Systems Pvt Ltd .'])[1]")
	WebElement issuedToSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement resonForIssuingStockDropdown;

	@FindBy(xpath = "(//span[normalize-space()='TEST IssuingStock1'])[1]")
	WebElement resonForIssuingStockSelect;

	@FindBy(xpath = "(//input[@placeholder='Reason for Issuing Stock'])[1]")
	WebElement resonForIssuingStock;

	@FindBy(xpath = "(//textarea[@role='combobox'])[1]")
	WebElement itemNumber;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement unitPrice;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	WebElement dispatchQty;

	@FindBy(xpath = "(//input[@type='text'])[14]")
	WebElement projectNumberDropdown;

	@FindBy(xpath = "(//button[normalize-space()='Binning'])[1]")
	WebElement binningButton;

	@FindBy(xpath = "(//input[@type='text'])[15]")
	WebElement warehouse;

	@FindBy(xpath = "(//input[@type='text'])[16]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='AVision Stores-I (Operational )'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//span[normalize-space()='MB-01'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@type='text'])[15]")
	WebElement warehouse1;

	@FindBy(xpath = "(//span[normalize-space()='AVision Stores-III(General)'])[1]")
	WebElement warehouseSelect1;

	@FindBy(xpath = "(//input[@type='text'])[16]")
	WebElement location1;

	@FindBy(xpath = "(//span[normalize-space()='GLB-01'])[1]")
	WebElement locationSelect1;

	@FindBy(xpath = "(//input[@formcontrolname='availableQty'])[1]")
	WebElement auailableQty;

	@FindBy(xpath = "(//input[@formcontrolname='qty'])[1]")
	WebElement quantity;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
	WebElement save;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-open-delivery-order-form/div[2]/div/div/div/form/div/div[6]/div/div/div[1]/table/tbody/tr/td[10]/div/textarea")
	WebElement remarks;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public openDeliveryOrder() {

		PageFactory.initElements(driver, this);
	}

//*************Delivery Order Create Page******************

	public HomePage openDeliveryOrderCreate(String DispatchQuantity, String Quantity, String Unitprice)
			throws InterruptedException {

		System.out.println("//*************Open Delivery Order Create Page******************");

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/item-master/table");

		String tableXpath = "//table[@class='table table-striped']";

		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumber + "-Test Description");

		System.out.println(updatedXpath);

		driver.navigate().to("https://avision-demo.getapcs.com/sales/rfq/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String projectNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", projectNumber1);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/open-delivery-order/create");

// Receipient Name

		click(driver, receipientNameDropdown);

		isSelected(driver, receipientNameDropdown, "receipientNameDropdown");

		click(driver, receipientNameSelect);
		Thread.sleep(2000);

// Responsible Person

		click(driver, responsiblePerson);

		responsiblePerson.sendKeys("TEST responsible Person");

// Description Field

		click(driver, descriptionField);

		descriptionField.sendKeys("TEST description Field");

//sales Order Number

		click(driver, doTypeDropdown);

		isSelected(driver, doTypeDropdown, "doTypeDropdown");

		Select select = new Select(doTypeDropdown);
		select.selectByVisibleText("Returnable");

//Issued To Dropdown

		click(driver, issuedToDropdown);

		isSelected(driver, issuedToDropdown, "issuedToDropdown");

		click(driver, issuedToSelect);

//Issued To Dropdown

		click(driver, resonForIssuingStockDropdown);

		isSelected(driver, resonForIssuingStockDropdown, "resonForIssuingStockDropdown");

		click(driver, resonForIssuingStockSelect);

//Issued Stock Field 

		click(driver, resonForIssuingStock);

		resonForIssuingStock.sendKeys("TEST resonForIssuingStock");

//item Number

		click(driver, itemNumber);

		isSelected(driver, itemNumber, "itemNumber");

		WebElement itemNumSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, itemNumSelect);

//Unit Price

		click(driver, unitPrice);

		unitPrice.sendKeys(Unitprice);

//Disptch Quantity

		click(driver, dispatchQty);

		dispatchQty.sendKeys(DispatchQuantity);
		Thread.sleep(2000);

//Project Number

		click(driver, projectNumberDropdown);

		isSelected(driver, projectNumberDropdown, "projectNumberDropdown");

		WebElement projectNumberSelect = driver.findElement(By.xpath(updatedXpath1));

		click(driver, projectNumberSelect);

//Binning

		click(driver, binningButton);

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
			click(driver, quantity);

			quantity.sendKeys(Quantity);

			click(driver, add);
		}
		click(driver, save);

		click(driver, remarks);
		remarks.sendKeys("TEST Remarks");

		click(driver, saveButton);

		return new HomePage();
	}
}
