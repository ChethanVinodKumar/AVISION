package com.Getapcs.Avision.Sales;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class VerifySourcing extends TestBase {

	public static final String unitPrice = "120";
	public static final String freight = "3";
	public static final String duities = "5";

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement rfqNumberDropDown;

	@FindBy(xpath = "//button[normalize-space()='Filter']")
	WebElement filterButton;

	@FindBy(xpath = "//button[text()='Sourcing']")
	WebElement sourcingButton;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-box-outline edit-icon'])[1]")
	WebElement addVenderButton;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement venderDropDown;
	@FindBy(xpath = "//span[normalize-space()='ABSOLUTE COMPOSITES PRIVATE LIMITED']")
	WebElement venderDropDownSelectData;

	@FindBy(xpath = "//input[@formcontrolname='unitPrice']")
	WebElement unitPriceField;

	@FindBy(xpath = "//input[@formcontrolname='unitPricePer']")
	WebElement unitPricePerField;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement currencyDropDown;
	@FindBy(xpath = "//span[normalize-space()='INR']")
	WebElement currencyDropDownSelectData;

	@FindBy(xpath = "(//table[@class='table table-striped']/tbody/tr[1]/td[3])[2]")
	WebElement Qtyrequest;

	@FindBy(xpath = "//input[@placeholder='Enter MOQ']")
	WebElement moqCostField;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement leadTimeDropDown;
	@FindBy(xpath = "(//div[@role='option'])[1]")
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

	@FindBy(xpath = "(//table[@class='table table-striped'])[3]/tbody/tr[1]/td[15]")
	WebElement moqCostValue;

	@FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
	WebElement saveButtoninVenderPopUp;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement close;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public VerifySourcing() {
		PageFactory.initElements(driver, this);
	}

	public HomePage sourcingCreate() throws Throwable {

		System.out.println("\n" + "######## Sourcing Started ##########" + "\n");

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
		unitPriceField.sendKeys(unitPrice);
		double unitPrice2 = Integer.parseInt(unitPrice);

		click(driver, unitPricePerField);
		isSelected(driver, unitPricePerField, "unitPricePerField");
		unitPricePerField.sendKeys("10");

		click(driver, currencyDropDown);
		isSelected(driver, currencyDropDown, "currencyDropDown");
		click(driver, currencyDropDownSelectData);

		String elementValue = Qtyrequest.getText().trim();
		System.out.println("Qtyrequest : " + elementValue + "\n");
		double requiredQtyValue = Integer.parseInt(elementValue);
		double moqQty = requiredQtyValue + requiredQtyValue + 289;

		click(driver, moqCostField);
		isSelected(driver, moqCostField, "moqCostField");
		moqCostField.sendKeys(String.valueOf(moqQty));

		click(driver, leadTimeDropDown);
		isSelected(driver, leadTimeDropDown, "leadTimeDropDown");
		click(driver, leadTimeDropDownSelectData);

		click(driver, freightField);
		isSelected(driver, freightField, "freightField");
		freightField.sendKeys(freight);
		double freight2 = Integer.parseInt(freight);

		click(driver, dutiesField);
		isSelected(driver, dutiesField, "dutiesField");
		dutiesField.sendKeys(duities);
		double duities2 = Integer.parseInt(duities);

		click(driver, quoteQuantityField);
		isSelected(driver, quoteQuantityField, "quoteQuantityField");
		quoteQuantityField.sendKeys("1");

		double freight1 = unitPrice2 * (freight2 / 100);
		double duities1 = unitPrice2 * (duities2 / 100);

		double landingPrice = unitPrice2 + freight1 + duities1;

		double remainingQty = moqQty - requiredQtyValue;

		double moqCost = remainingQty * landingPrice / requiredQtyValue;

		String moqCost1 = String.format("%.2f", moqCost);

		System.out.println("moqCost : " + moqCost1);

		datePicker(driver, quoteDatePicker);

		datePicker(driver, quoteValidityDatePicker);

		uploadFile(driver, uploadFile, 1);

		click(driver, addButton);

		String moqCostValue1 = moqCostValue.getText().trim();
		System.out.println("Qtyrequest : " + moqCostValue1 + "\n" + "moqCost1 : " + moqCost1);

		assertEquals(moqCostValue1, moqCost1);

		click(driver, saveButtoninVenderPopUp);

		click(driver, saveButton);

		System.out.println("\n" + "######## Sourcing Ended ##########" + "\n");

		return new HomePage();

	}

}
