package com.Getapcs.Avision.Sales;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class RFQ_EditPage extends TestBase {

	@FindBy(xpath = "//button[@class='navbar-toggler navbar-toggler align-self-center']//span[@class='mdi mdi-menu']")
	WebElement threeLineIconBar;

	@FindBy(xpath = "(//span[normalize-space()='Sales'])[1]")
	WebElement salesModuledropdown;

	@FindBy(xpath = "//span[text()='RFQ']")
	WebElement rfq;

	@FindBy(xpath = "//a[@routerlink='sales/rfq/create']")
	WebElement createRFQ;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement customerNameDropDown;

	@FindBy(xpath = "(//span[normalize-space()='0003 - Test comName'])[1]")
	WebElement customerNameDropDownSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Customer Rfq Number']")
	WebElement customerRFQNumberField;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement requestReceiveDatePicker;

	@FindBy(xpath = "(//input[@formcontrolname='quotesExpectedDate'])[1]")
	WebElement quoteExpectDatePicker;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement typeOfSolution;

	@FindBy(xpath = "(//span[normalize-space()='Automation'])[1]")
	WebElement typeOfSolutionSelect;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement productType;

	@FindBy(xpath = "(//span[normalize-space()='Upsell - Endo'])[1]")
	WebElement productTypeSelect;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement roomName;

	@FindBy(xpath = "(//span[normalize-space()='Home'])[1]")
	WebElement roomNameSelect;

	@FindBy(xpath = "(//input[@role='combobox'])[1]")
	WebElement itemNumber;

	@FindBy(xpath = "(//span[normalize-space()='798878123-Test Description'])[1]")
	WebElement itemNumberSelect;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[1]")
	WebElement quantity;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement close;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//a[normalize-space()='Notes'])[1]")
	WebElement notesTab;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement category;

	@FindBy(xpath = "(//span[normalize-space()='TEST Category'])[1]")
	WebElement categorySelect;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Note'])[1]")
	WebElement note;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "//a[@routerlink='sales/rfq/table']")
	WebElement modifyorView;

	@FindBy(xpath = "(//i[@title='Click to Edit'])[1]")
	WebElement editButton;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarks;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Reason For Modification'])[1]")
	WebElement reasonForModification;

	@FindBy(xpath = "(//td[normalize-space()='1'])[1]")
	WebElement itemTable;

	@FindBy(xpath = "(//td[normalize-space()='test'])[1]")
	WebElement notesTable;

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	WebElement update;

	public RFQ_EditPage() {
		PageFactory.initElements(driver, this);
	}

	JavascriptExecutor executor = (JavascriptExecutor) driver;

	public HomePage RFQEdit(String rfqNumber, String EnterRemarks, String EnterReason, String Enterquantity,
			String Enternote) throws Throwable {

		click(driver, editButton);

		// Customer Name

		// Click on Customer Name Drop Down RFQ Create Page-Sales Module
//		click(driver, customerNameDropDown);
//		isSelected(driver, customerNameDropDown, "customerNameDropDown");
//		click(driver, customerNameDropDownSelect);

//		//Click on Customer Alias Name Drop Down RFQ Create Page-Sales Module
//		WebElement customerAliasNameDropDown = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//        boolean customerAliasNameDropDownIsDisplayed = customerAliasNameDropDown.isDisplayed();
//        assertTrue(customerAliasNameDropDownIsDisplayed, "Customer Name Drop Down is not Displayed.");
//        customerAliasNameDropDown.sendKeys(Keys.ENTER);
//        WebElement customerAliasSelect =  driver.findElement(By.xpath("(//span[normalize-space()='VEDHARTH TECHNOLOGY - TAMIL NADU'])[1]"));
//      //  executor.executeScript("arguments[0].click();", customerAliasSelect);
//        customerAliasSelect.sendKeys(Keys.ENTER);

		// Customer RFQ Number

		// Verify and Click on Customer RFQ Number Field in Item Price List-Edit
//		click(driver, customerRFQNumberField);
//		isSelected(driver, customerRFQNumberField, "customerRFQNumberField");
//		customerRFQNumberField.clear();
//		customerRFQNumberField.sendKeys(rfqNumber);

		// Request Receive Date

		// Verify and Click on Request Receive Date Picker in Item Price List-Edit
		selectPreviousDate(driver, requestReceiveDatePicker, 3);

		// Verify and Click on Quote Expect Date Picker in Item Price List-Edit
		datePicker(driver, quoteExpectDatePicker);

		// typeOfSolution

		// Verify that typeOfSolution Field is Displayed or not
//		click(driver, typeOfSolution);
//		isSelected(driver, typeOfSolution, "typeOfSolution");
//		click(driver, typeOfSolutionSelect);


		// Product Type

		// Verify that productType Field is Displayed or not
//		boolean isDisabledproductTypeFieldn = !productType.isDisplayed();
//		assertFalse(isDisabledproductTypeFieldn);
//
//		// Verify that productType Field is clickable or not
//		WebElement productTypeFieldFocusedElement = driver.switchTo().activeElement();
//		boolean productTypeFieldIsSelected = productTypeFieldFocusedElement.equals(productType);
//		assertFalse(productTypeFieldIsSelected, "productType Text Field is not Selected");
//
//		// Verifying that productType Text Field is Enabled or not
//		boolean isEnabledproductTypeField = productType.isEnabled();
//		assertTrue(isEnabledproductTypeField);
//
//		productType.sendKeys(Keys.ENTER);
//
//		executor.executeScript("arguments[0].click();", productTypeSelect);
//
//		// remarks
//
//		remarks.sendKeys(Keys.ENTER);
//		// Verify that remarks Field is Displayed or not
//		boolean isDisabledremarksFieldn = !remarks.isDisplayed();
//		assertFalse(isDisabledremarksFieldn);
////				
////				//Verify that  remarks Field is clickable or not
////		  		WebElement remarksFieldFocusedElement = driver.switchTo().activeElement();
////			    boolean remarksFieldIsSelected = remarksFieldFocusedElement.equals(remarks);
////			    assertFalse(remarksFieldIsSelected, "remarks Text Field is not Selected");
////		          
//		// Verifying that remarks Text Field is Enabled or not
//		boolean isEnabledremarksField = remarks.isEnabled();
//		assertTrue(isEnabledremarksField);
//		remarks.clear();
//		remarks.sendKeys(EnterRemarks);
//
//		// Verifying the Placeholder which is present in remarks text field.
//		String displayedTextInremarks = remarks.getAttribute("placeholder");
//
//		String expected_placeholder4 = "Enter Remarks";
//
//		assertEquals(displayedTextInremarks, expected_placeholder4);
//
//		// resonForModification
//
//		reasonForModification.sendKeys(Keys.ENTER);
//		// Verify that resonForModification Field is Displayed or not
//		boolean isDisabledresonForModificationFieldn = !reasonForModification.isDisplayed();
//		assertFalse(isDisabledresonForModificationFieldn);
////				
////				//Verify that  resonForModification Field is clickable or not
////		  		WebElement resonForModificationFieldFocusedElement = driver.switchTo().activeElement();
////			    boolean resonForModificationFieldIsSelected = resonForModificationFieldFocusedElement.equals(resonForModification);
////			    assertFalse(resonForModificationFieldIsSelected, "resonForModification Text Field is not Selected");
////		          
//		// Verifying that resonForModification Text Field is Enabled or not
//		boolean isEnabledresonForModificationField = reasonForModification.isEnabled();
//		assertTrue(isEnabledresonForModificationField);
//		reasonForModification.clear();
//		reasonForModification.sendKeys(EnterReason);
//
//		// Verifying the Placeholder which is present in resonForModification text
//		// field.
//		String displayedTextInresonForModification = reasonForModification.getAttribute("placeholder");
//
//		String expected_placeholder6 = "Enter Reason For Modification";
//
//		assertEquals(displayedTextInresonForModification, expected_placeholder6);
//
////ITEM
//
//		executor.executeScript("arguments[0].click();", itemTable);
//
//		// Room Name Field
//
//		// Verify that roomName Field is Displayed or not
//		boolean isDisabledroomNameFieldn = !roomName.isDisplayed();
//		assertFalse(isDisabledroomNameFieldn);
//
//		// Verify that roomName Field is clickable or not
//		WebElement roomNameFieldFocusedElement = driver.switchTo().activeElement();
//		boolean roomNameFieldIsSelected = roomNameFieldFocusedElement.equals(roomName);
//		assertFalse(roomNameFieldIsSelected, "roomName Text Field is not Selected");
//
//		// Verifying that roomName Text Field is Enabled or not
//		boolean isEnabledroomNameField = roomName.isEnabled();
//		assertTrue(isEnabledroomNameField);
//
//		roomName.sendKeys(Keys.ENTER);
//
//		executor.executeScript("arguments[0].click();", roomNameSelect);
//
//		// Item Number Field
//
//		// Verify that itemNumber Field is Displayed or not
//		boolean isDisableditemNumberFieldn = !itemNumber.isDisplayed();
//		assertFalse(isDisableditemNumberFieldn);
//
//		// Verify that itemNumber Field is clickable or not
//		WebElement itemNumberFieldFocusedElement = driver.switchTo().activeElement();
//		boolean itemNumberFieldIsSelected = itemNumberFieldFocusedElement.equals(itemNumber);
//		assertFalse(itemNumberFieldIsSelected, "itemNumber Text Field is not Selected");
//
////		// Verifying that itemNumber Text Field is Enabled or not
////		boolean isEnableditemNumberField = itemNumber.isEnabled();
////		assertTrue(isEnableditemNumberField);
////		click(driver, itemNumber);
////		Thread.sleep(2000);
////		itemNumber.sendKeys(Keys.CONTROL + "a");
////		Thread.sleep(2000);
////		itemNumber.sendKeys(Keys.BACK_SPACE);
////		Thread.sleep(2000);
////		itemNumber.click();
////
////		executor.executeScript("arguments[0].click();", itemNumberSelect);
//
//		// Quantity
//
//		quantity.sendKeys(Keys.ENTER);
//		// Verify that quantity Field is Displayed or not
//		boolean isDisabledquantityFieldn = !quantity.isDisplayed();
//		assertFalse(isDisabledquantityFieldn);
////				
////				//Verify that  quantity Field is clickable or not
////		  		WebElement quantityFieldFocusedElement = driver.switchTo().activeElement();
////			    boolean quantityFieldIsSelected = quantityFieldFocusedElement.equals(quantity);
////			    assertFalse(quantityFieldIsSelected, "quantity Text Field is not Selected");
////		          
//		// Verifying that quantity Text Field is Enabled or not
//		boolean isEnabledquantityField = quantity.isEnabled();
//		assertTrue(isEnabledquantityField);
//		quantity.clear();
//		quantity.sendKeys(Enterquantity);
//
//		// Verifying the Placeholder which is present in quantity text field.
//		String displayedTextInquantity = quantity.getAttribute("placeholder");
//
//		String expected_placeholder7 = "Enter Quantity";
//
//		assertEquals(displayedTextInquantity, expected_placeholder7);
//
//		// UploadFiles
//		// Verifing that do we able to upload files or not.
//		WebElement UploadFiles = driver.findElement(By.xpath("(//input[@placeholder='Upload Items'])[1]"));
//		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
//		executor1.executeScript("arguments[0].click();", UploadFiles);
//		Robot robot = new Robot();
//		robot.delay(2000);
//		StringSelection stringSelection = new StringSelection("C:\\Users\\W2191\\Desktop\\FileUpload1.au3");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//
//		// Press Enter to open the file dialog
//
//		robot.delay(2000);
//
//		// Press Ctrl+V to paste the file path
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.delay(2000);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_V);
//
//		robot.delay(2000);
//		// Press Enter to confirm the file selection
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//
//		close.sendKeys(Keys.ENTER);
//
//		executor.executeScript("arguments[0].click();", update);
//
////NOTES
//
//		executor.executeScript("arguments[0].click();", notesTab);

