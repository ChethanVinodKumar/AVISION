package com.Getapcs.Avision.Sales;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class CS_Edit extends TestBase {

	@FindBy(xpath = "//button[text()='Edit']")
	WebElement editButton;

	@FindBy(xpath = "(//i[@title='CS'])[1]")
	WebElement csButton1;

	@FindBy(xpath = "(//input[@placeholder='Enter Item Number'])[1]")
	WebElement itemNumber;
	
	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarkField;

	@FindBy(xpath = "(//input[@placeholder='Enter Quantity'])[1]")
	WebElement quantity;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Description'])[1]")
	WebElement description;

	@FindBy(xpath = "(//input[@placeholder='Upload file'])[1]")
	WebElement uploadFiles;

	@FindBy(xpath = "(//button[normalize-space()='Add Schedule'])[1]")
	WebElement addShedule;

	@FindBy(xpath = "(//input[@formcontrolname='scheduleQty'])[1]")
	WebElement quantityInaddShedule;

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Add'])[1]")
	WebElement addButtonInShedule;

	@FindBy(xpath = "(//button[normalize-space()='Ok'])[1]")
	WebElement oKButton;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addButton;

	@FindBy(xpath = "(//a[normalize-space()='Notes'])[1]")
	WebElement notesTab;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement category;

	@FindBy(xpath = "(//span[normalize-space()='TEST Category1'])[1]")
	WebElement categorySelect;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Note'])[1]")
	WebElement note;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-rfq-item-view/div[2]/div/div/div/form/div/div[4]/div/div/div/table/thead/tr/th[1]/input")
	WebElement itemTabCheckBox;

	@FindBy(xpath = "(//input[@value='1400'])[1]")
	WebElement itemTabCheckBox1;

	@FindBy(xpath = "(//button[normalize-space()='Release'])[1]")
	WebElement releaseButtonInCSRelease;

	public CS_Edit() {
		PageFactory.initElements(driver, this);
	}
	public HomePage RFQCSEdit() throws Throwable {

//
//		click(driver, saveButton);

		// Verify and Release the CS
		
		click(driver, csButton1);
		
		click(driver, editButton);
		
		click(driver, remarkField);
		isSelected(driver, remarkField, "remarkField");
		remarkField.sendKeys("CS Edit Remark");
		
		click(driver, saveButton);

		
		return new HomePage();

	}

}
