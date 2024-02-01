package com.Getapcs.Trans.Sales;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class ItemPriceList_TablePage extends TestBase {
	@FindBy(xpath = "(//select)[1]")
	WebElement pageSize;

	@FindBy(xpath = "//input[@id='example-search-input']")
	WebElement searchTextField;

	@FindBy(xpath = "(//i[@class='mdi mdi-magnify search_icon'])[1]")
	WebElement searchButton;

	@FindBy(xpath = "(//span[normalize-space()='»»'])[1]")
	WebElement paginationLast;

	@FindBy(xpath = "(//span[normalize-space()='««'])[1]")
	WebElement paginationFirst;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//table[@class='table table-striped'])[1]")
	WebElement table;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[2]")
	WebElement searchData;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement priceListNameDropDown;

	public ItemPriceList_TablePage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage ItemPriceListTable() throws InterruptedException {

		// Verifying that do we have proper Text heading.
		WebElement HeadingText = driver.findElement(By.xpath("//div[@class='title_sub_div_1 mt-1']"));
		String actualText = HeadingText.getText();
		String ExpectedText = "Item Price List";
		assertEquals(actualText, ExpectedText);

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

//Page Size

		click(driver, pageSize);

		Thread.sleep(3000);
		Select select1 = new Select(pageSize);
		select1.selectByValue("50");

		Thread.sleep(3000);
		select1.selectByValue("100");

		Thread.sleep(3000);
		select1.selectByValue("500");

		Thread.sleep(3000);
		select1.selectByValue("10");

		Thread.sleep(3000);

//Search Text Field

		click(driver, searchTextField);

		isSelected(driver, searchTextField, "searchTextField");

		String searchDataText = searchData.getText();
		System.out.println(searchDataText);

		searchTextField.sendKeys(searchDataText);

		click(driver, searchButton);

		Thread.sleep(5000);

		driver.navigate().refresh();

		return new HomePage();

	}
}
