package com.Getapcs.Avision.Engineering;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Getapcs.Avision.BASECLASS.TestBase;
import com.Getapcs.Avision.HomeLogin.HomePage;

public class Item_Master_Create_Page_SA extends TestBase {
	
	@FindBy(tagName = "body")
	public static WebElement driverIninteractable;

	@FindBy(xpath = "//div[@class='title_sub_div_1 mt-1']")
	WebElement headingText;

	@FindBy(xpath = "//input[@placeholder='Enter Item Number']")
	WebElement itemNumber;

	@FindBy(xpath = "//textarea[@placeholder='Enter Item Description']")
	WebElement descriptionField1;

	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	WebElement activeStatus;

	@FindBy(xpath = "(//span[@class='slider round'])[2]")
	WebElement obsoluteToggleButton;

	@FindBy(xpath = "//input[@id='uploadFile']")
	WebElement uploadPhoto;

	// General Description
	@FindBy(xpath = "(//a[normalize-space()='General Description'])[1]")
	WebElement generalDescriptionTab;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement typeDropDown;
	@FindBy(xpath = "//span[normalize-space()='FG']")
	WebElement typeDropDownSelectData;
	@FindBy(xpath = "(//span[normalize-space()='PurchasePart'])[1]")
	WebElement typeDropDownSelectData1;
	@FindBy(xpath = "(//span[normalize-space()='SA'])[1]")
	WebElement typeDropDownSelectData2;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement commodity;
	@FindBy(xpath = "(//span[normalize-space()='TEST Commodity1'])[1]")
	WebElement commodityDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	WebElement materialGroupDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST MaterialType1'])[1]")
	WebElement materialGroupDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	WebElement purchaseGroupDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST Purchase_Group1'])[1]")
	WebElement purchaseGroupDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	WebElement departmentDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST Department1'])[1]")
	WebElement departmentDropDownSelectData;
	//
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement uOMDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST UOM1'])[1]")
	WebElement uomDropDownSelectData;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement hSNDropDown;
	@FindBy(xpath = "//span[normalize-space()='1002']")
	WebElement hSNDropDownSelectData;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement prRequiredToggleButton;

	@FindBy(xpath = "(//span[@class='slider round'])[4]")
	WebElement openGRINToggleButton;

	@FindBy(xpath = "(//input[@placeholder='DD-MM-YYYY'])[1]")
	WebElement validFromDatePicker;

	@FindBy(xpath = "//input[@placeholder='Enter Valid To']")
	WebElement validToDatePicker;

	@FindBy(xpath = "(//select[@formcontrolname='poMaterialType'])[1]")
	WebElement poMaterialType;

	@FindBy(xpath = "(//option[@value='Direct'])[1]")
	WebElement poMaterialTypeSelect;

	// Alternative Tab

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[2]/a")
	WebElement alternativeTab;

	@FindBy(xpath = "//input[@placeholder='Enter Alternate Part No']")
	WebElement alternatePartNoField;

	@FindBy(xpath = "//input[@id='manufacturer']")
	WebElement sourceManufacturerRadioButton;

	@FindBy(xpath = "//input[@id='customer']")
	WebElement sourceCustomerRadioButton;

	@FindBy(xpath = "//input[@placeholder='Enter Munufacturer/Customer']")
	WebElement manufacturerorCustomerField;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement defaultToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addAlternative;

	// Engineering Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[3]/a")
	WebElement engineeringTab;

	@FindBy(xpath = "//input[@placeholder='Enter Drawing No']")
	WebElement drawingNoField;

	@FindBy(xpath = "//input[@placeholder='Enter Rev No']")
	WebElement revNoField;

	@FindBy(xpath = "//input[@placeholder='Enter Doc Ret']")
	WebElement docRetField;
	
	@FindBy(xpath = "//input[@formcontrolname='remarksToVendor']")
	WebElement venderRemarkField;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/div[1]/label[2]/span")
	WebElement cocToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/div[2]/label[2]/span")
	WebElement rOHSToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[4]/div[1]/label[2]/span")
	WebElement selfLifeToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[4]/div[2]/label[2]/span")
	WebElement rEACHToggleButton;

	// Dimensions Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[4]/a")
	WebElement dimensionsTab;

	@FindBy(xpath = "(//input[@placeholder='Please Upload files.'])[1]")
	WebElement filesUpload;

	@FindBy(xpath = "(//button[normalize-space()='Save Files'])[1]")
	WebElement Savefiles;

	@FindBy(xpath = "(//button[normalize-space()='View Files'])[1]")
	WebElement viewFiles;

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	WebElement closeViewFiles;

	@FindBy(xpath = "//input[@placeholder='Enter Net Weight']")
	WebElement netWeightField;

	@FindBy(xpath = "//input[@placeholder='Enter Gross Weight']")
	WebElement grossWeightField;

	@FindBy(xpath = "//input[@placeholder='Enter Volume']")
	WebElement volumeField;

	@FindBy(xpath = "//input[@placeholder='Enter Size']")
	WebElement sizeField;

	@FindBy(xpath = "//input[@placeholder='Enter Foot Print']")
	WebElement footPrintField;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[1]/div[2]/ng-select/div/span[2]")
	WebElement uOMDropdown1;
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[1]/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement uOMDropdown1SelectData;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[2]/div[2]/ng-select/div/span[2]")
	WebElement uOMDropdown2;
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[2]/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement uOMDropdown2SelectData;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/div[2]/ng-select/div/span[2]")
	WebElement uOMDropdown3;
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[3]/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement uOMDropdown3SelectData;

	// Routing Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[5]/a")
	WebElement routingTab;

	@FindBy(xpath = "//input[@placeholder='Enter Process Step']")
	WebElement processStepField;

	@FindBy(xpath = "//input[@aria-autocomplete='list']")
	WebElement processDropDown;

	@FindBy(xpath = "//div[normalize-space()='TEST Process1']")
	WebElement processDropDownSelectData;

	@FindBy(xpath = "//textarea[@placeholder='Enter Description']")
	WebElement descriptionField;

	@FindBy(xpath = "//input[@placeholder='Enter Machine Hrs']")
	WebElement machineHoursField;

