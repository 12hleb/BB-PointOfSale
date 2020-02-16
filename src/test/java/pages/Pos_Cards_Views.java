package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utiles.Driver;

import java.util.List;

public class Pos_Cards_Views {
    public  Pos_Cards_Views(){
        PageFactory.initElements(Driver.getDriver(),this);

    }



    @FindBy (xpath = "//ol[@class='breadcrumb']/li")
    public WebElement headerOfThePage;
   @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;


    @FindBy(xpath = "//button[@aria-label='Previous']")

 public WebElement leftArrowBox;


@FindBy(xpath ="//button[@aria-label='Next']" )
    public WebElement rightArrowBox;

    @FindBy(xpath = "//button[@accesskey='l']" )
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

    // Locator for all PoS - the size of this array list will be match the quantity of PoS displayed on the page
    @FindBy (xpath = "//div[@class='o_kanban_view o_kanban_dashboard o_pos_kanban o_kanban_ungrouped']//div[@class='o_kanban_record']")
    public List<WebElement> allCards;


    //Locator for PoS in  InProgress status
    @FindBy (xpath = "//div[@class='o_kanban_view o_kanban_dashboard o_pos_kanban o_kanban_ungrouped']//div[@class='o_kanban_record']//div[@class='label label-success o_kanban_inline_block']")
    public List<WebElement> allCardsInProgress;


    //Locator for PoS in OpeningControl status
    @FindBy (xpath= "//div[@class='o_kanban_view o_kanban_dashboard o_pos_kanban o_kanban_ungrouped']//div[@class='o_kanban_record']//div[@class='label label-info o_kanban_inline_block']")
    public List<WebElement> allCardsOpeningControl;



    //this will return first three dots only
    @FindBy (xpath = "//a[@class='o_kanban_manage_toggle_button']")
    public WebElement threeDotsButtonOfFirstCard;

}
