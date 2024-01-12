package com.Getapcs.Avision.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class OQC extends TestBase {

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

	public OQC() {

		PageFactory.initElements(driver, this);
	}

//*************OQC Create Page******************

	public HomePage OQCCreate(String AcceptedQunatity) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************OQC Create Page******************");
		driver.navigate().to("https://avision-demo.getapcs.com/engineering/engg-bom/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String fgItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", fgItemNumber1 + "-Test Description");

		System.out.println(updatedXpath);

		// ***********//

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/shop-order/table");

		String tableXpath2 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String shopOrderNumber = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath2 = elementXpath2.replace("Item-FG-11-TEST", shopOrderNumber);

		System.out.println(updatedXpath2);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/create-fg-oqc");

//FG Item Number

		click(driver, fgItemNumber);
		fgItemNumber.sendKeys(Keys.BACK_SPACE);
		isSelected(driver, fgItemNumber, "fgItemNumber");

		WebElement fgItemNumberSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, fgItemNumberSelect);

//Shop Order Number

		click(driver, shopOrderNum);

		isSelected(driver, shopOrderNum, "shopOrderNum");

		WebElement shopOrderNumSelect = driver.findElement(By.xpath(updatedXpath2));

		click(driver, shopOrderNumSelect);

//Shop Order  Qty

		dataPrintFromInputtag(driver, shopOrderQtyElement, "shopOrderQtyElement");

//Accepted Qty

		click(driver, acceptedQty);

		isSelected(driver, acceptedQty, "acceptedQty");

		acceptedQty.sendKeys(AcceptedQunatity);

//pending Qty

		dataPrintFromInputtag(driver, pendingQty, "pendingQty");

//rejectedQty

		dataPrintFromInputtag(driver, rejectedQty, "rejectedQty");

//Save Button

		click(driver, saveButton);

		return new HomePage();
	}

}
