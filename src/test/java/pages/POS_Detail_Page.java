package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utiles.Driver;

public class POS_Detail_Page {

    public POS_Detail_Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;
    @FindBy(xpath = "(//table//tbody//td[@class='o_data_cell o_required_modifier'])[1]")
    public WebElement asdButton;

    @FindBy (xpath = "//button[@accesskey='s']") //add by Gleb
    public WebElement saveButton;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;


    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;


    @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button/text()[1]")//need Select dropDown
    public WebElement attachmentDropdown;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[3]/button/text()[1]")//need Select dropDown
    public WebElement actionDropdown;


    @FindBy(xpath = "//button[@aria-label='Previous']")
    public WebElement backErrowButton;

    @FindBy(xpath = "//button[@aria-label='Next']")
    public WebElement nextErrowButton;

  //  _______________________________________________________________________________________________________________

    //ORDER INTERFACE
    //Is Bar/Restuarant is checked That means 6 check box options  are vissable:
            //(Table Managment, Orderline Notes, Category Picture,Set Start Category, Virtual Keyboard, Large ScrollBars)

    //Is Bar/Restuarant is Not checked That mean 4 check box options are vissable:
            //(Category Pictures, Set Start Category, Virtual KeyBoard, Large Scrollbars)

    @FindBy(xpath = "//span[.='Active']")           //Top, "Active" Button
    public WebElement activeButton;

    @FindBy(xpath = "//span[.='Archive']")            //Top, "Archive" button
    public WebElement archiveButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")     //isBar/Restuarant checkBox
    public WebElement isBarRestuarantCheckBox;

    @FindBy(xpath = "(//div[@class='o_form_sheet']//h2)[1]")       //Order Interface Title
    public WebElement orderInterfaceTitle;

    @FindBy(xpath = "(//input[@type='checkbox'])[5]")             //Table Managment checkBox
    public WebElement tableManagmentCheckBox;

    //Under Table Managment there is "FLoors" DropDown
    @FindBy(xpath = "//input[@id='o_field_input_30'][1]")
    public WebElement underTableManagmentFloorsDropDown;

    //And there is also "FLoors" link that will direct to different page
    @FindBy(xpath = "//span[.='Floors']")
    public WebElement underTableManagmentFloorsLink;

    @FindBy (xpath = "(//input[@type='checkbox'])[6]")            //Orderline Notes checkBox
    public WebElement orderlineNotesCheckBox;

    @FindBy(xpath = "(//input[@type='checkbox'])[7]")             //Category Picture checkBox
    public WebElement categoryPicturesCheckBox;

    //Under Category Picture there is "Categories" link
    @FindBy(xpath = "//span[.='Categories']")
    public WebElement underCategoryPictureLink;

    @FindBy(xpath = "(//input[@type='checkbox'])[8]")             //Set Start Category checkBox
    public WebElement setStartCategoryCheckBox;

    //Under Set Start Category
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[4]")
    public WebElement underSetStartCategoryLink;

    @FindBy(xpath = "(//input[@type='checkbox'])[9]")             //Virtual Keyboard checkBox
    public WebElement virtualKeyboardCheckBox;

    @FindBy(xpath = "(//input[@type='checkbox'])[10]")             //Large ScrollBars checkBox
    public WebElement largeScrollBarsCheckBox;

    //------------------------------------------------------------------------------------------------------------

    //ORDER INTERFACE
    //If is Bar/Restuarant is checked then 3 check boxes under Order Interface are visable

    //If is Bar/Restuarant is NOT checked only two check boxes are visable

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/h2[2]")    //PoS Hardware Proxy title
    public WebElement posHardwareProxyTitle;

    @FindBy(xpath = "(//input[@type='checkbox'])[11]")              //PoS Box checkBox
    public WebElement posCheckBox;

    //Under PoS Box checkBox, inside Checkboxes:
    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input']")        //IP emptyBox
    public WebElement underOrderInterfaceIpEmptyBox;

    //Under PoS Box checkBox, inside Checkboxes:
    @FindBy(xpath = "(//input[@type='checkbox'])[12]")          // Adress Barcode Scanner checkBox
    public WebElement underOrderInterfaceIPAddressBarcodeScannerCheckBox;

    //Under PoS Box checkBox, inside Checkboxes:
    @FindBy(xpath = "(//input[@type='checkbox'])[13]")                  //Scanner Electronic checkBox
    public WebElement underOrderInterfaceScannerElectronicCheckBox;

    //Under PoS Box checkBox, inside Checkboxes:
    @FindBy (xpath = "(//input[@type='checkbox'])[14]")                    //Class CashDrawer checkBox
    public WebElement underOrderInterfaceClassCashDrawerCheckBox;

    //Under PoS Box checkBox, inside Checkboxes:
    @FindBy(xpath = "(//input[@type='checkbox'])[15]")                    //Receipt Printer checkBox
    public WebElement underOrderInterfaceReceiptPrinterCheckBox;

