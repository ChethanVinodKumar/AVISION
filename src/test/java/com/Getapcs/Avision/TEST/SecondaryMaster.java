package com.Getapcs.Avision.TEST;

import java.awt.AWTException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;
import com.Getapcs.Avision.HomeLogin.LoginPage;
import com.Getapcs.Avision.SecondaryMaster.Additionalcharges;
import com.Getapcs.Avision.SecondaryMaster.AuditFrequency;
import com.Getapcs.Avision.SecondaryMaster.BankName;
import com.Getapcs.Avision.SecondaryMaster.BasisOfApproval;
import com.Getapcs.Avision.SecondaryMaster.Category;
import com.Getapcs.Avision.SecondaryMaster.Commodity;
import com.Getapcs.Avision.SecondaryMaster.CompanyCategory;
import com.Getapcs.Avision.SecondaryMaster.CostCenter;
import com.Getapcs.Avision.SecondaryMaster.CostingMethod;
import com.Getapcs.Avision.SecondaryMaster.CustomerType;
import com.Getapcs.Avision.SecondaryMaster.Customer_Category;
import com.Getapcs.Avision.SecondaryMaster.DeliveryTerms;
import com.Getapcs.Avision.SecondaryMaster.Department;
import com.Getapcs.Avision.SecondaryMaster.Export_Unit_Type;
import com.Getapcs.Avision.SecondaryMaster.GST_Persentage;
import com.Getapcs.Avision.SecondaryMaster.INCO_Term;
import com.Getapcs.Avision.SecondaryMaster.IssuingStock;
import com.Getapcs.Avision.SecondaryMaster.Language;
import com.Getapcs.Avision.SecondaryMaster.Lead_Times;
import com.Getapcs.Avision.SecondaryMaster.Location;
import com.Getapcs.Avision.SecondaryMaster.MaterialType;
import com.Getapcs.Avision.SecondaryMaster.Nature_Of_Relationship;
import com.Getapcs.Avision.SecondaryMaster.NumberOfRoom;
import com.Getapcs.Avision.SecondaryMaster.Order_Type_Master;
import com.Getapcs.Avision.SecondaryMaster.Packing_Instructions;
import com.Getapcs.Avision.SecondaryMaster.Part_Type;
import com.Getapcs.Avision.SecondaryMaster.Payment_Term;
import com.Getapcs.Avision.SecondaryMaster.Preferred_Freight_Forwarder;
import com.Getapcs.Avision.SecondaryMaster.Price_List;
import com.Getapcs.Avision.SecondaryMaster.Process;
import com.Getapcs.Avision.SecondaryMaster.Procutement_Type;
import com.Getapcs.Avision.SecondaryMaster.Purchase_Group;
import com.Getapcs.Avision.SecondaryMaster.Quote_Terms;
import com.Getapcs.Avision.SecondaryMaster.Risk_Category;
import com.Getapcs.Avision.SecondaryMaster.Salutations;
import com.Getapcs.Avision.SecondaryMaster.Scope_Of_Supply;
import com.Getapcs.Avision.SecondaryMaster.Segment;
import com.Getapcs.Avision.SecondaryMaster.Shipment_Instructions;
import com.Getapcs.Avision.SecondaryMaster.Shipment_Mode;
import com.Getapcs.Avision.SecondaryMaster.TypeOfRoom;
import com.Getapcs.Avision.SecondaryMaster.Type_OF_Solution;
import com.Getapcs.Avision.SecondaryMaster.Type_Of_Company;
import com.Getapcs.Avision.SecondaryMaster.UOC;
import com.Getapcs.Avision.SecondaryMaster.UOM;
import com.Getapcs.Avision.SecondaryMaster.Vender_Category;
import com.Getapcs.Avision.SecondaryMaster.Vender_Type;
import com.Getapcs.Avision.SecondaryMaster.Warehouse;

