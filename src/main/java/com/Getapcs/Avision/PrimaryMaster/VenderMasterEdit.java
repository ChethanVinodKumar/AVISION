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

public class VenderMasterEdit extends TestBase {

	@FindBy(xpath = "(//input[@placeholder='Enter Vendor Name'])[1]")
	WebElement venderName;

	@FindBy(xpath = "(//input[@placeholder='Enter Vendor Name'])[2]")
	WebElement venderName1;

	@FindBy(xpath = "(//input[@placeholder='Enter Vendor Alias'])[1]")
	WebElement venderAlias;

//General
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement venderType;

	@FindBy(xpath = "(//span[normalize-space()='TEST Vender_Type'])[1]")
	WebElement venderTypeSelect;

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
	WebElement purchaseGroup;

	@FindBy(xpath = "(//span[normalize-space()='TEST Purchase_Group'])[1]")
	WebElement purchaseGroupSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Board No'])[1]")
	WebElement boardNumber;

	@FindBy(xpath = "(//input[@placeholder='Enter Website'])[1]")
	WebElement website;

	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[1]")
	WebElement email;

	@FindBy(xpath = "(//input[@type='text'])[15]")
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
	@FindBy(xpath = "(//input[@type='text'])[13]")
	WebElement shippingMode;

	@FindBy(xpath = "(//span[normalize-space()='BY ROAD'])[1]")
	WebElement shippingModeSelect;

	// Contacts

	@FindBy(xpath = "(//a[normalize-space()='Contacts'])[1]")
	WebElement contacts;

	@FindBy(xpath = "(//td[normalize-space()='Mr'])[1]")
	WebElement contactsTable;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement salutation;

	@FindBy(xpath = "(//span[normalize-space()='Mr'])[1]")
	WebElement salutationSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Call Name'])[1]")
	WebElement callName;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement mobileNumCode;

	@FindBy(xpath = "(//span[normalize-space()='91'])[1]")
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

	@FindBy(xpath = "(//span[normalize-space()='91'])[2]")
	WebElement mobileNumCode1Select;

	@FindBy(xpath = "(//input[@placeholder='Enter Mobile No'])[2]")
	WebElement mobileNum1;

	@FindBy(xpath = "(//input[@placeholder='Extension'])[1]")
	WebElement extension;

	@FindBy(xpath = "(//input[@type='text'])[16]")
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

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement updateContacts;

	// Related Company Link

	@FindBy(xpath = "(//a[normalize-space()='Related Vendor Link'])[1]")
	WebElement relatedVenderCategory;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement vender;

	@FindBy(xpath = "(//span[normalize-space()='Keus Automation Pvt Ltd'])[1]")
	WebElement venderSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement natureOfRelationship;

	@FindBy(xpath = "(//span[normalize-space()='TEST Nature_Of_Relationship'])[1]")
	WebElement natureOfRelationshipSelect;

	// Addresses

	@FindBy(xpath = "(//a[normalize-space()='Addresses'])[1]")
	WebElement addresses;

	@FindBy(xpath = "(//td[@class='active_status_color'])[1]")
	WebElement addressesTable;
	@FindBy(xpath = "(//textarea[@placeholder='Enter PO Address'])[1]")
	WebElement poAddress;

	@FindBy(xpath = "(//input[@placeholder='GSTN Number'])[1]")
	WebElement gstnNum;

	@FindBy(xpath = "(//input[@placeholder='PAN Number'])[1]")
	WebElement panNum;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement updateAddresses;

	// Banking

	@FindBy(xpath = "(//a[normalize-space()='Banking'])[1]")
	WebElement banking;

	@FindBy(xpath = "(//td[@class='active_status_color'])[1]")
	WebElement bankingTable;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement bankName;

	@FindBy(xpath = "(//span[normalize-space()='TEST Bank Name'])[1]")
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

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement updateBanking;

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

	@FindBy(xpath = "(//span[normalize-space()='TEST Preferred_Freight_Forwarder'])[1]")
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

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement iso;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement as;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement medical;

