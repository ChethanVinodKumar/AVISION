package com.Getapcs.Avision.TEST;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page1;
import com.Getapcs.Avision.Engineering.Item_Master_Create_Page_SA;
import com.Getapcs.Avision.HomeLogin.HomePage;
import com.Getapcs.Avision.HomeLogin.LoginPage;

public class TEST_SA_Flow extends TestBase {

	public final static String priceList = "TEST PriceList 1";
	public final static String fg = "FG-3";
	public final static String fgPP = "FG-PP-3";
	public final static String sa = "SA-3";
	public final static String saPP = "SA-PP-3";

	LoginPage loginPage;
	HomePage homePage;

	Item_Master_Create_Page itemMasterCreatePage;
	Item_Master_Create_Page1 itemMasterCreatePage1;
	Item_Master_Create_Page_SA itemMasterCreatePageSA;

}
