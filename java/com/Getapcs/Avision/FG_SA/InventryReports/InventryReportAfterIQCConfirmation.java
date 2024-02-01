package com.Getapcs.Avision.FG_SA.InventryReports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class InventryReportAfterIQCConfirmation extends TestBase {

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
	WebElement viewButton;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[2]")
	WebElement viewButton1;

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[3]")
	WebElement viewButton2;

	@FindBy(xpath = "(//a[normalize-space()='Items'])[1]")
	WebElement itemsTab;

	@FindBy(xpath = "(//i[@title='Add Project'])[1]")
	WebElement addProject;

	public InventryReportAfterIQCConfirmation() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/table");

		click(driver, viewButton);

		click(driver, itemsTab);

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[1]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1);

		System.out.println(updatedXpath);

		// Get the first PR number text from table
		String partType2 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[1]")).getText();

		// Store the element with hard coded PR numbers
		String elementXpath1 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath1 = elementXpath1.replace("PP-54", partType2);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/table");

		click(driver, viewButton1);

		click(driver, itemsTab);

		// Get the first PR number text from table
		String partType3 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[1]")).getText();

		// Store the element with hard coded PR number
		String elementXpath3 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath3 = elementXpath3.replace("PP-54", partType3);

		System.out.println(updatedXpath3);

		// Get the first PR number text from table
		String partType4 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[1]")).getText();

		// Store the element with hard coded PR numbers
		String elementXpath4 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath4 = elementXpath4.replace("PP-54", partType4);

		System.out.println(updatedXpath4);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/purchase-order/table");

		click(driver, viewButton2);

		click(driver, itemsTab);

		// Get the first PR number text from table
		String partType5 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[1]")).getText();

		// Store the element with hard coded PR number
		String elementXpath5 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath5 = elementXpath5.replace("PP-54", partType5);

		System.out.println(updatedXpath5);

		// Get the first PR number text from table
		String partType6 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[1]")).getText();

		// Store the element with hard coded PR numbers
		String elementXpath6 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath6 = elementXpath6.replace("PP-54", partType6);

		System.out.println(updatedXpath6);

		driver.navigate().to("https://avision-demo.getapcs.com/reports/inventory-report");

//Part Type

		for (int i = 1; i <= 6; i++) {

			if (i == 1) {
				click(driver, partType);
			}

			if (i == 1) {
				searchPartType.clear();
				searchPartType.sendKeys(partType1);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath));
				click(driver, partTypeSelect);
			}

			if (i == 2) {
				searchPartType.clear();
				searchPartType.sendKeys(partType2);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath1));
				click(driver, partTypeSelect);
			}

			if (i == 3) {
				searchPartType.clear();
				searchPartType.sendKeys(partType3);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath3));
				click(driver, partTypeSelect);
			}

			if (i == 4) {
				searchPartType.clear();
				searchPartType.sendKeys(partType4);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath4));
				click(driver, partTypeSelect);
			}

			if (i == 5) {
				searchPartType.clear();
				searchPartType.sendKeys(partType5);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath5));
				click(driver, partTypeSelect);
			}

			if (i == 6) {
				searchPartType.clear();
				searchPartType.sendKeys(partType6);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath6));
				click(driver, partTypeSelect);
			}
		}

//Filter

		click(driver, filter);

		Thread.sleep(4000);
		screenShot("After IQC Confirmation");

		return new HomePage();
	}

}