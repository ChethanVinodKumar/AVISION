package com.Getapcs.Avision.Transaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class MaterialIssue_SA2 extends TestBase {

	// Material Issue

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Issue Material'])[3]")
	WebElement issueMaterial;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	WebElement issueCheckBox;

	@FindBy(xpath = "(//button[normalize-space()='Issue'])[1]")
	WebElement issueButton;

	public MaterialIssue_SA2() {

		PageFactory.initElements(driver, this);

	}

	// *************Material Issue Page******************//

	public HomePage MaterialIssuePage() throws InterruptedException {

		click(driver, issueMaterial);

		System.out.println("//************Material Issue***************//");

		Thread.sleep(2000);

		click(driver, issueCheckBox);
		click(driver, issueButton);

		return new HomePage();
	}
}
