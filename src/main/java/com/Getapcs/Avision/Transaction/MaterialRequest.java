package com.Getapcs.Avision.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class MaterialRequest extends TestBase {

	// Delivery Order

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement projectNumber;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement salesOrderNum;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement partNumber;

	@FindBy(xpath = "(//input[@type='number'])[1]")
	WebElement requiredQty;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[2]//input[@type='text']")
	WebElement partType;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[3]//input[@type='text']")
	WebElement stock;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "(//button[normalize-space()='Issue'])[1]")
	WebElement issueButton;

	@FindBy(xpath = "(//i[@title='Add Location'])[1]")
	WebElement locationAdd;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement warehouse;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='AVision Stores-I (Operational )'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//span[normalize-space()='MB-01'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement warehouse1;

	@FindBy(xpath = "(//span[normalize-space()='AVision Stores-III(General)'])[1]")
	WebElement warehouseSelect1;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement location1;

	@FindBy(xpath = "(//span[normalize-space()='GLB-01'])[1]")
	WebElement locationSelect1;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[1]")
	WebElement issueQty;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement save;

	public MaterialRequest() {

		PageFactory.initElements(driver, this);
	}

//*************Material Request Create Page******************

	public HomePage MRCreate(String RequiredQuantity, String IssueQuantity) throws InterruptedException {
		// TODO Auto-generated method stub

//Sales Order Number

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/shop-order/table");

		String tableXpath = "//table[@class='table table-striped']";

		String salesOrderNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", salesOrderNumber);

		System.out.println(updatedXpath);

//Project Number

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/sales-order/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String projectNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[4]")).getText();

		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", projectNumber1);

		System.out.println(updatedXpath1);

//Part Type

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/item-master/table");

		String tableXpath2 = "//table[@class='table table-striped']";

		String partNumber1 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath2 = elementXpath2.replace("Item-FG-11-TEST", partNumber1 + "-Test Description");

		System.out.println(updatedXpath2);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/create-material-request");

//Project Number

		click(driver, projectNumber);

		isSelected(driver, projectNumber, "projectNumber");

		WebElement salesOrderNumSelect = driver.findElement(By.xpath(updatedXpath1));

		click(driver, salesOrderNumSelect);
		Thread.sleep(2000);

//sales Order Number

		click(driver, salesOrderNum);

		isSelected(driver, salesOrderNum, "shopOrderNum");

		WebElement salesOrderNumSelect1 = driver.findElement(By.xpath(updatedXpath));

		click(driver, salesOrderNumSelect1);
		Thread.sleep(2000);

//Part Number

		click(driver, partNumber);

		isSelected(driver, partNumber, "partNumber");

		WebElement partNumberSelect = driver.findElement(By.xpath(updatedXpath2));

		click(driver, partNumberSelect);
		Thread.sleep(2000);

//Part Type

		dataPrintFromInputtag(driver, partType, "partType");

//Stock

		dataPrintFromInputtag(driver, stock, "stock");

//Required Qty

		click(driver, requiredQty);

		isSelected(driver, requiredQty, "requiredQty");
		requiredQty.clear();
		requiredQty.sendKeys(RequiredQuantity);

		click(driver, saveButton);

//Issue Button

		click(driver, issueButton);

		click(driver, locationAdd);

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

			// Issue Quantity

			click(driver, issueQty);

			issueQty.sendKeys(IssueQuantity);

			// add

			click(driver, add);

		}

		click(driver, save);

		click(driver, saveButton);

		return new HomePage();
	}
}
