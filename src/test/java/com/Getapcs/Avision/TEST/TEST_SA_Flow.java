package com.Getapcs.Avision.TEST;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.Engineering.EnggBOM_ReleaseBOM;
import com.Getapcs.Avision.Engineering.EnggBOM_ReleaseBOM_FG;
import com.Getapcs.Avision.Engineering.EnggBOM_ReleaseBOM_SA1;
import com.Getapcs.Avision.Engineering.EnggBOM_ReleaseBOM_SA2;
import com.Getapcs.Avision.Engineering.Engg_BOM_Create_Page;
import com.Getapcs.Avision.Engineering.Engg_BOM_Create_Page_FOR_FG;
import com.Getapcs.Avision.Engineering.Engg_BOM_Create_Page_FOR_SA_1;
import com.Getapcs.Avision.Engineering.Engg_BOM_Create_Page_FOR_SA_2;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page1;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page_SA;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterGrin;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterIQCConfirmation;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportBeforGrin;
import com.Getapcs.Avision.HomeLogin.HomePage;
import com.Getapcs.Avision.HomeLogin.LoginPage;
import com.Getapcs.Avision.SA_FG.Transaction.Grin_Create;
import com.Getapcs.Avision.Sales.ItemPriceList_CreatePage;
import com.Getapcs.Avision.Sales.QuoteCreatePage;
import com.Getapcs.Avision.Sales.RFQ_CreatePage;
import com.Getapcs.Avision.Sales.RFQ_ReleaseCS;
import com.Getapcs.Avision.Sales.RFQ_ReleaseEngg;
import com.Getapcs.Avision.Sales.VerifyLPCostingCreate;
import com.Getapcs.Avision.Sales.VerifyLPCostingRelease;
import com.Getapcs.Avision.Sales.VerifySourcing;
import com.Getapcs.Avision.SecondaryMaster.Price_List;
import com.Getapcs.Avision.Transaction.IQCConfirmation;
import com.Getapcs.Avision.Transaction.MaterialIssue;
import com.Getapcs.Avision.Transaction.MaterialIssue_FG;
import com.Getapcs.Avision.Transaction.MaterialIssue_SA1;
import com.Getapcs.Avision.Transaction.MaterialIssue_SA2;
import com.Getapcs.Avision.Transaction.PRApproval1;
import com.Getapcs.Avision.Transaction.PRApproval2;
import com.Getapcs.Avision.Transaction.Purchase_Order_FG;
import com.Getapcs.Avision.Transaction.Purchase_Order_SA1;
import com.Getapcs.Avision.Transaction.Purchase_Order_SA2;
import com.Getapcs.Avision.Transaction.Purchase_Requisation;
import com.Getapcs.Avision.Transaction.Purchase_Requisation_FG;
import com.Getapcs.Avision.Transaction.Purchase_Requisation_SA1;
import com.Getapcs.Avision.Transaction.Purchase_Requisation_SA2;
import com.Getapcs.Avision.Transaction.SalesOrder;
import com.Getapcs.Avision.Transaction.ShopOrder;
import com.Getapcs.Avision.Transaction.ShopOrder_For_FG;
import com.Getapcs.Avision.Transaction.ShopOrder_For_SA;
import com.Getapcs.Avision.Transaction.ShopOrder_For_SA2;

public class TEST_SA_Flow extends TestBase {

	public final static String priceList = "TEST PriceList 1";
	public final static String fg = "FG-20";
	public final static String pp1 = "PP-50";
	public final static String pp2 = "PP-51";
	public final static String pp3 = "PP-52";
	public final static String pp4 = "PP-53";
	public final static String pp5 = "PP-54";
	public final static String pp6 = "PP-55";
	public final static String sa1 = "SA-21";
	public final static String sa2 = "SA-22";

	LoginPage loginPage;
	HomePage homePage;

