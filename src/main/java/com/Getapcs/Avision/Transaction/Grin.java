package com.Getapcs.Avision.Transaction;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class Grin extends TestBase {

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement venderNameDropDown;
	@FindBy(xpath = "(//span[normalize-space()='ABSOLUTE COMPOSITES PRIVATE LIMITED'])[1]")
	WebElement selectVenderNameDropDownValue;

	@FindBy(xpath = "//label[normalize-space(text())='Vendor Id']/following-sibling::div/input[@formcontrolname='vendorNumber']")
	WebElement venderIdField;

	@FindBy(xpath = "//input[@placeholder='Enter Invoice Number']")
	WebElement invoiceNumberField;

	@FindBy(xpath = "//input[@formcontrolname='invoiceDate']")
	WebElement invoiceDatePicker;

	@FindBy(xpath = "(//input[@formcontrolname='gateEntryDate'])[1]")
	WebElement gateEntryDatePicker;

	@FindBy(xpath = "(//input[@placeholder='Gate Entry Number'])[1]")
	WebElement gateEntryNumber;

	@FindBy(linkText = "Items")
	WebElement itemTab;

	@FindBy(xpath = "(//input[@placeholder='Upload file'])[1]")
	WebElement uploadFiles;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Close'])[13]")
	WebElement fileCloseButton;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement poNumberField;
	@FindBy(xpath = "//span[contains(text(),'TISPL-MFPO-1080-0019')]")
	WebElement selectPOnumberFieldValue;

	@FindBy(xpath = "//input[@role='combobox']")
	WebElement itemOrDescriptionNumberField;
	@FindBy(xpath = "//span[contains(text(),'ECB0002-111M INS. SINGLE END SLEEVE 0.25MM, 24# VI')]")
	WebElement selectItemOrDescriptionNumberFieldValue;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement mftrBatchNoNumberField;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement unitPriceField;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	WebElement quantityField;

	@FindBy(xpath = "(//i[@title='Add Project'])[1]")
	WebElement addProjectButton;

	@FindBy(xpath = "//i[@class='mdi mdi-delete edit-icon']")
	WebElement addProjectPopUp;

	@FindBy(xpath = "(//input[@type='text'])[15]")
	WebElement projectNumberDropDown;
	@FindBy(xpath = "//span[normalize-space()='TISPL-1080']")
	WebElement selectProjectNumberDropDownValue;

	@FindBy(xpath = "//input[@placeholder='Enter Quantity']")
	WebElement projectQuantityField;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addButton;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[2]")
	WebElement saveButton1;

	@FindBy(xpath = "(//input[@type='date'])[4]")
	WebElement manufactureDatePicker;

	@FindBy(xpath = "(//input[@type='date'])[3]")
	WebElement expiryDate;

	@FindBy(xpath = "//input[@placeholder='Upload file']")
	WebElement cocUploadFiles;

	@FindBy(xpath = "//i[@title='Add Taxes']")
	WebElement taxesButton;

	@FindBy(xpath = "//input[@placeholder='Enter SGST']")
	WebElement sGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter CGST']")
	WebElement cGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter IGST']")
	WebElement iGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter UTGST']")
	WebElement uTGSTField;

	@FindBy(xpath = "(//input[@type='date'])[14]")
	WebElement remarksField;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Save'])[1]")
	WebElement saveButtonInAddTaxesPOPUP;

	// Freight Charges Tab

	@FindBy(linkText = "Freight Charges")
	WebElement freightChargesTab;

	@FindBy(xpath = "//input[@placeholder='Enter AWB Number 1']")
	WebElement awbNumberField1;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[3]")
	WebElement awbDatePicker1;

	@FindBy(xpath = "//input[@placeholder='AWB Number 2']")
	WebElement awbNumberField2;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[4]")
	WebElement awbDatePicker2;

	@FindBy(xpath = "//input[@placeholder='Enter B/E Number']")
	WebElement beNumberField;

	@FindBy(xpath = "//input[@formcontrolname='be_Date']")
	WebElement beDatePicker;

	@FindBy(xpath = "//input[@placeholder='BE Currency Value']")
	WebElement beCurrencyValueField;

	@FindBy(linkText = "Other Cost")
	WebElement otherCostTab;

	@FindBy(xpath = "//input[@placeholder='Enter Freight']")
	WebElement freightField;

	@FindBy(xpath = "//input[@placeholder='Insurance']")
	WebElement insuranceField;

	@FindBy(xpath = "//input[@formcontrolname='loadingOrUnloading']")
	WebElement loadingOrUnloadingField;

	@FindBy(xpath = "//input[@placeholder='Enter Currency Conversion']")
	WebElement currencyConversionField;

	@FindBy(xpath = "//input[@placeholder='Transport']")
	WebElement transportField;

	@FindBy(linkText = "Other Charges")
	WebElement OtherChargesTab;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement otherChargesDropDown;
	@FindBy(xpath = "//input[@placeholder='Enter UTGST']")
	WebElement selectOtherChargesDropDownValue;

	@FindBy(xpath = "//input[@placeholder='Other Charges Value']")
	WebElement otherChargesValueField;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public Grin() {
		PageFactory.initElements(driver, this);
	}

	public HomePage grinCreatePage(String invoiceNo, // TEST-IN-1122
			String invoiceGST, // 10
			String totalInvoice, // 10
			String mftrBatchNo, // 67356743
			String unitPrice, // 10

			String sgst, // 9
			String cgst, // 9
			String igst, // 9
			String utgst, // 9
			String awbNo1, // AWB-1-5657
			String awbNo2, // AWB-2-5657
			String beNo, // BE-557
			String beCurrencyValue, // 80
			String freight, // 10
			String insurance, // 10
			String loadingOrUnloading, // 10
			String currencyConversion, // 80
			String transport, // 10
			String otherChargesValue) throws Throwable {

		System.out.println("Grin Create Page");

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first po number text from table
		String poNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		System.out.println(poNumber);

		// Store the element with hard coded PR number
		String elementXpath = "//span[normalize-space()='031023PR-00002']";

		String updatedXpath = elementXpath.replace("031023PR-00002", poNumber);

		System.out.println(updatedXpath);

		Thread.sleep(3000);

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/item-master/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		String itemNumber = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[2]/td[2]")).getText();

		System.out.println(itemNumber);

		String elementXpath1 = "//span[normalize-space()='031023PR-00002']";

		String updatedXpath1 = elementXpath1.replace("031023PR-00002", itemNumber + "-Test Description");

		System.out.println(updatedXpath1);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/sales-order/table");

		String tableXpath2 = "//table[@class='table table-striped']";

		String ProjectNumber = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[4]")).getText();

		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath2 = elementXpath2.replace("Item-FG-11-TEST", ProjectNumber);
		System.out.println(updatedXpath2);

		Thread.sleep(3000);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/grin/create");

		// Verify and Select Value from Vender Name DropDown in GRIN Create-Transaction
		// Module
//        WebElement venderNameDropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[1]")));
		boolean venderNameDropDownIsDisplayed = venderNameDropDown.isDisplayed();
		assertTrue(venderNameDropDownIsDisplayed, "Vender Name DropDown is not Displayed.");
		venderNameDropDown.sendKeys(Keys.ENTER);
		WebElement venderNameDropDownFocusedElement = driver.switchTo().activeElement();
		boolean venderNameDropDownIsSelected = venderNameDropDownFocusedElement.equals(venderNameDropDown);
		assertTrue(venderNameDropDownIsSelected, "Vender Name DropDown is not Selected");
		Thread.sleep(2);
		selectVenderNameDropDownValue.click();

//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();" ,driver.findElement(By.xpath("//span[contains(text(),'SUMITRON EXPORTS PVT LTD')]")));

		// Verify and Select Value from Vender Id Field in GRIN Create-Transaction
		// Module
//        WebElement venderIdField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[normalize-space(text())='Vendor Id']/following-sibling::div/input[@formcontrolname='vendorId']")));
		boolean venderIdFieldIsDisplayed = venderIdField.isDisplayed();
		assertTrue(venderIdFieldIsDisplayed, "Vender Id Field is not Displayed.");
		// To extract Value Attribute and use same approach to retrieve
		String venderIdFieldValue = (String) js.executeScript("return arguments[0].value;", venderIdField);
		System.out.println("Vender ID : " + venderIdFieldValue + "\n");

		// Verify and Select Value from Invoice Number Field in GRIN Create-Transaction
		// Module
//        WebElement invoiceNumberField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Enter Invoice Number']")));
		boolean invoiceNumberFieldIsDisplayed = invoiceNumberField.isDisplayed();
		assertTrue(invoiceNumberFieldIsDisplayed, "Invoice Number Field is not Displayed.");
		invoiceNumberField.sendKeys(Keys.ENTER);
		WebElement invoiceNumberFieldFocusedElement = driver.switchTo().activeElement();
		boolean invoiceNumberFieldIsSelected = invoiceNumberFieldFocusedElement.equals(invoiceNumberField);
		assertTrue(invoiceNumberFieldIsSelected, "Invoice Number Field is not Selected");
		invoiceNumberField.sendKeys(invoiceNo);

		// Verify and Invoice Date Picker in GRIN Create
//        WebElement invoiceDatePicker = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='invoiceDate']")));
		boolean invoiceDatePickerIsDisplayed = invoiceDatePicker.isDisplayed();
		assertTrue(invoiceDatePickerIsDisplayed, "Invoice Date Picker is not Displayed.");
		invoiceDatePicker.click();
		// invoiceDatePicker
		WebElement invoiceDatePickerFocusedElement = driver.switchTo().activeElement();
		boolean invoiceDatePickerIsSelected = invoiceDatePickerFocusedElement.equals(invoiceDatePicker);
		assertTrue(invoiceDatePickerIsSelected, "Schedule Date Picker is not Selected");
		for (int j = 0; j < 3; j++) {
			invoiceDatePicker.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(300); // Add a small delay if needed
		}
		invoiceDatePicker.sendKeys(Keys.ARROW_RIGHT);
		invoiceDatePicker.sendKeys(Keys.ARROW_RIGHT);
		invoiceDatePicker.sendKeys(Keys.ENTER);

		// Verify and Gate Entry Date Picker in GRIN Create
//        WebElement gateEntryDatePicker = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='gateEntryDate']")));
		boolean gateEntryDatePickerIsDisplayed = gateEntryDatePicker.isDisplayed();
		assertTrue(gateEntryDatePickerIsDisplayed, "Gate Entry Date Picker is not Displayed.");
		gateEntryDatePicker.click();

		// gateEntryDatePicker
		WebElement gateEntryDatePickerFocusedElement = driver.switchTo().activeElement();
		boolean gateEntryDatePickerIsSelected = gateEntryDatePickerFocusedElement.equals(gateEntryDatePicker);
		assertTrue(gateEntryDatePickerIsSelected, "Gate Entry Date Picker is not Selected");
		for (int j = 0; j < 3; j++) {
			gateEntryDatePicker.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(300); // Add a small delay if needed
		}
		gateEntryDatePicker.sendKeys(Keys.ARROW_RIGHT);
		gateEntryDatePicker.sendKeys(Keys.ARROW_RIGHT);
		gateEntryDatePicker.sendKeys(Keys.ENTER);

		click(driver, gateEntryNumber);

		gateEntryNumber.sendKeys("1234");
		// ################## Item Tab ######################

		// Verify Item Tab in GRIN Create-Transaction Module
//  		WebElement itemTab = driver.findElement(By.linkText("Items"));
		boolean itemTabIsDisplayed = itemTab.isDisplayed();
		assertTrue(itemTabIsDisplayed, "item Tab is not Displayed.");
		itemTab.click();

		// Verifying and Upload Files in Grin Create
//  		WebElement uploadFiles = driver.findElement(By.xpath("//input[@placeholder='Upload Items']"));

		// Verify and Select Value from po Number Field in GRIN Create-Transaction
		// Module
//        WebElement poNumberField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[7]")));
		boolean poNumberFieldIsDisplayed = poNumberField.isDisplayed();
		assertTrue(poNumberFieldIsDisplayed, "po Number Field is not Displayed.");
		poNumberField.sendKeys(Keys.ENTER);
		WebElement poNumberFieldFocusedElement = driver.switchTo().activeElement();
		boolean poNumberFieldIsSelected = poNumberFieldFocusedElement.equals(poNumberField);
		assertTrue(poNumberFieldIsSelected, "po Number Field is not Selected");

		WebElement selectPOnumberFieldValue = driver.findElement(By.xpath(updatedXpath));
		js.executeScript("arguments[0].click();", selectPOnumberFieldValue);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();" ,driver.findElement(By.xpath("//span[contains(text(),'TISPL-MFPO-1080-0019')]")));

		// Verify and Select Value from Invoice Number Field in GRIN Create-Transaction
		// Module
//        WebElement itemOrDescriptionNumberField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@role='combobox'])[1]")));
		boolean itemOrDescriptionNumberFieldIsDisplayed = itemOrDescriptionNumberField.isDisplayed();
		assertTrue(itemOrDescriptionNumberFieldIsDisplayed, "itemOrDescription Number Field is not Displayed.");
		itemOrDescriptionNumberField.click();
		Thread.sleep(2000);
		WebElement itemOrDescriptionNumberFieldFocusedElement = driver.switchTo().activeElement();
		boolean itemOrDescriptionNumberFieldIsSelected = itemOrDescriptionNumberFieldFocusedElement
				.equals(itemOrDescriptionNumberField);
		assertTrue(itemOrDescriptionNumberFieldIsSelected, "Item or Description Number Field is not Selected");

		WebElement selectItemOrDescriptionNumberFieldValue = driver.findElement(By.xpath(updatedXpath1));
		click(driver, selectItemOrDescriptionNumberFieldValue);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();" ,driver.findElement(By.xpath("//span[contains(text(),'ECB0002-111M INS. SINGLE END SLEEVE 0.25MM, 24# VI')]")));

		// Verify and Select Value from Mftr Batch No Number Field in GRIN
		// Create-Transaction Module
//        WebElement mftrBatchNoNumberField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[10]")));
		boolean mftrBatchNoNumberFieldIsDisplayed = mftrBatchNoNumberField.isDisplayed();
		assertTrue(mftrBatchNoNumberFieldIsDisplayed, "Mftr Batch No Number Field is not Displayed.");
		mftrBatchNoNumberField.sendKeys(Keys.ENTER);
		WebElement mftrBatchNoNumberFieldFocusedElement = driver.switchTo().activeElement();
		boolean mftrBatchNoNumberFieldIsSelected = mftrBatchNoNumberFieldFocusedElement.equals(mftrBatchNoNumberField);
		assertTrue(mftrBatchNoNumberFieldIsSelected, "Mftr Batch No Number Field is not Selected");
		mftrBatchNoNumberField.sendKeys(mftrBatchNo);

		// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
//        WebElement unitPriceField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='text'])[11]")));
		boolean unitPriceFieldIsDisplayed = unitPriceField.isDisplayed();
		assertTrue(unitPriceFieldIsDisplayed, "Unit Price Field is not Displayed.");
		unitPriceField.sendKeys(Keys.ENTER);
		WebElement unitPriceFieldFocusedElement = driver.switchTo().activeElement();
		boolean unitPriceFieldIsSelected = unitPriceFieldFocusedElement.equals(unitPriceField);
		assertTrue(unitPriceFieldIsSelected, "Unit Price Field is not Selected");
		unitPriceField.clear();
		unitPriceField.sendKeys(unitPrice);

		datePicker(driver, expiryDate);

		datePicker(driver, manufactureDatePicker);

		// Verifying and Coc Upload Files in Grin Create
//  		WebElement cocUploadFiles = driver.findElement(By.xpath("//input[@placeholder='Upload file']"));

		uploadFile(driver, cocUploadFiles, 3);

		// Verify Taxes Button in Add Project Pop-UP
//          WebElement taxesButton = driver.findElement(By.xpath("//i[@title='Add Taxes']"));
		boolean taxesButton1IsDisplayed = taxesButton.isDisplayed();
		assertTrue(taxesButton1IsDisplayed, "Taxes Button Expansion Panel is not Displayed.");
		taxesButton.click();

		// Verify and Enter Value in SGST Field in GRIN Create-Transaction Module
//          WebElement sGSTField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Enter SGST']")));
		boolean sGSTFieldIsDisplayed = sGSTField.isDisplayed();
		assertTrue(sGSTFieldIsDisplayed, "Unit Price Field is not Displayed.");
		sGSTField.sendKeys(Keys.ENTER);
		WebElement sGSTFieldFocusedElement = driver.switchTo().activeElement();
		boolean sGSTFieldIsSelected = sGSTFieldFocusedElement.equals(sGSTField);
		assertTrue(sGSTFieldIsSelected, "Unit Price Field is not Selected");
		sGSTField.clear();
		sGSTField.sendKeys(sgst);

		// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
//          WebElement cGSTField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Enter CGST']")));
		boolean cGSTFieldIsDisplayed = cGSTField.isDisplayed();
		assertTrue(cGSTFieldIsDisplayed, "Unit Price Field is not Displayed.");
		cGSTField.sendKeys(Keys.ENTER);
		WebElement cGSTFieldFocusedElement = driver.switchTo().activeElement();
		boolean cGSTFieldIsSelected = cGSTFieldFocusedElement.equals(cGSTField);
		assertTrue(cGSTFieldIsSelected, "Unit Price Field is not Selected");
		cGSTField.clear();
		cGSTField.sendKeys(cgst);

		// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
//          WebElement iGSTField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Enter IGST']")));
		boolean iGSTFieldIsDisplayed = iGSTField.isDisplayed();
		assertTrue(iGSTFieldIsDisplayed, "Unit Price Field is not Displayed.");
		iGSTField.sendKeys(Keys.ENTER);
		WebElement iGSTFieldFocusedElement = driver.switchTo().activeElement();
		boolean iGSTFieldIsSelected = iGSTFieldFocusedElement.equals(iGSTField);
		assertTrue(iGSTFieldIsSelected, "Unit Price Field is not Selected");
		iGSTField.clear();
		iGSTField.sendKeys("9");

		// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
//          WebElement uTGSTField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Enter UTGST']")));
		boolean uTGSTFieldIsDisplayed = uTGSTField.isDisplayed();
		assertTrue(uTGSTFieldIsDisplayed, "Unit Price Field is not Displayed.");
		uTGSTField.sendKeys(Keys.ENTER);
		WebElement uTGSTFieldFocusedElement = driver.switchTo().activeElement();
		boolean uTGSTFieldIsSelected = uTGSTFieldFocusedElement.equals(uTGSTField);
		assertTrue(uTGSTFieldIsSelected, "Unit Price Field is not Selected");
		uTGSTField.clear();
		uTGSTField.sendKeys(utgst);

		click(driver, remarksField);

		remarksField.sendKeys("TEST");

		// Verify save Button in Add Taxes Pop-UP
//          WebElement saveButtonInAddTaxesPOPUP = driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Save'])[1]"));
		boolean saveButtonInAddTaxesPOPUP1IsDisplayed = saveButtonInAddTaxesPOPUP.isDisplayed();
		assertTrue(saveButtonInAddTaxesPOPUP1IsDisplayed,
				"save Button in Add Taxes Pop-Up Expansion Panel is not Displayed.");
		saveButtonInAddTaxesPOPUP.click();

		// Verify Freight Charges Tab
		boolean freightChargesTabIsDisplayed = freightChargesTab.isDisplayed();
		assertTrue(freightChargesTabIsDisplayed, "Freight Charges Tab is not Displayed.");
		freightChargesTab.click();

		// Verify AWB Number Field 1
		boolean awbNumberField1IsDisplayed = awbNumberField1.isDisplayed();
		assertTrue(awbNumberField1IsDisplayed, "AWB Number Field 1 is not Displayed.");
		awbNumberField1.click();
		WebElement awbNumberField1FocusedElement = driver.switchTo().activeElement();
		boolean awbNumberField1IsSelected = awbNumberField1FocusedElement.equals(awbNumberField1);
		assertTrue(awbNumberField1IsSelected, "AWB Number Field 1 is not Selected");
		awbNumberField1.sendKeys(awbNo1);

		// Verify AWB Date Picker 1
		boolean awbDatePicker1IsDisplayed = awbDatePicker1.isDisplayed();
		assertTrue(awbDatePicker1IsDisplayed, "AWB Date Picker 1 is not Displayed.");
		awbDatePicker1.click();
		// invoiceDatePicker
		WebElement awbDatePicker1FocusedElement = driver.switchTo().activeElement();
		boolean awbDatePicker1IsSelected = awbDatePicker1FocusedElement.equals(awbDatePicker1);
		assertTrue(awbDatePicker1IsSelected, "AWB Date Picker1 is not Selected");
		for (int j = 0; j < 3; j++) {
			awbDatePicker1.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(300); // Add a small delay if needed
		}
		awbDatePicker1.sendKeys(Keys.ARROW_RIGHT);
		awbDatePicker1.sendKeys(Keys.ARROW_RIGHT);
		awbDatePicker1.sendKeys(Keys.ENTER);

		// Verify AWB Number Field 2
		boolean awbNumberField2IsDisplayed = awbNumberField2.isDisplayed();
		assertTrue(awbNumberField2IsDisplayed, "AWB Number Field 2 is not Displayed.");
		awbNumberField2.click();
		WebElement awbNumberField2FocusedElement = driver.switchTo().activeElement();
		boolean awbNumberField2IsSelected = awbNumberField2FocusedElement.equals(awbNumberField2);
		assertTrue(awbNumberField2IsSelected, "AWB Number Field 2 is not Selected");
		awbNumberField2.sendKeys(awbNo2);

		// Verify AWB Date Picker 2
		boolean awbDatePicker2IsDisplayed = awbDatePicker2.isDisplayed();
		assertTrue(awbDatePicker2IsDisplayed, "AWB Date Picker 2 is not Displayed.");
		awbDatePicker2.click();
		// invoiceDatePicker
		WebElement awbDatePicker2FocusedElement = driver.switchTo().activeElement();
		boolean awbDatePicker2IsSelected = awbDatePicker2FocusedElement.equals(awbDatePicker2);
		assertTrue(awbDatePicker2IsSelected, "AWB Date Picker2 is not Selected");
		for (int j = 0; j < 3; j++) {
			awbDatePicker2.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(300); // Add a small delay if needed
		}
		awbDatePicker2.sendKeys(Keys.ARROW_RIGHT);
		awbDatePicker2.sendKeys(Keys.ARROW_RIGHT);
		awbDatePicker2.sendKeys(Keys.ENTER);

		// Verify B/E Number Field
		boolean beNumberFieldIsDisplayed = beNumberField.isDisplayed();
		assertTrue(beNumberFieldIsDisplayed, " B/E Number Field is not Displayed.");
		beNumberField.click();
		WebElement beNumberFieldFocusedElement = driver.switchTo().activeElement();
		boolean beNumberFieldIsSelected = beNumberFieldFocusedElement.equals(beNumberField);
		assertTrue(beNumberFieldIsSelected, " B/E Number Field is not Selected");
		beNumberField.sendKeys(beNo);

		// Verify B/E Date Picker
		boolean beDatePickerIsDisplayed = beDatePicker.isDisplayed();
		assertTrue(beDatePickerIsDisplayed, "B/E Date is not Displayed.");
		beDatePicker.click();
		// B/E Date Picker
		WebElement beDatePickerFocusedElement = driver.switchTo().activeElement();
		boolean beDatePickerIsSelected = beDatePickerFocusedElement.equals(beDatePicker);
		assertTrue(beDatePickerIsSelected, "B/E Date Picker is not Selected");
		for (int j = 0; j < 3; j++) {
			beDatePicker.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(300); // Add a small delay if needed
		}
		beDatePicker.sendKeys(Keys.ARROW_RIGHT);
		beDatePicker.sendKeys(Keys.ARROW_RIGHT);
		beDatePicker.sendKeys(Keys.ENTER);

		// Verify B/E Currency Value Field
		boolean beCurrencyValueFieldIsDisplayed = beCurrencyValueField.isDisplayed();
		assertTrue(beCurrencyValueFieldIsDisplayed, "B/E Currency Value Field is not Displayed.");
		beCurrencyValueField.click();
		WebElement beCurrencyValueFieldFocusedElement = driver.switchTo().activeElement();
		boolean beCurrencyValueFieldIsSelected = beCurrencyValueFieldFocusedElement.equals(beCurrencyValueField);
		assertTrue(beCurrencyValueFieldIsSelected, "B/E Currency Value Field is not Selected");
		beCurrencyValueField.sendKeys(beCurrencyValue);

		// Verify Other Cost Tab
		boolean otherCostTabIsDisplayed = otherCostTab.isDisplayed();
		assertTrue(otherCostTabIsDisplayed, "Other Cost Tab is not Displayed.");
		otherCostTab.click();

		// Verify Freight Field
		boolean freightFieldIsDisplayed = freightField.isDisplayed();
		assertTrue(freightFieldIsDisplayed, "Freight Field is not Displayed.");
		freightField.click();
		WebElement freightFieldFocusedElement = driver.switchTo().activeElement();
		boolean freightFieldIsSelected = freightFieldFocusedElement.equals(freightField);
		assertTrue(freightFieldIsSelected, "Freight Field is not Selected");
		freightField.sendKeys(freight);

		// Verify Insurance Field
		boolean insuranceFieldIsDisplayed = insuranceField.isDisplayed();
		assertTrue(insuranceFieldIsDisplayed, "Insurance Field is not Displayed.");
		insuranceField.click();
		WebElement insuranceFieldFocusedElement = driver.switchTo().activeElement();
		boolean insuranceFieldIsSelected = insuranceFieldFocusedElement.equals(insuranceField);
		assertTrue(insuranceFieldIsSelected, "Insurance Field is not Selected");
		insuranceField.sendKeys(insurance);

		// Verify Loading Or Unloading Field
		boolean loadingOrUnloadingFieldIsDisplayed = loadingOrUnloadingField.isDisplayed();
		assertTrue(loadingOrUnloadingFieldIsDisplayed, "Loading Or Unloading Field is not Displayed.");
		loadingOrUnloadingField.click();
		WebElement loadingOrUnloadingFieldFocusedElement = driver.switchTo().activeElement();
		boolean loadingOrUnloadingFieldIsSelected = loadingOrUnloadingFieldFocusedElement
				.equals(loadingOrUnloadingField);
		assertTrue(loadingOrUnloadingFieldIsSelected, "Loading Or Unloading Field is not Selected");
		loadingOrUnloadingField.sendKeys(loadingOrUnloading);

		// Verify Loading Or Unloading Field
		boolean currencyConversionFieldIsDisplayed = currencyConversionField.isDisplayed();
		assertTrue(currencyConversionFieldIsDisplayed, "Loading Or Unloading Field is not Displayed.");
		currencyConversionField.click();
		WebElement currencyConversionFieldFocusedElement = driver.switchTo().activeElement();
		boolean currencyConversionFieldIsSelected = currencyConversionFieldFocusedElement
				.equals(currencyConversionField);
		assertTrue(currencyConversionFieldIsSelected, "Loading Or Unloading Field is not Selected");
		currencyConversionField.sendKeys(currencyConversion);

		// Verify Transport Field
		boolean transportFieldIsDisplayed = transportField.isDisplayed();
		assertTrue(transportFieldIsDisplayed, "Transport Field is not Displayed.");
		transportField.click();
		WebElement transportFieldFocusedElement = driver.switchTo().activeElement();
		boolean transportFieldIsSelected = transportFieldFocusedElement.equals(transportField);
		assertTrue(transportFieldIsSelected, "Transport Field is not Selected");
		transportField.sendKeys(transport);

		/*
		 * //Verify Other Charges Tab boolean OtherChargesTabIsDisplayed =
		 * OtherChargesTab.isDisplayed(); assertTrue(OtherChargesTabIsDisplayed,
		 * "Other Charges Tab is not Displayed."); OtherChargesTab.click();
		 * 
		 * 
		 * //Verify Other Charges Value Field boolean otherChargesValueFieldIsDisplayed
		 * = otherChargesValueField.isDisplayed();
		 * assertTrue(otherChargesValueFieldIsDisplayed,
		 * "Other Charges Value Field is not Displayed.");
		 * otherChargesValueField.click(); WebElement
		 * otherChargesValueFieldFocusedElement = driver.switchTo().activeElement();
		 * boolean otherChargesValueFieldIsSelected =
		 * otherChargesValueFieldFocusedElement.equals(otherChargesValueField);
		 * assertTrue(otherChargesValueFieldIsSelected,
		 * "Other Charges Value Field is not Selected");
		 * otherChargesValueField.sendKeys(otherChargesValue);
		 * 
		 * 
		 * //Verify Add Button in Other Charges Tab boolean addButtonIsDisplayed =
		 * addButton.isDisplayed(); assertTrue(addButtonIsDisplayed,
		 * "Add Button is not Displayed."); addButton.click();
		 */

		// Verify Save Button in Add Project Pop-UP
//          WebElement saveButton = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		boolean saveButtonIsDisplayed = saveButton.isDisplayed();
		assertTrue(saveButtonIsDisplayed, "save ProjectButton Expansion Panel is not Displayed.");
		saveButton.click();

		return new HomePage();

	}

}