public class SecondaryMaster extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	Additionalcharges additionalcharges;
	AuditFrequency auditFrequency;
	BankName bankName;
	BasisOfApproval BasisOfApproval;
	Category Category;
	Commodity Commodity;
	CompanyCategory CompanyCategory;
	CostCenter CostCenter;
	CostingMethod CostingMethod;
	Customer_Category Customer_Category;
	CustomerType CustomerType;
	DeliveryTerms DeliveryTerms;
	Department Department;
	Export_Unit_Type Export_Unit_Type;
	GST_Persentage GST_Persentage;
	INCO_Term INCO_Term;
	IssuingStock IssuingStock;
	Language Language;
	Lead_Times Lead_Times;
	Location Location;
	MaterialType MaterialType;
	Nature_Of_Relationship Nature_Of_Relationship;
	Order_Type_Master Order_Type_Master;
	Packing_Instructions Packing_Instructions;
	Part_Type Part_Type;
	Payment_Term Payment_Term;
	Preferred_Freight_Forwarder Preferred_Freight_Forwarder;
	Price_List Price_List;
	Process process;
	Procutement_Type Procutement_Type;
	Purchase_Group Purchase_Group;
	Quote_Terms Quote_Terms;
	Risk_Category Risk_Category;
	Salutations Salutations;
	Scope_Of_Supply Scope_Of_Supply;
	Segment Segment;
	Shipment_Instructions Shipment_Instructions;
	Shipment_Mode Shipment_Mode;
	Type_Of_Company Type_Of_Company;
	Type_OF_Solution Type_OF_Solution;
	UOC UOC;
	UOM UOM;
	Vender_Category Vender_Category;
	Vender_Type Vender_Type;
	Warehouse Warehouse;
	NumberOfRoom NumberOfRoom;
	TypeOfRoom TypeOfRoom;

	public SecondaryMaster() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException, AWTException {
		initialization();
		additionalcharges = new Additionalcharges();
		auditFrequency = new AuditFrequency();
		bankName = new BankName();
		BasisOfApproval = new BasisOfApproval();
		Category = new Category();
		Commodity = new Commodity();
		CompanyCategory = new CompanyCategory();
		CostCenter = new CostCenter();
		CostingMethod = new CostingMethod();
		Customer_Category = new Customer_Category();
		CustomerType = new CustomerType();
		DeliveryTerms = new DeliveryTerms();
		Department = new Department();
		Export_Unit_Type = new Export_Unit_Type();
		GST_Persentage = new GST_Persentage();
		INCO_Term = new INCO_Term();
		IssuingStock = new IssuingStock();
		Language = new Language();
		Lead_Times = new Lead_Times();
		Location = new Location();
		MaterialType = new MaterialType();
		Nature_Of_Relationship = new Nature_Of_Relationship();
		Order_Type_Master = new Order_Type_Master();
		Packing_Instructions = new Packing_Instructions();
		Part_Type = new Part_Type();
		Payment_Term = new Payment_Term();
		Preferred_Freight_Forwarder = new Preferred_Freight_Forwarder();
		Price_List = new Price_List();
		process = new Process();
		Procutement_Type = new Procutement_Type();
		Purchase_Group = new Purchase_Group();
		Quote_Terms = new Quote_Terms();
		Risk_Category = new Risk_Category();
		Salutations = new Salutations();
		Scope_Of_Supply = new Scope_Of_Supply();
		Segment = new Segment();
		Shipment_Instructions = new Shipment_Instructions();
		Shipment_Mode = new Shipment_Mode();
		Type_Of_Company = new Type_Of_Company();
		Type_OF_Solution = new Type_OF_Solution();
		UOC = new UOC();
		UOM = new UOM();
		Vender_Category = new Vender_Category();
		Vender_Type = new Vender_Type();
		Warehouse = new Warehouse();
		NumberOfRoom = new NumberOfRoom();
		TypeOfRoom = new TypeOfRoom();

		loginPage = new LoginPage();
		homePage = loginPage.login("admin@mail.com", "admin@123");

	}

