package com.Getapcs.Avision.TEST;

import java.awt.AWTException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Getapcs.Avision.BASECLASS.FG_DynamicValue;
import com.Getapcs.Avision.BASECLASS.PP_DynamicValue1;
import com.Getapcs.Avision.BASECLASS.PP_DynamicValue2;
import com.Getapcs.Avision.BASECLASS.PP_DynamicValue3;
import com.Getapcs.Avision.BASECLASS.PP_DynamicValue4;
import com.Getapcs.Avision.BASECLASS.PP_DynamicValue5;
import com.Getapcs.Avision.BASECLASS.PP_DynamicValue6;
import com.Getapcs.Avision.BASECLASS.SA_DynamicValue1;
import com.Getapcs.Avision.BASECLASS.SA_DynamicValue2;
import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.Engineering.EnggBOM_ReleaseBOM;
import com.Getapcs.Avision.Engineering.EnggBOM_ReleaseBOM_FG;
import com.Getapcs.Avision.Engineering.EnggBOM_ReleaseBOM_SA1;
import com.Getapcs.Avision.Engineering.EnggBOM_ReleaseBOM_SA2;
import com.Getapcs.Avision.Engineering.Engg_BOM_Create_Page;
import com.Getapcs.Avision.Engineering.Engg_BOM_Create_Page_FOR_FG;
import com.Getapcs.Avision.Engineering.Engg_BOM_Create_Page_FOR_SA_1;
import com.Getapcs.Avision.Engineering.Engg_BOM_Create_Page_FOR_SA_2;
import com.Getapcs.Avision.Engineering.Engg_BOM_Edit_Page;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page1;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page_SA;
import com.Getapcs.Avision.Engineering.Item_Master_Edit_Page;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterBinning;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterGrin;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterIQCConfirmation;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterMaterialIssue_FG;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterMaterialIssue_SA1;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterMaterialIssue_SA2;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterReturnDO;
import com.Getapcs.Avision.FG_SA.InventryReports.InventryReportAfterReturnInvoice;
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
import com.Getapcs.Avision.Sales.CS_Edit;
import com.Getapcs.Avision.Sales.CS_Release;
import com.Getapcs.Avision.Sales.ENGG_Edit;
import com.Getapcs.Avision.Sales.ENGG_Release;
import com.Getapcs.Avision.Sales.ItemPriceList_CreatePage;
import com.Getapcs.Avision.Sales.ItemPriceList_EditPage;
import com.Getapcs.Avision.Sales.QuoteCreatePage;
import com.Getapcs.Avision.Sales.QuoteEditPage;
import com.Getapcs.Avision.Sales.RFQ_CreateCS;
import com.Getapcs.Avision.Sales.RFQ_CreateEngg;
import com.Getapcs.Avision.Sales.RFQ_CreatePage;
import com.Getapcs.Avision.Sales.RFQ_EditPage;
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
import com.Getapcs.Avision.Transaction.PurchaseOrder_Edit;
import com.Getapcs.Avision.Transaction.PurchaseRequisition_Edit;
import com.Getapcs.Avision.Transaction.Purchase_Order_FG;
import com.Getapcs.Avision.Transaction.Purchase_Order_SA1;
import com.Getapcs.Avision.Transaction.Purchase_Order_SA2;
import com.Getapcs.Avision.Transaction.Purchase_Requisation;
import com.Getapcs.Avision.Transaction.Purchase_Requisation_FG;
import com.Getapcs.Avision.Transaction.Purchase_Requisation_SA1;
import com.Getapcs.Avision.Transaction.Purchase_Requisation_SA2;
import com.Getapcs.Avision.Transaction.ReturnDO;
import com.Getapcs.Avision.Transaction.ReturnInvoice;
import com.Getapcs.Avision.Transaction.SalesOrder;
import com.Getapcs.Avision.Transaction.SalesOrderEdit;
import com.Getapcs.Avision.Transaction.ShopOrder;
import com.Getapcs.Avision.Transaction.ShopOrder_For_FG;
import com.Getapcs.Avision.Transaction.ShopOrder_For_SA;
import com.Getapcs.Avision.Transaction.ShopOrder_For_SA2;
import com.Getapcs.Avision.Transaction.VerifyInvoiceCreate;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SA_FG_Create_Edit extends TestBase {

	public ExtentReports reports;
	public ExtentSparkReporter htmlReporter;
	public ExtentTest test;

	public final static String priceList = "TEST PriceList 15";

	LoginPage loginPage;
	HomePage homePage;

	// Engg
	Item_Master_Create_Page itemMasterCreatePageFG;
	Item_Master_Create_Page1 itemMasterCreatePagePP;
	Item_Master_Create_Page_SA itemMasterCreatePageSA;
	Item_Master_Edit_Page itemMasterEditPage;
	Engg_BOM_Create_Page_FOR_SA_2 enggBomCreatePageForSA2;
	Engg_BOM_Create_Page_FOR_SA_1 enggBomCreatePageForSA1;
	Engg_BOM_Create_Page_FOR_FG enggBomCreatePageForFG;
	Engg_BOM_Edit_Page enggBomEditPage;
	Engg_BOM_Create_Page enggBomCreatePage;
	Price_List Price_List;
	EnggBOM_ReleaseBOM releaseBom;
	EnggBOM_ReleaseBOM_SA2 releaseBomSA2;
	EnggBOM_ReleaseBOM_SA1 releaseBomSA1;
	EnggBOM_ReleaseBOM_FG releaseBomFG;

	// Sales
	ItemPriceList_CreatePage itemPriceList_CreatePage;
	ItemPriceList_EditPage itemPriceListEditPage;
	RFQ_CreatePage rfq_CreatePage;
	RFQ_EditPage rfqEdit;
	RFQ_CreateCS rfq_CreateCS;
	CS_Edit csEdit;
	CS_Release csRelease;
	RFQ_CreateEngg RFQ_CreateEngg;
	ENGG_Edit enggEdit;
	ENGG_Release enggRelease;
	VerifySourcing sourcing;
	VerifyLPCostingCreate lpCosting;
	VerifyLPCostingRelease lpCostingRelease;
	QuoteCreatePage quoteCreatePage;
	QuoteEditPage quoteEdit;

	// Transaction
	SalesOrder SalesOrder;
	SalesOrderEdit salesOrderEdit;
	MaterialIssue MaterialIssue;
	Purchase_Requisation Purchase_Requisation;
	Purchase_Requisation_SA2 puchaseRequisitionSA2;
	Purchase_Requisation_SA1 puchaseRequisitionSA1;
	Purchase_Requisation_FG puchaseRequisitionFG;
	PurchaseRequisition_Edit prEdit;
	Purchase_Order_SA2 purchaseOrderSA2;
	Purchase_Order_SA1 purchaseOrderSA1;
	Purchase_Order_FG purchaseOrderFG;
	PurchaseOrder_Edit poEdit;
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
	VerifyInvoiceCreate invoice;
	ReturnInvoice returnInvoice;
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
	InventryReportAfterReturnInvoice inventryAfterReturnInvoice;

	FG_DynamicValue fgDynamic;

	public SA_FG_Create_Edit() {
		super();
	}

	@BeforeTest
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login("admin@mail.com", "admin@123");
		Price_List = new Price_List();
		itemMasterCreatePageFG = new Item_Master_Create_Page();
		itemMasterCreatePagePP = new Item_Master_Create_Page1();
		itemMasterCreatePageSA = new Item_Master_Create_Page_SA();
		itemMasterEditPage = new Item_Master_Edit_Page();
		enggBomCreatePage = new Engg_BOM_Create_Page();
		enggBomCreatePageForSA2 = new Engg_BOM_Create_Page_FOR_SA_2();
		enggBomCreatePageForSA1 = new Engg_BOM_Create_Page_FOR_SA_1();
		enggBomCreatePageForFG = new Engg_BOM_Create_Page_FOR_FG();
		enggBomEditPage = new Engg_BOM_Edit_Page();
		releaseBom = new EnggBOM_ReleaseBOM();
		releaseBomSA2 = new EnggBOM_ReleaseBOM_SA2();
		releaseBomSA1 = new EnggBOM_ReleaseBOM_SA1();
		releaseBomFG = new EnggBOM_ReleaseBOM_FG();
		itemPriceList_CreatePage = new ItemPriceList_CreatePage();
		itemPriceListEditPage = new ItemPriceList_EditPage();
		rfq_CreatePage = new RFQ_CreatePage();
		rfqEdit = new RFQ_EditPage();
		sourcing = new VerifySourcing();
		lpCosting = new VerifyLPCostingCreate();
		lpCostingRelease = new VerifyLPCostingRelease();
		MaterialIssue = new MaterialIssue();
		rfq_CreateCS = new RFQ_CreateCS();
		csEdit = new CS_Edit();
		csRelease = new CS_Release();
		RFQ_CreateEngg = new RFQ_CreateEngg();
		enggEdit = new ENGG_Edit();
		enggRelease = new ENGG_Release();
		quoteCreatePage = new QuoteCreatePage();
		quoteEdit = new QuoteEditPage();
		SalesOrder = new SalesOrder();
		salesOrderEdit = new SalesOrderEdit();
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
		prEdit = new PurchaseRequisition_Edit();
		PRApproval1 = new PRApproval1();
		PRApproval2 = new PRApproval2();
		poApproval1 = new PO_Approval1();
		poApproval2 = new PO_Approval2();
		purchaseOrderSA2 = new Purchase_Order_SA2();
		purchaseOrderSA1 = new Purchase_Order_SA1();
		purchaseOrderFG = new Purchase_Order_FG();
		poEdit = new PurchaseOrder_Edit();
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
		invoice = new VerifyInvoiceCreate();
		returnInvoice = new ReturnInvoice();
		inventryReportBeforGrin = new InventryReportBeforGrin();
		inventryReportAfterGrin = new InventryReportAfterGrin();
		inventryReportAfterIQCConfirmation = new InventryReportAfterIQCConfirmation();
		inventryReportAfterBinning = new InventryReportAfterBinning();
		inventryReportAfterMaterialIssue_SA2 = new InventryReportAfterMaterialIssue_SA2();
		inventryReportAfterMaterialIssue_SA1 = new InventryReportAfterMaterialIssue_SA1();
		inventryReportAfterMaterialIssue_FG = new InventryReportAfterMaterialIssue_FG();
		InventryReportAfterDO = new InventryReportAfterDO();
		inventryReportAfterReturnDO = new InventryReportAfterReturnDO();
		inventryAfterReturnInvoice = new InventryReportAfterReturnInvoice();

		htmlReporter = new ExtentSparkReporter("extentreport SA FG.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);

		// add environment details
		reports.setSystemInfo("Machine", "Testpc1");
		reports.setSystemInfo("OS", "Windows 11");
		reports.setSystemInfo("user", "Gopal");
		reports.setSystemInfo("Browser", "Chrome");

		// Configuration to change look and feel
		htmlReporter.config().setDocumentTitle("Extent Report for SA_FG Flow");
		htmlReporter.config().setReportName("TEST AVision");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimelineEnabled(true);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

	}

//	@Test(priority = 1)
//	public void verifyPrice_ListCreate() throws Throwable {
//		test = reports.createTest("verifyPrice_ListCreate");
//		Thread.sleep(4000);
//		Price_List.Price_ListCreate(priceList, "TEST Description", "TEST Remarks");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//	
//	@Test(priority = 2)
//	public void verifyPrice_ListEdit() throws Throwable {
//		test = reports.createTest("verifyPrice_ListEdit");
//		Thread.sleep(4000);
//		Price_List.Price_ListEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(4000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
	
	

	@Test(priority = 3)
	public void verifyItemMasterCreateforFG() throws Throwable {

		System.out.println("################ ItemMasterCreateforFG Started ###########");
		test = reports.createTest("itemMasterCreatePageFG");
		String fg = FG_DynamicValue.generateDynamicValue();
		homePage.clickOnItemMasterCreate();
		itemMasterCreatePageFG.itemMasterCreate(fg, "Test Description", "76543456", "Test Manufacturer or CustomerName",
				"DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323", "TEST-FootPrint", "TEST ProcessStep",
				"TEST descriptinRouting", "9", "10", "100", "5", "10", "Test Reorder", "TEST 2Bin", "TEST LeadTime",
				"TEST expiryDays", "TEST Inspection Int Days", "TEST specialInstructions", "TEST instructions", "10",
				"TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterCreateforFG Ended###########" + "\n");

		System.out.println("################ ItemMasterEditforFG Started ###########");
		test = reports.createTest("itemMasterEditPageFG");
		homePage.clickOnItemMasterEdit();
		itemMasterEditPage.itemMasterEdit("TEST-FootPrintFG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterEditforFG Ended ###########");

	}

	@Test(priority = 4)
	public void verifyItemMasterCreateforSA1() throws Throwable {

		System.out.println("################ ItemMasterCreateforSA1 Started ###########");
		test = reports.createTest("verifyitemMasterCreatePageSA1");
		String sa1 = SA_DynamicValue1.generateDynamicValue();
		homePage.clickOnItemMasterCreate();
		itemMasterCreatePageSA.itemMasterCreate(sa1, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterCreateforSA1 Ended###########" + "\n");

		System.out.println("################ ItemMasterEditforSA1 Started ###########");
		test = reports.createTest("itemMasterEditPageSA1");
		homePage.clickOnItemMasterEdit();
		itemMasterEditPage.itemMasterEdit("TEST-FootPrintSA1");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterEditforSA1 Ended ###########");

	}

	@Test(priority = 5)
	public void verifyItemMasterCreateforSA2() throws Throwable {

		System.out.println("################ ItemMasterCreateforSA2 Started ###########");
		test = reports.createTest("verifyitemMasterCreatePageSA2");
		String sa2 = SA_DynamicValue2.generateDynamicValue();
		homePage.clickOnItemMasterCreate();
		itemMasterCreatePageSA.itemMasterCreate(sa2, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterCreateforSA2 Ended###########" + "\n");

		System.out.println("################ ItemMasterEditforSA2 Started ###########");

		test = reports.createTest("itemMasterEditPageSA2");
		homePage.clickOnItemMasterEdit();
		itemMasterEditPage.itemMasterEdit("TEST-FootPrintSA2");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterEditforSA2 Ended ###########");

	}

	@Test(priority = 6)
	public void verifyItemMasterCreateforPP1() throws Throwable {

		System.out.println("################ ItemMasterCreateforPP1 Started ###########");
		test = reports.createTest("itemMasterCreatePagePP1");
		String pp1 = PP_DynamicValue1.generateDynamicValue();
		homePage.clickOnItemMasterCreate();
		itemMasterCreatePagePP.itemMasterCreate(pp1, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterCreateforPP1 Ended ###########" + "\n");

		System.out.println("################ ItemMasterEditforPP1 Started ###########" + "\n");

		test = reports.createTest("itemMasterEditPagePP1");
		homePage.clickOnItemMasterEdit();
		itemMasterEditPage.itemMasterEdit("TEST-FootPrintPP1");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterEditforPP1 Ended ###########" + "\n");

	}

	@Test(priority = 7)
	public void verifyItemMasterCreateforPP2() throws Throwable {

		System.out.println("################ ItemMasterCreateforPP2 Started ###########");

		test = reports.createTest("itemMasterCreatePagePP2");
		String pp2 = PP_DynamicValue2.generateDynamicValue();
		homePage.clickOnItemMasterCreate();
		itemMasterCreatePagePP.itemMasterCreate(pp2, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterCreateforPP2 Ended ###########" + "\n");

		System.out.println("################ ItemMasterEditforPP2 Started ###########" + "\n");

		test = reports.createTest("itemMasterEditPagePP2");
		homePage.clickOnItemMasterEdit();
		itemMasterEditPage.itemMasterEdit("TEST-FootPrintPP2");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterEditforPP2 Ended ###########" + "\n");

	}

	@Test(priority = 8)
	public void verifyItemMasterCreateforPP3() throws Throwable {

		System.out.println("################ ItemMasterCreateforPP3 Started ###########");

		test = reports.createTest("itemMasterCreatePagePP3");
		String pp3 = PP_DynamicValue3.generateDynamicValue();
		homePage.clickOnItemMasterCreate();
		itemMasterCreatePagePP.itemMasterCreate(pp3, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterCreateforPP3 Ended ###########" + "\n");

		System.out.println("################ ItemMasterEditforPP3 Started ###########" + "\n");

		test = reports.createTest("itemMasterEditPagePP3");
		homePage.clickOnItemMasterEdit();
		itemMasterEditPage.itemMasterEdit("TEST-FootPrintPP3");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterEditforPP3 Ended ###########" + "\n");

	}

	@Test(priority = 9)
	public void verifyItemMasterCreateforPP4() throws Throwable {

		System.out.println("################ ItemMasterCreateforPP4 Started ###########");

		test = reports.createTest("itemMasterCreatePagePP4");
		String pp4 = PP_DynamicValue4.generateDynamicValue();
		homePage.clickOnItemMasterCreate();
		itemMasterCreatePagePP.itemMasterCreate(pp4, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterCreateforPP4 Ended ###########" + "\n");

		System.out.println("################ ItemMasterEditforPP4 Started ###########" + "\n");

		test = reports.createTest("itemMasterEditPagePP4");
		homePage.clickOnItemMasterEdit();
		itemMasterEditPage.itemMasterEdit("TEST-FootPrintPP4");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterEditforPP4 Ended ###########" + "\n");

	}

	@Test(priority = 10)
	public void verifyItemMasterCreateforPP5() throws Throwable {

		System.out.println("################ ItemMasterCreateforPP5 Started ###########");

		test = reports.createTest("itemMasterCreatePagePP5");
		String pp5 = PP_DynamicValue5.generateDynamicValue();
		homePage.clickOnItemMasterCreate();
		itemMasterCreatePagePP.itemMasterCreate(pp5, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterCreateforPP5 Ended ###########" + "\n");

		System.out.println("################ ItemMasterEditforPP5 Started ###########" + "\n");

		test = reports.createTest("itemMasterEditPagePP5");
		homePage.clickOnItemMasterEdit();
		itemMasterEditPage.itemMasterEdit("TEST-FootPrintPP5");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterEditforPP5 Ended ###########" + "\n");
	}

	@Test(priority = 11)
	public void verifyItemMasterCreateforPP6() throws Throwable {

		System.out.println("################ ItemMasterCreateforPP6 Started ###########");

		test = reports.createTest("itemMasterCreatePagePP6");
		String pp6 = PP_DynamicValue6.generateDynamicValue();
		homePage.clickOnItemMasterCreate();
		itemMasterCreatePagePP.itemMasterCreate(pp6, "Test Description", "76543456",
				"Test Manufacturer or CustomerName", "DR-N-5676", "REV-43", "T-DOC-RET-21", "10", "30", "300", "323",
				"TEST-FootPrint", "TEST ProcessStep", "TEST descriptinRouting", "9", "10", "100", "5", "10",
				"Test Reorder", "TEST 2Bin", "TEST LeadTime", "TEST expiryDays", "TEST Inspection Int Days",
				"TEST specialInstructions", "TEST instructions", "10", "TEST BatchSize", "565");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterCreateforPP6 Ended ###########" + "\n");

		System.out.println("################ ItemMasterEditforPP6 Started ###########" + "\n");

		test = reports.createTest("itemMasterEditPagePP6");
		homePage.clickOnItemMasterEdit();
		itemMasterEditPage.itemMasterEdit("TEST-FootPrintPP6");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		System.out.println("################ ItemMasterEditforPP6 Ended ###########" + "\n");

	}

	@Test(priority = 12)
	public void verifyBomCreateforSA2() throws Throwable {

		test = reports.createTest("enggBomCreatePageForSA2");
		homePage.clickOnBomCreatePage();
		enggBomCreatePageForSA2.bomCreate("9", // Quantity
				"50", // scarpAllowance
				"TestRemark", // Remark
				"1", // Version
				"10", // quantityPer
				"100", // probability
				"TEST Alternate Remark", // alternateRemark
				"1", // quantityNRE
				"20");// cost
		Thread.sleep(3000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		test = reports.createTest("enggBomEditPageForSA2");
		homePage.clickOnBomEditPage();
		enggBomEditPage.enggBomEdit("TEST Edit Remark SA2");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 13)
	public void verifyBomCreateforSA1() throws Throwable {

		test = reports.createTest("enggBomCreatePageForSA1");
		homePage.clickOnBomCreatePage();
		enggBomCreatePageForSA1.bomCreate("8", // Quantity
				"50", // scarpAllowance
				"TestRemark", // Remark
				"1", // Version
				"10", // quantityPer
				"100", // probability
				"TEST Alternate Remark", // alternateRemark
				"1", // quantityNRE
				"20");// cost
		Thread.sleep(3000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		test = reports.createTest("enggBomEditPageForSA1");
		homePage.clickOnBomEditPage();
		enggBomEditPage.enggBomEdit("TEST Edit Remark SA1");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 14)
	public void verifyBomCreateforFG() throws Throwable {

		test = reports.createTest("enggBomCreatePageForFG");
		homePage.clickOnBomCreatePage();
		enggBomCreatePageForFG.bomCreate("7", // Quantity
				"50", // scarpAllowance
				"TestRemark", // Remark
				"1", // Version
				"10", // quantityPer
				"100", // probability
				"TEST Alternate Remark", // alternateRemark
				"1", // quantityNRE
				"20");// cost
		Thread.sleep(3000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		test = reports.createTest("enggBomEditPageForFG");
		homePage.clickOnBomEditPage();
		enggBomEditPage.enggBomEdit("TEST Edit Remark FG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 15)
	public void verifyReleaseBomSA2() throws Throwable {

		test = reports.createTest("releaseBomSA2");
		homePage.clickOnReleaseBomPage();
		releaseBomSA2.releaseBom("Test Remark");// Remark
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 16)
	public void verifyReleaseBomSA1() throws Throwable {

		test = reports.createTest("releaseBomSA1");
		homePage.clickOnReleaseBomPage();
		releaseBomSA1.releaseBom("Test Remark");// Remark
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 17)
	public void verifyReleaseBomFG() throws Throwable {
		test = reports.createTest("releaseBomFG");
		homePage.clickOnReleaseBomPage();
		releaseBomFG.releaseBom("Test Remark");// Remark
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 18)
	public void verifySalesItemPriceListCreate() throws AWTException, InterruptedException {

		test = reports.createTest("verifySalesItemPriceListCreate");
		homePage.clickonTransactionPriceListCreate();
		itemPriceList_CreatePage.ItemPriceListCreate("50", "200", "50", "100", "200", "40");

		Thread.sleep(6000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

//	@Test(priority = 19)
//	public void verifySalesItemPriceListEdit() throws AWTException, InterruptedException {
//
//		test = reports.createTest("verifySalesItemPriceListEdit");
//		homePage.clickonTransactionPriceListEdit();
//		itemPriceListEditPage.ItemPriceListEdit("50", "200", "50", "100", "200", "40");
//
//		Thread.sleep(2000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}

	@Test(priority = 20)
	public void verifySalesRFQCreate() throws Throwable {

		test = reports.createTest("verifySalesRFQCreate");
		homePage.clickonRFQCreate();
		rfq_CreatePage.RFQCreate();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 21)
	public void verifySalesRFQEdit() throws Throwable {

		test = reports.createTest("verifySalesRFQEdit");
		homePage.clickonRFQEdit();
		rfqEdit.RFQEdit(priceList, priceList, priceList, priceList, priceList);

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 22)
	public void verifySalesRFQCSCreate() throws Throwable {

		test = reports.createTest("verifySalesRFQ_CS_Create");
		int counter = FG_DynamicValue.getCounter();

		homePage.clickonSalesRfqModifyorView();
		Thread.sleep(4000);
		rfq_CreateCS.RFQCs(String.valueOf(counter) + "123", // ItemNumber
				"10", // Quantity
				"TEST Description", // Description
				"10", // QuantityInaddShedule
				"TEST Note"); // String Note

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 23)
	public void verifySalesCSEdit() throws Throwable {

		test = reports.createTest("verifySalesRFQ_CS_Edit");
		homePage.clickonSalesRfqModifyorView();
		csEdit.RFQCSEdit();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 24)
	public void verifySalesCSRelease() throws Throwable {

		test = reports.createTest("verifySalesRFQ_CS_Release");
		homePage.clickonSalesRfqModifyorView();
		csRelease.RFQCs();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 25)
	public void verifySalesRFQENGGCreate() throws Throwable {

		test = reports.createTest("verifySalesRFQ_ENGG_Create");
		homePage.clickonSalesRfqModifyorView();
		RFQ_CreateEngg.RFQEnggCreate("10", // Q0uantityInaddShedule
				"TEST Note"); // String Note

		Thread.sleep(3000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 26)
	public void verifySalesRFQENGGEdit() throws Throwable {

		test = reports.createTest("verifySales_RFQ_ENGG_Edit");
		homePage.clickonSalesRfqModifyorView();
		enggEdit.RFQEnggEdit("10", // QuantityInaddShedule
				"TEST Note"); // String Note

		Thread.sleep(3000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 27)
	public void verifySalesRFQENGGRelease() throws Throwable {

		test = reports.createTest("verifySales_RFQ_ENGG_Release");
		homePage.clickonSalesRfqModifyorView();
		enggRelease.RFQEnggRelease("10", // QuantityInaddShedule
				"TEST Note"); // String Note

		Thread.sleep(3000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 28)
	public void verifySalesSourcing() throws Throwable {

		test = reports.createTest("verifySalesSourcing");
		homePage.clickonSoucing();
		sourcing.sourcingCreate();

		Thread.sleep(3000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 29)
	public void verifySalesLpCreate() throws Throwable {

		test = reports.createTest("verifySalesLpCreate");
		homePage.clickonLpCosting();
		lpCosting.lpCostingCreate();
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 30)
	public void verifySalesLpCostingRelease() throws Throwable {

		test = reports.createTest("verifySalesLpCostingRelease");
		homePage.clickonLpCosting();
		lpCostingRelease.lpCostingRelease();
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 31)
	public void verifyQuoteCreate() throws Throwable {

		test = reports.createTest("QuoteCreate");
		int counter = FG_DynamicValue.getCounter();
		homePage.clickonSalesQuoteCreate();
		quoteCreatePage.QuoteCreate("TEST Quote Ref" + String.valueOf(counter), "10", "10", "5", "7", "7", "7", "7",
				"10", "10", "10", "9", "9", "8", "8", "100", "7", "7", "6", "7", "TEST Special Terms");

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 32)
	public void verifyQuoteEdit() throws Throwable {

		test = reports.createTest("QuoteEdit");
		homePage.clickonSalesQuoteModifyorView();
		quoteEdit.QuoteEdit();

		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 33)
	public void verifySalesOrderCreate() throws Throwable {

		test = reports.createTest("salesOrderCreate");
		int counter = FG_DynamicValue.getCounter();
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
				"PO" + counter, // poNumber
				"TEST Remark", // billingandShippingRemark
				"20", // totalAddidtional Charges
				"8", // sgst
				"8", // cgst
				"8", // igst
				"8", // utgst
				"20");// specialDiscount
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 34)
	public void verifySalesOrderEdit() throws Throwable {

		test = reports.createTest("salesOrderEdit");
		homePage.clickOnSalesOrderEdit();
		salesOrderEdit.salesOrderEdit();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 35)
	public void verifyShopOrderCreateSA2() throws Throwable {

		test = reports.createTest("ShopOrderSA2Create");
		homePage.clickOnTransactionShopOrderCreate();
		ShopOrderSA2.ShopOrderCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 36)
	public void verifyShopOrderCreateSA1() throws Throwable {

		test = reports.createTest("ShopOrderSA1Create");
		homePage.clickOnTransactionShopOrderCreate();
		ShopOrderSA1.ShopOrderCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 37)
	public void verifyShopOrderCreateFG() throws Throwable {

		test = reports.createTest("ShopOrderFGCreate");
		homePage.clickOnTransactionShopOrderCreate();
		ShopOrderFG.ShopOrderCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 38)
	public void verifyMaterialIssue() throws Throwable {

		test = reports.createTest("materialIssueSA2");
		homePage.clickOnTransactionMaterialIssue();
		materialIssueSA2.MaterialIssuePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		test = reports.createTest("materialIssueSA1");
		homePage.clickOnTransactionMaterialIssue();
		materialIssueSA1.MaterialIssuePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

		test = reports.createTest("materialIssueFG");
		homePage.clickOnTransactionMaterialIssue();
		materialIssueFG.MaterialIssuePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 39)
	public void verifyPRcreateSA2() throws Throwable {

		test = reports.createTest("puchaseRequisitionSA2 Create");
		homePage.clickOnPRCreatePage();
		puchaseRequisitionSA2.prCreatePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 40)
	public void verifyPREditSA2() throws Throwable {

		test = reports.createTest("puchaseRequisitionSA2 Edit");
		homePage.clickOnPREditPage();
		prEdit.prEditPage();

		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 41)
	public void verifyPRApprovals_1SA2() throws Throwable {

		test = reports.createTest("puchaseRequisitionSA2 prApproval1");
		homePage.clickOnPOApproval1();
		PRApproval1.prApproval1Page();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 42)
	public void verifyPRApprovals_2SA2() throws Throwable {

		test = reports.createTest("puchaseRequisitionSA2 prApproval2");
		homePage.clickOnPRApproval2();
		PRApproval2.prApproval2Page();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 43)
	public void verifyPRcreateSA1() throws Throwable {

		test = reports.createTest("puchaseRequisitionSA1 Create");
		homePage.clickOnPRCreatePage();
		puchaseRequisitionSA1.prCreatePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 44)
	public void verifyPREditSA1() throws Throwable {

		test = reports.createTest("puchaseRequisitionSA1 Edit");
		homePage.clickOnPREditPage();
		prEdit.prEditPage();

		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 45)
	public void verifyPRApprovals_1SA1() throws Throwable {

		test = reports.createTest("puchaseRequisitionSA2 prApproval1");
		homePage.clickOnPOApproval1();
		PRApproval1.prApproval1Page();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 46)
	public void verifyPRApprovals_2SA1() throws Throwable {

		test = reports.createTest("puchaseRequisitionSA2 prApproval2");
		homePage.clickOnPRApproval2();
		PRApproval2.prApproval2Page();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 47)
	public void verifyPRcreateFG() throws Throwable {

		test = reports.createTest("puchaseRequisitionFG Create");
		homePage.clickOnPRCreatePage();
		puchaseRequisitionFG.prCreatePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 48)
	public void verifyPREditFG() throws Throwable {

		test = reports.createTest("puchaseRequisitionFG Edit");
		homePage.clickOnPREditPage();
		prEdit.prEditPage();

		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 49)
	public void verifyPRApprovals_1FG() throws Throwable {

		test = reports.createTest("puchaseRequisitionFG prApproval1");
		homePage.clickOnPOApproval1();
		PRApproval1.prApproval1Page();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 50)
	public void verifyPRApprovals_2FG() throws Throwable {

		test = reports.createTest("puchaseRequisitionFG prApproval2");
		homePage.clickOnPRApproval2();
		PRApproval2.prApproval2Page();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	// ######### Purchase Order ###############

	@Test(priority = 51)
	public void verifyPOcreateSA2() throws Throwable {

		// ######### Purchase Order Create Page For SA2 ###############
		test = reports.createTest("purchaseOrderSA2 Create");
		homePage.clickontransactionPOcreate();
		purchaseOrderSA2.purchaseOrderCreatePage("10", "100", "1000", "1000", "1000", "TEST Special Instructions", "8",
				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 52)
	public void verifyPOEditSA2() throws Throwable {

		// ######### Purchase Order Edit Page For SA2 ###############
		test = reports.createTest("purchaseOrderSA2 Edit");
		homePage.clickonPOEdit();
		poEdit.purchaseOrderEditPage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 53)
	public void verifyPOApproval_1_SA2() throws Throwable {

		// Purchase Order POApproval 1
		test = reports.createTest("purchaseOrderSA2 prApproval1");
		homePage.clickontransactionPOApproval1();
		poApproval1.purchaseOrderApproval1();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 54)
	public void verifyPOApproval_2_SA2() throws Throwable {
		// Purchase Order POApproval 2
		test = reports.createTest("purchaseOrderSA2 prApproval2");
		homePage.clickontransactionPOApproval2();
		poApproval2.purchaseOrderApproval2();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 55)
	public void verifyPOcreateSA1() throws Throwable {
		// ######### Purchase Order Create Page For SA1 ###############
		test = reports.createTest("purchaseOrderSA1 Create");
		homePage.clickontransactionPOcreate();
		purchaseOrderSA1.purchaseOrderCreatePage("10", "100", "1000", "1000", "1000", "TEST Special Instructions", "8",
				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 56)
	public void verifyPOEditSA1() throws Throwable {

		// ######### Purchase Order Edit Page For SA2 ###############
		test = reports.createTest("purchaseOrderSA1 Edit");
		homePage.clickonPOEdit();
		poEdit.purchaseOrderEditPage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 57)
	public void verifyPOApproval_1_SA1() throws Throwable {

		// Purchase Order POApproval 1
		test = reports.createTest("purchaseOrderSA2 prApproval1");
		homePage.clickontransactionPOApproval1();
		poApproval1.purchaseOrderApproval1();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 58)
	public void verifyPOApproval_2_SA1() throws Throwable {
		// Purchase Order POApproval 2
		test = reports.createTest("purchaseOrderSA2 prApproval2");
		homePage.clickontransactionPOApproval2();
		poApproval2.purchaseOrderApproval2();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 59)
	public void verifyPOcreateFG() throws Throwable {

//		 ######### Purchase Order Create Page For FG ###############
		test = reports.createTest("purchaseOrderFG Create");
		homePage.clickontransactionPOcreate();
		purchaseOrderFG.purchaseOrderCreatePage("10", "100", "1000", "1000", "1000", "TEST Special Instructions", "8",
				"8", "8", "8", "100", "Test Special Terms", "Test IncoTerms");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 60)
	public void verifyPOEditFG() throws Throwable {

		// ######### Purchase Order Create Page For SA2 ###############
		test = reports.createTest("purchaseOrderFG Edit");
		homePage.clickonPOEdit();
		poEdit.purchaseOrderEditPage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 61)
	public void verifyPOApproval_1_FG() throws Throwable {
		// Purchase Order POApproval 1
		test = reports.createTest("purchaseOrderFG prApproval1");
		homePage.clickontransactionPOApproval1();
		poApproval1.purchaseOrderApproval1();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 62)
	public void verifyPOApproval_2_FG() throws Throwable {
		// Purchase Order POApproval 2
		test = reports.createTest("purchaseOrderFG prApproval2");
		homePage.clickontransactionPOApproval2();
		poApproval2.purchaseOrderApproval2();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 63)
	public void verifyInventryReportBeforeGrin() throws Throwable {
		test = reports.createTest("inventryReportBeforGrin");
		homePage.clickOnInventryReportWithLocation();
		inventryReportBeforGrin.InventryReportPage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 64)
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

	@Test(priority = 65)
	public void verifyInventryReportAfterGrin() throws Throwable {
		test = reports.createTest("inventryReportAfterGrin");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterGrin.InventryReportPage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 66)
	public void verifyIQCCreate() throws Throwable {
		test = reports.createTest("iqcConfirmationCreatePage");
		homePage.clickOnIQCConfirmationCreate();
		iQCConfirmation.iqcConfirmationCreatePage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 67)
	public void verifyInventryReportAfterIQC() throws Throwable {
		test = reports.createTest("inventryReportAfterIQCConfirmation");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterIQCConfirmation.InventryReportPage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 68)
	public void verifyBinningCreate() throws Throwable {
		test = reports.createTest("BinningCreatePage");
		homePage.clickOnBinningCreate();
		binning.BinningCreatePage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 69)
	public void verifyInventryReportAfterBinnig() throws Throwable {
		test = reports.createTest("inventryReportAfterBinning");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterBinning.InventryReportPage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 70)
	public void verifyMaterialIssueReleaseForSA2() throws Throwable {

		test = reports.createTest("materialIssue for SA2 create");
		homePage.clickOnTransactionMaterialIssue();
		materialIssueSA2.MaterialIssuePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 71)
	public void verifyInventryAfterMaterialIssueReleaseForSA2() throws Throwable {

		test = reports.createTest("inventryReportAfterMaterialIssue_SA2");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA2.InventryReportPage("AfterMaterialIssueReleaseForSA2");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 72)
	public void verifyShopOrderConfirmationForSA2() throws Throwable {

		test = reports.createTest("shopOrderConfirmationSA2 create");
		homePage.clickOnShopOrderConfirmationCreate();
		shopOrderConfirmationSA2.ShopOrderConfirmationCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 73)
	public void verifyInventryAfterShopOrderConfirmationForSA2() throws Throwable {

		test = reports.createTest("InventryAfterShopOrderConfirmationForSA2");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA2.InventryReportPage("AfterShopOrderConfirmationSA2");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 74)
	public void verifyOQC_ForSA2() throws Throwable {

		test = reports.createTest("OQCCreate SA2");
		homePage.clickOnOQCCreate();
		oqcSA2.OQCCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 75)
	public void verifyInventryAfterOQC_ForSA2() throws Throwable {

		test = reports.createTest("InventryAfterOQC_ForSA2");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA2.InventryReportPage("AfterOQCSA2");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 76)
	public void verifyOQCBinnig_ForSA2() throws Throwable {

		test = reports.createTest("OQCBinnig_ForSA2 create");
		homePage.clickOnOQCBinningCreate();
		oqcBinningSA2.OQCBinningCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 77)
	public void verifyInventryAfterOQCBinning_ForSA2() throws Throwable {

		test = reports.createTest("InventryAfterOQCBinning_ForSA2");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA2.InventryReportPage("AfterOQCBinningSA2");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 78)
	public void verifyMaterialIssueReleaseForSA1() throws Throwable {

		test = reports.createTest("materialIssue for SA1 create");
		homePage.clickOnTransactionMaterialIssue();
		materialIssueSA1.MaterialIssuePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 79)
	public void verifyInventryAfterMaterialIssueReleaseForSA1() throws Throwable {

		test = reports.createTest("InventryAfterMaterialIssueReleaseForSA1");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA1.InventryReportPage("AfterMaterialIssueReleaseForSA1");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 80)
	public void verifyShopOrderConfirmationForSA1() throws Throwable {

		test = reports.createTest("ShopOrderConfirmationForSA1 create");
		homePage.clickOnShopOrderConfirmationCreate();
		shopOrderConfirmationSA1.ShopOrderConfirmationCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 81)
	public void verifyInventryAfterShopOrderConfirmationForSA1() throws Throwable {

		test = reports.createTest("InventryAfterShopOrderConfirmationForSA1");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA1.InventryReportPage("AfterShopOrderConfirmationForSA1");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 82)
	public void verifyOQC_ForSA1() throws Throwable {

		test = reports.createTest("OQC_ForSA Create");
		homePage.clickOnOQCCreate();
		oqcSA1.OQCCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 83)
	public void verifyInventryAfterOQCForSA1() throws Throwable {

		test = reports.createTest("InventryAfterOQCForSA1");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA1.InventryReportPage("AfterOQCForSA1");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 84)
	public void verifyOQCBinnig_ForSA1() throws Throwable {

		test = reports.createTest("OQCBinnig_ForSA1 Create");
		homePage.clickOnOQCBinningCreate();
		oqcBinningSA1.OQCBinningCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 85)
	public void verifyInventryAfterOQCBinningForSA1() throws Throwable {

		test = reports.createTest("InventryAfterOQCBinningForSA1");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_SA1.InventryReportPage("AfterOQCBinningForSA1");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 86)
	public void verifyMaterialIssueReleaseForFG() throws Throwable {

		test = reports.createTest("MaterialIssueReleaseForFG Create");
		homePage.clickOnTransactionMaterialIssue();
		materialIssueFG.MaterialIssuePage();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 87)
	public void verifyInventryAfterMaterialIssueReleaseForFG() throws Throwable {

		test = reports.createTest("InventryAfterMaterialIssueReleaseForFG");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_FG.InventryReportPage("AfterMaterialIssueReleaseForFG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 88)
	public void verifyShopOrderConfirmationForFG() throws Throwable {

		test = reports.createTest("shopOrderConfirmationFG Create");
		homePage.clickOnShopOrderConfirmationCreate();
		shopOrderConfirmationFG.ShopOrderConfirmationCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 89)
	public void verifyInventryAfterShopOrderConfirmationForFG() throws Throwable {

		test = reports.createTest("InventryAfterShopOrderConfirmationForFG");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_FG.InventryReportPage("AfterShopOrderConfirmationForFG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 90)
	public void verifyOQC_ForFG() throws Throwable {

		test = reports.createTest("OQC_ForFG Create");
		homePage.clickOnOQCCreate();
		oqcFG.OQCCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 91)
	public void verifyInventryAfterOQCForFG() throws Throwable {

		test = reports.createTest("InventryAfterOQCForFG");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_FG.InventryReportPage("AfterOQCForFG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 92)
	public void verifyOQCBinnig_ForFG() throws Throwable {

		test = reports.createTest("OQCBinnig_ForFG Create");
		homePage.clickOnOQCBinningCreate();
		oqcBinningFG.OQCBinningCreate();
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 93)
	public void verifyInventryAfterOQCBinningForFG() throws Throwable {

		test = reports.createTest("InventryAfterOQCBinningForFG");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterMaterialIssue_FG.InventryReportPage("AfterOQCForFG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 94)
	public void verifyDOforFG() throws Throwable {

		test = reports.createTest("DOforFG Create");
		homePage.clickOnDOCreate();
		doOrder.DeliveryOrderCreate("10", "5");
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 95)
	public void verifyInventryAfterDOForFG() throws Throwable {
		test = reports.createTest("InventryAfterDOForFG");
		homePage.clickOnInventryReportWithLocation();
		InventryReportAfterDO.InventryReportPage("After DO For FG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 96)
	public void verifyReturnDO() throws Throwable {

		test = reports.createTest("ReturnDO Create");
		homePage.clickOnReturnDO();
		returnDO.ReturnDOCreate("5");

		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 97)
	public void verifyInventryAfterReturnDOForFG() throws Throwable {

		test = reports.createTest("InventryAfterReturnDOForFG");
		homePage.clickOnInventryReportWithLocation();
		inventryReportAfterReturnDO.InventryReportPage("After ReturnDO");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 98)
	public void verifyAgainDOforFG() throws Throwable {

		test = reports.createTest("AgainDOforFG Create for invoice");
		homePage.clickOnDOCreate();
		doOrder.DeliveryOrderCreate("10", "5");
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 99)
	public void verifyInventryAfterAgainDOForFG() throws Throwable {

		test = reports.createTest("InventryAfterAgainDOForFG");
		homePage.clickOnInventryReportWithLocation();
		InventryReportAfterDO.InventryReportPage("After Again DO For FG");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 100)
	public void verifyInvoiceCreate() throws Throwable {

		test = reports.createTest("verifyInvoiceCreate");
		homePage.clickOnInvoiceCreate();
		invoice.invoiceCreate("Test Invoice Remark");
		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 101)
	public void verifyInventryAfterInvoiceForFG() throws Throwable {

		test = reports.createTest("InventryAfterInvoiceForFG");
		homePage.clickOnInventryReportWithLocation();
		InventryReportAfterDO.InventryReportPage("After Invoice");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	}

	@Test(priority = 102)
	public void verifyReturnInvoice() throws Throwable {

		test = reports.createTest("Return Invoice Create");
		homePage.clickOnReturnInvoice();
		returnInvoice.ReturnInvoicepage();

		Thread.sleep(4000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 103)
	public void verifyInventryAfterReturnInvoiceForFG() throws Throwable {

		test = reports.createTest("InventryAfterInvoiceForFG");
		homePage.clickOnInventryReportWithLocation();
		inventryAfterReturnInvoice.InventryReportPage("After Return Invoice");
		Thread.sleep(2000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");

	} 

	@AfterMethod
	public void getTestResult(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {

			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Fail", ExtentColor.RED));
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {

			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Pass", ExtentColor.GREEN));

		} else if (result.getStatus() == ITestResult.SKIP) {

			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Skip", ExtentColor.ORANGE));
			test.fail(result.getThrowable());
		}

	}

	@AfterTest
	public void afetrTest() {
		driver.manage().window().minimize();
		driver.quit();
		reports.flush();

	}

}