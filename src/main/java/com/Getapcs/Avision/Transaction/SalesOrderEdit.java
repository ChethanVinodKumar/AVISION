package com.Getapcs.Avision.Transaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class SalesOrderEdit extends TestBase{
	
	@FindBy(xpath = "(//i[@title='Click to edit'])[1]")
	WebElement editButton;
	
	@FindBy(xpath = "//label[normalize-space()='Reason For Modification']/..//textarea[@placeholder='Enter Reason For Modification']")
	WebElement reasonForModification;
	
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;
	
	
	public SalesOrderEdit() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePage salesOrderEdit() {
		
		click(driver, editButton);
		
		click(driver, reasonForModification);
		isSelected(driver, reasonForModification, "reasonForModification");
		reasonForModification.sendKeys("Edit Sales Order Reason");
		
		click(driver, saveButton);
		
		return new HomePage();
	}
	

}
