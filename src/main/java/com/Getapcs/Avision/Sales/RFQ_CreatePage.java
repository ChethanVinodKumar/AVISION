package com.Getapcs.Avision.Sales;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class RFQ_CreatePage extends TestBase {

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

	@FindBy(xpath = "(//input[@type='text'])[9]")
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

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement category;

	@FindBy(xpath = "(//span[normalize-space()='TEST Category'])[1]")
	WebElement categorySelect;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Note'])[1]")
	WebElement note;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement add;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement salesPerson;

	@FindBy(xpath = "(//span[normalize-space()='Abhilashpatil'])[1]")
	WebElement salesPersonSelect;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement closeButton;

	public RFQ_CreatePage() {
		PageFactory.initElements(driver, this);
	}

	JavascriptExecutor executor = (JavascriptExecutor) driver;

	public HomePage RFQCreate(String rfqNumber, String Enterquantity, String Enternote) throws Throwable {

		driver.navigate().to("https://demo_keus.getapcs.com/engineering/engg-bom/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumber + "-Test Description");

		System.out.println(updatedXpath);
		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");

		// Verify Three Line Side Bar in Home Page
		boolean threeLineIconBarIsDisplayed = threeLineIconBar.isDisplayed();
		assertTrue(threeLineIconBarIsDisplayed, "Three Line Icon Bar is not Displayed");
		threeLineIconBar.click();

		// Click on Sales Module
		boolean salesModuledropdownIsDisplayed = salesModuledropdown.isDisplayed();
		assertTrue(salesModuledropdownIsDisplayed, "Sales Module dropdown IsDisplayed.");
		salesModuledropdown.click();

		// Verify and Click on RFQ in Sales Module
		boolean rfqIsDisplayed = rfq.isDisplayed();
		assertTrue(rfqIsDisplayed, "RFQ is not Displayed.");
		rfq.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Verify and Click on Create Module in RFQ-Sales Module
		boolean createRFQIsDisplayed = createRFQ.isDisplayed();
		assertTrue(createRFQIsDisplayed, "Create RFQ is not Displayed.");
		createRFQ.click();

		// Customer Name

		// Click on Customer Name Drop Down RFQ Create Page-Sales Module
		boolean customerNameDropDownIsDisplayed = customerNameDropDown.isDisplayed();
		assertTrue(customerNameDropDownIsDisplayed, "Customer Name Drop Down is not Displayed.");
		customerNameDropDown.sendKeys(Keys.ENTER);
		executor.executeScript("arguments[0].click();", customerNameDropDownSelect);

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
		// Page-Sales Module
		boolean customerRFQNumberFieldIsDisplayed = customerRFQNumberField.isDisplayed();
		assertTrue(customerRFQNumberFieldIsDisplayed,
				"Customer RFQ Number Field in Create Page is not Displayed in View/Modify-Item Price List-Sales Module.");
		customerRFQNumberField.click();
		customerRFQNumberField.sendKeys(rfqNumber);

		// Request Receive Date

		// Verify and Click on Request Receive Date Picker in Item Price List-Edit
		// Page-Sales Module
		boolean requestReceiveDatePickerIsDisplayed = requestReceiveDatePicker.isDisplayed();
		assertTrue(requestReceiveDatePickerIsDisplayed,
				"Request Receive Date Picker in Create Page is not Displayed in View/Modify-Item Price List-Sales Module.");
		requestReceiveDatePicker.click();
		requestReceiveDatePicker.sendKeys(Keys.ENTER);

		// Quote Expect Date

		// Verify and Click on Quote Expect Date Picker in Item Price List-Edit
		// Page-Sales Module
		boolean quoteExpectDatePickerIsDisplayed = quoteExpectDatePicker.isDisplayed();
		assertTrue(quoteExpectDatePickerIsDisplayed,
				"Quote Expect Date Picker in Create Page is not Displayed in View/Modify-Item Price List-Sales Module.");
		quoteExpectDatePicker.click();
		for (int i = 0; i < 5; i++) {
			quoteExpectDatePicker.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500); // Add a small delay if needed
		}
		quoteExpectDatePicker.sendKeys(Keys.ARROW_RIGHT);
		quoteExpectDatePicker.sendKeys(Keys.ENTER);

		// typeOfSolution

		// Verify that typeOfSolution Field is Displayed or not
		boolean isDisabledtypeOfSolutionFieldn = !typeOfSolution.isDisplayed();
		assertFalse(isDisabledtypeOfSolutionFieldn);

		// Verify that typeOfSolution Field is clickable or not
		WebElement typeOfSolutionFieldFocusedElement = driver.switchTo().activeElement();
		boolean typeOfSolutionFieldIsSelected = typeOfSolutionFieldFocusedElement.equals(typeOfSolution);
		assertFalse(typeOfSolutionFieldIsSelected, "typeOfSolution Text Field is not Selected");

		// Verifying that typeOfSolution Text Field is Enabled or not
		boolean isEnabledInspectionIntDaysField = typeOfSolution.isEnabled();
		assertTrue(isEnabledInspectionIntDaysField);

		typeOfSolution.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", typeOfSolutionSelect);

		// Product Type

		// Verify that productType Field is Displayed or not
		boolean isDisabledproductTypeFieldn = !productType.isDisplayed();
		assertFalse(isDisabledproductTypeFieldn);

		// Verify that productType Field is clickable or not
		WebElement productTypeFieldFocusedElement = driver.switchTo().activeElement();
		boolean productTypeFieldIsSelected = productTypeFieldFocusedElement.equals(productType);
		assertFalse(productTypeFieldIsSelected, "productType Text Field is not Selected");

		// Verifying that productType Text Field is Enabled or not
		boolean isEnabledproductTypeField = productType.isEnabled();
		assertTrue(isEnabledproductTypeField);

		productType.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", productTypeSelect);

		click(driver, salesPerson);
		isSelected(driver, salesPerson, "salesPerson");
		click(driver, salesPersonSelect);

//ITEM
		// Room Name Field

		// Verify that roomName Field is Displayed or not
		boolean isDisabledroomNameFieldn = !roomName.isDisplayed();
		assertFalse(isDisabledroomNameFieldn);

		// Verify that roomName Field is clickable or not
		WebElement roomNameFieldFocusedElement = driver.switchTo().activeElement();
		boolean roomNameFieldIsSelected = roomNameFieldFocusedElement.equals(roomName);
		assertFalse(roomNameFieldIsSelected, "roomName Text Field is not Selected");

		// Verifying that roomName Text Field is Enabled or not
		boolean isEnabledroomNameField = roomName.isEnabled();
		assertTrue(isEnabledroomNameField);

		roomName.sendKeys(Keys.ENTER);

		executor.executeScript("arguments[0].click();", roomNameSelect);

		// Item Number Field

		// Verify that itemNumber Field is Displayed or not
		boolean isDisableditemNumberFieldn = !itemNumber.isDisplayed();
		assertFalse(isDisableditemNumberFieldn);

		// Verify that itemNumber Field is clickable or not
		WebElement itemNumberFieldFocusedElement = driver.switchTo().activeElement();
		boolean itemNumberFieldIsSelected = itemNumberFieldFocusedElement.equals(itemNumber);
		assertFalse(itemNumberFieldIsSelected, "itemNumber Text Field is not Selected");

		// Verifying that itemNumber Text Field is Enabled or not
		boolean isEnableditemNumberField = itemNumber.isEnabled();
		assertTrue(isEnableditemNumberField);
		itemNumber.click();

		Thread.sleep(2000);
		WebElement itemNumberDropDownDataSelect = driver.findElement(By.xpath(updatedXpath));
		js.executeScript("arguments[0].click();", itemNumberDropDownDataSelect);

		// Quantity

		quantity.sendKeys(Keys.ENTER);
		// Verify that quantity Field is Displayed or not
		boolean isDisabledquantityFieldn = !quantity.isDisplayed();
		assertFalse(isDisabledquantityFieldn);
//				
//				//Verify that  quantity Field is clickable or not
//		  		WebElement quantityFieldFocusedElement = driver.switchTo().activeElement();
//			    boolean quantityFieldIsSelected = quantityFieldFocusedElement.equals(quantity);
//			    assertFalse(quantityFieldIsSelected, "quantity Text Field is not Selected");
//		          
		// Verifying that quantity Text Field is Enabled or not
		boolean isEnabledquantityField = quantity.isEnabled();
		assertTrue(isEnabledquantityField);
		quantity.sendKeys(Enterquantity);

		// Verifying the Placeholder which is present in quantity text field.
		String displayedTextInquantity = quantity.getAttribute("placeholder");

		String expected_placeholder4 = "Enter Quantity";

		assertEquals(displayedTextInquantity, expected_placeholder4);

		// UploadFiles
		// Verifing that do we able to upload files or not.
		WebElement UploadFiles = driver.findElement(By.xpath("(//input[@placeholder='Upload Items'])[1]"));

		uploadFile(driver, UploadFiles, 1);

		click(driver, closeButton);

		executor.executeScript("arguments[0].click();", add);

//NOTES

		executor.executeScript("arguments[0].click();", notesTab);

		// Category

		// Verify that category Field is Displayed or not
		boolean isDisabledcategoryFieldn = !category.isDisplayed();
		assertFalse(isDisabledcategoryFieldn);

		// Verify that category Field is clickable or not
		WebElement categoryFieldFocusedElement = driver.switchTo().activeElement();
		boolean categoryFieldIsSelected = categoryFieldFocusedElement.equals(category);
		assertFalse(categoryFieldIsSelected, "category Text Field is not Selected");

		// Verifying that category Text Field is Enabled or not
		boolean isEnabledcategoryField = category.isEnabled();
		assertTrue(isEnabledcategoryField);
		category.click();

		Thread.sleep(2000);

		executor.executeScript("arguments[0].click();", categorySelect);

		// note

		note.sendKeys(Keys.ENTER);
		// Verify that note Field is Displayed or not
		boolean isDisablednoteFieldn = !note.isDisplayed();
		assertFalse(isDisablednoteFieldn);
//				
//				//Verify that  note Field is clickable or not
//		  		WebElement noteFieldFocusedElement = driver.switchTo().activeElement();
//			    boolean noteFieldIsSelected = noteFieldFocusedElement.equals(note);
//			    assertFalse(noteFieldIsSelected, "note Text Field is not Selected");
//		          
		// Verifying that note Text Field is Enabled or not
		boolean isEnablednoteField = note.isEnabled();
		assertTrue(isEnablednoteField);
		note.sendKeys(Enternote);

		// Verifying the Placeholder which is present in note text field.
		String displayedTextInnote = note.getAttribute("placeholder");

		String expected_placeholder5 = "Enter Note";

		assertEquals(displayedTextInnote, expected_placeholder5);

		executor.executeScript("arguments[0].click();", add);

		// Verify and Click on Save Button in Create-Item PriceList-Sales Module
		boolean saveButtonIsDisplayed = saveButton.isDisplayed();
		assertTrue(saveButtonIsDisplayed, "Save Button is not Displayed");
		Assert.assertTrue(saveButton.isEnabled(), "Save button is not enabled.");
		saveButton.click();
		Thread.sleep(3000);
		return new HomePage();

	}

}
