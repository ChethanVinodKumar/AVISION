package com.Getapcs.Avision.InventryReports;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class InventryReportAfterGrin extends TestBase {

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

	@FindBy(xpath = "(//i[@title='Click to view'])[1]")
	WebElement editButton;

	@FindBy(xpath = "(//i[@title='Add Project'])[1]")
	WebElement addProject;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr/td[9]")
	WebElement warehouse;

	@FindBy(xpath = "//*[@class='table table-striped']/tbody/tr/td[10]")
	WebElement location;

	public InventryReportAfterGrin() {

		PageFactory.initElements(driver, this);

	}

	// *************Inventry Report Page******************//

	public HomePage InventryReportPage() throws InterruptedException, IOException {

//Part Type

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/grin/table");

		click(driver, editButton);

		String tableXpath = "//table[@class='table mb-2']";

		// Get the first PR number text from table
		String partType1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[3]")).getText();

		// Remove leading and trailing whitespaces
		partType1 = partType1.trim();

		// Remove the trailing hyphen and any characters after it
		int hyphenIndex = partType1.indexOf(" - Test Description");
		if (hyphenIndex != -1) {
			partType1 = partType1.substring(0, hyphenIndex);
		}

		// Store the element with hard coded PR number
		String elementXpath = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath = elementXpath.replace("PP-54", partType1);

		System.out.println(updatedXpath);

//project Number 

		click(driver, addProject);

		String tableXpath1 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String projectNumber1 = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[1]")).getText();

		// Store the element with hard coded PR number
		String elementXpath1 = "(//div[normalize-space()='PP-54'])[1]";

		String updatedXpath1 = elementXpath1.replace("PP-54", projectNumber1);

		System.out.println(updatedXpath1);

		driver.navigate().to("https://avision-demo.getapcs.com/reports/inventory-report");

//Part Type

		click(driver, partType);

		click(driver, searchPartType);
		searchPartType.sendKeys(partType1);

		WebElement partTypeSelect = driver.findElement(By.xpath(updatedXpath));

		click(driver, partTypeSelect);

//Part Type

		click(driver, projectNumber);

		click(driver, searchprojectNumber);
		searchprojectNumber.sendKeys(projectNumber1);

		WebElement projectNumberSelect1 = driver.findElement(By.xpath(updatedXpath1));

		click(driver, projectNumberSelect1);

//Filter

		click(driver, filter);

		String warehouse_text = warehouse.getText();
		String location_text = location.getText();

		// Assert that the warehouse and location texts are equal to "GRIN"
		assert warehouse_text.equals("GRIN") && location_text.equals("GRIN") : "Texts are not equal to 'GRIN'";

		Thread.sleep(2000);
		screenShot("After GRIN");

		Thread.sleep(2000);
		screenShot("After GRIN");

		return new HomePage();
	}

}
