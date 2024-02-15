package com.Getapcs.Avision.Sales;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class ENGG_Edit extends TestBase {

	@FindBy(xpath = "(//i[@title='Engg'])[1]")
	WebElement enggButton;

	@FindBy(xpath = "//button[text()='Edit']")
	WebElement editButton;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Remarks'])[1]")
	WebElement remarkField;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement itemNumber;

	@FindBy(xpath = "(//a[normalize-space()='Engg Risk Identification'])[1]")
	WebElement enggRiskIdentificationTab;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	WebElement category;

	@FindBy(xpath = "(//span[normalize-space()='TEST Risk_Category1'])[1]")
	WebElement categorySelect;

	@FindBy(xpath = "(//textarea[@placeholder='Enter Note.'])[1]")
	WebElement note;

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement saveButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-rfq-item-view/div[2]/div/div/div/form/div/div[4]/div/div/div/table/thead/tr/th[1]/input")
	WebElement itemTabCheckBox;

	@FindBy(xpath = "(//input[@value='1400'])[1]")
	WebElement itemTabCheckBox1;

	@FindBy(xpath = "(//button[normalize-space()='Release'])[1]")
	WebElement releaseButtonInCSRelease;

	@FindBy(xpath = "(//button[normalize-space()='Add'])[1]")
	WebElement addButton;

	public ENGG_Edit() {
		PageFactory.initElements(driver, this);
	}

	public HomePage RFQEnggEdit(String QuantityInaddShedule, String Note) throws Throwable {

		click(driver, enggButton);
		click(driver, editButton);

		click(driver, remarkField);
		isSelected(driver, remarkField, "remarkField");
		remarkField.sendKeys("ENGG Edit Remark");

		click(driver, saveButton);

		return new HomePage();

	}

}