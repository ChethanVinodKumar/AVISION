package com.Getapcs.Avision.Sales;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class VerifyLPCostingCreate extends TestBase {

	@FindBy(xpath = "//tbody/tr[1]/td[1]/button[1]")
	WebElement lpCostingButton;

	@FindBy(xpath = "//label[text()='RFQ Number']/following-sibling::label[@class='field2']")
	WebElement rfqNumberElement;

	@FindBy(xpath = "//label[text()='Customer Name']/following-sibling::label[@class='field2']")
	WebElement customerNameElement;

	@FindBy(xpath = "(//span)[48]")
	WebElement expansionPanel;

	@FindBy(xpath = "//input[@id='moqCost']")
	WebElement moqCheckBox;

	@FindBy(xpath = "//input[@placeholder='Enter Material Cost']")
	WebElement materialCostField;

	@FindBy(xpath = "//input[@placeholder='Enter Mark Up For Material']")
	WebElement markUpforMaterialField;

	@FindBy(xpath = "//input[@placeholder='Enter Machine Cost']")
	WebElement machinHrsCostField;

	@FindBy(xpath = "//input[@placeholder='Enter Labour Cost']")
	WebElement labourHrsCostField;

	@FindBy(xpath = "//input[@placeholder='Enter Mark Up For Process']")
	WebElement markUpForProcessStepsField;

	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	WebElement nameField;

	@FindBy(xpath = "//input[@placeholder='Enter Value(Cost)']")
	WebElement valueCostField;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addButton;

	@FindBy(xpath = "//button[normalize-space()='Calculate']")
	WebElement calculateButton;

	public VerifyLPCostingCreate() {
		PageFactory.initElements(driver, this);

	}

	public HomePage lpCostingCreate() throws InterruptedException {

		click(driver, lpCostingButton);

		Thread.sleep(2000);

		dataPrint(driver, rfqNumberElement, "rfqNumberElement");

		dataPrint(driver, customerNameElement, "customerNameElement");

		click(driver, expansionPanel);

		click(driver, moqCheckBox);

//		click(driver, materialCostField);
//		isSelected(driver, materialCostField, "materialCostField");
//		materialCostField.clear();
//		materialCostField.sendKeys("100");

//		click(driver, markUpforMaterialField);
//		isSelected(driver, markUpforMaterialField, "markUpforMaterialField");
//		markUpforMaterialField.clear();
//		markUpforMaterialField.sendKeys("100");

		click(driver, machinHrsCostField);
		isSelected(driver, machinHrsCostField, "machinHrsCostField");
		machinHrsCostField.clear();
		machinHrsCostField.sendKeys("1000");

		click(driver, labourHrsCostField);
		isSelected(driver, labourHrsCostField, "labourHrsCostField");
		labourHrsCostField.clear();
		labourHrsCostField.sendKeys("1000");

		click(driver, markUpForProcessStepsField);
		isSelected(driver, markUpForProcessStepsField, "markUpForProcessStepsField");
		markUpForProcessStepsField.clear();
		markUpForProcessStepsField.sendKeys("1500");

		click(driver, nameField);
		isSelected(driver, nameField, "nameField");
		nameField.clear();
		nameField.sendKeys("Test");

		click(driver, valueCostField);
		isSelected(driver, valueCostField, "valueCostField");
		valueCostField.clear();
		valueCostField.sendKeys("100");

		click(driver, addButton);

		click(driver, calculateButton);

		return new HomePage();
	}

}
