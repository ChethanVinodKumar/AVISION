package com.Getapcs.Avision.TEST;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.Engineering.EnggBOM_ReleaseBOM;
import com.Getapcs.Avision.Engineering.Engg_BOM_Create_Page;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page1;
import com.Getapcs.Avision.HomeLogin.HomePage;
import com.Getapcs.Avision.HomeLogin.LoginPage;
import com.Getapcs.Avision.Sales.ItemPriceList_CreatePage;
import com.Getapcs.Avision.Sales.QuoteCreatePage;
import com.Getapcs.Avision.Sales.RFQ_CreatePage;
import com.Getapcs.Avision.Sales.RFQ_ReleaseCS;
import com.Getapcs.Avision.Sales.RFQ_ReleaseEngg;
import com.Getapcs.Avision.SecondaryMaster.Price_List;
import com.Getapcs.Avision.Transaction.MaterialIssue;
import com.Getapcs.Avision.Transaction.Purchase_Requisation;
import com.Getapcs.Avision.Transaction.SalesOrder;
import com.Getapcs.Avision.Transaction.ShopOrder;

public class TEST_Create extends TestBase {

	public final static String priceList = "TEST PriceList 1";
	public final static String fg = "FG-1";
	public final static String pp = "PP-1";

	LoginPage loginPage;
	HomePage homePage;

	Item_Master_Create_Page itemMasterCreatePage;
	Item_Master_Create_Page1 itemMasterCreatePage1;
	Engg_BOM_Create_Page enggBomCreatePage;
	Price_List Price_List;
	EnggBOM_ReleaseBOM releaseBom;
	ItemPriceList_CreatePage priceList_CreatePage;
	RFQ_CreatePage rfq_CreatePage;
	RFQ_ReleaseCS rfq_ReleaseCS;
	RFQ_ReleaseEngg RFQ_ReleaseEngg;
	QuoteCreatePage quoteCreatePage;
	SalesOrder SalesOrder;
	MaterialIssue MaterialIssue;
	Purchase_Requisation Purchase_Requisation;
//	PRApproval1 PRApproval1;
//	PRApproval2 PRApproval2;
//	Purchase_Order Purchase_Order;
//	openGrin openGrin;
//	Grin Grin;
//	IQCConfirmation IQCConfirmation;
//	Binning Binning;
//	ShopOrderConfirmation ShopOrderConfirmation;
//	InventryReportAfterSOC InventryReportAfterSOC;
//	OQC OQC;
//	OQCBinning OQCBinning;
//	InventryReportAfterOQCBinning InventryReportAfterOQCBinning;
//	DeliveryOrder DeliveryOrder;
//	InventryReportAfterDO InventryReportAfterDO;
//	ReturnDO ReturnDO;
//	MaterialRequest MaterialRequest;
//	Material_ReturnNote Material_ReturnNote;
//
//	InventryReportBeforeOpenGrin InventryReportBeforeOpenGrin;
//	InventryReportAfterOpenGrin InventryReportAfterOpenGrin;
//	InventryReportAfterGrin InventryReportAfterGrin;
//	InventryReportAfterIQCConfirmation InventryReportAfterIQCConfirmation;
//	InventryReportAfterBinning InventryReportAfterBinning;
//
//	Item_Master_Edit_Page itemMasterEditPage;
//	Engg_BOM_Edit_Page enggBomEditPage;
//	ItemPriceList_EditPage PriceList_EditPage;
//	RFQ_EditPage rfq_EditPage;
//	QuoteEditPage quoteEditPage;
//
//	VerifySalesOrderEditPage salesOrderEdit;
//	VerifyPR_EditPage VerifyPR_EditPage;
//	Purchase_Order_Edit Purchase_Order_Edit;
	ShopOrder ShopOrder;
//	VerifyInvoiceCreate VerifyInvoiceCreate;

	public TEST_Create() {
		super();
	}