//		executor.executeScript("arguments[0].click();", notesTable);
//
//		// Category
//
//		// Verify that category Field is Displayed or not
//		boolean isDisabledcategoryFieldn = !category.isDisplayed();
//		assertFalse(isDisabledcategoryFieldn);
//
//		// Verify that category Field is clickable or not
//		WebElement categoryFieldFocusedElement = driver.switchTo().activeElement();
//		boolean categoryFieldIsSelected = categoryFieldFocusedElement.equals(category);
//		assertFalse(categoryFieldIsSelected, "category Text Field is not Selected");
//
//		// Verifying that category Text Field is Enabled or not
//		boolean isEnabledcategoryField = category.isEnabled();
//		assertTrue(isEnabledcategoryField);
//		category.click();
//
//		Thread.sleep(2000);
//
//		executor.executeScript("arguments[0].click();", categorySelect);
//
//		// note
//
//		note.sendKeys(Keys.ENTER);
//		// Verify that note Field is Displayed or not
//		boolean isDisablednoteFieldn = !note.isDisplayed();
//		assertFalse(isDisablednoteFieldn);
////				
////				//Verify that  note Field is clickable or not
////		  		WebElement noteFieldFocusedElement = driver.switchTo().activeElement();
////			    boolean noteFieldIsSelected = noteFieldFocusedElement.equals(note);
////			    assertFalse(noteFieldIsSelected, "note Text Field is not Selected");
////		          
//		// Verifying that note Text Field is Enabled or not
//		boolean isEnablednoteField = note.isEnabled();
//		assertTrue(isEnablednoteField);
//		note.clear();
//		note.sendKeys(Enternote);
//
//		// Verifying the Placeholder which is present in note text field.
//		String displayedTextInnote = note.getAttribute("placeholder");
//
//		String expected_placeholder5 = "Enter Note";
//
//		assertEquals(displayedTextInnote, expected_placeholder5);
//
//		executor.executeScript("arguments[0].click();", update);
//
//		// Verify and Click on Save Button in Create-Item PriceList-Sales Module
//		boolean saveButtonIsDisplayed = saveButton.isDisplayed();
//		assertTrue(saveButtonIsDisplayed, "Save Button is not Displayed");
//		assertTrue(saveButton.isEnabled(), "Save button is not enabled.");
		saveButton.click();
		Thread.sleep(3000);
		return new HomePage();

	}
}
