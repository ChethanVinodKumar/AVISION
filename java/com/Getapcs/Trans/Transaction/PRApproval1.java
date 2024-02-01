package com.Getapcs.Trans.Transaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class PRApproval1 extends TestBase {

	@FindBy(xpath = "(//button[normalize-space()='Approve'])[1]")
	WebElement approveButton;

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

	// Items Tab
	@FindBy(linkText = "Items")
	WebElement itemsTab;

	@FindBy(xpath = "//table[@class='table table-striped']/tbody/tr[1]/td[1]")
	WebElement itemNumber;

	@FindBy(xpath = "//i[@title='Project']")
	WebElement projectDeatilPopUp;

	@FindBy(xpath = "//div[@class='modal-body']/..//table[@class='table table-striped']")
	WebElement table1;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	WebElement closeButton;

	@FindBy(xpath = "//i[@title='Delivery Schedule']")
	WebElement deliverySchedulePopUp;

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
	WebElement approval1Button;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement yesButton;

	public PRApproval1() {

		PageFactory.initElements(driver, this);
	}

	public HomePage prApproval1Page() throws Throwable {

		click(driver, approveButton);

		dataPrintFromInputtag(driver, prDateElement, "prDateElement");

		dataPrintFromInputtag(driver, itemNumber, "itemNumber");

		click(driver, billing$ShippingDetailsTab);

		click(driver, termsTab);

		click(driver, approval1Button);

		click(driver, yesButton);

		Thread.sleep(2000);
		return new HomePage();

	}
}