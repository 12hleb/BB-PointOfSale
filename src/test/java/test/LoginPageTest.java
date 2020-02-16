package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.POS_List_View_Page;
import pages.Pos_Cards_Views;
import utiles.Config;
import utiles.Driver;
import utiles.SeleniumUtils;

public class LoginPageTest {

    POS_List_View_Page lv = new POS_List_View_Page();

    public void positiveLoginScenario(){

        String userName = Config.getProperty("userNameInput");
        String password = Config.getProperty("passwordInput");

        Driver.getDriver().get(Config.getProperty("url"));  // open the browser on the url page
        LoginPage lg = new LoginPage();                     // create object of LoginPage Class for invoke page elements
        lg.userNameInput.sendKeys(userName);                //Web element
        lg.passwordInput.sendKeys(password);
        SeleniumUtils.highLighterMethod(Driver.getDriver(),lg.buttonLogIn); //highlight for make sure what chosen right element

        lg.buttonLogIn.click();

        if(Config.getProperty("browser").equals("safari")) { // for case if you run in Safari, simple .click doesn't work, need to use JS.
            JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
            executor.executeScript("arguments[0].click();", lg.buttonLogIn);
        }
    }

    public void navigateToPointOfSalePage(){
        Driver.getDriver().findElement(By.xpath("(//span[contains(text(), 'Point of Sale')])[1]")).click(); // Dzhulietta added () to xpath
    }

    public void navigateToListViewPos(){
        Pos_Cards_Views cv = new Pos_Cards_Views();
        cv.listBox.click();
    }

    public void navigateToCreateMode(){
        lv.createButton.click();
    }

    public void navigateToEditMode(String nameOfPos){
        nameOfPos = nameOfPos.toLowerCase();
        for(WebElement pos : lv.namesOfPOS){
           if(pos.getText().toLowerCase().contains(nameOfPos)){
               pos.click();
           }
        }
    }

    public void navigateToImport(){
        lv.importButton.click();
    }
}
