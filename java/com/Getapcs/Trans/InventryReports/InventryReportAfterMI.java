package com.Getapcs.Trans.InventryReports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class InventryReportAfterMI extends TestBase {

	// Material Issue

	@FindBy(xpath = "(//span[@class='dropdown-multiselect__caret'])[1]")
	WebElement partType;

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[2]")
	WebElement projectNumber;

	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	WebElement searchPartType;

	@FindBy(xpath = "(//input[@placeholder='Search'])[3]")
	WebElement searchprojectNumber;

	@FindBy(xpath = "(//button[normalize-space()='Filter'])[1]")
	WebElement filter;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement editButton;

	@FindBy(xpath = "(//button[normalize-space()='Issue Material'])[1]")
	WebElement issueMaterialButton;

	public InventryReportAfterMI() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/material-issue/table");

		String tableXpath = "//table[@class='table table-striped']";

		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText();

		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1);

		System.out.println(updatedXpath);

		click(driver, issueMaterialButton);

//project Number 

		String tableXpath1 = "//table[@class='table mb-2 ng-untouched ng-pristine ng-valid']";

		String partType2 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[3]")).getText();

		String elementXpath1 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath1 = elementXpath1.replace("PP-54", partType2);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://avision-demo.getapcs.com/reports/inventory-report");

//Part Type

		click(driver, partType);

		click(driver, searchPartType);
		searchPartType.sendKeys(partType1);

		WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, partTypeSelect);

		click(driver, searchPartType);
		searchPartType.clear();
		searchPartType.sendKeys(partType2);

		WebElement partTypeSelect1 = driver.findElement(By.xpath(updatedXpath1));

		click(driver, partTypeSelect1);

//Filter

		click(driver, filter);

		Thread.sleep(4000);
		screenShot("After SOC");

		return new HomePage();
	}

}
