package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utiles.Driver;

public class POSCreatePage {
    public POSCreatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement savePOSButton;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy(xpath="//div[@class='o_control_panel o_breadcrumb_full']/ol/li[2]" )
    public WebElement newTextUnderCreatePOS;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement nameInputBoxOfPOS;

    @FindBy(xpath = "//div[@class='o_notification undefined o_error']")    // when you did not field out all required box and click save
    public WebElement errorMessage;


    @FindBy (xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement warningMessageSubmit;



    //----------------------------------------PRICING CATEGORY LOCATORS-------------------------------------

    @FindBy(xpath = "//div[@class='o_form_sheet']/h2[4]")
    public WebElement pricingCategoryText;                      // name of category. verification if Pricing category

    @FindBy(xpath = "(//div[@id='product_prices']//label)[1]")
    public WebElement productPricesText;                       // text under pricing category(radio box name)


    @FindBy(id = "radio51_subtotal")
    public WebElement taxExcludedRadioButton;

    @FindBy(id = "(//div[@class ='o_radio_item']//label)[1]")
    public WebElement taxExcludedText;

    @FindBy(id="radio51_total")
    public WebElement taxIncludedRadioButton;

    @FindBy(xpath = "(//div[@class ='o_radio_item']//label)[2]")
    public WebElement taxIncludedText;

    @FindBy (xpath="//label[contains(text(),'Global Discounts')]")
    public WebElement globalDiscountText;

    @FindBy(id="o_field_input_52")
    public WebElement globalDiscountCheckBox;

    @FindBy(id="o_field_input_53")
    public WebElement discountProductDropDown;      // when Global Discounts is selected

    @FindBy(id="o_field_input_54")
    public WebElement discountPercentageInputBox;   // when Global Discounts is selected

    @FindBy(id="o_field_input_55")
    public WebElement pricelistCheckBox;

    @FindBy (xpath = "(//label[@class='o_form_label'])[17]")
    public WebElement pricelistText;

    @FindBy(id="o_field_input_56")
    public WebElement availablePricelistDropdown;  // when pricelist checkbox is selected

    @FindBy(id="o_field_input_57")
    public WebElement defaultPricelistDropdown;   // when pricelist checkbox is selected

    @FindBy(xpath = "//div[@name='module_pos_loyalty']//input")
    public WebElement loyaltyProgramCheckBox;

    @FindBy(id="o_field_input_58")
    public  WebElement loyaltyProgramText;

    @FindBy(id="o_field_input_59")
    public WebElement priceControlCheckBox;

    @FindBy(xpath = "(//label[@class='o_form_label'])[19]")
    public WebElement priceControlText;




}
