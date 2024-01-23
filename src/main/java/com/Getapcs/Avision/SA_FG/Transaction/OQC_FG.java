package com.Getapcs.Avision.SA_FG.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class OQC_FG extends TestBase {

	// Shop Order

	@FindBy(xpath = "(//textarea[@role='combobox'])[1]")
	WebElement fgItemNumber;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement shopOrderNum;

	@FindBy(xpath = "//label[normalize-space(text())='Shop Order Qty']/following-sibling::input[@formcontrolname='shopOrderQty']")
	WebElement shopOrderQtyElement;

	@FindBy(xpath = "//label[text()='Pending Qty ']/..//input[@class='form-control field2 ng-untouched ng-pristine ng-valid']")
	WebElement pendingQty;

	@FindBy(xpath = "//label[text()='Rejected Qty ']/..//input[@class='form-control field2 ng-untouched ng-pristine ng-valid']")
	WebElement rejectedQty;

	@FindBy(xpath = "(//input[@placeholder='Accepted Qty'])[1]")
	WebElement acceptedQty;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public OQC_FG() {

		PageFactory.initElements(driver, this);
	}

//*************OQC Create Page******************

	public HomePage OQCCreate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************OQC Create Page******************");
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/shop-order-confirm/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String fgItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[4]")).getText();
		String soItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathFG = elementXpath.replace("Item-FG-11-TEST", fgItemNumber1 + "-Test Description");
		String updatedXpathSO = elementXpath.replace("Item-FG-11-TEST", soItemNumber1);

		System.out.println(updatedXpathSO + "\n" + updatedXpathFG);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/create-fg-oqc");

//FG Item Number

		click(driver, fgItemNumber);
		fgItemNumber.sendKeys(Keys.BACK_SPACE);
		isSelected(driver, fgItemNumber, "fgItemNumber");

		WebElement fgItemNumberSelect = driver.findElement(By.xpath(updatedXpathFG));

		click(driver, fgItemNumberSelect);

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

		int acceptedQty1 = Integer.parseInt(elementValue);
		acceptedQty1 = acceptedQty1 - 1;
		System.out.println("acceptedQty1 : " + acceptedQty1);

		acceptedQty.sendKeys(String.valueOf(acceptedQty1));


//rejectedQty

		dataPrintFromInputtag(driver, rejectedQty, "rejectedQty");

//Save Button

//		click(driver, saveButton);

		return new HomePage();
	}

}
