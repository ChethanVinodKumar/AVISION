package com.Getapcs.Avision.Transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class ShopOrder_For_SA2 extends TestBase {

	// Shop Order

	@FindBy(id = "4")
	WebElement saRadioButton;

	@FindBy(xpath = "//input[@formcontrolname='itemNoDesc']")
	WebElement saItemNumberDropDown;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement bomVersionNoDropDown;
	@FindBy(xpath = "(//span[normalize-space()='1'])[1]")
	WebElement bomVersionNoDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement projectNoDropDown;

	@FindBy(xpath = "//input[@placeholder='DD-MM-YYYY']")
	WebElement soCloseDatePicker;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	WebElement releaseQty;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public ShopOrder_For_SA2() {

		PageFactory.initElements(driver, this);
	}

//*************Shop Order Create Page******************

	public HomePage ShopOrderCreate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("//*************Shop Order Create Page******************");
		driver.navigate().to("https://avision-demo.getapcs.com/engineering/engg-bom/table");

		String tableXpath = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String saItemNumber1 = driver.findElement(By.xpath(tableXpath + "/tbody/tr[2]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathSA = elementXpath.replace("Item-FG-11-TEST", saItemNumber1 + "-Test Description");

		System.out.println(updatedXpathSA);

		// ***********//

		driver.navigate().to("https://avision-demo.getapcs.com/sales/rfq/table");

		String tableXpath1 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String projectNumber = driver.findElement(By.xpath(tableXpath1 + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath1 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpathProjectNo = elementXpath1.replace("Item-FG-11-TEST", projectNumber);

		System.out.println(updatedXpathProjectNo);

		// *****//

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/sales-order/table");

		String tableXpath2 = "//table[@class='table table-striped']";

		// Get the first PR number text from table
		String salesOrderNumber = driver.findElement(By.xpath(tableXpath2 + "/tbody/tr[1]/td[2]")).getText();

		// Store the element with hard coded PR number
		String elementXpath2 = "(//span[normalize-space()='Item-FG-11-TEST'])[1]";

		String updatedXpath2 = elementXpath2.replace("Item-FG-11-TEST", salesOrderNumber);

		System.out.println(updatedXpath2);

		driver.navigate().to("https://avision-demo.getapcs.com/transaction/shop-order/create");

//SO Close Date

		Thread.sleep(4000);

//		js.executeScript("arguments[0].click();", saRadioButton);

//		saRadioButton.click();
		click(driver, saRadioButton);

		click(driver, saItemNumberDropDown);
		isSelected(driver, saItemNumberDropDown, "saItemNumberDropDown");
		saItemNumberDropDown.sendKeys(saItemNumber1);
		Thread.sleep(2000);
		WebElement saNumberSelect = driver.findElement(By.xpath(updatedXpathSA));
		click(driver, saNumberSelect);

		click(driver, bomVersionNoDropDown);
		isSelected(driver, bomVersionNoDropDown, "bomVersionNoDropDown");
		click(driver, bomVersionNoDropDownSelectData);

		click(driver, projectNoDropDown);
		isSelected(driver, projectNoDropDown, "projectNoDropDown");
		WebElement projectNo = driver.findElement(By.xpath(updatedXpathProjectNo));
		click(driver, projectNo);

		Thread.sleep(4000);

		datePicker(driver, soCloseDatePicker);

//		String saRequiredQty = driver
//				.findElement(By.xpath("//table[@formarrayname='ItemData']/tbody/tr[1]/td[6]/div/input")).getText();
//		
		String saRequiredQty = (String) js.executeScript("return arguments[0].value;", driver.findElement(
				By.xpath("//table[@formarrayname='ItemData']/tbody/tr[1]/td[6]/div//input[@type='text']")));

		System.out.println("saRequiredQty : " + saRequiredQty);

//		assertEquals(salesOrderNumber, salesOrderNumberExpected);

//Release Qty

		click(driver, releaseQty);
		isSelected(driver, releaseQty, "releaseQty");
		releaseQty.clear();
		releaseQty.sendKeys(saRequiredQty);

//Save Button
		waitForElement(driver, saveButton, 10, 2);
		Thread.sleep(4000);
		click(driver, saveButton);
		return new HomePage();
	}

}