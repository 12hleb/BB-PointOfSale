package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Pos_Cards_Views;
import utiles.Config;
import utiles.Driver;
import utiles.SeleniumUtils;

public class POS_Cards_View_Test {

    // creating POS CARDS view page
    Pos_Cards_Views pos_cards_views = new Pos_Cards_Views();
    LoginPageTest lp =new LoginPageTest();




    @Test
    public void openPointOfSaleModule(){

        String userName = Config.getProperty("userNameInput");
        String password = Config.getProperty("passwordInput");


        Driver.getDriver().get(Config.getProperty("url"));  // open the browser on the url page
        LoginPage lg = new LoginPage();                     // create object of LoginPage Class for invoke page elements
        lg.userNameInput.sendKeys(userName);                //Web element
        lg.passwordInput.sendKeys(password);
        SeleniumUtils.highLighterMethod(Driver.getDriver(),lg.buttonLogIn); //highlight for make sure what chosen right element

        lg.buttonLogIn.click();
        //SeleniumUtils.pause(3);
//        WebElement linkToPoS = Driver.getDriver().findElement(By.xpath("//a[@data-menu-xmlid='point_of_sale.menu_point_root']"));
//        linkToPoS.click();
         lp.navigateToPointOfSalePage();

    }

//    @Test
//    public void testingPOScardsview(){
//        Assert.assertTrue( pos_cards_views.headerOfThePage.getText().trim().equals("Point of Sale"));
//    }



}



