package com.Getapcs.Trans.Transaction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class MaterialIssue extends TestBase {

	// Material Issue

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Issue Material'])[1]")
	WebElement issueMaterial;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	WebElement issueCheckBox;

	@FindBy(xpath = "(//button[normalize-space()='Issue'])[1]")
	WebElement issueButton;

	public MaterialIssue() {

		PageFactory.initElements(driver, this);

	}

	// *************Material Issue Page******************//

	public HomePage MaterialIssuePage() throws InterruptedException {

		js.executeScript("arguments[0].click();", issueMaterial);

		System.out.println("//************Material Issue***************//");

////Project Type
//
//		String projectTypexpath = "//label[text()='Project Type']/..//label[@class='field2']";
//		
//		String projectType = driver.findElement(By.xpath(projectTypexpath)).getText();
//		
//		System.out.println("Project Type is : "+projectType);
//		Thread.sleep(2000);  

//Item Type

		String itemTypexpath = "//label[text()='Item Type']/..//label[@class='field2']";

		String itemType = driver.findElement(By.xpath(itemTypexpath)).getText();

		System.out.println("item Type is : " + itemType);
		Thread.sleep(2000);

//Work Order Number

		String workOrderNumberxpath = "//label[text()='Shop Order Number']/..//label[@class='field2']";

		String workOrderNumber = driver.findElement(By.xpath(workOrderNumberxpath)).getText();

		System.out.println("Work Order Number is : " + workOrderNumber);
		Thread.sleep(2000);

//Item Number

		String itemNumberxpath = "//label[text()='Item Number']/..//label[@class='field2']";

		String itemNumber = driver.findElement(By.xpath(itemNumberxpath)).getText();

		System.out.println("Item Number is : " + itemNumber);
		Thread.sleep(2000);

//So Close Date

		String soCLoseDatexpath = "//label[text()='So Close Date']/..//label[@class='field2']";

		String soCLoseDate = driver.findElement(By.xpath(soCLoseDatexpath)).getText();

		System.out.println("So Close Date is : " + soCLoseDate);
		Thread.sleep(2000);

//Work Order Released Qty

		String workOrderReleasedQtyxpath = "//label[text()='Shop Order Released Qty']/..//label[@class='field2']";

		String workOrderReleasedQty = driver.findElement(By.xpath(workOrderReleasedQtyxpath)).getText();

		System.out.println("Work Order Released Qty is : " + workOrderReleasedQty);
		Thread.sleep(2000);

		WebElement table = driver.findElement(By.xpath("//table[@formarrayname='ItemData']"));

		// Fetch values from each cell in the table
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.xpath(".//td"));

			String slNo = cells.get(1).getText();
			String partNo = cells.get(2).findElement(By.xpath(".//div")).getText();
			String description = cells.get(3).findElement(By.xpath(".//div")).getText();
			String partType = cells.get(4).findElement(By.xpath(".//div")).getText();
			String uom = cells.get(5).findElement(By.xpath(".//div")).getText();
			String requiredQuantity = cells.get(6).findElement(By.xpath(".//div")).getText();
			String availableQuantity = cells.get(7).findElement(By.xpath(".//div")).getText();
			String alreadyIssuedQty = cells.get(8).findElement(By.xpath(".//div")).getText();
			String balanceQty = cells.get(9).findElement(By.xpath(".//div")).getText();

			// Action button
			WebElement actionButton = cells.get(10).findElement(By.xpath(".//button"));
			String actionButtonText = actionButton.getText();
			// If you want to perform an action on the button, you can do so here

			// Print or use the retrieved values
			System.out.println("Sl No: " + slNo);
			System.out.println("Part No: " + partNo);
			System.out.println("Description: " + description);
			System.out.println("Part Type: " + partType);
			System.out.println("UOM: " + uom);
			System.out.println("Required Quantity: " + requiredQuantity);
			System.out.println("Available Quantity: " + availableQuantity);
			System.out.println("Already Issued Qty: " + alreadyIssuedQty);
			System.out.println("Balance Qty: " + balanceQty);
			System.out.println("Action Button Text: " + actionButtonText);
		}

		js.executeScript("arguments[0].click();", issueCheckBox);
		js.executeScript("arguments[0].click();", issueButton);

		return new HomePage();
	}

	// ***************MaterialIssue Table Page*********************//

	public HomePage MaterialIssueTablePage() throws InterruptedException {

		WebElement PageSize = driver.findElement(
				By.xpath("/html/body/app-root/div/div/div/div/div/app-sa-material-issue/div[3]/div[1]/select"));

		Select select1 = new Select(PageSize);
		select1.selectByValue("50");

		Thread.sleep(2000);
		select1.selectByValue("100");

		Thread.sleep(2000);
		select1.selectByValue("500");

		Thread.sleep(2000);
		select1.selectByValue("10");

		WebElement SearchTextField = driver.findElement(By.xpath("(//input[@id='example-search-input'])[1]"));
		SearchTextField.sendKeys(Keys.ENTER);
		SearchTextField.sendKeys("FG-9");
		// 1Verifying that SearchTextField Text Field is Enabled or not
		boolean isEnabledSearchTextFieldTextField = SearchTextField.isEnabled();
		Assert.assertTrue(isEnabledSearchTextFieldTextField);
		boolean isDisabledSearchTextFieldTextFieldn = !SearchTextField.isEnabled();
		Assert.assertFalse(isDisabledSearchTextFieldTextFieldn);

		// Verifying that SearchTextField Text Field is displayed or hidden.
		boolean isDisplayedSearchTextFieldTextField = SearchTextField.isDisplayed();
		Assert.assertTrue(isDisplayedSearchTextFieldTextField);
		boolean isHiddenSearchTextFieldTextField = !SearchTextField.isDisplayed();
		Assert.assertFalse(isHiddenSearchTextFieldTextField);

		// Verify that Search text field is clickable or not
		WebElement SearchTextFieldFocusedElement = driver.switchTo().activeElement();
		boolean SearchTextFieldIsSelected = SearchTextFieldFocusedElement.equals(SearchTextField);
		Assert.assertTrue(SearchTextFieldIsSelected, "SearchTextField is not Selected");

		WebElement SearchButton = driver.findElement(By.xpath("(//i[@class='mdi mdi-magnify search_icon'])[1]"));
		js.executeScript("arguments[0].click();", SearchButton);

		// 1Verifying that SearchButton Text Field is Enabled or not
		boolean isEnabledSearchButtonTextField = SearchButton.isEnabled();
		Assert.assertTrue(isEnabledSearchButtonTextField);
		boolean isDisabledSearchButtonTextFieldn = !SearchButton.isEnabled();
		Assert.assertFalse(isDisabledSearchButtonTextFieldn);

		// Verifying that SearchButton Text Field is displayed or hidden.
		boolean isDisplayedSearchButtonTextField = SearchButton.isDisplayed();
		Assert.assertTrue(isDisplayedSearchButtonTextField);
		boolean isHiddenSearchButtonTextField = !SearchButton.isDisplayed();
		Assert.assertFalse(isHiddenSearchButtonTextField);

		driver.navigate().refresh();

		// Verify The Records In Table Of Item Master List

		WebElement table = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='table table-striped']")));
		if (table.isDisplayed())
			System.out.println("Is Displayed");
		else
			System.out.println("is not displayed");

		// Get headers (column names)
		List<WebElement> headers = table.findElements(By.tagName("th"));

		// Print headers
		for (WebElement header : headers) {
			System.out.print(header.getText() + "\t");
		}
		System.out.println(); // Move to the next line

		// Get all rows from the table
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		// Loop through each row
		for (WebElement row : rows) {
			// Get all columns for each row
			List<WebElement> columns = row.findElements(By.tagName("td"));

			// Loop through each column
			for (WebElement column : columns) {
				// Extract and print the text from the column
				System.out.print(column.getText() + "\t");
			}
			System.out.println(); // Move to the next row
		}
		System.out.println();
		driver.navigate().refresh();

		int totalPages = driver.findElements(By.cssSelector(".pagination a")).size();

		// Loop through each pagination link in Forward iteration
		for (int i = 1; i <= totalPages - 3; i++) {
			System.out.println("Clicking on pagination link #" + i);
			WebElement pageLink = driver.findElement(By.partialLinkText(String.valueOf(i)));
			js.executeScript("arguments[0].click();", pageLink);
			Thread.sleep(2000);

			// Wait for the page to load
			wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));

			System.out.println("Page #" + i + " loaded successfully.");
			// You can now interact with the loaded page.
		}

		// Backward iteration
		for (int i = totalPages - 3; i >= 1; i--) {
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
