package com.Getapcs.Avision.SA_FG.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class Grin_Create extends TestBase {

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement viewButton;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[2]")
	WebElement viewButton1;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[3]")
	WebElement viewButton2;

	@FindBy(xpath = "(//a[normalize-space()='Items'])[1]")
	WebElement itemsTab;

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
	@FindBy(xpath = "(//input[@type='text'])[15]")
	WebElement poNumberField1;
	@FindBy(xpath = "(//input[@type='text'])[25]")
	WebElement poNumberField2;
	@FindBy(xpath = "(//input[@type='text'])[35]")
	WebElement poNumberField3;
	@FindBy(xpath = "(//input[@type='text'])[45]")
	WebElement poNumberField4;
	@FindBy(xpath = "(//input[@type='text'])[55]")
	WebElement poNumberField5;

	@FindBy(xpath = "//span[contains(text(),'TISPL-MFPO-1080-0019')]")
	WebElement selectPOnumberFieldValue;

	@FindBy(xpath = "//input[@role='combobox']")
	WebElement itemOrDescriptionNumberField;
	@FindBy(xpath = "(//input[@type='text'])[16]")
	WebElement itemOrDescriptionNumberField1;
	@FindBy(xpath = "(//input[@type='text'])[26]")
	WebElement itemOrDescriptionNumberField2;
	@FindBy(xpath = "(//input[@type='text'])[36]")
	WebElement itemOrDescriptionNumberField3;
	@FindBy(xpath = "(//input[@type='text'])[46]")
	WebElement itemOrDescriptionNumberField4;
	@FindBy(xpath = "(//input[@type='text'])[56]")
	WebElement itemOrDescriptionNumberField5;

	@FindBy(xpath = "//span[contains(text(),'ECB0002-111M INS. SINGLE END SLEEVE 0.25MM, 24# VI')]")
	WebElement selectItemOrDescriptionNumberFieldValue;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement mftrBatchNoNumberField;
	@FindBy(xpath = "(//input[@type='text'])[18]")
	WebElement mftrBatchNoNumberField1;
	@FindBy(xpath = "(//input[@type='text'])[28]")
	WebElement mftrBatchNoNumberField2;
	@FindBy(xpath = "(//input[@type='text'])[38]")
	WebElement mftrBatchNoNumberField3;
	@FindBy(xpath = "(//input[@type='text'])[48]")
	WebElement mftrBatchNoNumberField4;
	@FindBy(xpath = "(//input[@type='text'])[58]")
	WebElement mftrBatchNoNumberField5;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	WebElement unitPriceField;
	@FindBy(xpath = "(//input[@type='text'])[19]")
	WebElement unitPriceField1;
	@FindBy(xpath = "(//input[@type='text'])[29]")
	WebElement unitPriceField2;
	@FindBy(xpath = "(//input[@type='text'])[39]")
	WebElement unitPriceField3;
	@FindBy(xpath = "(//input[@type='text'])[49]")
	WebElement unitPriceField4;
	@FindBy(xpath = "(//input[@type='text'])[59]")
	WebElement unitPriceField5;

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
	@FindBy(xpath = "(//input[@type='date'])[6]")
	WebElement manufactureDatePicker1;
	@FindBy(xpath = "(//input[@type='date'])[8]")
	WebElement manufactureDatePicker2;
	@FindBy(xpath = "(//input[@type='date'])[10]")
	WebElement manufactureDatePicker3;
	@FindBy(xpath = "(//input[@type='date'])[12]")
	WebElement manufactureDatePicker4;
	@FindBy(xpath = "(//input[@type='date'])[14]")
	WebElement manufactureDatePicker5;

	@FindBy(xpath = "(//input[@type='date'])[3]")
	WebElement expiryDate;
	@FindBy(xpath = "(//input[@type='date'])[5]")
	WebElement expiryDate1;
	@FindBy(xpath = "(//input[@type='date'])[7]")
	WebElement expiryDate2;
	@FindBy(xpath = "(//input[@type='date'])[9]")
	WebElement expiryDate3;
	@FindBy(xpath = "(//input[@type='date'])[11]")
	WebElement expiryDate4;
	@FindBy(xpath = "(//input[@type='date'])[13]")
	WebElement expiryDate5;

	@FindBy(xpath = "//input[@placeholder='Upload file']")
	WebElement cocUploadFiles;
	@FindBy(xpath = "(//input[@placeholder='Upload file'])[2]")
	WebElement cocUploadFiles1;
	@FindBy(xpath = "(//input[@placeholder='Upload file'])[3]")
	WebElement cocUploadFiles2;
	@FindBy(xpath = "(//input[@placeholder='Upload file'])[4]")
	WebElement cocUploadFiles3;
	@FindBy(xpath = "(//input[@placeholder='Upload file'])[5]")
	WebElement cocUploadFiles4;
	@FindBy(xpath = "(//input[@placeholder='Upload file'])[6]")
	WebElement cocUploadFiles5;

	@FindBy(xpath = "//i[@title='Add Taxes']")
	WebElement taxesButton;
	@FindBy(xpath = "(//i[@title='Add Taxes'])[2]")
	WebElement taxesButton1;
	@FindBy(xpath = "(//i[@title='Add Taxes'])[3]")
	WebElement taxesButton2;
	@FindBy(xpath = "(//i[@title='Add Taxes'])[4]")
	WebElement taxesButton3;
	@FindBy(xpath = "(//i[@title='Add Taxes'])[5]")
	WebElement taxesButton4;
	@FindBy(xpath = "(//i[@title='Add Taxes'])[6]")
	WebElement taxesButton5;

	@FindBy(xpath = "//input[@placeholder='Enter SGST']")
	WebElement sGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter CGST']")
	WebElement cGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter IGST']")
	WebElement iGSTField;

	@FindBy(xpath = "//input[@placeholder='Enter UTGST']")
	WebElement uTGSTField;

	@FindBy(xpath = "(//input[@type='text'])[14]")
	WebElement remarksField;
	@FindBy(xpath = "(//input[@type='text'])[24]")
	WebElement remarksField1;
	@FindBy(xpath = "(//input[@type='text'])[34]")
	WebElement remarksField2;
	@FindBy(xpath = "(//input[@type='text'])[44]")
	WebElement remarksField3;
	@FindBy(xpath = "(//input[@type='text'])[54]")
	WebElement remarksField4;
	@FindBy(xpath = "(//input[@type='text'])[64]")
	WebElement remarksField5;

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

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement otherChargesDropDown;
	@FindBy(xpath = "//span[text()='PACKING CHARGES']")
	WebElement selectOtherChargesDropDownValue;

	@FindBy(xpath = "//input[@placeholder='Other Charges Value']")
	WebElement otherChargesValueField;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public Grin_Create() {
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

		String poNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[3]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpathPO = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpathPO = elementXpathPO.replace("PP-54", poNumber);

		System.out.println(updatedXpathPO);

		String poNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpathPO1 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpathPO1 = elementXpathPO1.replace("PP-54", poNumber1);

		System.out.println(updatedXpathPO1);

		String poNumber2 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpathPO2 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpathPO2 = elementXpathPO2.replace("PP-54", poNumber2);

		System.out.println(updatedXpathPO2);

		click(driver, viewButton2);

		click(driver, itemsTab);

		// Get the first PR number text from table
		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[1]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1 + "-Test Description");

		System.out.println(updatedXpath);

		// Get the first PR number text from table
		String partType2 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[1]")).getText();

		// Store the element with hard coded PR numbers
		String elementXpath1 = "(//span[normalize-space()='PP-54'])[1]";

		String updatedXpath1 = elementXpath1.replace("PP-54", partType2 + "-Test Description");

		System.out.println(updatedXpath1);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/table");

		click(driver, viewButton1);

		click(driver, itemsTab);

		// Get the first PR number text from table
		String partType3 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[1]")).getText();

		// Store the element with hard coded PR number
		String elementXpath3 = "(//span[normalize-space()='PP-54'])[1]";

		String updatedXpath3 = elementXpath3.replace("PP-54", partType3 + "-Test Description");

		System.out.println(updatedXpath3);

		// Get the first PR number text from table
		String partType4 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[1]")).getText();

		// Store the element with hard coded PR numbers
		String elementXpath4 = "(//span[normalize-space()='PP-54'])[1]";

		String updatedXpath4 = elementXpath4.replace("PP-54", partType4 + "-Test Description");

		System.out.println(updatedXpath4);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/table");

		click(driver, viewButton);

		click(driver, itemsTab);

		// Get the first PR number text from table
		String partType5 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[1]")).getText();

		// Store the element with hard coded PR number
		String elementXpath5 = "(//span[normalize-space()='PP-54'])[1]";

		String updatedXpath5 = elementXpath5.replace("PP-54", partType5 + "-Test Description");

		System.out.println(updatedXpath5);

		// Get the first PR number text from table
		String partType6 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[1]")).getText();

		// Store the element with hard coded PR numbers
		String elementXpath6 = "(//span[normalize-space()='PP-54'])[1]";

		String updatedXpath6 = elementXpath6.replace("PP-54", partType6 + "-Test Description");

		System.out.println(updatedXpath6);

		Thread.sleep(3000);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/grin/create");

		// Verify and Select Value from Vender Name DropDown in GRIN Create-Transaction

		click(driver, venderNameDropDown);
		isSelected(driver, venderNameDropDown, "venderNameDropDown");
		click(driver, selectVenderNameDropDownValue);

		// Verify and Select Value from Vender Id Field in GRIN Create-Transaction
		dataPrintFromInputtag(driver, venderIdField, "venderIdField");

		// Verify and Select Value from Invoice Number Field in GRIN Create-Transaction
		click(driver, invoiceNumberField);
		isSelected(driver, invoiceNumberField, "invoiceNumberField");
		invoiceNumberField.sendKeys(invoiceNo);

		// Verify and Invoice Date Picker in GRIN Create
		datePicker(driver, invoiceDatePicker);

		// Verify and Gate Entry Date Picker in GRIN Create
		datePicker(driver, gateEntryDatePicker);

		click(driver, gateEntryNumber);
		isSelected(driver, gateEntryNumber, "gateEntryNumber");
		gateEntryNumber.sendKeys("1234");
		// ################## Item Tab ######################

		// Verify Item Tab in GRIN Create-Transaction Module
		click(driver, itemTab);

		// Verifying and Upload Files in Grin Create

		for (int i = 1; i <= 2; i++) {

			if (i == 1) {
				// Verify and Select Value from po Number Field in GRIN Create-Transaction
				click(driver, poNumberField);
				isSelected(driver, poNumberField, "poNumberField");

				WebElement selectPOnumberFieldValue = driver.findElement(By.xpath(updatedXpathPO));
				click(driver, selectPOnumberFieldValue);

				// Verify and Select Value from Invoice Number Field in GRIN Create-Transaction
				click(driver, itemOrDescriptionNumberField);
				isSelected(driver, itemOrDescriptionNumberField, "itemOrDescriptionNumberField");

				System.out.println(updatedXpath);
				WebElement selectItemOrDescriptionNumberFieldValue = driver.findElement(By.xpath(updatedXpath));
				click(driver, selectItemOrDescriptionNumberFieldValue);

				// Verify and Select Value from Mftr Batch No Number Field in GRIN
				click(driver, mftrBatchNoNumberField);
				isSelected(driver, mftrBatchNoNumberField, "mftrBatchNoNumberField");
				mftrBatchNoNumberField.clear();
				mftrBatchNoNumberField.sendKeys(mftrBatchNo);

				// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
				click(driver, unitPriceField);
				isSelected(driver, unitPriceField, "unitPriceField");
				unitPriceField.clear();
				unitPriceField.sendKeys(unitPrice);

				datePicker(driver, expiryDate);

				datePicker(driver, manufactureDatePicker);

				// Verifying and Coc Upload Files in Grin Create
				uploadFile(driver, cocUploadFiles, 3);

				// Verify Taxes Button in Add Project Pop-UP
				click(driver, taxesButton);

				click(driver, remarksField);
				isSelected(driver, remarksField, "remarksField");
				remarksField.sendKeys("TEST-1");
			}
			if (i == 2) {
				// Verify and Select Value from po Number Field in GRIN Create-Transaction
				click(driver, poNumberField1);
				isSelected(driver, poNumberField1, "poNumberField1");

				WebElement selectPOnumberFieldValue = driver.findElement(By.xpath(updatedXpathPO));
				click(driver, selectPOnumberFieldValue);

				// Verify and Select Value from Invoice Number Field in GRIN Create-Transaction
				click(driver, itemOrDescriptionNumberField1);
				isSelected(driver, itemOrDescriptionNumberField1, "itemOrDescriptionNumberField1");

				System.out.println(updatedXpath1);
				WebElement selectItemOrDescriptionNumberFieldValue = driver.findElement(By.xpath(updatedXpath1));
				click(driver, selectItemOrDescriptionNumberFieldValue);

				// Verify and Select Value from Mftr Batch No Number Field in GRIN
				click(driver, mftrBatchNoNumberField1);
				isSelected(driver, mftrBatchNoNumberField1, "mftrBatchNoNumberField1");
				mftrBatchNoNumberField1.clear();
				mftrBatchNoNumberField1.sendKeys(mftrBatchNo);

				// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
				click(driver, unitPriceField1);
				isSelected(driver, unitPriceField1, "unitPriceField1");
				unitPriceField1.clear();
				unitPriceField1.sendKeys(unitPrice);

				datePicker(driver, expiryDate1);

				datePicker(driver, manufactureDatePicker1);

				// Verifying and Coc Upload Files in Grin Create
				uploadFile(driver, cocUploadFiles1, 3);

				// Verify Taxes Button in Add Project Pop-UP
				click(driver, taxesButton1);

				click(driver, remarksField1);
				isSelected(driver, remarksField1, "remarksField1");
				remarksField1.sendKeys("TEST-2");

			}

			// Verify and Enter Value in SGST Field in GRIN Create-Transaction Module
			click(driver, sGSTField);
			isSelected(driver, sGSTField, "sGSTField");
			sGSTField.clear();
			sGSTField.sendKeys(sgst);

			// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
			click(driver, cGSTField);
			isSelected(driver, cGSTField, "cGSTField");
			cGSTField.clear();
			cGSTField.sendKeys(cgst);

			// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
			click(driver, iGSTField);
			isSelected(driver, iGSTField, "iGSTField");
			iGSTField.clear();
			iGSTField.sendKeys("9");

			// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
			click(driver, uTGSTField);
			isSelected(driver, uTGSTField, "uTGSTField");
			uTGSTField.clear();
			uTGSTField.sendKeys(utgst);

			// Verify save Button in Add Taxes Pop-UP
			click(driver, saveButtonInAddTaxesPOPUP);

			click(driver, driver.findElement(By.xpath("//button[contains(text(),'Add')]")));
		}

		for (int j = 1; j <= 2; j++) {

			if (j == 1) {
				// Verify and Select Value from po Number Field in GRIN Create-Transaction
				click(driver, poNumberField2);
				isSelected(driver, poNumberField2, "poNumberField2");

				WebElement selectPOnumberFieldValue = driver.findElement(By.xpath(updatedXpathPO1));
				click(driver, selectPOnumberFieldValue);

				// Verify and Select Value from Invoice Number Field in GRIN Create-Transaction
				click(driver, itemOrDescriptionNumberField2);
				isSelected(driver, itemOrDescriptionNumberField2, "itemOrDescriptionNumberField2");

				System.out.println(updatedXpath3);
				WebElement selectItemOrDescriptionNumberFieldValue = driver.findElement(By.xpath(updatedXpath3));
				click(driver, selectItemOrDescriptionNumberFieldValue);

				// Verify and Select Value from Mftr Batch No Number Field in GRIN
				click(driver, mftrBatchNoNumberField2);
				isSelected(driver, mftrBatchNoNumberField2, "mftrBatchNoNumberField2");
				mftrBatchNoNumberField2.clear();
				mftrBatchNoNumberField2.sendKeys(mftrBatchNo);

				// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
				click(driver, unitPriceField2);
				isSelected(driver, unitPriceField2, "unitPriceField2");
				unitPriceField2.clear();
				unitPriceField2.sendKeys(unitPrice);

				datePicker(driver, expiryDate2);

				datePicker(driver, manufactureDatePicker2);

				// Verifying and Coc Upload Files in Grin Create
				uploadFile(driver, cocUploadFiles2, 3);

				// Verify Taxes Button in Add Project Pop-UP
				click(driver, taxesButton2);

				click(driver, remarksField2);
				isSelected(driver, remarksField2, "remarksField2");
				remarksField2.sendKeys("TEST-3");
			}
			if (j == 2) {
				// Verify and Select Value from po Number Field in GRIN Create-Transaction
				click(driver, poNumberField3);
				isSelected(driver, poNumberField3, "poNumberField3");

				WebElement selectPOnumberFieldValue = driver.findElement(By.xpath(updatedXpathPO1));
				click(driver, selectPOnumberFieldValue);

				// Verify and Select Value from Invoice Number Field in GRIN Create-Transaction
				click(driver, itemOrDescriptionNumberField3);
				isSelected(driver, itemOrDescriptionNumberField3, "itemOrDescriptionNumberField3");

				System.out.println(updatedXpath4);
				WebElement selectItemOrDescriptionNumberFieldValue = driver.findElement(By.xpath(updatedXpath4));
				click(driver, selectItemOrDescriptionNumberFieldValue);

				// Verify and Select Value from Mftr Batch No Number Field in GRIN
				click(driver, mftrBatchNoNumberField3);
				isSelected(driver, mftrBatchNoNumberField3, "mftrBatchNoNumberField3");
				mftrBatchNoNumberField3.clear();
				mftrBatchNoNumberField3.sendKeys(mftrBatchNo);

				// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
				click(driver, unitPriceField3);
				isSelected(driver, unitPriceField3, "unitPriceField3");
				unitPriceField3.clear();
				unitPriceField3.sendKeys(unitPrice);

				datePicker(driver, expiryDate3);

				datePicker(driver, manufactureDatePicker3);

				// Verifying and Coc Upload Files in Grin Create
				uploadFile(driver, cocUploadFiles3, 3);

				// Verify Taxes Button in Add Project Pop-UP
				click(driver, taxesButton3);

				click(driver, remarksField3);
				isSelected(driver, remarksField3, "remarksField3");
				remarksField3.sendKeys("TEST-4");
			}

			// Verify and Enter Value in SGST Field in GRIN Create-Transaction Module
			click(driver, sGSTField);
			isSelected(driver, sGSTField, "sGSTField");
			sGSTField.clear();
			sGSTField.sendKeys(sgst);

			// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
			click(driver, cGSTField);
			isSelected(driver, cGSTField, "cGSTField");
			cGSTField.clear();
			cGSTField.sendKeys(cgst);

			// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
			click(driver, iGSTField);
			isSelected(driver, iGSTField, "iGSTField");
			iGSTField.clear();
			iGSTField.sendKeys("9");

			// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
			click(driver, uTGSTField);
			isSelected(driver, uTGSTField, "uTGSTField");
			uTGSTField.clear();
			uTGSTField.sendKeys(utgst);

			// Verify save Button in Add Taxes Pop-UP
			click(driver, saveButtonInAddTaxesPOPUP);

			click(driver, driver.findElement(By.xpath("//button[contains(text(),'Add')]")));
		}

		for (int k = 1; k <= 2; k++) {

			if (k == 1) {
				// Verify and Select Value from po Number Field in GRIN Create-Transaction
				click(driver, poNumberField4);
				isSelected(driver, poNumberField4, "poNumberField4");

				WebElement selectPOnumberFieldValue = driver.findElement(By.xpath(updatedXpathPO2));
				click(driver, selectPOnumberFieldValue);

				// Verify and Select Value from Invoice Number Field in GRIN Create-Transaction
				click(driver, itemOrDescriptionNumberField4);
				isSelected(driver, itemOrDescriptionNumberField4, "itemOrDescriptionNumberField4");

				System.out.println(updatedXpath5);
				WebElement selectItemOrDescriptionNumberFieldValue = driver.findElement(By.xpath(updatedXpath5));
				click(driver, selectItemOrDescriptionNumberFieldValue);

				// Verify and Select Value from Mftr Batch No Number Field in GRIN
				click(driver, mftrBatchNoNumberField4);
				isSelected(driver, mftrBatchNoNumberField4, "mftrBatchNoNumberField4");
				mftrBatchNoNumberField4.clear();
				mftrBatchNoNumberField4.sendKeys(mftrBatchNo);

				// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
				click(driver, unitPriceField4);
				isSelected(driver, unitPriceField4, "unitPriceField4");
				unitPriceField4.clear();
				unitPriceField4.sendKeys(unitPrice);

				datePicker(driver, expiryDate4);

				datePicker(driver, manufactureDatePicker4);

				// Verifying and Coc Upload Files in Grin Create
				uploadFile(driver, cocUploadFiles4, 3);

				// Verify Taxes Button in Add Project Pop-UP
				click(driver, taxesButton4);

				click(driver, remarksField4);
				isSelected(driver, remarksField4, "remarksField");
				remarksField4.sendKeys("TEST-5");
			}

			if (k == 2) {
				// Verify and Select Value from po Number Field in GRIN Create-Transaction
				click(driver, poNumberField5);
				isSelected(driver, poNumberField5, "poNumberField5");

				WebElement selectPOnumberFieldValue = driver.findElement(By.xpath(updatedXpathPO2));
				click(driver, selectPOnumberFieldValue);

				// Verify and Select Value from Invoice Number Field in GRIN Create-Transaction
				click(driver, itemOrDescriptionNumberField5);
				isSelected(driver, itemOrDescriptionNumberField5, "itemOrDescriptionNumberField5");

				System.out.println(updatedXpath6);
				WebElement selectItemOrDescriptionNumberFieldValue = driver.findElement(By.xpath(updatedXpath6));
				click(driver, selectItemOrDescriptionNumberFieldValue);

				// Verify and Select Value from Mftr Batch No Number Field in GRIN
				click(driver, mftrBatchNoNumberField5);
				isSelected(driver, mftrBatchNoNumberField5, "mftrBatchNoNumberField5");
				mftrBatchNoNumberField5.clear();
				mftrBatchNoNumberField5.sendKeys(mftrBatchNo);

				// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
				click(driver, unitPriceField5);
				isSelected(driver, unitPriceField5, "unitPriceField5");
				unitPriceField5.clear();
				unitPriceField5.sendKeys(unitPrice);

				datePicker(driver, expiryDate5);

				datePicker(driver, manufactureDatePicker5);

				// Verifying and Coc Upload Files in Grin Create
				uploadFile(driver, cocUploadFiles5, 1);

				// Verify Taxes Button in Add Project Pop-UP
				click(driver, taxesButton5);

				click(driver, remarksField5);
				isSelected(driver, remarksField5, "remarksField5");
				remarksField5.sendKeys("TEST-6");
			}

			// Verify and Enter Value in SGST Field in GRIN Create-Transaction Module
			click(driver, sGSTField);
			isSelected(driver, sGSTField, "sGSTField");
			sGSTField.clear();
			sGSTField.sendKeys(sgst);

			// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
			click(driver, cGSTField);
			isSelected(driver, cGSTField, "cGSTField");
			cGSTField.clear();
			cGSTField.sendKeys(cgst);

			// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
			click(driver, iGSTField);
			isSelected(driver, iGSTField, "iGSTField");
			iGSTField.clear();
			iGSTField.sendKeys("9");

			// Verify and Enter Value in Unit Price Field in GRIN Create-Transaction Module
			click(driver, uTGSTField);
			isSelected(driver, uTGSTField, "uTGSTField");
			uTGSTField.clear();
			uTGSTField.sendKeys(utgst);

			// Verify save Button in Add Taxes Pop-UP
			click(driver, saveButtonInAddTaxesPOPUP);

			click(driver, remarksField);
			isSelected(driver, remarksField, "remarksField");
			remarksField.sendKeys("TEST");

			if (k == 1) {
				click(driver, driver.findElement(By.xpath("//button[contains(text(),'Add')]")));
			}
		}

		// Verify Freight Charges Tab
		click(driver, freightChargesTab);

		// Verify AWB Number Field 1
		click(driver, awbNumberField1);
		isSelected(driver, awbNumberField1, "awbNumberField1");
		awbNumberField1.sendKeys(awbNo1);

		// Verify AWB Date Picker 1
		datePicker(driver, awbDatePicker1);

		// Verify AWB Number Field 2
		click(driver, awbNumberField2);
		isSelected(driver, awbNumberField2, "awbNumberField2");
		awbNumberField2.sendKeys(awbNo2);

		// Verify AWB Date Picker 2
		datePicker(driver, awbDatePicker2);

		// Verify B/E Number Field
		click(driver, beNumberField);
		isSelected(driver, beNumberField, "beNumberField");
		beNumberField.sendKeys(beNo);

		// Verify B/E Date Picker
		datePicker(driver, beDatePicker);

		// Verify B/E Currency Value Field
		click(driver, beCurrencyValueField);
		isSelected(driver, beCurrencyValueField, "beCurrencyValueField");
		beCurrencyValueField.sendKeys(beCurrencyValue);

		// Verify Other Cost Tab
		click(driver, otherCostTab);

		// Verify Freight Field
		click(driver, freightField);
		isSelected(driver, freightField, "freightField");
		freightField.sendKeys(freight);

		// Verify Insurance Field
		click(driver, insuranceField);
		isSelected(driver, insuranceField, "insuranceField");
		insuranceField.sendKeys(insurance);

		// Verify Loading Or Unloading Field
		click(driver, loadingOrUnloadingField);
		isSelected(driver, loadingOrUnloadingField, "loadingOrUnloadingField");
		loadingOrUnloadingField.sendKeys(loadingOrUnloading);

		// Verify Loading Or Unloading Field
		click(driver, currencyConversionField);
		isSelected(driver, currencyConversionField, "currencyConversionField");
		currencyConversionField.sendKeys(currencyConversion);

		// Verify Transport Field
		click(driver, transportField);
		isSelected(driver, transportField, "transportField");
		transportField.sendKeys(transport);

		// Verify Other Charges Tab boolean OtherChargesTabIsDisplayed
		click(driver, OtherChargesTab);

		click(driver, otherChargesDropDown);
		isSelected(driver, otherChargesDropDown, "otherChargesDropDown");
		click(driver, selectOtherChargesDropDownValue);

		// Verify Other Charges Value Field
		click(driver, otherChargesValueField);
		isSelected(driver, otherChargesValueField, "otherChargesValueField");
		otherChargesValueField.sendKeys("10");

		// Verify Add Button in Other Charges Tab
		click(driver, addButton);

		// Verify Save Button in Add Project Pop-UP
		click(driver, saveButton);

		return new HomePage();

	}

}
