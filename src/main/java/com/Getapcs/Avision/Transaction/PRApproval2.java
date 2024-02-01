package com.Getapcs.Avision.Transaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class PRApproval2 extends TestBase {

	@FindBy(xpath = "(//button[text()='View'])[1]")
	WebElement approveViewButton;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[1]")
	WebElement itemNumber;

	@FindBy(xpath = "//input[@type='text']")
	WebElement prNumberDropDown;

	@FindBy(xpath = "//label[text()='PR Date']/following-sibling::label[@class='field2']")
	WebElement prDateElement;

	@FindBy(xpath = "//label[text()='Rev Number']/following-sibling::label[@class='field2']")
	WebElement revNumberElement;

	@FindBy(xpath = "//label[text()='Procurement Type']/following-sibling::label[@class='field2']")
	WebElement procurementTypeElement;

	@FindBy(xpath = "//label[text()='Purpose']/following-sibling::label[@class='field2']")
	WebElement purposeTextElement;

	@FindBy(xpath = "//label[text()='PR Files']/following-sibling::label[@class='field2']")
	WebElement prFileElement;

	@FindBy(linkText = "Items")
	WebElement itemsTab;

	@FindBy(xpath = "(//table[@class='table table-striped'])[2]")
	WebElement table2;

	@FindBy(xpath = "//i[@title='Project']")
	WebElement projectDeatilPopUp;

	@FindBy(xpath = "(//table[@class='table table-striped'])[1]")
	WebElement table1;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeButton;

	@FindBy(linkText = "Billing & Shipping Details")
	WebElement billing$ShippingDetailsTab;

	@FindBy(xpath = "//label[text()='Delivery Terms']/following-sibling::label[@class='data_field']")
	WebElement deliveryTermsElement;

	@FindBy(xpath = "//label[text()='Payment Terms']/following-sibling::label[@class='data_field']")
	WebElement paymentTermsElement;

	@FindBy(xpath = "//label[text()='Shipping Mode']/following-sibling::label[@class='data_field']")
	WebElement shippingModeElement;

	@FindBy(linkText = "Terms")
	WebElement termsTab;

	@FindBy(xpath = "//label[text()='Retention Period']/following-sibling::label[@class='data_field']")
	WebElement retentionPeriodElement;

	@FindBy(xpath = "//label[text()='Special Terms & Conditions']/following-sibling::label[@class='data_field']")
	WebElement specialTermsAndConditionElement;

	@FindBy(xpath = "//button[contains(text(),'Approve')]")
	WebElement approval2Button;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement yesButton;

	public PRApproval2() {
		PageFactory.initElements(driver, this);
	}

	public HomePage prApproval2Page() throws Throwable {

		click(driver, approveViewButton);

		dataPrintFromInputtag(driver, prDateElement, "prDateElement");

		dataPrintFromInputtag(driver, itemNumber, "itemNumber");

		click(driver, billing$ShippingDetailsTab);

		click(driver, termsTab);

		click(driver, approval2Button);

		click(driver, yesButton);

		Thread.sleep(2000);
		return new HomePage();

	}
}