	@BeforeTest
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login("admin@mail.com", "admin@123");
		itemMasterCreatePage = new Item_Master_Create_Page();
		itemMasterCreatePage1 = new Item_Master_Create_Page1();
//		itemMasterEditPage = new Item_Master_Edit_Page();
		enggBomCreatePage = new Engg_BOM_Create_Page();
//		enggBomEditPage = new Engg_BOM_Edit_Page();
		releaseBom = new EnggBOM_ReleaseBOM();
		priceList_CreatePage = new ItemPriceList_CreatePage();
		rfq_CreatePage = new RFQ_CreatePage();
		rfq_ReleaseCS = new RFQ_ReleaseCS();
		RFQ_ReleaseEngg = new RFQ_ReleaseEngg();
		quoteCreatePage = new QuoteCreatePage();
		SalesOrder = new SalesOrder();
		ShopOrder = new ShopOrder();
		MaterialIssue = new MaterialIssue();
//		Purchase_Order = new Purchase_Order();
		Purchase_Requisation = new Purchase_Requisation();
//		PRApproval1 = new PRApproval1();
//		PRApproval2 = new PRApproval2();
//		openGrin = new openGrin();
//		Grin = new Grin();
//		IQCConfirmation = new IQCConfirmation();
//		Binning = new Binning();
//		ShopOrderConfirmation = new ShopOrderConfirmation();
//		InventryReportAfterSOC = new InventryReportAfterSOC();
//		OQC = new OQC();
//		OQCBinning = new OQCBinning();
//		InventryReportAfterOQCBinning = new InventryReportAfterOQCBinning();
//		DeliveryOrder = new DeliveryOrder();
//		InventryReportAfterDO = new InventryReportAfterDO();
//		ReturnDO = new ReturnDO();
//		Price_List = new Price_List();
//		MaterialRequest = new MaterialRequest();
//		Material_ReturnNote = new Material_ReturnNote();
//
//		InventryReportBeforeOpenGrin = new InventryReportBeforeOpenGrin();
//		InventryReportAfterOpenGrin = new InventryReportAfterOpenGrin();
//		InventryReportAfterGrin = new InventryReportAfterGrin();
//		InventryReportAfterIQCConfirmation = new InventryReportAfterIQCConfirmation();
//		InventryReportAfterBinning = new InventryReportAfterBinning();
//
//		itemMasterEditPage = new Item_Master_Edit_Page();
//		enggBomEditPage = new Engg_BOM_Edit_Page();
//		PriceList_EditPage = new ItemPriceList_EditPage();
//		quoteEditPage = new QuoteEditPage();
//		rfq_EditPage = new RFQ_EditPage();
//		quoteEditPage = new QuoteEditPage();
//		salesOrderEdit = new VerifySalesOrderEditPage();
//		VerifyPR_EditPage = new VerifyPR_EditPage();
//		Purchase_Order_Edit = new Purchase_Order_Edit();
//		ShopOrder = new ShopOrder();
//		VerifyInvoiceCreate = new VerifyInvoiceCreate();
	}

