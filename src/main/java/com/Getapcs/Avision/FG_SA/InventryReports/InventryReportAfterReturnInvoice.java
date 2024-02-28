package com.Getapcs.Avision.FG_SA.InventryReports;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class InventryReportAfterReturnInvoice extends TestBase {

	@FindBy(xpath = "(//span[@class='dropdown-multiselect__caret'])[1]")
	WebElement partType;

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[2]")
	WebElement projectNumber;

	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	WebElement searchPartType;

	@FindBy(xpath = "(//input[@placeholder='Search'])[3]")
	WebElement searchprojectNumber;

	@FindBy(xpath = "(//button[normalize-space()='Filter'])[1]")
	WebElement filter;

	@FindBy(xpath = "(//i[@title='CLick to view'])[1]")
	WebElement editButton;

	@FindBy(xpath = "(//i[@title='Add Project'])[1]")
	WebElement addProject;

	@FindBy(xpath = "(//i[@title='Click to view'])[1]")
	WebElement viewButton;

	@FindBy(xpath = "(//i[@title='Click to view'])[1]")
	WebElement viewButton1;

	public InventryReportAfterReturnInvoice() {

		PageFactory.initElements(driver, this);

	}

	// ****Inventry Report Page*******//

	public HomePage InventryReportPage(String fileName) throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/return-invoice-list/table");

		click(driver, viewButton);

		String tableXpath = "//table[@class='table mb-2']";

		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText().trim()
				.replaceAll(" - .*", ""); 


		// Store the element with hard coded PR number
		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1);

		System.out.println(updatedXpath);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/delivery-order/table");

		click(driver, viewButton1);

		String orderBalanceQty = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[8]")).getText();

		driver.navigate().to("https://avision-demo.getapcs.com/reports/inventory-report");

//Part Type

		click(driver, partType);

		click(driver, searchPartType);
		searchPartType.sendKeys(partType1);

		WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, partTypeSelect);

//		click(driver, searchPartType);
//		searchPartType.clear();
//		searchPartType.sendKeys(partType2);
//
//		WebElement partTypeSelect1 = driver.findElement(By.xpath(updatedXpath1));
//
//		click(driver, partTypeSelect1);

//Filter

		click(driver, filter);

		// Find the table
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-striped']"));

		// Find all rows in the table body
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

		// Initialize variables for storing balance quantities and the total
		double totalBalanceQuantity = 0.0;

		// Iterate through each row
		for (WebElement row : rows) {
			// Find the balance quantity cell in the current row
			WebElement balanceQuantityCell = row.findElement(By.xpath("./td[8]")); // Adjust the column index if needed
			String balanceQuantityText = balanceQuantityCell.getText();

			// Convert balance quantity text to double
			double balanceQuantity = Double.parseDouble(balanceQuantityText);

			// Add the balance quantity to the total
			totalBalanceQuantity += balanceQuantity;

			System.out.println("balanceQuantity : "+balanceQuantity);
		}

		// Cast totalBalanceQuantity to int
		double totalBalanceQuantityInt = (double) totalBalanceQuantity;
		double totalBalanceQuantityIntRoundedValue = Math.ceil(totalBalanceQuantityInt);

		// Print the total balance quantity as integer
		System.out.println("Total Balance Quantity: " + totalBalanceQuantityIntRoundedValue);

		double expectedorderBalanceQty = Integer.parseInt(orderBalanceQty);

		System.out.println("Expected: " + expectedorderBalanceQty);
		System.out.println("Actual: " + totalBalanceQuantityIntRoundedValue);

		assertEquals(expectedorderBalanceQty, totalBalanceQuantityIntRoundedValue);

		Thread.sleep(4000);
		screenShot(fileName);

		return new HomePage();
	}

}