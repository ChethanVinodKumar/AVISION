package com.Getapcs.Avision.Transaction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class Purchase_Requisation_FG extends TestBase {

	@FindBy(xpath = "//label[normalize-space(text())='PR Date']/following-sibling::div/input[@formcontrolname='prDate']")
	WebElement prDateElement;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Issue Material'])[1]")
	WebElement materialIssueViewButton_FG;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement procurementTypeDropDown;

	@FindBy(xpath = "(//span[text()='TEST Procutement'])[1]")
	WebElement selectProcurementTypeDropDownValue;

	@FindBy(xpath = "//textarea[@placeholder='Enter Special Terms and Conditions']")
	WebElement purposeTextField;

	@FindBy(xpath = "(//input[@placeholder='Upload file'])[1]")
	WebElement uploadFile;

	@FindBy(linkText = "Items")
	WebElement itemTab;

	@FindBy(xpath = "(//button[normalize-space()='Upload Files'])[1]")
	WebElement uploadFiles;

	@FindBy(xpath = "(//input[@formcontrolname='prItemFiles'])[1]")
	WebElement uploadItemFiels;
	@FindBy(xpath = "(//button[normalize-space()='Upload'])[1]")
	WebElement uploadButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement saveFiles;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement itemNumberDropDown;

	@FindBy(xpath = "//span[text()='PP1-1']")
	WebElement selectItemNumberDropDownValue;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement mftrItemNumberDropDown;
	@FindBy(xpath = "(//span[contains(text(),'PP1')])[1]")
	WebElement selectMftrItemNumberDropDownValue;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement quantityTextField;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-purchase-requisition/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/mat-expansion-panel/mat-expansion-panel-header/span[2]")
	WebElement addProjectExpansionPanel;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement projectNumberDropDown;

	@FindBy(xpath = "(//input[@formcontrolname='prProjectQuantity'])[1]")
	WebElement projectQuantityTextField;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[1]")
	WebElement addButtonInProjectExpansionPanel;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-purchase-requisition/div[2]/div/div/div/form/div/div[2]/div/div/div[4]/mat-expansion-panel/mat-expansion-panel-header/span[2]")
	WebElement addDeliveryScheduleExpansionPanel;

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleDate']")
	WebElement scheduleDateDatePicker;

	@FindBy(xpath = "(//input[@formcontrolname='deliveryScheduleQty'])[1]")
	WebElement quantityTextField1;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-purchase-requisition/div[2]/div/div/div/form/div/div[2]/div/div/div[5]/mat-expansion-panel/mat-expansion-panel-header/span[2]")
	WebElement addSpecialInstructionsPanel;

	@FindBy(xpath = "(//input[@placeholder='Enter Special Instruction'])[1]")
	WebElement specialInstructionTextField;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
	WebElement addButtonInDeliveryScheduleExpansionPanel;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[3]")
	WebElement addButtonSpecialInstruction;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[4]")
	WebElement itemLevelAddButton;

	@FindBy(linkText = "Billing & Shipping Details")
	WebElement billing$ShippingDetailsTab;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement deliveryTermsDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST DeliveryTerms'])[1]")
	WebElement selectDeliveryTermsDropDownValue;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement paymentTermsDropDown;

	@FindBy(xpath = "(//span[normalize-space()='50%-Advance'])[1]")
	WebElement selectPaymentTermsDropDownValue;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement shippingModeDropDown;
	@FindBy(xpath = "(//span[normalize-space()='By Road'])[1]")
	WebElement selectShippingModeDropDownValue;

	@FindBy(linkText = "Terms")
	WebElement termsTab;

	@FindBy(xpath = "//input[@placeholder='Enter Retention Period']")
	WebElement retentionPeriodTextField;

	@FindBy(xpath = "//textarea[@placeholder='Enter Special Terms & Conditions']")
	WebElement specialTerms$ConditionTextField;

	@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
	WebElement saveButtonInPRCreate;

	// PR Approval 1

	@FindBy(xpath = "//label[text()='PR Date']/..//label[@class='field2']")
	WebElement prDateElement1;

	@FindBy(xpath = "//input[@type='text']")
	WebElement prNumberDropDown;
//	@FindBy(xpath = "//span[normalize-space()='031023PR-00002']")
//	WebElement selectPRNumberDropDownValue;

//	@FindBy(xpath = "//label[text()='PR Date']/following-sibling::label[@class='field2']")
//	WebElement prDateElement;

	@FindBy(xpath = "//label[text()='Rev Number']/following-sibling::label[@class='field2']")
	WebElement revNumberElement;

	@FindBy(xpath = "//label[text()='Procurement Type']/following-sibling::label[@class='field2']")
	WebElement procurementTypeElement;

	@FindBy(xpath = "//label[text()='Purpose']/following-sibling::label[@class='field2']")
	WebElement purposeTextElement;

	@FindBy(xpath = "//label[text()='PR Files']/following-sibling::label[@class='field2']")
	WebElement prFileElement;

	// Items Tab
	@FindBy(linkText = "Items")
	WebElement itemsTab;

	@FindBy(xpath = "//table[@class='table table-striped']")
	WebElement table;

	@FindBy(xpath = "//i[@title='Project']")
	WebElement projectDeatilPopUp;

	@FindBy(xpath = "//div[@class='modal-body']/..//table[@class='table table-striped']")
	WebElement table1;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeButton;

	@FindBy(xpath = "//i[@title='Delivery Schedule']")
	WebElement deliverySchedulePopUp;

//	@FindBy(linkText = "Billing & Shipping Details")
//	WebElement billing$ShippingDetailsTab;

	@FindBy(xpath = "//label[text()='Delivery Terms']/following-sibling::label[@class='data_field']")
	WebElement deliveryTermsElement;

	@FindBy(xpath = "//label[text()='Payment Terms']/following-sibling::label[@class='data_field']")
	WebElement paymentTermsElement;

	@FindBy(xpath = "//label[text()='Shipping Mode']/following-sibling::label[@class='data_field']")
	WebElement shippingModeElement;

//	@FindBy(linkText = "Terms")
//	WebElement termsTab;

	@FindBy(xpath = "//label[text()='Retention Period']/following-sibling::label[@class='data_field']")
	WebElement retentionPeriodElement;

	@FindBy(xpath = "//label[text()='Special Terms & Conditions']/following-sibling::label[@class='data_field']")
	WebElement specialTermsAndConditionElement;

	@FindBy(xpath = "//button[contains(text(),'Approve')]")
	WebElement approval1Button;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement yesButton;

	// PR Approval 2

	@FindBy(xpath = "//table[@class='table table-striped']")
	WebElement table2;

	@FindBy(xpath = "//button[contains(text(),'Approve')]")
	WebElement approval2Button;

	public Purchase_Requisation_FG() {

		PageFactory.initElements(driver, this);
	}

//****************************************************** PR CREATE *************************************************// 

	public HomePage prCreatePage() throws Throwable {

		boolean prDateElementIsDisplayed = prDateElement.isDisplayed();
		assertTrue(prDateElementIsDisplayed, "Project Number Element is not IsDisplayed.");
		// To extract Value Attribute and use same approach to retrieve
		String prDateElementValue = (String) js.executeScript("return arguments[0].value;", prDateElement);
		System.out.println("Pr Date : " + prDateElementValue + "\n");

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

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-requisition/create");

		// Procutement Type

		click(driver, procurementTypeDropDown);

		click(driver, selectProcurementTypeDropDownValue);

		// Purpose Field

		click(driver, purposeTextField);

		isSelected(driver, purposeTextField, "purposeTextField");

		purposeTextField.sendKeys("TEST Purpose");

		// Upload Files

		uploadFile(driver, uploadFile, 1);
//		click(driver, deliveryTermsElement)

		// ################## Item Tab ######################

		click(driver, itemTab);

		// Item Number

		for (int i = 1; i <= 2; i++) {

			click(driver, itemNumberDropDown);

			itemNumberDropDown.clear();
			itemNumberDropDown.sendKeys("PP");

			if (i == 1) {
				WebElement itemNumberDropDownDataSelect = driver.findElement(By.xpath(updatedXpathPP1));
				waitForElement(driver, itemNumberDropDownDataSelect, 20, 1);
				click(driver, itemNumberDropDownDataSelect);
			}

			if (i == 2) {
				WebElement itemNumberDropDownDataSelect1 = driver.findElement(By.xpath(updatedXpathPP2));
				waitForElement(driver, itemNumberDropDownDataSelect1, 20, 1);
				click(driver, itemNumberDropDownDataSelect1);

			}

			// MFTR Item Number

			click(driver, mftrItemNumberDropDown);

			mftrItemNumberDropDown.sendKeys(Keys.ENTER);

			mftrItemNumberDropDown.sendKeys(Keys.ENTER);

			// Quantity

			click(driver, quantityTextField);

			isSelected(driver, quantityTextField, "quantityTextField");

			quantityTextField.clear();

			quantityTextField.sendKeys("1000");

			// Upload files

			if (i == 1) {
				click(driver, uploadFiles);

				uploadFile(driver, uploadItemFiels, 1);
				click(driver, uploadButton);
				click(driver, closeButton);
			}

			// ************Add Project Expansion Panel************

			if (i == 1) {
				click(driver, addProjectExpansionPanel);
			}

			click(driver, projectNumberDropDown);

			WebElement selectProjectNumberDropDownValue = driver.findElement(By.xpath(updatedXpath1));

			click(driver, selectProjectNumberDropDownValue);

			click(driver, projectQuantityTextField);

			projectQuantityTextField.clear();

			projectQuantityTextField.sendKeys("1000");

			click(driver, addButtonInProjectExpansionPanel);

			// ************Add Delivery Schedule Expansion Panel************

			if (i == 1) {
				click(driver, addDeliveryScheduleExpansionPanel);
			}

			waitForElement(driver, scheduleDateDatePicker, 10, 1);

//			assertTrue(scheduleDateDatePicker.isDisplayed(), "Date Picker is not Displayed.");
			Thread.sleep(2000);
			click(driver, scheduleDateDatePicker);

			for (int j = 0; j <= 5; j++) {
				scheduleDateDatePicker.sendKeys(Keys.ARROW_DOWN);
				Thread.sleep(500); // Add a small delay if needed
			}

			scheduleDateDatePicker.sendKeys(Keys.ARROW_LEFT);
			scheduleDateDatePicker.sendKeys(Keys.ENTER);
//			datePicker(driver, scheduleDateDatePicker);

			click(driver, quantityTextField1);

			quantityTextField1.clear();

			quantityTextField1.sendKeys("1000");

			click(driver, addButtonInDeliveryScheduleExpansionPanel);

			if (i == 1) {

				click(driver, addSpecialInstructionsPanel);

			}
			click(driver, specialInstructionTextField);

			specialInstructionTextField.clear();

			specialInstructionTextField.sendKeys("TEST Special Instruction");

			click(driver, addButtonSpecialInstruction);

			click(driver, itemLevelAddButton);
		}

		// ################## Billing & Shipping Details Tab ######################

		click(driver, billing$ShippingDetailsTab);

		click(driver, deliveryTermsDropDown);

		deliveryTermsDropDown.sendKeys("TEST Delivery");

		click(driver, selectDeliveryTermsDropDownValue);

		click(driver, paymentTermsDropDown);

		click(driver, selectPaymentTermsDropDownValue);

		click(driver, shippingModeDropDown);

		click(driver, selectShippingModeDropDownValue);

		// ##################################### Terms Tab
		// ############################################

		click(driver, termsTab);

		click(driver, retentionPeriodTextField);

		retentionPeriodTextField.clear();

		retentionPeriodTextField.sendKeys("TEST Retention Period");

		click(driver, specialTerms$ConditionTextField);

		specialTerms$ConditionTextField.clear();

		specialTerms$ConditionTextField.sendKeys("TEST Special Terms & Condition");

		String beforeSaveButton = driver.getCurrentUrl();
		System.out.println(beforeSaveButton);

		Thread.sleep(4000);

		click(driver, saveButtonInPRCreate);

		Thread.sleep(4000);
		String afterSaveButton = driver.getCurrentUrl();
		System.out.println(afterSaveButton);

		return new HomePage();

	}

}
