package com.Getapcs.Trans.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class Material_ReturnNote extends TestBase {

	// Delivery Order

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement projectNumber;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement salesOrderNum;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement partNumber;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement returnQty;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[2]//input[@type='text']")
	WebElement partType;

	@FindBy(xpath = "//table[@formarrayname='ItemData']/tbody/tr[1]/td[3]//input[@type='text']")
	WebElement stock;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public Material_ReturnNote() {

		PageFactory.initElements(driver, this);
	}

//*************Material Return Note Create Page******************

	public HomePage MRNCreate(String returnQuantity) throws InterruptedException {
		// TODO Auto-generated method stub

//Sales Order Number

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/shop-order/table");

		String tableXpath = "//table[@class='table table-striped']";

		String salesOrderNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", salesOrderNumber);

		System.out.println(updatedXpath);

//Project Number

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/sales-order/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String projectNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[4]")).getText();

		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", projectNumber1);

		System.out.println(updatedXpath1);

//Part Type

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/item-master/table");

		String tableXpath2 = "//table[@class='table table-striped']";

		String partNumber1 = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath2 = elementXpath2.replace("Item-FG-11-TEST", partNumber1 + "-Test Description");

		System.out.println(updatedXpath2);

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/create-material-return-note");

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

//Return Quantity

		click(driver, returnQty);

		isSelected(driver, returnQty, "requiredQty");
		returnQty.clear();
		returnQty.sendKeys(returnQuantity);

		click(driver, saveButton);

		return new HomePage();
	}
}
