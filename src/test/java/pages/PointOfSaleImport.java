package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utiles.Driver;

public class PointOfSaleImport {

    public PointOfSaleImport(){


        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//ol[@class='breadcrumb']/li/a")
    public WebElement mainTitle;

    @FindBy (xpath= "//ol[@class='breadcrumb']/li")
    public WebElement titleImportAFile;


    @FindBy (xpath = "//button[@class='btn btn-sm btn-primary o_import_button o_import_validate']")
    public WebElement testImportButton;

    @FindBy (xpath = "//button[@class='btn btn-sm btn-default o_import_button o_import_import")
    public WebElement importButton;

    @FindBy (xpath= "//button[@class='btn btn-sm btn-default o_import_cancel'] ")
    public WebElement cancelButton;





}
