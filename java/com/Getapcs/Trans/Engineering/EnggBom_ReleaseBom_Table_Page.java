package com.Getapcs.Trans.Engineering;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class EnggBom_ReleaseBom_Table_Page extends TestBase {
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

	@FindBy(xpath = "(//td[normalize-space()='FG-45'])[1]")
	WebElement searchData1;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[2]")
	WebElement searchData;

	@FindBy(xpath = "(//a[normalize-space()='Costing'])[1]")
	WebElement costing;

	@FindBy(xpath = "(//a[normalize-space()='Production'])[1]")
	WebElement production;

	public EnggBom_ReleaseBom_Table_Page() {
		PageFactory.initElements(driver, this);
	}

	public HomePage EnggBOMReleaseBomTable() throws InterruptedException {

		// Verifying that do we have proper Text heading.
		WebElement HeadingText = driver.findElement(By.xpath("//div[@class='title_sub_div_1 mt-1']"));
		String actualText = HeadingText.getText();
		String ExpectedText = "Release BOM";
		assertEquals(actualText, ExpectedText);

		for (int m = 0; m < 3; m++) {
//Search Text Field

			if (m == 1) {
				click(driver, costing);
			}
			if (m == 2) {
				click(driver, production);
			}
			click(driver, searchTextField);

			isSelected(driver, searchTextField, "searchTextField");

			String searchDataText = searchData.getText();
			System.out.println(searchDataText);

			searchTextField.sendKeys(searchDataText);

			click(driver, searchButton);

			Thread.sleep(5000);

			driver.navigate().refresh();
			if (m == 1) {
				click(driver, costing);
			}
			if (m == 2) {
				click(driver, production);
			}

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
		}
		return new HomePage();

	}

}
