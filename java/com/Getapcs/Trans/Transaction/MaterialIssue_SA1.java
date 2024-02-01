package com.Getapcs.Trans.Transaction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Trans.BASECLASS.TestBase;
import com.Getapcs.Trans.HomeLogin.HomePage;

public class MaterialIssue_SA1 extends TestBase {

	// Material Issue

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Issue Material'])[2]")
	WebElement issueMaterial;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	WebElement issueCheckBox;

	@FindBy(xpath = "(//button[normalize-space()='Issue'])[1]")
	WebElement issueButton;

	public MaterialIssue_SA1() {

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
