package com.Getapcs.Avision.Engineering;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class EnggBOM_ReleaseBOM_SA1 extends TestBase {

	@FindBy(xpath = "//i[@class='mdi mdi-plus-box-outline edit-icon']")
	WebElement bomForReleaseCreateButton;

	@FindBy(xpath = "//ng-select[@placeholder='Select Release For']")
	WebElement relaeseForDropDown;

	@FindBy(xpath = "(//div[@role='option'])[1]")
	WebElement selectEngineering;

	@FindBy(xpath = "//span[contains(text(),'Costing')]")
	WebElement selectCosting;

	@FindBy(xpath = "//span[contains(text(),'Production')]")
	WebElement selectProduction;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement releaseItemNumberDropDown;
	@FindBy(xpath = "(//span[normalize-space()='45678123'])[1]")
	WebElement itemNumberDropDownDataSelect;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement releaseVersionDropDown;
	@FindBy(xpath = "//span[@class='ng-option-label ng-star-inserted']")
	WebElement releaseVersionDropDownDataSeelect;

	@FindBy(xpath = "//textarea[@placeholder='Enter Release Note']")
	WebElement releaseNoteField;

	@FindBy(xpath = "//button[normalize-space()='Release']")
	WebElement releaseButton;

	public EnggBOM_ReleaseBOM_SA1() {
		PageFactory.initElements(driver, this);
	}

	public HomePage releaseBom(String releaseNote) throws Throwable {

		System.out.println("\n" + "EnggBOM_ReleaseBOM_SA1  Started" + "\n");

		driver.navigate().to("https://avision-demo.getapcs.com/engineering/engg-bom/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String ItemNumber = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath = elementXpath.replace("Item-FG-11-TEST", ItemNumber);

		System.out.println(updatedXpath);
		driver.navigate().to("https://avision-demo.getapcs.com/engineering/release-bom/table");

		for (int i = 1; i <= 3; i++) {

			bomForReleaseCreateButton = driver
					.findElement(By.xpath("//i[@class='mdi mdi-plus-box-outline edit-icon']"));
			Thread.sleep(2000);
//		//			js.executeScript("arguments[0].click();", bomForReleaseCreateButton);
			click(driver, bomForReleaseCreateButton);

			relaeseForDropDown = driver.findElement(By.xpath("//ng-select[@placeholder='Select Release For']"));
			Thread.sleep(2000);
//			click(driver, relaeseForDropDown);
			actions.click(relaeseForDropDown).perform();
			if (i == 1) {
				selectEngineering = driver.findElement(By.xpath("(//div[@role='option'])[1]"));
				Thread.sleep(2000);
//				js.executeScript("arguments[0].click();", selectEngineering);
				click(driver, selectEngineering);
			}
			if (i == 2) {
				selectCosting = driver.findElement(By.xpath("(//span[normalize-space()='Costing'])[1]"));
				Thread.sleep(2000);
//				js.executeScript("arguments[0].click();", selectCosting);
				click(driver, selectCosting);
			}
			if (i == 3) {
				selectProduction = driver.findElement(By.xpath("(//span[normalize-space()='Production'])[1]"));
				Thread.sleep(2000);
//				js.executeScript("arguments[0].click();", selectProduction);
				click(driver, selectProduction);
			}

			releaseItemNumberDropDown = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			js.executeScript("arguments[0].scrollIntoView(true);", releaseItemNumberDropDown);
			Thread.sleep(2000);
//			releaseItemNumberDropDown.click();
			click(driver, releaseItemNumberDropDown);

			WebElement itemNumberDropDownDataSelect = driver.findElement(By.xpath(updatedXpath));
			click(driver, itemNumberDropDownDataSelect);

			releaseVersionDropDown = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			js.executeScript("arguments[0].scrollIntoView(true);", releaseVersionDropDown);
			Thread.sleep(2000);
			releaseVersionDropDown.sendKeys(Keys.ENTER);
			releaseVersionDropDown.sendKeys(Keys.ENTER);

			releaseNoteField = driver.findElement(By.xpath("//textarea[@placeholder='Enter Release Note']"));
			js.executeScript("arguments[0].scrollIntoView(true);", releaseNoteField);
			releaseNoteField.sendKeys(releaseNote);
			// 1Verifying that Item Number Text Field is Enabled or not
			assertTrue(releaseNoteField.isEnabled());

			// Verifying that ReleaseNotes Text Field is displayed or hidden.
			assertTrue(releaseNoteField.isDisplayed());

			releaseButton = driver.findElement(By.xpath("//button[normalize-space()='Release']"));
			js.executeScript("arguments[0].scrollIntoView(true);", releaseButton);
			Thread.sleep(2000);

			click(driver, releaseButton);
			Thread.sleep(5000);

			System.out.println("\n" + "EnggBOM_ReleaseBOM_SA1  Ended" + "\n");

		}

		return new HomePage();

	}
}