package com.Getapcs.Trans.Sales;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class VerifyLPCostingRelease extends TestBase {

	@FindBy(xpath = "//tbody/tr[1]/td[1]/button[3]")
	WebElement lpCostingReleaseButton;

	@FindBy(xpath = "//label[text()='RFQ Number']/following-sibling::label[@class='field2']")
	WebElement rfqNumberElement;

	@FindBy(xpath = "//label[text()='Customer Name']/following-sibling::label[@class='field2']")
	WebElement customerNameElement;

	@FindBy(xpath = "//input[@placeholder='Markup']")
	WebElement markUpField;

	@FindBy(xpath = "(//input[contains(@placeholder,'-')])[1]")
	WebElement minusField;

	@FindBy(xpath = "(//input[contains(@placeholder,'+')])[1]")
	WebElement plusField;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement priceListDropDown;
	@FindBy(xpath = "(//span[normalize-space()='Final Price'])[1]")
	WebElement priceListDropDownSelectData;

	@FindBy(xpath = "//input[@type='date']")
	WebElement validThroughDatePicker;

	@FindBy(xpath = "//span[@class='slider round']")
	WebElement isDiscountApplicableToggleButton;

	@FindBy(xpath = "(//input[@id='discountMinus0'])[1]")
	WebElement discountMinusField;

	@FindBy(xpath = "(//input[@id='discountPlus0'])[1]")
	WebElement discountPlusField;

	@FindBy(xpath = "//button[normalize-space()='Release']")
	WebElement releaseButton;

	public VerifyLPCostingRelease() {
		PageFactory.initElements(driver, this);

	}

	public HomePage lpCostingRelease() throws InterruptedException {

		System.out.println("\n" + "##### LP Costing Release Start ##### " + "\n");

		click(driver, lpCostingReleaseButton);
		Thread.sleep(2000);

		dataPrint(driver, rfqNumberElement, "rfqNumberElement");

		dataPrint(driver, customerNameElement, "customerNameElement");

		click(driver, markUpField);
		isSelected(driver, markUpField, "markUpField");
		markUpField.clear();
		markUpField.sendKeys("10");

		click(driver, minusField);
		isSelected(driver, minusField, "minusField");
		minusField.clear();
		minusField.sendKeys("5");

		click(driver, plusField);
		isSelected(driver, plusField, "plusField");
		plusField.clear();
		plusField.sendKeys("5");

		click(driver, priceListDropDown);
		isSelected(driver, priceListDropDown, "priceListDropDown");
		click(driver, priceListDropDownSelectData);

		datePicker(driver, validThroughDatePicker);

		click(driver, isDiscountApplicableToggleButton);

		click(driver, discountMinusField);
		isSelected(driver, discountMinusField, "discountMinusField");
		discountMinusField.clear();
		discountMinusField.sendKeys("5");

		click(driver, discountPlusField);
		isSelected(driver, discountPlusField, "discountPlusField");
		discountPlusField.clear();
		discountPlusField.sendKeys("5");

		click(driver, releaseButton);

		System.out.println("\n" + "##### LP Costing Release End ##### " + "\n");

		return new HomePage();
	}

}
