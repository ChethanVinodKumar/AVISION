package com.Getapcs.Avision.SA_FG.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Getapcs.Avision.BASECLASS.ShopOrderConfirmationDynamicValue;
import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class ShopOrderConfirmation_FG extends TestBase {

	@FindBy(tagName = "body")
	public static WebElement driverIninteractable;
	// Shop Order

	@FindBy(xpath = "(//textarea[@role='combobox'])[1]")
	WebElement fgItemNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter Produced Qty'])[1]")
	WebElement producedQty;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement salesOrderNum1;

	@FindBy(xpath = "//label[normalize-space(text())='Shop Order Released Qty']/following-sibling::div/input[@formcontrolname='shopOrderQty']")
	WebElement salesOrderReleasedQty;

	@FindBy(xpath = "//label[normalize-space()='Pending wipx']/following-sibling::div/input[@formcontrolname='pendingWip']")
	WebElement pendingWipx;

	@FindBy(xpath = "//table[@class='table mb-2']/tbody/tr[1]/td[4]")
	WebElement bomQty;

	@FindBy(xpath = "//table[@class='table mb-2']/tbody/tr[1]/td[5]")
	WebElement issuedQty;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public ShopOrderConfirmation_FG() {

		PageFactory.initElements(driver, this);
	}

//*************Shop Order Create Page******************

	public HomePage ShopOrderConfirmationCreate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************Shop Order Confirmation Create Page******************");

		// FG Item Num

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/material-issue/table");

		String tableXpath = "//table[@class='table table-striped']";
		
		actions.moveToElement(driverIninteractable).perform();
		Thread.sleep(2000);

		String fgItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText();

		Assert.assertNotNull(fgItemNumber1,"fgItemNumber1 is Null");
		
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", fgItemNumber1 + "-Test Description");

		System.out.println(updatedXpath);

		// Shop Order Number

		actions.moveToElement(driverIninteractable).perform();
		Thread.sleep(500);
		String salesOrderNum = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		Assert.assertNotNull(salesOrderNum,"salesOrderNum is Null");
		
		String updatedXpath1 = elementXpath.replace("Item-FG-11-TEST", salesOrderNum);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/shop-order-confirm/create");

		Thread.sleep(3000);
		
		actions.moveToElement(driverIninteractable).perform();
//FG Item Number
		click(driver, fgItemNumber);
		fgItemNumber.sendKeys(Keys.BACK_SPACE);
		isSelected(driver, fgItemNumber, "fgItemNumber");

		WebElement fgItemNumberSelect = driver.findElement(By.xpath(updatedXpath));
		click(driver, fgItemNumberSelect);
		
		Thread.sleep(3000);

//Sales Order Number

		click(driver, salesOrderNum1);

		isSelected(driver, salesOrderNum1, "fgItemNumber");

		WebElement salesOrderNumSelect = driver.findElement(By.xpath(updatedXpath1));
		click(driver, salesOrderNumSelect);

		Thread.sleep(3000);

//produced Qty

		WebElement table = driver.findElement(By.xpath("(//table)[1]"));
		double ProducedQTy = ShopOrderConfirmationDynamicValue.validateProducedQuantity(table);
		String ProducedQTy1 = String.valueOf(ProducedQTy);

		click(driver, producedQty);
		isSelected(driver, producedQty, "producedQty");
		producedQty.sendKeys(ProducedQTy1);

//Sales Order Number

		dataPrintFromInputtag(driver, salesOrderReleasedQty, "salesOrderReleasedQty");

//Pending Wipx

		dataPrintFromInputtag(driver, pendingWipx, "pendingWipx");

//BOM Quantity

		dataPrint(driver, bomQty, "bomQty");

//Issued Quantity

		dataPrint(driver, issuedQty, "issuedQty");

//Save Button

		click(driver, saveButton);

		return new HomePage();
	}

}