	Item_Master_Create_Page itemMasterCreatePageFG;
	Item_Master_Create_Page1 itemMasterCreatePagePP;
	Item_Master_Create_Page_SA itemMasterCreatePageSA;
	Engg_BOM_Create_Page_FOR_SA_2 enggBomCreatePageForSA2;
	Engg_BOM_Create_Page_FOR_SA_1 enggBomCreatePageForSA1;
	Engg_BOM_Create_Page_FOR_FG enggBomCreatePageForFG;
	Engg_BOM_Create_Page enggBomCreatePage;
	Price_List Price_List;
	EnggBOM_ReleaseBOM releaseBom;
	EnggBOM_ReleaseBOM_SA2 releaseBomSA2;
	EnggBOM_ReleaseBOM_SA1 releaseBomSA1;
	EnggBOM_ReleaseBOM_FG releaseBomFG;
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
	Purchase_Requisation_SA2 puchaseRequisitionSA2;
	Purchase_Requisation_SA1 puchaseRequisitionSA1;
	Purchase_Requisation_FG puchaseRequisitionFG;
	Purchase_Order_SA2 purchaseOrderSA2;
	Purchase_Order_SA1 purchaseOrderSA1;
	Purchase_Order_FG purchaseOrderFG;
	PRApproval1 PRApproval1;
	PRApproval2 PRApproval2;
	Grin_Create grin;
//	Purchase_Order Purchase_Order;
//	openGrin openGrin;
//	Grin Grin;
	IQCConfirmation IQCConfirmation;
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

	InventryReportBeforGrin inventryReportBeforGrin;
	InventryReportAfterGrin inventryReportAfterGrin;
	InventryReportAfterIQCConfirmation inventryReportAfterIQCConfirmation;
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
	ShopOrder_For_SA ShopOrderSA2;
	ShopOrder_For_SA2 ShopOrderSA1;
	ShopOrder_For_FG ShopOrderFG;
	MaterialIssue_SA2 materialIssueSA2;
	MaterialIssue_SA1 materialIssueSA1;
	MaterialIssue_FG materialIssueFG;
//	VerifyInvoiceCreate VerifyInvoiceCreate;

	public TEST_SA_Flow() {
		super();
	}

	@BeforeTest
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login("admin@mail.com", "admin@123");
		itemMasterCreatePageFG = new Item_Master_Create_Page();
		itemMasterCreatePagePP = new Item_Master_Create_Page1();
		itemMasterCreatePageSA = new Item_Master_Create_Page_SA();
//		itemMasterEditPage = new Item_Master_Edit_Page();
		enggBomCreatePage = new Engg_BOM_Create_Page();
		enggBomCreatePageForSA2 = new Engg_BOM_Create_Page_FOR_SA_2();
		enggBomCreatePageForSA1 = new Engg_BOM_Create_Page_FOR_SA_1();
		enggBomCreatePageForFG = new Engg_BOM_Create_Page_FOR_FG();
//		enggBomEditPage = new Engg_BOM_Edit_Page();
		releaseBom = new EnggBOM_ReleaseBOM();
		releaseBomSA2 = new EnggBOM_ReleaseBOM_SA2();
		releaseBomSA1 = new EnggBOM_ReleaseBOM_SA1();
		releaseBomFG = new EnggBOM_ReleaseBOM_FG();
		priceList_CreatePage = new ItemPriceList_CreatePage();
		rfq_CreatePage = new RFQ_CreatePage();
		sourcing = new VerifySourcing();
		lpCosting = new VerifyLPCostingCreate();
		lpCostingRelease = new VerifyLPCostingRelease();
//		rfq_ReleaseCS = new RFQ_ReleaseCS();
//		quoteCreatePage = new QuoteCreatePage();
//		SalesOrder = new SalesOrder();
//		ShopOrder = new ShopOrder();
		MaterialIssue = new MaterialIssue();
		materialIssueSA2 = new MaterialIssue_SA2();
		materialIssueSA1 = new MaterialIssue_SA1();
		materialIssueFG = new MaterialIssue_FG();
		rfq_ReleaseCS = new RFQ_ReleaseCS();
		RFQ_ReleaseEngg = new RFQ_ReleaseEngg();
		quoteCreatePage = new QuoteCreatePage();
		SalesOrder = new SalesOrder();
		ShopOrder = new ShopOrder();
		ShopOrderSA2 = new ShopOrder_For_SA();
		ShopOrderSA1 = new ShopOrder_For_SA2();
		ShopOrderFG = new ShopOrder_For_FG();
		MaterialIssue = new MaterialIssue();
//		Purchase_Order = new Purchase_Order();
		Purchase_Requisation = new Purchase_Requisation();

