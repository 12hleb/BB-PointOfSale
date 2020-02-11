package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utiles.Driver;

public class Pos_Cards_Views {
    public  Pos_Cards_Views(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
   @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;


    @FindBy(xpath = "//button[@aria-label='Previous']")

public WebElement leftArrowBox;


@FindBy(xpath ="//button[@aria-label='Next']" )
    public WebElement rightArrowBox;

@FindBy(xpath = "//button[@type='button']" )
    public WebElement listBox;


@FindBy(xpath = "(//span[@class='oe_menu_text'])[2]")
    public WebElement dashboard;

@FindBy(xpath = "(//span[@class='oe_menu_text'])[1]")
    public WebElement orderCatalog;

@FindBy(xpath = "(//span[@class='oe_menu_text'])[3]")
    public  WebElement sessionCatalog;

@FindBy (xpath = "(//span[@class='oe_menu_text'])[4]")

    public  WebElement productCatalog;

@FindBy (xpath = "(//span[@class='oe_menu_text'])[5]")

    public  WebElement pricelistCatalog;

@FindBy (xpath = "(//span[@class='oe_menu_text'])[6]")

    public  WebElement ordersReporting ;

@FindBy(xpath = "(//span[@class='oe_menu_text'])[7]")

    public  WebElement salesDaitlsReporting ;
@FindBy(xpath = "(//span[@class='oe_menu_text'])[8]")
    public  WebElement pointOfSaleConfiguration;

@FindBy (xpath = "(//span[@class='oe_menu_text'])[8]")
 public  WebElement productsConfiguration;
}
