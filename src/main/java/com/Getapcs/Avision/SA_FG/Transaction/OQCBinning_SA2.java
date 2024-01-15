package com.Getapcs.Avision.SA_FG.Transaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class OQCBinning_SA2 extends TestBase {

	// Shop Order
	@FindBy(xpath = "(//input[@value='sa'])[1]")
	WebElement saCheckBox;

	@FindBy(xpath = "(//textarea[@role='combobox'])[1]")
	WebElement saItemNumber;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement shopOrderNum;

	@FindBy(xpath = "//label[contains(text(), 'Accepted SA Qty')]/following-sibling::input[@formcontrolname='acceptQuantity']")
	WebElement acceptedQty;

	@FindBy(xpath = "(//button[normalize-space()='Binning'])[1]")
	WebElement binning;

	@FindBy(xpath = "//label[contains(text(), 'Item Quantity :')]/following-sibling::label[@class='property']/b")
	WebElement itemQty;

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

	public OQCBinning_SA2() {

		PageFactory.initElements(driver, this);
	}

//*************OQC Binning Create Page******************

	public HomePage OQCBinningCreate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************OQC Binning Create Page******************");
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/fg-oqc");

		String tableXpath = "//table[@class='table table-striped']";

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		// Get the first PR number text from table
		String saItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[4]")).getText();

		String soItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String updatedXpathSA = elementXpath.replace("Item-FG-11-TEST", saItemNumber1 + "-Test Description");
		String updatedXpathSO = elementXpath.replace("Item-FG-11-TEST", soItemNumber1);

		System.out.println(updatedXpathSA + "\n" + updatedXpathSA);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/create-oqc-binning");

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

//accepted Qty

		dataPrintFromInputtag(driver, acceptedQty, "acceptedQty");

//Binning 

		click(driver, binning);

		int itemQty1 = Integer.parseInt(itemQty.getText());
		itemQty1 = itemQty1 / 2;
		String qty = String.valueOf(itemQty1);

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

			quantity.sendKeys(qty);

			click(driver, add);
		}
		click(driver, save);
		click(driver, saveButton);

		return new HomePage();
	}

}
