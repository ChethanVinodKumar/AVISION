package com.Getapcs.Avision.PrimaryMaster;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class CustomerMaster extends TestBase {

	@FindBy(xpath = "(//td[normalize-space()='TEST Address'])[1]")
	WebElement addressesTable;

	@FindBy(xpath = "(//td[normalize-space()='No'])[1]")
	WebElement shippingaddressesTable;

	@FindBy(xpath = "(//td[normalize-space()='Yes'])[1]")
	WebElement bankingTable;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement update;

	@FindBy(xpath = "(//input[@placeholder='Enter Customer Id'])[1]")
	WebElement customerId;

	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[1]")
	WebElement customerName;

	@FindBy(xpath = "(//input[@placeholder='Enter Customer Alias'])[1]")
	WebElement customerAlias;

	@FindBy(xpath = "(//td[normalize-space()='Mr'])[1]")
	WebElement contactsTable;

	@FindBy(xpath = "(//td[contains(text(),'true')])[1]")
	WebElement releadtedLinkTable;

	@FindBy(xpath = "(//td[normalize-space()='No'])[1]")
	WebElement shippingAddressTable;

//General
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement customerType;

	@FindBy(xpath = "(//span[normalize-space()='INDIVIDUAL'])[1]")
	WebElement customerTypeSelect;

	@FindBy(xpath = "//textarea[@placeholder='Enter Address']")
	WebElement address;

	@FindBy(xpath = "(//input[@placeholder='Enter city'])[1]")
	WebElement city;

	@FindBy(xpath = "(//input[@placeholder='Enter state'])[1]")
	WebElement state;

	@FindBy(xpath = "(//div[@role='combobox']/.//input[@type='text'])[5]")
	WebElement country;

	@FindBy(xpath = "(//span[normalize-space()='India'])[1]")
	WebElement countrySelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Pin / Zip Code'])[1]")
	WebElement zipCode;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement segment;

	@FindBy(xpath = "(//span[normalize-space()='TEST Segment'])[1]")
	WebElement segmentSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Board No'])[1]")
	WebElement boardNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter Website'])[1]")
	WebElement website;

	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[1]")
	WebElement email;

	@FindBy(xpath = "(//input[@type='text'])[16]")
	WebElement currency;

	@FindBy(xpath = "(//span[normalize-space()='INR'])[1]")
	WebElement currencySelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Google Pin Location'])[1]")
	WebElement generalPinLocation;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement typeOfCompany;

	@FindBy(xpath = "(//span[normalize-space()='TEST Type_Of_Company'])[1]")
	WebElement typeOfCompanySelect;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement exportUnitType;

	@FindBy(xpath = "(//span[normalize-space()='TEST Export_Unit_Type'])[1]")
	WebElement exportUnitTypeSelect;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//input[@placeholder='Code'])[1]")
	WebElement salesManagerCode;

	@FindBy(xpath = "(//input[@placeholder='Enter Sales Manager'])[1]")
	WebElement salesManagerText;

	@FindBy(xpath = "(//input[@placeholder='Enter Region'])[1]")
	WebElement region;

	@FindBy(xpath = "(//input[@type='text'])[20]")
	WebElement shippingMode;

	@FindBy(xpath = "(//span[normalize-space()='By Air'])[1]")
	WebElement shippingModeSelect;

	// Contacts

	@FindBy(xpath = "(//a[normalize-space()='Contacts'])[1]")
	WebElement contacts;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement salutation;

	@FindBy(xpath = "(//span[normalize-space()='Mr'])[1]")
	WebElement salutationSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Call Name'])[1]")
	WebElement callName;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement mobileNumCode;

	@FindBy(xpath = "(//span[normalize-space()='+91'])[1]")
	WebElement mobileNumCodeSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Mobile No'])[1]")
	WebElement mobileNum;

	@FindBy(xpath = "(//input[@placeholder='Land Line'])[1]")
	WebElement landLineNo;

	@FindBy(xpath = "(//input[@placeholder='Time To Call'])[1]")
	WebElement timeToCall;

	@FindBy(xpath = "(//input[@placeholder='Enter First Name'])[1]")
	WebElement firstName;

	@FindBy(xpath = "(//input[@placeholder='Enter Designation'])[1]")
	WebElement designation;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement mobileNumCode1;

	@FindBy(xpath = "(//span[normalize-space()='+91'])[2]")
	WebElement mobileNumCode1Select;

	@FindBy(xpath = "(//input[@placeholder='Enter Mobile No'])[2]")
	WebElement mobileNum1;

	@FindBy(xpath = "(//input[@placeholder='Extension'])[1]")
	WebElement extension;

	@FindBy(xpath = "(//input[@type='text'])[17]")
	WebElement language;

	@FindBy(xpath = "(//span[normalize-space()='TEST Language'])[1]")
	WebElement languageSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Last Name'])[1]")
	WebElement lastName;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement department;

	@FindBy(xpath = "(//span[normalize-space()='TEST Department'])[1]")
	WebElement departmentSelect;

	@FindBy(xpath = "(//input[@placeholder='Email'])[1]")
	WebElement email1;

	@FindBy(xpath = "(//input[@placeholder='Skype Id'])[1]")
	WebElement skypeID;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addContacts;

	// Related Company Link

	@FindBy(xpath = "(//a[normalize-space()='Related Customer Link'])[1]")
	WebElement releatedCustomerLink;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement customer;

	@FindBy(xpath = "(//span[normalize-space()='Balaji'])[1]")
	WebElement customerSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement natureOfRelationship;

	@FindBy(xpath = "(//span[normalize-space()='TEST Nature_Of_Relationship'])[1]")
	WebElement natureOfRelationshipSelect;

	// Addresses

	@FindBy(xpath = "(//a[normalize-space()='Addresses'])[1]")
	WebElement addresses;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Invoice Address'])[1]")
	WebElement billToAddress;

	@FindBy(xpath = "(//input[@placeholder='GSTN Number'])[1]")
	WebElement gstnNum;

	@FindBy(xpath = "(//input[@placeholder='PAN Number'])[1]")
	WebElement panNum;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addAddress;

//Shipping Address

	@FindBy(xpath = "(//textarea[@placeholder='Enter Shipping Address'])[1]")
	WebElement shipToAddress;

	@FindBy(xpath = "(//a[normalize-space()='Shipping Addresses'])[1]")
	WebElement shippingAddress;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addShippingAddress;

	@FindBy(xpath = "(//input[@placeholder='Google Pin Location'])[1]")
	WebElement googlePinLocation;

	// Banking

	@FindBy(xpath = "(//a[normalize-space()='Banking'])[1]")
	WebElement banking;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement bankName;

	@FindBy(xpath = "(//span[normalize-space()='HDFC'])[1]")
	WebElement bankNameSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Branch'])[1]")
	WebElement branch;

	@FindBy(xpath = "(//input[@placeholder='Enter Account Number'])[1]")
	WebElement accountNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter IFSC Code'])[1]")
	WebElement ifscCode;

	@FindBy(xpath = "(//input[@placeholder='Enter Swift Code'])[1]")
	WebElement switchCode;

	@FindBy(xpath = "(//input[@placeholder='Enter IBAN Code'])[1]")
	WebElement ibanCode;

	@FindBy(xpath = "(//span)[58]")
	WebElement primaryToggleButton;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addBanking;

//Disptch

	@FindBy(xpath = "(//a[normalize-space()='Dispatch'])[1]")
	WebElement dispatch;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement partialDispatch;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement dropShipment;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement packingInstructions;

	@FindBy(xpath = "(//span[normalize-space()='TEST Packing_Instructions'])[1]")
	WebElement packingInstructionsSelect;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement shipmentInstructions;

	@FindBy(xpath = "(//span[normalize-space()='TEST Shipment_Instructions'])[1]")
	WebElement shipmentInstructionsSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement preferredFreightForwarder1;

	@FindBy(xpath = "(//span[normalize-space()='TEST Preferred_Freight_Forwarder'])[1]")
	WebElement preferredFreightForwarder1Select;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Special Instruction'])[1]")
	WebElement shipmentInstructions1;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement podReq;
//Terms

	@FindBy(xpath = "(//a[normalize-space()='Terms'])[1]")
	WebElement terms;

	@FindBy(xpath = "(//input[@placeholder='Enter Advance (%)'])[1]")
	WebElement advance;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement paymentTerms;

	@FindBy(xpath = "(//span[normalize-space()='ADVANCE 50% & BALANCE BEFORE SHIPMENT'])[1]")
	WebElement paymentTermsSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement incoTerm;

	@FindBy(xpath = "(//span[normalize-space()='TEST INCO_Term'])[1]")
	WebElement incoTermSelect;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Special Terms'])[1]")
	WebElement specialTerms;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement preferredFreightForwarder;

	@FindBy(xpath = "(//span[normalize-space()='Test1'])[1]")
	WebElement preferredFreightForwarderSelect;

//statutory

	@FindBy(xpath = "(//a[normalize-space()='Statutory'])[1]")
	WebElement statutory;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement incorporation;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement tin;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement gst1;

	@FindBy(xpath = "(//span[@class='slider round'])[4]")
	WebElement iec;

	@FindBy(xpath = "(//span[@class='slider round'])[5]")
	WebElement pan1;

	@FindBy(xpath = "(//span[@class='slider round'])[6]")
	WebElement udhyamCertificate;

	@FindBy(xpath = "(//span[@class='slider round'])[7]")
	WebElement msme;

//certifications/Docs

	@FindBy(xpath = "(//a[normalize-space()='Certifications/Docs'])[1]")
	WebElement certifications;

	@FindBy(xpath = "(//span)[52]")
	WebElement iso;

	@FindBy(xpath = "(//span)[53]")
	WebElement as;

	@FindBy(xpath = "(//span)[54]")
	WebElement medical;

	@FindBy(xpath = "(//span)[55]")
	WebElement nadcap;

//Details

	@FindBy(xpath = "(//a[normalize-space()='Details'])[1]")
	WebElement details;

	@FindBy(xpath = "(//input[@placeholder='Enter Turn Over (3 Years)'])[1]")
	WebElement turnOver;

	@FindBy(xpath = "(//input[@placeholder='Enter DNB (Hoovers) Number'])[1]")
	WebElement dnbNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter ICRA'])[1]")
	WebElement icra;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-customer-master/div[2]/div/div/div/form/div/div[4]/div/div/div[4]/mat-expansion-panel/mat-expansion-panel-header/span[2]")
	WebElement headCount1;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-edit-customer-master/div[2]/div/div/div/form/div/div[4]/div/div/div[4]/mat-expansion-panel/mat-expansion-panel-header/span[2]")
	WebElement headCount2;

	@FindBy(xpath = "(//input[@placeholder='Enter Head Count'])[1]")
	WebElement enterHeadCount;

	@FindBy(xpath = "(//input[@placeholder='Skill/Dept'])[1]")
	WebElement enterskill;

	@FindBy(xpath = "(//input[@placeholder='Qty'])[1]")
	WebElement noOfPeople;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addheadCount;

	@FindBy(xpath = "(//input[@placeholder='Enter Capacity'])[1]")
	WebElement capacity;

	@FindBy(xpath = "(//input[@placeholder='Enter Floor Space'])[1]")
	WebElement floorSpace;

	@FindBy(xpath = "(//input[@placeholder='Enter Machine'])[1]")
	WebElement machine;

	@FindBy(xpath = "(//input[@placeholder='Enter Tools & Equip'])[1]")
	WebElement toolsAndEquip;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement uom;

	@FindBy(xpath = "(//span[normalize-space()='Units'])[1]")
	WebElement uomSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Sqft'])[1]")
	WebElement sqft;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement erpToggle;

	@FindBy(xpath = "(//input[@placeholder='Enter ERP'])[1]")
	WebElement enterErp;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement ospToggle;

	@FindBy(xpath = "(//textarea[@placeholder='Remarks'])[1]")
	WebElement enterOsp;

//Customer Approval

	@FindBy(xpath = "(//a[normalize-space()='Customer Approval'])[1]")
	WebElement customerApproval;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement scopeOfSupply;

	@FindBy(xpath = "(//span[normalize-space()='TEST Scope_Of_Supply'])[1]")
	WebElement scopeOfSupplySelect;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement companyCategory;

	@FindBy(xpath = "(//span[normalize-space()='TEST Vender Category1'])[1]")
	WebElement companyCategorySelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement basisOfApproval;

	@FindBy(xpath = "(//span[normalize-space()='TEST Basis OF Approval'])[1]")
	WebElement basisOfApprovalSelect;

	@FindBy(xpath = "(//span)[70]")
	WebElement inventoryItem;

	@FindBy(xpath = "(//input[@placeholder='Approved By'])[1]")
	WebElement approvedBy;

	@FindBy(xpath = "(//input[@placeholder='Approval By'])[1]")
	WebElement approvalBy;

	@FindBy(xpath = "(//span)[72]")
	WebElement reaudit;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement auditFrequency;

	@FindBy(xpath = "(//span[normalize-space()='TEST Audit Frequency Name'])[1]")
	WebElement auditFrequencySelect;

	public CustomerMaster() {
		PageFactory.initElements(driver, this);
	}

	JavascriptExecutor executor = (JavascriptExecutor) driver;

	public HomePage CustomerMasterCreate(String cusId, String cusName, String cusAlias, String add, String cty,
			String stat, String code, String boardnum, String web, String eml, String generalpin, String cName,
			String mobileNo, String llNum, String fN, String desig, String mobileno2, String exten, String lN,
			String eml1, String addrs, String gst, String pan, String brch, String account, String ifsc, String swtch,
			String Iban, String adv, String specialtms, String turnovr, String dnb, String icr, String headcount,
			String skill, String people, String cacp, String floor, String machine1, String tools, String sqft1,
			String erp2, String osp2, String approved) throws InterruptedException, AWTException {

		System.out.println("######## Customer Master Create Started Now #########");

		click(driver, customerId);
		isSelected(driver, customerId, "customerId");
		customerId.sendKeys(cusId);

		click(driver, customerName);
		isSelected(driver, customerName, "customerName");
		customerName.sendKeys(cusName);

		click(driver, customerAlias);
		isSelected(driver, customerAlias, "customerAlias");
		customerAlias.sendKeys(cusAlias);

//General

		click(driver, customerType);
		isSelected(driver, customerType, "customerType");
		click(driver, customerTypeSelect);

		click(driver, address);
		isSelected(driver, address, "address");
		address.sendKeys(add);

		click(driver, city);
		isSelected(driver, city, "city");
		city.sendKeys(cty);

		click(driver, state);
		isSelected(driver, state, "state");
		state.sendKeys(stat);

		click(driver, country);
		isSelected(driver, country, "country");
		click(driver, countrySelect);

		click(driver, zipCode);
		isSelected(driver, zipCode, "zipCode");
		zipCode.sendKeys(code);

		click(driver, segment);
		isSelected(driver, segment, "segment");
		click(driver, segmentSelect);

		click(driver, boardNumber);
		isSelected(driver, boardNumber, "boardNumber");
		boardNumber.sendKeys(boardnum);

		click(driver, website);
		isSelected(driver, website, "website");
		website.sendKeys(web);

		click(driver, email);
		isSelected(driver, email, "email");
		email.sendKeys(eml);

		click(driver, currency);
		isSelected(driver, currency, "currency");
		click(driver, currencySelect);

		click(driver, generalPinLocation);
		isSelected(driver, generalPinLocation, "generalPinLocation");
		generalPinLocation.sendKeys(generalpin);

		click(driver, typeOfCompany);
		isSelected(driver, typeOfCompany, "typeOfCompany");
		click(driver, typeOfCompanySelect);

		click(driver, exportUnitType);
		isSelected(driver, exportUnitType, "exportUnitType");
		click(driver, exportUnitTypeSelect);

		click(driver, toggleButton);

		click(driver, salesManagerCode);
		isSelected(driver, salesManagerCode, "salesManagerCode");
		salesManagerCode.clear();
		salesManagerCode.sendKeys("6785");

		click(driver, salesManagerText);
		isSelected(driver, salesManagerText, "salesManagerText");
		salesManagerText.clear();
		salesManagerText.sendKeys("TEST Sales Manager1");

		click(driver, region);
		isSelected(driver, region, "region");
		region.clear();
		region.sendKeys("TEST Region1");

		click(driver, shippingMode);
		isSelected(driver, shippingMode, "shippingMode");
		click(driver, shippingModeSelect);

//Contacts

		click(driver, contacts);

		click(driver, salutation);
		isSelected(driver, salutation, "salutation");
		click(driver, salutationSelect);

		click(driver, callName);
		isSelected(driver, callName, "callName");
		callName.sendKeys(cName);

		click(driver, mobileNumCode);
		isSelected(driver, mobileNumCode, "mobileNumCode");
		click(driver, mobileNumCodeSelect);

		click(driver, mobileNum);
		isSelected(driver, mobileNum, "mobileNum");
		mobileNum.sendKeys(mobileNo);

		click(driver, landLineNo);
		isSelected(driver, landLineNo, "landLineNo");
		landLineNo.sendKeys(llNum);

		executor.executeScript("arguments[0].click();", timeToCall);
		timeToCall.sendKeys("12");
		timeToCall.sendKeys("12");

		click(driver, firstName);
		isSelected(driver, firstName, "firstName");
		firstName.sendKeys(fN);

		click(driver, designation);
		isSelected(driver, designation, "designation");
		designation.sendKeys(desig);

		click(driver, mobileNumCode1);
		isSelected(driver, mobileNumCode1, "mobileNumCode1");
		click(driver, mobileNumCode1Select);

		click(driver, mobileNum1);
		isSelected(driver, mobileNum1, "mobileNum1");
		mobileNum1.sendKeys(mobileno2);

		click(driver, skypeID);
		isSelected(driver, skypeID, "skypeID");
		skypeID.clear();
		skypeID.sendKeys("60");

		click(driver, extension);
		isSelected(driver, extension, "extension");
		extension.sendKeys(exten);

		click(driver, language);
		isSelected(driver, language, "language");
		click(driver, languageSelect);

		click(driver, lastName);
		isSelected(driver, lastName, "lastName");
		lastName.sendKeys(lN);

		click(driver, department);
		isSelected(driver, department, "department");
		click(driver, departmentSelect);

		click(driver, email1);
		isSelected(driver, email1, "email1");
		email1.sendKeys(eml1);

		click(driver, addContacts);

		// **********************//

//RelatedCompanyLink

		click(driver, releatedCustomerLink);

		click(driver, customer);
		isSelected(driver, customer, "customer");
		click(driver, customerSelect);

		click(driver, natureOfRelationship);
		isSelected(driver, natureOfRelationship, "natureOfRelationship");
		click(driver, natureOfRelationship);

//Addressess		
		
		click(driver, addresses);

		click(driver, billToAddress);
		isSelected(driver, billToAddress, "billToAddress");
		billToAddress.sendKeys(addrs);

		click(driver, gstnNum);
		isSelected(driver, gstnNum, "gstnNum");
		gstnNum.sendKeys(gst);

		click(driver, panNum);
		isSelected(driver, panNum, "panNum");
		panNum.sendKeys(pan);

		addAddress.click();

//Shipping Address
		
		click(driver, shippingAddress);
		isSelected(driver, shipToAddress, "shipToAddress");
		shipToAddress.sendKeys("TEST Shipping Address");

		click(driver, googlePinLocation);
		isSelected(driver, googlePinLocation, "googlePinLocation");
		googlePinLocation.sendKeys("TEST Google Pin Location");

		click(driver, addShippingAddress);

//Banking

		click(driver, banking);

		// Verify that bankName1 Field is Displayed or not
		boolean isDisabledbankName1Fieldn = !bankName.isDisplayed();
		assertFalse(isDisabledbankName1Fieldn);

		// Verify that bankName1 Field is clickable or not
		WebElement bankName1FieldFocusedElement = driver.switchTo().activeElement();
		boolean bankName1FieldIsSelected = bankName1FieldFocusedElement.equals(bankName);
		assertFalse(bankName1FieldIsSelected, "bankName1 Text Field is not Selected");

		// Verifying that bankName1 Text Field is Enabled or not
		boolean isEnabledbankName1Field = bankName.isEnabled();
		assertTrue(isEnabledbankName1Field);

		bankName.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", bankNameSelect);

		// Verify that branch Field is Displayed or not
		boolean isDisabledbranchFieldn = !branch.isDisplayed();
		assertFalse(isDisabledbranchFieldn);

		// Verify that branch Field is clickable or not
		WebElement branchFieldFocusedElement = driver.switchTo().activeElement();
		boolean branchFieldIsSelected = branchFieldFocusedElement.equals(branch);
		assertFalse(branchFieldIsSelected, "branch Text Field is not Selected");

		// Verifying that branch Text Field is Enabled or not
		boolean isEnabledbranchField = branch.isEnabled();
		assertTrue(isEnabledbranchField);

		// Verifying the Placeholder which is present in branch text field.
		String displayedTextInbranch = branch.getAttribute("placeholder");

		String expected_placeholder_in_branch = "Enter Branch";

		assertEquals(displayedTextInbranch, expected_placeholder_in_branch);

		branch.sendKeys(brch);

		// Verify that accountNum Field is Displayed or not
		boolean isDisabledaccountNumFieldn = !accountNumber.isDisplayed();
		assertFalse(isDisabledaccountNumFieldn);

		// Verify that accountNum Field is clickable or not
		WebElement accountNumFieldFocusedElement = driver.switchTo().activeElement();
		boolean accountNumFieldIsSelected = accountNumFieldFocusedElement.equals(accountNumber);
		assertFalse(accountNumFieldIsSelected, "accountNum Text Field is not Selected");

		// Verifying that accountNum Text Field is Enabled or not
		boolean isEnabledaccountNumField = accountNumber.isEnabled();
		assertTrue(isEnabledaccountNumField);

		// Verifying the Placeholder which is present in accountNum text field.
		String displayedTextInaccountNum = accountNumber.getAttribute("placeholder");

		String expected_placeholder_in_accountNum = "Enter Account Number";

		assertEquals(displayedTextInaccountNum, expected_placeholder_in_accountNum);

		accountNumber.sendKeys(account);

		// Verify that ifscCode Field is Displayed or not
		boolean isDisabledifscCodeFieldn = !ifscCode.isDisplayed();
		assertFalse(isDisabledifscCodeFieldn);

		// Verify that ifscCode Field is clickable or not
		WebElement ifscCodeFieldFocusedElement = driver.switchTo().activeElement();
		boolean ifscCodeFieldIsSelected = ifscCodeFieldFocusedElement.equals(ifscCode);
		assertFalse(ifscCodeFieldIsSelected, "ifscCode Text Field is not Selected");

		// Verifying that ifscCode Text Field is Enabled or not
		boolean isEnabledifscCodeField = ifscCode.isEnabled();
		assertTrue(isEnabledifscCodeField);

		// Verifying the Placeholder which is present in ifscCode text field.
		String displayedTextInifscCode = ifscCode.getAttribute("placeholder");

		String expected_placeholder_in_ifscCode = "Enter IFSC Code";

		assertEquals(displayedTextInifscCode, expected_placeholder_in_ifscCode);

		ifscCode.sendKeys(ifsc);

		// Verify that switchCode Field is Displayed or not
		boolean isDisabledswitchCodeFieldn = !switchCode.isDisplayed();
		assertFalse(isDisabledswitchCodeFieldn);

		// Verify that switchCode Field is clickable or not
		WebElement switchCodeFieldFocusedElement = driver.switchTo().activeElement();
		boolean switchCodeFieldIsSelected = switchCodeFieldFocusedElement.equals(switchCode);
		assertFalse(switchCodeFieldIsSelected, "switchCode Text Field is not Selected");

		// Verifying that switchCode Text Field is Enabled or not
		boolean isEnabledswitchCodeField = switchCode.isEnabled();
		assertTrue(isEnabledswitchCodeField);

		// Verifying the Placeholder which is present in switchCode text field.
		String displayedTextInswitchCode = switchCode.getAttribute("placeholder");

		String expected_placeholder_in_switchCode = "Enter Swift Code";

		assertEquals(displayedTextInswitchCode, expected_placeholder_in_switchCode);

		switchCode.sendKeys(swtch);

		// Verify that ibanCode Field is Displayed or not
		boolean isDisabledibanCodeFieldn = !ibanCode.isDisplayed();
		assertFalse(isDisabledibanCodeFieldn);

		// Verify that ibanCode Field is clickable or not
		WebElement ibanCodeFieldFocusedElement = driver.switchTo().activeElement();
		boolean ibanCodeFieldIsSelected = ibanCodeFieldFocusedElement.equals(ibanCode);
		assertFalse(ibanCodeFieldIsSelected, "ibanCode Text Field is not Selected");

		// Verifying that ibanCode Text Field is Enabled or not
		boolean isEnabledibanCodeField = ibanCode.isEnabled();
		assertTrue(isEnabledibanCodeField);

		// Verifying the Placeholder which is present in ibanCode text field.
		String displayedTextInibanCode = ibanCode.getAttribute("placeholder");

		String expected_placeholder_in_ibanCode = "Enter IBAN Code";

		assertEquals(displayedTextInibanCode, expected_placeholder_in_ibanCode);

		ibanCode.sendKeys(Iban);

		executor.executeScript("arguments[0].click();", addBanking);

//Dispatch

		executor.executeScript("arguments[0].click();", dispatch);

		executor.executeScript("arguments[0].click();", partialDispatch);

		// Verify that partialDispatch Field is Displayed or not
		boolean isDisabledpartialDispatch = partialDispatch.isDisplayed();
		assertTrue(isDisabledpartialDispatch);

		executor.executeScript("arguments[0].click();", dropShipment);

		// Verify that dropShipment Field is Displayed or not
		boolean isDisableddropShipment = dropShipment.isDisplayed();
		assertTrue(isDisableddropShipment);

		// Verify that packingInstructions Field is Displayed or not
		boolean isDisabledpackingInstructionsFieldn = packingInstructions.isDisplayed();
		assertTrue(isDisabledpackingInstructionsFieldn);

//				//Verify that  packingInstructions Field is clickable or not
//					WebElement packingInstructionsFieldFocusedElement = driver.switchTo().activeElement();
//					
//				assertFalse(packingInstructionsFieldFocusedElement, "packingInstructions Text Field is not Selected");

		// Verifying that packingInstructions Text Field is Enabled or not
		boolean isEnabledpackingInstructionsField = packingInstructions.isEnabled();
		assertTrue(isEnabledpackingInstructionsField);

		packingInstructions.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", packingInstructionsSelect);

		// Verify that shipmentInstructions1 Field is Displayed or not
		boolean isDisabledshipmentInstructions1Fieldn = shipmentInstructions1.isDisplayed();
		assertTrue(isDisabledshipmentInstructions1Fieldn);

		// Verify that shipmentInstructions1 Field is clickable or not
		WebElement shipmentInstructions1FieldFocusedElement = driver.switchTo().activeElement();
		boolean shipmentInstructions1FieldIsSelected = shipmentInstructions1FieldFocusedElement
				.equals(shipmentInstructions1);
		assertFalse(shipmentInstructions1FieldIsSelected, "shipmentInstructions1 Text Field is not Selected");

		// Verifying that shipmentInstructions1 Text Field is Enabled or not
		boolean isEnabledshipmentInstructions1Field = shipmentInstructions1.isEnabled();
		assertTrue(isEnabledshipmentInstructions1Field);

		// Verifying the Placeholder which is present in shipmentInstructions1 text
		// field.
		String displayedTextInshipmentInstructions1 = shipmentInstructions1.getAttribute("placeholder");

		String expected_placeholder_in_shipmentInstructions1 = "Enter Special Instruction";

		assertEquals(displayedTextInshipmentInstructions1, expected_placeholder_in_shipmentInstructions1);

		shipmentInstructions1.sendKeys("TEST shipmentInstructions");

		executor.executeScript("arguments[0].click();", podReq);

		// Verify that podReq Field is Displayed or not
		boolean isDisabledpodReq = podReq.isDisplayed();
		assertTrue(isDisabledpodReq);

		// Verify that shipmentInstructions Field is Displayed or not
		boolean isDisabledshipmentInstructionsFieldn = shipmentInstructions.isDisplayed();
		assertTrue(isDisabledshipmentInstructionsFieldn);

		// Verify that shipmentInstructions Field is clickable or not
		WebElement shipmentInstructionsFieldFocusedElement = driver.switchTo().activeElement();
		boolean shipmentInstructionsFieldIsSelected = shipmentInstructionsFieldFocusedElement
				.equals(shipmentInstructions);
		assertFalse(shipmentInstructionsFieldIsSelected, "shipmentInstructions Text Field is not Selected");

		// Verifying that shipmentInstructions Text Field is Enabled or not
		boolean isEnabledshipmentInstructionsField = shipmentInstructions.isEnabled();
		assertTrue(isEnabledshipmentInstructionsField);

		shipmentInstructions.sendKeys(Keys.ENTER);
		shipmentInstructions.sendKeys(Keys.ENTER);

		// Verify that preferredFreightForwarder1 Field is Displayed or not
		boolean isDisabledpreferredFreightForwarder1Fieldn = preferredFreightForwarder1.isDisplayed();
		assertTrue(isDisabledpreferredFreightForwarder1Fieldn);

		// Verify that preferredFreightForwarder1 Field is clickable or not
		WebElement preferredFreightForwarder1FieldFocusedElement = driver.switchTo().activeElement();
		boolean preferredFreightForwarder1FieldIsSelected = preferredFreightForwarder1FieldFocusedElement
				.equals(preferredFreightForwarder1);
		assertFalse(preferredFreightForwarder1FieldIsSelected, "preferredFreightForwarder1 Text Field is not Selected");

		// Verifying that preferredFreightForwarder1 Text Field is Enabled or not
		boolean isEnabledpreferredFreightForwarder1Field = preferredFreightForwarder1.isEnabled();
		assertTrue(isEnabledpreferredFreightForwarder1Field);

		preferredFreightForwarder1.sendKeys(Keys.ENTER);
		preferredFreightForwarder1.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
//Terms

		executor.executeScript("arguments[0].click();", terms);

		// Verify that advance Field is Displayed or not
		boolean isDisabledadvanceFieldn = !advance.isDisplayed();
		assertFalse(isDisabledadvanceFieldn);

		// Verify that advance Field is clickable or not
		WebElement advanceFieldFocusedElement = driver.switchTo().activeElement();
		boolean advanceFieldIsSelected = advanceFieldFocusedElement.equals(advance);
		assertFalse(advanceFieldIsSelected, "advance Text Field is not Selected");

		// Verifying that advance Text Field is Enabled or not
		boolean isEnabledadvanceField = advance.isEnabled();
		assertTrue(isEnabledadvanceField);

		// Verifying the Placeholder which is present in advance text field.
		String displayedTextInadvance = advance.getAttribute("placeholder");

		String expected_placeholder_in_advance = "Enter Advance (%)";

		assertEquals(displayedTextInadvance, expected_placeholder_in_advance);

		advance.sendKeys(adv);

		// Verify that paymentTerms Field is Displayed or not
		boolean isDisabledpaymentTermsFieldn = !paymentTerms.isDisplayed();
		assertFalse(isDisabledpaymentTermsFieldn);

		// Verify that paymentTerms Field is clickable or not
		WebElement paymentTermsFieldFocusedElement = driver.switchTo().activeElement();
		boolean paymentTermsFieldIsSelected = paymentTermsFieldFocusedElement.equals(paymentTerms);
		assertFalse(paymentTermsFieldIsSelected, "paymentTerms Text Field is not Selected");

		// Verifying that paymentTerms Text Field is Enabled or not
		boolean isEnabledpaymentTermsField = paymentTerms.isEnabled();
		assertTrue(isEnabledpaymentTermsField);

		paymentTerms.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", paymentTermsSelect);

		// Verify that incoTerms Field is Displayed or not
		boolean isDisabledincoTermsFieldn = !incoTerm.isDisplayed();
		assertFalse(isDisabledincoTermsFieldn);

		// Verify that incoTerms Field is clickable or not
		WebElement incoTermsFieldFocusedElement = driver.switchTo().activeElement();
		boolean incoTermsFieldIsSelected = incoTermsFieldFocusedElement.equals(incoTerm);
		assertFalse(incoTermsFieldIsSelected, "incoTerms Text Field is not Selected");

		// Verifying that incoTerms Text Field is Enabled or not
		boolean isEnabledincoTermsField = incoTerm.isEnabled();
		assertTrue(isEnabledincoTermsField);

		incoTerm.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", incoTermSelect);

		// Verify that specialTerms Field is Displayed or not
		boolean isDisabledspecialTermsFieldn = !specialTerms.isDisplayed();
		assertFalse(isDisabledspecialTermsFieldn);

		// Verify that specialTerms Field is clickable or not
		WebElement specialTermsFieldFocusedElement = driver.switchTo().activeElement();
		boolean specialTermsFieldIsSelected = specialTermsFieldFocusedElement.equals(specialTerms);
		assertFalse(specialTermsFieldIsSelected, "specialTerms Text Field is not Selected");

		// Verifying that specialTerms Text Field is Enabled or not
		boolean isEnabledspecialTermsField = specialTerms.isEnabled();
		assertTrue(isEnabledspecialTermsField);

		// Verifying the Placeholder which is present in specialTerms text field.
		String displayedTextInspecialTerms = specialTerms.getAttribute("placeholder");

		String expected_placeholder_in_specialTerms = "Enter Special Terms";

		assertEquals(displayedTextInspecialTerms, expected_placeholder_in_specialTerms);

		specialTerms.sendKeys(specialtms);

//		
//WebElement loApplicable = driver.findElement(By.xpath("(//span)[60]"));
//		executor.executeScript("arguments[0].click();", loApplicable);
//		
//		
//WebElement loApplicableTextField = driver.findElement(By.xpath("(//input[@placeholder='Enter LD Applicable'])[1]"));
//		
//
//		//Verify that  loApplicable Field is clickable or not
//		WebElement loApplicableFieldFocusedElement = driver.switchTo().activeElement();
//		boolean loApplicableFieldIsSelected = loApplicableFieldFocusedElement.equals(loApplicableTextField);
//		assertFalse(loApplicableFieldIsSelected, "loApplicable Text Field is not Selected");
//      
//		//Verifying that loApplicable Text Field is Enabled or not
//		boolean isEnabledloApplicableField = loApplicableTextField.isEnabled();
//		assertTrue(isEnabledloApplicableField);
//		
//		//Verifying the Placeholder which is present in loApplicable text field.
//		String displayedTextInloApplicable = loApplicableTextField.getAttribute("placeholder");
//		
//		String expected_placeholder_in_loApplicable = "Enter LD Applicable";
//		
//		assertEquals(displayedTextInloApplicable, expected_placeholder_in_loApplicable);
//		
//		loApplicableTextField.sendKeys("TEST Lo Applicable");
//		
//WebElement sourceInspection = driver.findElement(By.xpath("(//span)[61]"));
//		executor.executeScript("arguments[0].click();", sourceInspection);
//		
//		//Verify that  sourceInspection Field is Displayed or not
//		boolean isDisabledsourceInspection = sourceInspection.isDisplayed(); 
//		assertTrue(isDisabledsourceInspection);
//
//WebElement sourceInspectionTextField = driver.findElement(By.xpath("(//input[@placeholder='Enter Source Inspection'])[1]"));
//		
//
//		//Verify that  sourceInspectionTextField Field is clickable or not
//		WebElement sourceInspectionTextFieldFieldFocusedElement = driver.switchTo().activeElement();
//		boolean sourceInspectionTextFieldFieldIsSelected = sourceInspectionTextFieldFieldFocusedElement.equals(sourceInspectionTextField);
//		assertFalse(sourceInspectionTextFieldFieldIsSelected, "sourceInspectionTextField Text Field is not Selected");
//      
//		//Verifying that sourceInspectionTextField Text Field is Enabled or not
//		boolean isEnabledsourceInspectionTextFieldField = sourceInspectionTextField.isEnabled();
//		assertTrue(isEnabledsourceInspectionTextFieldField);
//		
//		//Verifying the Placeholder which is present in sourceInspectionTextField text field.
//		String displayedTextInsourceInspectionTextField = sourceInspectionTextField.getAttribute("placeholder");
//		
//		String expected_placeholder_in_sourceInspectionTextField = "Enter Source Inspection";
//		
//		assertEquals(displayedTextInsourceInspectionTextField, expected_placeholder_in_sourceInspectionTextField);
//		
//		sourceInspectionTextField.sendKeys("TEST Source Inspection");

//Satutory

		executor.executeScript("arguments[0].click();", statutory);

		executor.executeScript("arguments[0].click();", incorporation);

		// Verify that incorporation Field is Displayed or not
		boolean isDisabledincorporation = !incorporation.isDisplayed();
		assertFalse(isDisabledincorporation);

		executor.executeScript("arguments[0].click();", tin);

		// Verify that tin Field is Displayed or not
		boolean isDisabledtin = !tin.isDisplayed();
		assertFalse(isDisabledtin);

		executor.executeScript("arguments[0].click();", gst1);

		executor.executeScript("arguments[0].click();", iec);

		// Verify that iec Field is Displayed or not
		boolean isDisablediec = !iec.isDisplayed();
		assertFalse(isDisablediec);

		executor.executeScript("arguments[0].click();", pan1);

		// Verify that pan Field is Displayed or not
		boolean isDisabledpan = !pan1.isDisplayed();
		assertFalse(isDisabledpan);

		executor.executeScript("arguments[0].click();", udhyamCertificate);

		// Verify that preferredFreightForwarder Field is Displayed or not
		boolean isDisabledudhyamCertificate = !incorporation.isDisplayed();
		assertFalse(isDisabledudhyamCertificate);

		executor.executeScript("arguments[0].click();", msme);

		// Verify that pan Field is Displayed or not
		boolean isDisabledmsme = !msme.isDisplayed();
		assertFalse(isDisabledmsme);

////CertificatesDocs
//		
//		executor.executeScript("arguments[0].click();", certifications);
//
//		executor.executeScript("arguments[0].click();", iso);
//		
//		//Verify that  pan Field is Displayed or not
//		boolean isDisablediso = !iso.isDisplayed(); 
//		assertFalse(isDisablediso);
//		
//		executor.executeScript("arguments[0].click();", as);
//		
//		//Verify that  pan Field is Displayed or not
//		boolean isDisabledas = !as.isDisplayed(); 
//		assertFalse(isDisabledas);
//		
//		executor.executeScript("arguments[0].click();", medical);
//		
//		//Verify that  pan Field is Displayed or not
//		boolean isDisabledmedical = !medical.isDisplayed(); 
//		assertFalse(isDisabledmedical);
//		
//		executor.executeScript("arguments[0].click();", nadcap);
//		
//		//Verify that  pan Field is Displayed or not
//		boolean isDisablednadcap = !nadcap.isDisplayed(); 
//		assertFalse(isDisablednadcap);
//		
//Details

		executor.executeScript("arguments[0].click();", details);

		// Verify that turnOver Field is Displayed or not
		boolean isDisabledturnOverFieldn = !turnOver.isDisplayed();
		assertFalse(isDisabledturnOverFieldn);

		// Verify that turnOver Field is clickable or not
		WebElement turnOverFieldFocusedElement = driver.switchTo().activeElement();
		boolean turnOverFieldIsSelected = turnOverFieldFocusedElement.equals(turnOver);
		assertFalse(turnOverFieldIsSelected, "turnOver Text Field is not Selected");

		// Verifying that turnOver Text Field is Enabled or not
		boolean isEnabledturnOverField = turnOver.isEnabled();
		assertTrue(isEnabledturnOverField);

		// Verifying the Placeholder which is present in turnOver text field.
		String displayedTextInturnOver = turnOver.getAttribute("placeholder");

		String expected_placeholder_in_turnOver = "Enter Turn Over (3 Years)";

		assertEquals(displayedTextInturnOver, expected_placeholder_in_turnOver);
		turnOver.sendKeys(turnovr);

		// Verify that dnbNumber Field is Displayed or not
		boolean isDisableddnbNumberFieldn = !dnbNumber.isDisplayed();
		assertFalse(isDisableddnbNumberFieldn);

		// Verify that dnbNumber Field is clickable or not
		WebElement dnbNumberFieldFocusedElement = driver.switchTo().activeElement();
		boolean dnbNumberFieldIsSelected = dnbNumberFieldFocusedElement.equals(dnbNumber);
		assertFalse(dnbNumberFieldIsSelected, "dnbNumber Text Field is not Selected");

		// Verifying that dnbNumber Text Field is Enabled or not
		boolean isEnableddnbNumberField = dnbNumber.isEnabled();
		assertTrue(isEnableddnbNumberField);

		// Verifying the Placeholder which is present in dnbNumber text field.
		String displayedTextIndnbNumber = dnbNumber.getAttribute("placeholder");

		String expected_placeholder_in_dnbNumber = "Enter DNB (Hoovers) Number";

		assertEquals(displayedTextIndnbNumber, expected_placeholder_in_dnbNumber);

		dnbNumber.sendKeys(dnb);

		// Verify that icra Field is Displayed or not
		boolean isDisabledicraFieldn = !icra.isDisplayed();
		assertFalse(isDisabledicraFieldn);

		// Verify that icra Field is clickable or not
		WebElement icraFieldFocusedElement = driver.switchTo().activeElement();
		boolean icraFieldIsSelected = icraFieldFocusedElement.equals(icra);
		assertFalse(icraFieldIsSelected, "icra Text Field is not Selected");

		// Verifying that icra Text Field is Enabled or not
		boolean isEnabledicraField = icra.isEnabled();
		assertTrue(isEnabledicraField);

		// Verifying the Placeholder which is present in icra text field.
		String displayedTextInicra = icra.getAttribute("placeholder");

		String expected_placeholder_in_icra = "Enter ICRA";

		assertEquals(displayedTextInicra, expected_placeholder_in_icra);

		icra.sendKeys(icr);

		executor.executeScript("arguments[0].click();", headCount1);

		// Verify that headcount Field is clickable or not
		WebElement headcountFieldFocusedElement = driver.switchTo().activeElement();
		boolean headcountFieldIsSelected = headcountFieldFocusedElement.equals(enterHeadCount);
		assertFalse(headcountFieldIsSelected, "headcount Text Field is not Selected");

		// Verifying that headcount Text Field is Enabled or not
		boolean isEnabledheadcountField = enterHeadCount.isEnabled();
		assertTrue(isEnabledheadcountField);

		// Verifying the Placeholder which is present in headcount text field.
		String displayedTextInheadcount = enterHeadCount.getAttribute("placeholder");

		String expected_placeholder_in_headcount = "Enter Head Count";

		assertEquals(displayedTextInheadcount, expected_placeholder_in_headcount);

		enterHeadCount.sendKeys(headcount);

		// Verifying that skill Text Field is Enabled or not
		boolean isEnabledskillField = enterskill.isEnabled();
		assertTrue(isEnabledskillField);

		// Verifying the Placeholder which is present in skill text field.
		String displayedTextInskill = enterskill.getAttribute("placeholder");

		String expected_placeholder_in_skill = "Skill/Dept";

		assertEquals(displayedTextInskill, expected_placeholder_in_skill);

		enterskill.sendKeys(skill);

		// Verifying that numOfPeople Text Field is Enabled or not
		boolean isEnablednumOfPeopleField = noOfPeople.isEnabled();
		assertTrue(isEnablednumOfPeopleField);

		// Verifying the Placeholder which is present in numOfPeople text field.
		String displayedTextInnumOfPeople = noOfPeople.getAttribute("placeholder");

		String expected_placeholder_in_numOfPeople = "Qty";

		assertEquals(displayedTextInnumOfPeople, expected_placeholder_in_numOfPeople);

		noOfPeople.sendKeys(people);

		executor.executeScript("arguments[0].click();", addheadCount);

		// Verify that capacity Field is Displayed or not
		boolean isDisabledcapacityFieldn = !capacity.isDisplayed();
		assertFalse(isDisabledcapacityFieldn);

		// Verify that capacity Field is clickable or not
		WebElement capacityFieldFocusedElement = driver.switchTo().activeElement();
		boolean capacityFieldIsSelected = capacityFieldFocusedElement.equals(capacity);
		assertFalse(capacityFieldIsSelected, "capacity Text Field is not Selected");

		// Verifying that capacity Text Field is Enabled or not
		boolean isEnabledcapacityField = capacity.isEnabled();
		assertTrue(isEnabledcapacityField);

		// Verifying the Placeholder which is present in capacity text field.
		String displayedTextIncapacity = capacity.getAttribute("placeholder");

		String expected_placeholder_in_capacity = "Enter Capacity";

		assertEquals(displayedTextIncapacity, expected_placeholder_in_capacity);

		capacity.sendKeys(cacp);

		// Verify that floorSpace Field is Displayed or not
		boolean isDisabledfloorSpaceFieldn = !floorSpace.isDisplayed();
		assertFalse(isDisabledfloorSpaceFieldn);

		// Verify that floorSpace Field is clickable or not
		WebElement floorSpaceFieldFocusedElement = driver.switchTo().activeElement();
		boolean floorSpaceFieldIsSelected = floorSpaceFieldFocusedElement.equals(floorSpace);
		assertFalse(floorSpaceFieldIsSelected, "floorSpace Text Field is not Selected");

		// Verifying that floorSpace Text Field is Enabled or not
		boolean isEnabledfloorSpaceField = floorSpace.isEnabled();
		assertTrue(isEnabledfloorSpaceField);

		// Verifying the Placeholder which is present in floorSpace text field.
		String displayedTextInfloorSpace = floorSpace.getAttribute("placeholder");

		String expected_placeholder_in_floorSpace = "Enter Floor Space";

		assertEquals(displayedTextInfloorSpace, expected_placeholder_in_floorSpace);

		floorSpace.sendKeys(floor);

		// Verify that machine Field is Displayed or not
		boolean isDisabledmachineFieldn = !machine.isDisplayed();
		assertFalse(isDisabledmachineFieldn);

		// Verify that machine Field is clickable or not
		WebElement machineFieldFocusedElement = driver.switchTo().activeElement();
		boolean machineFieldIsSelected = machineFieldFocusedElement.equals(machine);
		assertFalse(machineFieldIsSelected, "machine Text Field is not Selected");

		// Verifying that machine Text Field is Enabled or not
		boolean isEnabledmachineField = machine.isEnabled();
		assertTrue(isEnabledmachineField);

		// Verifying the Placeholder which is present in machine text field.
		String displayedTextInmachine = machine.getAttribute("placeholder");

		String expected_placeholder_in_machine = "Enter Machine";

		assertEquals(displayedTextInmachine, expected_placeholder_in_machine);

		machine.sendKeys(machine1);

		// Verify that toolsAndEquip Field is Displayed or not
		boolean isDisabledtoolsAndEquipFieldn = !toolsAndEquip.isDisplayed();
		assertFalse(isDisabledtoolsAndEquipFieldn);

		// Verify that toolsAndEquip Field is clickable or not
		WebElement toolsAndEquipFieldFocusedElement = driver.switchTo().activeElement();
		boolean toolsAndEquipFieldIsSelected = toolsAndEquipFieldFocusedElement.equals(toolsAndEquip);
		assertFalse(toolsAndEquipFieldIsSelected, "toolsAndEquip Text Field is not Selected");

		// Verifying that toolsAndEquip Text Field is Enabled or not
		boolean isEnabledtoolsAndEquipField = toolsAndEquip.isEnabled();
		assertTrue(isEnabledtoolsAndEquipField);

		// Verifying the Placeholder which is present in toolsAndEquip text field.
		String displayedTextIntoolsAndEquip = toolsAndEquip.getAttribute("placeholder");

		String expected_placeholder_in_toolsAndEquip = "Enter Tools & Equip";

		assertEquals(displayedTextIntoolsAndEquip, expected_placeholder_in_toolsAndEquip);

		toolsAndEquip.sendKeys(tools);

		// Verify that sqft Field is Displayed or not
		boolean isDisabledsqftFieldn = !sqft.isDisplayed();
		assertFalse(isDisabledsqftFieldn);

		// Verify that sqft Field is clickable or not
		WebElement sqftFieldFocusedElement = driver.switchTo().activeElement();
		boolean sqftFieldIsSelected = sqftFieldFocusedElement.equals(sqft);
		assertFalse(sqftFieldIsSelected, "sqft Text Field is not Selected");

		// Verifying that sqft Text Field is Enabled or not
		boolean isEnabledsqftField = sqft.isEnabled();
		assertTrue(isEnabledsqftField);

		// Verifying the Placeholder which is present in sqft text field.
		String displayedTextInsqft = sqft.getAttribute("placeholder");

		String expected_placeholder_in_sqft = "Enter Sqft";

		assertEquals(displayedTextInsqft, expected_placeholder_in_sqft);

		sqft.sendKeys(sqft1);

		// Verify that uom Field is Displayed or not
		boolean isDisableduomFieldn = !uom.isDisplayed();
		assertFalse(isDisableduomFieldn);

		// Verify that uom Field is clickable or not
		WebElement uomFieldFocusedElement = driver.switchTo().activeElement();
		boolean uomFieldIsSelected = uomFieldFocusedElement.equals(uom);
		assertFalse(uomFieldIsSelected, "uom Text Field is not Selected");

		// Verifying that uom Text Field is Enabled or not
		boolean isEnableduomField = uom.isEnabled();
		assertTrue(isEnableduomField);

		uom.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", uomSelect);

		executor.executeScript("arguments[0].click();", erpToggle);

		// Verify that erp Field is Displayed or not
		boolean isDisablederpFieldn = !enterErp.isDisplayed();
		assertFalse(isDisablederpFieldn);

		// Verify that erp Field is clickable or not
		WebElement erpFieldFocusedElement = driver.switchTo().activeElement();
		boolean erpFieldIsSelected = erpFieldFocusedElement.equals(enterErp);
		assertFalse(erpFieldIsSelected, "erp Text Field is not Selected");

		// Verifying that erp Text Field is Enabled or not
//  		boolean isEnablederpField = enterErp.isEnabled();
//  		assertTrue(isEnablederpField);

		// Verifying the Placeholder which is present in erp text field.
		String displayedTextInerp = enterErp.getAttribute("placeholder");

		String expected_placeholder_in_erp = "Enter ERP";

		assertEquals(displayedTextInerp, expected_placeholder_in_erp);

		enterErp.sendKeys(erp2);

		WebElement esdSetup = driver.findElement(By.xpath("(//input[@value='yes'])[1]"));
		executor.executeScript("arguments[0].click();", esdSetup);

		WebElement hazmatSetup = driver.findElement(By.xpath("(//input[@value='yes'])[2]"));
		executor.executeScript("arguments[0].click();", hazmatSetup);

		executor.executeScript("arguments[0].click();", ospToggle);

		// Verify that osp1 Field is Displayed or not
		boolean isDisabledosp1Fieldn = !enterOsp.isDisplayed();
		assertFalse(isDisabledosp1Fieldn);

		// Verify that osp1 Field is clickable or not
		WebElement osp1FieldFocusedElement = driver.switchTo().activeElement();
		boolean osp1FieldIsSelected = osp1FieldFocusedElement.equals(enterOsp);
		assertFalse(osp1FieldIsSelected, "osp1 Text Field is not Selected");

		// Verifying that osp1 Text Field is Enabled or not
		boolean isEnabledosp1Field = enterOsp.isEnabled();
		assertTrue(isEnabledosp1Field);

		// Verifying the Placeholder which is present in osp1 text field.
		String displayedTextInosp1 = enterOsp.getAttribute("placeholder");

		String expected_placeholder_in_osp1 = "Remarks";

		assertEquals(displayedTextInosp1, expected_placeholder_in_osp1);

		enterOsp.sendKeys(osp2);

		// Company Approval

		executor.executeScript("arguments[0].click();", customerApproval);

		// Verify that scopeOfSupply Field is Displayed or not
		boolean isDisabledscopeOfSupplyFieldn = !scopeOfSupply.isDisplayed();
		assertFalse(isDisabledscopeOfSupplyFieldn);

		// Verify that scopeOfSupply Field is clickable or not
		WebElement scopeOfSupplyFieldFocusedElement = driver.switchTo().activeElement();
		boolean scopeOfSupplyFieldIsSelected = scopeOfSupplyFieldFocusedElement.equals(scopeOfSupply);
		assertFalse(scopeOfSupplyFieldIsSelected, "scopeOfSupply Text Field is not Selected");

		// Verifying that scopeOfSupply Text Field is Enabled or not
		boolean isEnabledscopeOfSupplyField = scopeOfSupply.isEnabled();
		assertTrue(isEnabledscopeOfSupplyField);

		scopeOfSupply.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", scopeOfSupplySelect);

//		//Verify that  companyCategory Field is Displayed or not
//		boolean isDisabledcompanyCategoryFieldn = !companyCategory.isDisplayed(); 
//		assertFalse(isDisabledcompanyCategoryFieldn);
//		
//		//Verify that  companyCategory Field is clickable or not
//			WebElement companyCategoryFieldFocusedElement = driver.switchTo().activeElement();
//		boolean companyCategoryFieldIsSelected = companyCategoryFieldFocusedElement.equals(companyCategory);
//		assertFalse(companyCategoryFieldIsSelected, "companyCategory Text Field is not Selected");
//		  
//		//Verifying that companyCategory Text Field is Enabled or not
//		boolean isEnabledcompanyCategoryField = companyCategory.isEnabled();
//		assertTrue(isEnabledcompanyCategoryField);
//		
//		companyCategory.sendKeys(Keys.ENTER);
//
//
//		executor.executeScript("arguments[0].click();", companyCategorySelect);

		// Verify that basisOfApproval Field is Displayed or not
		boolean isDisabledbasisOfApprovalFieldn = !basisOfApproval.isDisplayed();
		assertFalse(isDisabledbasisOfApprovalFieldn);

		// Verify that basisOfApproval Field is clickable or not
		WebElement basisOfApprovalFieldFocusedElement = driver.switchTo().activeElement();
		boolean basisOfApprovalFieldIsSelected = basisOfApprovalFieldFocusedElement.equals(basisOfApproval);
		assertFalse(basisOfApprovalFieldIsSelected, "basisOfApproval Text Field is not Selected");

		// Verifying that basisOfApproval Text Field is Enabled or not
		boolean isEnabledbasisOfApprovalField = basisOfApproval.isEnabled();
		assertTrue(isEnabledbasisOfApprovalField);

		basisOfApproval.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", basisOfApprovalSelect);

//		executor.executeScript("arguments[0].click();", inventoryItem);
//		
//		//Verify that  inventoryItem Field is Displayed or not
//		boolean isDisabledinventoryItem = inventoryItem.isDisplayed(); 
//		assertTrue(isDisabledinventoryItem);

		// Verify that approvedBy Field is Displayed or not
		boolean isDisabledapprovedBy = approvalBy.isDisplayed();
		assertTrue(isDisabledapprovedBy);

		// Verify that approvedBy Field is clickable or not
		WebElement approvedByFieldFocusedElement = driver.switchTo().activeElement();
		boolean approvedByFieldIsSelected = approvedByFieldFocusedElement.equals(approvalBy);
		assertFalse(approvedByFieldIsSelected, "approvedBy Text Field is not Selected");

		// Verifying that approvedBy Text Field is Enabled or not
		boolean isEnabledapprovedByField = approvalBy.isEnabled();
		assertTrue(isEnabledapprovedByField);

		// Verifying the Placeholder which is present in approvedBy text field.
		String displayedTextInapprovedBy = approvalBy.getAttribute("placeholder");

		String expected_placeholder_in_approvedBy = "Approval By";

		assertEquals(displayedTextInapprovedBy, expected_placeholder_in_approvedBy);

		approvalBy.sendKeys(approved);

		executor.executeScript("arguments[0].click();", reaudit);

		// Verify that reaudit Field is Displayed or not
		boolean isDisabledreaudit = reaudit.isDisplayed();
		assertTrue(isDisabledreaudit);

		// Verify that auditFrequency Field is Displayed or not
		boolean isDisabledauditFrequencyFieldn = !auditFrequency.isDisplayed();
		assertFalse(isDisabledauditFrequencyFieldn);

//		//Verify that  auditFrequency Field is clickable or not
//			WebElement auditFrequencyFieldFocusedElement = driver.switchTo().activeElement();
//		boolean auditFrequencyFieldIsSelected = auditFrequencyFieldFocusedElement.equals(auditFrequency);
//		assertFalse(auditFrequencyFieldIsSelected, "auditFrequency Text Field is not Selected");

		// Verifying that auditFrequency Text Field is Enabled or not
		boolean isEnabledauditFrequencyField = auditFrequency.isEnabled();
		assertTrue(isEnabledauditFrequencyField);

		auditFrequency.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", auditFrequencySelect);

		WebElement approvalDate = driver.findElement(By.xpath("(//input[@placeholder='DD-MM-YYYY'])[1]"));
		approvalDate.click();
		approvalDate.sendKeys(Keys.RIGHT);
		approvalDate.sendKeys(Keys.ENTER);

		// Verifing that do we able to upload files or not.
		WebElement UploadFiles = driver.findElement(By.xpath("(//input[@placeholder='Upload file'])[1]"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", UploadFiles);
		Robot robot = new Robot();
		robot.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\W2191\\eclipse-workspace\\Getapcs2\\src\\test\\java\\com\\testcases\\master1\\AALoginFunctionality.java");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		// Press Enter to open the file dialog

		robot.delay(2000);

		// Press Ctrl+V to paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.delay(2000);
		// Press Enter to confirm the file selection
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement SaveButton = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		SaveButton.sendKeys(Keys.ENTER);

		return new HomePage();
	}

	public HomePage CustomerMasterEdit(String cusName, String cusAlias, String add, String cty, String stat,
			String code, String boardnum, String web, String eml, String generalpin, String cName, String mobileNo,
			String llNum, String fN, String desig, String mobileno2, String exten, String lN, String eml1, String addrs,
			String gst, String pan, String brch, String account, String ifsc, String swtch, String Iban, String adv,
			String specialtms, String turnovr, String dnb, String icr, String headcount, String skill, String people,
			String cacp, String floor, String machine1, String tools, String sqft1, String approved)
			throws InterruptedException, AWTException {

		customerName.clear();
		customerName.sendKeys(cusName);
		// 1Verifying that Item Number Text Field is Enabled or not
		boolean isEnabledCompanyNameTextField = customerName.isEnabled();
		assertTrue(isEnabledCompanyNameTextField);
		boolean isDisabledCompanyNameTextFieldn = !customerName.isEnabled();
		assertFalse(isDisabledCompanyNameTextFieldn);

		// Verifying that Item Number Text Field is displayed or hidden.
		boolean isDisplayedCompanyNameTextField = customerName.isDisplayed();
		assertTrue(isDisplayedCompanyNameTextField);
		boolean isHiddenCompanyNameTextField = !customerName.isDisplayed();
		assertFalse(isHiddenCompanyNameTextField);

		// Verifying that Item Number Text Field is Selected or unselected
		boolean isSelectedCompanyNameTextField = customerName.isSelected();
		assertFalse(isSelectedCompanyNameTextField);
		boolean isDeselectedCompanyNameTextField = !customerName.isSelected();
		assertTrue(isDeselectedCompanyNameTextField);

		// Verifying the Placeholder which is present in CompanyName text field.
		String displayedTextInCompanyName = customerName.getAttribute("placeholder");

		String expected_placeholder2 = "Enter Customer Name";

		assertEquals(displayedTextInCompanyName, expected_placeholder2);
		customerAlias.clear();
		customerAlias.sendKeys(cusAlias);
		// 1Verifying that Item Number Text Field is Enabled or not
		boolean isEnabledCompanyAliasTextField = customerAlias.isEnabled();
		assertTrue(isEnabledCompanyAliasTextField);
		boolean isDisabledCompanyAliasTextFieldn = !customerAlias.isEnabled();
		assertFalse(isDisabledCompanyAliasTextFieldn);

		// Verifying that Item Number Text Field is displayed or hidden.
		boolean isDisplayedCompanyAliasTextField = customerAlias.isDisplayed();
		assertTrue(isDisplayedCompanyAliasTextField);
		boolean isHiddenCompanyAliasTextField = !customerAlias.isDisplayed();
		assertFalse(isHiddenCompanyAliasTextField);

		// Verifying that Item Number Text Field is Selected or unselected
		boolean isSelectedCompanyAliasTextField = customerAlias.isSelected();
		assertFalse(isSelectedCompanyAliasTextField);
		boolean isDeselectedCompanyAliasTextField = !customerAlias.isSelected();
		assertTrue(isDeselectedCompanyAliasTextField);

		// Verifying the Placeholder which is present in CompanyAlias text field.
		String displayedTextInCompanyAlias = customerAlias.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Customer Alias";

		assertEquals(displayedTextInCompanyAlias, expected_placeholder3);

//        //Verify the Hight and Width of the CompanyId and CompanyName Text Field.
//		int CompanyIdfieldHeightSize = CompanyId.getSize().getHeight();
//		int CompanyIdfieldWidthSize = CompanyId.getSize().getWidth();
//	
//		int CompanyNamefieldHeightSize = CompanyName.getSize().getHeight();
//		int CompanyNamefieldWidthSize = CompanyName.getSize().getWidth();
//		
//		int CompanyAliasfieldHeightSize = CompanyAlias.getSize().getHeight();
//		int CompanyAliasfieldWidthSize = CompanyAlias.getSize().getWidth();
//		
//		System.out.println("The maximun Height of CompanyId Text field is"+CompanyIdfieldHeightSize);
//		System.out.println("The maximun Width of CompanyId Text field is "+CompanyIdfieldWidthSize);
//		System.out.println("The maximun Height of CompanyName text field is "+CompanyNamefieldHeightSize);
//		System.out.println("The maximun Width of CompanyName text field is "+CompanyNamefieldWidthSize);
//		System.out.println("The maximun Height of CompanyAlias text field is "+CompanyAliasfieldHeightSize);
//		System.out.println("The maximun Width of CompanyAlias text field is "+CompanyAliasfieldWidthSize);		

		// *****************************//

//General

		// Verify that CustomerType Field is Displayed or not
		boolean isDisabledCustomerTypeFieldn = !customerType.isDisplayed();
		assertFalse(isDisabledCustomerTypeFieldn);

		// Verify that CustomerType Field is clickable or not
		WebElement CustomerTypeFieldFocusedElement = driver.switchTo().activeElement();
		boolean CustomerTypeFieldIsSelected = CustomerTypeFieldFocusedElement.equals(customerType);
		assertFalse(CustomerTypeFieldIsSelected, "CustomerType Text Field is not Selected");

		// Verifying that CustomerType Text Field is Enabled or not
		boolean isEnabledInspectionIntDaysField = customerType.isEnabled();
		assertTrue(isEnabledInspectionIntDaysField);

		customerType.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", customerTypeSelect);

		// Verify that Address Field is Displayed or not
		boolean isDisabledAddressFieldn = !address.isDisplayed();
		assertFalse(isDisabledAddressFieldn);

		// Verify that Address Field is clickable or not
		WebElement AddressFieldFocusedElement = driver.switchTo().activeElement();
		boolean AddressFieldIsSelected = AddressFieldFocusedElement.equals(address);
		assertFalse(AddressFieldIsSelected, "Address Text Field is not Selected");

		// Verifying that Address Text Field is Enabled or not
		boolean isEnabledAddressField = address.isEnabled();
		assertTrue(isEnabledAddressField);
		address.clear();
		address.sendKeys(add);

		// Verifying the Placeholder which is present in Address text field.
		String displayedTextInAddress = address.getAttribute("placeholder");

		String expected_placeholder4 = "Enter Address";

		assertEquals(displayedTextInAddress, expected_placeholder4);

		// Verify that City Field is Displayed or not
		boolean isDisabledCityFieldn = !city.isDisplayed();
		assertFalse(isDisabledCityFieldn);

		// Verify that City Field is clickable or not
		WebElement CityFieldFocusedElement = driver.switchTo().activeElement();
		boolean CityFieldIsSelected = CityFieldFocusedElement.equals(city);
		assertFalse(CityFieldIsSelected, "City Text Field is not Selected");

		// Verifying that City Text Field is Enabled or not
		boolean isEnabledCityField = city.isEnabled();
		assertTrue(isEnabledCityField);

		// Verifying the Placeholder which is present in City text field.
		String displayedTextInCity = city.getAttribute("placeholder");

		String expected_placeholder5 = "Enter city";

		assertEquals(displayedTextInCity, expected_placeholder5);
		city.clear();
		city.sendKeys(cty);

		// Verify that State Field is Displayed or not
		boolean isDisabledStateFieldn = !state.isDisplayed();
		assertFalse(isDisabledStateFieldn);

		// Verify that State Field is clickable or not
		WebElement StateFieldFocusedElement = driver.switchTo().activeElement();
		boolean StateFieldIsSelected = StateFieldFocusedElement.equals(state);
		assertFalse(StateFieldIsSelected, "State Text Field is not Selected");

		// Verifying that State Text Field is Enabled or not
		boolean isEnabledStateField = state.isEnabled();
		assertTrue(isEnabledStateField);

		// Verifying the Placeholder which is present in State text field.
		String displayedTextInState = state.getAttribute("placeholder");

		String expected_placeholder6 = "Enter state";

		assertEquals(displayedTextInState, expected_placeholder6);
		state.clear();
		state.sendKeys(stat);

//		//Verify that  Country Field is Displayed or not
//		boolean isDisabledCountryFieldn = !country.isDisplayed(); 
//		assertFalse(isDisabledCountryFieldn);
//		
//		//Verify that  Country Field is clickable or not
//  		WebElement CountryFieldFocusedElement = driver.switchTo().activeElement();
//	    boolean CountryFieldIsSelected = CountryFieldFocusedElement.equals(country);
//	    assertFalse(CountryFieldIsSelected, "Country Text Field is not Selected");
//          
//	    //Verifying that Country Text Field is Enabled or not
//  		boolean isEnabledCountryField = country.isEnabled();
//  		assertTrue(isEnabledCountryField);
//  		
//  		country.sendKeys(Keys.ENTER);
//  		country.sendKeys(county);
//		
//		executor.executeScript("arguments[0].click();", countrySelect);
//		
//		
		// Verify that ZipCode Field is Displayed or not
		boolean isDisabledZipCodeFieldn = !zipCode.isDisplayed();
		assertFalse(isDisabledZipCodeFieldn);

		// Verify that ZipCode Field is clickable or not
		WebElement ZipCodeFieldFocusedElement = driver.switchTo().activeElement();
		boolean ZipCodeFieldIsSelected = ZipCodeFieldFocusedElement.equals(zipCode);
		assertFalse(ZipCodeFieldIsSelected, "ZipCode Text Field is not Selected");

		// Verifying that ZipCode Text Field is Enabled or not
		boolean isEnabledZipCodeField = zipCode.isEnabled();
		assertTrue(isEnabledZipCodeField);

		// Verifying the Placeholder which is present in ZipCode text field.
		String displayedTextInZipCode = zipCode.getAttribute("placeholder");

		String expected_placeholder_in_ZipCode = "Enter Pin / Zip Code";

		assertEquals(displayedTextInZipCode, expected_placeholder_in_ZipCode);
		zipCode.clear();
		zipCode.sendKeys(code);

		// Verify that PurchaseGroup Field is Displayed or not
		boolean isDisabledPurchaseGroupFieldn = !segment.isDisplayed();
		assertFalse(isDisabledPurchaseGroupFieldn);

		// Verify that PurchaseGroup Field is clickable or not
		WebElement PurchaseGroupFieldFocusedElement = driver.switchTo().activeElement();
		boolean PurchaseGroupFieldIsSelected = PurchaseGroupFieldFocusedElement.equals(segment);
		assertFalse(PurchaseGroupFieldIsSelected, "PurchaseGroup Text Field is not Selected");

		// Verifying that PurchaseGroup Text Field is Enabled or not
		boolean isEnabledPurchaseGroupField = segment.isEnabled();
		assertTrue(isEnabledPurchaseGroupField);

		segment.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", segmentSelect);

		// Verify that boardNumber Field is Displayed or not
		boolean isDisabledboardNumberFieldn = !boardNumber.isDisplayed();
		assertFalse(isDisabledboardNumberFieldn);

		// Verify that boardNumber Field is clickable or not
		WebElement boardNumberFieldFocusedElement = driver.switchTo().activeElement();
		boolean boardNumberFieldIsSelected = boardNumberFieldFocusedElement.equals(boardNumber);
		assertFalse(boardNumberFieldIsSelected, "boardNumber Text Field is not Selected");

		// Verifying that boardNumber Text Field is Enabled or not
		boolean isEnabledboardNumberField = boardNumber.isEnabled();
		assertTrue(isEnabledboardNumberField);

		// Verifying the Placeholder which is present in boardNumber text field.
		String displayedTextInboardNumber = boardNumber.getAttribute("placeholder");

		String expected_placeholder_in_boardNumber = "Enter Board No";

		assertEquals(displayedTextInboardNumber, expected_placeholder_in_boardNumber);
		boardNumber.clear();
		boardNumber.sendKeys(boardnum);

		// Verify that webSite Field is Displayed or not
		boolean isDisabledwebSiteFieldn = !website.isDisplayed();
		assertFalse(isDisabledwebSiteFieldn);

		// Verify that webSite Field is clickable or not
		WebElement webSiteFieldFocusedElement = driver.switchTo().activeElement();
		boolean webSiteFieldIsSelected = webSiteFieldFocusedElement.equals(website);
		assertFalse(webSiteFieldIsSelected, "webSite Text Field is not Selected");

		// Verifying that webSite Text Field is Enabled or not
		boolean isEnabledwebSiteField = website.isEnabled();
		assertTrue(isEnabledwebSiteField);

		// Verifying the Placeholder which is present in webSite text field.
		String displayedTextInwebSite = website.getAttribute("placeholder");

		String expected_placeholder_in_webSite = "Enter Website";

		assertEquals(displayedTextInwebSite, expected_placeholder_in_webSite);
		website.clear();
		website.sendKeys(web);

		// Verify that email Field is Displayed or not
		boolean isDisabledemailFieldn = !email.isDisplayed();
		assertFalse(isDisabledemailFieldn);

		// Verify that email Field is clickable or not
		WebElement emailFieldFocusedElement = driver.switchTo().activeElement();
		boolean emailFieldIsSelected = emailFieldFocusedElement.equals(email);
		assertFalse(emailFieldIsSelected, "email Text Field is not Selected");

		// Verifying that email Text Field is Enabled or not
		boolean isEnabledemailField = email.isEnabled();
		assertTrue(isEnabledemailField);

		// Verifying the Placeholder which is present in email text field.
		String displayedTextInemail = email.getAttribute("placeholder");

		String expected_placeholder_in_email = "Enter Email";

		assertEquals(displayedTextInemail, expected_placeholder_in_email);
		email.clear();
		email.sendKeys(eml);

		// Verify that Currency Field is Displayed or not
		boolean isDisabledCurrencyFieldn = !currency.isDisplayed();
		assertFalse(isDisabledCurrencyFieldn);

		// Verify that Currency Field is clickable or not
		WebElement CurrencyFieldFocusedElement = driver.switchTo().activeElement();
		boolean CurrencyFieldIsSelected = CurrencyFieldFocusedElement.equals(currency);
		assertFalse(CurrencyFieldIsSelected, "Currency Text Field is not Selected");

		// Verifying that Currency Text Field is Enabled or not
		boolean isEnabledCurrencyField = currency.isEnabled();
		assertTrue(isEnabledCurrencyField);

		currency.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", currencySelect);

		// Verify that generalPinLocation Field is Displayed or not
		boolean isDisabledgeneralPinLocationFieldn = !generalPinLocation.isDisplayed();
		assertFalse(isDisabledgeneralPinLocationFieldn);

		// Verify that generalPinLocation Field is clickable or not
		WebElement generalPinLocationFieldFocusedElement = driver.switchTo().activeElement();
		boolean generalPinLocationFieldIsSelected = generalPinLocationFieldFocusedElement.equals(generalPinLocation);
		assertFalse(generalPinLocationFieldIsSelected, "generalPinLocation Text Field is not Selected");

		// Verifying that generalPinLocation Text Field is Enabled or not
		boolean isEnabledgeneralPinLocationField = generalPinLocation.isEnabled();
		assertTrue(isEnabledgeneralPinLocationField);

		// Verifying the Placeholder which is present in generalPinLocation text field.
		String displayedTextIngeneralPinLocation = generalPinLocation.getAttribute("placeholder");

		String expected_placeholder_in_generalPinLocation = "Enter Google Pin Location";

		assertEquals(displayedTextIngeneralPinLocation, expected_placeholder_in_generalPinLocation);
		generalPinLocation.clear();
		generalPinLocation.sendKeys(generalpin);

		// Verify that typeOfCompany Field is Displayed or not
		boolean isDisabledtypeOfCompanyFieldn = !typeOfCompany.isDisplayed();
		assertFalse(isDisabledtypeOfCompanyFieldn);

		// Verify that typeOfCompany Field is clickable or not
		WebElement typeOfCompanyFieldFocusedElement = driver.switchTo().activeElement();
		boolean typeOfCompanyFieldIsSelected = typeOfCompanyFieldFocusedElement.equals(typeOfCompany);
		assertFalse(typeOfCompanyFieldIsSelected, "typeOfCompany Text Field is not Selected");

		// Verifying that typeOfCompany Text Field is Enabled or not
		boolean isEnabledtypeOfCompanyField = typeOfCompany.isEnabled();
		assertTrue(isEnabledtypeOfCompanyField);

		typeOfCompany.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", typeOfCompanySelect);

		// Verify that exportUnitType Field is Displayed or not
		boolean isDisabledexportUnitTypeFieldn = !exportUnitType.isDisplayed();
		assertFalse(isDisabledexportUnitTypeFieldn);

		// Verify that exportUnitType Field is clickable or not
		WebElement exportUnitTypeFieldFocusedElement = driver.switchTo().activeElement();
		boolean exportUnitTypeFieldIsSelected = exportUnitTypeFieldFocusedElement.equals(exportUnitType);
		assertFalse(exportUnitTypeFieldIsSelected, "exportUnitType Text Field is not Selected");

		// Verifying that exportUnitType Text Field is Enabled or not
		boolean isEnabledexportUnitTypeField = exportUnitType.isEnabled();
		assertTrue(isEnabledexportUnitTypeField);

		exportUnitType.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", exportUnitTypeSelect);

		executor.executeScript("arguments[0].click();", toggleButton);

		// Verify that code Field is Displayed or not
		boolean isDisabledcodeFieldn = !salesManagerCode.isDisplayed();
		assertFalse(isDisabledcodeFieldn);

		// Verify that code Field is clickable or not
		WebElement codeFieldFocusedElement = driver.switchTo().activeElement();
		boolean codeFieldIsSelected = codeFieldFocusedElement.equals(salesManagerCode);
		assertFalse(codeFieldIsSelected, "code Text Field is not Selected");

		// Verifying that code Text Field is Enabled or not
		boolean isEnabledcodeField = salesManagerCode.isEnabled();
		assertTrue(isEnabledcodeField);

		// Verifying the Placeholder which is present in code text field.
		String displayedTextIncode = salesManagerCode.getAttribute("placeholder");

		String expected_placeholder_in_code = "Code";

		assertEquals(displayedTextIncode, expected_placeholder_in_code);

		salesManagerCode.clear();
		salesManagerCode.sendKeys("6785");

		// Verify that salesManager Field is Displayed or not
		boolean isDisabledsalesManagerFieldn = !salesManagerText.isDisplayed();
		assertFalse(isDisabledsalesManagerFieldn);

		// Verify that salesManager Field is clickable or not
		WebElement salesManagerFieldFocusedElement = driver.switchTo().activeElement();
		boolean salesManagerFieldIsSelected = salesManagerFieldFocusedElement.equals(salesManagerText);
		assertFalse(salesManagerFieldIsSelected, "salesManager Text Field is not Selected");

		// Verifying that salesManager Text Field is Enabled or not
		boolean isEnabledsalesManagerField = salesManagerText.isEnabled();
		assertTrue(isEnabledsalesManagerField);

		// Verifying the Placeholder which is present in salesManager text field.
		String displayedTextInsalesManager = salesManagerText.getAttribute("placeholder");

		String expected_placeholder_in_salesManager = "Enter Sales Manager";

		assertEquals(displayedTextInsalesManager, expected_placeholder_in_salesManager);

		salesManagerText.clear();
		salesManagerText.sendKeys("TEST Sales Manager1");

		// Verify that region Field is Displayed or not
		boolean isDisabledregionFieldn = !region.isDisplayed();
		assertFalse(isDisabledregionFieldn);

		// Verify that region Field is clickable or not
		WebElement regionFieldFocusedElement = driver.switchTo().activeElement();
		boolean regionFieldIsSelected = regionFieldFocusedElement.equals(region);
		assertFalse(regionFieldIsSelected, "region Text Field is not Selected");

		// Verifying that region Text Field is Enabled or not
		boolean isEnabledregionField = region.isEnabled();
		assertTrue(isEnabledregionField);

		// Verifying the Placeholder which is present in region text field.
		String displayedTextInregion = region.getAttribute("placeholder");

		String expected_placeholder_in_region = "Enter Region";

		assertEquals(displayedTextInregion, expected_placeholder_in_region);

		region.clear();
		region.sendKeys("TEST Region1");

		// Verify that shippingMode Field is Displayed or not
		boolean isDisabledshippingModeFieldn = !shippingMode.isDisplayed();
		assertFalse(isDisabledshippingModeFieldn);

		// Verify that shippingMode Field is clickable or not
		WebElement shippingModeFieldFocusedElement = driver.switchTo().activeElement();
		boolean shippingModeFieldIsSelected = shippingModeFieldFocusedElement.equals(shippingMode);
		assertFalse(shippingModeFieldIsSelected, "shippingMode Text Field is not Selected");

		// Verifying that shippingMode Text Field is Enabled or not
		boolean isEnabledshippingModeField = shippingMode.isEnabled();
		assertTrue(isEnabledshippingModeField);

		shippingMode.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", shippingModeSelect);
//Contacts

		executor.executeScript("arguments[0].click();", contacts);
		executor.executeScript("arguments[0].click();", contactsTable);

		// Verify that salutation Field is Displayed or not
		boolean isDisabledsalutationFieldn = !salutation.isDisplayed();
		assertFalse(isDisabledsalutationFieldn);

		// Verify that salutation Field is clickable or not
		WebElement salutationFieldFocusedElement = driver.switchTo().activeElement();
		boolean salutationFieldIsSelected = salutationFieldFocusedElement.equals(salutation);
		assertFalse(salutationFieldIsSelected, "salutation Text Field is not Selected");

		// Verifying that salutation Text Field is Enabled or not
		boolean isEnabledsalutationField = salutation.isEnabled();
		assertTrue(isEnabledsalutationField);

		salutation.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", salutationSelect);

		// Verify that callName Field is Displayed or not
		boolean isDisabledcallNameFieldn = !callName.isDisplayed();
		assertFalse(isDisabledcallNameFieldn);

		// Verify that callName Field is clickable or not
		WebElement callNameFieldFocusedElement = driver.switchTo().activeElement();
		boolean callNameFieldIsSelected = callNameFieldFocusedElement.equals(callName);
		assertFalse(callNameFieldIsSelected, "callName Text Field is not Selected");

		// Verifying that callName Text Field is Enabled or not
		boolean isEnabledcallNameField = callName.isEnabled();
		assertTrue(isEnabledcallNameField);

		// Verifying the Placeholder which is present in callName text field.
		String displayedTextIncallName = callName.getAttribute("placeholder");

		String expected_placeholder_in_callName = "Enter Call Name";

		assertEquals(displayedTextIncallName, expected_placeholder_in_callName);
		callName.clear();
		callName.sendKeys(cName);

//		//Verify that  mobileNumCode Field is Displayed or not
//		boolean isDisabledmobileNumCodeFieldn = !mobileNumCode.isDisplayed(); 
//		assertFalse(isDisabledmobileNumCodeFieldn);
//		
//		//Verify that  mobileNumCode Field is clickable or not
//  		WebElement mobileNumCodeFieldFocusedElement = driver.switchTo().activeElement();
//	    boolean mobileNumCodeFieldIsSelected = mobileNumCodeFieldFocusedElement.equals(mobileNumCode);
//	    assertFalse(mobileNumCodeFieldIsSelected, "mobileNumCode Text Field is not Selected");
//          
//	    //Verifying that mobileNumCode Text Field is Enabled or not
//  		boolean isEnabledmobileNumCodeField = mobileNumCode.isEnabled();
//  		assertTrue(isEnabledmobileNumCodeField);
//  		
//  		mobileNumCode.sendKeys(Keys.ENTER);
//
//  		
//		executor.executeScript("arguments[0].click();", mobileNumCodeSelect);

		// Verify that mobileNum Field is Displayed or not
		boolean isDisabledmobileNumFieldn = !mobileNum.isDisplayed();
		assertFalse(isDisabledmobileNumFieldn);

		// Verify that mobileNum Field is clickable or not
		WebElement mobileNumFieldFocusedElement = driver.switchTo().activeElement();
		boolean mobileNumFieldIsSelected = mobileNumFieldFocusedElement.equals(mobileNum);
		assertFalse(mobileNumFieldIsSelected, "mobileNum Text Field is not Selected");

		// Verifying that mobileNum Text Field is Enabled or not
		boolean isEnabledmobileNumField = mobileNum.isEnabled();
		assertTrue(isEnabledmobileNumField);

		// Verifying the Placeholder which is present in mobileNum text field.
		String displayedTextInmobileNum = mobileNum.getAttribute("placeholder");

		String expected_placeholder_in_mobileNum = "Enter Mobile No";

		assertEquals(displayedTextInmobileNum, expected_placeholder_in_mobileNum);
		mobileNum.clear();
		mobileNum.sendKeys(mobileNo);

		// Verify that landLineNo Field is Displayed or not
		boolean isDisabledlandLineNoFieldn = !landLineNo.isDisplayed();
		assertFalse(isDisabledlandLineNoFieldn);

		// Verify that landLineNo Field is clickable or not
		WebElement landLineNoFieldFocusedElement = driver.switchTo().activeElement();
		boolean landLineNoFieldIsSelected = landLineNoFieldFocusedElement.equals(landLineNo);
		assertFalse(landLineNoFieldIsSelected, "landLineNo Text Field is not Selected");

		// Verifying that landLineNo Text Field is Enabled or not
		boolean isEnabledlandLineNoField = landLineNo.isEnabled();
		assertTrue(isEnabledlandLineNoField);

		// Verifying the Placeholder which is present in landLineNo text field.
		String displayedTextInlandLineNo = landLineNo.getAttribute("placeholder");

		String expected_placeholder_in_landLineNo = "Land Line";

		assertEquals(displayedTextInlandLineNo, expected_placeholder_in_landLineNo);
		landLineNo.clear();
		landLineNo.sendKeys(llNum);

		executor.executeScript("arguments[0].click();", timeToCall);
		timeToCall.sendKeys("12");
		timeToCall.sendKeys("12");

		// Verify that firstName Field is Displayed or not
		boolean isDisabledfirstNameFieldn = !firstName.isDisplayed();
		assertFalse(isDisabledfirstNameFieldn);

		// Verify that firstName Field is clickable or not
		WebElement firstNameFieldFocusedElement = driver.switchTo().activeElement();
		boolean firstNameFieldIsSelected = firstNameFieldFocusedElement.equals(firstName);
		assertFalse(firstNameFieldIsSelected, "firstName Text Field is not Selected");

		// Verifying that firstName Text Field is Enabled or not
		boolean isEnabledfirstNameField = firstName.isEnabled();
		assertTrue(isEnabledfirstNameField);

		// Verifying the Placeholder which is present in firstName text field.
		String displayedTextInfirstName = firstName.getAttribute("placeholder");

		String expected_placeholder_in_firstName = "Enter First Name";

		assertEquals(displayedTextInfirstName, expected_placeholder_in_firstName);
		firstName.clear();
		firstName.sendKeys(fN);

		// Verify that designation Field is Displayed or not
		boolean isDisableddesignationFieldn = !designation.isDisplayed();
		assertFalse(isDisableddesignationFieldn);

		// Verify that designation Field is clickable or not
		WebElement designationFieldFocusedElement = driver.switchTo().activeElement();
		boolean designationFieldIsSelected = designationFieldFocusedElement.equals(designation);
		assertFalse(designationFieldIsSelected, "designation Text Field is not Selected");

		// Verifying that designation Text Field is Enabled or not
		boolean isEnableddesignationField = designation.isEnabled();
		assertTrue(isEnableddesignationField);

		// Verifying the Placeholder which is present in designation text field.
		String displayedTextIndesignation = designation.getAttribute("placeholder");

		String expected_placeholder_in_designation = "Enter Designation";

		assertEquals(displayedTextIndesignation, expected_placeholder_in_designation);
		designation.clear();
		designation.sendKeys(desig);

//		//Verify that  mobileNumCode1 Field is Displayed or not
//		boolean isDisabledmobileNumCode1Fieldn = !mobileNumCode1.isDisplayed(); 
//		assertFalse(isDisabledmobileNumCode1Fieldn);
//		
//		//Verify that  mobileNumCode1 Field is clickable or not
//		WebElement mobileNumCode1FieldFocusedElement = driver.switchTo().activeElement();
//		boolean mobileNumCode1FieldIsSelected = mobileNumCode1FieldFocusedElement.equals(mobileNumCode1);
//		assertFalse(mobileNumCode1FieldIsSelected, "mobileNumCode1 Text Field is not Selected");
//		  
//		//Verifying that mobileNumCode1 Text Field is Enabled or not
//		boolean isEnabledmobileNumCode1Field = mobileNumCode1.isEnabled();
//		assertTrue(isEnabledmobileNumCode1Field);
//		
//		mobileNumCode1.sendKeys(Keys.ENTER);
//
//	
//		executor.executeScript("arguments[0].click();", mobileNumCode1Select);

		// Verify that mobileNum1 Field is Displayed or not
		boolean isDisabledmobileNum1Fieldn = !mobileNum1.isDisplayed();
		assertFalse(isDisabledmobileNum1Fieldn);

		// Verify that mobileNum1 Field is clickable or not
		WebElement mobileNum1FieldFocusedElement = driver.switchTo().activeElement();
		boolean mobileNum1FieldIsSelected = mobileNum1FieldFocusedElement.equals(mobileNum1);
		assertFalse(mobileNum1FieldIsSelected, "mobileNum1 Text Field is not Selected");

		// Verifying that mobileNum1 Text Field is Enabled or not
		boolean isEnabledmobileNum1Field = mobileNum1.isEnabled();
		assertTrue(isEnabledmobileNum1Field);

		// Verifying the Placeholder which is present in mobileNum1 text field.
		String displayedTextInmobileNum1 = mobileNum1.getAttribute("placeholder");

		String expected_placeholder_in_mobileNum1 = "Enter Mobile No";

		assertEquals(displayedTextInmobileNum1, expected_placeholder_in_mobileNum1);
		mobileNum1.clear();
		mobileNum1.sendKeys(mobileno2);

		// Verify that skypeId Field is Displayed or not
		boolean isDisabledskypeIdFieldn = !skypeID.isDisplayed();
		assertFalse(isDisabledskypeIdFieldn);

		// Verify that skypeId Field is clickable or not
		WebElement skypeIdFieldFocusedElement = driver.switchTo().activeElement();
		boolean skypeIdFieldIsSelected = skypeIdFieldFocusedElement.equals(skypeID);
		assertFalse(skypeIdFieldIsSelected, "skypeId Text Field is not Selected");

		// Verifying that skypeId Text Field is Enabled or not
		boolean isEnabledskypeIdField = skypeID.isEnabled();
		assertTrue(isEnabledskypeIdField);

		// Verifying the Placeholder which is present in skypeId text field.
		String displayedTextInskypeId = skypeID.getAttribute("placeholder");

		String expected_placeholder_in_skypeId = "Skype Id";

		assertEquals(displayedTextInskypeId, expected_placeholder_in_skypeId);
		skypeID.clear();
		skypeID.sendKeys("60");

		// Verify that Extension Field is Displayed or not
		boolean isDisabledExtensionFieldn = !extension.isDisplayed();
		assertFalse(isDisabledExtensionFieldn);

		// Verify that Extension Field is clickable or not
		WebElement ExtensionFieldFocusedElement = driver.switchTo().activeElement();
		boolean ExtensionFieldIsSelected = ExtensionFieldFocusedElement.equals(extension);
		assertFalse(ExtensionFieldIsSelected, "Extension Text Field is not Selected");

		// Verifying that Extension Text Field is Enabled or not
		boolean isEnabledExtensionField = extension.isEnabled();
		assertTrue(isEnabledExtensionField);

		// Verifying the Placeholder which is present in Extension text field.
		String displayedTextInExtension = extension.getAttribute("placeholder");

		String expected_placeholder_in_Extension = "Extension";

		assertEquals(displayedTextInExtension, expected_placeholder_in_Extension);
		extension.clear();
		extension.sendKeys(exten);

		// Verify that language Field is Displayed or not
		boolean isDisabledlanguageFieldn = !language.isDisplayed();
		assertFalse(isDisabledlanguageFieldn);

		// Verify that language Field is clickable or not
		WebElement languageFieldFocusedElement = driver.switchTo().activeElement();
		boolean languageFieldIsSelected = languageFieldFocusedElement.equals(language);
		assertFalse(languageFieldIsSelected, "language Text Field is not Selected");

		// Verifying that language Text Field is Enabled or not
		boolean isEnabledlanguageField = language.isEnabled();
		assertTrue(isEnabledlanguageField);

		language.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", languageSelect);

		// Verify that lastName Field is Displayed or not
		boolean isDisabledlastNameFieldn = !lastName.isDisplayed();
		assertFalse(isDisabledlastNameFieldn);

		// Verify that lastName Field is clickable or not
		WebElement lastNameFieldFocusedElement = driver.switchTo().activeElement();
		boolean lastNameFieldIsSelected = lastNameFieldFocusedElement.equals(lastName);
		assertFalse(lastNameFieldIsSelected, "lastName Text Field is not Selected");

		// Verifying that lastName Text Field is Enabled or not
		boolean isEnabledlastNameField = lastName.isEnabled();
		assertTrue(isEnabledlastNameField);

		// Verifying the Placeholder which is present in lastName text field.
		String displayedTextInlastName = lastName.getAttribute("placeholder");

		String expected_placeholder_in_lastName = "Enter Last Name";

		assertEquals(displayedTextInlastName, expected_placeholder_in_lastName);
		lastName.clear();
		lastName.sendKeys(lN);

		// Verify that department Field is Displayed or not
		boolean isDisableddepartmentFieldn = !department.isDisplayed();
		assertFalse(isDisableddepartmentFieldn);

		// Verify that department Field is clickable or not
		WebElement departmentFieldFocusedElement = driver.switchTo().activeElement();
		boolean departmentFieldIsSelected = departmentFieldFocusedElement.equals(department);
		assertFalse(departmentFieldIsSelected, "department Text Field is not Selected");

		// Verifying that department Text Field is Enabled or not
		boolean isEnableddepartmentField = department.isEnabled();
		assertTrue(isEnableddepartmentField);

		department.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", departmentSelect);

		// Verify that email1 Field is Displayed or not
		boolean isDisabledemail1Fieldn = !email1.isDisplayed();
		assertFalse(isDisabledemail1Fieldn);

		// Verify that email1 Field is clickable or not
		WebElement email1FieldFocusedElement = driver.switchTo().activeElement();
		boolean email1FieldIsSelected = email1FieldFocusedElement.equals(email1);
		assertFalse(email1FieldIsSelected, "email1 Text Field is not Selected");

		// Verifying that email1 Text Field is Enabled or not
		boolean isEnabledemail1Field = email1.isEnabled();
		assertTrue(isEnabledemail1Field);

		// Verifying the Placeholder which is present in email1 text field.
		String displayedTextInemail1 = email1.getAttribute("placeholder");

		String expected_placeholder_in_email1 = "Email";

		assertEquals(displayedTextInemail1, expected_placeholder_in_email1);
		email1.clear();
		email1.sendKeys(eml1);

		executor.executeScript("arguments[0].click();", update);

		// **********************//

//RelatedCompanyLink

		executor.executeScript("arguments[0].click();", releatedCustomerLink);
		executor.executeScript("arguments[0].click();", releadtedLinkTable);

		// Verify that company Field is Displayed or not
		boolean isDisabledcompanyFieldn = !customer.isDisplayed();
		assertFalse(isDisabledcompanyFieldn);

		// Verify that company Field is clickable or not
		WebElement companyFieldFocusedElement = driver.switchTo().activeElement();
		boolean companyFieldIsSelected = companyFieldFocusedElement.equals(customer);
		assertFalse(companyFieldIsSelected, "company Text Field is not Selected");

		// Verifying that company Text Field is Enabled or not
		boolean isEnabledcompanyField = customer.isEnabled();
		assertTrue(isEnabledcompanyField);

		customer.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", customerSelect);

		// Verify that natureOfRelationship Field is Displayed or not
		boolean isDisablednatureOfRelationshipFieldn = !natureOfRelationship.isDisplayed();
		assertFalse(isDisablednatureOfRelationshipFieldn);

		// Verify that natureOfRelationship Field is clickable or not
		WebElement natureOfRelationshipFieldFocusedElement = driver.switchTo().activeElement();
		boolean natureOfRelationshipFieldIsSelected = natureOfRelationshipFieldFocusedElement
				.equals(natureOfRelationship);
		assertFalse(natureOfRelationshipFieldIsSelected, "natureOfRelationship Text Field is not Selected");

		// Verifying that natureOfRelationship Text Field is Enabled or not
		boolean isEnablednatureOfRelationshipField = natureOfRelationship.isEnabled();
		assertTrue(isEnablednatureOfRelationshipField);

		natureOfRelationship.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", natureOfRelationshipSelect);
		executor.executeScript("arguments[0].click();", update);

//Addressess		
		executor.executeScript("arguments[0].click();", addresses);

		executor.executeScript("arguments[0].click();", addressesTable);

		// Verify that poAddress Field is Displayed or not
		boolean isDisabledpoAddressFieldn = !billToAddress.isDisplayed();
		assertFalse(isDisabledpoAddressFieldn);

		// Verify that poAddress Field is clickable or not
		WebElement poAddressFieldFocusedElement = driver.switchTo().activeElement();
		boolean poAddressFieldIsSelected = poAddressFieldFocusedElement.equals(billToAddress);
		assertFalse(poAddressFieldIsSelected, "poAddress Text Field is not Selected");

		// Verifying that poAddress Text Field is Enabled or not
		boolean isEnabledpoAddressField = billToAddress.isEnabled();
		assertTrue(isEnabledpoAddressField);

		// Verifying the Placeholder which is present in poAddress text field.
		String displayedTextInpoAddress = billToAddress.getAttribute("placeholder");

		String expected_placeholder_in_poAddress = "Enter Invoice Address";

		assertEquals(displayedTextInpoAddress, expected_placeholder_in_poAddress);
		billToAddress.clear();
		billToAddress.sendKeys(addrs);

		// Verify that gstnNum Field is Displayed or not
		boolean isDisabledgstnNumFieldn = !gstnNum.isDisplayed();
		assertFalse(isDisabledgstnNumFieldn);

		// Verifying that gstnNum Text Field is Enabled or not
		boolean isEnabledgstnNumField = gstnNum.isEnabled();
		assertTrue(isEnabledgstnNumField);

		// Verifying the Placeholder which is present in gstnNum text field.
		String displayedTextIngstnNum = gstnNum.getAttribute("placeholder");

		String expected_placeholder_in_gstnNum = "GSTN Number";

		assertEquals(displayedTextIngstnNum, expected_placeholder_in_gstnNum);
		gstnNum.clear();
		gstnNum.sendKeys(gst);

		// Verify that panNum Field is Displayed or not
		boolean isDisabledpanNumFieldn = !panNum.isDisplayed();
		assertFalse(isDisabledpanNumFieldn);

		// Verify that panNum Field is clickable or not
		WebElement panNumFieldFocusedElement = driver.switchTo().activeElement();
		boolean panNumFieldIsSelected = panNumFieldFocusedElement.equals(panNum);
		assertFalse(panNumFieldIsSelected, "panNum Text Field is not Selected");

		// Verifying that panNum Text Field is Enabled or not
		boolean isEnabledpanNumField = panNum.isEnabled();
		assertTrue(isEnabledpanNumField);

		// Verifying the Placeholder which is present in panNum text field.
		String displayedTextInpanNum = panNum.getAttribute("placeholder");

		String expected_placeholder_in_panNum = "PAN Number";

		assertEquals(displayedTextInpanNum, expected_placeholder_in_panNum);
		panNum.clear();
		panNum.sendKeys(pan);

		update.click();

//Shipping Address

		executor.executeScript("arguments[0].click();", shippingAddress);

		executor.executeScript("arguments[0].click();", shippingAddressTable);

		// Verify that shipToAddress Field is Displayed or not
		boolean isDisabledshipToAddressFieldn = !shipToAddress.isDisplayed();
		assertFalse(isDisabledshipToAddressFieldn);

		// Verify that shipToAddress Field is clickable or not
		WebElement shipToAddressFieldFocusedElement = driver.switchTo().activeElement();
		boolean shipToAddressFieldIsSelected = shipToAddressFieldFocusedElement.equals(shipToAddress);
		assertFalse(shipToAddressFieldIsSelected, "shipToAddress Text Field is not Selected");

		// Verifying that shipToAddress Text Field is Enabled or not
		boolean isEnabledshipToAddressField = shipToAddress.isEnabled();
		assertTrue(isEnabledshipToAddressField);

		// Verifying the Placeholder which is present in shipToAddress text field.
		String displayedTextInshipToAddress = shipToAddress.getAttribute("placeholder");

		String expected_placeholder_in_shipToAddress = "Enter Shipping Address";

		assertEquals(displayedTextInshipToAddress, expected_placeholder_in_shipToAddress);
		shipToAddress.clear();
		shipToAddress.sendKeys("TEST Shipping Address");

		// Verify that googlePinLocation Field is Displayed or not
		boolean isDisabledgooglePinLocationFieldn = !googlePinLocation.isDisplayed();
		assertFalse(isDisabledgooglePinLocationFieldn);

		// Verify that googlePinLocation Field is clickable or not
		WebElement googlePinLocationFieldFocusedElement = driver.switchTo().activeElement();
		boolean googlePinLocationFieldIsSelected = googlePinLocationFieldFocusedElement.equals(googlePinLocation);
		assertFalse(googlePinLocationFieldIsSelected, "googlePinLocation Text Field is not Selected");

		// Verifying that googlePinLocation Text Field is Enabled or not
		boolean isEnabledgooglePinLocationField = googlePinLocation.isEnabled();
		assertTrue(isEnabledgooglePinLocationField);

		// Verifying the Placeholder which is present in googlePinLocation text field.
		String displayedTextIngooglePinLocation = googlePinLocation.getAttribute("placeholder");

		String expected_placeholder_in_googlePinLocation = "Google Pin Location";

		assertEquals(displayedTextIngooglePinLocation, expected_placeholder_in_googlePinLocation);
		googlePinLocation.clear();
		googlePinLocation.sendKeys("TEST Google Pin Location");

		executor.executeScript("arguments[0].click();", update);

//Banking

		executor.executeScript("arguments[0].click();", banking);

		// Verify that bankName1 Field is Displayed or not
		boolean isDisabledbankName1Fieldn = !bankName.isDisplayed();
		assertFalse(isDisabledbankName1Fieldn);

		// Verify that bankName1 Field is clickable or not
		WebElement bankName1FieldFocusedElement = driver.switchTo().activeElement();
		boolean bankName1FieldIsSelected = bankName1FieldFocusedElement.equals(bankName);
		assertFalse(bankName1FieldIsSelected, "bankName1 Text Field is not Selected");

		// Verifying that bankName1 Text Field is Enabled or not
		boolean isEnabledbankName1Field = bankName.isEnabled();
		assertTrue(isEnabledbankName1Field);

		bankName.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", bankNameSelect);

		// Verify that branch Field is Displayed or not
		boolean isDisabledbranchFieldn = !branch.isDisplayed();
		assertFalse(isDisabledbranchFieldn);

		// Verify that branch Field is clickable or not
		WebElement branchFieldFocusedElement = driver.switchTo().activeElement();
		boolean branchFieldIsSelected = branchFieldFocusedElement.equals(branch);
		assertFalse(branchFieldIsSelected, "branch Text Field is not Selected");

		// Verifying that branch Text Field is Enabled or not
		boolean isEnabledbranchField = branch.isEnabled();
		assertTrue(isEnabledbranchField);

		// Verifying the Placeholder which is present in branch text field.
		String displayedTextInbranch = branch.getAttribute("placeholder");

		String expected_placeholder_in_branch = "Enter Branch";

		assertEquals(displayedTextInbranch, expected_placeholder_in_branch);
		branch.clear();
		branch.sendKeys(brch);

		// Verify that accountNum Field is Displayed or not
		boolean isDisabledaccountNumFieldn = !accountNumber.isDisplayed();
		assertFalse(isDisabledaccountNumFieldn);

		// Verify that accountNum Field is clickable or not
		WebElement accountNumFieldFocusedElement = driver.switchTo().activeElement();
		boolean accountNumFieldIsSelected = accountNumFieldFocusedElement.equals(accountNumber);
		assertFalse(accountNumFieldIsSelected, "accountNum Text Field is not Selected");

		// Verifying that accountNum Text Field is Enabled or not
		boolean isEnabledaccountNumField = accountNumber.isEnabled();
		assertTrue(isEnabledaccountNumField);

		// Verifying the Placeholder which is present in accountNum text field.
		String displayedTextInaccountNum = accountNumber.getAttribute("placeholder");

		String expected_placeholder_in_accountNum = "Enter Account Number";

		assertEquals(displayedTextInaccountNum, expected_placeholder_in_accountNum);
		accountNumber.clear();
		accountNumber.sendKeys(account);

		// Verify that ifscCode Field is Displayed or not
		boolean isDisabledifscCodeFieldn = !ifscCode.isDisplayed();
		assertFalse(isDisabledifscCodeFieldn);

		// Verify that ifscCode Field is clickable or not
		WebElement ifscCodeFieldFocusedElement = driver.switchTo().activeElement();
		boolean ifscCodeFieldIsSelected = ifscCodeFieldFocusedElement.equals(ifscCode);
		assertFalse(ifscCodeFieldIsSelected, "ifscCode Text Field is not Selected");

		// Verifying that ifscCode Text Field is Enabled or not
		boolean isEnabledifscCodeField = ifscCode.isEnabled();
		assertTrue(isEnabledifscCodeField);

		// Verifying the Placeholder which is present in ifscCode text field.
		String displayedTextInifscCode = ifscCode.getAttribute("placeholder");

		String expected_placeholder_in_ifscCode = "Enter IFSC Code";

		assertEquals(displayedTextInifscCode, expected_placeholder_in_ifscCode);
		ifscCode.clear();
		ifscCode.sendKeys(ifsc);

		// Verify that switchCode Field is Displayed or not
		boolean isDisabledswitchCodeFieldn = !switchCode.isDisplayed();
		assertFalse(isDisabledswitchCodeFieldn);

		// Verify that switchCode Field is clickable or not
		WebElement switchCodeFieldFocusedElement = driver.switchTo().activeElement();
		boolean switchCodeFieldIsSelected = switchCodeFieldFocusedElement.equals(switchCode);
		assertFalse(switchCodeFieldIsSelected, "switchCode Text Field is not Selected");

		// Verifying that switchCode Text Field is Enabled or not
		boolean isEnabledswitchCodeField = switchCode.isEnabled();
		assertTrue(isEnabledswitchCodeField);

		// Verifying the Placeholder which is present in switchCode text field.
		String displayedTextInswitchCode = switchCode.getAttribute("placeholder");

		String expected_placeholder_in_switchCode = "Enter Swift Code";

		assertEquals(displayedTextInswitchCode, expected_placeholder_in_switchCode);
		switchCode.clear();
		switchCode.sendKeys(swtch);

		// Verify that ibanCode Field is Displayed or not
		boolean isDisabledibanCodeFieldn = !ibanCode.isDisplayed();
		assertFalse(isDisabledibanCodeFieldn);

		// Verify that ibanCode Field is clickable or not
		WebElement ibanCodeFieldFocusedElement = driver.switchTo().activeElement();
		boolean ibanCodeFieldIsSelected = ibanCodeFieldFocusedElement.equals(ibanCode);
		assertFalse(ibanCodeFieldIsSelected, "ibanCode Text Field is not Selected");

		// Verifying that ibanCode Text Field is Enabled or not
		boolean isEnabledibanCodeField = ibanCode.isEnabled();
		assertTrue(isEnabledibanCodeField);

		// Verifying the Placeholder which is present in ibanCode text field.
		String displayedTextInibanCode = ibanCode.getAttribute("placeholder");

		String expected_placeholder_in_ibanCode = "Enter IBAN Code";

		assertEquals(displayedTextInibanCode, expected_placeholder_in_ibanCode);
		ibanCode.clear();
		ibanCode.sendKeys(Iban);

		executor.executeScript("arguments[0].click();", addBanking);

//Dispatch

		executor.executeScript("arguments[0].click();", dispatch);

		executor.executeScript("arguments[0].click();", partialDispatch);

		// Verify that partialDispatch Field is Displayed or not
		boolean isDisabledpartialDispatch = partialDispatch.isDisplayed();
		assertTrue(isDisabledpartialDispatch);

		executor.executeScript("arguments[0].click();", dropShipment);

		// Verify that dropShipment Field is Displayed or not
		boolean isDisableddropShipment = dropShipment.isDisplayed();
		assertTrue(isDisableddropShipment);

		// Verify that packingInstructions Field is Displayed or not
		boolean isDisabledpackingInstructionsFieldn = packingInstructions.isDisplayed();
		assertTrue(isDisabledpackingInstructionsFieldn);

//				//Verify that  packingInstructions Field is clickable or not
//					WebElement packingInstructionsFieldFocusedElement = driver.switchTo().activeElement();
//					
//				assertFalse(packingInstructionsFieldFocusedElement, "packingInstructions Text Field is not Selected");

		// Verifying that packingInstructions Text Field is Enabled or not
		boolean isEnabledpackingInstructionsField = packingInstructions.isEnabled();
		assertTrue(isEnabledpackingInstructionsField);

		packingInstructions.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", packingInstructionsSelect);

		// Verify that shipmentInstructions1 Field is Displayed or not
		boolean isDisabledshipmentInstructions1Fieldn = shipmentInstructions1.isDisplayed();
		assertTrue(isDisabledshipmentInstructions1Fieldn);

		// Verify that shipmentInstructions1 Field is clickable or not
		WebElement shipmentInstructions1FieldFocusedElement = driver.switchTo().activeElement();
		boolean shipmentInstructions1FieldIsSelected = shipmentInstructions1FieldFocusedElement
				.equals(shipmentInstructions1);
		assertFalse(shipmentInstructions1FieldIsSelected, "shipmentInstructions1 Text Field is not Selected");

		// Verifying that shipmentInstructions1 Text Field is Enabled or not
		boolean isEnabledshipmentInstructions1Field = shipmentInstructions1.isEnabled();
		assertTrue(isEnabledshipmentInstructions1Field);

		// Verifying the Placeholder which is present in shipmentInstructions1 text
		// field.
		String displayedTextInshipmentInstructions1 = shipmentInstructions1.getAttribute("placeholder");

		String expected_placeholder_in_shipmentInstructions1 = "Enter Special Instruction";

		assertEquals(displayedTextInshipmentInstructions1, expected_placeholder_in_shipmentInstructions1);
		shipmentInstructions1.clear();
		shipmentInstructions1.sendKeys("TEST shipmentInstructions");

		executor.executeScript("arguments[0].click();", podReq);

		// Verify that podReq Field is Displayed or not
		boolean isDisabledpodReq = podReq.isDisplayed();
		assertTrue(isDisabledpodReq);

		// Verify that shipmentInstructions Field is Displayed or not
		boolean isDisabledshipmentInstructionsFieldn = shipmentInstructions.isDisplayed();
		assertTrue(isDisabledshipmentInstructionsFieldn);

		// Verify that shipmentInstructions Field is clickable or not
		WebElement shipmentInstructionsFieldFocusedElement = driver.switchTo().activeElement();
		boolean shipmentInstructionsFieldIsSelected = shipmentInstructionsFieldFocusedElement
				.equals(shipmentInstructions);
		assertFalse(shipmentInstructionsFieldIsSelected, "shipmentInstructions Text Field is not Selected");

		// Verifying that shipmentInstructions Text Field is Enabled or not
		boolean isEnabledshipmentInstructionsField = shipmentInstructions.isEnabled();
		assertTrue(isEnabledshipmentInstructionsField);

		shipmentInstructions.sendKeys(Keys.ENTER);
		shipmentInstructions.sendKeys(Keys.ENTER);

		// Verify that preferredFreightForwarder1 Field is Displayed or not
		boolean isDisabledpreferredFreightForwarder1Fieldn = preferredFreightForwarder1.isDisplayed();
		assertTrue(isDisabledpreferredFreightForwarder1Fieldn);

		// Verify that preferredFreightForwarder1 Field is clickable or not
		WebElement preferredFreightForwarder1FieldFocusedElement = driver.switchTo().activeElement();
		boolean preferredFreightForwarder1FieldIsSelected = preferredFreightForwarder1FieldFocusedElement
				.equals(preferredFreightForwarder1);
		assertFalse(preferredFreightForwarder1FieldIsSelected, "preferredFreightForwarder1 Text Field is not Selected");

		// Verifying that preferredFreightForwarder1 Text Field is Enabled or not
		boolean isEnabledpreferredFreightForwarder1Field = preferredFreightForwarder1.isEnabled();
		assertTrue(isEnabledpreferredFreightForwarder1Field);

		preferredFreightForwarder1.sendKeys(Keys.ENTER);
		preferredFreightForwarder1.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
//Terms

		executor.executeScript("arguments[0].click();", terms);

		// Verify that advance Field is Displayed or not
		boolean isDisabledadvanceFieldn = !advance.isDisplayed();
		assertFalse(isDisabledadvanceFieldn);

		// Verify that advance Field is clickable or not
		WebElement advanceFieldFocusedElement = driver.switchTo().activeElement();
		boolean advanceFieldIsSelected = advanceFieldFocusedElement.equals(advance);
		assertFalse(advanceFieldIsSelected, "advance Text Field is not Selected");

		// Verifying that advance Text Field is Enabled or not
		boolean isEnabledadvanceField = advance.isEnabled();
		assertTrue(isEnabledadvanceField);

		// Verifying the Placeholder which is present in advance text field.
		String displayedTextInadvance = advance.getAttribute("placeholder");

		String expected_placeholder_in_advance = "Enter Advance (%)";

		assertEquals(displayedTextInadvance, expected_placeholder_in_advance);
		advance.clear();
		advance.sendKeys(adv);

		// Verify that paymentTerms Field is Displayed or not
		boolean isDisabledpaymentTermsFieldn = !paymentTerms.isDisplayed();
		assertFalse(isDisabledpaymentTermsFieldn);

		// Verify that paymentTerms Field is clickable or not
		WebElement paymentTermsFieldFocusedElement = driver.switchTo().activeElement();
		boolean paymentTermsFieldIsSelected = paymentTermsFieldFocusedElement.equals(paymentTerms);
		assertFalse(paymentTermsFieldIsSelected, "paymentTerms Text Field is not Selected");

		// Verifying that paymentTerms Text Field is Enabled or not
		boolean isEnabledpaymentTermsField = paymentTerms.isEnabled();
		assertTrue(isEnabledpaymentTermsField);

		paymentTerms.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", paymentTermsSelect);

		// Verify that incoTerms Field is Displayed or not
		boolean isDisabledincoTermsFieldn = !incoTerm.isDisplayed();
		assertFalse(isDisabledincoTermsFieldn);

		// Verify that incoTerms Field is clickable or not
		WebElement incoTermsFieldFocusedElement = driver.switchTo().activeElement();
		boolean incoTermsFieldIsSelected = incoTermsFieldFocusedElement.equals(incoTerm);
		assertFalse(incoTermsFieldIsSelected, "incoTerms Text Field is not Selected");

		// Verifying that incoTerms Text Field is Enabled or not
		boolean isEnabledincoTermsField = incoTerm.isEnabled();
		assertTrue(isEnabledincoTermsField);

		incoTerm.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", incoTermSelect);

		// Verify that specialTerms Field is Displayed or not
		boolean isDisabledspecialTermsFieldn = !specialTerms.isDisplayed();
		assertFalse(isDisabledspecialTermsFieldn);

		// Verify that specialTerms Field is clickable or not
		WebElement specialTermsFieldFocusedElement = driver.switchTo().activeElement();
		boolean specialTermsFieldIsSelected = specialTermsFieldFocusedElement.equals(specialTerms);
		assertFalse(specialTermsFieldIsSelected, "specialTerms Text Field is not Selected");

		// Verifying that specialTerms Text Field is Enabled or not
		boolean isEnabledspecialTermsField = specialTerms.isEnabled();
		assertTrue(isEnabledspecialTermsField);

		// Verifying the Placeholder which is present in specialTerms text field.
		String displayedTextInspecialTerms = specialTerms.getAttribute("placeholder");

		String expected_placeholder_in_specialTerms = "Enter Special Terms";

		assertEquals(displayedTextInspecialTerms, expected_placeholder_in_specialTerms);
		specialTerms.clear();
		specialTerms.sendKeys(specialtms);

//		
//WebElement loApplicable = driver.findElement(By.xpath("(//span)[60]"));
//		executor.executeScript("arguments[0].click();", loApplicable);
//		
//		
//WebElement loApplicableTextField = driver.findElement(By.xpath("(//input[@placeholder='Enter LD Applicable'])[1]"));
//		
//
//		//Verify that  loApplicable Field is clickable or not
//		WebElement loApplicableFieldFocusedElement = driver.switchTo().activeElement();
//		boolean loApplicableFieldIsSelected = loApplicableFieldFocusedElement.equals(loApplicableTextField);
//		assertFalse(loApplicableFieldIsSelected, "loApplicable Text Field is not Selected");
//      
//		//Verifying that loApplicable Text Field is Enabled or not
//		boolean isEnabledloApplicableField = loApplicableTextField.isEnabled();
//		assertTrue(isEnabledloApplicableField);
//		
//		//Verifying the Placeholder which is present in loApplicable text field.
//		String displayedTextInloApplicable = loApplicableTextField.getAttribute("placeholder");
//		
//		String expected_placeholder_in_loApplicable = "Enter LD Applicable";
//		
//		assertEquals(displayedTextInloApplicable, expected_placeholder_in_loApplicable);
//		
//		loApplicableTextField.sendKeys("TEST Lo Applicable");
//		
//WebElement sourceInspection = driver.findElement(By.xpath("(//span)[61]"));
//		executor.executeScript("arguments[0].click();", sourceInspection);
//		
//		//Verify that  sourceInspection Field is Displayed or not
//		boolean isDisabledsourceInspection = sourceInspection.isDisplayed(); 
//		assertTrue(isDisabledsourceInspection);
//
//WebElement sourceInspectionTextField = driver.findElement(By.xpath("(//input[@placeholder='Enter Source Inspection'])[1]"));
//		
//
//		//Verify that  sourceInspectionTextField Field is clickable or not
//		WebElement sourceInspectionTextFieldFieldFocusedElement = driver.switchTo().activeElement();
//		boolean sourceInspectionTextFieldFieldIsSelected = sourceInspectionTextFieldFieldFocusedElement.equals(sourceInspectionTextField);
//		assertFalse(sourceInspectionTextFieldFieldIsSelected, "sourceInspectionTextField Text Field is not Selected");
//      
//		//Verifying that sourceInspectionTextField Text Field is Enabled or not
//		boolean isEnabledsourceInspectionTextFieldField = sourceInspectionTextField.isEnabled();
//		assertTrue(isEnabledsourceInspectionTextFieldField);
//		
//		//Verifying the Placeholder which is present in sourceInspectionTextField text field.
//		String displayedTextInsourceInspectionTextField = sourceInspectionTextField.getAttribute("placeholder");
//		
//		String expected_placeholder_in_sourceInspectionTextField = "Enter Source Inspection";
//		
//		assertEquals(displayedTextInsourceInspectionTextField, expected_placeholder_in_sourceInspectionTextField);
//		
//		sourceInspectionTextField.sendKeys("TEST Source Inspection");

//Satutory

		executor.executeScript("arguments[0].click();", statutory);

		executor.executeScript("arguments[0].click();", incorporation);

		// Verify that incorporation Field is Displayed or not
		boolean isDisabledincorporation = !incorporation.isDisplayed();
		assertFalse(isDisabledincorporation);

		executor.executeScript("arguments[0].click();", tin);

		// Verify that tin Field is Displayed or not
		boolean isDisabledtin = !tin.isDisplayed();
		assertFalse(isDisabledtin);

		executor.executeScript("arguments[0].click();", gst1);

		executor.executeScript("arguments[0].click();", iec);

		// Verify that iec Field is Displayed or not
		boolean isDisablediec = !iec.isDisplayed();
		assertFalse(isDisablediec);

		executor.executeScript("arguments[0].click();", pan1);

		// Verify that pan Field is Displayed or not
		boolean isDisabledpan = !pan1.isDisplayed();
		assertFalse(isDisabledpan);

		executor.executeScript("arguments[0].click();", udhyamCertificate);

		// Verify that preferredFreightForwarder Field is Displayed or not
		boolean isDisabledudhyamCertificate = !incorporation.isDisplayed();
		assertFalse(isDisabledudhyamCertificate);

		executor.executeScript("arguments[0].click();", msme);

		// Verify that pan Field is Displayed or not
		boolean isDisabledmsme = !msme.isDisplayed();
		assertFalse(isDisabledmsme);

////CertificatesDocs
//		
//		executor.executeScript("arguments[0].click();", certifications);
//
//		executor.executeScript("arguments[0].click();", iso);
//		
//		//Verify that  pan Field is Displayed or not
//		boolean isDisablediso = !iso.isDisplayed(); 
//		assertFalse(isDisablediso);
//		
//		executor.executeScript("arguments[0].click();", as);
//		
//		//Verify that  pan Field is Displayed or not
//		boolean isDisabledas = !as.isDisplayed(); 
//		assertFalse(isDisabledas);
//		
//		executor.executeScript("arguments[0].click();", medical);
//		
//		//Verify that  pan Field is Displayed or not
//		boolean isDisabledmedical = !medical.isDisplayed(); 
//		assertFalse(isDisabledmedical);
//		
//		executor.executeScript("arguments[0].click();", nadcap);
//		
//		//Verify that  pan Field is Displayed or not
//		boolean isDisablednadcap = !nadcap.isDisplayed(); 
//		assertFalse(isDisablednadcap);
//		

		executor.executeScript("arguments[0].click();", details);

		// Verify that turnOver Field is Displayed or not
		boolean isDisabledturnOverFieldn = !turnOver.isDisplayed();
		assertFalse(isDisabledturnOverFieldn);

		// Verify that turnOver Field is clickable or not
		WebElement turnOverFieldFocusedElement = driver.switchTo().activeElement();
		boolean turnOverFieldIsSelected = turnOverFieldFocusedElement.equals(turnOver);
		assertFalse(turnOverFieldIsSelected, "turnOver Text Field is not Selected");

		// Verifying that turnOver Text Field is Enabled or not
		boolean isEnabledturnOverField = turnOver.isEnabled();
		assertTrue(isEnabledturnOverField);

		// Verifying the Placeholder which is present in turnOver text field.
		String displayedTextInturnOver = turnOver.getAttribute("placeholder");

		String expected_placeholder_in_turnOver = "Enter Turn Over (3 Years)";

		assertEquals(displayedTextInturnOver, expected_placeholder_in_turnOver);
		turnOver.clear();
		turnOver.sendKeys(turnovr);

		// Verify that dnbNumber Field is Displayed or not
		boolean isDisableddnbNumberFieldn = !dnbNumber.isDisplayed();
		assertFalse(isDisableddnbNumberFieldn);

		// Verify that dnbNumber Field is clickable or not
		WebElement dnbNumberFieldFocusedElement = driver.switchTo().activeElement();
		boolean dnbNumberFieldIsSelected = dnbNumberFieldFocusedElement.equals(dnbNumber);
		assertFalse(dnbNumberFieldIsSelected, "dnbNumber Text Field is not Selected");

		// Verifying that dnbNumber Text Field is Enabled or not
		boolean isEnableddnbNumberField = dnbNumber.isEnabled();
		assertTrue(isEnableddnbNumberField);

		// Verifying the Placeholder which is present in dnbNumber text field.
		String displayedTextIndnbNumber = dnbNumber.getAttribute("placeholder");

		String expected_placeholder_in_dnbNumber = "Enter DNB (Hoovers) Number";

		assertEquals(displayedTextIndnbNumber, expected_placeholder_in_dnbNumber);

		dnbNumber.clear();
		dnbNumber.sendKeys(dnb);

		// Verify that icra Field is Displayed or not
		boolean isDisabledicraFieldn = !icra.isDisplayed();
		assertFalse(isDisabledicraFieldn);

		// Verify that icra Field is clickable or not
		WebElement icraFieldFocusedElement = driver.switchTo().activeElement();
		boolean icraFieldIsSelected = icraFieldFocusedElement.equals(icra);
		assertFalse(icraFieldIsSelected, "icra Text Field is not Selected");

		// Verifying that icra Text Field is Enabled or not
		boolean isEnabledicraField = icra.isEnabled();
		assertTrue(isEnabledicraField);

		// Verifying the Placeholder which is present in icra text field.
		String displayedTextInicra = icra.getAttribute("placeholder");

		String expected_placeholder_in_icra = "Enter ICRA";

		assertEquals(displayedTextInicra, expected_placeholder_in_icra);

		icra.clear();
		icra.sendKeys(icr);
//		
//		executor.executeScript("arguments[0].click();", headCount2);
//		
//		driver.findElement(By.xpath("(//span[normalize-space()='10'])[1]")).click();;
//
//		//Verify that  headcount Field is clickable or not
//		WebElement headcountFieldFocusedElement = driver.switchTo().activeElement();
//		boolean headcountFieldIsSelected = headcountFieldFocusedElement.equals(enterHeadCount);
//		assertFalse(headcountFieldIsSelected, "headcount Text Field is not Selected");
//      
//		//Verifying that headcount Text Field is Enabled or not
//		boolean isEnabledheadcountField = enterHeadCount.isEnabled();
//		assertTrue(isEnabledheadcountField);
//		
//		//Verifying the Placeholder which is present in headcount text field.
//		String displayedTextInheadcount = enterHeadCount.getAttribute("placeholder");
//		
//		String expected_placeholder_in_headcount = "Enter Head Count";
//		
//		assertEquals(displayedTextInheadcount, expected_placeholder_in_headcount);
//		
//		enterHeadCount.clear();
//		enterHeadCount.sendKeys(headcount);
//	
//		
//
//      
//		//Verifying that skill Text Field is Enabled or not
//		boolean isEnabledskillField = enterskill.isEnabled();
//		assertTrue(isEnabledskillField);
//		
//		//Verifying the Placeholder which is present in skill text field.
//		String displayedTextInskill = enterskill.getAttribute("placeholder");
//		
//		String expected_placeholder_in_skill = "Skill/Dept";
//		
//		assertEquals(displayedTextInskill, expected_placeholder_in_skill);
//		enterskill.clear();
//		enterskill.sendKeys(skill);
//		
//		
//
//      
//		//Verifying that numOfPeople Text Field is Enabled or not
//		boolean isEnablednumOfPeopleField = noOfPeople.isEnabled();
//		assertTrue(isEnablednumOfPeopleField);
//		
//		//Verifying the Placeholder which is present in numOfPeople text field.
//		String displayedTextInnumOfPeople = noOfPeople.getAttribute("placeholder");
//		
//		String expected_placeholder_in_numOfPeople = "Qty";
//		
//		assertEquals(displayedTextInnumOfPeople, expected_placeholder_in_numOfPeople);
//		noOfPeople.clear();
//		noOfPeople.sendKeys(people);
//		
//		executor.executeScript("arguments[0].click();", update);

		// Verify that capacity Field is Displayed or not
		boolean isDisabledcapacityFieldn = !capacity.isDisplayed();
		assertFalse(isDisabledcapacityFieldn);

		// Verify that capacity Field is clickable or not
		WebElement capacityFieldFocusedElement = driver.switchTo().activeElement();
		boolean capacityFieldIsSelected = capacityFieldFocusedElement.equals(capacity);
		assertFalse(capacityFieldIsSelected, "capacity Text Field is not Selected");

		// Verifying that capacity Text Field is Enabled or not
		boolean isEnabledcapacityField = capacity.isEnabled();
		assertTrue(isEnabledcapacityField);

		// Verifying the Placeholder which is present in capacity text field.
		String displayedTextIncapacity = capacity.getAttribute("placeholder");

		String expected_placeholder_in_capacity = "Enter Capacity";

		assertEquals(displayedTextIncapacity, expected_placeholder_in_capacity);
		capacity.clear();
		capacity.sendKeys(cacp);

		// Verify that floorSpace Field is Displayed or not
		boolean isDisabledfloorSpaceFieldn = !floorSpace.isDisplayed();
		assertFalse(isDisabledfloorSpaceFieldn);

		// Verify that floorSpace Field is clickable or not
		WebElement floorSpaceFieldFocusedElement = driver.switchTo().activeElement();
		boolean floorSpaceFieldIsSelected = floorSpaceFieldFocusedElement.equals(floorSpace);
		assertFalse(floorSpaceFieldIsSelected, "floorSpace Text Field is not Selected");

		// Verifying that floorSpace Text Field is Enabled or not
		boolean isEnabledfloorSpaceField = floorSpace.isEnabled();
		assertTrue(isEnabledfloorSpaceField);

		// Verifying the Placeholder which is present in floorSpace text field.
		String displayedTextInfloorSpace = floorSpace.getAttribute("placeholder");

		String expected_placeholder_in_floorSpace = "Enter Floor Space";

		assertEquals(displayedTextInfloorSpace, expected_placeholder_in_floorSpace);
		floorSpace.clear();
		floorSpace.sendKeys(floor);

		// Verify that machine Field is Displayed or not
		boolean isDisabledmachineFieldn = !machine.isDisplayed();
		assertFalse(isDisabledmachineFieldn);

		// Verify that machine Field is clickable or not
		WebElement machineFieldFocusedElement = driver.switchTo().activeElement();
		boolean machineFieldIsSelected = machineFieldFocusedElement.equals(machine);
		assertFalse(machineFieldIsSelected, "machine Text Field is not Selected");

		// Verifying that machine Text Field is Enabled or not
		boolean isEnabledmachineField = machine.isEnabled();
		assertTrue(isEnabledmachineField);

		// Verifying the Placeholder which is present in machine text field.
		String displayedTextInmachine = machine.getAttribute("placeholder");

		String expected_placeholder_in_machine = "Enter Machine";

		assertEquals(displayedTextInmachine, expected_placeholder_in_machine);
		machine.clear();
		machine.sendKeys(machine1);

		// Verify that toolsAndEquip Field is Displayed or not
		boolean isDisabledtoolsAndEquipFieldn = !toolsAndEquip.isDisplayed();
		assertFalse(isDisabledtoolsAndEquipFieldn);

		// Verify that toolsAndEquip Field is clickable or not
		WebElement toolsAndEquipFieldFocusedElement = driver.switchTo().activeElement();
		boolean toolsAndEquipFieldIsSelected = toolsAndEquipFieldFocusedElement.equals(toolsAndEquip);
		assertFalse(toolsAndEquipFieldIsSelected, "toolsAndEquip Text Field is not Selected");

		// Verifying that toolsAndEquip Text Field is Enabled or not
		boolean isEnabledtoolsAndEquipField = toolsAndEquip.isEnabled();
		assertTrue(isEnabledtoolsAndEquipField);

		// Verifying the Placeholder which is present in toolsAndEquip text field.
		String displayedTextIntoolsAndEquip = toolsAndEquip.getAttribute("placeholder");

		String expected_placeholder_in_toolsAndEquip = "Enter Tools & Equip";

		assertEquals(displayedTextIntoolsAndEquip, expected_placeholder_in_toolsAndEquip);
		toolsAndEquip.clear();
		toolsAndEquip.sendKeys(tools);

		// Verify that sqft Field is Displayed or not
		boolean isDisabledsqftFieldn = !sqft.isDisplayed();
		assertFalse(isDisabledsqftFieldn);

		// Verify that sqft Field is clickable or not
		WebElement sqftFieldFocusedElement = driver.switchTo().activeElement();
		boolean sqftFieldIsSelected = sqftFieldFocusedElement.equals(sqft);
		assertFalse(sqftFieldIsSelected, "sqft Text Field is not Selected");

		// Verifying that sqft Text Field is Enabled or not
		boolean isEnabledsqftField = sqft.isEnabled();
		assertTrue(isEnabledsqftField);

		// Verifying the Placeholder which is present in sqft text field.
		String displayedTextInsqft = sqft.getAttribute("placeholder");

		String expected_placeholder_in_sqft = "Enter Sqft";

		assertEquals(displayedTextInsqft, expected_placeholder_in_sqft);
		sqft.clear();
		sqft.sendKeys(sqft1);

		// Verify that uom Field is Displayed or not
		boolean isDisableduomFieldn = !uom.isDisplayed();
		assertFalse(isDisableduomFieldn);

		// Verify that uom Field is clickable or not
		WebElement uomFieldFocusedElement = driver.switchTo().activeElement();
		boolean uomFieldIsSelected = uomFieldFocusedElement.equals(uom);
		assertFalse(uomFieldIsSelected, "uom Text Field is not Selected");

		// Verifying that uom Text Field is Enabled or not
		boolean isEnableduomField = uom.isEnabled();
		assertTrue(isEnableduomField);

		uom.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", uomSelect);

		executor.executeScript("arguments[0].click();", erpToggle);

		WebElement esdSetup = driver.findElement(By.xpath("(//input[@value='yes'])[1]"));
		executor.executeScript("arguments[0].click();", esdSetup);

		WebElement hazmatSetup = driver.findElement(By.xpath("(//input[@value='yes'])[2]"));
		executor.executeScript("arguments[0].click();", hazmatSetup);

		executor.executeScript("arguments[0].click();", ospToggle);

		// Company Approval

		executor.executeScript("arguments[0].click();", customerApproval);

		// Verify that scopeOfSupply Field is Displayed or not
		boolean isDisabledscopeOfSupplyFieldn = !scopeOfSupply.isDisplayed();
		assertFalse(isDisabledscopeOfSupplyFieldn);

		// Verify that scopeOfSupply Field is clickable or not
		WebElement scopeOfSupplyFieldFocusedElement = driver.switchTo().activeElement();
		boolean scopeOfSupplyFieldIsSelected = scopeOfSupplyFieldFocusedElement.equals(scopeOfSupply);
		assertFalse(scopeOfSupplyFieldIsSelected, "scopeOfSupply Text Field is not Selected");

		// Verifying that scopeOfSupply Text Field is Enabled or not
		boolean isEnabledscopeOfSupplyField = scopeOfSupply.isEnabled();
		assertTrue(isEnabledscopeOfSupplyField);

		scopeOfSupply.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", scopeOfSupplySelect);

//		//Verify that  companyCategory Field is Displayed or not
//		boolean isDisabledcompanyCategoryFieldn = !companyCategory.isDisplayed(); 
//		assertFalse(isDisabledcompanyCategoryFieldn);
//		
//		//Verify that  companyCategory Field is clickable or not
//			WebElement companyCategoryFieldFocusedElement = driver.switchTo().activeElement();
//		boolean companyCategoryFieldIsSelected = companyCategoryFieldFocusedElement.equals(companyCategory);
//		assertFalse(companyCategoryFieldIsSelected, "companyCategory Text Field is not Selected");
//		  
//		//Verifying that companyCategory Text Field is Enabled or not
//		boolean isEnabledcompanyCategoryField = companyCategory.isEnabled();
//		assertTrue(isEnabledcompanyCategoryField);
//		
//		companyCategory.sendKeys(Keys.ENTER);
//
//
//		executor.executeScript("arguments[0].click();", companyCategorySelect);

		// Verify that basisOfApproval Field is Displayed or not
		boolean isDisabledbasisOfApprovalFieldn = !basisOfApproval.isDisplayed();
		assertFalse(isDisabledbasisOfApprovalFieldn);

		// Verify that basisOfApproval Field is clickable or not
		WebElement basisOfApprovalFieldFocusedElement = driver.switchTo().activeElement();
		boolean basisOfApprovalFieldIsSelected = basisOfApprovalFieldFocusedElement.equals(basisOfApproval);
		assertFalse(basisOfApprovalFieldIsSelected, "basisOfApproval Text Field is not Selected");

		// Verifying that basisOfApproval Text Field is Enabled or not
		boolean isEnabledbasisOfApprovalField = basisOfApproval.isEnabled();
		assertTrue(isEnabledbasisOfApprovalField);

		basisOfApproval.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", basisOfApprovalSelect);

//		executor.executeScript("arguments[0].click();", inventoryItem);
//		
//		//Verify that  inventoryItem Field is Displayed or not
//		boolean isDisabledinventoryItem = inventoryItem.isDisplayed(); 
//		assertTrue(isDisabledinventoryItem);

		// Verify that approvedBy Field is Displayed or not
		boolean isDisabledapprovedBy = approvedBy.isDisplayed();
		assertTrue(isDisabledapprovedBy);

		// Verify that approvedBy Field is clickable or not
		WebElement approvedByFieldFocusedElement = driver.switchTo().activeElement();
		boolean approvedByFieldIsSelected = approvedByFieldFocusedElement.equals(approvedBy);
		assertFalse(approvedByFieldIsSelected, "approvedBy Text Field is not Selected");

		// Verifying that approvedBy Text Field is Enabled or not
		boolean isEnabledapprovedByField = approvedBy.isEnabled();
		assertTrue(isEnabledapprovedByField);

		// Verifying the Placeholder which is present in approvedBy text field.
		String displayedTextInapprovedBy = approvedBy.getAttribute("placeholder");

		String expected_placeholder_in_approvedBy = "Approved By";

		assertEquals(displayedTextInapprovedBy, expected_placeholder_in_approvedBy);
		approvedBy.clear();
		approvedBy.sendKeys(approved);

		executor.executeScript("arguments[0].click();", reaudit);

		// Verify that reaudit Field is Displayed or not
		boolean isDisabledreaudit = reaudit.isDisplayed();
		assertTrue(isDisabledreaudit);

		// Verify that auditFrequency Field is Displayed or not
		boolean isDisabledauditFrequencyFieldn = !auditFrequency.isDisplayed();
		assertFalse(isDisabledauditFrequencyFieldn);

//		//Verify that  auditFrequency Field is clickable or not
//			WebElement auditFrequencyFieldFocusedElement = driver.switchTo().activeElement();
//		boolean auditFrequencyFieldIsSelected = auditFrequencyFieldFocusedElement.equals(auditFrequency);
//		assertFalse(auditFrequencyFieldIsSelected, "auditFrequency Text Field is not Selected");

		// Verifying that auditFrequency Text Field is Enabled or not
		boolean isEnabledauditFrequencyField = auditFrequency.isEnabled();
		assertTrue(isEnabledauditFrequencyField);

		auditFrequency.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", auditFrequencySelect);

		WebElement approvalDate = driver.findElement(By.xpath("(//input[@placeholder='DD-MM-YYYY'])[1]"));

		approvalDate.sendKeys(Keys.ENTER);
		approvalDate.sendKeys(Keys.RIGHT);
		approvalDate.sendKeys(Keys.RIGHT);
		approvalDate.sendKeys(Keys.ENTER);

		// Verifing that do we able to upload files or not.
		WebElement UploadFiles = driver.findElement(By.xpath("(//input[@placeholder='Upload file'])[1]"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", UploadFiles);
		Robot robot = new Robot();
		robot.delay(2000);
		StringSelection stringSelection = new StringSelection(
				"C:\\Users\\W2191\\eclipse-workspace\\Getapcs2\\src\\test\\java\\com\\testcases\\master1\\AALoginFunctionality.java");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

		// Press Enter to open the file dialog

		robot.delay(2000);

		// Press Ctrl+V to paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.delay(2000);
		// Press Enter to confirm the file selection
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement SaveButton = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		SaveButton.sendKeys(Keys.ENTER);

		return new HomePage();
	}
}
