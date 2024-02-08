package com.Getapcs.Avision.FG_SA.InventryReports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class InventryReportAfterReturnDO extends TestBase {

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

	@FindBy(xpath = "(//i[@class='mdi mdi-eye edit-icon'])[1]")
	WebElement viewButton;

	public InventryReportAfterReturnDO() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage(String fileName) throws InterruptedException, IOException {

		//Part Type

				driver.navigate().to("https://avision-demo.getapcs.com/transaction/return-do-list/table");

				click(driver, viewButton);

				String tableXpath = "//table[@formarrayname='ItemData']";
				// Store the element with hard coded PR number
				String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

				// Get the number-1 text from table
				String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[1]")).getText().trim()
						.replaceFirst("\\s*-\\s*$", "");

				String updatedXpathFG = elementXpath.replace("PP-54", partType1);

				System.out.println(updatedXpathFG);

				driver.navigate().to("https://avision-demo.getapcs.com/reports/inventory-report");

		//Part Type


						click(driver, partType);

						searchPartType.clear();
						searchPartType.sendKeys(partType1);

						WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpathFG));
						click(driver, partTypeSelect);


				click(driver, filter);

				Thread.sleep(4000);
				screenShot(fileName);

				return new HomePage();
			}
}