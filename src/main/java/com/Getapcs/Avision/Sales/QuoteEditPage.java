package com.Getapcs.Avision.Sales;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class QuoteEditPage extends TestBase {



	@FindBy(xpath = "(//i[@title='Click to edit'])[1]")
	WebElement editButton;
	
	@FindBy(xpath = "//label[normalize-space()='Remarks']/..//textarea[@placeholder='Enter Remarks']")
	WebElement remarkField;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement customerNameDropDown;

	@FindBy(xpath = "(//span[normalize-space()='L112962 - Test comName1'])[1]")
	WebElement customerNameDropDownSelect;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[2]")
	WebElement customerAliasNameDropDown;

	@FindBy(xpath = "(//span[normalize-space()='L112962 - Test comName1'])[1]")
	WebElement customerAliasCLick;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement rfqNumberDropDown;

	@FindBy(xpath = "(//span[normalize-space()='TISPL-0142'])[1]")
	WebElement rfqSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Quote Ref.'])[1]")
	WebElement quoteRefField3;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement typeOfSolution;

	@FindBy(xpath = "(//span[normalize-space()='TEST Of Solution1'])[1]")
	WebElement typeOfSolutionSelect;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement productType;

	@FindBy(xpath = "(//span[normalize-space()='Smart Console'])[1]")
	WebElement productTypeSelect;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarks;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Reason For Modification'])[1]")
	WebElement reasonForModification;

//General Tab

	@FindBy(xpath = "(//input[@id='generalDiscPer'])[1]")
	WebElement generalDiscountPercentageRadioButton;

	@FindBy(xpath = "(//input[@id='generalDiscPer'])[2]")
	WebElement generalDiscountRupeesRadioButton;

	@FindBy(xpath = "(//input[@placeholder='Enter General Discount'])[1]")
	WebElement generalDiscountField3;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-edit-kues-quote/div[2]/div/div/div/form/div/div[5]/div/div/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span[2]")
	WebElement expandableDropDown1;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-kues-quote/div[2]/div/div/div/form/div/div[4]/div/div/mat-accordion/mat-expansion-panel[2]/mat-expansion-panel-header/span[2]")
	WebElement expandableDropDown2;

	@FindBy(xpath = "By.xpath(\"(//input[@type='text'])[9]\")")
	WebElement priceLIstDropDown;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[1]")
	WebElement QuantityField3;

	@FindBy(xpath = "(//input[@id='1'])[1]")
	WebElement discountPercentageRadioButton;

	@FindBy(xpath = "(//input[@id='2'])[1]")
	WebElement discountRupeesRadioButton;

	@FindBy(xpath = "(//input[@placeholder='Enter Discount'])[1]")
	WebElement discountField3;

	@FindBy(xpath = "//input[@id='specialDiscPer']")
	WebElement specialDiscountPercentageRadioButton;

	@FindBy(xpath = "//input[@id='specialDiscAmt']")
	WebElement specialDiscountRupeesRadioButton;

	@FindBy(xpath = "(//input[@placeholder='Enter Special Discount'])[1]")
	WebElement specialDiscountField3;

	@FindBy(xpath = "(//input[@placeholder='Enter IGST'])[1]")
	WebElement iGSTField3;

	@FindBy(xpath = "(//input[@placeholder='Enter CGST'])[1]")
	WebElement cGSTField3;

	@FindBy(xpath = "(//input[@placeholder='Enter SGST'])[1]")
	WebElement sGSTField3;

	@FindBy(xpath = "(//input[@placeholder='Enter UTGST'])[1]")
	WebElement uTGSTField3;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addButton;

//	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Add'])[1]")
//	WebElement addItem;
//
//	@FindBy(xpath = "(//input[@type='text'])[25]")
//	WebElement roomName;
//
//	@FindBy(xpath = "(//span[normalize-space()='Master Bedroom-I'])[2]")
//	WebElement roomNameSelect;
//
//	@FindBy(xpath = "(//input[@role='combobox'])[1]")
//	WebElement itemNumber;
//
//	@FindBy(xpath = "(//span[normalize-space()='Test4567-Test12345'])[1]")
//	WebElement itemNumberSelect;
//
//	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[2]")
//	WebElement quantity;

////Expandable Dropdown 2
//
//	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[2]")
//	WebElement quantityField31;
//
//	@FindBy(xpath = "(//input[@id='1'])[2]")
//	WebElement discountPercentageRadioButton1;
//
//	@FindBy(xpath = "(//input[@id='2'])[2]")
//	WebElement discountRupeesRadioButton1;
//
//	@FindBy(xpath = "(//input[@placeholder='Enter Discount'])[2]")
//	WebElement discountField31;
//
//	@FindBy(xpath = "//input[@id='specialDiscPer']")
//	WebElement specialDiscountPercentageRadioButton1;
//
//	@FindBy(xpath = "//input[@id='specialDiscAmt']")
//	WebElement specialDiscountRupeesRadioButton1;
//
//	@FindBy(xpath = "(//input[@placeholder='Enter Special Discount'])[1]")
//	WebElement specialDiscountField31;
//
//	@FindBy(xpath = "(//input[@placeholder='Enter IGST'])[2]")
//	WebElement iGSTField31;
//
//	@FindBy(xpath = "(//input[@placeholder='Enter CGST'])[2]")
//	WebElement cGSTField31;
//
//	@FindBy(xpath = "(//input[@placeholder='Enter SGST'])[2]")
//	WebElement sGSTField31;
//
//	@FindBy(xpath = "(//input[@placeholder='Enter UTGST'])[2]")
//	WebElement uTGSTField31;

//Total Calculation Tab

	@FindBy(xpath = "(//a[normalize-space()='Total Calculation'])[1]")
	WebElement totalCalculationTab;

	@FindBy(xpath = "(//td[normalize-space()='Installation Charges'])[1]")
	WebElement totalCalculationTable;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement additionalChargesLabel;

	@FindBy(xpath = "(//span[normalize-space()='Installation Charges'])[1]")
	WebElement additionalChargesLabelSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Additional Charges'])[1]")
	WebElement additinalChargesValue;

	@FindBy(xpath = "(//input[@id='addtionalPer'])[1]")
	WebElement additionalChargesValuePercentageRadioButton;

	@FindBy(xpath = "(//input[@id='addtionalAmt'])[1]")
	WebElement additionalChargesValueRupeesRadioButton;

	@FindBy(xpath = "(//input[@placeholder='Enter IGST'])[1]")
	WebElement igst;

	@FindBy(xpath = "(//input[@placeholder='Enter CGST'])[1]")
	WebElement cgst;

	@FindBy(xpath = "(//input[@placeholder='Enter SGST'])[1]")
	WebElement sgst;

	@FindBy(xpath = "(//input[@placeholder='Enter UTGST'])[1]")
	WebElement utgst;

	@FindBy(xpath = "(//input[@type='text'])[20]")
	WebElement paymentTerms;

	@FindBy(xpath = "(//span[normalize-space()='ADV40'])[1]")
	WebElement paymentTermsSelect;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement update;

//RFQ NOTES TAB

	@FindBy(xpath = "(//a[normalize-space()='RFQ Notes'])[1]")
	WebElement rfqNotesTab;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement rfqNotes;

	@FindBy(xpath = "(//span[normalize-space()='TEST Note'])[1]")
	WebElement rfqNotesSelect;

//Other Terms

	@FindBy(xpath = "(//a[normalize-space()='Other Terms'])[1]")
	WebElement otherTermsTab;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	WebElement OtherTermDropdown;

	@FindBy(xpath = "(//span[normalize-space()='TEST Quote_Terms1'])[1]")
	WebElement OtherTermDropdownSelect;

//Other Terms

	@FindBy(xpath = "(//a[normalize-space()='Special Terms'])[1]")
	WebElement specialTermsTab;

	@FindBy(xpath = "(//td[@class='termDiv'])[1]")
	WebElement specialTermsTable;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Special Terms'])[1]")
	WebElement specialTermsField;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement salesPerson;

	@FindBy(xpath = "(//span[normalize-space()='Abhilashpatil'])[1]")
	WebElement salesPersonSelect;

	public QuoteEditPage() {
		PageFactory.initElements(driver, this);
	}


	public HomePage QuoteEdit() throws Throwable {


		click(driver, editButton);
		
		Thread.sleep(6000);

		click(driver, remarkField);
		isSelected(driver, remarkField, "remarkField");
		remarkField.sendKeys("Edit Quote Remark");


		// Verify and Click on Save Button in Quote Create Page
		click(driver, saveButton);
	
		
		return new HomePage();

	}


}