		puchaseRequisitionSA2 = new Purchase_Requisation_SA2();
		puchaseRequisitionSA1 = new Purchase_Requisation_SA1();
		puchaseRequisitionFG = new Purchase_Requisation_FG();
		PRApproval1 = new PRApproval1();
		PRApproval2 = new PRApproval2();
		purchaseOrderSA2 = new Purchase_Order_SA2();
		purchaseOrderSA1 = new Purchase_Order_SA1();
		purchaseOrderFG = new Purchase_Order_FG();
		grin = new Grin_Create();
//		openGrin = new openGrin();
//		Grin = new Grin();
//		IQCConfirmation = new IQCConfirmation();
//		Binning = new Binning();
//		ShopOrderConfirmation = new ShopOrderConfirmation();
//		InventryReportAfterSOC = new InventryReportAfterSOC();
//		OQC = new OQC();
//		OQCBinning = new OQCBinning();
		inventryReportBeforGrin = new InventryReportBeforGrin();
		inventryReportAfterGrin = new InventryReportAfterGrin();
		inventryReportAfterIQCConfirmation = new InventryReportAfterIQCConfirmation();
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
//	public void verifyPrice_ListCreate() throws Throwable {
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
//		itemMasterCreatePageFG.itemMasterCreate(fg, "Test Description", "76543456", "Test Manufacturer or CustomerName",
//				"DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323", "TEST-FootPrint", "TEST ProcessStep",
//				"TEST descriptinRouting", "9", "10", "100", "5", "10", "Test Reorder", "TEST 2Bin", "TEST LeadTime",
//				"TEST expiryDays", "TEST Inspection Int Days", "TEST specialInstructions", "TEST instructions", "10",
//				"TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePageSA.itemMasterCreate(sa1, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePageSA.itemMasterCreate(sa2, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp1, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp2, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp3, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp4, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp5, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp6, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//	}
//
//	@Test(priority = 3)
//	public void verifyBomCreateforSA_FG() throws Throwable {
//
//		homePage.clickOnBomCreatePage();
//		enggBomCreatePageForSA2.bomCreate("9", // Quantity
//				"50", // scarpAllowance
//				"TestRemark", // Remark
//				"1", // Version
//				"10", // quantityPer
//				"100", // probability
//				"TEST Alternate Remark", // alternateRemark
//				"1", // quantityNRE
//				"20");// cost
//		Thread.sleep(3000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnBomCreatePage();
//		enggBomCreatePageForSA1.bomCreate("8", // Quantity
//				"50", // scarpAllowance
//				"TestRemark", // Remark
//				"1", // Version
//				"10", // quantityPer
//				"100", // probability
//				"TEST Alternate Remark", // alternateRemark
//				"1", // quantityNRE
//				"20");// cost
//		Thread.sleep(3000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnBomCreatePage();
//		enggBomCreatePageForFG.bomCreate("7", // Quantity
//				"50", // scarpAllowance
//				"TestRemark", // Remark
//				"1", // Version
//				"10", // quantityPer
//				"100", // probability
//				"TEST Alternate Remark", // alternateRemark
//				"1", // quantityNRE
//				"20");// cost
//		Thread.sleep(3000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//	}
//
//	@Test(priority = 4)
//	public void verifyReleaseBom() throws Throwable {
//
//		homePage.clickOnReleaseBomPage();
//		releaseBomSA2.releaseBom("Test Remark");// Remark
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnReleaseBomPage();
//		releaseBomSA1.releaseBom("Test Remark");// Remark
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		homePage.clickOnReleaseBomPage();
//		releaseBomFG.releaseBom("Test Remark");// Remark
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
//		homePage.clickonRFQCreate();
//		rfq_CreatePage.RFQCreate();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 10)
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
//	@Test(priority = 11)
//	public void verifySalesRFQENGG() throws Throwable {
//
//		homePage.clickonSalesRfqModifyorView();
//		RFQ_ReleaseEngg.RFQEngg("10", // QuantityInaddShedule
//				"TEST Note"); // String Note
//
//		Thread.sleep(3000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 12)
//	public void verifySalesSourcing() throws Throwable {
//
//		homePage.clickonSoucing();
//		sourcing.sourcingCreate();
//
//		Thread.sleep(3000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 13)
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
//	@Test(priority = 14)
//	public void verifyQuoteCreate() throws Throwable {
//
//		quoteCreatePage.QuoteCreate("TEST Quote Ref", "10", "10", "5", "7", "7", "7", "7", "10", "10", "10", "9", "9",
//				"8", "8", "100", "7", "7", "6", "7", "TEST Special Terms");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 15)
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

