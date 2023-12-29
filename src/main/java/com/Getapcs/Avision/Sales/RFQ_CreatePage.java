package com.Getapcs.Avision.Sales;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class RFQ_CreatePage extends TestBase {

	@FindBy(xpath = "//button[@class='navbar-toggler navbar-toggler align-self-center']//span[@class='mdi mdi-menu']")
	WebElement threeLineIconBar;

	@FindBy(xpath = "(//span[normalize-space()='Sales'])[1]")
	WebElement salesModuledropdown;

	@FindBy(xpath = "//span[text()='RFQ']")
	WebElement rfq;

	@FindBy(xpath = "//a[@routerlink='sales/rfq/create']")
	WebElement createRFQ;

	@FindBy(xpath = "//input[@formcontrolname='rfqNumber']")
	WebElement rfqNumberField;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement customerNameDropDown;
	@FindBy(xpath = "(//span[normalize-space()='CS12369 - Avision Systems Pvt Ltd'])[1]")
	WebElement customerNameDropDownSelectData;

	@FindBy(xpath = "//input[@placeholder='Enter Customer Rfq Number']")
	WebElement customerRFQNumberField;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement requestReceiveDatePicker;

	@FindBy(xpath = "(//input[@formcontrolname='quotesExpectedDate'])[1]")
	WebElement quoteExpectDatePicker;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement typeOfSolution;

	@FindBy(xpath = "(//span[normalize-space()='Automation'])[1]")
	WebElement typeOfSolutionSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement productType;

	@FindBy(xpath = "(//span[normalize-space()='Upsell - Endo'])[1]")
	WebElement productTypeSelect;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement roomName;

	@FindBy(xpath = "(//span[normalize-space()='Home'])[1]")
	WebElement roomNameSelect;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement itemNumber;

	@FindBy(xpath = "(//span[normalize-space()='798878123-Test Description'])[1]")
	WebElement itemNumberSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[1]")
	WebElement quantity;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement close;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//a[normalize-space()='Notes'])[1]")
	WebElement notesTab;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement category;

	@FindBy(xpath = "(//span[normalize-space()='TEST Category'])[1]")
	WebElement categorySelect;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Note'])[1]")
	WebElement note;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement salesPerson;

	@FindBy(xpath = "(//span[normalize-space()='Abhilashpatil'])[1]")
	WebElement salesPersonSelect;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement closeButton;

	public RFQ_CreatePage() {
		PageFactory.initElements(driver, this);
	}

	JavascriptExecutor executor = (JavascriptExecutor) driver;

	public HomePage RFQCreate() throws Throwable {

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/engg-bom/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		click(driver, threeLineIconBar);

		click(driver, salesModuledropdown);

		click(driver, rfq);

		click(driver, createRFQ);

		// Customer Name

		click(driver, rfqNumberField);
		isSelected(driver, rfqNumberField, "rfqNumberField");
		rfqNumberField.sendKeys("RFQ-" + ItemNumber);

		// Click on Customer Name Drop Down RFQ Create Page-Sales Module
		click(driver, customerNameDropDown);
		isSelected(driver, customerNameDropDown, "customerNameDropDown");
		click(driver, customerNameDropDownSelectData);

		// Customer RFQ Number
		click(driver, customerRFQNumberField);
		isSelected(driver, customerRFQNumberField, "customerRFQNumberField");
		customerRFQNumberField.sendKeys("CSRFQ-" + ItemNumber);

		// Verify and Click on Save Button in Create-Item PriceList-Sales Module
		click(driver, saveButton);

		Thread.sleep(3000);
		return new HomePage();

	}

}
