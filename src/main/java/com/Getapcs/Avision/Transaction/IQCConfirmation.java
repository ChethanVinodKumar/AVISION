package com.Getapcs.Avision.Transaction;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class IQCConfirmation extends TestBase {
	
	@FindBy(tagName = "body")
	public static WebElement driverIninteractable;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement selectGRINnoDropDown;

	@FindBy(xpath = "//label[text()='Vendor Name']/following-sibling::label[@class='field2']")
	WebElement vendorNameElement;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement acceptedQty;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement remarks;
	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement remarks1;
	@FindBy(xpath = "(//input[@type='text'])[15]")
	WebElement remarks2;
	@FindBy(xpath = "(//input[@type='text'])[20]")
	WebElement remarks3;
	@FindBy(xpath = "(//input[@type='text'])[25]")
	WebElement remarks4;
	@FindBy(xpath = "(//input[@type='text'])[30]")
	WebElement remarks5;

	@FindBy(xpath = "(//a[normalize-space()='Other Details'])[1]")
	WebElement otherDetails;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public IQCConfirmation() {

		PageFactory.initElements(driver, this);
	}

	public HomePage iqcConfirmationCreatePage() throws Throwable {

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/grin/table");

		String tableXpath = "//table[@class='table table-striped']";

		Thread.sleep(2000);
		actions.moveToElement(driverIninteractable).perform();
		// Get the first PR number text from table
		String grinNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		System.out.println(grinNumber);

		// Store the element with hard coded PR number
		String elementXpath = "//span[normalize-space()='031023PR-00002']";

		String updatedXpath = elementXpath.replace("031023PR-00002", grinNumber);

		System.out.println(updatedXpath);

		Thread.sleep(3000);
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/iqc-confirmation/create");

		Thread.sleep(3000);
		actions.moveToElement(driverIninteractable).perform();
		// Verify Select GRIN No. Drop Down in IQC Confirmation Create Page
		click(driver, selectGRINnoDropDown);
		isSelected(driver, selectGRINnoDropDown, "selectGRINnoDropDown");
		WebElement selectGRINnoDropDownValue = driver.findElement(By.xpath(updatedXpath));
		click(driver, selectGRINnoDropDownValue);

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

		WebElement table = driver.findElement(By.cssSelector("table[class='table mb-2']"));

		// Get header row
		WebElement headerRow = table.findElement(By.cssSelector("tr[class='itemTableHeadTr']"));

		// Get headers
		List<WebElement> headers = headerRow.findElements(By.tagName("th"));

		// Get data rows
		List<WebElement> rows = table.findElements(By.cssSelector("tr:not(.itemTableHeadTr)"));

		// Iterate over rows
		for (WebElement row : rows) {

			// Get cells
			List<WebElement> cells = row.findElements(By.tagName("td"));

			// Print cell data
			for (int i = 0; i < cells.size(); i++) {
				System.out.println(headers.get(i).getText() + " : " + cells.get(i).getText());
			}

		}

		// 1Verifying that Alternative Part No Text Field is Enabled or not
		boolean isEnabledremarksField = remarks.isEnabled();
		assertTrue(isEnabledremarksField);
		boolean isDisabledremarksFieldn = !remarks.isEnabled();
		assertFalse(isDisabledremarksFieldn);

		// Verifying that Alternative Text Field is displayed or hidden.
		boolean isDisplayedremarksField = remarks.isDisplayed();
		assertTrue(isDisplayedremarksField);
		boolean isHiddenremarksField = !remarks.isDisplayed();
		assertFalse(isHiddenremarksField);

		remarks.sendKeys("TEST Remarks1");

		remarks1.sendKeys("TEST Remarks2");

		remarks2.sendKeys("TEST Remarks3");

		remarks3.sendKeys("TEST Remarks4");

		remarks4.sendKeys("TEST Remarks5");

		remarks5.sendKeys("TEST Remarks6");

		click(driver, otherDetails);

//AWB Num 1

		String AWBMNUM1xpath = "//label[text()='AWB Number 1']/..//label[@class='field2']";

		String AwbNumber1 = driver.findElement(By.xpath(AWBMNUM1xpath)).getText();

		System.out.println("AWB Num 1 is : " + AwbNumber1);

//AWB Date 1 

		String AWBDate1xpath = "//label[text()='AWB Date 1']/..//label[@class='field2']";

		String AWBDate1 = driver.findElement(By.xpath(AWBDate1xpath)).getText();

		System.out.println("AWB Date 1  is : " + AWBDate1);

//AWB Num 2

		String AWBMNUM2xpath = "//label[text()='AWB Number 2']/..//label[@class='field2']";

		String AwbNumber2 = driver.findElement(By.xpath(AWBMNUM2xpath)).getText();

		System.out.println("AWB Num 2 is : " + AwbNumber2);

//AWB Date 2 

		String AWBDate2xpath = "//label[text()=' AWB Date 2 ']/..//label[@class='field2']";

		String AWBDate2 = driver.findElement(By.xpath(AWBDate2xpath)).getText();

		System.out.println("AWB Date 2  is : " + AWBDate2);

//BE Number

		String BENumberxpath = "//label[text()='B/E Number']/..//label[@class='field2']";

		String BENumber = driver.findElement(By.xpath(BENumberxpath)).getText();

		System.out.println("BE Number  is : " + BENumber);

//BE Date

		String BEDatexpath = "//label[text()=' B/E Date ']/..//label[@class='field2']";

		String BEDate = driver.findElement(By.xpath(BEDatexpath)).getText();

		System.out.println("BE Date is : " + BEDate);

//TotalInvoice

		String totalInvoicexpath = "//label[text()='Total Invoice']/..//label[@class='field2']";

		String totalInvoice = driver.findElement(By.xpath(totalInvoicexpath)).getText();

		System.out.println("Invoice Date  is : " + totalInvoice);

		boolean saveButtonIsDisplayed = saveButton.isDisplayed();
		assertTrue(saveButtonIsDisplayed, "save ProjectButton Expansion Panel is not Displayed.");
		saveButton.click();
		return new HomePage();
	}
}
