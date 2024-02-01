package com.Getapcs.Trans.Transaction;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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

public class ShopOrder extends TestBase {

	// Shop Order

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement fgItemNumber;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement fgItemNumberSelect;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement bomGroup;

	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement bomGroupSelect;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement projectNum;

	@FindBy(xpath = "(//span[normalize-space()='TISPL-0186'])[1]")
	WebElement projectNumSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement salesOrderNum;

	@FindBy(xpath = "(//span[normalize-space()='051223SO-000151'])[1]")
	WebElement salesOrderNumSelect;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement salesOrderQty;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement opensalesOrderQty;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement requiredQty;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement releaseQty;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public ShopOrder() {

		PageFactory.initElements(driver, this);
	}

//*************Shop Order Create Page******************

	public HomePage ShopOrderCreate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************Shop Order Create Page******************");
		driver.navigate().to("https://avision-demo.getapcs.com/engineering/engg-bom/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String fgItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", fgItemNumber1 + "-Test Description");

		System.out.println(updatedXpath);

		// ***********//

		driver.navigate().to("https://avision-demo.getapcs.com/sales/rfq/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String projectNumber = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", projectNumber);

		System.out.println(updatedXpath1);

		// *****//

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/sales-order/table");

		String tableXpath2 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String salesOrderNumber = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath2 = elementXpath2.replace("Item-FG-11-TEST", salesOrderNumber);

		System.out.println(updatedXpath2);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/shop-order/create");

//SO Close Date

		WebElement soCloseDate = driver.findElement(By.xpath(
				"/html/body/app-root/div/div/div/div/div/app-create-shop-order/div[2]/div/div/div/form/div/div[5]/div/div[1]/input"));
		js.executeScript("arguments[0].scrollIntoView(true);", soCloseDate);
		Thread.sleep(5000);
		soCloseDate.click();
		// js.executeScript("arguments[0].click();", soCloseDate);
		soCloseDate.sendKeys(Keys.RIGHT);
		soCloseDate.sendKeys(Keys.ENTER);

		Thread.sleep(4000);

//FG Item Number

		click(driver, fgItemNumber);
		isSelected(driver, fgItemNumber, "fgItemNumber");
		fgItemNumber.sendKeys("FG");

		WebElement fgItemNumberSelect = driver.findElement(By.xpath(updatedXpath));
		click(driver, fgItemNumberSelect);

//BOM Group

		// Verify that bomGroup Field is Displayed or not
		boolean isDisabledbomGroupFieldn = !bomGroup.isDisplayed();
		Assert.assertFalse(isDisabledbomGroupFieldn);
		js.executeScript("arguments[0].scrollIntoView(true);", bomGroup);
		Thread.sleep(5000);

		bomGroup.click();

		js.executeScript("arguments[0].click();", bomGroupSelect);

//Project Number

		// Verify that projectNum Field is Displayed or not
		boolean isDisabledprojectNumFieldn = !projectNum.isDisplayed();
		Assert.assertFalse(isDisabledprojectNumFieldn);

		js.executeScript("arguments[0].scrollIntoView(true);", projectNum);
		projectNum.click();
		// Verify that projectNum Field is clickable or not
		WebElement projectNumFieldFocusedElement = driver.switchTo().activeElement();
		boolean projectNumFieldIsSelected = projectNumFieldFocusedElement.equals(projectNum);
		Assert.assertTrue(projectNumFieldIsSelected, "projectNum Text Field is not Selected");

		WebElement projectNumSelect = driver.findElement(By.xpath(updatedXpath1));

		js.executeScript("arguments[0].click();", projectNumSelect);
//Sales Order Number

		// Verify that salesOrderNum Field is Displayed or not
		boolean isDisabledsalesOrderNumFieldn = !salesOrderNum.isDisplayed();
		Assert.assertFalse(isDisabledsalesOrderNumFieldn);

