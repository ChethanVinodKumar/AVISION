package com.Getapcs.Avision.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class VerifyInvoiceCreate extends TestBase {
	
	@FindBy(tagName = "body")
	public static WebElement driverIninteractable;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/i[1]")
	WebElement viewDO;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement customerNameDropDown;

	@FindBy(xpath = "//label[normalize-space(text())='Customer Alias Name']/following-sibling::div/input[@formcontrolname='customerAliasName']")
	WebElement customerAliasName;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement companyNameDropDown;

	@FindBy(xpath = "(//span[text()='Test comName'])[1]")
	WebElement companyName;

	@FindBy(xpath = "//input[@placeholder='Enter Remarks']")
	WebElement remarkField;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement doNumberDropDown;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement fgItemNoandDescriptionDropDown;

	@FindBy(linkText = "Other Charges")
	WebElement otherChargesTab;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

//	@FindBy(xpath = "(//input[@type='text'])[2]")
//	WebElement procutementType1;
//
//	@FindBy(xpath = "(//input[@type='text'])[2]")
//	WebElement procutementType1;
//
//	@FindBy(xpath = "(//input[@type='text'])[2]")
//	WebElement procutementType1;

	public VerifyInvoiceCreate() {
		PageFactory.initElements(driver, this);
	}

	public HomePage invoiceCreate(String remark) throws Throwable {

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/delivery-order/table");

		String tableXpath = "//table[@class='table table-striped']";
		actions.moveToElement(driverIninteractable).perform();
		Thread.sleep(3000);

		// Get the first PR number text from table
		String customerId = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[5]")).getText();
		String customerName = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[4]")).getText();

		String doNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();
		
		Assert.assertNotNull(customerId,"customerId is Null");
		Assert.assertNotNull(customerName,"customerName is Null");
		Assert.assertNotNull(doNumber,"doNumber is Null");

		// Store the element with hard coded PR number
		String customerIdXpath = "//span[normalize-space()='031023PR-00002']";
		String doNumberXpath = "//span[normalize-space()='031023PR-00002']";

		String customerIdupdatedXpath = customerIdXpath.replace("031023PR-00002", customerId +" - "+ customerName);
		String doNumberupdatedXpath = doNumberXpath.replace("031023PR-00002", doNumber);

		System.out.println(doNumberupdatedXpath);
		System.out.println(customerIdupdatedXpath);
		
		Thread.sleep(1000);

		click(driver, viewDO);

		String tableXpath1 = "//table[@class='table mb-2']";
		Thread.sleep(1000);
		String fgNumber = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[1]")).getText();
		Assert.assertNotNull(fgNumber,"fgNumber is Null");
		
		System.out.println("fgNumber :- "+fgNumber);
		
		String fgNumberXpath = "//span[normalize-space()='031023PR-00002']";
		String fgNumberupdatedXpath = fgNumberXpath.replace("031023PR-00002", fgNumber + "-TEST Description");
		System.out.println(fgNumberupdatedXpath);

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/invoice/create");

		Thread.sleep(6000);
		click(driver, customerNameDropDown);
		isSelected(driver, customerNameDropDown, "customerNameDropDown");
		WebElement customerIdSelect = driver.findElement(By.xpath(customerIdupdatedXpath));
		click(driver, customerIdSelect);

		dataPrintFromInputtag(driver, customerAliasName, "customerAliasName");

		click(driver, companyNameDropDown);
		isSelected(driver, companyNameDropDown, "companyNameDropDown");
		click(driver, companyName);

		click(driver, remarkField);
		isSelected(driver, remarkField, "remarkField");
		remarkField.sendKeys(remark);

		click(driver, doNumberDropDown);
		isSelected(driver, doNumberDropDown, "doNumberDropDown");
		WebElement doNumberIdSelect = driver.findElement(By.xpath(doNumberupdatedXpath));
		click(driver, doNumberIdSelect);

		click(driver, fgItemNoandDescriptionDropDown);
		isSelected(driver, fgItemNoandDescriptionDropDown, "fgItemNoandDescriptionDropDown");
		WebElement fgSelect = driver.findElement(By.xpath(fgNumberupdatedXpath));
		click(driver, fgSelect);

//		click(driver, otherChargesTab);

		click(driver, saveButton);

		return new HomePage();
	}

}