	@FindBy(xpath = "(//span[@class='slider round'])[4]")
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

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-edit-vendor/div[2]/div/div/div/form/div/div[4]/div/div/div[4]/mat-expansion-panel/mat-expansion-panel-header/span[2]")
	WebElement headCount2;

	@FindBy(xpath = "(//input[@placeholder='Enter Head Count'])[1]")
	WebElement enterHeadCount;

	@FindBy(xpath = "(//td[normalize-space()='skill'])[1]")
	WebElement headCountTable;

	@FindBy(xpath = "(//input[@placeholder='Skill/Dept'])[1]")
	WebElement enterskill;

	@FindBy(xpath = "(//input[@placeholder='Qty'])[1]")
	WebElement noOfPeople;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement updateHeadCountTable;

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

	@FindBy(xpath = "(//span[normalize-space()='Pcs'])[1]")
	WebElement uomSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter sqft'])[1]")
	WebElement sqft;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement erpToggle;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement ospToggle;

//Details

	@FindBy(xpath = "(//a[normalize-space()='Vendor Approval'])[1]")
	WebElement venderApproval;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement scopeOfSupply;

	@FindBy(xpath = "(//span[normalize-space()='TEST Scope_Of_Supply'])[1]")
	WebElement scopeOfSupplySelect;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement venderCategory;

	@FindBy(xpath = "(//span[normalize-space()='TEST Vender_Category'])[1]")
	WebElement venderCategorySelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement basisOfApproval;

	@FindBy(xpath = "(//span[normalize-space()='TEST Basis OF Approval'])[1]")
	WebElement basisOfApprovalSelect;

	@FindBy(xpath = "(//span)[70]")
	WebElement inventoryItem;

	@FindBy(xpath = "(//input[@placeholder='Approved By'])[1]")
	WebElement approvedBy;

	@FindBy(xpath = "(//span)[72]")
	WebElement reaudit;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement auditFrequency;

	@FindBy(xpath = "(//span[normalize-space()='TEST Audit Frequency Name'])[1]")
	WebElement auditFrequencySelect;

	public VenderMasterEdit() {
		PageFactory.initElements(driver, this);
	}

	JavascriptExecutor executor = (JavascriptExecutor) driver;

