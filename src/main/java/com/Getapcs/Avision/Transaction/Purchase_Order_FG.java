package com.Getapcs.Avision.Transaction;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class Purchase_Order_FG extends TestBase {

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Issue Material'])[1]")
	WebElement materialIssueViewButton_FG;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement procutementType;

	@FindBy(xpath = "(//span[normalize-space()='TEST Procutement'])[1]")
	WebElement procutementTypeSelect;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement currency;

	@FindBy(xpath = "(//span[normalize-space()='INR'])[1]")
	WebElement currencySelect;

	// Vender Details

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement vendorName;

	@FindBy(xpath = "(//span[normalize-space()='ABSOLUTE COMPOSITES PRIVATE LIMITED'])[1]")
	WebElement vendorNameSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Quotation Reference No.'])[1]")
	WebElement quotationReferenceNo;

	@FindBy(xpath = "//input[@placeholder='DD-MM-YYYY']")
	WebElement quotationDate;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement venderAddress;

	@FindBy(xpath = "(//span[normalize-space()='NO 55, BELLAHALLI VILLAGE,, YELAHANKA, Bengaluru, Urban, Karnataka, 560064'])[1]")
	WebElement venderAddressSelect;

	// Items

	@FindBy(xpath = "(//a[normalize-space()='Items'])[1]")
	WebElement items;

	@FindBy(xpath = "(//input[@placeholder='Upload Items'])[1]")
	WebElement uploadItems;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement itemNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter Unit Price'])[1]")
	WebElement unitCost;

	@FindBy(xpath = "(//input[@formcontrolname='quantity'])[1]")
	WebElement quntity;

	@FindBy(xpath = "(//mat-panel-title)[1]")
	WebElement addProject;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement projectNumber;

	@FindBy(xpath = "(//span[normalize-space()='TISPL-1796'])[1]")
	WebElement projectNumberSelect;

	@FindBy(xpath = "(//input[@formcontrolname='projectQty'])[1]")
	WebElement projectQuntity;

	@FindBy(xpath = "(//i[@class='mdi mdi-plus-circle-outline add-icon'])[1]")
	WebElement prButton;

	@FindBy(xpath = "(//input[@value='m1'])[1]")
	WebElement prSelect;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement savePR;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-po/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/mat-expansion-panel/div/div/div[2]/div/button")
	WebElement addProjectNumber;

	@FindBy(xpath = "(//mat-panel-title)[2]")
	WebElement DeliveryShedule;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement deliveryDate;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[3]")
	WebElement deliverySheduleQuntity;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-po/div[2]/div/div/div/form/div/div[2]/div/div/div[4]/mat-expansion-panel/div/div/div[2]/div/button")
	WebElement addDeliveryShedule;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-po/div[2]/div/div/div/form/div/div[2]/div/div/div[5]/mat-expansion-panel/mat-expansion-panel-header/span[2]")
	WebElement addSpecialInstructions;

	@FindBy(xpath = "(//input[@placeholder='Enter Special Instruction'])[1]")
	WebElement specialInstructions;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[3]")
	WebElement addspecialInstructions;

	@FindBy(xpath = "(//input[@placeholder='Enter SGST'])[1]")
	WebElement sgst1;

	@FindBy(xpath = "(//input[@placeholder='Enter CGST'])[1]")
	WebElement cgst1;

	@FindBy(xpath = "(//input[@placeholder='Enter '])[1]")
	WebElement igst1;

	@FindBy(xpath = "(//input[@placeholder='Enter UTGST'])[1]")
	WebElement utgst1;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[4]")
	WebElement addItems;

	// Billing and Shipping Details

	@FindBy(xpath = "(//a[normalize-space()='Billing & Shipping Details'])[1]")
	WebElement billing;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement deliveryTerms;

	@FindBy(xpath = "(//span[normalize-space()='TEST DeliveryTerms'])[1]")
	WebElement deliveryTermsSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement paymentTerms;

	@FindBy(xpath = "(//span[normalize-space()='Cash On Delivery'])[1]")
	WebElement paymentTermsSelect;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement shippingMode;

	@FindBy(xpath = "(//span[normalize-space()='TEST Shipment_Mode1'])[1]")
	WebElement shippingModeSelect;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement shipTo;

	@FindBy(xpath = "(//span[normalize-space()='AVision Systems Pvt Ltd'])[1]")
	WebElement shipToSelect;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement billTo;

	@FindBy(xpath = "(//span[normalize-space()='AVision Systems Pvt Ltd'])[2]")
	WebElement billToSelect;

	// Terms

	@FindBy(xpath = "(//a[normalize-space()='Terms'])[1]")
	WebElement terms;

	@FindBy(xpath = "(//input[@placeholder='Enter Retention Period'])[1]")
	WebElement retentionPeriod;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Special Terms & Conditions'])[1]")
	WebElement specialTerms;

	@FindBy(xpath = "(//input[@placeholder='Enter Inco Terms'])[1]")
	WebElement incoTerms;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addTerms;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement save;

	@FindBy(xpath = "(//input[@placeholder='Upload file'])[1]")
	WebElement UploadFiles1;

//PO Approval 1

	@FindBy(xpath = "(//button[normalize-space()='View'])[1]")
	WebElement arrroval1View;

	@FindBy(xpath = "(//button[normalize-space()='Approve'])[1]")
	WebElement approve;

	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement yesButton;

	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement approvePOPUP;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[1]")
	WebElement itemNumber1;

	@FindBy(xpath = "//label[text()='PO Number']/following-sibling::label[@class='field2']")
	WebElement poNumber;

//PO Approval 2

	@FindBy(xpath = "(//button[normalize-space()='View'])[1]")
	WebElement arrroval2View;

	@FindBy(xpath = "(//button[normalize-space()='Confirm'])[1]")
	WebElement confirm;

	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement confirmPOPUP;

	JavascriptExecutor executor = (JavascriptExecutor) driver;

	public Purchase_Order_FG() {
		PageFactory.initElements(driver, this);
	}

//*****************************PO Create Page*************************************//

	public HomePage purchaseOrderCreatePage(String refNo, String unitcost, String quantity, String projectQty,
			String deliveryProjectQty, String instructions, String sgst, String cgst, String igst, String utgst,
			String retention, String special, String inco) throws Throwable {
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/material-issue/table");

		waitForElement(driver, materialIssueViewButton_FG, 10, 1);
		click(driver, materialIssueViewButton_FG);

		String tableXpath = "//table[@formarrayname='ItemData']";

		// Get the first PR number text from table
		String ppNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[3]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathPP1 = elementXpath.replace("Item-FG-11-TEST", ppNumber1 + "-Test Description");

		System.out.println(updatedXpathPP1);

		// Get the first PR number text from table
		String ppNumber2 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[3]/td[3]")).getText();

		// Store the element with hard coded PR number
		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathPP2 = elementXpath1.replace("Item-FG-11-TEST", ppNumber2 + "-Test Description");

		System.out.println(updatedXpathPP2);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/sales-order/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ProjectNumber = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[4]")).getText();

		// Store the element with hard coded PR number
		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath2.replace("Item-FG-11-TEST", ProjectNumber);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/create");
		Thread.sleep(2000);

		click(driver, procutementType);
		isSelected(driver, procutementType, "procutementType");
		click(driver, procutementTypeSelect);

		click(driver, currency);
		isSelected(driver, currency, "currency");
		click(driver, currencySelect);

//Vender Details

		click(driver, vendorName);
		isSelected(driver, vendorName, "vendorName");
		click(driver, vendorNameSelect);

		click(driver, quotationReferenceNo);
		isSelected(driver, quotationReferenceNo, "quotationReferenceNo");
		quotationReferenceNo.sendKeys(refNo);

		// Verify that Quotation date is selecting or not
		datePicker(driver, quotationDate);

		click(driver, venderAddress);
		isSelected(driver, venderAddress, "venderAddress");
		click(driver, venderAddressSelect);

//Items
		click(driver, items);

		for (int i = 1; i <= 2; i++) {

			if (i == 1) {
				click(driver, itemNumber);
				itemNumber.clear();
				itemNumber.sendKeys("PP");
				WebElement itemNumberSelect = driver.findElement(By.xpath(updatedXpathPP1));
				click(driver, itemNumberSelect);
			}
			if (i == 2) {
				click(driver, itemNumber);
				itemNumber.clear();
				itemNumber.sendKeys("PP");
				WebElement itemNumberSelect1 = driver.findElement(By.xpath(updatedXpathPP2));
				click(driver, itemNumberSelect1);
			}

			click(driver, unitCost);
			isSelected(driver, unitCost, "unitCost");
			unitCost.sendKeys(unitcost);

			click(driver, quntity);
			isSelected(driver, quntity, "quntity");
			quntity.clear();
			quntity.sendKeys(quantity);

			if (i == 1) {
				click(driver, addProject);
			}

			Thread.sleep(1000);
			click(driver, projectNumber);
			Thread.sleep(1000);
			if (i == 1) {
				WebElement projectNumberSelect = driver.findElement(By.xpath(updatedXpath1));
				Thread.sleep(1000);
				click(driver, projectNumberSelect);
			}

			click(driver, projectQuntity);
			isSelected(driver, projectQuntity, "projectQuntity");
			projectQuntity.clear();
			projectQuntity.sendKeys(projectQty);

//			if (i == 1) {
//				click(driver, prButton);
//
//				click(driver, prSelect);
//
//				click(driver, savePR);
//			}

			click(driver, addProjectNumber);

			if (i == 1) {
				click(driver, DeliveryShedule);
			}

			datePicker(driver, deliveryDate);

			click(driver, deliverySheduleQuntity);
			isSelected(driver, deliverySheduleQuntity, "deliverySheduleQuntity");
			deliverySheduleQuntity.sendKeys(deliveryProjectQty);

			click(driver, addDeliveryShedule);
			if (i == 1) {
				click(driver, addSpecialInstructions);
			}

			click(driver, specialInstructions);
			isSelected(driver, specialInstructions, "specialInstructions");
			specialInstructions.sendKeys(instructions);

			click(driver, addspecialInstructions);

			click(driver, sgst1);
			isSelected(driver, sgst1, "sgst1");
			sgst1.clear();
			sgst1.sendKeys(sgst);

			click(driver, cgst1);
			isSelected(driver, cgst1, "cgst1");
			cgst1.clear();
			cgst1.sendKeys(cgst);

			click(driver, igst1);
			isSelected(driver, igst1, "igst1");
			igst1.clear();
			igst1.sendKeys(igst);

			click(driver, utgst1);
			isSelected(driver, utgst1, "utgst1");
			utgst1.clear();
			utgst1.sendKeys(utgst);

			click(driver, addItems);

		}

//Billing and Shipping Details

		click(driver, billing);

		click(driver, deliveryTerms);
		isSelected(driver, deliveryTerms, "deliveryTerms");
		click(driver, deliveryTermsSelect);

		click(driver, paymentTerms);
		isSelected(driver, paymentTerms, "paymentTerms");
		click(driver, paymentTermsSelect);

		click(driver, shippingMode);
		isSelected(driver, shippingMode, "shippingMode");
		click(driver, shippingModeSelect);

		click(driver, shipTo);
		isSelected(driver, shipTo, "shipTo");
		click(driver, shipToSelect);

		click(driver, billTo);
		isSelected(driver, billTo, "billTo");
		click(driver, billToSelect);

		// terms
		click(driver, terms);

		click(driver, retentionPeriod);
		isSelected(driver, retentionPeriod, "retentionPeriod");
		retentionPeriod.sendKeys(retention);

		click(driver, specialTerms);
		isSelected(driver, specialTerms, "specialTerms");
		specialTerms.sendKeys(special);

		click(driver, incoTerms);
		isSelected(driver, incoTerms, "incoTerms");
		incoTerms.sendKeys(inco);

		click(driver, addTerms);

		uploadFile(driver, UploadFiles1, 2);

		click(driver, save);
		Thread.sleep(4000);
		return new HomePage();
	}

	// *****************************PO Approval 1
	// Page*************************************//
	public HomePage purchaseOrderApproval1() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/table");
		Thread.sleep(2000);

		System.out.println("Before Approval");
		WebElement table = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));

		// Extract the data from the first row of the table
		WebElement firstRow = table.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
		String projectNumber = firstRow.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
		String approvalStatus = firstRow.findElement(By.xpath(".//td[6]")).getText(); // 6th column for approval status

		// Output the extracted data
		System.out.println("Project Number: " + projectNumber);
		System.out.println("Approval Status: " + approvalStatus);
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/approvalI/table");
		Thread.sleep(2000);

		click(driver, arrroval1View);

		dataPrintFromInputtag(driver, poNumber, "poNumber");

		click(driver, items);

		dataPrintFromInputtag(driver, itemNumber1, "itemNumbe1");

		click(driver, billing);

		click(driver, terms);

		Thread.sleep(2000);

		click(driver, approve);

		Thread.sleep(2000);

		click(driver, yesButton);

		Thread.sleep(4000);

		System.out.println("After Approval");
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/table");

		WebElement table1 = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));

		// Extract the data from the first row of the table
		WebElement firstRow1 = table1.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
		String projectNumber1 = firstRow1.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
		String approvalStatus1 = firstRow1.findElement(By.xpath(".//td[6]")).getText(); // 6th column for approval
																						// status

		Thread.sleep(4000);

		// Output the extracted data
		System.out.println("Project Number: " + projectNumber1);
		System.out.println("Approval Status: " + approvalStatus1);

		return new HomePage();
	}

	// ***********PO Approval 2***************//

	public HomePage purchaseOrderApproval2() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/table");

		System.out.println("Before Approval");
		WebElement table2 = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));

		// Extract the data from the first row of the table
		WebElement firstRow2 = table2.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
		String projectNumber2 = firstRow2.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
		String approvalStatus2 = firstRow2.findElement(By.xpath(".//td[7]")).getText(); // 6th column for approval
																						// status

		// Output the extracted data
		System.out.println("Project Number: " + projectNumber2);
		System.out.println("Approval Status: " + approvalStatus2);
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/approvalII/table");
		Thread.sleep(2000);

		click(driver, arrroval2View);

		dataPrintFromInputtag(driver, poNumber, "poNumber");

		click(driver, items);

		dataPrintFromInputtag(driver, itemNumber1, "itemNumbe1");

		click(driver, billing);

		click(driver, terms);

		Thread.sleep(2000);

		click(driver, approve);

		Thread.sleep(2000);

		click(driver, yesButton);

		Thread.sleep(4000);

		System.out.println("After Approval");
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/table");
		WebElement table3 = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));

		// Extract the data from the first row of the table
		WebElement firstRow3 = table3.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
		String projectNumber3 = firstRow3.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
		String approvalStatus3 = firstRow3.findElement(By.xpath(".//td[7]")).getText(); // 6th column for approval
																						// status
		Thread.sleep(4000);
		// Output the extracted data

		System.out.println("Project Number: " + projectNumber3);
		System.out.println("Approval Status: " + approvalStatus3);

		return new HomePage();
	}
}