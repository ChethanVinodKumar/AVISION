package com.Getapcs.Avision.TEST;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Getapcs.Avision.BASECLASS.FG_DynamicValue;
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
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterBinning;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterGrin;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterIQCConfirmation;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterMaterialIssue_FG;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterMaterialIssue_SA1;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterMaterialIssue_SA2;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterReturnDO;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportBeforGrin;
import com.Getapcs.Avision.HomeLogin.HomePage;
import com.Getapcs.Avision.HomeLogin.LoginPage;
import com.Getapcs.Avision.InventryReports.InventryReportAfterDO;
import com.Getapcs.Avision.SA_FG.Transaction.Binning_SA_FG;
import com.Getapcs.Avision.SA_FG.Transaction.Grin_Create;
import com.Getapcs.Avision.SA_FG.Transaction.OQCBinning_FG;
import com.Getapcs.Avision.SA_FG.Transaction.OQCBinning_SA1;
import com.Getapcs.Avision.SA_FG.Transaction.OQCBinning_SA2;
import com.Getapcs.Avision.SA_FG.Transaction.OQC_FG;
import com.Getapcs.Avision.SA_FG.Transaction.OQC_SA1;
import com.Getapcs.Avision.SA_FG.Transaction.OQC_SA2;
import com.Getapcs.Avision.SA_FG.Transaction.ShopOrderConfirmation_FG;
import com.Getapcs.Avision.SA_FG.Transaction.ShopOrderConfirmation_SA1;
import com.Getapcs.Avision.SA_FG.Transaction.ShopOrderConfirmation_SA2;
import com.Getapcs.Avision.Sales.ItemPriceList_CreatePage;
import com.Getapcs.Avision.Sales.QuoteCreatePage;
import com.Getapcs.Avision.Sales.RFQ_CreateCS;
import com.Getapcs.Avision.Sales.RFQ_CreateEngg;
import com.Getapcs.Avision.Sales.RFQ_CreatePage;
import com.Getapcs.Avision.Sales.VerifyLPCostingCreate;
import com.Getapcs.Avision.Sales.VerifyLPCostingRelease;
import com.Getapcs.Avision.Sales.VerifySourcing;
import com.Getapcs.Avision.SecondaryMaster.Price_List;
import com.Getapcs.Avision.Transaction.DeliveryOrder;
import com.Getapcs.Avision.Transaction.IQCConfirmation;
import com.Getapcs.Avision.Transaction.MaterialIssue;
import com.Getapcs.Avision.Transaction.MaterialIssue_FG;
import com.Getapcs.Avision.Transaction.MaterialIssue_SA1;
import com.Getapcs.Avision.Transaction.MaterialIssue_SA2;
import com.Getapcs.Avision.Transaction.PO_Approval1;
import com.Getapcs.Avision.Transaction.PO_Approval2;
import com.Getapcs.Avision.Transaction.PRApproval1;
import com.Getapcs.Avision.Transaction.PRApproval2;
import com.Getapcs.Avision.Transaction.Purchase_Order_FG;
import com.Getapcs.Avision.Transaction.Purchase_Order_SA1;
import com.Getapcs.Avision.Transaction.Purchase_Order_SA2;
import com.Getapcs.Avision.Transaction.Purchase_Requisation;
import com.Getapcs.Avision.Transaction.Purchase_Requisation_FG;
import com.Getapcs.Avision.Transaction.Purchase_Requisation_SA1;
import com.Getapcs.Avision.Transaction.Purchase_Requisation_SA2;
import com.Getapcs.Avision.Transaction.ReturnDO;
import com.Getapcs.Avision.Transaction.SalesOrder;
import com.Getapcs.Avision.Transaction.ShopOrder;
import com.Getapcs.Avision.Transaction.ShopOrder_For_FG;
import com.Getapcs.Avision.Transaction.ShopOrder_For_SA;
import com.Getapcs.Avision.Transaction.ShopOrder_For_SA2;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TEST_SA_Flow extends TestBase {
	
	public ExtentReports reports;
	public ExtentSparkReporter htmlReporter;
	public ExtentTest test;

	public final static String priceList = "TEST PriceList 0001";

	LoginPage loginPage;
	HomePage homePage;

	// Engg
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

	// Sales
	ItemPriceList_CreatePage priceList_CreatePage;
	RFQ_CreatePage rfq_CreatePage;
	RFQ_CreateCS rfq_CreateCS;
	RFQ_CreateEngg RFQ_CreateEngg;
	VerifySourcing sourcing;
	VerifyLPCostingCreate lpCosting;
	VerifyLPCostingRelease lpCostingRelease;
	QuoteCreatePage quoteCreatePage;

	// Transaction
	SalesOrder SalesOrder;
	MaterialIssue MaterialIssue;
	Purchase_Requisation Purchase_Requisation;
	Purchase_Requisation_SA2 puchaseRequisitionSA2;
	Purchase_Requisation_SA1 puchaseRequisitionSA1;
	Purchase_Requisation_FG puchaseRequisitionFG;
	Purchase_Order_SA2 purchaseOrderSA2;
	Purchase_Order_SA1 purchaseOrderSA1;
	Purchase_Order_FG purchaseOrderFG;
	PO_Approval1 poApproval1;
	PO_Approval2 poApproval2;
	PRApproval1 PRApproval1;
	PRApproval2 PRApproval2;
	Grin_Create grin;
	IQCConfirmation iQCConfirmation;
	Binning_SA_FG binning;
	ShopOrder ShopOrder;
	ShopOrder_For_SA ShopOrderSA2;
	ShopOrder_For_SA2 ShopOrderSA1;
	ShopOrder_For_FG ShopOrderFG;
	ShopOrderConfirmation_SA2 shopOrderConfirmationSA2;
	ShopOrderConfirmation_SA1 shopOrderConfirmationSA1;
	ShopOrderConfirmation_FG shopOrderConfirmationFG;
	MaterialIssue_SA2 materialIssueSA2;
	MaterialIssue_SA1 materialIssueSA1;
	MaterialIssue_FG materialIssueFG;
	OQC_SA2 oqcSA2;
	OQC_SA1 oqcSA1;
	OQC_FG oqcFG;
	OQCBinning_SA2 oqcBinningSA2;
	OQCBinning_SA1 oqcBinningSA1;
	OQCBinning_FG oqcBinningFG;
	DeliveryOrder doOrder;
	ReturnDO returnDO;
//	OQC

	// Inventry
	InventryReportBeforGrin inventryReportBeforGrin;
	InventryReportAfterGrin inventryReportAfterGrin;
	InventryReportAfterIQCConfirmation inventryReportAfterIQCConfirmation;
	InventryReportAfterBinning inventryReportAfterBinning;
	InventryReportAfterMaterialIssue_SA2 inventryReportAfterMaterialIssue_SA2;
	InventryReportAfterMaterialIssue_SA1 inventryReportAfterMaterialIssue_SA1;
	InventryReportAfterMaterialIssue_FG inventryReportAfterMaterialIssue_FG;
	InventryReportAfterDO InventryReportAfterDO;
	InventryReportAfterReturnDO inventryReportAfterReturnDO;
	
	FG_DynamicValue fgDynamic;

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
		enggBomCreatePage = new Engg_BOM_Create_Page();
		enggBomCreatePageForSA2 = new Engg_BOM_Create_Page_FOR_SA_2();
		enggBomCreatePageForSA1 = new Engg_BOM_Create_Page_FOR_SA_1();
		enggBomCreatePageForFG = new Engg_BOM_Create_Page_FOR_FG();
		releaseBom = new EnggBOM_ReleaseBOM();
		releaseBomSA2 = new EnggBOM_ReleaseBOM_SA2();
		releaseBomSA1 = new EnggBOM_ReleaseBOM_SA1();
		releaseBomFG = new EnggBOM_ReleaseBOM_FG();
		priceList_CreatePage = new ItemPriceList_CreatePage();
		rfq_CreatePage = new RFQ_CreatePage();
		sourcing = new VerifySourcing();
		lpCosting = new VerifyLPCostingCreate();
		lpCostingRelease = new VerifyLPCostingRelease();
		MaterialIssue = new MaterialIssue();
		rfq_CreateCS = new RFQ_CreateCS();
		RFQ_CreateEngg = new RFQ_CreateEngg();
		quoteCreatePage = new QuoteCreatePage();
		SalesOrder = new SalesOrder();
		ShopOrder = new ShopOrder();
		ShopOrderSA2 = new ShopOrder_For_SA();
		ShopOrderSA1 = new ShopOrder_For_SA2();
		ShopOrderFG = new ShopOrder_For_FG();
		shopOrderConfirmationSA2 = new ShopOrderConfirmation_SA2();
		shopOrderConfirmationSA1 = new ShopOrderConfirmation_SA1();
		shopOrderConfirmationFG = new ShopOrderConfirmation_FG();
		materialIssueSA2 = new MaterialIssue_SA2();
		materialIssueSA1 = new MaterialIssue_SA1();
		materialIssueFG = new MaterialIssue_FG();
		Purchase_Requisation = new Purchase_Requisation();
		puchaseRequisitionSA2 = new Purchase_Requisation_SA2();
		puchaseRequisitionSA1 = new Purchase_Requisation_SA1();
		puchaseRequisitionFG = new Purchase_Requisation_FG();
		PRApproval1 = new PRApproval1();
		PRApproval2 = new PRApproval2();
		poApproval1 = new PO_Approval1();
		poApproval2 = new PO_Approval2();
		purchaseOrderSA2 = new Purchase_Order_SA2();
		purchaseOrderSA1 = new Purchase_Order_SA1();
		purchaseOrderFG = new Purchase_Order_FG();
		grin = new Grin_Create();
		iQCConfirmation = new IQCConfirmation();
		binning = new Binning_SA_FG();
		oqcSA2 = new OQC_SA2();
		oqcSA1 = new OQC_SA1();
		oqcFG = new OQC_FG();
		oqcBinningSA2 = new OQCBinning_SA2();
		oqcBinningSA1 = new OQCBinning_SA1();
		oqcBinningFG = new OQCBinning_FG();
		doOrder = new DeliveryOrder();
		returnDO = new ReturnDO();
		inventryReportBeforGrin = new InventryReportBeforGrin();
		inventryReportAfterGrin = new InventryReportAfterGrin();
		inventryReportAfterIQCConfirmation = new InventryReportAfterIQCConfirmation();
		inventryReportAfterBinning = new InventryReportAfterBinning();
		inventryReportAfterMaterialIssue_SA2 = new InventryReportAfterMaterialIssue_SA2();
		inventryReportAfterMaterialIssue_SA1 = new InventryReportAfterMaterialIssue_SA1();
		inventryReportAfterMaterialIssue_FG = new InventryReportAfterMaterialIssue_FG();
		InventryReportAfterDO = new InventryReportAfterDO();
		inventryReportAfterReturnDO = new InventryReportAfterReturnDO();
		
		htmlReporter = new ExtentSparkReporter("extentreport SA FG.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add environment details
		reports.setSystemInfo("Machine", "Testpc1");
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("user", "Gopal");
		reports.setSystemInfo("Browser", "Chrome");
		
		//Configuration to change look and feel
		htmlReporter.config().setDocumentTitle("Extent Report for SA_FG Flow");
		htmlReporter.config().setReportName("TEST AVision");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

	
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
//		test = reports.createTest("itemMasterCreatePageFG");
//		 String fg = FG_DynamicValue.generateDynamicValue();
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePageFG.itemMasterCreate(fg, "Test Description", "76543456", "Test Manufacturer or CustomerName",
//				"DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323", "TEST-FootPrint", "TEST ProcessStep",
//				"TEST descriptinRouting", "9", "10", "100", "5", "10", "Test Reorder", "TEST 2Bin", "TEST LeadTime",
//				"TEST expiryDays", "TEST Inspection Int Days", "TEST specialInstructions", "TEST instructions", "10",
//				"TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//		
//		
//
//		test = reports.createTest("verifyitemMasterCreatePageSA1");
//		String sa1 = SA_DynamicValue1.generateDynamicValue();
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePageSA.itemMasterCreate(sa1, "Test Description", "76543456",
//				
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		
//		test = reports.createTest("verifyitemMasterCreatePageSA2");
//		String sa2 = SA_DynamicValue2.generateDynamicValue();
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePageSA.itemMasterCreate(sa2, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		
//		test = reports.createTest("itemMasterCreatePagePP1");
//		String pp1 = PP_DynamicValue1.generateDynamicValue();
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp1, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		
//		test = reports.createTest("itemMasterCreatePagePP2");
//		String pp2 = PP_DynamicValue2.generateDynamicValue();
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp2, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		
//		test = reports.createTest("itemMasterCreatePagePP3");
//		String pp3 = PP_DynamicValue3.generateDynamicValue();
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp3, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		
//		test = reports.createTest("itemMasterCreatePagePP4");
//		String pp4 = PP_DynamicValue4.generateDynamicValue();
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp4, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		
//		test = reports.createTest("itemMasterCreatePagePP5");
//		String pp5 = PP_DynamicValue5.generateDynamicValue();
//		homePage.clickOnItemMasterCreate();
//		itemMasterCreatePagePP.itemMasterCreate(pp5, "Test Description", "76543456",
//				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
//				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
//				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
//				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		
//		test = reports.createTest("itemMasterCreatePagePP6");
//		String pp6 = PP_DynamicValue6.generateDynamicValue();
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
//		test = reports.createTest("enggBomCreatePageForSA2");
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
//		test = reports.createTest("enggBomCreatePageForSA1");
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
//		
//		test = reports.createTest("enggBomCreatePageForFG");
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
//		test = reports.createTest("releaseBomSA2");
//		homePage.clickOnReleaseBomPage();
//		releaseBomSA2.releaseBom("Test Remark");// Remark
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("releaseBomSA1");
//		homePage.clickOnReleaseBomPage();
//		releaseBomSA1.releaseBom("Test Remark");// Remark
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("releaseBomFG");
//		homePage.clickOnReleaseBomPage();
//		releaseBomFG.releaseBom("Test Remark");// Remark
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 5)
//	public void verifySalesItemPriceListCreate() throws AWTException, InterruptedException {
//		
//		test = reports.createTest("verifySalesItemPriceListCreate");
//		homePage.clickonTransactionPriceListCreate();
//		priceList_CreatePage.ItemPriceListCreate("50", "200", "50", "100", "200", "40");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 6)
//	public void verifySalesRFQCreate() throws Throwable {
//
//		test = reports.createTest("verifySalesRFQCreate");
//		homePage.clickonRFQCreate();
//		rfq_CreatePage.RFQCreate();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 7)
//	public void verifySalesRFQCS() throws Throwable {
//		
//		
//		test = reports.createTest("verifySalesRFQCS");
//		int counter = FG_DynamicValue.getCounter();
//		
//		homePage.clickonSalesRfqModifyorView();
//		Thread.sleep(4000);
//		rfq_ReleaseCS.RFQCs(String.valueOf(counter) + "123", // ItemNumber
//				"10", // Quantity
//				"TEST Description", // Description
//				"10", // QuantityInaddShedule
//				"TEST Note"); // String Note
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 8)
//	public void verifySalesRFQENGG() throws Throwable {
//
//		test = reports.createTest("verifySalesRFQENGG");
//		homePage.clickonSalesRfqModifyorView();
//		RFQ_ReleaseEngg.RFQEngg("10", // QuantityInaddShedule
//				"TEST Note"); // String Note
//
//		Thread.sleep(3000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 9)
//	public void verifySalesSourcing() throws Throwable {
//
//		test = reports.createTest("verifySalesSourcing");
//		homePage.clickonSoucing();
//		sourcing.sourcingCreate();
//
//		Thread.sleep(3000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 10)
//	public void verifySalesLpCosting() throws Throwable {
//
//		test = reports.createTest("lpCostingCreate");
//		homePage.clickonLpCosting();
//		lpCosting.lpCostingCreate();
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("lpCostingRelease");
//		homePage.clickonLpCosting();
//		lpCostingRelease.lpCostingRelease();
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 11)
//	public void verifyQuoteCreate() throws Throwable {
//
//		test = reports.createTest("QuoteCreate");
//		int counter = FG_DynamicValue.getCounter();
//		homePage.clickonSalesQuoteCreate();
//		quoteCreatePage.QuoteCreate("TEST Quote Ref"+String.valueOf(counter), "10", "10", "5", "7", "7", "7", "7", "10", "10", "10", "9", "9",
//				"8", "8", "100", "7", "7", "6", "7", "TEST Special Terms");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 12)
//	public void verifySalesOrderCreate() throws Throwable {
//		
//		test = reports.createTest("salesOrderCreate");
//		int counter = FG_DynamicValue.getCounter();
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
//				"PO"+counter, // poNumber
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
//	@Test(priority = 13)
//	public void verifyShopOrderCreate() throws Throwable {
//
//		test = reports.createTest("ShopOrderSA2Create");
//		homePage.clickOnTransactionShopOrderCreate();
//		ShopOrderSA2.ShopOrderCreate();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("ShopOrderSA1Create");
//		homePage.clickOnTransactionShopOrderCreate();
//		ShopOrderSA1.ShopOrderCreate();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("ShopOrderFGCreate");
//		homePage.clickOnTransactionShopOrderCreate();
//		ShopOrderFG.ShopOrderCreate();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 14)
//	public void verifyMaterialIssue() throws Throwable {
//
//		test = reports.createTest("materialIssueSA2");
//		homePage.clickOnTransactionMaterialIssue();
//		materialIssueSA2.MaterialIssuePage();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("materialIssueSA1");
//		homePage.clickOnTransactionMaterialIssue();
//		materialIssueSA1.MaterialIssuePage();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("materialIssueFG");
//		homePage.clickOnTransactionMaterialIssue();
//		materialIssueFG.MaterialIssuePage();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 15)
//	public void verifyPRcreate$Approvals_1_2() throws Throwable {
//
//		test = reports.createTest("puchaseRequisitionSA2 Create");
//		homePage.clickOnPRCreatePage();
//		puchaseRequisitionSA2.prCreatePage();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("puchaseRequisitionSA2 prApproval1");
//		homePage.clickOnPOApproval1();
//		PRApproval1.prApproval1Page();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("puchaseRequisitionSA2 prApproval2");
//		homePage.clickOnPRApproval2();
//		PRApproval2.prApproval2Page();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		// ##############################################################################
//
//		test = reports.createTest("puchaseRequisitionSA1 Create");
//		homePage.clickOnPRCreatePage();
//		puchaseRequisitionSA1.prCreatePage();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("puchaseRequisitionSA1 prApproval1");
//		homePage.clickOnPOApproval1();
//		PRApproval1.prApproval1Page();
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("puchaseRequisitionSA1 prApproval2");
//		homePage.clickOnPRApproval2();
//		PRApproval2.prApproval2Page();
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		// ############################################################################
//
//		test = reports.createTest("puchaseRequisitionFG Create");
//		homePage.clickOnPRCreatePage();
//		puchaseRequisitionFG.prCreatePage();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("puchaseRequisitionFG prApproval1");
//		homePage.clickOnPOApproval1();
//		PRApproval1.prApproval1Page();
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		test = reports.createTest("puchaseRequisitionFG prApproval2");
//		homePage.clickOnPRApproval2();
//		PRApproval2.prApproval2Page();
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//	}
//
//	@Test(priority = 16)
//	public void verifyPOcreate$Approvals_1_2() throws Throwable {
//
//		// ######### Purchase Order Create Page For SA2 ###############
//		test = reports.createTest("purchaseOrderSA2 Create");
//		homePage.clickontransactionPOcreate();
//		purchaseOrderSA2.purchaseOrderCreatePage("10", "100", "1000", "1000", "1000", "TEST Special Instructions", "8",
//				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		// Purchase Order POApproval 1
//		test = reports.createTest("purchaseOrderSA2 prApproval1");
//		homePage.clickontransactionPOApproval1();
//		poApproval1.purchaseOrderApproval1();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//		// Purchase Order POApproval 2
//		test = reports.createTest("purchaseOrderSA2 prApproval2");
//		homePage.clickontransactionPOApproval2();
//		poApproval2.purchaseOrderApproval2();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		// ######### Purchase Order Create Page For SA1 ###############
//		test = reports.createTest("purchaseOrderSA1 Create");
//		homePage.clickontransactionPOcreate();
//		purchaseOrderSA1.purchaseOrderCreatePage("10", "100", "1000", "1000", "1000", "TEST Special Instructions", "8",
//				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		// Purchase Order POApproval 1
//		test = reports.createTest("purchaseOrderSA1 prApproval1");
//		homePage.clickontransactionPOApproval1();
//		poApproval1.purchaseOrderApproval1();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//		// Purchase Order POApproval 2
//		test = reports.createTest("purchaseOrderSA1 prApproval2");
//		homePage.clickontransactionPOApproval2();
//		poApproval2.purchaseOrderApproval2();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
////		 ######### Purchase Order Create Page For FG ###############
//		test = reports.createTest("purchaseOrderFG Create");
//		homePage.clickontransactionPOcreate();
//		purchaseOrderFG.purchaseOrderCreatePage("10", "100", "1000", "1000", "1000", "TEST Special Instructions", "8",
//				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//
//		// Purchase Order POApproval 1
//		test = reports.createTest("purchaseOrderFG prApproval1");
//		homePage.clickontransactionPOApproval1();
//		poApproval1.purchaseOrderApproval1();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//		// Purchase Order POApproval 2
//		test = reports.createTest("purchaseOrderFG prApproval2");
//		homePage.clickontransactionPOApproval2();
//		poApproval2.purchaseOrderApproval2();
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 17)
//	public void verifyInventryReportBeforeGrin() throws Throwable {
//		test = reports.createTest("inventryReportBeforGrin");
//		homePage.clickOnInventryReportWithLocation();
//		inventryReportBeforGrin.InventryReportPage();
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}

	@Test(priority = 18)
	public void verifyGRINCreate() throws Throwable {
		test = reports.createTest("grinCreatePage");
		homePage.clickOnGRINCreate();
		grin.grinCreatePage("TEST-IN-1122", // invoiceNo
				"10", // invoiceGST
				"10", // totalInvoice
				"m1", // mftrBatchNo
				"10", // unitPrice
				"9", // sgst
				"9", // cgst
				"9", // igst
				"9", // utgst
				"AWB-1-5657", // awbNo1
				"AWB-2-5657", // awbNo2
				"BE-557", // beNo
				"80", // beCurrencyValue
				"10", // freight
				"10", // insurance
				"10", // loadingOrUnloading
				"80", // currencyConversion
				"10", // transport
				"test charge");// otherChargesValue

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 19)
	public void verifyInventryReportAfterGrin() throws Throwable {
		test = reports.createTest("inventryReportAfterGrin");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterGrin.InventryReportPage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 20)
	public void verifyIQCCreate() throws Throwable {
		test = reports.createTest("iqcConfirmationCreatePage");
		homePage.clickOnIQCConfirmationCreate();
		iQCConfirmation.iqcConfirmationCreatePage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 21)
	public void verifyInventryReportAfterIQC() throws Throwable {
		test = reports.createTest("inventryReportAfterIQCConfirmation");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterIQCConfirmation.InventryReportPage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 22)
	public void verifyBinningCreate() throws Throwable {
		test = reports.createTest("BinningCreatePage");
		homePage.clickOnBinningCreate();
		binning.BinningCreatePage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 23)
	public void verifyInventryReportAfterBinnig() throws Throwable {
		test = reports.createTest("inventryReportAfterBinning");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterBinning.InventryReportPage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 24)
	public void verifyMaterialIssueReleaseForSA2() throws Throwable {

		test = reports.createTest("materialIssue for SA2 create");
		homePage.clickOnTransactionMaterialIssue();
		materialIssueSA2.MaterialIssuePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 25)
	public void verifyInventryAfterMaterialIssueReleaseForSA2() throws Throwable {

		test = reports.createTest("inventryReportAfterMaterialIssue_SA2");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA2.InventryReportPage("AfterMaterialIssueReleaseForSA2");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 26)
	public void verifyShopOrderConfirmationForSA2() throws Throwable {

		test = reports.createTest("shopOrderConfirmationSA2 create");
		homePage.clickOnShopOrderConfirmationCreate();
		shopOrderConfirmationSA2.ShopOrderConfirmationCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 27)
	public void verifyInventryAfterShopOrderConfirmationForSA2() throws Throwable {

		test = reports.createTest("InventryAfterShopOrderConfirmationForSA2");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA2.InventryReportPage("AfterShopOrderConfirmationSA2");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 28)
	public void verifyOQC_ForSA2() throws Throwable {

		test = reports.createTest("OQCCreate SA2");
		homePage.clickOnOQCCreate();
		oqcSA2.OQCCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 29)
	public void verifyInventryAfterOQC_ForSA2() throws Throwable {

		test = reports.createTest("InventryAfterOQC_ForSA2");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA2.InventryReportPage("AfterOQCSA2");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 30)
	public void verifyOQCBinnig_ForSA2() throws Throwable {

		test = reports.createTest("OQCBinnig_ForSA2 create");
		homePage.clickOnOQCBinningCreate();
		oqcBinningSA2.OQCBinningCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 31)
	public void verifyInventryAfterOQCBinning_ForSA2() throws Throwable {

		test = reports.createTest("InventryAfterOQCBinning_ForSA2");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA2.InventryReportPage("AfterOQCBinningSA2");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 32)
	public void verifyMaterialIssueReleaseForSA1() throws Throwable {

		test = reports.createTest("materialIssue for SA1 create");
		homePage.clickOnTransactionMaterialIssue();
		materialIssueSA1.MaterialIssuePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 33)
	public void verifyInventryAfterMaterialIssueReleaseForSA1() throws Throwable {

		test = reports.createTest("InventryAfterMaterialIssueReleaseForSA1");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA1.InventryReportPage("AfterMaterialIssueReleaseForSA1");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 34)
	public void verifyShopOrderConfirmationForSA1() throws Throwable {

		test = reports.createTest("ShopOrderConfirmationForSA1 create");
		homePage.clickOnShopOrderConfirmationCreate();
		shopOrderConfirmationSA1.ShopOrderConfirmationCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 35)
	public void verifyInventryAfterShopOrderConfirmationForSA1() throws Throwable {

		test = reports.createTest("InventryAfterShopOrderConfirmationForSA1");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA1.InventryReportPage("AfterShopOrderConfirmationForSA1");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 36)
	public void verifyOQC_ForSA1() throws Throwable {

		test = reports.createTest("OQC_ForSA Create");
		homePage.clickOnOQCCreate();
		oqcSA1.OQCCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 37)
	public void verifyInventryAfterOQCForSA1() throws Throwable {

		test = reports.createTest("InventryAfterOQCForSA1");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA1.InventryReportPage("AfterOQCForSA1");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 38)
	public void verifyOQCBinnig_ForSA1() throws Throwable {

		test = reports.createTest("OQCBinnig_ForSA1 Create");
		homePage.clickOnOQCBinningCreate();
		oqcBinningSA1.OQCBinningCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 39)
	public void verifyInventryAfterOQCBinningForSA1() throws Throwable {

		test = reports.createTest("InventryAfterOQCBinningForSA1");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA1.InventryReportPage("AfterOQCBinningForSA1");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 40)
	public void verifyMaterialIssueReleaseForFG() throws Throwable {

		test = reports.createTest("MaterialIssueReleaseForFG Create");
		homePage.clickOnTransactionMaterialIssue();
		materialIssueFG.MaterialIssuePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 41)
	public void verifyInventryAfterMaterialIssueReleaseForFG() throws Throwable {

		test = reports.createTest("InventryAfterMaterialIssueReleaseForFG");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_FG.InventryReportPage("AfterMaterialIssueReleaseForFG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 42)
	public void verifyShopOrderConfirmationForFG() throws Throwable {

		test = reports.createTest("shopOrderConfirmationFG Create");
		homePage.clickOnShopOrderConfirmationCreate();
		shopOrderConfirmationFG.ShopOrderConfirmationCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 43)
	public void verifyInventryAfterShopOrderConfirmationForFG() throws Throwable {

		test = reports.createTest("InventryAfterShopOrderConfirmationForFG");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_FG.InventryReportPage("AfterShopOrderConfirmationForFG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}
	
	@Test(priority = 44)
	public void verifyOQC_ForFG() throws Throwable {

		test = reports.createTest("OQC_ForFG Create");
		homePage.clickOnOQCCreate();
		oqcFG.OQCCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 45)
	public void verifyInventryAfterOQCForFG() throws Throwable {

		test = reports.createTest("InventryAfterOQCForFG");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_FG.InventryReportPage("AfterOQCForFG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 46)
	public void verifyOQCBinnig_ForFG() throws Throwable {

		test = reports.createTest("OQCBinnig_ForFG Create");
		homePage.clickOnOQCBinningCreate();
		oqcBinningFG.OQCBinningCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}
	
	@Test(priority = 47)
	public void verifyInventryAfterOQCBinningForFG() throws Throwable {

		test = reports.createTest("InventryAfterOQCBinningForFG");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_FG.InventryReportPage("AfterOQCForFG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}
	
	@Test(priority = 48)
	public void verifyDOforFG() throws Throwable {

		test = reports.createTest("DOforFG Create");
		homePage.clickOnDOCreate();
		doOrder.DeliveryOrderCreate("10", "5");
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}
	
	@Test(priority = 49)
	public void verifyInventryAfterDOForFG() throws Throwable {
		test = reports.createTest("InventryAfterDOForFG");
		homePage.clickOnInventryReportWithLocation();
		InventryReportAfterDO.InventryReportPage("After DO For FG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}
	
	@Test(priority = 50)
	public void verifyReturnDO() throws Throwable {
		
		test = reports.createTest("ReturnDO Create");
		homePage.clickOnReturnDO();
		returnDO.ReturnDOCreate("5");

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}
	
	@Test(priority = 51)
	public void verifyInventryAfterReturnDOForFG() throws Throwable {
		
		test = reports.createTest("InventryAfterReturnDOForFG");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterReturnDO.InventryReportPage("After ReturnDO");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}
	
	@AfterMethod
	public void getTestResult(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"Fail", ExtentColor.RED));
			test.fail(result.getThrowable());
		}else if(result.getStatus()==ITestResult.SUCCESS){
			
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+"Pass", ExtentColor.GREEN));
			
		}else if(result.getStatus()==ITestResult.SKIP){
			
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"Skip", ExtentColor.ORANGE));
		}
	}

	@AfterTest
	public void afetrTest() {
		driver.manage().window().minimize();
		driver.quit();
		
		reports.flush();

	}

}
