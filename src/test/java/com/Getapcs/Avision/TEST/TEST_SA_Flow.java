package com.Getapcs.Avision.TEST;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.Engineering.BOM_Create_FG_SA;
import com.Getapcs.Avision.Engineering.EnggBOM_ReleaseBOM;
import com.Getapcs.Avision.Engineering.Engg_BOM_Create_Page;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page1;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page_SA;
import com.Getapcs.Avision.HomeLogin.HomePage;
import com.Getapcs.Avision.HomeLogin.LoginPage;
import com.Getapcs.Avision.Sales.ItemPriceList_CreatePage;
import com.Getapcs.Avision.Sales.QuoteCreatePage;
import com.Getapcs.Avision.Sales.RFQ_CreatePage;
import com.Getapcs.Avision.Sales.RFQ_ReleaseCS;
import com.Getapcs.Avision.Sales.RFQ_ReleaseEngg;
import com.Getapcs.Avision.Sales.VerifyLPCostingCreate;
import com.Getapcs.Avision.Sales.VerifyLPCostingRelease;
import com.Getapcs.Avision.Sales.VerifySourcing;
import com.Getapcs.Avision.SecondaryMaster.Price_List;
import com.Getapcs.Avision.Transaction.MaterialIssue;
import com.Getapcs.Avision.Transaction.Purchase_Requisation;
import com.Getapcs.Avision.Transaction.SalesOrder;
import com.Getapcs.Avision.Transaction.ShopOrder;

public class TEST_SA_Flow extends TestBase {

	public final static String priceList = "TEST PriceList 1";
	public final static String fg = "FG-7";
	public final static String fgPP = "FG-PP-7";
	public final static String sa = "SA-6";
	public final static String saPP = "SA-PP-6";

	LoginPage loginPage;
	HomePage homePage;

	Item_Master_Create_Page itemMasterCreatePage;
	Item_Master_Create_Page1 itemMasterCreatePage1;
	Item_Master_Create_Page_SA itemMasterCreatePageSA;
	Engg_BOM_Create_Page enggBomCreatePage;
	BOM_Create_FG_SA enggBomCreatewithSAPage;
	Price_List Price_List;
	EnggBOM_ReleaseBOM releaseBom;
	ItemPriceList_CreatePage priceList_CreatePage;
	RFQ_CreatePage rfq_CreatePage;
	RFQ_ReleaseCS rfq_ReleaseCS;
	RFQ_ReleaseEngg RFQ_ReleaseEngg;
	VerifySourcing sourcing;
	VerifyLPCostingCreate lpCosting;
	VerifyLPCostingRelease lpCostingRelease;
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

	public TEST_SA_Flow() {
		super();
	}

