package com.Getapcs.Avision.Transaction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class PurchaseRequisition_Edit extends TestBase {
	
	@FindBy(xpath = "(//i[@title='Edit Purchase Requisition'])[1]")
	WebElement prEditOption;

	@FindBy(xpath = "//label[normalize-space(text())='PR Date']/following-sibling::div/input[@formcontrolname='prDate']")
	WebElement prDateElement;

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
	WebElement uploadFilesButton;

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

	@FindBy(xpath = "//input[@placeholder='DD-MM-YYYY']")
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
	WebElement addButtonInItemsTab;

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
	WebElement saveButtonInPREdit;

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

	public PurchaseRequisition_Edit() {

		PageFactory.initElements(driver, this);
	}

//******************************************************PR CREATE*************************************************// 

	public HomePage prEditPage() throws Throwable {

		click(driver, prEditOption);
		
		Thread.sleep(3000);
		// Purpose Field

		click(driver, purposeTextField);

		isSelected(driver, purposeTextField, "purposeTextField");

		purposeTextField.clear();
		purposeTextField.sendKeys("TEST Purpose1");

		click(driver, saveButtonInPREdit);

		return new HomePage();

	}

}