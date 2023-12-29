package com.Getapcs.Avision.Sales;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class RFQ_ReleaseCS extends TestBase {

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='CS'])[1]")
	WebElement csButton;

	@FindBy(xpath = "(//button[text()='CS'])[1]")
	WebElement csButton1;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-rfq-item-view/div[2]/div/div/div/form/div/div[4]/div/div/div/table/thead/tr/th[1]/input")
	WebElement itemTabCheckBox;

	@FindBy(xpath = "(//input[@value='1400'])[1]")
	WebElement itemTabCheckBox1;

	@FindBy(xpath = "(//button[normalize-space()='Release'])[1]")
	WebElement releaseButtonInCSRelease;

	public RFQ_ReleaseCS() {
		PageFactory.initElements(driver, this);
	}

	JavascriptExecutor executor = (JavascriptExecutor) driver;

	public HomePage RFQCs() throws Throwable {

		// Verify and Release the CS
		// Verify and Click on CS Button1
		boolean csButton1IsDisplayed = csButton1.isDisplayed();
		assertTrue(csButton1IsDisplayed, "CS Button1 is not Dsiplayed");
		csButton1.sendKeys(Keys.ENTER);

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
