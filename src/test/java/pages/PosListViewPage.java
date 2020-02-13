package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utiles.Driver;

import java.util.ArrayList;

public class PosListViewPage {
    public PosListViewPage()
    {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//ol[@class='breadcrumb']")
    public WebElement nameOfThePage;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchField;

    @FindBy(xpath = "//button[@class='fa fa-chevron-left btn btn-icon o_pager_previous']")
    public WebElement leftArrow;

    @FindBy(xpath = "//button[@class='fa fa-chevron-right btn btn-icon o_pager_next']")
    public WebElement rightArrow;

    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public WebElement headOfTheTable;

    @FindBy(xpath = "//th[@class='o_list_record_selector']")
    public WebElement selectAllCheckBox;

    @FindBy(xpath = "//td[@class='o_list_record_selector']")
    public ArrayList<WebElement> listOfCheckBoxes;

    @FindBy(xpath = "//td[@class='o_data_cell o_required_modifier']")
    public ArrayList<WebElement> namesOfPOS;

    }
