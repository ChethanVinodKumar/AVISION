package com.Getapcs.Avision.Transaction;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class PO_Approval1 extends TestBase {

	// PO Approval 1

	@FindBy(xpath = "(//a[normalize-space()='Items'])[1]")
	WebElement items;

	@FindBy(xpath = "(//a[normalize-space()='Billing & Shipping Details'])[1]")
	WebElement billing;
	
	@FindBy(xpath = "(//a[normalize-space()='Terms'])[1]")
	WebElement terms;

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
	
	public PO_Approval1() {
		PageFactory.initElements(driver, this);
	}

	// *****************************PO Approval 1
	// Page*************************************//
	public HomePage purchaseOrderApproval1() throws AWTException, InterruptedException {

//		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/table");

//		System.out.println("Before Approval");
//		WebElement table = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));
//
//		// Extract the data from the first row of the table
//		WebElement firstRow = table.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
//		String projectNumber = firstRow.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
//		String approvalStatus = firstRow.findElement(By.xpath(".//td[6]")).getText(); // 6th column for approval status
//
//		// Output the extracted data
//		System.out.println("Project Number: " + projectNumber);
//		System.out.println("Approval Status: " + approvalStatus);
//		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/approvalI/table");

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

//		Thread.sleep(4000);
//		System.out.println("After Approval");
//		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/table");
//
//		WebElement table1 = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));
//
//		// Extract the data from the first row of the table
//		WebElement firstRow1 = table1.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
//		String projectNumber1 = firstRow1.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
//		String approvalStatus1 = firstRow1.findElement(By.xpath(".//td[6]")).getText(); // 6th column for approval
//																						// status
//
//		Thread.sleep(4000);
//
//		// Output the extracted data
//		System.out.println("Project Number: " + projectNumber1);
//		System.out.println("Approval Status: " + approvalStatus1);

		return new HomePage();
	}

}