    //Under PoS Box checkBox, inside Checkboxes:
    @FindBy(xpath = "(//input[@type='checkbox'])[16]")                  //Customer Display checkBox
    public WebElement underOrderInterfaceCustomerDisplayCheckBox;


    @FindBy(xpath = "(//input[@type='checkbox'])[17]")              //Barcode Scanner
    public WebElement barcodeScannerCheckBox;

    //Under Barcode Scanner there is a dropDown
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[5]")         //DefaultNomenclatureDropdown
    public WebElement underBarcodeScannerDefaultNomenclatureDropdown;



    //Under Barcode Scanner there is "errow" button
    @FindBy(xpath = "(//button[@class='fa fa-external-link btn btn-default o_external_button'])[4]")        //Errow button under Barcode Scanner
    public WebElement underBarcodeScannerErrowButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[18]")              //Order Printers
    public WebElement orderPrinters;

    //Under Order Printers "Printer" dropDown
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[6]")         //Under Order Printers "printers" dropDown
    public WebElement underOrderPrintersDropDown;

    //Under Order Printers "Printers" link
    @FindBy(xpath = "//span[.='Printers']")                         //Under Order Printers "Printers" link
    public WebElement underPrintersLink;

    //-------------------------------------------------------------------------------------------------------------

    //TAXES:
    @FindBy(xpath = "//span[.='NORTH AMERICA']")
    public WebElement dropDowTxt;

    @FindBy (xpath = "//h2[.='Taxes']")                 //Taxes title
    public WebElement taxesTitle;

    @FindBy(xpath = "(//input[@type='checkbox'])[19]")      //Fiscal Position per Order checkBox
    public WebElement fiscalPositionPerOrderCheckBox;

    //Under Fiscal Position Per Order Check box there is a dropdown
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[7]")         //Fiscal Position per Order dropdown
    public WebElement underFiscalPositionPerOrderDropDown;

    //Under Fiscal Position Per Order Check box there is a link
    @FindBy(xpath = "//span[.='Fiscal Positions']")             //Under Fiscal Position per Order Link
    public WebElement underFiscalPositionPerOrderLink;

    @FindBy(xpath = "(//input[@type='checkbox'])[20]")      //Fiscal Position
    public WebElement fiscalPositionCheckBox;

    //Under Fiscal Position checkbox there is a dropdown
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[8]")             //Under Fiscal Position, dropDown
    public WebElement underFiscalPositionDropDown;

    //--------------------------------------------------------------------------------------------------------------

    //PRICING

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/h2[4]")        //Pricing Title
    public WebElement pricingTitle;

    @FindBy(xpath = "//label[.='Product Prices']")          //Product Prices title
    public WebElement productPricesTitle;

    //Under Product Prices title there is checkbox:
    @FindBy(xpath = "(//input[@class='o_radio_input'])[1]")         //Tax excluded prices checkBox
    public WebElement taxExcludedPricesCheckBox;

    //Under Product Prices title there is checkbox:
    @FindBy(xpath = "(//input[@class='o_radio_input'])[2]")         //Tax included prices checkBox
    public WebElement taxIncludedPricesCheckBox;


    @FindBy(xpath = "(//input[@type='checkbox'])[21]")              //Global Discounts checkBox
    public WebElement globalDiscountsPageCheckBox;

    //Under GLobal Discount dropdown
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[9]")             //Under GLobal Discount Discount Product DropDowns
    public WebElement underGLobalDIscountDropDown;

    //Under Global Discount discount% box
    @FindBy(xpath = "//input[@class='o_field_float o_field_number o_field_widget o_input']")
    public WebElement underGLobalDiscountBox;

    @FindBy(xpath = "(//input[@type='checkbox'])[22]")  //PriceList CheckBox
    public WebElement priceListCheckBox;

    //Under Pricelist Chechkbox there is dropDown
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[10]")        //Available Pricelists
    public WebElement underPricelistDropDown1;

    //Under Pricelist CheckBox There is another dropdown
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[11]")        //Default PricelIst
    public WebElement underPricelistDropDown2;

    //Under Pricelist checkbox there is errow button
    @FindBy(xpath = "(//button[@class='fa fa-external-link btn btn-default o_external_button'])[7]")        //Under Pricelist errow button
    public WebElement underPricelistErrowButton;

    //Under Pricelist Check box there is a link
    @FindBy (xpath = "//span[.='Pricelists']")                  //"Pricelists" link
    public  WebElement underPricelistLink;

    @FindBy(xpath = "(//input[@type='checkbox'])[23]")              //Loyalty Program checkBox
    public WebElement loyaltyProgramCheckBox;

    //When you click on loyalty program new tab window pops up:
    @FindBy(xpath = "//span[.='Upgrade now']")                                  //Upgrade now button
    public WebElement upgradeNowButton;

    //When you click on loyalty program new tab window pops up:
    @FindBy(xpath = "//span[.='Cancel']")                                        //Cancel button
    public WebElement cancelButton;

