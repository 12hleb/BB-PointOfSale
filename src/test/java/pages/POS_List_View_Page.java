package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utiles.Driver;

import java.util.List;

public class POS_List_View_Page {

    public POS_List_View_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@class='active'])[2]")
    public WebElement head_of_the_page;

    @FindBy(xpath = "//button[@accesskey='c']") // IS IT RIGHT ONE BY GLEB
    public WebElement createButton;

    @FindBy(xpath = "//button[contains(@class, 'import')]")
    public WebElement importButton;

    @FindBy(xpath = "//input[contains(@class, 'search')]")
    public WebElement searchField;

    @FindBy(xpath = "//button[contains(@class, 'previous')]")
    public WebElement leftArrow;

    @FindBy(xpath = "//button[contains(@class, 'next')]")
    public WebElement rightArrow;

    @FindBy(xpath = "//button[contains(@class, 'switch_list')]")
    public WebElement listButton;

    @FindBy(xpath = "//th[contains(@class, 'sortable')]")
    public WebElement headOfTheTable;

    @FindBy(xpath = "//th[contains(@class, 'selector')]")
    public WebElement selectAllCheckBox;

    @FindBy(xpath = "//td[@class='o_list_record_selector']") // IS IT RIGHT ONE BY GLEB
    public List<WebElement> listOfCheckBoxes;

    @FindBy(xpath = "//td[@class='o_data_cell o_required_modifier']") // IS IT RIGHT ONE BY GLEB
    public List<WebElement> namesOfPOS;

    @FindBy (xpath = "//button[@accesskey='s']")
    public WebElement save_button;

    @FindBy(xpath = "(//span[contains(text(), 'Point of Sale')])[1]" )
    public WebElement pos_from_header_menu;

    @FindBy (xpath = "(//span[contains(text(), 'Point of Sale')])[2]")
    public WebElement pos_link_from_left_menu;

    @FindBy (xpath = "(//td[@class='o_list_record_selector'])[1]")
    public WebElement first_product_in_the_list;

    @FindBy (xpath = "//button[contains(text(), 'Action')]")
    public WebElement action_button;

    @FindBy(xpath = "//a[contains(text(), 'Export')]")
    public WebElement export_from_dropdown_menu;

    @FindBy(xpath = "//a[contains(text(), 'Archive')]")
    public WebElement archive_from_dropdown_menu;

    @FindBy(xpath = "//a[contains(text(), 'Unarchive')]")
    public WebElement unarchive_from_dropdown_menu;

    @FindBy(xpath = "//a[contains(text(), 'Delete')]")
    public WebElement delete_from_dropdown_menu;


}
