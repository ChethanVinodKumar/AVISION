package com.Getapcs.Avision.BASECLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShopOrderConfirmationDynamicValue extends TestBase {

	public static int validateProducedQuantity(WebElement table) {

		// Find cells
		WebElement bomQtyCell = driver.findElement(By.xpath("//table[@class='table mb-2']/tbody/tr[1]/td[4]"));
		WebElement issuedQtyCell = driver.findElement(By.xpath("//table[@class='table mb-2']/tbody/tr[1]/td[5]"));

		System.out.println(bomQtyCell);
		System.out.println(issuedQtyCell);

		// Get values and calculate
		int bomQty = Integer.parseInt(bomQtyCell.getText());
		int issuedQty = Integer.parseInt(issuedQtyCell.getText());
		int producedQty = issuedQty / bomQty;

		// Validate and print
		System.out.println("Produced Qty: " + producedQty);
		if (bomQty * producedQty == issuedQty) {
			System.out.println("Produced quantity validation SUCCESS");
		} else {
			System.out.println("Produced quantity validation FAILED");
		}

		return producedQty;
	}

}