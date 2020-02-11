package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utiles.Driver;

public class pointOfSalePage {

    public pointOfSalePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //@FindBy()

}
