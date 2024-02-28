package com.Getapcs.Avision.Sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class QuoteCreatePage extends TestBase {
	
	@FindBy(tagName = "body")
	public static WebElement driverIninteractable;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement customerNameDropDown;

	@FindBy(xpath = "(//span[normalize-space()='ASPL|CS|23-24|004 - AVision Systems Pvt Ltd .'])[1]")
	WebElement customerNameDropDownSelect;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement rfqNumberDropDown;

	@FindBy(xpath = "(//input[@placeholder='Enter Quote Ref.'])[1]")
	WebElement quoteRefField3;

//General Tab

	@FindBy(xpath = "(//input[@id='generalDiscPer'])[1]")
	WebElement generalDiscountPercentageRadioButton;

	@FindBy(xpath = "(//input[@id='generalDiscPer'])[2]")
	WebElement generalDiscountRupeesRadioButton;

	@FindBy(xpath = "(//input[@placeholder='Enter General Discount'])[1]")
	WebElement generalDiscountField3;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-quote/div[2]/div/div/div/form/div/div[3]/div/div/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span[2]")
	WebElement expandableDropDown1;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-kues-quote/div[2]/div/div/div/form/div/div[4]/div/div/mat-accordion/mat-expansion-panel[2]/mat-expansion-panel-header/span[2]")
	WebElement expandableDropDown2;

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

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Add'])[1]")
	WebElement addItem;

	@FindBy(xpath = "(//input[@type='text'])[25]")
	WebElement roomName;

	@FindBy(xpath = "(//span[normalize-space()='Home'])[2]")
	WebElement roomNameSelect;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement itemNumber;

	@FindBy(xpath = "(//span[normalize-space()='798878123-Test Description'])[1]")
	WebElement itemNumberSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[2]")
	WebElement quantity;

//Expandable Dropdown 2

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[2]")
	WebElement quantityField31;

	@FindBy(xpath = "(//input[@id='1'])[2]")
	WebElement discountPercentageRadioButton1;

	@FindBy(xpath = "(//input[@id='2'])[2]")
	WebElement discountRupeesRadioButton1;

	@FindBy(xpath = "(//input[@placeholder='Enter Discount'])[2]")
	WebElement discountField31;

	@FindBy(xpath = "//input[@id='specialDiscPer']")
	WebElement specialDiscountPercentageRadioButton1;

	@FindBy(xpath = "//input[@id='specialDiscAmt']")
	WebElement specialDiscountRupeesRadioButton1;

	@FindBy(xpath = "(//input[@placeholder='Enter Special Discount'])[1]")
	WebElement specialDiscountField31;

	@FindBy(xpath = "(//input[@placeholder='Enter IGST'])[2]")
	WebElement iGSTField31;

	@FindBy(xpath = "(//input[@placeholder='Enter CGST'])[2]")
	WebElement cGSTField31;

	@FindBy(xpath = "(//input[@placeholder='Enter SGST'])[2]")
	WebElement sGSTField31;

	@FindBy(xpath = "(//input[@placeholder='Enter UTGST'])[2]")
	WebElement uTGSTField31;

//Total Calculation Tab

	@FindBy(xpath = "(//a[normalize-space()='Total Calculation'])[1]")
	WebElement totalCalculationTab;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement toggleButton;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement additionalChargesLabel;

	@FindBy(xpath = "(//span[normalize-space()='TEST Additional Charges Name'])[1]")
	WebElement additionalChargesLabelSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Additional Charges'])[1]")
	WebElement additinalChargesValue;

	@FindBy(xpath = "(//input[@type='text'])[16]")
	WebElement paymentTerms;

	@FindBy(xpath = "(//span[normalize-space()='50%-Advance'])[1]")
	WebElement paymentTermsSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Special Discount'])[1]")
	WebElement specialDiscount;

//RFQ NOTES TAB

	@FindBy(xpath = "(//a[normalize-space()='RFQ Notes'])[1]")
	WebElement rfqNotesTab;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement rfqNotes;

	@FindBy(xpath = "(//span[normalize-space()='TEST Note'])[1]")
	WebElement rfqNotesSelect;

//Other Terms

	@FindBy(xpath = "(//a[normalize-space()='Other Terms'])[1]")
	WebElement otherTermsTab;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement OtherTermDropdown;

	@FindBy(xpath = "(//span[normalize-space()='50% Advance'])[1]")
	WebElement OtherTermDropdownSelect;

//Special Terms

	@FindBy(xpath = "(//a[normalize-space()='Special Terms'])[1]")
	WebElement specialTermsTab;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Special Terms'])[1]")
	WebElement specialTermsField;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	public QuoteCreatePage() {
		PageFactory.initElements(driver, this);
	}


	public HomePage QuoteCreate(String quoteRef, String generalDiscount, String Quantity, String discount, String igst1,
			String cgst1, String sgst1, String utgst1, String Quantity1, String QuantityField1, String DiscountField1,
			String igst2, String cgst2, String sgst2, String utgst2, String additinalCharges, String igst3,
			String cgst3, String sgst3, String utgst3, String specialTerms) throws Throwable {

		driver.navigate().to("https://avision-demo.getapcs.com/sales/rfq/table");

		String tableXpath = "//table[@class='table table-striped']";
		
		actions.moveToElement(driverIninteractable).perform();
		Thread.sleep(2000);

		// Get the first PR number text from table
		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumber);

		System.out.println(updatedXpath);

		driver.navigate().to("https://avision-demo.getapcs.com/sales/quote/create");

		// Verify the Customer Name Drop Down in LP Costing Page-Sales Module
		click(driver, customerNameDropDown);
		isSelected(driver, customerNameDropDown, "customerNameDropDown");
		click(driver, customerNameDropDownSelect);

//		//Verify the Customer Alias Name Drop Down in LP Costing Page-Sales Module
//		boolean customerAliasNameDropDownIsDisplayed = customerAliasNameDropDown.isDisplayed();
//		assertTrue(customerAliasNameDropDownIsDisplayed, "customerAlias Name Drop Down is not Displayed.");
//		customerAliasNameDropDown.click();
//		js.executeScript("arguments[0].click();", customerAliasCLick);

		// Verify the RFQ Number Drop Down in Quote Create Page-Sales Module
		click(driver, rfqNumberDropDown);
		isSelected(driver, rfqNumberDropDown, "rfqNumberDropDown");
		WebElement rfqSelect = driver.findElement(By.xpath(updatedXpath));
		click(driver, rfqSelect);

		// Verify the Quote Ref. Field3
		click(driver, quoteRefField3);
		isSelected(driver, quoteRefField3, "quoteRefField3");
		quoteRefField3.sendKeys(quoteRef);

//		//Verify the typeOfSolution Drop Down in Quote Create Page-Sales Module
//		boolean typeOfSolutionIsDisplayed = typeOfSolution.isDisplayed();
//		assertTrue(typeOfSolutionIsDisplayed, "typeOfSolution Type Drop Down is not Displayed.");
//		typeOfSolution.sendKeys(Keys.ENTER);
//		WebElement typeOfSolutionFocusedElement = driver.switchTo().activeElement();
//	    boolean typeOfSolutionIsSelected = typeOfSolutionFocusedElement.equals(typeOfSolution);
//	    assertTrue(typeOfSolutionIsSelected, "typeOfSolution Type Drop Down is not Selected");
//	    
//		js.executeScript("arguments[0].click();", typeOfSolutionSelect);
//
//		
//		//Verify the productType Drop Down in Quote Create Page-Sales Module
//		boolean productTypeIsDisplayed = productType.isDisplayed();
//		assertTrue(productTypeIsDisplayed, "product Type Drop Down is not Displayed.");
//		productType.sendKeys(Keys.ENTER);
//		WebElement productTypeFocusedElement = driver.switchTo().activeElement();
//	    boolean productTypeIsSelected = productTypeFocusedElement.equals(productType);
//	    assertTrue(productTypeIsSelected, "product Type Drop Down is not Selected");
//	    
//		js.executeScript("arguments[0].click();", productTypeSelect);

		// ################## General Tab ######################

		// Verify General Tab in Quote
//		WebElement generalTab = driver.findElement(By.linkText("General"));
//	    boolean generalTabIsDisplayed = generalTab.isDisplayed();
//	    assertTrue(generalTabIsDisplayed, "General Tab is not Displayed.");
//	    generalTab.click();

		click(driver, generalDiscountPercentageRadioButton);

		// Verify General Discount Rupees Radio Button in General Tab
		click(driver, generalDiscountRupeesRadioButton);

		// Verify the General Discount Field3 in General Tab
		click(driver, generalDiscountField3);
		isSelected(driver, generalDiscountField3, "generalDiscountField3");
		generalDiscountField3.clear();
		generalDiscountField3.sendKeys(generalDiscount);

		// *********************************************************************
		// Verify the Expandable DropDown-1 LP Costing Page-Sales Module
		click(driver, expandableDropDown1);

		click(driver, discountPercentageRadioButton);
		// Verify Discount Rupees Radio Button in General Tab
		click(driver, discountRupeesRadioButton);

		// Verify the discount Field3 in General Tab
		click(driver, discountField3);
		isSelected(driver, discountField3, "discountField3");
		discountField3.clear();
		discountField3.sendKeys(discount);

		// <----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//		//Verify specialDiscount Percentage Radio Button in General Tab
//	    boolean specialDiscountPercentageRadioButtonIsDisplayed = specialDiscountPercentageRadioButton.isDisplayed();
//	    assertTrue(specialDiscountPercentageRadioButtonIsDisplayed, "specialDiscount Percentage Radio Button is not Displayed.");
//	    specialDiscountPercentageRadioButton.click();
//        
//		//Verify specialDiscount Rupees Radio Button in General Tab
//	    boolean specialDiscountRupeesRadioButtonIsDisplayed = specialDiscountRupeesRadioButton.isDisplayed();
//	    assertTrue(specialDiscountRupeesRadioButtonIsDisplayed, "specialDiscount Rupees Radio Button is not Displayed.");
//	    specialDiscountRupeesRadioButton.click();
//        
//        //Verify the Special Discount Field3 in General Tab
//        boolean specialDiscountField3IsDisplayed = specialDiscountField3.isDisplayed();
//        assertTrue(specialDiscountField3IsDisplayed, "Special Discount Field3 is not Displayed.");
//        specialDiscountField3.sendKeys(Keys.ENTER);
//        WebElement specialDiscountField3FocusedElement = driver.switchTo().activeElement();
//        boolean specialDiscountField3IsSelected = specialDiscountField3FocusedElement.equals(specialDiscountField3);
//        assertTrue(specialDiscountField3IsSelected, "Special Discount Field3 is not Selected");
//        specialDiscountField3.clear();
//        specialDiscountField3.sendKeys("50");

		// Verify the IGST Field3 in General Tab
		click(driver, iGSTField3);
		isSelected(driver, iGSTField3, "iGSTField3");
		iGSTField3.clear();
		iGSTField3.sendKeys(igst1);

		// Verify the CGST Field3 in General Tab
		click(driver, cGSTField3);
		isSelected(driver, cGSTField3, "cGSTField3");
		cGSTField3.clear();
		cGSTField3.sendKeys(cgst1);

		// Verify the SGST Field3 in General Tab
		click(driver, sGSTField3);
		isSelected(driver, sGSTField3, "sGSTField3");
		sGSTField3.clear();
		sGSTField3.sendKeys(sgst1);

		// Verify the UTGST Field3 in General Tab
		click(driver, uTGSTField3);
		isSelected(driver, uTGSTField3, "uTGSTField3");
		uTGSTField3.clear();
		uTGSTField3.sendKeys(utgst1);

//    //******************************************//
//        //Add the item
//        
//		      //Verify and Click on Add Button in Quote
//		      boolean addButtonIsDisplayed = addButton.isDisplayed();
//		      assertTrue(addButtonIsDisplayed, "Add Button is not Displayed.");
//	          addButton.click();
//	          
//	        //Verify the  Select RommName Drop Down in Add PopUp- Create Page-Sales Module
//	      		 boolean selectroomNameDropDownIsDisplayed = roomName.isDisplayed();
//	      		 assertTrue(selectroomNameDropDownIsDisplayed, "Select roomName Drop Down is not Displayed.");
//	      		 roomName.click();
//	      		 WebElement selectroomNameDropDownFocusedElement = driver.switchTo().activeElement();
//	      	     boolean selectroomNameDropDownIsSelected = selectroomNameDropDownFocusedElement.equals(roomName);
//	      	     assertTrue(selectroomNameDropDownIsSelected, "Select roomName Drop Down is not Selected");
//	      	     
//	      	     js.executeScript("arguments[0].click();", roomNameSelect);
//	
//      		 //Verify the  Select Item Number /Description Drop Down in Add PopUp- Create Page-Sales Module
//	      		 boolean selectItemNumberorDescriptionDropDownIsDisplayed = itemNumber.isDisplayed();
//	      		 assertTrue(selectItemNumberorDescriptionDropDownIsDisplayed, "Select Item Number /Description Drop Down is not Displayed.");
//	      		 itemNumber.sendKeys(Keys.ENTER);
//	      		 WebElement selectItemNumberorDescriptionDropDownFocusedElement = driver.switchTo().activeElement();
//	      	     boolean selectItemNumberorDescriptionDropDownIsSelected = selectItemNumberorDescriptionDropDownFocusedElement.equals(itemNumber);
//	      	     assertTrue(selectItemNumberorDescriptionDropDownIsSelected, "Select Item Number /Description Drop Down is not Selected");
//	      	     itemNumber.sendKeys("798878123");
//	      	     
//	      	     js.executeScript("arguments[0].click();", itemNumberSelect);
//	          
//             //Verify the Quantity Field3 in Add Item Pop Up
//             boolean quantityField3inAddPupUpIsDisplayed = quantity.isDisplayed();
//             assertTrue(quantityField3inAddPupUpIsDisplayed, "Quantity Field3 in Add Item Pop Up is not Displayed.");
//             quantity.sendKeys(Keys.ENTER);
//             WebElement quantityField3inAddPupUpFocusedElement = driver.switchTo().activeElement();
//             boolean quantityField3inAddPupUpIsSelected = quantityField3inAddPupUpFocusedElement.equals(quantity);
//             assertTrue(quantityField3inAddPupUpIsSelected, "Quantity Field3 in Add Item Pop Up is not Selected");
//             quantity.clear();
//             quantity.clear();
//             quantity.sendKeys(Quantity1);
//             
//             //Verify and Click on Add Item Button in Add Item Pop Up
//             boolean addItemButtonIsDisplayed = addItem.isDisplayed();
//             assertTrue(addItemButtonIsDisplayed, "Add Item Button is not Displayed.");
//             addItem.click();
//             
//             //**************************************************************************************************************************************8
//             //Verify the Expandable DropDown-2 LP Costing Page-Sales Module
//       		boolean expandableDropDown3IsDisplayed = expandableDropDown2.isDisplayed();
//       		assertTrue(expandableDropDown3IsDisplayed, "Expandable DropDown-3 is not Displayed.");
//       		js.executeScript("arguments[0].click();", expandableDropDown2);
//               
////       		//Verify the Price List Drop Down2 in Quote Create Page-Sales Module
////       		WebElement priceLIstDropDown2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='text'])[37]")));
////       		boolean priceLIstDropDown2IsDisplayed = priceLIstDropDown2.isDisplayed();
////       		assertTrue(priceLIstDropDown2IsDisplayed, "Price List Drop Down2 is not Displayed.");
////       		priceLIstDropDown2.click();
////       		WebElement priceLIstDropDown2FocusedElement = driver.switchTo().activeElement();
////       	    boolean priceLIstDropDown2IsSelected = priceLIstDropDown2FocusedElement.equals(priceLIstDropDown2);
////       	    assertTrue(priceLIstDropDown2IsSelected, "Price List Drop Down2 is not Selected");
////       	    driver.findElement(By.xpath("(//div[@class='h-50'])[3]")).click();
////       	    
//             //Verify the Quantity Field32 in General Tab
//             boolean quantityField32IsDisplayed = quantityField31.isDisplayed();
//             assertTrue(quantityField32IsDisplayed, "Quantity Field32 is not Displayed.");
//             quantityField31.sendKeys(Keys.ENTER);
//             WebElement quantityField32FocusedElement = driver.switchTo().activeElement();
//             boolean quantityField32IsSelected = quantityField32FocusedElement.equals(quantityField31);
//             assertTrue(quantityField32IsSelected, "Quantity Field32 is not Selected");
//             quantityField31.clear();
//             quantityField31.sendKeys(QuantityField1);
//               
//               
//       		//Verify Discount Percentage Radio Button2 in General Tab
//       	    boolean discountPercentageRadioButton2IsDisplayed = discountPercentageRadioButton1.isDisplayed();
//       	    assertTrue(discountPercentageRadioButton2IsDisplayed, "Discount Percentage Radio Button2 is not Displayed.");
//       	    discountPercentageRadioButton1.click();
//               
//       		//Verify Discount Rupees Radio Button2 in General Tab
//       	    boolean discountRupeesRadioButton2IsDisplayed = discountRupeesRadioButton1.isDisplayed();
//       	    assertTrue(discountRupeesRadioButton2IsDisplayed, "Discount Rupees Radio Button2 is not Displayed.");
//       	    discountRupeesRadioButton1.click();
//               
//               //Verify the discount Field32 in General Tab
//               boolean discountField32IsDisplayed = discountField31.isDisplayed();
//               assertTrue(discountField32IsDisplayed, "discount Field32 is not Displayed.");
//               discountField31.sendKeys(Keys.ENTER);
//               WebElement discountField32FocusedElement = driver.switchTo().activeElement();
//               boolean discountField32IsSelected = discountField32FocusedElement.equals(discountField31);
//               assertTrue(discountField32IsSelected, "discount Field32 is not Selected");
//               discountField31.clear();
//               discountField31.sendKeys(DiscountField1);
//               
////               //<----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////               
////         		//Verify specialDiscount Percentage Radio Button2 in General Tab
////         		WebElement specialDiscountPercentageRadioButton2 = driver.findElement(By.xpath("(//input[@id='specialDiscPer'])[3]"));
////         	    boolean specialDiscountPercentageRadioButton2IsDisplayed = specialDiscountPercentageRadioButton2.isDisplayed();
////         	    assertTrue(specialDiscountPercentageRadioButton2IsDisplayed, "specialDiscount Percentage Radio Button2 is not Displayed.");
////         	    specialDiscountPercentageRadioButton2.click();
////                 
////         		//Verify specialDiscount Rupees Radio Button2 in General Tab
////         		WebElement specialDiscountRupeesRadioButton2 = driver.findElement(By.xpath("(//input[@id='specialDiscAmt'])[3]"));
////         	    boolean specialDiscountRupeesRadioButton2IsDisplayed = specialDiscountRupeesRadioButton2.isDisplayed();
////         	    assertTrue(specialDiscountRupeesRadioButton2IsDisplayed, "specialDiscount Rupees Radio Button2 is not Displayed.");
////         	    specialDiscountRupeesRadioButton2.click();
////                 
////                 //Verify the Special Discount Field4 in General Tab
////                 WebElement specialDiscountField4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@placeholder='Enter Special Discount'])[3]")));
////                 boolean specialDiscountField4IsDisplayed = specialDiscountField4.isDisplayed();
////                 assertTrue(specialDiscountField4IsDisplayed, "Special Discount Field4 is not Displayed.");
////                 specialDiscountField4.sendKeys(Keys.ENTER);
////                 WebElement specialDiscountField4FocusedElement = driver.switchTo().activeElement();
////                 boolean specialDiscountField4IsSelected = specialDiscountField4FocusedElement.equals(specialDiscountField4);
////                 assertTrue(specialDiscountField4IsSelected, "Special Discount Field4 is not Selected");
////                 specialDiscountField4.clear();
////                 specialDiscountField4.sendKeys("20");
//                 
//                 //Verify the IGST Field4 in General Tab
//                 boolean iGSTField4Field4IsDisplayed = iGSTField31.isDisplayed();
//                 assertTrue(iGSTField4Field4IsDisplayed, "IGST Field4 is not Displayed.");
//                 iGSTField31.sendKeys(Keys.ENTER);
//                 WebElement iGSTField4FocusedElement = driver.switchTo().activeElement();
//                 boolean iGSTField4IsSelected = iGSTField4FocusedElement.equals(iGSTField31);
//                 assertTrue(iGSTField4IsSelected, "IGST Field4 is not Selected");
//                 iGSTField31.clear();
//                 iGSTField31.sendKeys(igst2);
//                 
//                 //Verify the CGST Field4 in General Tab
//                 boolean cGSTField4Field4IsDisplayed = cGSTField31.isDisplayed();
//                 assertTrue(cGSTField4Field4IsDisplayed, "CGST Field4 is not Displayed.");
//                 cGSTField31.sendKeys(Keys.ENTER);
//                 WebElement cGSTField4FocusedElement = driver.switchTo().activeElement();
//                 boolean cGSTField4IsSelected = cGSTField4FocusedElement.equals(cGSTField31);
//                 assertTrue(cGSTField4IsSelected, "CGST Field4 is not Selected");
//                 cGSTField31.clear();
//                 cGSTField31.sendKeys(cgst2);
//                 
//                 //Verify the SGST Field4 in General Tab
//                 boolean sGSTField4Field4IsDisplayed = sGSTField31.isDisplayed();
//                 assertTrue(sGSTField4Field4IsDisplayed, "SGST Field4 is not Displayed.");
//                 sGSTField31.sendKeys(Keys.ENTER);
//                 WebElement sGSTField4FocusedElement = driver.switchTo().activeElement();
//                 boolean sGSTField4IsSelected = sGSTField4FocusedElement.equals(sGSTField31);
//                 assertTrue(sGSTField4IsSelected, "SGST Field4 is not Selected");
//                 sGSTField31.clear();
//                 sGSTField31.sendKeys(sgst2);
//                 
//                 //Verify the UTGST Field4 in General Tab
//                 boolean uTGSTField4Field4IsDisplayed = uTGSTField31.isDisplayed();
//                 assertTrue(uTGSTField4Field4IsDisplayed, "UTGST Field4 is not Displayed.");
//                 uTGSTField31.sendKeys(Keys.ENTER);
//                 WebElement uTGSTField4FocusedElement = driver.switchTo().activeElement();
//                 boolean uTGSTField4IsSelected = uTGSTField4FocusedElement.equals(uTGSTField31);
//                 assertTrue(uTGSTField4IsSelected, "UTGST Field4 is not Selected");
//                 uTGSTField31.clear();
//                 uTGSTField31.sendKeys(utgst2); 

		// ################## Total Calculation Tab ######################

		// Verify and Click on Total Calculation Tab
		click(driver, totalCalculationTab);
		// Scroll To View
		// ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",
		// driver.findElement(By.xpath("//label[text()='Customer Alias Name']")));

		// Verify and Click on Is these required to be printed in quote Toggle Button in
		click(driver, toggleButton);
		click(driver, toggleButton);

		// Verify the Additional Charges Label Name Drop Down in Quote Create Page-Sales
		click(driver, additionalChargesLabel);
		isSelected(driver, additionalChargesLabel, "additionalChargesLabel");
		click(driver, additionalChargesLabelSelect);

		// Verify the additionalChargesValue Field3 in General Tab
		click(driver, additinalChargesValue);
		isSelected(driver, additinalChargesValue, "additinalChargesValue");
		additinalChargesValue.clear();
		additinalChargesValue.sendKeys(additinalCharges);

		// Verify and Click on Add Button in Total Calculation Tab
		click(driver, addButton);

		// Verify specialDiscount Percentage Radio Button3 in Total Calculation Tab
		WebElement specialDiscountPercentageRadioButton3 = driver
				.findElement(By.xpath("//input[@id='specialDiscTotPer']"));
		click(driver, specialDiscountPercentageRadioButton3);

		click(driver, specialDiscount);
		specialDiscount.sendKeys("5");

//           		//Verify specialDiscount Rupees Radio Button3 in Total Calculation Tab
//           		WebElement specialDiscountRupeesRadioButton3 = driver.findElement(By.xpath("//input[@id='specialDiscTotAmt']"));
//           	    boolean specialDiscountRupeesRadioButton3IsDisplayed = specialDiscountRupeesRadioButton3.isDisplayed();
//           	    assertTrue(specialDiscountRupeesRadioButton3IsDisplayed, "specialDiscount Rupees Radio Button3 is not Displayed.");
//           	    specialDiscountRupeesRadioButton3.click();
//                   
//                   //Verify the Special Discount Field5 in Total Calculation Tab
//                   WebElement specialDiscountField5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Special Discount']")));
//                   boolean specialDiscountField5IsDisplayed = specialDiscountField5.isDisplayed();
//                   assertTrue(specialDiscountField5IsDisplayed, "Special Discount Field5 is not Displayed.");
//                   specialDiscountField5.sendKeys(Keys.ENTER);
//                   WebElement specialDiscountField5FocusedElement = driver.switchTo().activeElement();
//                   boolean specialDiscountField5IsSelected = specialDiscountField5FocusedElement.equals(specialDiscountField5);
//                   assertTrue(specialDiscountField5IsSelected, "Special Discount Field5 is not Selected");
//                   specialDiscountField5.clear();
//                   specialDiscountField5.sendKeys("20");
//                   
		// Verify the Payment Terms Drop Down in Quote Create Page-Sales Module
		click(driver,paymentTerms);
		isSelected(driver, paymentTerms, "paymentTerms");
		click(driver, paymentTermsSelect);

		// ################## RFQ Notes Tab ######################

		// Verify and Click on RFQ Notes Tab
		click(driver, rfqNotesTab);

		// Verify the Select RFQ Notes Drop Down in Quote Create Page-Sales Module
		click(driver, rfqNotes);
		isSelected(driver, rfqNotes, "rfqNotes");
		click(driver, rfqNotesSelect);

		// ################## Other Terms Tab ######################

		// Verify and Click on Other Terms Tab
		click(driver, otherTermsTab);

		// Verify the Select Other Terms Drop Down in Quote Create Page-Sales Module
		click(driver, OtherTermDropdown);
		isSelected(driver, OtherTermDropdown, "OtherTermDropdown");
		click(driver, OtherTermDropdownSelect);

		// ################## Special Terms Tab ######################

		// Verify and Click on Special Terms Tab
		click(driver, specialTermsTab);

		// Verify the Special Terms Field in Quote Create Page-Sales Module
		click(driver, specialTermsField);
		isSelected(driver, specialTermsField, "specialTermsField");
		specialTermsField.sendKeys(specialTerms);

		// Verify and Click on Add Button in Special Terms Tab
		click(driver, addButton);

		// Verify and Click on Save Button in Quote Create Page
		click(driver, saveButton);
		return new HomePage();

	}

}
