package com.Getapcs.Avision.Sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class Sourcing extends TestBase {

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement rfqNumberDropDown;

	@FindBy(xpath = "//button[normalize-space()='Filter']")
	WebElement filterButton;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/button[1]")
	WebElement sourcingButton;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement addVenderButton;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement venderDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST Vender'])[1]")
	WebElement venderDropDownSelectData;

	@FindBy(xpath = "//input[@formcontrolname='unitPrice']")
	WebElement unitPriceField;

	@FindBy(xpath = "//input[@formcontrolname='unitPricePer']")
	WebElement unitPricePerField;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement currencyDropDown;
	@FindBy(xpath = "//span[normalize-space()='INR']")
	WebElement currencyDropDownSelectData;

	@FindBy(xpath = "//input[@placeholder='Enter MOQ']")
	WebElement moqCostField;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement leadTimeDropDown;
	@FindBy(xpath = "//span[normalize-space()='10 week,10days']")
	WebElement leadTimeDropDownSelectData;

	@FindBy(xpath = "//input[@placeholder='Enter Freight']")
	WebElement freightField;

	@FindBy(xpath = "//input[@placeholder='Enter Duties']")
	WebElement dutiesField;

	@FindBy(xpath = "//input[@placeholder='Enter Quote Quantity']")
	WebElement quoteQuantityField;

	@FindBy(xpath = "//input[@placeholder='Enter Quote Date']")
	WebElement quoteDatePicker;

	@FindBy(xpath = "//input[@placeholder='Enter Quote Validity']")
	WebElement quoteValidityDatePicker;

	@FindBy(xpath = "//input[@placeholder='Upload file']")
	WebElement uploadFile;

	@FindBy(xpath = "//span[@class='slider round']")
	WebElement primaryToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addButton;

	@FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
	WebElement saveButtoninVenderPopUp;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement close;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public Sourcing() {
		PageFactory.initElements(driver, this);
	}

	public HomePage sourcingCreate() throws Throwable {

		driver.navigate().to("https://avision-demo.getapcs.com/sales/rfq/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumber);

		System.out.println(updatedXpath);

		driver.navigate().to("https://avision-demo.getapcs.com/sales/sourcing/table");

		click(driver, rfqNumberDropDown);
		isSelected(driver, rfqNumberDropDown, "rfqNumberDropDown");
		WebElement rfqNumberDropDownSelectData = driver.findElement(By.xpath(updatedXpath));
		click(driver, rfqNumberDropDownSelectData);

		click(driver, filterButton);

		click(driver, sourcingButton);

		click(driver, addVenderButton);

		click(driver, venderDropDown);
		isSelected(driver, venderDropDown, "venderDropDown");
		click(driver, venderDropDownSelectData);

		click(driver, unitPriceField);
		isSelected(driver, unitPriceField, "unitPriceField");
		unitPriceField.sendKeys("10");

		click(driver, unitPricePerField);
		isSelected(driver, unitPricePerField, "unitPricePerField");
		unitPricePerField.sendKeys("10");

		click(driver, currencyDropDown);
		isSelected(driver, currencyDropDown, "currencyDropDown");
		click(driver, currencyDropDownSelectData);

		click(driver, moqCostField);
		isSelected(driver, moqCostField, "moqCostField");
		moqCostField.sendKeys("50");

		click(driver, leadTimeDropDown);
		isSelected(driver, leadTimeDropDown, "leadTimeDropDown");
		click(driver, leadTimeDropDownSelectData);

		click(driver, freightField);
		isSelected(driver, freightField, "freightField");
		freightField.sendKeys("10");

		click(driver, dutiesField);
		isSelected(driver, dutiesField, "dutiesField");
		dutiesField.sendKeys("10");

		click(driver, quoteQuantityField);
		isSelected(driver, quoteQuantityField, "quoteQuantityField");
		dutiesField.sendKeys("2");

		datePicker(driver, quoteDatePicker);

		return new HomePage();

	}

}