	public HomePage VenderMasterEdit1(String comName, String comAlias, String add, String cty, String stat, String code,
			String boardnum, String web, String eml, String generalpin, String cName, String mobileNo, String llNum,
			String fN, String desig, String mobileno2, String exten, String lN, String eml1, String addrs, String gst,
			String pan, String brch, String account, String ifsc, String swtch, String Iban, String adv,
			String specialtms, String turnovr, String dnb, String icr, String headcount, String skill, String people,
			String cacp, String floor, String machine1, String tools, String sqft1, String approved)
			throws InterruptedException, AWTException {

		// 1Verifying that Item Number Text Field is Enabled or not
		boolean isEnabledCompanyNameTextField = venderName1.isEnabled();
		assertTrue(isEnabledCompanyNameTextField);
		boolean isDisabledCompanyNameTextFieldn = !venderName1.isEnabled();
		assertFalse(isDisabledCompanyNameTextFieldn);

		// Verifying that Item Number Text Field is displayed or hidden.
		boolean isDisplayedCompanyNameTextField = venderName1.isDisplayed();
		assertTrue(isDisplayedCompanyNameTextField);
		boolean isHiddenCompanyNameTextField = !venderName1.isDisplayed();
		assertFalse(isHiddenCompanyNameTextField);

		// Verifying that Item Number Text Field is Selected or unselected
		boolean isSelectedCompanyNameTextField = venderName1.isSelected();
		assertFalse(isSelectedCompanyNameTextField);
		boolean isDeselectedCompanyNameTextField = !venderName1.isSelected();
		assertTrue(isDeselectedCompanyNameTextField);

		// Verifying the Placeholder which is present in CompanyName text field.
		String displayedTextInCompanyName = venderName1.getAttribute("placeholder");

		String expected_placeholder2 = "Enter Vendor Name";

		assertEquals(displayedTextInCompanyName, expected_placeholder2);
		venderName1.clear();
		venderName1.sendKeys(comName);

		venderAlias.clear();
		venderAlias.sendKeys(comAlias);
		// 1Verifying that Item Number Text Field is Enabled or not
		boolean isEnabledCompanyAliasTextField = venderAlias.isEnabled();
		assertTrue(isEnabledCompanyAliasTextField);
		boolean isDisabledCompanyAliasTextFieldn = !venderAlias.isEnabled();
		assertFalse(isDisabledCompanyAliasTextFieldn);

		// Verifying that Item Number Text Field is displayed or hidden.
		boolean isDisplayedCompanyAliasTextField = venderAlias.isDisplayed();
		assertTrue(isDisplayedCompanyAliasTextField);
		boolean isHiddenCompanyAliasTextField = !venderAlias.isDisplayed();
		assertFalse(isHiddenCompanyAliasTextField);

		// Verifying that Item Number Text Field is Selected or unselected
		boolean isSelectedCompanyAliasTextField = venderAlias.isSelected();
		assertFalse(isSelectedCompanyAliasTextField);
		boolean isDeselectedCompanyAliasTextField = !venderAlias.isSelected();
		assertTrue(isDeselectedCompanyAliasTextField);

		// Verifying the Placeholder which is present in CompanyAlias text field.
		String displayedTextInCompanyAlias = venderAlias.getAttribute("placeholder");

		String expected_placeholder3 = "Enter Vendor Alias";

		assertEquals(displayedTextInCompanyAlias, expected_placeholder3);

//    //Verify the Hight and Width of the CompanyId and CompanyName Text Field.
//	int CompanyIdfieldHeightSize = CompanyId.getSize().getHeight();
//	int CompanyIdfieldWidthSize = CompanyId.getSize().getWidth();
//
//	int CompanyNamefieldHeightSize = CompanyName.getSize().getHeight();
//	int CompanyNamefieldWidthSize = CompanyName.getSize().getWidth();
//	
//	int CompanyAliasfieldHeightSize = CompanyAlias.getSize().getHeight();
//	int CompanyAliasfieldWidthSize = CompanyAlias.getSize().getWidth();
//	
//	System.out.println("The maximun Height of CompanyId Text field is"+CompanyIdfieldHeightSize);
//	System.out.println("The maximun Width of CompanyId Text field is "+CompanyIdfieldWidthSize);
//	System.out.println("The maximun Height of CompanyName text field is "+CompanyNamefieldHeightSize);
//	System.out.println("The maximun Width of CompanyName text field is "+CompanyNamefieldWidthSize);
//	System.out.println("The maximun Height of CompanyAlias text field is "+CompanyAliasfieldHeightSize);
//	System.out.println("The maximun Width of CompanyAlias text field is "+CompanyAliasfieldWidthSize);		

		// *****************************//

//General

		// Verify that CustomerType Field is Displayed or not
		boolean isDisabledCustomerTypeFieldn = !venderType.isDisplayed();
		assertFalse(isDisabledCustomerTypeFieldn);

//	//Verify that  CustomerType Field is clickable or not
//		WebElement VenderTypeFieldFocusedElement = driver.switchTo().activeElement();
//    boolean CustomerTypeFieldIsSelected = VenderTypeFieldFocusedElement.equals(venderType);
//    assertFalse(CustomerTypeFieldIsSelected, "VenderType Text Field is not Selected");

		// Verifying that CustomerType Text Field is Enabled or not
		boolean isEnabledInspectionIntDaysField = venderType.isEnabled();
		assertTrue(isEnabledInspectionIntDaysField);

		venderType.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", venderTypeSelect);

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

//	//Verify that  Country Field is Displayed or not
//	boolean isDisabledCountryFieldn = !country.isDisplayed(); 
//	assertFalse(isDisabledCountryFieldn);
//	
//	//Verify that  Country Field is clickable or not
//		WebElement CountryFieldFocusedElement = driver.switchTo().activeElement();
//    boolean CountryFieldIsSelected = CountryFieldFocusedElement.equals(country);
//    assertFalse(CountryFieldIsSelected, "Country Text Field is not Selected");
//      
//    //Verifying that Country Text Field is Enabled or not
//		boolean isEnabledCountryField = country.isEnabled();
//		assertTrue(isEnabledCountryField);
//		
//		country.sendKeys(Keys.ENTER);
//		country.sendKeys(county);
//	
//	executor.executeScript("arguments[0].click();", countrySelect);
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
		boolean isDisabledPurchaseGroupFieldn = !purchaseGroup.isDisplayed();
		assertFalse(isDisabledPurchaseGroupFieldn);

		// Verify that PurchaseGroup Field is clickable or not
		WebElement PurchaseGroupFieldFocusedElement = driver.switchTo().activeElement();
		boolean PurchaseGroupFieldIsSelected = PurchaseGroupFieldFocusedElement.equals(purchaseGroup);
		assertFalse(PurchaseGroupFieldIsSelected, "PurchaseGroup Text Field is not Selected");

		// Verifying that PurchaseGroup Text Field is Enabled or not
		boolean isEnabledPurchaseGroupField = purchaseGroup.isEnabled();
		assertTrue(isEnabledPurchaseGroupField);

		purchaseGroup.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", purchaseGroupSelect);

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

//	//Verify that  mobileNumCode Field is Displayed or not
//	boolean isDisabledmobileNumCodeFieldn = !mobileNumCode.isDisplayed(); 
//	assertFalse(isDisabledmobileNumCodeFieldn);
//	
//	//Verify that  mobileNumCode Field is clickable or not
//		WebElement mobileNumCodeFieldFocusedElement = driver.switchTo().activeElement();
//    boolean mobileNumCodeFieldIsSelected = mobileNumCodeFieldFocusedElement.equals(mobileNumCode);
//    assertFalse(mobileNumCodeFieldIsSelected, "mobileNumCode Text Field is not Selected");
//      
//    //Verifying that mobileNumCode Text Field is Enabled or not
//		boolean isEnabledmobileNumCodeField = mobileNumCode.isEnabled();
//		assertTrue(isEnabledmobileNumCodeField);
//		
//		mobileNumCode.sendKeys(Keys.ENTER);
//
//		
//	executor.executeScript("arguments[0].click();", mobileNumCodeSelect);

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
		timeToCall.sendKeys("14");
		timeToCall.sendKeys("14");

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

//	//Verify that  mobileNumCode1 Field is Displayed or not
//	boolean isDisabledmobileNumCode1Fieldn = !mobileNumCode1.isDisplayed(); 
//	assertFalse(isDisabledmobileNumCode1Fieldn);
//	
//	//Verify that  mobileNumCode1 Field is clickable or not
//	WebElement mobileNumCode1FieldFocusedElement = driver.switchTo().activeElement();
//	boolean mobileNumCode1FieldIsSelected = mobileNumCode1FieldFocusedElement.equals(mobileNumCode1);
//	assertFalse(mobileNumCode1FieldIsSelected, "mobileNumCode1 Text Field is not Selected");
//	  
//	//Verifying that mobileNumCode1 Text Field is Enabled or not
//	boolean isEnabledmobileNumCode1Field = mobileNumCode1.isEnabled();
//	assertTrue(isEnabledmobileNumCode1Field);
//	
//	mobileNumCode1.sendKeys(Keys.ENTER);
//
//
//	executor.executeScript("arguments[0].click();", mobileNumCode1Select);

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

		// **********************//

//RelatedCompanyLink

		executor.executeScript("arguments[0].click();", relatedVenderCategory);

		// Verify that company Field is Displayed or not
		boolean isDisabledcompanyFieldn = !vender.isDisplayed();
		assertFalse(isDisabledcompanyFieldn);

		// Verify that company Field is clickable or not
		WebElement companyFieldFocusedElement = driver.switchTo().activeElement();
		boolean companyFieldIsSelected = companyFieldFocusedElement.equals(vender);
		assertFalse(companyFieldIsSelected, "company Text Field is not Selected");

		// Verifying that company Text Field is Enabled or not
		boolean isEnabledcompanyField = vender.isEnabled();
		assertTrue(isEnabledcompanyField);

		vender.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", venderSelect);

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

//Addressess		
		executor.executeScript("arguments[0].click();", addresses);

		executor.executeScript("arguments[0].click();", addressesTable);

		// Verify that poAddress Field is Displayed or not
		boolean isDisabledpoAddressFieldn = !poAddress.isDisplayed();
		assertFalse(isDisabledpoAddressFieldn);

		// Verify that poAddress Field is clickable or not
		WebElement poAddressFieldFocusedElement = driver.switchTo().activeElement();
		boolean poAddressFieldIsSelected = poAddressFieldFocusedElement.equals(poAddress);
		assertFalse(poAddressFieldIsSelected, "poAddress Text Field is not Selected");

		// Verifying that poAddress Text Field is Enabled or not
		boolean isEnabledpoAddressField = poAddress.isEnabled();
		assertTrue(isEnabledpoAddressField);

		// Verifying the Placeholder which is present in poAddress text field.
		String displayedTextInpoAddress = poAddress.getAttribute("placeholder");

		String expected_placeholder_in_poAddress = "Enter PO Address";

		assertEquals(displayedTextInpoAddress, expected_placeholder_in_poAddress);

		poAddress.clear();
		poAddress.sendKeys(addrs);

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

		updateContacts.click();

//Banking

		executor.executeScript("arguments[0].click();", banking);

		executor.executeScript("arguments[0].click();", bankingTable);

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
		bankName.clear();
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

		executor.executeScript("arguments[0].click();", updateBanking);

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

		// Verify that preferredFreightForwarder Field is Displayed or not
		boolean isDisabledpreferredFreightForwarderFieldn = !preferredFreightForwarder.isDisplayed();
		assertFalse(isDisabledpreferredFreightForwarderFieldn);

		// Verify that preferredFreightForwarder Field is clickable or not
		WebElement preferredFreightForwarderFieldFocusedElement = driver.switchTo().activeElement();
		boolean preferredFreightForwarderFieldIsSelected = preferredFreightForwarderFieldFocusedElement
				.equals(preferredFreightForwarder);
		assertFalse(preferredFreightForwarderFieldIsSelected, "preferredFreightForwarder Text Field is not Selected");

		// Verifying that preferredFreightForwarder Text Field is Enabled or not
		boolean isEnabledpreferredFreightForwarderField = preferredFreightForwarder.isEnabled();
		assertTrue(isEnabledpreferredFreightForwarderField);

		preferredFreightForwarder.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", preferredFreightForwarderSelect);

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

//CertificatesDocs

		executor.executeScript("arguments[0].click();", certifications);

		executor.executeScript("arguments[0].click();", iso);

		// Verify that pan Field is Displayed or not
		boolean isDisablediso = !iso.isDisplayed();
		assertFalse(isDisablediso);

		executor.executeScript("arguments[0].click();", as);

		// Verify that pan Field is Displayed or not
		boolean isDisabledas = !as.isDisplayed();
		assertFalse(isDisabledas);

		executor.executeScript("arguments[0].click();", medical);

		// Verify that pan Field is Displayed or not
		boolean isDisabledmedical = !medical.isDisplayed();
		assertFalse(isDisabledmedical);

		executor.executeScript("arguments[0].click();", nadcap);

		// Verify that pan Field is Displayed or not
		boolean isDisablednadcap = !nadcap.isDisplayed();
		assertFalse(isDisablednadcap);

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

		executor.executeScript("arguments[0].click();", headCount2);

		executor.executeScript("arguments[0].click();", headCountTable);
//
//
//	//Verify that  headcount Field is clickable or not
//	WebElement headcountFieldFocusedElement = driver.switchTo().activeElement();
//	boolean headcountFieldIsSelected = headcountFieldFocusedElement.equals(enterHeadCount);
//	assertFalse(headcountFieldIsSelected, "headcount Text Field is not Selected");
//  
//	//Verifying that headcount Text Field is Enabled or not
//	boolean isEnabledheadcountField = enterHeadCount.isEnabled();
//	assertTrue(isEnabledheadcountField);
//	
//	//Verifying the Placeholder which is present in headcount text field.
//	String displayedTextInheadcount = enterHeadCount.getAttribute("placeholder");
//	
//	String expected_placeholder_in_headcount = "Enter Head Count";
//	
//	assertEquals(displayedTextInheadcount, expected_placeholder_in_headcount);
//	
//	enterHeadCount.clear();
//	enterHeadCount.sendKeys(headcount);

		// Verifying that skill Text Field is Enabled or not
		boolean isEnabledskillField = enterskill.isEnabled();
		assertTrue(isEnabledskillField);

		// Verifying the Placeholder which is present in skill text field.
		String displayedTextInskill = enterskill.getAttribute("placeholder");

		String expected_placeholder_in_skill = "Skill/Dept";

		assertEquals(displayedTextInskill, expected_placeholder_in_skill);
		enterskill.clear();
		enterskill.sendKeys(skill);

		// Verifying that numOfPeople Text Field is Enabled or not
		boolean isEnablednumOfPeopleField = noOfPeople.isEnabled();
		assertTrue(isEnablednumOfPeopleField);

		// Verifying the Placeholder which is present in numOfPeople text field.
		String displayedTextInnumOfPeople = noOfPeople.getAttribute("placeholder");

		String expected_placeholder_in_numOfPeople = "Qty";

		assertEquals(displayedTextInnumOfPeople, expected_placeholder_in_numOfPeople);
		noOfPeople.clear();
		noOfPeople.sendKeys(people);

		executor.executeScript("arguments[0].click();", updateHeadCountTable);

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

		String expected_placeholder_in_sqft = "Enter sqft";

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

		WebElement esdSetup = driver.findElement(By.xpath("(//input[@value='no'])[1]"));
		executor.executeScript("arguments[0].click();", esdSetup);

		WebElement hazmatSetup = driver.findElement(By.xpath("(//input[@value='no'])[2]"));
		executor.executeScript("arguments[0].click();", hazmatSetup);

		executor.executeScript("arguments[0].click();", ospToggle);

//Company Approval

		executor.executeScript("arguments[0].click();", venderApproval);

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

		// Verify that companyCategory Field is Displayed or not
		boolean isDisabledcompanyCategoryFieldn = !venderCategory.isDisplayed();
		assertFalse(isDisabledcompanyCategoryFieldn);

		// Verify that companyCategory Field is clickable or not
		WebElement companyCategoryFieldFocusedElement = driver.switchTo().activeElement();
		boolean companyCategoryFieldIsSelected = companyCategoryFieldFocusedElement.equals(venderCategory);
		assertFalse(companyCategoryFieldIsSelected, "companyCategory Text Field is not Selected");

		// Verifying that companyCategory Text Field is Enabled or not
		boolean isEnabledcompanyCategoryField = venderCategory.isEnabled();
		assertTrue(isEnabledcompanyCategoryField);

		venderCategory.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", venderCategorySelect);

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

		executor.executeScript("arguments[0].click();", inventoryItem);

		// Verify that inventoryItem Field is Displayed or not
		boolean isDisabledinventoryItem = inventoryItem.isDisplayed();
		assertTrue(isDisabledinventoryItem);

		executor.executeScript("arguments[0].click();", approvedBy);

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

		WebElement auditFrequency = driver.findElement(By.xpath("(//input[@type='text'])[9]"));

		// Verify that auditFrequency Field is Displayed or not
		boolean isDisabledauditFrequencyFieldn = !auditFrequency.isDisplayed();
		assertFalse(isDisabledauditFrequencyFieldn);

		// Verify that auditFrequency Field is clickable or not
		WebElement auditFrequencyFieldFocusedElement = driver.switchTo().activeElement();
		boolean auditFrequencyFieldIsSelected = auditFrequencyFieldFocusedElement.equals(auditFrequency);
		assertFalse(auditFrequencyFieldIsSelected, "auditFrequency Text Field is not Selected");

		// Verifying that auditFrequency Text Field is Enabled or not
		boolean isEnabledauditFrequencyField = auditFrequency.isEnabled();
		assertTrue(isEnabledauditFrequencyField);

		auditFrequency.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", auditFrequencySelect);

		WebElement approvalDate = driver.findElement(By.xpath("(//input[@placeholder='DD-MM-YYYY'])[1]"));
		approvalDate.click();
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
				"C:\\Users\\W2191\\Desktop\\testKeus\\SalesdefectsKeus.xlsx");
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
