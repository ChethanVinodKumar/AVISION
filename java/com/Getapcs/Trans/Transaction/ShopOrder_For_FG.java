package com.Getapcs.Trans.Transaction;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class ShopOrder_For_FG extends TestBase {

	// Shop Order

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement fgItemNumber;

	@FindBy(xpath = "(//span[normalize-space()='Secondary Master'])[1]")
	WebElement fgItemNumberSelect;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement bomGroup;

	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement bomGroupSelect;

	@FindBy(xpath = "//input[@placeholder='DD-MM-YYYY']")
	WebElement soCloseDatePicker;

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

	public ShopOrder_For_FG() {

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

		Thread.sleep(4000);

		datePicker(driver, soCloseDatePicker);

//FG Item Number

		click(driver, fgItemNumber);
		isSelected(driver, fgItemNumber, "fgItemNumber");
		fgItemNumber.sendKeys("FG");
		Thread.sleep(2000);
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
		releaseQty.sendKeys(requiredQtyvalue);

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
		waitForElement(driver, saveButton, 10, 2);
		Thread.sleep(4000);
		click(driver, saveButton);

		return new HomePage();
	}

}
