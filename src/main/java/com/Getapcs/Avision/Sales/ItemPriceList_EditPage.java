package com.Getapcs.Avision.Sales;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class ItemPriceList_EditPage extends TestBase {

	@FindBy(xpath = "//button[@class='navbar-toggler navbar-toggler align-self-center']//span[@class='mdi mdi-menu']")
	WebElement threeLineIconBar;

	@FindBy(xpath = "(//span[normalize-space()='Sales'])[1]")
	WebElement salesModuledropdown;

	@FindBy(xpath = "//span[contains(text(),'Item Price List')]")
	WebElement itemPriceList;

	@FindBy(xpath = "//a[@routerlink='master/item-price-list/table']")
	WebElement itmePriceListView_Modify;

	@FindBy(xpath = "(//i[@title='Click to edit'])[1]")
	WebElement editButton;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement priceListNameDropDown;

	@FindBy(xpath = "(//span[normalize-space()='TEST Price_List'])[1]")
	WebElement priceListNameDropDownSelect;

	@FindBy(xpath = "(//span[normalize-space()='TEST Price_List'])[1]")
	WebElement priceListNameDropDownInEditPage;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement itemNumberDescriptionField;

	@FindBy(xpath = "(//span[normalize-space()='77744455-Test Description'])[1]")
	WebElement itemNumberSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement quantityField;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement uocDropDown;

	@FindBy(xpath = "//span[text()='INR']")
	WebElement uocDropDownSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Least Cost'])[1]")
	WebElement leastCostField;

	@FindBy(xpath = "(//input[@placeholder='Enter Markup'])[1]")
	WebElement markUpField;

	@FindBy(xpath = "//input[@placeholder='Enter Least Cost Plus']")
	WebElement leastCostPlusField;

	@FindBy(xpath = "(//input[@placeholder='Enter Least Cost Minus'])[1]")
	WebElement leastCostMinusField;

	@FindBy(xpath = "//label[normalize-space()='Is Discount Applicable']/..//span[@class='slider round']")
	WebElement isDiscountApplicableToggleButton;

	@FindBy(xpath = "//input[@placeholder='Enter Discount Plus']")
	WebElement discountPlusField;

	@FindBy(xpath = "//input[@placeholder='Enter Discount Minus']")
	WebElement discountMinusField;

	@FindBy(xpath = "//input[@placeholder='DD-MM-YYYY']")
	WebElement validThroughDatePicker;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement activeStatusToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "//button[normalize-space()='Yes']")
	WebElement yesButton;

	public ItemPriceList_EditPage() {
		PageFactory.initElements(driver, this);
	}


	public HomePage ItemPriceListEdit(String quantity, String leastCount, String markUp, String leastCostMinus,
			String discountPlus, String discountMinus) throws InterruptedException {

		
		driver.navigate().to("https://avision-demo.getapcs.com/master/price-list/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String PriceList = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", PriceList);

		System.out.println(updatedXpath);
		Thread.sleep(4000);
		// **************************//
		driver.navigate().to("https://avision-demo.getapcs.com/master/item-price-list/table");

		// Verify and Click on Price List Name DropDown in Item Price List-Sales Module
		click(driver, priceListNameDropDown);

		WebElement priceListNameDropDownSelect = driver.findElement(By.xpath(updatedXpath));
		click(driver, priceListNameDropDownSelect);

		// Verify and Click on Edit Button in Item Price List-Sales Module
		click(driver, editButton);

//	        //Verify and Click on Price List Name DropDown in Item Price List-Edit Page-Sales Module
//	        boolean priceListNameDropDownInEditPageIsDisplayed = priceListNameDropDownInEditPage.isDisplayed();
//	        assertTrue(priceListNameDropDownInEditPageIsDisplayed, "Price List Name DropDown in Edid Page is not Displayed in View/Modify-Item Price List-Sales Module.");	
//	        priceListNameDropDownInEditPage.sendKeys(Keys.ENTER);
//	        priceListNameDropDownInEditPage.sendKeys("TEST Price List");
//	        driver.findElement(By.xpath("//span[normalize-space()='TEST Price_List']")).click();
//		    
		// Verify and Click on Item Number Description Field in Item Price List-Edit
		// Page-Sales Module
//	        boolean itemNumberDescriptionFieldIsDisplayed = itemNumberDescriptionField.isDisplayed();
//	        assertTrue(itemNumberDescriptionFieldIsDisplayed, "Item Number Description Field in Edit Page is not Displayed in View/Modify-Item Price List-Sales Module.");	  
//	        Thread.sleep(2000);
//		itemNumberDescriptionField.sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		itemNumberDescriptionField.sendKeys(Keys.CONTROL + "a");
//		Thread.sleep(2000);
//		itemNumberDescriptionField.sendKeys(Keys.BACK_SPACE);

//		js.executeScript("arguments[0].click();", itemNumberSelect);
		// Verify and Click on Quantity Field in Item Price List-Edit Page-Sales Module
		click(driver, quantityField);
		isSelected(driver, quantityField, "quantityField");
		quantityField.clear();
		quantityField.sendKeys(quantity);

		// Verify and Click on UOC Drop Down in Item Price List-Edit Page-Sales Module
		click(driver, uocDropDown);
		isSelected(driver, uocDropDown, "uocDropDown");
		uocDropDown.sendKeys(Keys.ENTER);

		// Verify and Click on Least Cost Field in Item Price List-Edit Page-Sales
		click(driver, leastCostField);
		isSelected(driver, leastCostField, "leastCostField");
		leastCostField.clear();
		leastCostField.sendKeys(leastCount);

		// Verify and Click on MarkUp Field in Item Price List-Edit Page-Sales Module
		click(driver, markUpField);
		isSelected(driver, markUpField, "markUpField");
		markUpField.clear();
		markUpField.sendKeys(markUp);

		// Verify and Click on Least Cost Plus Field in Item Price List-Edit Page-Sales
		click(driver, leastCostPlusField);
		isSelected(driver, leastCostPlusField, "leastCostPlusField");
		leastCostPlusField.clear();
		leastCostPlusField.sendKeys("50");

		// Verify and Click on Least Cost Minus Field in Item Price List-Edit Page-Sales
		click(driver, leastCostMinusField);
		isSelected(driver, leastCostMinusField, "leastCostMinusField");
		leastCostMinusField.clear();
		leastCostMinusField.sendKeys(leastCostMinus);

		// Verify The Is Discount Applicable Toggle Button is Editable or not in View
		click(driver, isDiscountApplicableToggleButton);
		click(driver, isDiscountApplicableToggleButton);

		// Verify and Click on Discount Plus Field in Item Price List-Edit Page-Sales
		click(driver, discountPlusField);
		isSelected(driver, discountPlusField, "discountPlusField");
		discountPlusField.clear();
		discountPlusField.sendKeys(discountPlus);

		// Verify and Click on Discount Minus Field in Item Price List-Edit Page-Sales
		click(driver, discountMinusField);
		isSelected(driver, discountMinusField, "discountMinusField");
		discountMinusField.clear();
		discountMinusField.sendKeys(discountMinus);

		// Verify The Valid Through Date Picker is Editable or not in View Page-Item
		datePicker(driver, validThroughDatePicker);

		// Verify The Active Status Toggle Button is Editable or not in View Page-Item
		click(driver, activeStatusToggleButton);
		click(driver, activeStatusToggleButton);

		// Verify and Click on Save Button in Edit Page-Item Price List-Sales Module
		click(driver, saveButton);

		// Verify and Click on Yes Button in Edit Page-Item Price List-Sales Module
		click(driver, yesButton);

//            //Verify and Click on No Button in Edit Page-Item Price List-Sales Module
//            WebElement noButton = driver.findElement(By.xpath("//button[normalize-space()='No']"));
//            boolean noButtonIsDisplayed = noButton.isDisplayed();
//            assertTrue(noButtonIsDisplayed, "No Button is not Displayed.");
//            noButton.click();
		Thread.sleep(3000);

		driver.navigate().refresh();

		// Verify and Click on Price List Name DropDown1 in Item Price List-Sales Module
		click(driver, priceListNameDropDown);

		WebElement priceListNameDropDownSelect1 = driver.findElement(By.xpath(updatedXpath));
		click(driver, priceListNameDropDownSelect1);
		return new HomePage();

	}

}
