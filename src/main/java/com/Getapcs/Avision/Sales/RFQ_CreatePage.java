package com.Getapcs.Avision.Sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class RFQ_CreatePage extends TestBase {
	@FindBy(tagName = "body")
	public static WebElement driverIninteractable;

	@FindBy(xpath = "//input[@formcontrolname='rfqNumber']")
	WebElement rfqNumberField;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement customerNameDropDown;
	@FindBy(xpath = "(//span[normalize-space()='ASPL|CS|23-24|004 - AVision Systems Pvt Ltd .'])[1]")
	WebElement customerNameDropDownSelectData;

	@FindBy(xpath = "//input[@placeholder='Enter Customer Rfq Number']")
	WebElement customerRFQNumberField;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement requestReceiveDatePicker;

	@FindBy(xpath = "(//input[@formcontrolname='quotesExpectedDate'])[1]")
	WebElement quoteExpectDatePicker;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public RFQ_CreatePage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage RFQCreate() throws Throwable {

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/engg-bom/table");

		String tableXpath = "//table[@class='table table-striped']";
		actions.moveToElement(driverIninteractable).perform();
		Thread.sleep(2000);

		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		driver.navigate().to("https://avision-demo.getapcs.com/sales/rfq/create");

		// RFQ Num

		click(driver, rfqNumberField);
		isSelected(driver, rfqNumberField, "rfqNumberField");
		rfqNumberField.sendKeys("RFQ-" + ItemNumber);

		// Customer Name

		click(driver, customerNameDropDown);
		isSelected(driver, customerNameDropDown, "customerNameDropDown");
		click(driver, customerNameDropDownSelectData);

		// Customer RFQ Number

		click(driver, customerRFQNumberField);
		isSelected(driver, customerRFQNumberField, "customerRFQNumberField");
		customerRFQNumberField.sendKeys("CSRFQ-" + ItemNumber);

		// Request Receiver Date Picker

		click(driver, requestReceiveDatePicker);
		
		selectPreviousDate(driver, requestReceiveDatePicker, 5);

		// Quote Date Picker

		click(driver, quoteExpectDatePicker);

		datePicker(driver, quoteExpectDatePicker);

		// Save Button

		click(driver, saveButton);

		Thread.sleep(3000);
		return new HomePage();

	}

}