//	@DataProvider
//	public Object[][] AdditinalChargesCreate() {
//		Object[][] data = {
//				{ "TEST Additional Charges Name1", "100", "5", "5", "5", "5", "TEST Description", "TEST Trmarks" }
//				// Add more test data sets as needed
//		};
//		return data;
//	}
//
//	@Test(priority = 1, dataProvider = "AdditinalChargesCreate")
//	public void verifyAdditinalChargesCreate(String name, String amount, String igst, String cgst, String sgst,
//			String utgst, String description, String remarks) throws AWTException, InterruptedException {
//
//		homePage.clickOnSecondaryMaster();
//		additionalcharges.additionalChargesCreate(name, amount, igst, cgst, sgst, utgst, description, remarks);
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@DataProvider
//	public Object[][] AdditinalChargesEdit() {
//		Object[][] data = { { "101", "5", "5", "5", "5", "TEST Description1", "TEST Trmarks1" }
//				// Add more test data sets as needed
//		};
//		return data;
//	}
//
//	@Test(priority = 2, dataProvider = "AdditinalChargesEdit")
//	public void verifyAdditinalChargesEdit(String amount, String igst, String cgst, String sgst, String utgst,
//			String description, String remarks) throws AWTException, InterruptedException {
//
//		homePage.clickOnSecondaryMaster();
//		additionalcharges.additionalChargesEdit(amount, igst, cgst, sgst, utgst, description, remarks);
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@DataProvider
//	public Object[][] AuditFrequencyCreate() {
//		Object[][] data = { { "TEST Audit Frequency Name", "TEST Description", "TEST remarks" }
//				// Add more test data sets as needed
//		};
//		return data;
//	}
//
//	@Test(priority = 3, dataProvider = "AuditFrequencyCreate")
//	public void verifyAuditFrequencyCreate(String name, String description, String remarks)
//			throws AWTException, InterruptedException {
//
//		auditFrequency.AuditFrequencyCreate(name, description, remarks);
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@DataProvider
//	public Object[][] AuditFrequencyEdit() {
//		Object[][] data = { { "TEST Description1", "TEST remarks1" }
//				// Add more test data sets as needed
//		};
//		return data;
//	}
//
//	@Test(priority = 4, dataProvider = "AuditFrequencyEdit")
//	public void verifyAuditFrequencyEdit(String description, String remarks) throws AWTException, InterruptedException {
//
//		auditFrequency.AuditFrequencyEdit(description, remarks);
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 5)
//	public void verifyBankNameCreate() throws AWTException, InterruptedException {
//
//		bankName.BankNameCreate("TEST Bank Name", "TEST Description", "TEST remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 6)
//	public void verifyBankNameEdit() throws AWTException, InterruptedException {
//
//		bankName.BankNameEdit("TEST Description", "TEST remarks1");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 7)
//	public void verifyBasisOfApprovalCreate() throws AWTException, InterruptedException {
//
//		BasisOfApproval.BasisOfApprovalCreate("TEST Basis OF Approval", "TEST Description", "TEST remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 8)
//	public void verifyBasisOfApprovalEdit() throws AWTException, InterruptedException {
//
//		BasisOfApproval.BasisOfApprovalEdit("TEST Description", "TEST remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 9)
//	public void verifycategoryCreate() throws AWTException, InterruptedException {
//
//		Category.CategoryCreate("TEST Category", "TEST Description");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 10)
//	public void verifycategoryEdit() throws AWTException, InterruptedException {
//
//		Category.CategoryEdit("TEST Description");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 11)
//	public void verifycommodityCreate() throws AWTException, InterruptedException {
//
//		Commodity.CommodityCreate("TEST Commodity", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 12)
//	public void verifycommodityEdit() throws AWTException, InterruptedException {
//
//		Commodity.CommodityEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 13)
//	public void verifyCompanyCategoryCreate() throws AWTException, InterruptedException {
//
//		CompanyCategory.CompanyCategoryCreate("TEST Company Category", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
////	@Test(priority = 14)
////	public void verifyCompanyCategoryEdit() throws AWTException, InterruptedException {
////	
////		
////		CompanyCategory.CompanyCategoryEdit( "TEST Description","TEST Remarks");
////
////	    Thread.sleep(1000);
////	    driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
////	}
//	@Test(priority = 15)
//	public void verifycostCenter() throws AWTException, InterruptedException {
//
//		CostCenter.CostCenterCreate("TEST CostCenter", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 16)
//	public void verifycostCenterEdit() throws AWTException, InterruptedException {
//
//		CostCenter.CostCenterEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 17)
//	public void verifyCostingMethod() throws AWTException, InterruptedException {
//
//		CostingMethod.CostingMethodCreate("TEST CostingMethod", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 18)
//	public void verifyCostingMethodEdit() throws AWTException, InterruptedException {
//
//		CostingMethod.CostingMethodEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 19)
//	public void verifyCustomerCategoryCreate() throws AWTException, InterruptedException {
//
//		Customer_Category.CustomerCategoryCreate("TEST CustomerCategory", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 20)
//	public void verifyCustomerCategoryEdit() throws AWTException, InterruptedException {
//
//		Customer_Category.CustomerCategoryEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 21)
//	public void verifyCustomerTypeCreate() throws AWTException, InterruptedException {
//
//		CustomerType.CustomerTypeCreate("TEST CustomerType", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 22)
//	public void verifyCustomerTypeEdit() throws AWTException, InterruptedException {
//
//		CustomerType.CustomerTypeEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 23)
//	public void verifyDeliveryTermsCreate() throws AWTException, InterruptedException {
//
//		DeliveryTerms.DeliveryTermsCreate("TEST DeliveryTerms", "TEST Description", "String Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 24)
//	public void verifyDeliveryTermsEdit() throws AWTException, InterruptedException {
//
//		DeliveryTerms.DeliveryTermsEdit("TEST Description", "String Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 25)
//	public void verifyDepartmentCreate() throws AWTException, InterruptedException {
//
//		Department.DepartmentCreate("TEST Department", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 26)
//	public void verifyDepartmentEdit() throws AWTException, InterruptedException {
//
//		Department.DepartmentEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 27)
//	public void verifyExportUnitTypeCreate() throws AWTException, InterruptedException {
//
//		Export_Unit_Type.Export_Unit_TypeCreate("TEST Export_Unit_Type", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 28)
//	public void verifyExportUnitTypeEdit() throws AWTException, InterruptedException {
//
//		Export_Unit_Type.Export_Unit_TypeEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 29)
//	public void verifyGSTPercentageCreate() throws AWTException, InterruptedException {
//
//		GST_Persentage.GST_PersentageCreate("TEST GST_Persentage", "TEST Description");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 30)
//	public void verifyGSTPercentageEdit() throws AWTException, InterruptedException {
//
//		GST_Persentage.GST_PersentageEdit("TEST Description");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 31)
//	public void verifyIncoTermsCreate() throws AWTException, InterruptedException {
//
//		INCO_Term.INCO_TermCreate("TEST INCO_Term", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 32)
//	public void verifyIncoTermsEdit() throws AWTException, InterruptedException {
//
//		INCO_Term.INCO_TermEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 33)
//	public void verifyIssuingStockCreate() throws AWTException, InterruptedException {
//
//		IssuingStock.IssuingStockCreate("TEST IssuingStock", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 34)
//	public void verifyIssuingStockEdit() throws AWTException, InterruptedException {
//
//		IssuingStock.IssuingStockEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 35)
//	public void verifyLanguageCreate() throws AWTException, InterruptedException {
//
//		Language.LanguageCreate("TEST Language", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 36)
//	public void verifyLanguageEdit() throws AWTException, InterruptedException {
//
//		Language.LanguageEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 37)
//	public void verifyLeadTimesCreate() throws AWTException, InterruptedException {
//
//		Lead_Times.Lead_TimesCreate("11", "22", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 38)
//	public void verifyLeadTimesEdit() throws AWTException, InterruptedException {
//
//		Lead_Times.Lead_TimesEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 39)
//	public void verifyLovcationCreate() throws AWTException, InterruptedException {
//		Location.LocationCreate("TEST Location", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 40)
//	public void verifyLovcationEdit() throws AWTException, InterruptedException {
//		Location.LocationEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 40)
//	public void verifyMaterialTypeCreate() throws AWTException, InterruptedException {
//
//		MaterialType.MaterialTypeCreate("TEST MaterialType", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 41)
//	public void verifyMaterialTypeEdit() throws AWTException, InterruptedException {
//
//		MaterialType.MaterialTypeEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 42)
//	public void verifyNatureOfRelationshipCreate() throws AWTException, InterruptedException {
//
//		Nature_Of_Relationship.Nature_Of_RelationshipCreate("TEST Nature_Of_Relationship", "TEST Description",
//				"TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 43)
//	public void verifyNatureOfRelationshipEdit() throws AWTException, InterruptedException {
//
//		Nature_Of_Relationship.Nature_Of_RelationshipEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 44)
//	public void verifyOrderTypeMasterCreate() throws AWTException, InterruptedException {
//
//		Order_Type_Master.Order_Type_MasterCreate("TEST Order_Type_Master", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 45)
//	public void verifyOrderTypeMasterEdit() throws AWTException, InterruptedException {
//
//		Order_Type_Master.Order_Type_MasterEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 46)
//	public void verifyPackingInstructionsCreate() throws AWTException, InterruptedException {
//
//		Packing_Instructions.Packing_InstructionsCreate("TEST Packing_Instructions", "TEST Description",
//				"TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 47)
//	public void verifyPackingInstructionsEdit() throws AWTException, InterruptedException {
//
//		Packing_Instructions.Packing_InstructionsEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 48)
//	public void verifyPartTypeCreate() throws AWTException, InterruptedException {
//
//		Part_Type.Part_TypeCreate("TEST Part_Type", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
////	@Test(priority = 49)
////	public void verifyPartTypeEdit() throws AWTException, InterruptedException {
////		
////		Part_Type.Part_TypeEdit( "TEST Description","TEST Remarks");
////
////	    Thread.sleep(1000);
////	    driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
////	}
//	@Test(priority = 50)
//	public void verifyPayment_TermCreate() throws AWTException, InterruptedException {
//
//		Payment_Term.Payment_TeamCreate("TEST Payment_Term", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 51)
//	public void verifyPayment_TermEdit() throws AWTException, InterruptedException {
//
//		Payment_Term.Payment_TeamEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 52)
//	public void verifyPreferred_Freight_ForwarderCreate() throws AWTException, InterruptedException {
//
//		Preferred_Freight_Forwarder.Preferred_Freight_ForwarderCreate("TEST Preferred_Freight_Forwarder",
//				"TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 53)
//	public void verifyPreferred_Freight_ForwarderEdit() throws AWTException, InterruptedException {
//
//		Preferred_Freight_Forwarder.Preferred_Freight_ForwarderEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 54)
//	public void verifyPrice_ListCreate() throws AWTException, InterruptedException {
//
//		Price_List.Price_ListCreate("TEST Price_List", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 55)
//	public void verifyPrice_ListEdit() throws AWTException, InterruptedException {
//
//		Price_List.Price_ListEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 56)
//	public void verifyProcessCreate() throws AWTException, InterruptedException {
//
//		process.ProcessCreate("TEST Process", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 57)
//	public void verifyProcessEdit() throws AWTException, InterruptedException {
//
//		process.ProcessEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}

