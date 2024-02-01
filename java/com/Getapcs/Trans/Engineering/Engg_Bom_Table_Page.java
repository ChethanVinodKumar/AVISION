package com.Getapcs.Trans.Engineering;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class Engg_Bom_Table_Page extends TestBase {
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

	public Engg_Bom_Table_Page() {
		PageFactory.initElements(driver, this);
	}

	public HomePage EnggBOMTable() throws Exception {

		// Verifying that do we have proper Text heading.
		WebElement HeadingText = driver.findElement(By.xpath("//div[@class='title_sub_div_1 mt-1']"));
		String actualText = HeadingText.getText();
		String ExpectedText = "Engg Bom";
		assertEquals(actualText, ExpectedText);

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

		String xpath = "(//td[normalize-space()='" + searchDataText + "'])[1]";

		assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed(), "It is Not Displayed");

		Thread.sleep(2000);

		driver.navigate().refresh();

//Pagination

		click(driver, paginationLast);

		Thread.sleep(2000);

		click(driver, paginationFirst);

		// Usage
		paginate(driver, 1, 10, true); // forward
		paginate(driver, 1, 10, false); // backward

		return new HomePage();

	}

}