    //When you click you loyalty program new tab window will pop and this is X button
    @FindBy(xpath = "//div[@id='modal_744']/div/div/div[1]/button")           //X button
    public WebElement xButton;

    @FindBy(xpath = "(//input[@type='checkbox'])[24]")                  //Price Control CheckBox
    public WebElement priceControlCheckBox;
    





    //---------------------------------------------------------------------------------------------------------------

    //PAYMENTS

    @FindBy(xpath = "//h2[.='Payments']")                   //Payments title;
    public WebElement paymentsTitle;

    //Under Payment Methods there is a dropdown
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[12]")            //Under Payment Method dropDown
    public WebElement underPaymentMethodDropdown;

    //Under Payment Methods there is a link button
    @FindBy(xpath = "//span[.='Payment Methods']")              //Payment Methods link
    public WebElement underPaymentMethodLink;


    @FindBy(xpath = "(//input[@type='checkbox'])[25]")          //Integrated Card Reader
    public WebElement integratedCardReaderCheckBox;

    //Under Integrated Card Reader there is a link "Vantif Accounts"
    @FindBy (xpath = "//span[.='Vantiv Accounts']")
    public WebElement vantifAccountsLink;

    //Under Integrated Card Reader there is a link "Buy a card Reader"
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[11]/div[2]/div[2]/div[2]/div[2]/a/text()")
    public WebElement buyACardReaderLink;

    @FindBy(xpath = "(//input[@type='checkbox'])[26]")          //Cash Control CheckBox
    public WebElement cashControlCheckBox;

    //Under Cash Control CheckBox There is a dropDown:
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[13]" )          //Default opening dropdown, under cash control checkbox
    public WebElement underCashControlDropDown;

    //Under Cash Control link
    @FindBy(xpath = "//span[.='Opening/Closing Values']")         //Under Cash Control "Opening.closing Values" link
    public WebElement underCashControlLink;

    @FindBy(xpath = "(//input[@type='checkbox'])[27]")          //Prefill Cash Payments
    public WebElement prefillCashPaymentsCheckBox;


    //-------------------------------------------------------------------------------------------------------------

    //BILLS AND RECEIPTS:

    @FindBy(xpath = "//h2[.='Bills & Receipts']")       //Bills and Receipts title
    public WebElement billsAndReceiptsTitle;

    @FindBy(xpath = "(//input[@type='checkbox'])[28]")      //Header Footer checkBox
    public WebElement headerFooterCheckBox;

    //Under Header Footer, there is text box
    @FindBy (xpath = "(//textarea[@class='o_field_text o_field_widget o_input'])[1]")
    public WebElement underHeaderFooterTextBox1;

    //Under Header Footer, there is text box
    @FindBy (xpath = "(//textarea[@class='o_field_text o_field_widget o_input'])[2]")
    public WebElement underHeaderFooterTextBox2;

    @FindBy(xpath = "(//input[@type='checkbox'])[29]")      //Automatic Receipt Printing
    public WebElement automaticReceiptPrintingCheckBox;

    //Under Automatic Receipt There is "Skip Preview Screen"
    @FindBy(xpath = "(//input[@type='checkbox'])[30]")
    public WebElement underAutomaticReceiptSkipPreviewScreenCheckBox;

    @FindBy(xpath = "(//input[@type='checkbox'])[32]")      //Bill Printing checkBox
    public WebElement billPrintingCheckBox;

    @FindBy(xpath = "(//input[@type='checkbox'])[33]")  //Bill splitting checkbox
    public WebElement billSplittingCheckBox;

    @FindBy(xpath = "(//input[@type='checkbox'])[34]")      // "Tips" checkbox
    public WebElement tipsCheckBox;

    //Under Tips there is a dropDown:
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[14]")
    public WebElement underTipsDropDown;

    //Under Tips and next to dropdown there is a errow button
    @FindBy(xpath = "(//button[@class='fa fa-external-link btn btn-default o_external_button'])[8]")
    public WebElement underTipsErrowButton;



    @FindBy(xpath = "(//input[@type='checkbox'])[35]")      //Invoicing CheckBox
    public WebElement invoicingCheckBox;

    //Under Invoicing there is a dropdown "Invoice Journal"
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[15]")
    public WebElement underInvoicingDropDown;

    //Under invocing and next to dropdown there is an eerow button
    @FindBy(xpath = "(//button[@class='fa fa-external-link btn btn-default o_external_button'])[9]")
    public WebElement underInvoicingErroButton;

    //---------------------------------------------------------------------------------------------------------------

   // INVENTORY

    @FindBy(xpath = "//h2[.='Inventory']")              //Inventory Title
    public WebElement inventoryTitle;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[16] ")       //Under Operation type Dropdown
    public WebElement underOperationTypeDropDown;

    //Under Opertation type there is an eerow button
    @FindBy(xpath = "(//button[@class='fa fa-external-link btn btn-default o_external_button'])[10]")
    public  WebElement underOperationTypeErrowButton;






    //--------------------------------------------------------------------------
    //SAVE accesskey="s"
    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement saveButton;






























}
