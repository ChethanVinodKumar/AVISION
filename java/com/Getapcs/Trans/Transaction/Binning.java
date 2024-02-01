package com.Getapcs.Trans.Transaction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class Binning extends TestBase {

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement selectGRINnoDropDown;

	@FindBy(xpath = "//label[text()='Vendor Name']/following-sibling::label[@class='field2']")
	WebElement vendorNameElement;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement acceptedQty;

	@FindBy(xpath = "(//button[normalize-space()='Binning Locations'])[1]")
	WebElement binning;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement projectNum;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement warehouse;

	@FindBy(xpath = "(//span[normalize-space()='AVision Stores-I (Operational )'])[1]")
	WebElement warehouseSelect;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement location;

	@FindBy(xpath = "(//span[normalize-space()='MB-01'])[1]")
	WebElement locationSelect;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement warehouse1;

	@FindBy(xpath = "(//span[normalize-space()='AVision Stores-III(General)'])[1]")
	WebElement warehouseSelect1;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement location1;

	@FindBy(xpath = "(//span[normalize-space()='GLB-01'])[1]")
	WebElement locationSelect1;

	@FindBy(xpath = "(//input[@placeholder='Enter quantity'])[1]")
	WebElement quantity;

	@FindBy(xpath = "//label[text()='Accepted Qty']/following-sibling::label[@class='property']")
	WebElement acceptedQty1;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[3]")
	WebElement save;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement save1;

	public Binning() {

		PageFactory.initElements(driver, this);
	}

	public HomePage BinningCreatePage() throws Throwable {

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/grin/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String grinNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		System.out.println(grinNumber);

		// Store the element with hard coded PR number
		String elementXpath = "//span[normalize-space()='031023PR-00002']";

		String updatedXpath = elementXpath.replace("031023PR-00002", grinNumber);

		System.out.println(updatedXpath);

		Thread.sleep(3000);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/sales-order/table");

		String tableXpath2 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ProjectNumber = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[4]")).getText();

		// Store the element with hard coded PR number
		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath2 = elementXpath2.replace("Item-FG-11-TEST", ProjectNumber);
		System.out.println(updatedXpath2);

		Thread.sleep(3000);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/binning/create");

		// Verify Select GRIN No. Drop Down in IQC Confirmation Create Page
		boolean selectGRINnoDropDownIsDisplayed = selectGRINnoDropDown.isDisplayed();
		assertTrue(selectGRINnoDropDownIsDisplayed, "Select GRIN No. Drop Down is not Displayed.");
		selectGRINnoDropDown.sendKeys(Keys.ENTER);
		WebElement selectGRINnoDropDownFocusedElement = driver.switchTo().activeElement();
		boolean selectGRINnoDropDownIsSelected = selectGRINnoDropDownFocusedElement.equals(selectGRINnoDropDown);
		assertTrue(selectGRINnoDropDownIsSelected, "Select GRIN No. Drop Down is not Selected");
		WebElement selectGRINnoDropDownValue = driver.findElement(By.xpath(updatedXpath));
		click(driver, selectGRINnoDropDownValue);

		System.out.println("############ Binnig ###############");

//Vender Name

		String venderNameQtyxpath = "//label[text()='Vendor Name']/..//label[@class='field2']";

		String venderNameQty = driver.findElement(By.xpath(venderNameQtyxpath)).getText();

		System.out.println("Vender Name is : " + venderNameQty);
		Thread.sleep(2000);

//Vender Id

		String venderIdQtyxpath = "//label[text()='Vendor Name']/..//label[@class='field2']";

		String venderIdQty = driver.findElement(By.xpath(venderIdQtyxpath)).getText();

		System.out.println("Vender Id is : " + venderIdQty);
		Thread.sleep(2000);

//Invoice Number 

		String invoiceNumberxpath = "//label[text()='Invoice Number']/..//label[@class='field2']";

		String invoiceNumber = driver.findElement(By.xpath(invoiceNumberxpath)).getText();

		System.out.println("Invoice Number  is : " + invoiceNumber);
		Thread.sleep(2000);

//Invoice Date 

		String invoiceDatexpath = "//label[text()='Invoice Date']/..//label[@class='field2']";

		String invoiceDate = driver.findElement(By.xpath(invoiceDatexpath)).getText();

		System.out.println("Invoice Date  is : " + invoiceDate);
		Thread.sleep(2000);

//Invoice Value (without GST) 

		String invoiceValuexpath = "//label[text()='Invoice Value (without GST)']/..//label[@class='field2']";

		String invoiceValue = driver.findElement(By.xpath(invoiceValuexpath)).getText();

		System.out.println("Invoice Date  is : " + invoiceValue);
		Thread.sleep(2000);
//		WebElement table = driver.findElement(By.cssSelector("table[class='table mb-2']"));
//
//		// Get header row
//		WebElement headerRow = table.findElement(By.cssSelector("tr[class='itemTableHeadTr']"));
//
//		// Get headers
//		List<WebElement> headers = headerRow.findElements(By.tagName("th"));
//
//		// Get data rows
//		List<WebElement> rows = table.findElements(By.cssSelector("tr:not(.itemTableHeadTr)"));
//
//		// Iterate over rows
//		for (WebElement row : rows) {
//
//			// Get cells
//			List<WebElement> cells = row.findElements(By.tagName("td"));
//
//			// Print cell data
//			for (int i = 0; i < cells.size(); i++) {
//				System.out.println(headers.get(i).getText() + " : " + cells.get(i).getText());
//
//			}
//
//		}

//Binning
		click(driver, binning);

		for (int i = 1; i <= 2; i++) {

			// Project Number

			Thread.sleep(2000);
			click(driver, projectNum);

			WebElement projectNumSelect = driver.findElement(By.xpath(updatedXpath2));

			click(driver, projectNumSelect);

			if (i == 1) {

				// Warehouse

				click(driver, warehouse);

				isSelected(driver, warehouse, "warehouse");

				click(driver, warehouseSelect);

				// Location

				click(driver, location);

				isSelected(driver, location, "location");

				click(driver, locationSelect);
			}
			if (i == 2) {
				// Warehouse

				click(driver, warehouse1);

				isSelected(driver, warehouse1, "warehouse1");

				click(driver, warehouseSelect1);

				// Location

				click(driver, location1);

				isSelected(driver, location1, "location1");

				click(driver, locationSelect1);
			}

			// Quantity

			assertTrue(acceptedQty1.isDisplayed(), acceptedQty1 + " is not IsDisplayed.");
			// To extract Value Attribute and use same approach to retrieve
			String elementValue = acceptedQty1.getText().trim();
			System.out.println("acceptedQty1 : " + elementValue + "\n");
			int acceptedQtyValue = Integer.parseInt(elementValue);
			int acceptedQtyValue1 = acceptedQtyValue / 2;
			String stringacceptedQtyValue1 = String.valueOf(acceptedQtyValue1);

			click(driver, quantity);

			quantity.sendKeys(stringacceptedQtyValue1);

			click(driver, add);

		}
		click(driver, save);
//		click(driver, save1);
		return new HomePage();
	}

}
