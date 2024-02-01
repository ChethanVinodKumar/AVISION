package com.Getapcs.Trans.SA_FG.Transaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.ShopOrderConfirmationDynamicValue;
import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class ShopOrderConfirmation_SA1 extends TestBase {

	// Shop Order Confirmation

	@FindBy(xpath = "(//input[@value='sa'])[1]")
	WebElement saCheckBox;

	@FindBy(xpath = "(//textarea[@role='combobox'])[1]")
	WebElement saItemNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter Produced Qty'])[1]")
	WebElement producedQty;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
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

	public ShopOrderConfirmation_SA1() {

		PageFactory.initElements(driver, this);
	}

//*************Shop Order Create Page******************

	public HomePage ShopOrderConfirmationCreate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************Shop Order Confirmation Create Page******************");

		// FG Item Num

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/material-issue/table");

		String tableXpath = "//table[@class='table table-striped']";

		String saItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[3]")).getText();
		String soItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", saItemNumber1 + "-Test Description");
		String updatedXpathSO = elementXpath.replace("Item-FG-11-TEST", soItemNumber1);

		System.out.println("\n" + updatedXpathSO + "\n" + updatedXpath);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/shop-order-confirm/create");

//SA Item Number

		Thread.sleep(Duration.ofSeconds(4));
		click(driver, saCheckBox);

		click(driver, saItemNumber);
		isSelected(driver, saItemNumber, "saItemNumber");
		saItemNumber.sendKeys((Keys.CONTROL + "a"), (Keys.BACK_SPACE));
		WebElement saItemNumberSelect = driver.findElement(By.xpath(updatedXpath));
		click(driver, saItemNumberSelect);

//Sales Order Number

		click(driver, shopOrderNum1);
		isSelected(driver, shopOrderNum1, "shopOrderNum1");
		shopOrderNum1.sendKeys(soItemNumber1);
		WebElement salesOrderNumSelect = driver.findElement(By.xpath(updatedXpathSO));
		click(driver, salesOrderNumSelect);

//produced Qty

		WebElement table = driver.findElement(By.xpath("(//table)[1]"));
		int ProducedQTy = ShopOrderConfirmationDynamicValue.validateProducedQuantity(table);
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