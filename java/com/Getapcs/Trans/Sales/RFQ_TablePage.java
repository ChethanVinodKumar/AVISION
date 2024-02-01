package com.Getapcs.Trans.Sales;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class RFQ_TablePage extends TestBase {
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

	public RFQ_TablePage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage RFQ_Table() throws InterruptedException {

		// Verifying that do we have proper Text heading.
		WebElement HeadingText = driver.findElement(By.xpath("//div[@class='title_sub_div_1 mt-1']"));
		String actualText = HeadingText.getText();
		String ExpectedText = "RFQ";
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

		Thread.sleep(5000);

		driver.navigate().refresh();

//Pagination

		click(driver, paginationLast);

		Thread.sleep(2000);

		click(driver, paginationFirst);

		int totalPages = driver.findElements(By.cssSelector(".pagination a")).size();

		// Loop through each pagination link in Forward iteration
		for (int i = 1; i <= totalPages; i++) {
			System.out.println("Clicking on pagination link #" + i);
			WebElement pageLink = driver.findElement(By.partialLinkText(String.valueOf(i)));
			js.executeScript("arguments[0].click();", pageLink);
			Thread.sleep(2000);

			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

			// Wait for the page to load
			wait1.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));

			System.out.println("Page #" + i + " loaded successfully.");
			// You can now interact with the loaded page.
		}

		// Backward iteration
		for (int i = totalPages; i >= 1; i--) {
			System.out.println("Clicking on pagination link #" + i);
			WebElement pageLink = driver.findElement(By.partialLinkText(String.valueOf(i)));
			js.executeScript("arguments[0].click();", pageLink);
			Thread.sleep(2000);

			// Wait for the page to load
			wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));

			System.out.println("Page #" + i + " loaded successfully.");
			// You can now interact with the loaded page.

		}
		return new HomePage();

	}
}