	@BeforeTest
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login("admin@mail.com", "admin@123");
		itemMasterCreatePage = new Item_Master_Create_Page();
		itemMasterCreatePage1 = new Item_Master_Create_Page1();
		itemMasterCreatePageSA = new Item_Master_Create_Page_SA();
//		itemMasterEditPage = new Item_Master_Edit_Page();
		enggBomCreatePage = new Engg_BOM_Create_Page();
		enggBomCreatewithSAPage = new BOM_Create_FG_SA();
//		enggBomEditPage = new Engg_BOM_Edit_Page();
		releaseBom = new EnggBOM_ReleaseBOM();
		priceList_CreatePage = new ItemPriceList_CreatePage();
		rfq_CreatePage = new RFQ_CreatePage();
		sourcing = new VerifySourcing();
		lpCosting = new VerifyLPCostingCreate();
		lpCostingRelease = new VerifyLPCostingRelease();
//		rfq_ReleaseCS = new RFQ_ReleaseCS();
//		quoteCreatePage = new QuoteCreatePage();
//		SalesOrder = new SalesOrder();
//		ShopOrder = new ShopOrder();
//		MaterialIssue = new MaterialIssue();
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

//	@Test(priority = 2)
//	public void verifyItemMasterCreateforSA() throws Throwable {
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePageSA.itemMasterCreate(sa, "Test Description", "76543456", "Test Manufacturer or CustomerName",
//				"DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323", "TEST-FootPrint", "TEST ProcessStep",
//				"TEST descriptinRouting", "9", "10", "100", "5", "10", "Test Reorder", "TEST 2Bin", "TEST LeadTime",
//				"TEST expiryDays", "TEST Inspection Int Days", "TEST specialInstructions", "TEST instructions", "10",
//				"TEST BatchSize",
//
//				"565");
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePage1.itemMasterCreate(saPP, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize",
//
//				"565");
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 3)
//	public void verifyBomCreateforSA() throws Throwable {
//
//		homePage.clickOnBomCreatePage();
//		enggBomCreatePage.bomCreate("1", // Quantity
//				"50", // scarpAllowance
//				"TestRemark", // Remark
//				"1", // Version
//				"10", // quantityPer
//				"100", // probability
//				"TEST Alternate Remark", // alternateRemark
//				"1", // quantityNRE
//				"20");// cost
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 4)
//	public void verifyReleaseBomforSA() throws Throwable {
//		homePage.clickOnReleaseBomPage();
//		releaseBom.releaseBom("Test Remark");// Remark
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 5)
//	public void verifyItemMasterCreate() throws Throwable {
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePage.itemMasterCreate(fg, "Test Description", "76543456", "Test Manufacturer or CustomerName",
//				"DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323", "TEST-FootPrint", "TEST ProcessStep",
//				"TEST descriptinRouting", "9", "10", "100", "5", "10", "Test Reorder", "TEST 2Bin", "TEST LeadTime",
//				"TEST expiryDays", "TEST Inspection Int Days", "TEST specialInstructions", "TEST instructions", "10",
//				"TEST BatchSize", "565");
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePage1.itemMasterCreate(fgPP, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize",
//
//				"565");
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}

//	@Test(priority = 6)
//	public void verifyBomCreate() throws Throwable {
//
//		homePage.clickOnBomCreatePage();
//		enggBomCreatewithSAPage.bomCreate("10", // Quantity
//				"50", // scarpAllowance
//				"TestRemark", // Remark
//				"1", // Version
//				"10", // quantityPer
//				"10", // probability
//				"TEST Alternate Remark", // alternateRemark
//				"10", // quantityNRE
//				"20");// cost
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 7)
//	public void verifyReleaseBom() throws Throwable {
//		homePage.clickOnReleaseBomPage();
//		releaseBom.releaseBom("Test Remark");// Remark
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 8)
//	public void verifySalesItemPriceListCreate() throws AWTException, InterruptedException {
//
//		homePage.clickonTransactionPriceListCreate();
//		priceList_CreatePage.ItemPriceListCreate("50", "200", "50", "100", "200", "40");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 9)
//	public void verifySalesRFQCreate() throws Throwable {
//
//		rfq_CreatePage.RFQCreate();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 9)
//	public void verifySalesRFQCS() throws Throwable {
//
//		homePage.clickonSalesRfqModifyorView();
//		Thread.sleep(4000);
//		rfq_ReleaseCS.RFQCs(fg + "123", // ItemNumber
//				"10", // Quantity
//				"TEST Description", // Description
//				"10", // QuantityInaddShedule
//				"TEST Note"); // String Note
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 10)
//	public void verifySalesRFQENGG() throws Throwable {
//
//		homePage.clickonSalesRfqModifyorView();
//		Thread.sleep(4000);
//		RFQ_ReleaseEngg.RFQEngg("10", // QuantityInaddShedule
//				"TEST Note"); // String Note
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 11)
//	public void verifySalesSourcing() throws Throwable {
//
//		homePage.clickonSoucing();
//		sourcing.sourcingCreate();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 12)
//	public void verifySalesLpCosting() throws Throwable {
//
//		homePage.clickonLpCosting();
//		lpCosting.lpCostingCreate();
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickonLpCosting();
//		lpCostingRelease.lpCostingRelease();
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 10)
//	public void verifyQuoteCreate() throws Throwable {
//
//		quoteCreatePage.QuoteCreate("TEST Quote Ref", "10", "10", "5", "7", "7", "7", "7", "10", "10", "10", "9", "9",
//				"8", "8", "100", "7", "7", "6", "7", "TEST Special Terms");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	} 

	@Test(priority = 11)
	public void verifySalesOrderCreate() throws Throwable {
		homePage.clickOnSalesOrderCreate();
		SalesOrder.salesOrderCreate("20", // generalDiscount
				"20", // orderQty
				"10", // discount1
				"9", // sgst1
				"9", // cgst1
				"9", // igst1
				"9", // utgst1
				"10", // quantity1
				"Test Remark", // remark1
				"50", // orderqty2
				"20", // discount2
				"9", // sgst2
				"9", // cgst2
				"9", // igst2
				"9", // utgst2
				"15", // quantity2
				"Test Remark2", // remark2
				"50", // orderQty3
				"10", // discount3
				"9", // sgst3
				"9", // cgst3
				"9", // igst3
				"9", // utgst3
				"25", // quantity3
				"Test Remark3", // remark3
				"30", // orderQty4
				"10", // discount4
				"8", // sgst4
				"8", // cgst4
				"8", // igst4
				"8", // utgst4
				"15", // quantity4
				"Test Remark4", // remark4
				"PO57664", // poNumber
				"TEST Remark", // billingandShippingRemark
				"20", // totalAddidtional Charges
				"8", // sgst
				"8", // cgst
				"8", // igst
				"8", // utgst
				"20");// specialDiscount
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@AfterTest
	public void afetrTest() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