		js.executeScript("arguments[0].scrollIntoView(true);", salesOrderNum);
		salesOrderNum.click();

		// Verify that salesOrderNum Field is clickable or not
		WebElement salesOrderNumFieldFocusedElement = driver.switchTo().activeElement();
		boolean salesOrderNumFieldIsSelected = salesOrderNumFieldFocusedElement.equals(salesOrderNum);
		Assert.assertTrue(salesOrderNumFieldIsSelected, "salesOrderNum Text Field is not Selected");

		WebElement salesOrderNum = driver.findElement(By.xpath(updatedXpath2));

		js.executeScript("arguments[0].click();", salesOrderNum);
//Sales Order Number

		// Get the first PR number text from table
		Thread.sleep(2000);
		WebElement salesOrderQtyElement = driver
				.findElement(By.xpath("//table[@formarrayname='ItemData']/tbody/tr[1]/td[5]//input"));
		// To extract Value Attribute and use same approach to retrieve
		String salesOrderQtyValue = (String) js.executeScript("return arguments[0].value;", salesOrderQtyElement);
		System.out.println("SalesOrderNum Qty : " + salesOrderQtyValue + "\n");

//Open Sales Order Number

		WebElement openSalesOrderNum = driver
				.findElement(By.xpath("//table[@formarrayname='ItemData']/tbody/tr[1]/td[6]//input"));
		// To extract Value Attribute and use same approach to retrieve
		String opensalesOrderQtyValue = (String) js.executeScript("return arguments[0].value;", openSalesOrderNum);
		System.out.println("openSalesOrderNum Qty : " + opensalesOrderQtyValue + "\n");

//Required Qty

		WebElement requiredQtyelement = driver
				.findElement(By.xpath("//table[@formarrayname='ItemData']/tbody/tr[1]/td[7]//input"));
		// To extract Value Attribute and use same approach to retrieve
		String requiredQtyvalue = (String) js.executeScript("return arguments[0].value;", requiredQtyelement);
		System.out.println("required Qty : " + requiredQtyvalue + "\n");

//Release Qty

		// Verify that releaseQty Field is Displayed or not
		boolean isDisabledreleaseQtyFieldn = !releaseQty.isDisplayed();
		assertFalse(isDisabledreleaseQtyFieldn);

		// Verify that releaseQty Field is clickable or not
		WebElement releaseQtyFieldFocusedElement = driver.switchTo().activeElement();
		boolean releaseQtyFieldIsSelected = releaseQtyFieldFocusedElement.equals(releaseQty);
		assertFalse(releaseQtyFieldIsSelected, "releaseQty Text Field is not Selected");

		// Verifying that releaseQty Text Field is Enabled or not
		boolean isEnabledreleaseQtyField = releaseQty.isEnabled();
		assertTrue(isEnabledreleaseQtyField);
		releaseQty.clear();
		releaseQty.sendKeys("10");

//Can Create Qty

		WebElement canCreateQty = driver.findElement(By.xpath("(//input[@formcontrolname='canCreateQty'])[1]"));
		// To extract Value Attribute and use same approach to retrieve
		String canCreateQtyvalue = (String) js.executeScript("return arguments[0].value;", canCreateQty);
		System.out.println("canCreate Qty : " + canCreateQtyvalue + "\n");

//Total Release Qty

		WebElement totalReleaseQty = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		// To extract Value Attribute and use same approach to retrieve
		String totalReleaseQtyvalue = (String) js.executeScript("return arguments[0].value;", totalReleaseQty);
		System.out.println("totalRelease Qty : " + totalReleaseQtyvalue + "\n");

//Save Button
		Thread.sleep(4000);
		click(driver, saveButton);

		return new HomePage();
	}

