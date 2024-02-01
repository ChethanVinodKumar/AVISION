package com.Getapcs.Avision.FG_SA.InventryReports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class InventryReportAfterMaterialIssue_SA1 extends TestBase {

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

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Issue Material'])[2]")
	WebElement viewButton;

	@FindBy(xpath = "(//a[normalize-space()='Items'])[1]")
	WebElement itemsTab;

	@FindBy(xpath = "(//i[@title='Add Project'])[1]")
	WebElement addProject;

	public InventryReportAfterMaterialIssue_SA1() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage(String fileName) throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/material-issue/table");

		click(driver, viewButton);

		String tableXpath = "//table[@formarrayname='ItemData']";
		// Store the element with hard coded PR number
		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		// Get the number-1 text from table
		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText().trim()
				.replaceFirst("\\s*-\\s*$", "");

		String updatedXpath1 = elementXpath.replace("PP-54", partType1);

		System.out.println(updatedXpath1);

		// Get the number-2 text from table
		String partType2 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[3]")).getText().trim()
				.replaceFirst("\\s*-\\s*$", "");

		String updatedXpath2 = elementXpath.replace("PP-54", partType2);

		System.out.println(updatedXpath2);

		// Get the number-2 text from table
		String partType3 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[3]/td[3]")).getText().trim()
				.replaceFirst("\\s*-\\s*$", "");

		String updatedXpath3 = elementXpath.replace("PP-54", partType3);

		System.out.println(updatedXpath3);

		// Get the number-3 text from table
		String partType4 = driver
				.findElement(By.xpath("//label[text()='Item Number']/following-sibling::label[@class='field2']"))
				.getText().trim().replaceFirst("\\s*-\\s*$", "");

		String updatedXpathSA = elementXpath.replace("PP-54", partType4);

		System.out.println(updatedXpathSA);

		driver.navigate().to("https://avision-demo.getapcs.com/reports/inventory-report");

//Part Type

		for (int i = 1; i <= 4; i++) {

			if (i == 1) {
				click(driver, partType);
			}

			if (i == 1) {
				searchPartType.clear();
				searchPartType.sendKeys(partType1);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath1));
				click(driver, partTypeSelect);
			}

			if (i == 2) {
				searchPartType.clear();
				searchPartType.sendKeys(partType2);

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath3));
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

				WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpathSA));
				click(driver, partTypeSelect);
			}

		}

//Filter

		click(driver, filter);

		Thread.sleep(4000);
		screenShot(fileName);

		return new HomePage();
	}

}