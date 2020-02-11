package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utiles.Driver;

public class POS_Detail_Page {

    public POS_Detail_Page(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

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

    //Is Bar/Restuarant is checked That means 6 check box options  are vissable:
            //(Table Managment, Orderline Notes, Category Picture,Set Start Category, Virtual Keyboard, Large ScrollBars)

    //Is Bar/Restuarant is Not checked That mean 4 check box options are vissable:
            //(Category Pictures, Set Start Category, Virtual KeyBoard, Large Scrollbars)


    @FindBy(xpath = "//input[@id='o_field_input_172']")     //isBar/Restuarant checkBox
    public WebElement isBarRestuarantCheckBox;

    @FindBy(xpath = "(//div[@class='o_form_sheet']//h2)[1]")       //Order Interface Title
    public WebElement orderInterfaceTitle;

    @FindBy(xpath = "//input[@id='o_field_input_329']")             //Table Managment checkBox
    public WebElement tableManagmentCheckBox;

    @FindBy (xpath = "//input[@id='o_field_input_331']")            //Orderline Notes checkBox
    public WebElement orderlineNotesCheckBox;

    @FindBy(xpath = "//input[@id='o_field_input_332']")             //Category Picture checkBox
    public WebElement categoryPicturesCheckBox;

    @FindBy(xpath = "//input[@id='o_field_input_333']")             //Set Start Category checkBox
    public WebElement setStartCategoryCheckBox;

    @FindBy(xpath = "//input[@id='o_field_input_335']")             //Virtual Keyboard checkBox
    public WebElement virtualKeyboardCheckBox;

    @FindBy(xpath = "//input[@id='o_field_input_336']")             //Large ScrollBars
    public WebElement largeScrollBarsCheckBox;




}
