package com.Getapcs.Avision.Transaction;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class Purchase_Order extends TestBase {
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
	WebElement save;

	@FindBy(xpath = "(//input[@placeholder='Upload file'])[1]")
	WebElement UploadFiles1;

//PO Approval 1

	@FindBy(xpath = "(//button[normalize-space()='View'])[1]")
	WebElement arrroval1View;

	@FindBy(xpath = "(//button[normalize-space()='Approve'])[1]")
	WebElement approve;

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

	public Purchase_Order() {
		PageFactory.initElements(driver, this);
	}

//*****************************PO Create Page*************************************//

	public HomePage purchaseOrderCreatePage(String refNo, String unitcost, String quantity, String projectQty,
			String deliveryProjectQty, String instructions, String sgst, String cgst, String igst, String utgst,
			String retention, String special, String inco) throws Throwable {

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/item-master/table");

		String tableXpath = "//table[@class='table table-striped']";

		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumber + "-Test Description");
		System.out.println(updatedXpath);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/sales-order/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String ProjectNumber = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[4]")).getText();

		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath1 = elementXpath1.replace("Item-FG-11-TEST", ProjectNumber);
		System.out.println(updatedXpath1);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/create");

		boolean isDisabledprocutementTypeFieldn = !procutementType.isDisplayed();
		Assert.assertFalse(isDisabledprocutementTypeFieldn);

		WebElement procutementTypeFieldFocusedElement = driver.switchTo().activeElement();
		boolean procutementTypeFieldIsSelected = procutementTypeFieldFocusedElement.equals(procutementType);
		Assert.assertFalse(procutementTypeFieldIsSelected, "procutementType Text Field is not Selected");

		procutementType.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click()", procutementTypeSelect);

		// Verify that currency Field is Displayed or not
		boolean isDisabledcurrencyFieldn = !currency.isDisplayed();
		Assert.assertFalse(isDisabledcurrencyFieldn);

		// Verify that currency Field is clickable or not
		WebElement currencyFieldFocusedElement = driver.switchTo().activeElement();
		boolean currencyFieldIsSelected = currencyFieldFocusedElement.equals(currency);
		Assert.assertFalse(currencyFieldIsSelected, "currency Text Field is not Selected");

		currency.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click()", currencySelect);

//Vender Details

		// Verify that vendorName Field is Displayed or not
		boolean isDisabledvenderNameFieldn = !vendorName.isDisplayed();
		Assert.assertFalse(isDisabledvenderNameFieldn);

		// Verify that venderName Field is clickable or not
		WebElement venderNameFieldFocusedElement = driver.switchTo().activeElement();
		boolean venderNameFieldIsSelected = venderNameFieldFocusedElement.equals(vendorName);
		Assert.assertFalse(venderNameFieldIsSelected, "venderName Text Field is not Selected");

		vendorName.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click()", vendorNameSelect);

		// 1Verifying that quotationReferenceNo Field is Enabled or not
		boolean isEnabledquotationReferenceNoField = quotationReferenceNo.isEnabled();
		Assert.assertTrue(isEnabledquotationReferenceNoField);
		boolean isDisabledquotationReferenceNoFieldn = !quotationReferenceNo.isEnabled();
		Assert.assertFalse(isDisabledquotationReferenceNoFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedquotationReferenceNoField = quotationReferenceNo.isDisplayed();
		Assert.assertTrue(isDisplayedquotationReferenceNoField);
		boolean isHiddenquotationReferenceNoField = !quotationReferenceNo.isDisplayed();
		Assert.assertFalse(isHiddenquotationReferenceNoField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextInquotationReferenceNo = quotationReferenceNo.getAttribute("placeholder");

		String expected_placeholder = "Enter Quotation Reference No.";

		assertEquals(displayedTextInquotationReferenceNo, expected_placeholder);
		quotationReferenceNo.sendKeys(refNo);

		// Verify that Quotation date is selecting or not
		click(driver, quotationDate);
		quotationDate.sendKeys(Keys.RIGHT);
		quotationDate.sendKeys(Keys.ENTER);

		// Verify that venderAddress Field is Displayed or not
		boolean isDisabledvenderAddressFieldn = !venderAddress.isDisplayed();
		Assert.assertFalse(isDisabledvenderAddressFieldn);

		// Verify that venderAddress Field is clickable or not
		WebElement venderAddressFieldFocusedElement = driver.switchTo().activeElement();
		boolean venderAddressFieldIsSelected = venderAddressFieldFocusedElement.equals(venderAddress);
		Assert.assertFalse(venderAddressFieldIsSelected, "venderAddress Text Field is not Selected");

		venderAddress.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click()", venderAddressSelect);

//Items

		click(driver, items);

		click(driver, itemNumber);

		WebElement itemNumberSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, itemNumberSelect);

		// 1Verifying that unitCost Field is Enabled or not
		boolean isEnabledunitCostField = unitCost.isEnabled();
		Assert.assertTrue(isEnabledunitCostField);
		boolean isDisabledunitCostFieldn = !unitCost.isEnabled();
		Assert.assertFalse(isDisabledunitCostFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedunitCostField = unitCost.isDisplayed();
		Assert.assertTrue(isDisplayedunitCostField);
		boolean isHiddenunitCostField = !unitCost.isDisplayed();
		Assert.assertFalse(isHiddenunitCostField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextInunitCost = unitCost.getAttribute("placeholder");

		String expected_placeholder_unitCost = "Enter Unit Price";

		assertEquals(displayedTextInunitCost, expected_placeholder_unitCost);

		unitCost.sendKeys(unitcost);

		// 1Verifying that quntity Field is Enabled or not
		boolean isEnabledquntityField = quntity.isEnabled();
		Assert.assertTrue(isEnabledquntityField);
		boolean isDisabledquntityFieldn = !quntity.isEnabled();
		Assert.assertFalse(isDisabledquntityFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedquntityField = quntity.isDisplayed();
		Assert.assertTrue(isDisplayedquntityField);
		boolean isHiddenquntityField = !quntity.isDisplayed();
		Assert.assertFalse(isHiddenquntityField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextInquntity = quntity.getAttribute("placeholder");

		String expected_placeholderquntity = "Enter Quantity";

		assertEquals(displayedTextInquntity, expected_placeholderquntity);
		quntity.sendKeys(quantity);

		js.executeScript("arguments[0].click()", addProject);

//		//Verify that  projectNumber Field is Displayed or not
//		boolean isDisabledprojectNumberFieldn = !projectNumber.isDisplayed(); 
//		Assert.assertFalse(isDisabledprojectNumberFieldn);
//		
//		//Verify that  projectNumber Field is clickable or not
//  		WebElement projectNumberFieldFocusedElement = driver.switchTo().activeElement();
//	    boolean projectNumberFieldIsSelected = projectNumberFieldFocusedElement.equals(projectNumber);
//	    Assert.assertTrue(projectNumberFieldIsSelected, "projectNumber Text Field is not Selected");

		projectNumber.sendKeys(Keys.ENTER);
		WebElement projectNumberSelect = driver.findElement(By.xpath(updatedXpath1));
		click(driver, projectNumberSelect);

		// 1Verifying that projectQuntity Field is Enabled or not
		boolean isEnabledprojectQuntityField = projectQuntity.isEnabled();
		Assert.assertTrue(isEnabledprojectQuntityField);
		boolean isDisabledprojectQuntityFieldn = !projectQuntity.isEnabled();
		Assert.assertFalse(isDisabledprojectQuntityFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedprojectQuntityField = projectQuntity.isDisplayed();
		Assert.assertTrue(isDisplayedprojectQuntityField);
		boolean isHiddenprojectQuntityField = !projectQuntity.isDisplayed();
		Assert.assertFalse(isHiddenprojectQuntityField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextInprojectQuntity = projectQuntity.getAttribute("placeholder");

		String expected_placeholderprojectQuntity = "Enter Quantity";

		assertEquals(displayedTextInprojectQuntity, expected_placeholderprojectQuntity);

		projectQuntity.sendKeys(projectQty);

		click(driver, prButton);

		click(driver, prSelect);

		click(driver, savePR);

		js.executeScript("arguments[0].click()", addProjectNumber);

		js.executeScript("arguments[0].click()", DeliveryShedule);

		// Verify that do we able to select the date in delevery schedule
		deliveryDate.click();
		deliveryDate.sendKeys(Keys.RIGHT);
		deliveryDate.sendKeys(Keys.ENTER);

		// 1Verifying that deliverySheduleQuntity Field is Enabled or not
		boolean isEnableddeliverySheduleQuntityField = deliverySheduleQuntity.isEnabled();
		Assert.assertTrue(isEnableddeliverySheduleQuntityField);
		boolean isDisableddeliverySheduleQuntityFieldn = !deliverySheduleQuntity.isEnabled();
		Assert.assertFalse(isDisableddeliverySheduleQuntityFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayeddeliverySheduleQuntityField = deliverySheduleQuntity.isDisplayed();
		Assert.assertTrue(isDisplayeddeliverySheduleQuntityField);
		boolean isHiddendeliverySheduleQuntityField = !deliverySheduleQuntity.isDisplayed();
		Assert.assertFalse(isHiddendeliverySheduleQuntityField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextIndeliverySheduleQuntity = deliverySheduleQuntity.getAttribute("placeholder");

		String expected_placeholderdeliverySheduleQuntity = "Enter Quantity";

		assertEquals(displayedTextIndeliverySheduleQuntity, expected_placeholderdeliverySheduleQuntity);

		deliverySheduleQuntity.sendKeys(deliveryProjectQty);

		js.executeScript("arguments[0].click()", addDeliveryShedule);

		click(driver, addSpecialInstructions);

		// 1Verifying that specialInstructions Field is Enabled or not
		boolean isEnabledspecialInstructionsField = specialInstructions.isEnabled();
		Assert.assertTrue(isEnabledspecialInstructionsField);
		boolean isDisabledspecialInstructionsFieldn = !specialInstructions.isEnabled();
		Assert.assertFalse(isDisabledspecialInstructionsFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedspecialInstructionsField = specialInstructions.isDisplayed();
		Assert.assertTrue(isDisplayedspecialInstructionsField);
		boolean isHiddenspecialInstructionsField = !specialInstructions.isDisplayed();
		Assert.assertFalse(isHiddenspecialInstructionsField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextInspecialInstructions = specialInstructions.getAttribute("placeholder");

		String expected_placeholderspecialInstructions = "Enter Special Instruction";

		assertEquals(displayedTextInspecialInstructions, expected_placeholderspecialInstructions);

		specialInstructions.sendKeys(instructions);

		click(driver, addspecialInstructions);

		// 1Verifying that sgst Field is Enabled or not
		boolean isEnabledsgstField = sgst1.isEnabled();
		Assert.assertTrue(isEnabledsgstField);
		boolean isDisabledsgstFieldn = !sgst1.isEnabled();
		Assert.assertFalse(isDisabledsgstFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedsgstField = sgst1.isDisplayed();
		Assert.assertTrue(isDisplayedsgstField);
		boolean isHiddensgstField = !sgst1.isDisplayed();
		Assert.assertFalse(isHiddensgstField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextInsgst = sgst1.getAttribute("placeholder");

		String expected_placeholdersgst = "Enter SGST";

		assertEquals(displayedTextInsgst, expected_placeholdersgst);

		sgst1.sendKeys(sgst);

		// 1Verifying that cgst Field is Enabled or not
		boolean isEnabledcgstField = cgst1.isEnabled();
		Assert.assertTrue(isEnabledcgstField);
		boolean isDisabledcgstFieldn = !cgst1.isEnabled();
		Assert.assertFalse(isDisabledcgstFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedcgstField = cgst1.isDisplayed();
		Assert.assertTrue(isDisplayedcgstField);
		boolean isHiddencgstField = !cgst1.isDisplayed();
		Assert.assertFalse(isHiddencgstField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextIncgst = cgst1.getAttribute("placeholder");

		String expected_placeholdercgst = "Enter CGST";

		assertEquals(displayedTextIncgst, expected_placeholdercgst);

		cgst1.sendKeys(cgst);

		// 1Verifying that igst Field is Enabled or not
		boolean isEnabledigstField = igst1.isEnabled();
		Assert.assertTrue(isEnabledigstField);
		boolean isDisabledigstFieldn = !igst1.isEnabled();
		Assert.assertFalse(isDisabledigstFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedigstField = igst1.isDisplayed();
		Assert.assertTrue(isDisplayedigstField);
		boolean isHiddenigstField = !igst1.isDisplayed();
		Assert.assertFalse(isHiddenigstField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextInigst = igst1.getAttribute("placeholder");

		String expected_placeholderigst = "Enter ";

		assertEquals(displayedTextInigst, expected_placeholderigst);

		igst1.sendKeys(igst);

		// 1Verifying that utgst Field is Enabled or not
		boolean isEnabledutgstField = utgst1.isEnabled();
		Assert.assertTrue(isEnabledutgstField);
		boolean isDisabledutgstFieldn = !utgst1.isEnabled();
		Assert.assertFalse(isDisabledutgstFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedutgstField = utgst1.isDisplayed();
		Assert.assertTrue(isDisplayedutgstField);
		boolean isHiddenutgstField = !utgst1.isDisplayed();
		Assert.assertFalse(isHiddenutgstField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextInutgst = utgst1.getAttribute("placeholder");

		String expected_placeholderutgst = "Enter UTGST";

		assertEquals(displayedTextInutgst, expected_placeholderutgst);

		utgst1.sendKeys(utgst);

		js.executeScript("arguments[0].click()", addItems);

//Billing and Shipping Details

		js.executeScript("arguments[0].click()", billing);

		// Verify that deliveryTerms Field is Displayed or not
		boolean isDisableddeliveryTermsFieldn = !deliveryTerms.isDisplayed();
		Assert.assertFalse(isDisableddeliveryTermsFieldn);

		// Verify that deliveryTerms Field is clickable or not
		WebElement deliveryTermsFieldFocusedElement = driver.switchTo().activeElement();
		boolean deliveryTermsFieldIsSelected = deliveryTermsFieldFocusedElement.equals(deliveryTerms);
		Assert.assertFalse(deliveryTermsFieldIsSelected, "deliveryTerms Text Field is not Selected");

		deliveryTerms.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click()", deliveryTermsSelect);

		// Verify that paymentTerms Field is Displayed or not
		boolean isDisabledpaymentTermsFieldn = !paymentTerms.isDisplayed();
		Assert.assertFalse(isDisabledpaymentTermsFieldn);

		// Verify that paymentTerms Field is clickable or not
		WebElement paymentTermsFieldFocusedElement = driver.switchTo().activeElement();
		boolean paymentTermsFieldIsSelected = paymentTermsFieldFocusedElement.equals(paymentTerms);
		Assert.assertFalse(paymentTermsFieldIsSelected, "paymentTerms Text Field is not Selected");

		paymentTerms.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click()", paymentTermsSelect);

		// Verify that shippingMode Field is Displayed or not
		boolean isDisabledshippingModeFieldn = !shippingMode.isDisplayed();
		Assert.assertFalse(isDisabledshippingModeFieldn);

		// Verify that shippingMode Field is clickable or not
		WebElement shippingModeFieldFocusedElement = driver.switchTo().activeElement();
		boolean shippingModeFieldIsSelected = shippingModeFieldFocusedElement.equals(shippingMode);
		Assert.assertFalse(shippingModeFieldIsSelected, "shippingMode Text Field is not Selected");

		shippingMode.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click()", shippingModeSelect);

		// Verify that shipTo Field is Displayed or not
		boolean isDisabledshipToFieldn = !shipTo.isDisplayed();
		Assert.assertFalse(isDisabledshipToFieldn);

		// Verify that shipTo Field is clickable or not
		WebElement shipToFieldFocusedElement = driver.switchTo().activeElement();
		boolean shipToFieldIsSelected = shipToFieldFocusedElement.equals(shipTo);
		Assert.assertFalse(shipToFieldIsSelected, "shipTo Text Field is not Selected");

		shipTo.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click()", shipToSelect);

		// Verify that billTo Field is Displayed or not
		boolean isDisabledbillToFieldn = !billTo.isDisplayed();
		Assert.assertFalse(isDisabledbillToFieldn);

		// Verify that billTo Field is clickable or not
		WebElement billToFieldFocusedElement = driver.switchTo().activeElement();
		boolean billToFieldIsSelected = billToFieldFocusedElement.equals(billTo);
		Assert.assertFalse(billToFieldIsSelected, "billTo Text Field is not Selected");

		billTo.sendKeys(Keys.ENTER);
		js.executeScript("arguments[0].click()", billToSelect);

//terms

		js.executeScript("arguments[0].click()", terms);

		// 1Verifying that retentionPeriod Field is Enabled or not
		boolean isEnabledretentionPeriodField = retentionPeriod.isEnabled();
		Assert.assertTrue(isEnabledretentionPeriodField);
		boolean isDisabledretentionPeriodFieldn = !retentionPeriod.isEnabled();
		Assert.assertFalse(isDisabledretentionPeriodFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedretentionPeriodField = retentionPeriod.isDisplayed();
		Assert.assertTrue(isDisplayedretentionPeriodField);
		boolean isHiddenretentionPeriodField = !retentionPeriod.isDisplayed();
		Assert.assertFalse(isHiddenretentionPeriodField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextInretentionPeriod = retentionPeriod.getAttribute("placeholder");

		String expected_placeholderretentionPeriod = "Enter Retention Period";

		assertEquals(displayedTextInretentionPeriod, expected_placeholderretentionPeriod);

		retentionPeriod.sendKeys(retention);

		// 1Verifying that specialTerms Field is Enabled or not
		boolean isEnabledspecialTermsField = specialTerms.isEnabled();
		Assert.assertTrue(isEnabledspecialTermsField);
		boolean isDisabledspecialTermsFieldn = !specialTerms.isEnabled();
		Assert.assertFalse(isDisabledspecialTermsFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedspecialTermsField = specialTerms.isDisplayed();
		Assert.assertTrue(isDisplayedspecialTermsField);
		boolean isHiddenspecialTermsField = !specialTerms.isDisplayed();
		Assert.assertFalse(isHiddenspecialTermsField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextInspecialTerms = specialTerms.getAttribute("placeholder");

		String expected_placeholderspecialTerms = "Enter Special Terms & Conditions";

		assertEquals(displayedTextInspecialTerms, expected_placeholderspecialTerms);

		specialTerms.sendKeys(special);

		// 1Verifying that incoTerms Field is Enabled or not
		boolean isEnabledincoTermsField = incoTerms.isEnabled();
		Assert.assertTrue(isEnabledincoTermsField);
		boolean isDisabledincoTermsFieldn = !incoTerms.isEnabled();
		Assert.assertFalse(isDisabledincoTermsFieldn);

		// Verifying that Quality Field is displayed or hidden.
		boolean isDisplayedincoTermsField = incoTerms.isDisplayed();
		Assert.assertTrue(isDisplayedincoTermsField);
		boolean isHiddenincoTermsField = !incoTerms.isDisplayed();
		Assert.assertFalse(isHiddenincoTermsField);

		// Verifying the Placeholder which is present in Quality field.
		String displayedTextInincoTerms = incoTerms.getAttribute("placeholder");

		String expected_placeholderincoTerms = "Enter Inco Terms";

		if (displayedTextInincoTerms.equals(expected_placeholderincoTerms))
			System.out.println("placeholder text is displayed in the incoTerms field.");
		else
			System.out.println("placeholder text is not displayed in the incoTerms field.");
		incoTerms.sendKeys(inco);

		js.executeScript("arguments[0].click()", addTerms);

		uploadFile(driver, UploadFiles1, 2);

		click(driver, save);
		Thread.sleep(4000);
		return new HomePage();

	}

	// *****************************PO Approval 1
	// Page*************************************//

	public HomePage purchaseOrderApproval1() throws AWTException, InterruptedException {

		click(driver, arrroval1View);

		dataPrintFromInputtag(driver, poNumber, "poNumber");

		click(driver, items);

		dataPrintFromInputtag(driver, itemNumber1, "itemNumbe1");

		click(driver, billing);

		click(driver, terms);

		click(driver, approve);

		click(driver, approvePOPUP);
		return new HomePage();
	}

//**********************************PO Approval 2********************************************//

	public HomePage purchaseOrderApproval2() throws AWTException, InterruptedException {

		click(driver, arrroval2View);

		dataPrintFromInputtag(driver, poNumber, "poNumber");

		click(driver, items);

		dataPrintFromInputtag(driver, itemNumber1, "itemNumbe1");

		click(driver, billing);

		click(driver, terms);

		click(driver, approve);

		click(driver, approvePOPUP);
		return new HomePage();
	}

}