	@Test(priority = 16)
	public void verifyShopOrderCreate() throws Throwable {

		homePage.clickOnTransactionShopOrderCreate();
		ShopOrderSA2.ShopOrderCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		homePage.clickOnTransactionShopOrderCreate();
		ShopOrderSA1.ShopOrderCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		homePage.clickOnTransactionShopOrderCreate();
		ShopOrderFG.ShopOrderCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 17)
	public void verifyMaterialIssue() throws Throwable {

		homePage.clickOnTransactionMaterialIssue();
		materialIssueSA2.MaterialIssuePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		homePage.clickOnTransactionMaterialIssue();
		materialIssueSA1.MaterialIssuePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		homePage.clickOnTransactionMaterialIssue();
		materialIssueFG.MaterialIssuePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 18)
	public void verifyPRcreate$Approvals_1_2() throws Throwable {

		homePage.clickOnPRCreatePage();
		puchaseRequisitionSA2.prCreatePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		homePage.clickOnPOApproval1();
		PRApproval1.prApproval1Page();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		homePage.clickOnPRApproval2();
		PRApproval2.prApproval2Page();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		// ##############################################################################

		homePage.clickOnPRCreatePage();
		puchaseRequisitionSA1.prCreatePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		homePage.clickOnPOApproval1();
		PRApproval1.prApproval1Page();
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		homePage.clickOnPRApproval2();
		PRApproval2.prApproval2Page();
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		// ############################################################################

		homePage.clickOnPRCreatePage();
		puchaseRequisitionFG.prCreatePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		homePage.clickOnPOApproval1();
		PRApproval1.prApproval1Page();
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		homePage.clickOnPRApproval2();
		PRApproval2.prApproval2Page();
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 19)
	public void verifyPOcreate$Approvals_1_2() throws Throwable {

		// ######### Purchase Order Create Page For SA2 ###############
		homePage.clickontransactionPOcreate();
		purchaseOrderSA2.purchaseOrderCreatePage("10", "100", "1000", "1000", "1000", "TEST Special Instructions", "8",
				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		// Purchase Order POApproval 1
		homePage.clickontransactionPOApproval1();
		purchaseOrderSA2.purchaseOrderApproval1();
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
		// Purchase Order POApproval 2
		homePage.clickontransactionPOApproval2();
		purchaseOrderSA2.purchaseOrderApproval2();
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		// ######### Purchase Order Create Page For SA1 ###############
		homePage.clickontransactionPOcreate();
		purchaseOrderSA1.purchaseOrderCreatePage("10", "100", "1000", "1000", "1000", "TEST Special Instructions", "8",
				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		// Purchase Order POApproval 1
		homePage.clickontransactionPOApproval1();
		purchaseOrderSA1.purchaseOrderApproval1();
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
		// Purchase Order POApproval 2
		homePage.clickontransactionPOApproval2();
		purchaseOrderSA1.purchaseOrderApproval2();
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		// ######### Purchase Order Create Page For FG ###############
		homePage.clickontransactionPOcreate();
		purchaseOrderFG.purchaseOrderCreatePage("10", "100", "1000", "1000", "1000", "TEST Special Instructions", "8",
				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		// Purchase Order POApproval 1
		homePage.clickontransactionPOApproval1();
		purchaseOrderFG.purchaseOrderApproval1();
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
		// Purchase Order POApproval 2
		homePage.clickontransactionPOApproval2();
		purchaseOrderFG.purchaseOrderApproval2();
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}
//
//	@Test(priority = 20)
//	public void verifyInventryReportBeforeGrin() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		inventryReportBeforGrin.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 21)
//	public void verifyGRINCreate() throws Throwable {
//		homePage.clickOnGRINCreate();
//		grin.grinCreatePage("TEST-IN-1122", // invoiceNo
//				"10", // invoiceGST
//				"10", // totalInvoice
//				"m1", // mftrBatchNo
//				"10", // unitPrice
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
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 22)
//	public void verifyInventryReportAfterGrin() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		inventryReportAfterGrin.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 23)
//	public void verifyIQCCreate() throws Throwable {
//		homePage.clickOnIQCConfirmationCreate();
//		IQCConfirmation.iqcConfirmationCreatePage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 24)
//	public void verifyInventryReportAfterIQC() throws Throwable {
//		homePage.clickOnInventryReportWithLocation();
//		inventryReportAfterIQCConfirmation.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@AfterTest
//	public void afetrTest() {
//		driver.manage().window().minimize();
//		driver.quit();
//	}

}
