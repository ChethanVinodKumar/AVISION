package com.Getapcs.Avision.Transaction;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class PRApproval2 extends TestBase {

	@FindBy(xpath = "//input[@type='text']")
	WebElement prNumberDropDown;

	@FindBy(xpath = "//label[text()='PR Date']/following-sibling::label[@class='field2']")
	WebElement prDateElement;

	@FindBy(xpath = "//label[text()='Rev Number']/following-sibling::label[@class='field2']")
	WebElement revNumberElement;

	@FindBy(xpath = "//label[text()='Procurement Type']/following-sibling::label[@class='field2']")
	WebElement procurementTypeElement;

	@FindBy(xpath = "//label[text()='Purpose']/following-sibling::label[@class='field2']")
	WebElement purposeTextElement;

	@FindBy(xpath = "//label[text()='PR Files']/following-sibling::label[@class='field2']")
	WebElement prFileElement;

	@FindBy(linkText = "Items")
	WebElement itemsTab;

	@FindBy(xpath = "(//table[@class='table table-striped'])[2]")
	WebElement table2;

	@FindBy(xpath = "//i[@title='Project']")
	WebElement projectDeatilPopUp;

	@FindBy(xpath = "(//table[@class='table table-striped'])[1]")
	WebElement table1;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeButton;

	@FindBy(linkText = "Billing & Shipping Details")
	WebElement billing$ShippingDetailsTab;

	@FindBy(xpath = "//label[text()='Delivery Terms']/following-sibling::label[@class='data_field']")
	WebElement deliveryTermsElement;

	@FindBy(xpath = "//label[text()='Payment Terms']/following-sibling::label[@class='data_field']")
	WebElement paymentTermsElement;

	@FindBy(xpath = "//label[text()='Shipping Mode']/following-sibling::label[@class='data_field']")
	WebElement shippingModeElement;

	@FindBy(linkText = "Terms")
	WebElement termsTab;

	@FindBy(xpath = "//label[text()='Retention Period']/following-sibling::label[@class='data_field']")
	WebElement retentionPeriodElement;

	@FindBy(xpath = "//label[text()='Special Terms & Conditions']/following-sibling::label[@class='data_field']")
	WebElement specialTermsAndConditionElement;

	@FindBy(xpath = "//button[contains(text(),'Approve')]")
	WebElement approval2Button;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement yesButton;

	/*
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 * 
	 * @FindBy(xpath = "(//input[@type='text'])[1]") WebElement venderNameDropDown;
	 */

	public PRApproval2() {
		PageFactory.initElements(driver, this);
	}

	public HomePage prApproval2Page() throws Throwable {

		driver.navigate().to("https://demo_keus.getapcs.com/transaction/purchase-requisition/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String prNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		System.out.println(prNumber);

		// Store the element with hard coded PR number
		String elementXpath = "//span[normalize-space()='031023PR-00002']";

		String updatedXpath = elementXpath.replace("031023PR-00002", prNumber);

		System.out.println(updatedXpath);

		Thread.sleep(3000);
		driver.navigate().to("https://demo_keus.getapcs.com/transaction/purchase-requisition/approvalII");

		// Verify and Select Value from PR Number DropDown in PR Approval 1-Transaction
		// Module
//        WebElement prNumberDropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text']")));
		boolean prNumberDropDownIsDisplayed = prNumberDropDown.isDisplayed();
		assertTrue(prNumberDropDownIsDisplayed, "PR Number DropDown is not Displayed.");
		prNumberDropDown.sendKeys(Keys.ENTER);
		WebElement prNumberDropDownFocusedElement = driver.switchTo().activeElement();
		boolean prNumberDropDownIsSelected = prNumberDropDownFocusedElement.equals(prNumberDropDown);
		assertTrue(prNumberDropDownIsSelected, "PR Number DropDown is not Selected");
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();" ,driver.findElement(By.xpath("//span[normalize-space()='271023PR-00020']")));
		WebElement selectPRNumberDropDownValue = driver.findElement(By.xpath(updatedXpath));
		click(driver, selectPRNumberDropDownValue);

		// Verify the PR Date Element in PR View Page-Transaction Module
//        WebElement prDateElement = driver.findElement(By.xpath("//label[text()='PR Date']/following-sibling::label[@class='field2']"));
		boolean prDateElementIsDisplayed = prDateElement.isDisplayed();
		assertTrue(prDateElementIsDisplayed, "pr Date Element is not IsDisplayed.");
		String prDateElementText = prDateElement.getText().trim();
		System.out.println("PR Date : " + prDateElementText + "\n");

		// Verify the Revision Number Element in PR View Page-Transaction Module
//   	 WebElement revNumberElement = driver.findElement(By.xpath("//label[text()='Rev Number']/following-sibling::label[@class='field2']"));
		boolean revNumberElementIsDisplayed = revNumberElement.isDisplayed();
		assertTrue(revNumberElementIsDisplayed, "rev Number Element is not Displayed.");
		String revNumberElementText = revNumberElement.getText().trim();
		System.out.println("Rev Number : " + revNumberElementText + "\n");

		// Verify the Procurement Type Element in PR View Page-Transaction Module
//   	 WebElement procurementTypeElement = driver.findElement(By.xpath("//label[text()='Procurement Type']/following-sibling::label[@class='field2']"));
		boolean procurementTypeElementIsDisplayed = procurementTypeElement.isDisplayed();
		assertTrue(procurementTypeElementIsDisplayed, "Procurement Type Element is not Displayed.");
		String procurementTypeElementText = procurementTypeElement.getText().trim();
		System.out.println("Procurement Type : " + procurementTypeElementText + "\n");

		// Verify the Purpose Text Element in PR View Page-Transaction Module
//   	 WebElement purposeTextElement = driver.findElement(By.xpath("//label[text()='Purpose']/following-sibling::label[@class='field2']"));
		boolean purposeTextElementIsDisplayed = purposeTextElement.isDisplayed();
		assertTrue(purposeTextElementIsDisplayed, "Purpose Text Element is not Displayed.");
		String purposeTextElementText = purposeTextElement.getText().trim();
		System.out.println("Purpose Text : " + purposeTextElementText + "\n");

		// Verify the PR File in PR View Page-Transaction Module
//   	 WebElement prFileElement = driver.findElement(By.xpath("//label[text()='PR Files']/following-sibling::label[@class='field2']"));
		boolean prFileElementIsDisplayed = prFileElement.isDisplayed();
		assertTrue(prFileElementIsDisplayed, "PR File Element is not Displayed.");
		String prFileElementElementText = prFileElement.getText().trim();
		System.out.println("PR File Name : " + prFileElementElementText + "\n");

		// ################################## Items Tab
		// ##################################################
//	 
//		//Verify Item Tab in PR Create-Transaction Module
////		WebElement itemTab = driver.findElement(By.linkText("Items"));
//	    boolean itemTabIsDisplayed = itemsTab.isDisplayed();
//	    assertTrue(itemTabIsDisplayed, "item Tab is not Displayed.");
//	    itemsTab.click();
//	 
//	    System.out.println("########## Items Tab ############"+"\n"+"\n");
//	    
//	       //Verify The Records In Table Of Item Price List
////		   WebElement table = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='table table-striped']")));
//		   // Get headers (column names)
//		   List<WebElement> headers = table1.findElements(By.tagName("th"));
//		
//		   // Print headers
//		   for (WebElement header : headers) {
//		       System.out.print(header.getText() + "\t");
//		   }
//		   System.out.println(); // Move to the next line

//		    // Get all rows from the table
//		   
//		   List<WebElement> rows = table1.findElements(By.tagName("tr"));
//		   
//		    // Loop through each row
//		     for (WebElement row : rows) {
//		        // Get all columns for each row
//		          List<WebElement> columns = row.findElements(By.tagName("td"));
//		        
//		           // Loop through each column
//		           for (WebElement column : columns) {
//		               // Extract and print the text from the column
//		               System.out.print(column.getText() + "\t");
//		             }
//		             System.out.println(); // Move to the next row
//		           }
//		     System.out.println();
//	        

		// Verify Project Details Pop-Up
//		     WebElement projectDeatilPopUp = driver.findElement(By.xpath("//i[@title='Project']"));
		boolean projectDeatilPopUpIsDisplayed = projectDeatilPopUp.isDisplayed();
		assertTrue(projectDeatilPopUpIsDisplayed, "View Upload File Button is not Displayed.");
		projectDeatilPopUp.click();

		System.out.println("Project Details Table" + "\n");

		// Verify Project Details Pop-Up Table
//			   WebElement table1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-body']/..//table[@class='table table-striped']")));
		// Get headers (column names)
//			   List<WebElement> headers1 = table2.findElements(By.tagName("th"));
//			
//			   // Print headers
//			   for (WebElement header : headers1) {
//			       System.out.print(header.getText() + "\t");
//			   }
//			   System.out.println(); // Move to the next line
//			   
//			    // Get all rows from the table
//			   
//			   List<WebElement> rows1 = table2.findElements(By.tagName("tr"));
//			   
//			    // Loop through each row
//			     for (WebElement row : rows1) {
//			        // Get all columns for each row
//			          List<WebElement> columns = row.findElements(By.tagName("td"));
//			        
//			           // Loop through each column
//			           for (WebElement column : columns) {
//			               // Extract and print the text from the column
//			               System.out.print(column.getText() + "\t");
//			             }
//			             System.out.println(); // Move to the next row
//			           }
//			     System.out.println();
//	        
		// Close Project Details Pop-Up
		click(driver, driver.findElement(By.xpath("//button[normalize-space()='Close']")));

		// Verify Project Details Pop-Up
		WebElement deliverySchedulePopUp = driver.findElement(By.xpath("//i[@title='Delivery Schedule']"));
		boolean deliverySchedulePopUpIsDisplayed = deliverySchedulePopUp.isDisplayed();
		assertTrue(deliverySchedulePopUpIsDisplayed, "View Upload File Button is not Displayed.");
		deliverySchedulePopUp.click();

		// Verify Delivery Schedule Pop-Up Table
		System.out.println("Delivery Schedule Table" + "\n");

//			   WebElement table3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-body']/.//table[@class='table table-striped']")));
//			   // Get headers (column names)
//			   List<WebElement> headers2 = table3.findElements(By.tagName("th"));
//			
//			   // Print headers
//			   for (WebElement header : headers2) {
//			       System.out.print(header.getText() + "\t");
//			   }
//			   System.out.println(); // Move to the next line
//			   
//			    // Get all rows from the table
//			   
//			   List<WebElement> rows2 = table3.findElements(By.tagName("tr"));
//			   
//			    // Loop through each row
//			     for (WebElement row : rows2) {
//			        // Get all columns for each row
//			          List<WebElement> columns = row.findElements(By.tagName("td"));
//			        
//			           // Loop through each column
//			           for (WebElement column : columns) {
//			               // Extract and print the text from the column
//			               System.out.print(column.getText() + "\t");
//			             }
//			             System.out.println(); // Move to the next row
//			           }
//			     System.out.println();
//	        
//	        //Close Delivery Schedule Pop-Up
////	        driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		closeButton.click();
//	        
		// ################## Billing & Shipping Details Tab ######################

		// Verify Billing & Shipping Details Tab in PR Create Page
//   		WebElement billing$ShippingDetailsTab = driver.findElement(By.linkText("Billing & Shipping Details"));
		boolean billing$ShippingDetailsTabIsDisplayed = billing$ShippingDetailsTab.isDisplayed();
		assertTrue(billing$ShippingDetailsTabIsDisplayed, "Billing & Shipping Details Tab is not Displayed.");
		js.executeScript("arguments[0].click();", billing$ShippingDetailsTab);

		System.out.println("########## Billing & Shipping Details Tab ############" + "\n" + "\n");

		// Verify the Delivery Terms Element in PR View Page-Transaction Module
//   		 WebElement deliveryTermsElement = driver.findElement(By.xpath("//label[text()='Delivery Terms']/following-sibling::label[@class='data_field']"));
		boolean deliveryTermsElementIsDisplayed = deliveryTermsElement.isDisplayed();
		assertTrue(deliveryTermsElementIsDisplayed, "Delivery Terms Element is not IsDisplayed.");
		String deliveryTermsElementText = deliveryTermsElement.getText().trim();
		System.out.println("Delivery Terms : " + deliveryTermsElementText + "\n");

		// Verify the Payment Terms Element in PR View Page-Transaction Module
//   		 WebElement paymentTermsElement = driver.findElement(By.xpath("//label[text()='Payment Terms']/following-sibling::label[@class='data_field']"));
		boolean paymentTermsElementIsDisplayed = paymentTermsElement.isDisplayed();
		assertTrue(paymentTermsElementIsDisplayed, "Payment Terms Element is not IsDisplayed.");
		String paymentTermsElementText = paymentTermsElement.getText().trim();
		System.out.println("Payment Terms : " + paymentTermsElementText + "\n");

		// Verify the Shipping Mode Element in PR View Page-Transaction Module
//   		 WebElement shippingModeElement = driver.findElement(By.xpath("//label[text()='Shipping Mode']/following-sibling::label[@class='data_field']"));
		boolean shippingModeElementIsDisplayed = shippingModeElement.isDisplayed();
		assertTrue(shippingModeElementIsDisplayed, "Shipping Mode Element is not IsDisplayed.");
		String shippingModeElementText = shippingModeElement.getText().trim();
		System.out.println("Shipping Mode : " + shippingModeElementText + "\n");

		// ##################################### Terms Tab
		// ############################################

		// Verify Terms Tab in PR Create Page
//    		WebElement termsTab = driver.findElement(By.linkText("Terms"));
		boolean termsTabIsDisplayed = termsTab.isDisplayed();
		assertTrue(termsTabIsDisplayed, "Terms Tab is not Displayed.");
		js.executeScript("arguments[0].click();", termsTab);

		System.out.println("########## Terms Tab ##########" + "\n" + "\n");

		// Verify the Retention Period Element in PR View Page-Transaction Module
//		 WebElement retentionPeriodElement = driver.findElement(By.xpath("//label[text()='Retention Period']/following-sibling::label[@class='data_field']"));
		boolean retentionPeriodElementIsDisplayed = retentionPeriodElement.isDisplayed();
		assertTrue(retentionPeriodElementIsDisplayed, "Retention Period Element is not IsDisplayed.");
		String retentionPeriodElementText = retentionPeriodElement.getText().trim();
		System.out.println("Retention Period : " + retentionPeriodElementText + "\n");

		// Verify the Special Terms and Condition Element in PR View Page-Transaction
		// Module
//		 WebElement specialTermsAndConditionElement = driver.findElement(By.xpath("//label[text()='Special Terms & Conditions']/following-sibling::label[@class='data_field']"));
		boolean specialTermsAndConditionElementIsDisplayed = specialTermsAndConditionElement.isDisplayed();
		assertTrue(specialTermsAndConditionElementIsDisplayed,
				"Special Terms and Condition Element is not IsDisplayed.");
		String specialTermsAndConditionElementText = specialTermsAndConditionElement.getText().trim();
		System.out.println("Special Terms and Condition : " + specialTermsAndConditionElementText + "\n");

		// Verify approval1 Button and Click on approval1 Button
//			WebElement approval2Button = driver.findElement(By.xpath("//button[contains(text(),'Approve')]"));
		Thread.sleep(4000);
		click(driver, approval2Button);

		// Verify Yes Button and Click on yes Button
//			WebElement yesButton = driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
		Thread.sleep(2000);
		click(driver, yesButton);

		Thread.sleep(5000);

		// Approved PR Number
		// Search The PR Number and Verify
		((JavascriptExecutor) driver).executeScript("arguments[0].value='" + prNumber + "';",
				driver.findElement(By.xpath("//input[@placeholder='Search']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//button[@title='Search']")));

		Thread.sleep(3000);
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));

		System.out.println(prNumber);
		// Iterate through each row
		for (WebElement row : tableRows) {
			// Find the PR Number cell in the row
			WebElement prNumberCell = row.findElement(By.xpath("./td[2]")); // Assuming PR Number is in the second
																			// column (td[2])

			// Get the PR Number text
			String prNumberText = prNumberCell.getText().trim();

			// Check if the PR Number matches the one you want
			if (prNumberText.equals(prNumber)) {
				// If it matches, find the Approval 1 and Approval 2 cells
				WebElement approval1Cell = row.findElement(By.xpath("./td[5]")); // Assuming Approval 1 is in the fifth
																					// column (td[5])
				WebElement approval2Cell = row.findElement(By.xpath("./td[6]")); // Assuming Approval 2 is in the sixth
																					// column (td[6])

				// Get the Approval values
				String approval1Value = approval1Cell.getText().trim();
				String approval2Value = approval2Cell.getText().trim();

				// Print the Approval values
				System.out.println("Approval 1 Value: " + approval1Value);
				System.out.println("Approval 2 Value: " + approval2Value);

				// Assuming you only want to process one matching row, you can break out of the
				// loop
				break;
			}
		}
		return new HomePage();

	}
}
