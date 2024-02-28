package com.Getapcs.Avision.Sales;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class ItemPriceList_CreatePage extends TestBase {
	
	@FindBy(tagName = "body")
	public static WebElement driverIninteractable;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement priceListNameDropDown;

	@FindBy(xpath = "(//span[normalize-space()='TEST Price List 25'])[1]")
	WebElement priceListNameDropDownSelect;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement itemNumberdescriptionField;

	@FindBy(xpath = "(//span[normalize-space()='798878123-Test Description'])[1]")
	WebElement itemNumberdescriptionSearchableFieldSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityTextBox;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement uocDropDown;
	@FindBy(xpath = "//span[text()='INR']")
	WebElement uocDropDownSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Least Cost'])[1]")
	WebElement leastCountTextBox;

	@FindBy(xpath = "(//input[@placeholder='Enter Markup'])[1]")
	WebElement markUpTextBox;

	@FindBy(xpath = "//input[@placeholder='Enter Least Cost Plus']")
	WebElement leastCostPlusTextBox;

	@FindBy(xpath = "(//input[@placeholder='Enter Least Cost Minus'])[1]")
	WebElement leastCostMinusTextBox;

	@FindBy(xpath = "//label[normalize-space()='Is Discount Applicable']/..//span[@class='slider round']")
	WebElement isDiscountApplicableToggleButton;

	@FindBy(xpath = "//input[@placeholder='Enter Discount Plus']")
	WebElement discountPlusTextBox;

	@FindBy(xpath = "//input[@placeholder='Enter Discount Minus']")
	WebElement discountMinusTextBox;

	@FindBy(xpath = "//input[@placeholder='DD-MM-YYYY']")
	WebElement validThroughDatePicker;

	@FindBy(xpath = "//label[normalize-space()='Active Status']/..//span[@class='slider round']")
	WebElement activeStatusToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//span[normalize-space()='Sales'])[1]")
	WebElement sales;

	@FindBy(xpath = "(//span[normalize-space()='Item Price List'])[1]")
	WebElement itemPriceList;

	@FindBy(xpath = "(//a[@routerlink='master/item-price-list/form'])[1]")
	WebElement itemPriceListCreate;

	@FindBy(xpath = "(//span[@class='mdi mdi-menu'])[1]")
	WebElement threeLinesSideBarIcon;

	public ItemPriceList_CreatePage() {
		PageFactory.initElements(driver, this);
	}


	public HomePage ItemPriceListCreate(String quantity, String leastCount, String markUp, String leastCostMinus,
			String discountPlus, String discountMinus) throws InterruptedException {

		driver.navigate().to("https://avision-demo.getapcs.com/master/price-list/table");

		String tableXpath = "//table[@class='table table-striped']";

		String PriceList = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", PriceList);

		System.out.println(updatedXpath);
		Thread.sleep(4000);
		// **************************//
		driver.navigate().to("https://avision-demo.getapcs.com/engineering/engg-bom/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String ItemNumber = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", ItemNumber + "-Test Description");

		System.out.println(updatedXpath1);
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
		click(driver, threeLinesSideBarIcon);
		sales.click();
		itemPriceList.click();
		itemPriceListCreate.sendKeys(Keys.ENTER);
		click(driver, threeLinesSideBarIcon);
		actions.moveToElement(driverIninteractable).perform();

		Thread.sleep(2000);

		// PriceList-Sales Module
		click(driver, priceListNameDropDown);
		isSelected(driver, priceListNameDropDown, "priceListNameDropDown");
		WebElement priceListNameDropDownSelect = driver.findElement(By.xpath(updatedXpath));
		click(driver, priceListNameDropDownSelect);

		// Description Field
		click(driver, itemNumberdescriptionField);
		isSelected(driver, itemNumberdescriptionField, "itemNumberdescriptionField");
		WebElement itemNumberdescriptionSearchableFieldSelect = driver.findElement(By.xpath(updatedXpath1));
		click(driver, itemNumberdescriptionSearchableFieldSelect);

		// Quantity Text Box
		click(driver, quantityTextBox);
		isSelected(driver, quantityTextBox, "quantityTextBox");
		quantityTextBox.clear();
		quantityTextBox.sendKeys(quantity);

		// Verify and Click on UOC DropDown and Select in Create-Item PriceList-Sales
		click(driver, uocDropDown);
		isSelected(driver, uocDropDown, "uocDropDown");
		click(driver, uocDropDownSelect);

		// Verify and Enter Data on Least Count TextBox in Create-Item PriceList-Sales
		click(driver, leastCountTextBox);
		isSelected(driver, leastCountTextBox, "leastCountTextBox");
		leastCountTextBox.clear();
		leastCountTextBox.sendKeys(leastCount);

		// Verify and Enter Data on MarkUp TextBox in Create-Item PriceList-Sales Module
		click(driver, markUpTextBox);
		isSelected(driver, markUpTextBox, "markUpTextBox");
		markUpTextBox.clear();
		markUpTextBox.sendKeys(markUp);

		// Verify and Enter Data on Least Cost Plus TextBox in Create-Item
		click(driver, leastCostPlusTextBox);
		isSelected(driver, leastCostPlusTextBox, "leastCostPlusTextBox");
		leastCostPlusTextBox.clear();
		leastCostPlusTextBox.sendKeys(leastCount);

		// Verify and Enter Data on Least Cost Minus TextBox in Create-Item
		click(driver, leastCostMinusTextBox);
		isSelected(driver, leastCostMinusTextBox, "leastCostMinusTextBox");
		leastCostMinusTextBox.clear();
		leastCostMinusTextBox.sendKeys(leastCostMinus);

		// Verify and Click on IsDiscount Applicable Toggle Button in Create-Item
		click(driver, isDiscountApplicableToggleButton);
		click(driver, isDiscountApplicableToggleButton);

		// Verify and Enter Data on Discount Plus TextBox in Create-Item PriceList-Sales
		click(driver, discountPlusTextBox);
		isSelected(driver, discountPlusTextBox, "discountPlusTextBox");
		discountPlusTextBox.clear();
		discountPlusTextBox.sendKeys(discountPlus);

		// Verify and Enter Data on Discount Minus TextBox in Create-Item
		click(driver, discountMinusTextBox);
		isSelected(driver, discountMinusTextBox, "discountMinusTextBox");
		discountMinusTextBox.clear();
		discountMinusTextBox.sendKeys(discountMinus);

		// Verify Valid Through Date Picker in Create-Item PriceList-Sales Module
		datePicker(driver, validThroughDatePicker);

		// Verify and Click on Active Status Toggle Button in Create-Item
		click(driver, activeStatusToggleButton);
		click(driver, activeStatusToggleButton);

		// Verify and Click on Save Button in Create-Item PriceList-Sales Module
		click(driver, saveButton);
		return new HomePage();

	}
}
