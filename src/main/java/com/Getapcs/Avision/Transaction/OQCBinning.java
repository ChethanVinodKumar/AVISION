package com.Getapcs.Avision.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class OQCBinning extends TestBase {

	// Shop Order

	@FindBy(xpath = "(//textarea[@role='combobox'])[1]")
	WebElement fgItemNumber;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement shopOrderNum;

	@FindBy(xpath = "//label[text()='Accepted FG Qty']/..//input[@class='form-control field2 ng-untouched ng-pristine ng-valid']")
	WebElement acceptedQty;

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
	WebElement quantity;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
	WebElement save;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public OQCBinning() {

		PageFactory.initElements(driver, this);
	}

//*************OQC Binning Create Page******************

	public HomePage OQCBinningCreate(String Quantity) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************OQC Binning Create Page******************");
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

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/create-oqc-binning");

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

//accepted Qty

		dataPrintFromInputtag(driver, acceptedQty, "acceptedQty");

//Binning 

		click(driver, binning);

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
		click(driver, saveButton);

		return new HomePage();
	}

}
