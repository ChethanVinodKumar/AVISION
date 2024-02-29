package com.Getapcs.Avision.SA_FG.Transaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Getapcs.Avision.BASECLASS.ShopOrderConfirmationDynamicValue;
import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class ShopOrderConfirmation_SA2 extends TestBase {

	@FindBy(tagName = "body")
	public static WebElement driverIninteractable;
	// Shop Order Confirmation

	@FindBy(xpath = "(//input[@value='sa'])[1]")
	WebElement saCheckBox;

	@FindBy(xpath = "//label[normalize-space()='SA Item Number / Description']/..//textarea[@formcontrolname='saItemNoDesc']")
	WebElement saItemNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter Produced Qty'])[1]")
	WebElement producedQty;

	@FindBy(xpath = "//label[normalize-space()='Shop Order Number']/..//ng-select[@placeholder='Select Shop Order Number']/..//input")
	WebElement shopOrderNum1;

	@FindBy(xpath = "//label[normalize-space(text())='Shop Order Released Qty']/following-sibling::div/input[@formcontrolname='shopOrderQty']")
	WebElement shopOrderReleasedQty;

	@FindBy(xpath = "//label[normalize-space()='Pending wipx']/following-sibling::div/input[@formcontrolname='pendingWip']")
	WebElement pendingWipx;

	@FindBy(xpath = "//table[@class='table mb-2']/tbody/tr[1]/td[4]")
	WebElement bomQty;

	@FindBy(xpath = "//table[@class='table mb-2']/tbody/tr[1]/td[5]")
	WebElement issuedQty;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public ShopOrderConfirmation_SA2() {

		PageFactory.initElements(driver, this);
	}

//*************Shop Order Create Page******************

	public HomePage ShopOrderConfirmationCreate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************Shop Order Confirmation Create Page******************//");

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/material-issue/table");
		Thread.sleep(2000);
		String tableXpath = "//table[@class='table table-striped']";
		actions.moveToElement(driverIninteractable).perform();
		Thread.sleep(2000);

		String saItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[3]/td[3]")).getText();
		Assert.assertNotNull(saItemNumber1,"saItemNumber1 is Null");
		String soItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[3]/td[2]")).getText();
		Assert.assertNotNull(soItemNumber1,"soItemNumber1 is Null");

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", saItemNumber1 + "-Test Description");
		String updatedXpathSO = elementXpath.replace("Item-FG-11-TEST", soItemNumber1);

		System.out.println("\n" + updatedXpathSO + "\n" + updatedXpath);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/shop-order-confirm/create");

		actions.moveToElement(driverIninteractable).perform();
		Thread.sleep(3000);
//SA Item Number

		Thread.sleep(3000);
		click(driver, saCheckBox);

		click(driver, saItemNumber);
		isSelected(driver, saItemNumber, "saItemNumber");
		saItemNumber.sendKeys((Keys.CONTROL + "a"), (Keys.BACK_SPACE));
		WebElement saItemNumberSelect = driver.findElement(By.xpath(updatedXpath));
		click(driver, saItemNumberSelect);
		actions.moveToElement(driverIninteractable).perform();

		Thread.sleep(2000);
//Sales Order Number

		click(driver, shopOrderNum1);
		isSelected(driver, shopOrderNum1, "shopOrderNum1");
		shopOrderNum1.sendKeys(soItemNumber1);
		WebElement salesOrderNumSelect = driver.findElement(By.xpath(updatedXpathSO));
		click(driver, salesOrderNumSelect);
		actions.moveToElement(driverIninteractable).perform();
		Thread.sleep(3000);
		
//produced Qty

		WebElement table = driver.findElement(By.xpath("(//table)[1]"));
		double ProducedQTy = ShopOrderConfirmationDynamicValue.validateProducedQuantity(table);
		String ProducedQTy1 = String.valueOf(ProducedQTy);

		click(driver, producedQty);
		isSelected(driver, producedQty, "producedQty");
		producedQty.sendKeys(ProducedQTy1);

//Sales Order Number

		dataPrintFromInputtag(driver, shopOrderReleasedQty, "salesOrderReleasedQty");

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