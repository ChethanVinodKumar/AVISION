package com.Getapcs.Avision.Transaction;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class PurchaseOrder_Edit extends TestBase {

	@FindBy(xpath = "(//table[@class='table table-striped']/..//i[@title='Click to edit'])[1]")
	WebElement poEditOption;

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

	@FindBy(xpath = "(//button[@class='btn btn_primary_add ng-star-inserted'][normalize-space()='Add'])[3]")
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
	WebElement saveButton;

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

	public PurchaseOrder_Edit() {
		PageFactory.initElements(driver, this);
	}

//*****************************PO Create Page*************************************//

	public HomePage purchaseOrderEditPage() throws Throwable {

		click(driver, poEditOption);

		click(driver, quotationReferenceNo);
		isSelected(driver, quotationReferenceNo, "quotationReferenceNo");
		quotationReferenceNo.clear();
		quotationReferenceNo.sendKeys("QRN-86");
		
		click(driver, saveButton);

		return new HomePage();
	}

}
