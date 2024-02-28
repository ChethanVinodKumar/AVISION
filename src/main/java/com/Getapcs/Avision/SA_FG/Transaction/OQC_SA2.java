package com.Getapcs.Avision.SA_FG.Transaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class OQC_SA2 extends TestBase {

	// OQC
	@FindBy(tagName = "body")
	public static WebElement driverIninteractable;

	@FindBy(xpath = "(//input[@value='sa'])[1]")
	WebElement saCheckBox;

	@FindBy(xpath = "(//textarea[@role='combobox'])[1]")
	WebElement saItemNumber;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement shopOrderNum;

	@FindBy(xpath = "//label[normalize-space(text())='Shop Order Qty']/following-sibling::input[@formcontrolname='shopOrderQty']")
	WebElement shopOrderQtyElement;

	@FindBy(xpath = "//label[contains(text(), 'Pending Qty')]/following-sibling::input[@formcontrolname='pendingQty']")
	WebElement pendingQty;

	@FindBy(xpath = "//label[text()='Rejected Qty ']/..//input[@class='form-control field2 ng-untouched ng-pristine ng-valid']")
	WebElement rejectedQty;

	@FindBy(xpath = "(//input[@placeholder='Accepted Qty'])[1]")
	WebElement acceptedQty;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public OQC_SA2() {

		PageFactory.initElements(driver, this);
	}

//*************OQC Create Page******************

	public HomePage OQCCreate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************OQC Create Page******************");
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/shop-order-confirm/table");

		String tableXpath = "//table[@class='table table-striped']";
		actions.moveToElement(driverIninteractable).perform();
		Thread.sleep(2000);

		// Get the first PR number text from table
		String saItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[4]")).getText();
		String soItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathSA = elementXpath.replace("Item-FG-11-TEST", saItemNumber1 + "-Test Description");
		String updatedXpathSO = elementXpath.replace("Item-FG-11-TEST", soItemNumber1);

		System.out.println(updatedXpathSO + "\n" + updatedXpathSA);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/create-fg-oqc");

		Thread.sleep(Duration.ofSeconds(3));

		click(driver, saCheckBox);
//SA Item Number

		click(driver, saItemNumber);
		saItemNumber.sendKeys((Keys.CONTROL + "a"), Keys.BACK_SPACE);
		isSelected(driver, saItemNumber, "saItemNumber");
		WebElement saItemNumberSelect1 = driver.findElement(By.xpath(updatedXpathSA));
		click(driver, saItemNumberSelect1);

//Shop Order Number

		click(driver, shopOrderNum);
		isSelected(driver, shopOrderNum, "shopOrderNum");
		WebElement shopOrderNumSelect = driver.findElement(By.xpath(updatedXpathSO));
		click(driver, shopOrderNumSelect);

//Shop Order  Qty

		dataPrintFromInputtag(driver, shopOrderQtyElement, "shopOrderQtyElement");

		String elementValue = (String) js.executeScript("return arguments[0].value;", pendingQty);
		System.out.println(" pendingQty : " + elementValue + "\n");

//Accepted Qty

		click(driver, acceptedQty);

		isSelected(driver, acceptedQty, "acceptedQty");

		double acceptedQty1 = Double.parseDouble(elementValue);
		int acceptedQty2 = (int)acceptedQty1 - 1;
		System.out.println("acceptedQty2 : " + acceptedQty2);

		acceptedQty.sendKeys(String.valueOf(acceptedQty2));

//rejectedQty

		dataPrintFromInputtag(driver, rejectedQty, "rejectedQty");

//Save Button

		click(driver, saveButton);

		return new HomePage();
	}

}
