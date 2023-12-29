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

	@FindBy(xpath = "(//i[@class='mdi mdi-pencil edit-icon'])[1]")
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

	@FindBy(xpath = "//body[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-item-price-list-form[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/label[2]/span[1]")
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

	JavascriptExecutor executor = (JavascriptExecutor) driver;

	public HomePage ItemPriceListEdit(String quantity, String leastCount, String markUp, String leastCostMinus,
			String discountPlus, String discountMinus) throws InterruptedException {

		// Verify Three Line Side Bar in Home Page
		boolean threeLineIconBarIsDisplayed = threeLineIconBar.isDisplayed();
		assertTrue(threeLineIconBarIsDisplayed, "Three Line Icon Bar is not Displayed");
		threeLineIconBar.click();

//			//Verify Sales Module
//			WebElement salesmModule = driver.findElement(By.xpath("//li[@class='nav-item active']"));
//			boolean salesmModuleIsDisplayed = salesmModule.isDisplayed();		
//			assertTrue(salesmModuleIsDisplayed, "SalesmModule is not Displayed");

		// Click on Sales Module
		boolean salesModuledropdownIsDisplayed = salesModuledropdown.isDisplayed();
		assertTrue(salesModuledropdownIsDisplayed, "Sales Module dropdown IsDisplayed.");
		salesModuledropdown.click();

		// Verify and Click on Item Price List in Sales Module
		boolean itemPriceListIsDisplayed = itemPriceList.isDisplayed();
		assertTrue(itemPriceListIsDisplayed, "ItemPrice List Dropdown is not Displayed.");
		itemPriceList.click();

		// Verify and Click on View_Modify in Item Price List-Sales Module
		boolean itmePriceList_VieworModifyIsDisplayed = itmePriceListView_Modify.isDisplayed();
		assertTrue(itmePriceList_VieworModifyIsDisplayed,
				"View/Modify is not Displayed in Item Price List-Sales Module.");
		itmePriceListView_Modify.click();
		driver.navigate().to("https://demo_keus.getapcs.com/master/price-list/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String PriceList = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", PriceList);

		System.out.println(updatedXpath);
		Thread.sleep(4000);
		// **************************//
		driver.navigate().to("https://demo_keus.getapcs.com/master/item-price-list/table");

		// Verify and Click on Price List Name DropDown in Item Price List-Sales Module
		boolean priceListNameDropDownIsDisplayed = priceListNameDropDown.isDisplayed();
		assertTrue(priceListNameDropDownIsDisplayed,
				"Price List Name DropDown is not Displayed in View/Modify-Item Price List-Sales Module.");
		priceListNameDropDown.sendKeys(Keys.ENTER);

		WebElement priceListNameDropDownSelect = driver.findElement(By.xpath(updatedXpath));
		js.executeScript("arguments[0].click();", priceListNameDropDownSelect);

		// Verify and Click on Edit Button in Item Price List-Sales Module
		boolean editButtonIsDisplayed = editButton.isDisplayed();
		assertTrue(editButtonIsDisplayed, "Edit Button Is not Displayed");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", editButton);

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
		boolean quantityFieldIsDisplayed = quantityField.isDisplayed();
		assertTrue(quantityFieldIsDisplayed,
				"Quantity Field in Edit Page is not Displayed in View/Modify-Item Price List-Sales Module.");
		quantityField.clear();
		quantityField.sendKeys(quantity);

		// Verify and Click on UOC Drop Down in Item Price List-Edit Page-Sales Module
		boolean uocDropDownIsDisplayed = uocDropDown.isDisplayed();
		assertTrue(uocDropDownIsDisplayed,
				"UOC Drop Down in Edit Page is not Displayed in View/Modify-Item Price List-Sales Module.");
		uocDropDown.sendKeys(Keys.ENTER);
		uocDropDown.sendKeys(Keys.ENTER);

		// Verify and Click on Least Cost Field in Item Price List-Edit Page-Sales
		// Module
		boolean leastCostFieldIsDisplayed = leastCostField.isDisplayed();
		assertTrue(leastCostFieldIsDisplayed,
				"Least Cost in Edit Page is not Displayed in View/Modify-Item Price List-Sales Module.");
		leastCostField.clear();
		leastCostField.sendKeys(leastCount);

		// Verify and Click on MarkUp Field in Item Price List-Edit Page-Sales Module
		boolean markUpFieldIsDisplayed = markUpField.isDisplayed();
		assertTrue(markUpFieldIsDisplayed,
				"MarkUp Field in Edit Page is not Displayed in View/Modify-Item Price List-Sales Module.");
		markUpField.clear();
		markUpField.sendKeys(markUp);

		// Verify and Click on Least Cost Plus Field in Item Price List-Edit Page-Sales
		// Module
		boolean leastCostPlusFieldIsDisplayed = leastCostPlusField.isDisplayed();
		assertTrue(leastCostPlusFieldIsDisplayed,
				"Least Cost Plus Field in Edit Page is not Displayed in View/Modify-Item Price List-Sales Module.");
		leastCostPlusField.clear();
		leastCostPlusField.sendKeys("50");

		// Verify and Click on Least Cost Minus Field in Item Price List-Edit Page-Sales
		// Module
		boolean leastCostMinusFieldIsDisplayed = leastCostMinusField.isDisplayed();
		assertTrue(leastCostMinusFieldIsDisplayed,
				"Least Cost Minus Field in Edit Page is not Displayed in View/Modify-Item Price List-Sales Module.");
		leastCostMinusField.clear();
		leastCostMinusField.sendKeys(leastCostMinus);

		// Verify The Is Discount Applicable Toggle Button is Editable or not in View
		// Page-Item Price List-Sales Module
		boolean isDiscountApplicableToggleButtonIsDisplayed = isDiscountApplicableToggleButton.isDisplayed();
		assertTrue(isDiscountApplicableToggleButtonIsDisplayed,
				"Is Discount Applicable Toggle Button is not Displayed");
		isDiscountApplicableToggleButton.click();
		isDiscountApplicableToggleButton.click();

		// Verify and Click on Discount Plus Field in Item Price List-Edit Page-Sales
		// Module
		boolean discountPlusFieldIsDisplayed = discountPlusField.isDisplayed();
		assertTrue(discountPlusFieldIsDisplayed,
				"Discount Plus Field in Edit Page is not Displayed in View/Modify-Item Price List-Sales Module.");
		discountPlusField.clear();
		discountPlusField.sendKeys(discountPlus);

		// Verify and Click on Discount Minus Field in Item Price List-Edit Page-Sales
		// Module
		boolean discountMinusFieldIsDisplayed = discountMinusField.isDisplayed();
		assertTrue(discountMinusFieldIsDisplayed,
				"Discount Minus Field in Edit Page is not Displayed in View/Modify-Item Price List-Sales Module.");
		discountMinusField.clear();
		discountMinusField.sendKeys(discountMinus);

		// Verify The Valid Through Date Picker is Editable or not in View Page-Item
		// Price List-Sales Module
		validThroughDatePicker.click();
		boolean validThroughDatePickerIsDisplayed = validThroughDatePicker.isDisplayed();
		assertTrue(validThroughDatePickerIsDisplayed, "Valid Through Date Picker is not Displayed.");
//            executor.executeScript("arguments[0].click();", validThroughDatePicker);
//            Thread.sleep(3000);
		// Clear Date
//            validThroughDatePicker.sendKeys(Keys.TAB);
//            validThroughDatePicker.sendKeys(Keys.ENTER);

		for (int i = 0; i < 3; i++) {
			validThroughDatePicker.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500); // Add a small delay if needed
		}
		validThroughDatePicker.sendKeys(Keys.ARROW_RIGHT);
		validThroughDatePicker.sendKeys(Keys.ENTER);

		// Verify The Active Status Toggle Button is Editable or not in View Page-Item
		// Price List-Sales Module
		boolean activeStatusToggleButtonIsDisplayed = activeStatusToggleButton.isDisplayed();
		assertTrue(activeStatusToggleButtonIsDisplayed, "Active Status Toggle Button is not Displayed.");
		activeStatusToggleButton.click();
		activeStatusToggleButton.click();

		// Verify and Click on Save Button in Edit Page-Item Price List-Sales Module
		boolean saveButtonIsDisplayed = saveButton.isDisplayed();
		assertTrue(saveButtonIsDisplayed, "Save Button is not Displayed.");
		saveButton.click();

		// Verify and Click on Yes Button in Edit Page-Item Price List-Sales Module
		boolean yesButtonIsDisplayed = yesButton.isDisplayed();
		assertTrue(yesButtonIsDisplayed, "Yes Button is not Displayed.");
		yesButton.click();

//            //Verify and Click on No Button in Edit Page-Item Price List-Sales Module
//            WebElement noButton = driver.findElement(By.xpath("//button[normalize-space()='No']"));
//            boolean noButtonIsDisplayed = noButton.isDisplayed();
//            assertTrue(noButtonIsDisplayed, "No Button is not Displayed.");
//            noButton.click();
		Thread.sleep(3000);

		driver.navigate().refresh();

		// Verify and Click on Price List Name DropDown1 in Item Price List-Sales Module
		boolean priceListNameDropDown1IsDisplayed = priceListNameDropDown.isDisplayed();
		assertTrue(priceListNameDropDown1IsDisplayed,
				"Price List Name DropDown1 is not Displayed in View/Modify-Item Price List-Sales Module.");
		click(driver, priceListNameDropDown);

		WebElement priceListNameDropDownSelect1 = driver.findElement(By.xpath(updatedXpath));
		js.executeScript("arguments[0].click();", priceListNameDropDownSelect1);
		return new HomePage();

	}

}
