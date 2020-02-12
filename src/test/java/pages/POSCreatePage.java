package pages;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources;
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

    @FindBy(partialLinkText = "Discard")
    public WebElement discardButton;

    @FindBy(xpath="//div[@class='o_control_panel o_breadcrumb_full']/ol/li[2]" )
    public WebElement newTextUnderCreatePOS;

    @FindBy(css = "input#o_field_input_20")
    public WebElement nameInputBoxOfPOS;

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