//*******************Shop Order Edit ***********************
	public HomePage ShopOrderEdit() throws InterruptedException {
		// TODO Auto-generated method stub

		Thread.sleep(5000);

//Save Button

		// Verify and Click on Save Button in Create-Item PriceList-Sales Module
		assertTrue(saveButton.isDisplayed(), "Save Button is not Displayed");
		saveButton.click();

		return new HomePage();
	}

//************Shop order View Page***************

	public HomePage ShopOrderView() throws InterruptedException {

		System.out.println("//*************Shop Order View Page******************");

//Work Order Number

		String WorkOrderNumxpath = "//label[text()='Work Order No.']/../div";

		String WorkOrderNum = driver.findElement(By.xpath(WorkOrderNumxpath)).getText();

		System.out.println("Work Order Number is : " + WorkOrderNum);
		Thread.sleep(2000);
//Project Type

		String projectTypexpath = "//label[text()='Project Type ']/../div";

		String projectType = driver.findElement(By.xpath(projectTypexpath)).getText();

		System.out.println("Project Type is : " + projectType);
		Thread.sleep(2000);

//Item Type

		String itemTypexpath = "(//div[@class='form-group input-group field2'])[3]";

		String itemTypeNum = driver.findElement(By.xpath(itemTypexpath)).getText();

		System.out.println("Item Type is : " + itemTypeNum);
		Thread.sleep(2000);

//Can Create Qty

		String canCreateQtyxpath = "//label[text()='Can Create Qty']/..//div[@class='form-group input-group field2']";

		String canCreateQtyNum = driver.findElement(By.xpath(canCreateQtyxpath)).getText();

		System.out.println("Can Create Qty is : " + canCreateQtyNum);
		Thread.sleep(2000);

//Total SO Release Qty

		String totalSOReleaseQtyxpath = "//label[text()='Total SO Release Qty']/..//div[@class='form-group input-group field2']";

		String totalSOReleaseQty = driver.findElement(By.xpath(totalSOReleaseQtyxpath)).getText();

		System.out.println("Total SO Release Qty is : " + totalSOReleaseQty);
		Thread.sleep(2000);

//SO Close Date

		String soCloseDatexpath = "//label[text()='SO Close Date']/..//div[@class='form-group input-group field2']";

		String soCloseDate = driver.findElement(By.xpath(soCloseDatexpath)).getText();

		System.out.println("SO Close Date is : " + soCloseDate);
		Thread.sleep(2000);

		WebElement table = driver.findElement(By.xpath("//table[@class='table mb-2']"));

		// Fetch values from each cell in the table
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.xpath(".//td"));

			String itemDescription = cells.get(0).getText();
			String bomVersionNo = cells.get(1).getText();
			String projectNo = cells.get(2).getText();
			String salesOrderNo = cells.get(3).getText();
			String openSalesOrderQty = cells.get(4).getText();
			String requiredQty = cells.get(5).getText();
			String releaseQty = cells.get(6).getText();
			String shortCloseButtonText = cells.get(7).findElement(By.xpath(".//button")).getText();

			// Print or use the retrieved values
			System.out.println("Item Description: " + itemDescription);
			System.out.println("Bom Version No: " + bomVersionNo);
			System.out.println("Project No: " + projectNo);
			System.out.println("Sales Order No: " + salesOrderNo);
			System.out.println("Open Sales Order Qty: " + openSalesOrderQty);
			System.out.println("Required Qty: " + requiredQty);
			System.out.println("Release Qty: " + releaseQty);
			System.out.println("Short Close Button Text: " + shortCloseButtonText);
		}

		return new HomePage();
	}

	// ************Shop order Table Page***************

	public HomePage ShopOrderTable() throws InterruptedException {

		WebElement PageSize = driver
				.findElement(By.xpath("/html/body/app-root/div/div/div/div/div/app-shop-order/div[3]/div[1]/select"));

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
		SearchTextField.sendKeys("FG");
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
		for (int i = 1; i <= totalPages - 1; i++) {
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
		for (int i = totalPages - 1; i >= 1; i--) {
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