	@FindBy(xpath = "//input[@placeholder='Enter Labor Hrs']")
	WebElement labourHoursField;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement activeToggleButtoninRouting;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addRoutingButton;

	// Approved Vender List Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[6]/a")
	WebElement approvedVenderListTab;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[1]/div/ng-select/div/span[2]")
	WebElement vendorCodeDropDown;
	@FindBy(xpath = "(//span[normalize-space()='430025'])[1]")
	WebElement vendorCodeDropDownDataSelect;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[2]/div/ng-select/div/span[2]")
	WebElement venderNameDropDown;
	@FindBy(xpath = "(//span[normalize-space()='Real Time Quality Management Services'])[1]")
	WebElement venderNameDropDownDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Share of Business']")
	WebElement shareOFBusinessField;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addApprovedVenderList;

	// Planning Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[7]/a")
	WebElement planningTab;

	@FindBy(xpath = "//input[@placeholder='Enter MIN']")
	WebElement minField;

	@FindBy(xpath = "//input[@placeholder='Enter MAX']")
	WebElement maxField;

	@FindBy(xpath = "//input[@placeholder='Enter Re-Order']")
	WebElement reOrderField;

	@FindBy(xpath = "//input[@placeholder='Enter 2 Bin']")
	WebElement twoBinField;

	@FindBy(xpath = "//input[@placeholder='Enter Lead Time']")
	WebElement leadTimeField;

	@FindBy(xpath = "//div[@class='form-group gd_field_1']//span[@class='slider round']")
	WebElement kanbanToggleButton;

	// Warehouse Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[8]/a")
	WebElement wareHouseTab;

	@FindBy(xpath = "//input[@aria-autocomplete='list']")
	WebElement wareHouseDropDown;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[1]/div/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement wareHouseDropDownDataSelect;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement activeToggleButtoninWarehouse;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[2]/div/button")
	WebElement addWarehouseButton;

	@FindBy(xpath = "(//span[@class='slider round'])[4]")
	WebElement eSDToggleButtoninWarehouse;

	@FindBy(xpath = "(//span[@class='slider round'])[6]")
	WebElement cycleCountToggleButtoninWarehouse;

	@FindBy(xpath = "(//span[@class='slider round'])[8]")
	WebElement hazardousMaterialToggleButtoninWarehouse;

	@FindBy(xpath = "(//span)[61]")
	WebElement fIFOToggleButtoninWarehouse;

	@FindBy(xpath = "(//span[@class='slider round'])[7]")
	WebElement lIFOToggleButtoninWarehouse;

	@FindBy(xpath = "//input[@placeholder='Enter Expiry (Days)']")
	WebElement expiryDaysField;

	@FindBy(xpath = "//input[@placeholder='Enter Inspection Int (Days)']")
	WebElement inspectionIntDaysField;

	@FindBy(xpath = "//textarea[@placeholder='Enter Special Instructions']")
	WebElement specialInstructionsField;

	// Shipping Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[9]/a")
	WebElement shippingTab;

	@FindBy(xpath = "//textarea[@placeholder='Enter Instructions']")
	WebElement instructionsField;

	// Quality Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[10]/a")
	WebElement qualityTab;

	@FindBy(xpath = "(//span[@class='slider round'])[3]")
	WebElement iqcToggleButton;

	@FindBy(xpath = "//input[@placeholder='Enter GR Processing (Days)']")
	WebElement grProcessingDaysField;

	@FindBy(xpath = "//input[@placeholder='Enter Batch Size']")
	WebElement batchSizeField;

	// Finance Tab
	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[11]/a")
	WebElement financeTab;

	@FindBy(xpath = "(//span[@class='ng-arrow-wrapper'])[1]")
	WebElement costCenterDropDown;
	@FindBy(xpath = "(//span[normalize-space()='TEST CostCenter1'])[1]")
	WebElement costCenterDropDownDataSelect;

	@FindBy(xpath = "//input[@placeholder='Enter Std Cost']")
	WebElement stdCostField;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement costingMethodDropDown;
	@FindBy(xpath = "//span[normalize-space()='TEST CostingMethod1']")
	WebElement costingMethodDropDownDataSelect;

	@FindBy(xpath = "//body[1]/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-create-item-master[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/label[2]/span[1]")
	WebElement valuationToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[5]/div/label[2]/span")
	WebElement depreciationToggleButton;

	@FindBy(xpath = "/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/div/div/div[6]/div/label[2]/span")
	WebElement pFOToggleButton;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;

	public Item_Master_Create_Page_SA() {
		PageFactory.initElements(driver, this);
	}

