package com.Getapcs.Trans.Sales;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class RFQ_ReleaseEngg extends TestBase {

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Engg'])[1]")
	WebElement enggButton;

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

	public RFQ_ReleaseEngg() {
		PageFactory.initElements(driver, this);
	}

	public HomePage RFQEngg(String QuantityInaddShedule, String Note) throws Throwable {

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/engg-bom/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String fgItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", fgItemNumber1);

		System.out.println(updatedXpath);

		driver.navigate().to("https://avision-demo.getapcs.com/sales/rfq/table");

		Thread.sleep(3000);

		click(driver, enggButton);

		click(driver, itemNumber);

		WebElement fgItemNumberSelect = driver.findElement(By.xpath(updatedXpath));
		click(driver, fgItemNumberSelect);

		click(driver, enggRiskIdentificationTab);

		click(driver, category);

		click(driver, categorySelect);

		click(driver, note);

		note.sendKeys(Note);

		click(driver, addButton);

		click(driver, saveButton);

		// Verify and Release the CS
		// Verify and Click on CS Button1

		click(driver, enggButton);

		Thread.sleep(4000);

		// Verify and Click on Check Box which is Present in Item Tab-CS Release
//		click(driver, itemTabCheckBox);
		itemTabCheckBox.sendKeys(Keys.SPACE);
		// itemTabCheckBox1.sendKeys(Keys.SPACE);

		Thread.sleep(2000);

		// Verify and Click on Release Button in Notes Tab -CS Release Page
		boolean releaseButtonInCSReleaseIsDisplayed = releaseButtonInCSRelease.isDisplayed();
		assertTrue(releaseButtonInCSReleaseIsDisplayed, "Release Button is not Displayed in CS Release Page.");

		click(driver, releaseButtonInCSRelease);
		return new HomePage();

	}

}
