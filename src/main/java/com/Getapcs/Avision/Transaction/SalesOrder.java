package com.Getapcs.Avision.Transaction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class SalesOrder extends TestBase {

	@FindBy(xpath = "(//button[text()='Release'])[1]")
	WebElement releaseButton;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	WebElement closeButton;

	@FindBy(xpath = "//button[normalize-space()='Convert To Sales Order']")
	WebElement convertToSalesOrderButton;

	@FindBy(xpath = "//label[normalize-space(text())='Project Number']/following-sibling::div/input[@formcontrolname='projectNumber']")
	WebElement projectNumberElement;

	@FindBy(xpath = "//label[normalize-space(text())='Quote Number']/following-sibling::div/input[@formcontrolname='quoteNumber']")
	WebElement quoteNumberElement;

	@FindBy(xpath = "//label[normalize-space(text())='Quote Rev No']/following-sibling::div/input[@formcontrolname='quoteRevNumber']")
	WebElement quoterevisionNumberField;

	@FindBy(xpath = "//label[normalize-space(text())='Order Date']/following-sibling::div/input[@formcontrolname='orderDate']")
	WebElement orderDatePicker1;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement orderTypeDropDown;
	@FindBy(xpath = "//span[normalize-space()='Billing']")
	WebElement orderTypeDropDownSelectData;

	@FindBy(xpath = "//label[normalize-space(text())='Customer Name']/following-sibling::div/input[@formcontrolname='customerName']")
	WebElement customerNameElement;

	@FindBy(xpath = "//label[normalize-space(text())='Customer Id']/following-sibling::div/input[@formcontrolname='customerNumber']")
	WebElement customerIdElement;

	@FindBy(xpath = "//label[normalize-space(text())='Lead Id']/following-sibling::div/input[@formcontrolname='leadId']")
	WebElement leadIdField;

//	@FindBy(xpath = "//label[normalize-space(text())='Rev No.']/following-sibling::div/input[@formcontrolname='revNo']")
//	WebElement revisionNumberField;

	@FindBy(xpath = "//label[normalize-space(text())='Requested Date']/following-sibling::div/input[@formcontrolname='requestedDate']")
	WebElement requestDateElement;

	@FindBy(xpath = "//label[normalize-space(text())='Prouct Type']/following-sibling::div/input[@formcontrolname='productType']")
	WebElement productTypeElement;

	@FindBy(xpath = "//label[normalize-space(text())='Type Of Solution']/following-sibling::div/input[@formcontrolname='typeOfSolution']")
	WebElement typeOfSolutionElement;

	@FindBy(xpath = "//label[normalize-space(text())='Total']/following-sibling::div/input[@formcontrolname='totalAmount']")
	WebElement totalElement;

//	@FindBy(xpath = "//label[normalize-space(text())='Dispatched Value']/following-sibling::div/input[@formcontrolname='dispatchedValue']")
//	WebElement dispatchedValueElement;
//	
	@FindBy(xpath = "//label[normalize-space(text())='Balance SO Value']/following-sibling::div/input[@formcontrolname='balanceSo']")
	WebElement balanceSOvalueElement;

	@FindBy(xpath = "//textarea[@placeholder='Enter Reason For Modification']")
	WebElement reasonForModificationElement;

	@FindBy(xpath = "//label[normalize-space(text())='Pricelist']/following-sibling::div/input[@placeholder='PriceList Name']")
	WebElement priceListElement;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement salesPersonDropDown;

	@FindBy(xpath = "(//span[normalize-space()='Abhilashpatil'])[1]")
	WebElement salesPersonDropDownSelectData;

	@FindBy(xpath = "//label[normalize-space(text())='Created By.']/following-sibling::div/input[@formcontrolname='createdBy']")
	WebElement createdByElement;

	// Items Tab
	@FindBy(linkText = "Items")
	WebElement itemsTab;

	@FindBy(id = "generalDiscPer")
	WebElement generalDiscountPercentageRadioButton;

	@FindBy(xpath = "//input[@value='Rupees']")
	WebElement generalDiscountRupeesRadioButton;

	@FindBy(xpath = "//input[@placeholder='Enter General Discount']")
	WebElement generalDiscountField3;

	@FindBy(xpath = "//strong[text()='Total Amount']/ancestor::label/following-sibling::div/input")
	WebElement totalAmountElement;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[1]")
	WebElement OrderQtyField1;

	@FindBy(xpath = "(//input[@value='Percentage'])[2]")
	WebElement discountPercentageRadioButton1;

	@FindBy(xpath = "(//input[@value='Rupees'])[2]")
	WebElement discountRupeesRadioButton1;

	@FindBy(xpath = "//input[@placeholder='Enter Discount']")
	WebElement discountField1;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[2]")
	WebElement sGSTField1;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[3]")
	WebElement cGSTField1;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[4]")
	WebElement iGSTField1;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[5]")
	WebElement uTGSTField1;

	@FindBy(xpath = "(//i[@title='Delivery Schedule'])[1]")
	WebElement sheduleDateButton;

	@FindBy(xpath = "(//input[@formcontrolname='deliveryScheduleDate'])[1]")
	WebElement sheduleDate;

	@FindBy(xpath = "(//input[@formcontrolname='deliveryScheduleQty'])[1]")
	WebElement quantity;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[2]")
	WebElement add;

	@FindBy(xpath = "(//button[normalize-space()='save'])[1]")
	WebElement save;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[3]")
	WebElement requestDateElement1;

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleQty']")
	WebElement quantityField1;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
	WebElement addButton;

	@FindBy(xpath = "//button[contains(text(),'save')]")
	WebElement saveButton;

	@FindBy(xpath = "(//textarea)[1]")
	WebElement remarkField1;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[6]")
	WebElement OrderQtyField2;

	@FindBy(xpath = "(//input[@value='Percentage'])[3]")
	WebElement discountPercentageRadioButton2;

	@FindBy(xpath = "(//input[@value='Rupees'])[3]")
	WebElement discountRupeesRadioButton2;

	@FindBy(xpath = "//input[@title='min:20, max:30']")
	WebElement discountField2;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[7]")
	WebElement sGSTField2;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[8]")
	WebElement cGSTField2;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[9]")
	WebElement iGSTField2;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[10]")
	WebElement uTGSTField2;

	@FindBy(xpath = "(//i[@title='Delivery Schedule'])[2]")
	WebElement scheduleDateElement2;

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleDate']")
	WebElement scheduleDateDatePicker2;

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleQty']")
	WebElement quantityField2;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
	WebElement addButton2;

	@FindBy(xpath = "//button[normalize-space()='save']")
	WebElement saveButton2;

	@FindBy(xpath = "(//textarea)[2]")
	WebElement remarkField2;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[11]")
	WebElement OrderQtyField3;

	@FindBy(xpath = "(//input[@value='Percentage'])[4]")
	WebElement discountPercentageRadioButton3;

	@FindBy(xpath = "(//input[@value='Rupees'])[4]")
	WebElement discountRupeesRadioButton3;

	@FindBy(xpath = "(//input[@placeholder='Enter Discount'])[3]")
	WebElement discountField3;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[12]")
	WebElement sGSTField3;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[13]")
	WebElement cGSTField3;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[14]")
	WebElement iGSTField3;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[15]")
	WebElement uTGSTField3;

	@FindBy(xpath = "(//i[@title='Delivery Schedule'])[3]")
	WebElement scheduleDateElement3;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[2]")
	WebElement scheduleDateDatePicker3;

	@FindBy(xpath = "//input[@formcontrolname='deliveryScheduleQty']")
	WebElement quantityField3;

	@FindBy(xpath = "(//button[contains(text(),'Add')])[2]")
	WebElement addButton3;

	@FindBy(xpath = "//button[normalize-space()='save']")
	WebElement saveButton3;

	@FindBy(xpath = "(//textarea)[3]")
	WebElement remarkField3;

	/*
	 * @FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[16]") WebElement
	 * OrderQtyField4;
	 * 
	 * @FindBy(xpath = "(//input[@value='Percentage'])[5]") WebElement
	 * discountPercentageRadioButton4;
	 * 
	 * @FindBy(xpath = "(//input[@value='Rupees'])[5]") WebElement
	 * discountRupeesRadioButton4;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='Enter Discount'])[4]") WebElement
	 * discountField4;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[17]") WebElement
	 * sGSTField4;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[18]") WebElement
	 * cGSTField4;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[19]") WebElement
	 * iGSTField4;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[20]") WebElement
	 * uTGSTField4;
	 * 
	 * @FindBy(xpath = "(//i[@title='Delivery Schedule'])[4]") WebElement
	 * scheduleDateElement4;
	 * 
	 * @FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[2]") WebElement
	 * scheduleDateDatePicker4;
	 * 
	 * @FindBy(xpath = "//input[@formcontrolname='deliveryScheduleQty']") WebElement
	 * quantityField4;
	 * 
	 * @FindBy(xpath = "(//button[contains(text(),'Add')])[2]") WebElement
	 * addButton4;
	 * 
	 * @FindBy(xpath = "//button[normalize-space()='save']") WebElement saveButton4;
	 * 
	 * @FindBy(xpath =
	 * "//*[@id=\"ngb-nav-0-panel\"]/div[2]/table/tbody/tr[4]/td[18]/div/textarea")
	 * WebElement remarkField4;
	 */

	@FindBy(xpath = "(//a[normalize-space()='Contract /PO Details'])[1]")
	WebElement poDetailsTab;

	@FindBy(xpath = "(//input[@placeholder='Enter Contract/PO Number'])[1]")
	WebElement poNumberTextField;

	@FindBy(xpath = "(//input[@formcontrolname='poDate'])[1]")
	WebElement poDatePicker;

	@FindBy(xpath = "(//input[@formcontrolname='receivedDate'])[1]")
	WebElement poReceivedDatePicker;

	@FindBy(linkText = "Billing & Shipping Details")
	WebElement billingandShippingDetailsTab;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement billToDropDown;
	@FindBy(xpath = "//span[normalize-space()='Plot No. 17 (DTA), Aditya Nagar, Adibatla.']")
	WebElement billToDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement shipToDropDown;
	@FindBy(xpath = "//span[normalize-space()='Plot No. 17 (DTA), Aditya Nagar, Adibatla.']")
	WebElement shipToDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement paymentTermsDropDown;
	@FindBy(xpath = "(//span[normalize-space()='50%-Advance'])[1]")
	WebElement paymentTermsDropDownSelectDate;

	@FindBy(xpath = "(//textarea[@formcontrolname='remarks'])[1]")
	WebElement remarkTextField;

	@FindBy(linkText = "Total Calculation")
	WebElement totalCalculationTab;

	@FindBy(xpath = "//label[normalize-space(text())='Total Amount']/following-sibling::div/input[@placeholder='Enter Total Amount']")
	WebElement totalAmountElement1;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement additionalChargesLabelNameDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST Additional Charges Name'])[1]")
	WebElement additionalChargesLabelNameDropDownSelectDate;

	@FindBy(xpath = "//input[@id='addtionalPer']")
	WebElement additionalChargesValuePercentageRadioButton;

	@FindBy(xpath = "//input[@id='addtionalAmt']")
	WebElement additionalChargesValueRupeesRadioButton;

	@FindBy(xpath = "//input[@placeholder='Enter Additional Charges']")
	WebElement additionalChargesValueField;

	@FindBy(xpath = "//input[@placeholder='Enter IGST']")
	WebElement iGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter CGST']")
	WebElement cGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter SGST']")
	WebElement sGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter UTGST']")
	WebElement uTGSTField;

	@FindBy(xpath = "//button[contains(normalize-space(),'Add')]")
	WebElement addButtoninTotalCalculationTab;

	@FindBy(xpath = "//label[normalize-space(text())='Total Additional Charges']/following-sibling::div/input[@placeholder='Enter Total Addtional Charges']")
	WebElement totaladditionalChargesElement;

	@FindBy(xpath = "//input[@id='specialDiscTotPer']")
	WebElement specialDiscountPercentageRadioButton;

	@FindBy(xpath = "//input[@id='specialDiscTotAmt']")
	WebElement specialDiscountRupeesRadioButton;

	@FindBy(xpath = "//input[@placeholder='Enter Special Discount']")
	WebElement specialDiscountField;

	@FindBy(xpath = "//label[normalize-space(text())='Total Final Amount']/following-sibling::div/input[@placeholder='Enter Total Final Amount']")
	WebElement totalFinalAmountElement;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement saveButtonOfSalesOrderCreatePage;

	public SalesOrder() {

		PageFactory.initElements(driver, this);
	}

	public HomePage salesOrderCreate(String generalDiscount, String orderQty, String discount1, String sgst1,
			String cgst1, String igst1, String utgst1, String quantity1, String remark1, String orderqty2,
			String discount2, String sgst2, String cgst2, String igst2, String utgst2, String quantity2, String remark2,
			String orderQty3, String discount3, String sgst3, String cgst3, String igst3, String utgst3,
			String quantity3, String remark3, String orderQty4, String discount4, String sgst4, String cgst4,
			String igst4, String utgst4, String quantity4, String remark4, String poNumber,
			String billingandShippingRemark, String additionalCharges, String sgst, String cgst, String igst,
			String utgst, String specialDiscount) throws Throwable {

		click(driver, releaseButton);

		click(driver, closeButton);

		click(driver, releaseButton);

		click(driver, convertToSalesOrderButton);
		Thread.sleep(2000);

		// ################ Sales Order Create Page ##################

		dataPrintFromInputtag(driver, projectNumberElement, "projectNumberElement");

		dataPrintFromInputtag(driver, quoteNumberElement, "quoteNumberElement");

		dataPrintFromInputtag(driver, quoterevisionNumberField, "quoterevisionNumberField");

		dataPrintFromInputtag(driver, orderDatePicker1, "orderDatePicker1");

		click(driver, orderTypeDropDown);
		isSelected(driver, orderTypeDropDown, "orderTypeDropDown");
		click(driver, orderTypeDropDownSelectData);

		dataPrintFromInputtag(driver, customerNameElement, "customerNameElement");

		dataPrintFromInputtag(driver, customerIdElement, "customerIdElement");

		// ################## Items Tab ######################

		// Verify Items Tab in Sales Order Create Page

		click(driver, itemsTab);

		// Verify General Discount Percentage Radio Button in General Tab
		assertTrue(generalDiscountPercentageRadioButton.isDisplayed(),
				"General Discount Percentage Radio Button is not Displayed.");

		click(driver, generalDiscountPercentageRadioButton);

		// Verify General Discount Rupees Radio Button in General Tab
		assertTrue(generalDiscountRupeesRadioButton.isDisplayed(),
				"General Discount Rupees Radio Button is not Displayed.");
		click(driver, generalDiscountRupeesRadioButton);

		click(driver, generalDiscountField3);
		isSelected(driver, generalDiscountField3, "generalDiscountField3");
		generalDiscountField3.clear();
		generalDiscountField3.sendKeys(generalDiscount);

		dataPrintFromInputtag(driver, totalAmountElement, "totalAmountElement");

		// -------------------------------------------------------------------------------------------------------------------------------------------------------------------

		// Verify the Order Qty Field1 in Sales Order Create Page-Transaction Module
		click(driver, OrderQtyField1);
		isSelected(driver, OrderQtyField1, "OrderQtyField1");
		OrderQtyField1.clear();
		String n = "168";
		OrderQtyField1.sendKeys(n);
		
//		OrderQtyField1.sendKeys(Keys.ENTER);
//		WebElement OrderQtyField1FocusedElement = driver.switchTo().activeElement();
//	    boolean OrderQtyField1IsSelected = OrderQtyField1FocusedElement.equals(OrderQtyField1);
//	    assertTrue(OrderQtyField1IsSelected, "Order Qty Field1 is not Selected");
//	    OrderQtyField1.clear();
//	    OrderQtyField1.sendKeys(orderQty);

		// Verify Discount Percentage Radio Button1 in General Tab
		assertTrue(discountPercentageRadioButton1.isDisplayed(), "Discount Percentage Radio Button1 is not Displayed.");
//	    discountPercentageRadioButton1.click();

		// Verify Discount Rupees Radio Button1 in General Tab
		assertTrue(discountRupeesRadioButton1.isDisplayed(), "Discount Rupees Radio Button1 is not Displayed.");
//	    discountRupeesRadioButton1.click();

		// Verify the discount Field1 in General Tab
		assertTrue(discountField1.isDisplayed(), "discount Field1 is not Displayed.");
//        discountField1.sendKeys(Keys.ENTER);
//        WebElement discountField1FocusedElement = driver.switchTo().activeElement();
//        boolean discountField1IsSelected = discountField1FocusedElement.equals(discountField1);
//        assertTrue(discountField1IsSelected, "discount Field1 is not Selected");
//        discountField1.clear();
//        discountField1.sendKeys(discount1);

		click(driver, sGSTField1);
		isSelected(driver, sGSTField1, "sGSTField1");
		sGSTField1.clear();
		sGSTField1.sendKeys(sgst1);

		click(driver, cGSTField1);
		isSelected(driver, cGSTField1, "cGSTField1");
		cGSTField1.clear();
		cGSTField1.sendKeys(cgst1);

		click(driver, iGSTField1);
		isSelected(driver, iGSTField1, "iGSTField1");
		iGSTField1.clear();
		iGSTField1.sendKeys(igst1);

		click(driver, uTGSTField1);
		isSelected(driver, uTGSTField1, "uTGSTField1");
		uTGSTField1.clear();
		uTGSTField1.sendKeys(utgst1);

		// Shedule Date Picker

		click(driver, sheduleDateButton);

		click(driver, sheduleDate);

		datePicker(driver, sheduleDate);

		click(driver, quantity);
		quantity.clear();
		quantity.sendKeys(n);
		click(driver, add);
		click(driver, save);
		
		click(driver, remarkField1);
		isSelected(driver, remarkField1, "remarkField1");
		remarkField1.clear();
		remarkField1.sendKeys(remark1);

		// ################## PO Details Tab ######################

		click(driver, poDetailsTab);

		// Verify the PO Number Text Field
		assertTrue(poNumberTextField.isDisplayed(), "PO Text Field is not Displayed.");
		poNumberTextField.sendKeys(Keys.ENTER);
		WebElement poNumberTextFieldFocusedElement = driver.switchTo().activeElement();
		boolean poNumberTextFieldIsSelected = poNumberTextFieldFocusedElement.equals(poNumberTextField);
		assertTrue(poNumberTextFieldIsSelected, "PO Text Field is not Selected");

		click(driver, poNumberTextField);
		isSelected(driver, poNumberTextField, "poNumberTextField");
		poNumberTextField.clear();
		poNumberTextField.sendKeys(poNumber);

		// Verify and PO Date Picker in in General Tab

		datePicker(driver, poDatePicker);

		selectPreviousDate(driver, poReceivedDatePicker,3);

		// ################## Billing & Shipping Details Tab ######################

		click(driver, billingandShippingDetailsTab);

		click(driver, billToDropDown);
		isSelected(driver, billToDropDown, "billToDropDown");
		click(driver, billToDropDownSelectData);

		// Verify the Ship To Drop Down in Sales Order Create Page-Transaction Module
		click(driver, shipToDropDown);
		click(driver, shipToDropDownSelectData);

		click(driver, paymentTermsDropDown);
		isSelected(driver, paymentTermsDropDown, "paymentTermsDropDown");
		click(driver, paymentTermsDropDownSelectDate);

		click(driver, remarkTextField);
		isSelected(driver, remarkTextField, "remarkTextField");
		remarkTextField.clear();
		remarkTextField.sendKeys(billingandShippingRemark);

		// ################## Total Calculation Tab ######################

		click(driver, totalCalculationTab);

		dataPrintFromInputtag(driver, totaladditionalChargesElement, "totaladditionalChargesElement");

		dataPrintFromInputtag(driver, totalFinalAmountElement, "totalFinalAmountElement");

		click(driver, saveButtonOfSalesOrderCreatePage);

		return new HomePage();

	}

}