	public HomePage itemMasterCreate(String itemNo, String description, String alternativeNo,
			String manufacturerorCustomerName, String drawingNo, String revNo, String docRet, String netWeight,
			String grossWeight, String volume, String size, String footPrint, String processStep,
			String descriptinRouting, String machinHrs, String labourHrs, String shareofBusiness, String min,
			String max, String reOrder, String twoBin, String leadTime, String expiryDays, String inspectionIntDays,
			String specialInstructions, String instructions, String grProcess, String batchSize, String stdCost)
			throws Throwable {

		String actualText = headingText.getText();
		String expectedText = "Item Master";
		assertEquals(actualText, expectedText);

		itemNumber.sendKeys(itemNo);
		// 1Verifying that Item Number Text Field is Enabled or not
		boolean isEnabledItemNumberTextField = itemNumber.isEnabled();
		assertTrue(isEnabledItemNumberTextField);
		boolean isDisabledItemNumberTextFieldn = !itemNumber.isEnabled();
		assertFalse(isDisabledItemNumberTextFieldn);

		// Verifying that Item Number Text Field is displayed or hidden.
		boolean isDisplayedItemNumberTextField = itemNumber.isDisplayed();
		assertTrue(isDisplayedItemNumberTextField);
		boolean isHiddenItemNumberTextField = !itemNumber.isDisplayed();
		assertFalse(isHiddenItemNumberTextField);

		// Verifying that Item Number Text Field is Selected or unselected
		boolean isSelectedItemNumberTextField = itemNumber.isSelected();
		assertFalse(isSelectedItemNumberTextField);
		boolean isDeselectedItemNumberTextField = !itemNumber.isSelected();
		assertTrue(isDeselectedItemNumberTextField);

		descriptionField1.sendKeys(description);
		// 1Verifying that Description Text Field is Enabled or not
		boolean isEnabledDescriptionTextField = descriptionField1.isEnabled();
		assertTrue(isEnabledDescriptionTextField);
		boolean isDisabledDescriptionTextFieldn = !descriptionField1.isEnabled();
		assertFalse(isDisabledDescriptionTextFieldn);

		// Verifying that Description Text Field is displayed or hidden.
		boolean isDisplayedDescriptionTextField = descriptionField1.isDisplayed();
		assertTrue(isDisplayedDescriptionTextField);
		boolean isHiddenDescriptionTextField = !descriptionField1.isDisplayed();
		assertFalse(isHiddenDescriptionTextField);

		// Verifying that Description Text Field is Selected or unselected
		boolean isSelectedDescriptionTextField = descriptionField1.isSelected();
		assertFalse(isSelectedDescriptionTextField);
		boolean isDeselectedDescriptionTextField = !descriptionField1.isSelected();
		assertTrue(isDeselectedDescriptionTextField);

		// verifying that ActiveStatus is displayed or hidden.
		boolean isDisplayedActiveStatus = activeStatus.isDisplayed();
		assertTrue(isDisplayedActiveStatus);
		boolean isHiddenActiveStatus = !activeStatus.isDisplayed();
		assertFalse(isHiddenActiveStatus);

		// Verifying that ObsoluteToggleButton is enabled or not
		boolean isEnabledObsoluteToggleButton = obsoluteToggleButton.isEnabled();
		assertTrue(isEnabledObsoluteToggleButton);
		boolean isDisabledObsoluteToggleButton = !obsoluteToggleButton.isEnabled();
		assertFalse(isDisabledObsoluteToggleButton);

		// verifying that ObsoluteToggleButton is displayed or hidden.
		boolean isDisplayedObsoluteToggleButton = obsoluteToggleButton.isDisplayed();
		assertTrue(isDisplayedObsoluteToggleButton);
		boolean isHiddenObsoluteToggleButton = !obsoluteToggleButton.isDisplayed();
		assertFalse(isHiddenObsoluteToggleButton);

		uploadFile(driver, uploadPhoto, 0);

		// ###################### GeneralDescription ##############################

		// Verifying that do we have proper Text heading.
		String generalDescriptionactualText = generalDescriptionTab.getText();
		String generalDescriptionExpectedText = "General Description";
		assertEquals(generalDescriptionactualText, generalDescriptionExpectedText);

		actions.moveToElement(driverIninteractable).perform();
		Thread.sleep(2000);

		click(driver, typeDropDown);
		isSelected(driver, typeDropDown, "typeDropDown");
		click(driver, typeDropDownSelectData2);
		
		click(driver, commodity);
		isSelected(driver, commodity, "commodity");
		click(driver, commodityDropDownSelectData);
		
		click(driver, materialGroupDropDown);
		isSelected(driver, materialGroupDropDown, "materialGroupDropDown");
		click(driver, materialGroupDropDownSelectData);
		
		click(driver, purchaseGroupDropDown);
		isSelected(driver, purchaseGroupDropDown, "purchaseGroupDropDown");
		click(driver, purchaseGroupDropDownSelectData);
		
		click(driver, departmentDropDown);
		isSelected(driver, departmentDropDown, "departmentDropDown");
		click(driver, departmentDropDownSelectData);
		
		click(driver, uOMDropDown);
		isSelected(driver, uOMDropDown, "uOMDropDown");
		click(driver, uomDropDownSelectData);

		click(driver, hSNDropDown);
		isSelected(driver, hSNDropDown, "hSNDropDown");
		hSNDropDown.sendKeys("1002");
		
		click(driver, prRequiredToggleButton);
		
		click(driver, openGRINToggleButton);
		
		Select select = new Select(poMaterialType);
		select.selectByValue("Direct");

		validFromDatePicker.click();
		validFromDatePicker.sendKeys(Keys.RIGHT);
		validFromDatePicker.sendKeys(Keys.ENTER);

		validToDatePicker.click();
		validToDatePicker.sendKeys(Keys.RIGHT);
		validToDatePicker.sendKeys(Keys.ENTER);

		// Alternatives Tab
		alternativeTab.sendKeys(Keys.ENTER);

		// 1Verifying that Alternative Part No Text Field is Enabled or not
		boolean isEnabledAlternativePartNoField = alternatePartNoField.isEnabled();
		assertTrue(isEnabledAlternativePartNoField);
		boolean isDisabledAlternativePartNoFieldn = !alternatePartNoField.isEnabled();
		assertFalse(isDisabledAlternativePartNoFieldn);

		// Verifying that Alternative Text Field is displayed or hidden.
		boolean isDisplayedAlternativePartNoField = alternatePartNoField.isDisplayed();
		assertTrue(isDisplayedAlternativePartNoField);
		boolean isHiddenAlternativePartNoField = !alternatePartNoField.isDisplayed();
		assertFalse(isHiddenAlternativePartNoField);

		alternatePartNoField.sendKeys(alternativeNo);

//		sourceManufacturerRadioButton.click();
//		sourceCustomerRadioButton.click();

		// 1Verifying that Alternative Part No Text Field is Enabled or not
		boolean isEnabledCustomerNameField = manufacturerorCustomerField.isEnabled();
		assertTrue(isEnabledCustomerNameField);
		boolean isDisabledCustomerNameFieldn = !manufacturerorCustomerField.isEnabled();
		assertFalse(isDisabledCustomerNameFieldn);

		// Verifying that Description Text Field is displayed or hidden.
		boolean isDisplayedCustomerNameField = manufacturerorCustomerField.isDisplayed();
		assertTrue(isDisplayedCustomerNameField);
		boolean isHiddenCustomerNameField = !manufacturerorCustomerField.isDisplayed();
		assertFalse(isHiddenCustomerNameField);

		manufacturerorCustomerField.sendKeys(manufacturerorCustomerName);

		// Verifying the Placeholder which is present in Description text field.

		defaultToggleButton.click();
		defaultToggleButton.click();

		// Verifying that Add button is Enabled or not

		boolean isEnabledAdd = addAlternative.isEnabled();
		assertTrue(isEnabledAdd);
		boolean isDisabledAdd = !addAlternative.isEnabled();
		assertFalse(isDisabledAdd);

		// Verifying that Add button is displayed or hidden.
		boolean isDisplayedAdd = addAlternative.isDisplayed();
		assertTrue(isDisplayedAdd);
		boolean isHiddenAdd = !addAlternative.isDisplayed();
		assertFalse(isHiddenAdd);
		addAlternative.click();

		// Engineering
		engineeringTab.sendKeys(Keys.ENTER);

		// 1Verifying that drawingNo Text Field is Enabled or not
		boolean isEnableddrawingNoField = drawingNoField.isEnabled();
		assertTrue(isEnableddrawingNoField);
		boolean isDisableddrawingNoFieldn = !drawingNoField.isEnabled();
		assertFalse(isDisableddrawingNoFieldn);

		// Verifying that drawingNo Field is displayed or hidden.
		boolean isDisplayeddrawingNoField = drawingNoField.isDisplayed();
		assertTrue(isDisplayeddrawingNoField);
		boolean isHiddendrawingNoField = !drawingNoField.isDisplayed();
		assertFalse(isHiddendrawingNoField);

		drawingNoField.sendKeys(drawingNo);

		// 1Verifying that RevNo Text Field is Enabled or not
		boolean isEnabledRevNoField = revNoField.isEnabled();
		assertTrue(isEnabledRevNoField);
		boolean isDisabledRevNoFieldn = !revNoField.isEnabled();
		assertFalse(isDisabledRevNoFieldn);

		// Verifying that RevNo Field is displayed or hidden.
		boolean isDisplayedRevNoField = revNoField.isDisplayed();
		assertTrue(isDisplayedRevNoField);
		boolean isHiddenRevNoField = !revNoField.isDisplayed();
		assertFalse(isHiddenRevNoField);

		revNoField.sendKeys(revNo);

		// Verifying the Placeholder which is present in RevNo field.
		String displayedTextInRevNo = revNoField.getAttribute("placeholder");

		String expected_placeholderRevNo = "Enter Rev No";

		assertEquals(displayedTextInRevNo, expected_placeholderRevNo);
		// 1Verifying that EnterDocRet Text Field is Enabled or not
		boolean isEnabledEnterDocRetField = docRetField.isEnabled();
		assertTrue(isEnabledEnterDocRetField);
		boolean isDisabledEnterDocRetFieldn = !docRetField.isEnabled();
		assertFalse(isDisabledEnterDocRetFieldn);

		// Verifying that EnterDocRet Field is displayed or hidden.
		boolean isDisplayedEnterDocRetField = docRetField.isDisplayed();
		assertTrue(isDisplayedEnterDocRetField);
		boolean isHiddenEnterDocRetField = !docRetField.isDisplayed();
		assertFalse(isHiddenEnterDocRetField);

		docRetField.sendKeys(docRet);
		
		venderRemarkField.sendKeys("Test Vender Remark");

		cocToggleButton.click();

		rOHSToggleButton.click();

		selfLifeToggleButton.click();

		rEACHToggleButton.click();

		uploadFile(driver, filesUpload, 1);

		click(driver, Savefiles);

		click(driver, viewFiles);

		click(driver, closeViewFiles);

		// Dimensions Tab
		dimensionsTab.sendKeys(Keys.ENTER);

		// 1Verifying that NetWeight Text Field is Enabled or not
		boolean isEnabledNetWeightField = netWeightField.isEnabled();
		assertTrue(isEnabledNetWeightField);
		boolean isDisabledNetWeightFieldn = !netWeightField.isEnabled();
		assertFalse(isDisabledNetWeightFieldn);

		// Verifying that NetWeight Field is displayed or hidden.
		boolean isDisplayedNetWeightField = netWeightField.isDisplayed();
		assertTrue(isDisplayedNetWeightField);
		boolean isHiddenNetWeightField = !netWeightField.isDisplayed();
		assertFalse(isHiddenNetWeightField);

		// Verifying the Placeholder which is present in NetWeight field.
		String displayedTextInNetWeight = netWeightField.getAttribute("placeholder");

		String expected_placeholderNetWeight = "Enter Net Weight";

		assertEquals(displayedTextInNetWeight, expected_placeholderNetWeight);

		netWeightField.sendKeys(netWeight);

		// 1Verifying that GrossWeight Text Field is Enabled or not
		boolean isEnabledGrossWeightField = grossWeightField.isEnabled();
		assertTrue(isEnabledGrossWeightField);
		boolean isDisabledGrossWeightFieldn = !grossWeightField.isEnabled();
		assertFalse(isDisabledGrossWeightFieldn);

		// Verifying that GrossWeight Field is displayed or hidden.
		boolean isDisplayedGrossWeightField = grossWeightField.isDisplayed();
		assertTrue(isDisplayedGrossWeightField);
		boolean isHiddenGrossWeightField = !grossWeightField.isDisplayed();
		assertFalse(isHiddenGrossWeightField);

		// Verifying the Placeholder which is present in GrossWeight field.
		String displayedTextInGrossWeight = grossWeightField.getAttribute("placeholder");

		String expected_placeholderGrossWeight = "Enter Gross Weight";

		assertEquals(displayedTextInGrossWeight, expected_placeholderGrossWeight);

		grossWeightField.sendKeys(grossWeight);

		// 1Verifying that Volume Text Field is Enabled or not
		boolean isEnabledVolumeField = volumeField.isEnabled();
		assertTrue(isEnabledVolumeField);
		boolean isDisabledVolumeFieldn = !volumeField.isEnabled();
		assertFalse(isDisabledVolumeFieldn);

		// Verifying that Volume Field is displayed or hidden.
		boolean isDisplayedVolumeField = volumeField.isDisplayed();
		assertTrue(isDisplayedVolumeField);
		boolean isHiddenVolumeField = !volumeField.isDisplayed();
		assertFalse(isHiddenVolumeField);

		volumeField.sendKeys(volume);

		// 1Verifying that Size Text Field is Enabled or not
		boolean isEnabledSizeField = sizeField.isEnabled();
		assertTrue(isEnabledSizeField);
		boolean isDisabledSizeFieldn = !sizeField.isEnabled();
		assertFalse(isDisabledSizeFieldn);

		// Verifying that Size Field is displayed or hidden.
		boolean isDisplayedSizeField = sizeField.isDisplayed();
		assertTrue(isDisplayedSizeField);
		boolean isHiddenSizeField = !sizeField.isDisplayed();
		assertFalse(isHiddenSizeField);

		sizeField.sendKeys(size);

		// 1Verifying that FootPrint Text Field is Enabled or not
		boolean isEnabledFootPrintField = footPrintField.isEnabled();
		assertTrue(isEnabledFootPrintField);
		boolean isDisabledFootPrintFieldn = !footPrintField.isEnabled();
		assertFalse(isDisabledFootPrintFieldn);

		// Verifying that FootPrint Field is displayed or hidden.
		boolean isDisplayedFootPrintField = footPrintField.isDisplayed();
		assertTrue(isDisplayedFootPrintField);
		boolean isHiddenFootPrintField = !footPrintField.isDisplayed();
		assertFalse(isHiddenFootPrintField);

		footPrintField.sendKeys(footPrint);

		uOMDropdown1.click();
		uOMDropdown1SelectData.click();

		uOMDropdown2.click();
		uOMDropdown2SelectData.click();

		uOMDropdown3.click();
		uOMDropdown3SelectData.click();

		// Routing
		routingTab.click();

		processStepField.sendKeys(processStep);
		// 1Verifying that Process Step Text Field is Enabled or not
		boolean isEnabledProcessStepField = processStepField.isEnabled();
		assertTrue(isEnabledProcessStepField);
		boolean isDisabledProcessStepFieldn = !processStepField.isEnabled();
		assertFalse(isDisabledProcessStepFieldn);

		// Verifying that Process Step Field is displayed or hidden.
		boolean isDisplayedProcessStepField = processStepField.isDisplayed();
		assertTrue(isDisplayedProcessStepField);
		boolean isHiddenProcessStepField = !processStepField.isDisplayed();
		assertFalse(isHiddenProcessStepField);

		processDropDown.click();
		processDropDownSelectData.click();

		descriptionField.sendKeys(descriptinRouting);
		// 1Verifying that DescriptionRouting Text Field is Enabled or not
		boolean isEnabledDescriptionRoutingField = descriptionField.isEnabled();
		assertTrue(isEnabledDescriptionRoutingField);
		boolean isDisabledDescriptionRoutingFieldn = !descriptionField.isEnabled();
		assertFalse(isDisabledDescriptionRoutingFieldn);

		// Verifying that DescriptionRouting Field is displayed or hidden.
		boolean isDisplayedDescriptionRoutingField = descriptionField.isDisplayed();
		assertTrue(isDisplayedDescriptionRoutingField);
		boolean isHiddenDescriptionRoutingField = !descriptionField.isDisplayed();
		assertFalse(isHiddenDescriptionRoutingField);

		machineHoursField.sendKeys(machinHrs);
		// 1Verifying that MachineHours Text Field is Enabled or not
		boolean isEnabledMachineHoursField = machineHoursField.isEnabled();
		assertTrue(isEnabledMachineHoursField);
		boolean isDisabledMachineHoursFieldn = !machineHoursField.isEnabled();
		assertFalse(isDisabledMachineHoursFieldn);

		// Verifying that MachineHours Field is displayed or hidden.
		boolean isDisplayedMachineHoursField = machineHoursField.isDisplayed();
		assertTrue(isDisplayedMachineHoursField);
		boolean isHiddenMachineHoursField = !machineHoursField.isDisplayed();
		assertFalse(isHiddenMachineHoursField);

		labourHoursField.sendKeys(labourHrs);
		// 1Verifying that LaborHours Text Field is Enabled or not
		boolean isEnabledLaborHoursField = labourHoursField.isEnabled();
		assertTrue(isEnabledLaborHoursField);
		boolean isDisabledLaborHoursFieldn = !labourHoursField.isEnabled();
		assertFalse(isDisabledLaborHoursFieldn);

		// Verifying that LaborHours Field is displayed or hidden.
		boolean isDisplayedLaborHoursField = labourHoursField.isDisplayed();
		assertTrue(isDisplayedLaborHoursField);
		boolean isHiddenLaborHoursField = !labourHoursField.isDisplayed();
		assertFalse(isHiddenLaborHoursField);

		activeToggleButtoninRouting.click();
		activeToggleButtoninRouting.click();

		addRoutingButton.click();

		// ApprovedVenderList
		approvedVenderListTab.sendKeys(Keys.ENTER);

		vendorCodeDropDown.click();
		vendorCodeDropDownDataSelect.click();

		venderNameDropDown.click();
		click(driver, venderNameDropDownDataSelect);

		shareOFBusinessField.sendKeys(shareofBusiness);
		// 1Verifying that ShareOFBusiness Text Field is Enabled or not
		boolean isEnabledShareOFBusinessField = shareOFBusinessField.isEnabled();
		assertTrue(isEnabledShareOFBusinessField);
		boolean isDisabledShareOFBusinessFieldn = !shareOFBusinessField.isEnabled();
		assertFalse(isDisabledShareOFBusinessFieldn);

		// Verifying that ShareOFBusiness Field is displayed or hidden.
		boolean isDisplayedShareOFBusinessField = shareOFBusinessField.isDisplayed();
		assertTrue(isDisplayedShareOFBusinessField);
		boolean isHiddenShareOFBusinessField = !shareOFBusinessField.isDisplayed();
		assertFalse(isHiddenShareOFBusinessField);

		// Verifying the Placeholder which is present in ShareOFBusiness field.
		String displayedTextInShareOFBusiness = shareOFBusinessField.getAttribute("placeholder");

		String expected_placeholderShareOFBusiness = "Enter Share of Business";

		assertEquals(displayedTextInShareOFBusiness, expected_placeholderShareOFBusiness);

		addApprovedVenderList.click();

		// Planning
		planningTab.click();

		// 1Verifying that Min Text Field is Enabled or not
		boolean isEnabledMinField = minField.isEnabled();
		assertTrue(isEnabledMinField);
		boolean isDisabledMinFieldn = !minField.isEnabled();
		assertFalse(isDisabledMinFieldn);

		// Verifying that Min Field is displayed or hidden.
		boolean isDisplayedMinField = minField.isDisplayed();
		assertTrue(isDisplayedMinField);
		boolean isHiddenMinField = !minField.isDisplayed();
		assertFalse(isHiddenMinField);

		minField.sendKeys(min);

		// 1Verifying that Max Text Field is Enabled or not
		boolean isEnabledMaxField = maxField.isEnabled();
		assertTrue(isEnabledMaxField);
		boolean isDisabledMaxFieldn = !maxField.isEnabled();
		assertFalse(isDisabledMaxFieldn);

		// Verifying that Max Field is displayed or hidden.
		boolean isDisplayedMaxField = maxField.isDisplayed();
		assertTrue(isDisplayedMaxField);
		boolean isHiddenMaxField = !maxField.isDisplayed();
		assertFalse(isHiddenMaxField);

		maxField.sendKeys(max);

		int MinfieldHeightSize = minField.getSize().getHeight();
		int MinfieldWidthSize = minField.getSize().getWidth();

		int MaxfieldHeightSize = maxField.getSize().getHeight();
		int MaxfieldWidthSize = maxField.getSize().getWidth();

		assertEquals(MinfieldHeightSize, MaxfieldHeightSize);
		assertEquals(MaxfieldWidthSize, MinfieldWidthSize);
		;

		// 1Verifying that ReOrder Text Field is Enabled or not
		boolean isEnabledReOrderField = reOrderField.isEnabled();
		assertTrue(isEnabledReOrderField);
		boolean isDisabledReOrderFieldn = !reOrderField.isEnabled();
		assertFalse(isDisabledReOrderFieldn);

		// Verifying that ReOrder Field is displayed or hidden.
		boolean isDisplayedReOrderField = reOrderField.isDisplayed();
		assertTrue(isDisplayedReOrderField);
		boolean isHiddenReOrderField = !reOrderField.isDisplayed();
		assertFalse(isHiddenReOrderField);

		reOrderField.sendKeys(reOrder);

		// 1Verifying that Bin Text Field is Enabled or not
		boolean isEnabledBinField = twoBinField.isEnabled();
		assertTrue(isEnabledBinField);
		boolean isDisabledBinFieldn = !twoBinField.isEnabled();
		assertFalse(isDisabledBinFieldn);

		// Verifying that Bin Field is displayed or hidden.
		boolean isDisplayedBinField = twoBinField.isDisplayed();
		assertTrue(isDisplayedBinField);
		boolean isHiddenBinField = !twoBinField.isDisplayed();
		assertFalse(isHiddenBinField);

		twoBinField.sendKeys(twoBin);

		int ReorderfieldHeightSize = reOrderField.getSize().getHeight();
		int ReorderfieldWidthSize = reOrderField.getSize().getWidth();

		int BinfieldHeightSize = twoBinField.getSize().getHeight();
		int BinfieldWidthSize = twoBinField.getSize().getWidth();

		assertEquals(ReorderfieldHeightSize, BinfieldHeightSize);
		assertEquals(ReorderfieldWidthSize, BinfieldWidthSize);
		;

		// 1Verifying that LeadTime Text Field is Enabled or not
		boolean isEnabledLeadTimeField = leadTimeField.isEnabled();
		assertTrue(isEnabledLeadTimeField);
		boolean isDisabledLeadTimeFieldn = !leadTimeField.isEnabled();
		assertFalse(isDisabledLeadTimeFieldn);

		// Verifying that LeadTime Field is displayed or hidden.
		boolean isDisplayedLeadTimeField = leadTimeField.isDisplayed();
		assertTrue(isDisplayedLeadTimeField);
		boolean isHiddenLeadTimeField = !leadTimeField.isDisplayed();
		assertFalse(isHiddenLeadTimeField);

		leadTimeField.sendKeys(leadTime);

		kanbanToggleButton.click();

		// Warehouse
		wareHouseTab.click();

		wareHouseDropDown.click();
		wareHouseDropDownDataSelect.click();

		activeToggleButtoninWarehouse.click();
		activeToggleButtoninWarehouse.click();

//		addWarehouseButton.click();

		// 1Verifying that LeadTime Text Field is Enabled or not
		boolean isEnabledADDButton = addWarehouseButton.isEnabled();
		assertTrue(isEnabledADDButton);
		boolean isDisabledADDButton = !addWarehouseButton.isEnabled();
		assertFalse(isDisabledADDButton);

		// Verifying that LeadTime Field is displayed or hidden.
		boolean isDisplayedADDButton = addWarehouseButton.isDisplayed();
		assertTrue(isDisplayedADDButton);
		boolean isHiddenADDButton = !addWarehouseButton.isDisplayed();
		assertFalse(isHiddenADDButton);

		eSDToggleButtoninWarehouse.click();
		// Verifying that ESDToggleButton is enabled or not
		boolean isEnabledESDToggleButton = eSDToggleButtoninWarehouse.isEnabled();
		assertTrue(isEnabledESDToggleButton);
		boolean isDisabledESDToggleButton = !eSDToggleButtoninWarehouse.isEnabled();
		assertFalse(isDisabledESDToggleButton);

		// verifying that ESDToggleButton is displayed or hidden.
		boolean isDisplayedESDToggleButton = eSDToggleButtoninWarehouse.isDisplayed();
		assertTrue(isDisplayedESDToggleButton);
		boolean isHiddenESDToggleButton = !eSDToggleButtoninWarehouse.isDisplayed();
		assertFalse(isHiddenESDToggleButton);

		cycleCountToggleButtoninWarehouse.click();
		// Verifying that CycleCountToggleButton is enabled or not
		boolean isEnabledCycleCountToggleButton = cycleCountToggleButtoninWarehouse.isEnabled();
		assertTrue(isEnabledCycleCountToggleButton);
		boolean isDisabledCycleCountToggleButton = !cycleCountToggleButtoninWarehouse.isEnabled();
		assertFalse(isDisabledCycleCountToggleButton);

		// verifying that CycleCountToggleButton is displayed or hidden.
		boolean isDisplayedCycleCountToggleButton = cycleCountToggleButtoninWarehouse.isDisplayed();
		assertTrue(isDisplayedCycleCountToggleButton);
		boolean isHiddenCycleCountToggleButton = !cycleCountToggleButtoninWarehouse.isDisplayed();
		assertFalse(isHiddenCycleCountToggleButton);

		hazardousMaterialToggleButtoninWarehouse.click();
		// Verifying that HazardousMaterialToggleButton is enabled or not
		boolean isEnabledHazardousMaterialToggleButton = hazardousMaterialToggleButtoninWarehouse.isEnabled();
		assertTrue(isEnabledHazardousMaterialToggleButton);
		boolean isDisabledHazardousMaterialToggleButton = !hazardousMaterialToggleButtoninWarehouse.isEnabled();
		assertFalse(isDisabledHazardousMaterialToggleButton);

		// verifying that HazardousMaterialToggleButton is displayed or hidden.
		boolean isDisplayedHazardousMaterialToggleButton = hazardousMaterialToggleButtoninWarehouse.isDisplayed();
		assertTrue(isDisplayedHazardousMaterialToggleButton);
		boolean isHiddenHazardousMaterialToggleButton = !hazardousMaterialToggleButtoninWarehouse.isDisplayed();
		assertFalse(isHiddenHazardousMaterialToggleButton);

		fIFOToggleButtoninWarehouse.click();
		// Verifying that FIFOToggleButton is enabled or not
		boolean isEnabledFIFOToggleButton = fIFOToggleButtoninWarehouse.isEnabled();
		assertTrue(isEnabledFIFOToggleButton);
		boolean isDisabledFIFOToggleButton = !fIFOToggleButtoninWarehouse.isEnabled();
		assertFalse(isDisabledFIFOToggleButton);

		// verifying that FIFOToggleButton is displayed or hidden.
		boolean isDisplayedFIFOToggleButton = fIFOToggleButtoninWarehouse.isDisplayed();
		assertTrue(isDisplayedFIFOToggleButton);
		boolean isHiddenFIFOToggleButton = !fIFOToggleButtoninWarehouse.isDisplayed();
		assertFalse(isHiddenFIFOToggleButton);

		lIFOToggleButtoninWarehouse.click();
		// Verifying that LIFOToggleButton is enabled or not
		boolean isEnabledLIFOToggleButton = lIFOToggleButtoninWarehouse.isEnabled();
		assertTrue(isEnabledLIFOToggleButton);
		boolean isDisabledLIFOToggleButton = !lIFOToggleButtoninWarehouse.isEnabled();
		assertFalse(isDisabledLIFOToggleButton);

		// verifying that LIFOToggleButton is displayed or hidden.
		boolean isDisplayedLIFOToggleButton = lIFOToggleButtoninWarehouse.isDisplayed();
		assertTrue(isDisplayedLIFOToggleButton);
		boolean isHiddenLIFOToggleButton = !lIFOToggleButtoninWarehouse.isDisplayed();
		assertFalse(isHiddenLIFOToggleButton);

		// 1Verifying that ExpiryDays Text Field is Enabled or not
		boolean isEnabledExpiryDaysField = expiryDaysField.isEnabled();
		assertTrue(isEnabledExpiryDaysField);
		boolean isDisabledExpiryDaysFieldn = !expiryDaysField.isEnabled();
		assertFalse(isDisabledExpiryDaysFieldn);

		// Verifying that ExpiryDays Field is displayed or hidden.
		boolean isDisplayedExpiryDaysField = expiryDaysField.isDisplayed();
		assertTrue(isDisplayedExpiryDaysField);
		boolean isHiddenExpiryDaysField = !expiryDaysField.isDisplayed();
		assertFalse(isHiddenExpiryDaysField);

		expiryDaysField.sendKeys(expiryDays);

		inspectionIntDaysField.sendKeys(inspectionIntDays);

		// 1Verifying that InspectionIntDays Text Field is Enabled or not
		boolean isEnabledInspectionIntDaysField = inspectionIntDaysField.isEnabled();
		assertTrue(isEnabledInspectionIntDaysField);
		boolean isDisabledInspectionIntDaysFieldn = !inspectionIntDaysField.isEnabled();
		assertFalse(isDisabledInspectionIntDaysFieldn);

		// Verifying that InspectionIntDays Field is displayed or hidden.
		boolean isDisplayedInspectionIntDaysField = inspectionIntDaysField.isDisplayed();
		assertTrue(isDisplayedInspectionIntDaysField);
		boolean isHiddenInspectionIntDaysField = !inspectionIntDaysField.isDisplayed();
		assertFalse(isHiddenInspectionIntDaysField);

		specialInstructionsField.sendKeys(specialInstructions);

		// 1Verifying that SpecialInstructions Text Field is Enabled or not
		boolean isEnabledSpecialInstructionsField = specialInstructionsField.isEnabled();
		assertTrue(isEnabledSpecialInstructionsField);
		boolean isDisabledSpecialInstructionsFieldn = !specialInstructionsField.isEnabled();
		assertFalse(isDisabledSpecialInstructionsFieldn);

		// Verifying that SpecialInstructions Field is displayed or hidden.
		boolean isDisplayedSpecialInstructionsField = specialInstructionsField.isDisplayed();
		assertTrue(isDisplayedSpecialInstructionsField);
		boolean isHiddenSpecialInstructionsField = !specialInstructionsField.isDisplayed();
		assertFalse(isHiddenSpecialInstructionsField);

		// Shipping
		shippingTab.click();

		// 1Verifying that Instructions Text Field is Enabled or not
		boolean isEnabledInstructionsField = instructionsField.isEnabled();
		assertTrue(isEnabledInstructionsField);
		boolean isDisabledInstructionsFieldn = !instructionsField.isEnabled();
		assertFalse(isDisabledInstructionsFieldn);

		// Verifying that Instructions Field is displayed or hidden.
		boolean isDisplayedInstructionsField = instructionsField.isDisplayed();
		assertTrue(isDisplayedInstructionsField);
		boolean isHiddenInstructionsField = !instructionsField.isDisplayed();
		assertFalse(isHiddenInstructionsField);

		instructionsField.sendKeys(instructions);

		// Quality
//		WebElement Quality = driver.findElement(By.xpath("/html/body/app-root/div/div/div/div/div/app-create-item-master/div[2]/div/div/div/form/div/div[2]/ul/li[10]/a"));

		qualityTab.click();

		iqcToggleButton.click();

		// Verifying that IQCToggleButton is enabled or not
		boolean isEnabledIQCToggleButton = iqcToggleButton.isEnabled();
		assertTrue(isEnabledIQCToggleButton);
		boolean isDisabledIQCToggleButton = !iqcToggleButton.isEnabled();
		assertFalse(isDisabledIQCToggleButton);

		// verifying that IQCToggleButton is displayed or hidden.
		boolean isDisplayedIQCToggleButton = iqcToggleButton.isDisplayed();
		assertTrue(isDisplayedIQCToggleButton);
		boolean isHiddenIQCToggleButton = !iqcToggleButton.isDisplayed();
		assertFalse(isHiddenIQCToggleButton);

		// 1Verifying that GRProcessing Text Field is Enabled or not
		boolean isEnabledGRProcessingField = grProcessingDaysField.isEnabled();
		assertTrue(isEnabledGRProcessingField);
		boolean isDisabledGRProcessingFieldn = !grProcessingDaysField.isEnabled();
		assertFalse(isDisabledGRProcessingFieldn);

		// Verifying that GRProcessing Field is displayed or hidden.
		boolean isDisplayedGRProcessingField = grProcessingDaysField.isDisplayed();
		assertTrue(isDisplayedGRProcessingField);
		boolean isHiddenGRProcessingField = !grProcessingDaysField.isDisplayed();
		assertFalse(isHiddenGRProcessingField);

		grProcessingDaysField.sendKeys(grProcess);

		// Verifying the Placeholder which is present in GRProcessing field.
		String displayedTextInGRProcessing = grProcessingDaysField.getAttribute("placeholder");

		String expected_placeholderGRProcessing = "Enter GR Processing (Days)";

		assertEquals(displayedTextInGRProcessing, expected_placeholderGRProcessing);

//		WebElement BatchSize = driver.findElement(By.xpath("//input[@placeholder='Enter Batch Size']"));

		// 1Verifying that BatchSize Text Field is Enabled or not
		boolean isEnabledBatchSizeField = batchSizeField.isEnabled();
		assertTrue(isEnabledBatchSizeField);
		boolean isDisabledBatchSizeFieldn = !batchSizeField.isEnabled();
		assertFalse(isDisabledBatchSizeFieldn);

		// Verifying that BatchSize Field is displayed or hidden.
		boolean isDisplayedBatchSizeField = batchSizeField.isDisplayed();
		assertTrue(isDisplayedBatchSizeField);
		boolean isHiddenBatchSizeField = !batchSizeField.isDisplayed();
		assertFalse(isHiddenBatchSizeField);

		batchSizeField.sendKeys(batchSize);

		// Costing
		financeTab.click();

		costCenterDropDown.click();
		js.executeScript("arguments[0].click();", costCenterDropDownDataSelect);

		// 1Verifying that StdCost Text Field is Enabled or not
		boolean isEnabledStdCostField = stdCostField.isEnabled();
		assertTrue(isEnabledStdCostField);
		boolean isDisabledStdCostFieldn = !stdCostField.isEnabled();
		assertFalse(isDisabledStdCostFieldn);

		// Verifying that StdCost Field is displayed or hidden.
		boolean isDisplayedStdCostField = stdCostField.isDisplayed();
		assertTrue(isDisplayedStdCostField);
		boolean isHiddenStdCostField = !stdCostField.isDisplayed();
		assertFalse(isHiddenStdCostField);

		stdCostField.sendKeys(stdCost);

		costingMethodDropDown.click();
		costingMethodDropDownDataSelect.click();

		valuationToggleButton.click();

		// Verifying that ValuationToggleButton is enabled or not
		boolean isEnabledValuationToggleButton = valuationToggleButton.isEnabled();
		assertTrue(isEnabledValuationToggleButton);
		boolean isDisabledValuationToggleButton = !valuationToggleButton.isEnabled();
		assertFalse(isDisabledValuationToggleButton);

		// verifying that ValuationToggleButton is displayed or hidden.
		boolean isDisplayedValuationToggleButton = valuationToggleButton.isDisplayed();
		assertTrue(isDisplayedValuationToggleButton);
		boolean isHiddenValuationToggleButton = !valuationToggleButton.isDisplayed();
		assertFalse(isHiddenValuationToggleButton);

		depreciationToggleButton.click();

		// Verifying that DepreciationToggleButton is enabled or not
		boolean isEnabledDepreciationToggleButton = depreciationToggleButton.isEnabled();
		assertTrue(isEnabledDepreciationToggleButton);
		boolean isDisabledDepreciationToggleButton = !depreciationToggleButton.isEnabled();
		assertFalse(isDisabledDepreciationToggleButton);

		// verifying that DepreciationToggleButton is displayed or hidden.
		boolean isDisplayedDepreciationToggleButton = depreciationToggleButton.isDisplayed();
		assertTrue(isDisplayedDepreciationToggleButton);
		boolean isHiddenDepreciationToggleButton = !depreciationToggleButton.isDisplayed();
		assertFalse(isHiddenDepreciationToggleButton);

		pFOToggleButton.click();

		// Verifying that PFOToggleButton is enabled or not
		boolean isEnabledPFOToggleButton = pFOToggleButton.isEnabled();
		assertTrue(isEnabledPFOToggleButton);
		boolean isDisabledPFOToggleButton = !pFOToggleButton.isEnabled();
		assertFalse(isDisabledPFOToggleButton);

		// verifying that PFOToggleButton is displayed or hidden.
		boolean isDisplayedPFOToggleButton = pFOToggleButton.isDisplayed();
		assertTrue(isDisplayedPFOToggleButton);
		boolean isHiddenPFOToggleButton = !pFOToggleButton.isDisplayed();
		assertFalse(isHiddenPFOToggleButton);

		String beforeSaveButton = driver.getCurrentUrl();
		System.out.println(beforeSaveButton + "\n");

		saveButton.click();

		Thread.sleep(3000);
		String afterSaveButton = driver.getCurrentUrl();
		System.out.println(afterSaveButton + "\n");

//		assertNotEquals(beforeSaveButton, afterSaveButton, "URLs are the same"); 
		return new HomePage();
	}

}