//	@Test(priority = 58)
//	public void verifyProcurement_TypeCreate() throws AWTException, InterruptedException {
//
//		Procutement_Type.Procutement_TypeCreate("TEST Procutement_Type", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//
//	@Test(priority = 59)
//	public void verifyProcurement_TypeEdit() throws AWTException, InterruptedException {
//
//		Procutement_Type.Procutement_TypeEdit("TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}

	@Test(priority = 60)
	public void verifyPurchase_GroupCreate() throws AWTException, InterruptedException {

		Purchase_Group.Purchase_GroupCreate("TEST Purchase_Group", "TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 61)
	public void verifyPurchase_GroupEdit() throws AWTException, InterruptedException {

		Purchase_Group.Purchase_GroupEdit("TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 62)
	public void verifyQuoteTermsCreate() throws AWTException, InterruptedException {

		Quote_Terms.Quote_TermsCreate("TEST Quote_Terms", "TEST Description");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 63)
	public void verifyQuoteTermsEdit() throws AWTException, InterruptedException {

		Quote_Terms.Quote_TermsEdit("TEST Description");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 64)
	public void verifyRiskCategoryCreate() throws AWTException, InterruptedException {

		Risk_Category.Risk_CategoryCreate("TEST Risk_Category", "TEST Description");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 65)
	public void verifyRiskCategoryEdit() throws AWTException, InterruptedException {

		Risk_Category.Risk_CategoryEdit("TEST Description");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 66)
	public void verifySalutationsCreate() throws AWTException, InterruptedException {

		Salutations.SalutationsCreate("TEST Salutations", "TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 67)
	public void verifySalutationsEdit() throws AWTException, InterruptedException {

		Salutations.SalutationsEdit("TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 68)
	public void verifyScopeOfSupplyCreate() throws AWTException, InterruptedException {

		Scope_Of_Supply.Scope_Of_SupplyCreate("TEST Scope_Of_Supply", "TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 69)
	public void verifyScopeOfSupplyEdit() throws AWTException, InterruptedException {

		Scope_Of_Supply.Scope_Of_SupplyEdit("TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 70)
	public void verifySegmentCreate() throws AWTException, InterruptedException {

		Segment.Segment_Create_PageCreate("TEST Segment", "TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 71)
	public void verifySegmentEdit() throws AWTException, InterruptedException {

		Segment.Segment_Create_PageEdit("TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 72)
	public void verifyShipmentInstructionsCreate() throws AWTException, InterruptedException {

		Shipment_Instructions.Shipment_InstructionsCreate("TEST Shipment_Instructions", "TEST Description",
				"TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 73)
	public void verifyShipmentInstructionsEdit() throws AWTException, InterruptedException {

		Shipment_Instructions.Shipment_InstructionsEdit("TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 73)
	public void verifyShipmentModeCreate() throws AWTException, InterruptedException {

		Shipment_Mode.Shipment_ModeCreate("TEST Shipment_Mode", "TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 74)
	public void verifyShipmentModeEdit() throws AWTException, InterruptedException {

		Shipment_Mode.Shipment_ModeEdit("TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 75)
	public void verifyTypeOfCompanyCreate() throws AWTException, InterruptedException {

		Type_Of_Company.Type_Of_CompanyCreate("TEST Type_Of_Company", "TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 76)
	public void verifyTypeOfCompanyEdit() throws AWTException, InterruptedException {

		Type_Of_Company.Type_Of_CompanyEdit("TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 79)
	public void verifyUOCCreate() throws AWTException, InterruptedException {

		UOC.UOCCreate("TEST UOC", "TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 80)
	public void verifyUOCEdit() throws AWTException, InterruptedException {

		UOC.UOCEdit("TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 81)
	public void verifyUOMCreate() throws AWTException, InterruptedException {

		UOM.UOMCreate("TEST UOM", "TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 82)
	public void verifyUOMEdit() throws AWTException, InterruptedException {

		UOM.UOMEdit("TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 83)
	public void verifyVenderCategoryCreate() throws AWTException, InterruptedException {

		Vender_Category.Vender_CategoryCreate("TEST Vender_Category", "TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 84)
	public void verifyVenderCategoryEdit() throws AWTException, InterruptedException {

		Vender_Category.Vender_CategoryEdit("TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 85)
	public void verifyVenderTypeCreate() throws AWTException, InterruptedException {

		Vender_Type.Vender_TypeCreate("TEST Vender_Type", "TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 86)
	public void verifyVenderTypeEdit() throws AWTException, InterruptedException {

		Vender_Type.Vender_TypeEdit("TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 87)
	public void verifyWareHouseCreate() throws AWTException, InterruptedException {

		Warehouse.WarehouseCreate("TEST Warehouse", "TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

	@Test(priority = 88)
	public void verifyWareHouseEdit() throws AWTException, InterruptedException {

		Warehouse.WarehouseEdit("TEST Description", "TEST Remarks");

		Thread.sleep(1000);
		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
	}

//	@Test(priority = 89)
//	public void verifyNumberOFRoomEdit() throws AWTException, InterruptedException {
//
//		NumberOfRoom.NumberOfRoomCreate("TEST NumberOfRoom", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}

//	@Test(priority = 90)
//	public void verifyTypeOfRoomCreate() throws AWTException, InterruptedException {
//		
//		NumberOfRoom.NumberOfRoomEdit( "TEST Description1","TEST Remarks1");
//
//	    Thread.sleep(1000);
//	    driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//	@Test(priority = 91)
//	public void verifyNumberOFRoomCreate() throws AWTException, InterruptedException {
//
//		TypeOfRoom.TypeOfRoomCreate("TEST TypeOfRoom", "TEST Description", "TEST Remarks");
//
//		Thread.sleep(1000);
//		driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}
//	@Test(priority = 92)
//	public void verifyTypeOfRoomEdit() throws AWTException, InterruptedException {
//		
//		TypeOfRoom.TypeOfRoomEdit("TEST Description","TEST Remarks");
//
//	    Thread.sleep(1000);
//	    driver.navigate().to("https://avision-demo.getapcs.com/dashboard");
//	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