//	@Test(priority = 1)
//	public void verifyPrice_ListCreate() throws AWTException, InterruptedException {
//		Thread.sleep(4000);
//		Price_List.Price_ListCreate(priceList, "TEST Description", "TEST Remarks");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}

	@Test(priority = 2)
	public void verifyItemMasterCreate() throws Throwable {

		homePage.clickOnItemMasterCreate();
		itemMasterCreatePage.itemMasterCreate(fg, "Test Description", "76543456", "Test Manufacturer or CustomerName",
				"DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323", "TEST-FootPrint", "TEST ProcessStep",
				"TEST descriptinRouting", "9", "10", "100", "5", "10", "Test Reorder", "TEST 2Bin", "TEST LeadTime",
				"TEST expiryDays", "TEST Inspection Int Days", "TEST specialInstructions", "TEST instructions", "10",
				"TEST BatchSize",

				"565");
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
		homePage.clickOnItemMasterCreate();
		itemMasterCreatePage1.itemMasterCreate(pp, "Test Description", "76543456", "Test Manufacturer or CustomerName",
				"DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323", "TEST-FootPrint", "TEST ProcessStep",
				"TEST descriptinRouting", "9", "10", "100", "5", "10", "Test Reorder", "TEST 2Bin", "TEST LeadTime",
				"TEST expiryDays", "TEST Inspection Int Days", "TEST specialInstructions", "TEST instructions", "10",
				"TEST BatchSize",

				"565");
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 3)
	public void verifyBomCreate() throws Throwable {

		homePage.clickOnBomCreatePage();
		enggBomCreatePage.bomCreate("1", // Quantity
				"50", // scarpAllowance
				"TestRemark", // Remark
				"1", // Version
				"10", // quantityPer
				"100", // probability
				"TEST Alternate Remark", // alternateRemark
				"1", // quantityNRE
				"20");// cost
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 4)
	public void verifyReleaseBom() throws Throwable {
		homePage.clickOnReleaseBomPage();
		releaseBom.releaseBom("Test Remark");// Remark
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 5)
	public void verifySalesItemPriceListCreate() throws AWTException, InterruptedException {

		// Purchase Order Create Page
		homePage.clickonTransactionPriceListCreate();
		priceList_CreatePage.ItemPriceListCreate("50", "200", "50", "100", "200", "40");

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 6)
	public void verifySalesRFQCreate() throws Throwable {

		// Purchase Order Create Page

		rfq_CreatePage.RFQCreate();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 7)
	public void verifySalesRFQCS() throws Throwable {

		// Purchase Order Create Page
		homePage.clickonSalesRfqModifyorView();
		Thread.sleep(4000);
		rfq_ReleaseCS.RFQCs("12", // ItemNumber
				"10", // Quantity
				"TEST Description", // Description
				"10", // QuantityInaddShedule
				"TEST Note"); // String Note

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 8)
	public void verifySalesRFQENGG() throws Throwable {

		// Purchase Order Create Page
		homePage.clickonSalesRfqModifyorView();
		Thread.sleep(4000);
		RFQ_ReleaseEngg.RFQEngg("10", // QuantityInaddShedule
				"TEST Note"); // String Note

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

//	@Test(priority = 8)
//	public void verifyQuoteCreate() throws Throwable {
//
//		// Purchase Order Create Page
//
//		quoteCreatePage.QuoteCreate("TEST Quote Ref", "10", "10", "5", "7", "7", "7", "7", "10", "10", "10", "9", "9",
//				"8", "8", "100", "7", "7", "6", "7", "TEST Special Terms");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 9)
//	public void verifySalesOrderCreate() throws Throwable {
//		homePage.clickOnSalesOrderCreate();
//		SalesOrder.salesOrderCreate("20", // generalDiscount
//				"20", // orderQty
//				"10", // discount1
//				"9", // sgst1
//				"9", // cgst1
//				"9", // igst1
//				"9", // utgst1
//				"10", // quantity1
//				"Test Remark", // remark1
//				"50", // orderqty2
//				"20", // discount2
//				"9", // sgst2
//				"9", // cgst2
//				"9", // igst2
//				"9", // utgst2
//				"15", // quantity2
//				"Test Remark2", // remark2
//				"50", // orderQty3
//				"10", // discount3
//				"9", // sgst3
//				"9", // cgst3
//				"9", // igst3
//				"9", // utgst3
//				"25", // quantity3
//				"Test Remark3", // remark3
//				"30", // orderQty4
//				"10", // discount4
//				"8", // sgst4
//				"8", // cgst4
//				"8", // igst4
//				"8", // utgst4
//				"15", // quantity4
//				"Test Remark4", // remark4
//				"PO57664", // poNumber
//				"TEST Remark", // billingandShippingRemark
//				"20", // totalAddidtional Charges
//				"8", // sgst
//				"8", // cgst
//				"8", // igst
//				"8", // utgst
//				"20");// specialDiscount
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 10)
//	public void verifyShopOrderCreate() throws Throwable {
//
//		homePage.clickOnTransactionShopOrderCreate();
//		ShopOrder.ShopOrderCreate();
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 11)
//	public void verifyMaterialIssue() throws Throwable {
//
//		homePage.clickOnTransactionMaterialIssue();
//		MaterialIssue.MaterialIssuePage();
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 12)
//	public void verifyPRcreate() throws Throwable {
//		homePage.clickOnPRCreatePage();
//		Purchase_Requisation.prCreatePage();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 13)
//
//	public void verifyPR_Approval1() throws Throwable {
//		homePage.clickOnPOApproval1();
//		PRApproval1.prApproval1Page();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 14)
//	public void verifyPR_Approval2() throws Throwable {
//		homePage.clickOnPRApproval2();
//		PRApproval2.prApproval2Page();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 15)
//	public void verifyPurchaseOrderCreate() throws Throwable {
//
//		// Purchase Order Create Page
//		homePage.clickontransactionPOcreate();
//		Purchase_Order.purchaseOrderCreatePage("10", "1000", "1000", "1000", "1000", "TEST Special Instructions", "8",
//				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 16)
//	public void verifyPurchaseOrderApproval1() throws AWTException, InterruptedException {
//		// Purchase Order POApproval 1
//
//		homePage.clickontransactionPOModelAndView();
//
//		System.out.println("Before Approval");
//		WebElement table = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));
//
//		// Extract the data from the first row of the table
//		WebElement firstRow = table.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
//		String projectNumber = firstRow.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
//		String approvalStatus = firstRow.findElement(By.xpath(".//td[6]")).getText(); // 6th column for approval status
//
//		// Output the extracted data
//		System.out.println("Project Number: " + projectNumber);
//		System.out.println("Approval Status: " + approvalStatus);
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickontransactionPOApproval1();
//		Purchase_Order.purchaseOrderApproval1();
//
//		System.out.println("After Approval");
//		WebElement table1 = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));
//
//		// Extract the data from the first row of the table
//		WebElement firstRow1 = table1.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
//		String projectNumber1 = firstRow1.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
//		String approvalStatus1 = firstRow1.findElement(By.xpath(".//td[6]")).getText(); // 6th column for approval
//																						// status
//
//		Thread.sleep(4000);
//
//		// Output the extracted data
//		System.out.println("Project Number: " + projectNumber1);
//		System.out.println("Approval Status: " + approvalStatus1);
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 17)
//	public void verifyPurchaseOrderApproval2() throws AWTException, InterruptedException {
//		// Purchase Order POApproval 2
//
//		homePage.clickontransactionPOModelAndView();
//
//		System.out.println("Before Approval");
//		WebElement table2 = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));
//
//		// Extract the data from the first row of the table
//		WebElement firstRow2 = table2.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
//		String projectNumber2 = firstRow2.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
//		String approvalStatus2 = firstRow2.findElement(By.xpath(".//td[7]")).getText(); // 6th column for approval
//																						// status
//
//		// Output the extracted data
//		System.out.println("Project Number: " + projectNumber2);
//		System.out.println("Approval Status: " + approvalStatus2);
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//
//		homePage.clickontransactionPOApproval2();
//		Purchase_Order.purchaseOrderApproval2();
//
//		System.out.println("After Approval");
//		WebElement table3 = driver.findElement(By.xpath("(//table[@class='table table-striped'])[1]"));
//
//		// Extract the data from the first row of the table
//		WebElement firstRow3 = table3.findElement(By.xpath("//tbody/tr[1]")); // Use tr[2] to skip the header row
//		String projectNumber3 = firstRow3.findElement(By.xpath(".//td[2]")).getText(); // 2nd column for project number
//		String approvalStatus3 = firstRow3.findElement(By.xpath(".//td[7]")).getText(); // 6th column for approval
//																						// status
//		Thread.sleep(4000);
//		// Output the extracted data
//
//		System.out.println("Project Number: " + projectNumber3);
//		System.out.println("Approval Status: " + approvalStatus3);
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 18)
//	public void verifyInventryReportBeforeGrin() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportBeforeOpenGrin.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
////
////	@Test(priority = 19)
////	public void verifyOpenGrinCreate() throws Throwable {
////		homePage.clickOnOpenGRINCreate();
////		openGrin.openGrinCreate();
////
////		Thread.sleep(4000);
////		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
////	}
////
////	@Test(priority = 20)
////	public void verifyInventryReportAfterOpenGRIN() throws Throwable {
////		homePage.clickOnInventryReportWithLocation();
////		InventryReportAfterOpenGrin.InventryReportPage();
////
////		Thread.sleep(4000);
////		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
////	}
////
//	@Test(priority = 21)
//	public void verifyGRINCreate() throws Throwable {
//		homePage.clickOnGRINCreate();
//		Grin.grinCreatePage("TEST-IN-1122", // invoiceNo
//				"10", // invoiceGST
//				"10", // totalInvoice
//				"7687769", // mftrBatchNo
//				"10", // unitPrice
//
//				"9", // sgst
//				"9", // cgst
//				"9", // igst
//				"9", // utgst
//				"AWB-1-5657", // awbNo1
//				"AWB-2-5657", // awbNo2
//				"BE-557", // beNo
//				"80", // beCurrencyValue
//				"10", // freight
//				"10", // insurance
//				"10", // loadingOrUnloading
//				"80", // currencyConversion
//				"10", // transport
//				"test charge");// otherChargesValue
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 22)
//	public void verifyInventryReportAfterGRIN() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterGrin.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 23)
//	public void verifyIQCCreate() throws Throwable {
//		homePage.clickOnIQCConfirmationCreate();
//		IQCConfirmation.iqcConfirmationCreatePage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 24)
//	public void verifyInventryReportAfterIQC() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterIQCConfirmation.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 25)
//	public void verifyBinningCreate() throws Throwable {
//		homePage.clickOnBinningCreate();
//		Binning.BinningCreatePage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 26)
//	public void verifyInventryReportAfterBinning() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterBinning.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 27)
//	public void verifyMaterialIssueAfterPRPO() throws Throwable {
//
//		homePage.clickOnTransactionMaterialIssue();
//		MaterialIssue.MaterialIssuePage();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 28)
//	public void verifyShopOrderConfirmation() throws Throwable {
//
//		homePage.clickOnShopOrderConfirmationCreate();
//		ShopOrderConfirmation.ShopOrderConfirmationCreate();
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 29)
//	public void verifyInventryReportAfterSOC() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterSOC.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 30)
//	public void verifyOQC() throws Throwable {
//
//		homePage.clickOnOQCCreate();
//		OQC.OQCCreate("10");
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 31)
//	public void verifyOQCBinning() throws Throwable {
//
//		homePage.clickOnOQCBinningCreate();
//		OQCBinning.OQCBinningCreate("5");
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 32)
//	public void verifyInventryReportAfterOQCBinning() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterOQCBinning.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 33)
//	public void verifyDOCreate() throws Throwable {
//
//		homePage.clickOnDOCreate();
//		DeliveryOrder.DeliveryOrderCreate("10", "5");
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 34)
//	public void verifyInventryReportAfterDO() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		InventryReportAfterDO.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
//	}
////
////	@Test(priority = 35)
////	public void verifyReturnDO() throws Throwable {
////		homePage.clickOnReturnDO();
////		ReturnDO.ReturnDOCreate();
////
////		Thread.sleep(4000);
////
////		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
////	}
////
////	@Test(priority = 37)
////	public void verifyInvoiceCreate() throws Throwable {
////		homePage.clickOnInvoiceCreate();
////		VerifyInvoiceCreate.invoiceCreate("TEST Remark");
////
////		Thread.sleep(4000);
////
////		driver.navigate().to("https://demo_keus.getapcs.com/dashboard");
////	}

}
