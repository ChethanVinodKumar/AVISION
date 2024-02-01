package com.Getapcs.Trans.Transaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class OpenMRN extends TestBase {

	// Delivery Order

	@FindBy(xpath = "(//button[normalize-space()='Issue Material'])[1]")
	WebElement issueMaterial;

	@FindBy(xpath = "(//button[normalize-space()='Locations'])[1]")
	WebElement locationButton;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement wareHouse;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD5'])[1]")
	WebElement wareHouseSelect;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='room no1'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement warehouse1;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BH-RD3'])[1]")
	WebElement warehouseSelect1;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement location1;

	@FindBy(xpath = "(//span[normalize-space()='HYD-BHRD3-Room1'])[1]")
	WebElement locationSelect1;

	@FindBy(xpath = "(//input[@placeholder='Enter quantity'])[1]")
	WebElement quantity;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement save;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public OpenMRN() {

		PageFactory.initElements(driver, this);
	}

//*************Material Request Create Page******************

	public HomePage OpenMRNIssueMRN(String ReturnQty) throws InterruptedException {
		// TODO Auto-generated method stub

		click(driver, issueMaterial);

		click(driver, locationButton);

		for (int i = 1; i <= 2; i++) {

			if (i == 1) {

				// Warehouse

				click(driver, wareHouse);

				isSelected(driver, wareHouse, "warehouse");

				click(driver, wareHouseSelect);

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

			quantity.sendKeys(ReturnQty);

			click(driver, add);
		}

		click(driver, save);

		click(driver, saveButton);

		return new HomePage();
	}
}
