package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Pos_Cards_Views;
import utiles.Config;
import utiles.Driver;
import utiles.SeleniumUtils;

import java.util.ArrayList;
import java.util.List;

public class POS_Cards_View_Test {

    // creating POS CARDS view page
    Pos_Cards_Views pos_cards_views_Page = new Pos_Cards_Views();
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
        //
        SeleniumUtils.pause(3);
//        WebElement linkToPoS = Driver.getDriver().findElement(By.xpath("//a[@data-menu-xmlid='point_of_sale.menu_point_root']"));
//        linkToPoS.click();
         lp.navigateToPointOfSalePage();

    }

    @Test
    public void testingPOScardsview(){
       //1 - checking that all elements are displayed

        SeleniumUtils.waitForVisibility(pos_cards_views_Page.listBox, 3);
       Assert.assertTrue(pos_cards_views_Page.listBox.isDisplayed(), "List icon is not displayed");

       Assert.assertTrue(pos_cards_views_Page.leftArrowBox.isDisplayed(), "Left arrow is not displayed");

       Assert.assertTrue(pos_cards_views_Page.rightArrowBox.isDisplayed(), "Right arrow is not displayed");

       Assert.assertTrue(pos_cards_views_Page.searchBox.isDisplayed(), "SearchBox is not displayed");

//       List<WebElement> listPointsOfSaleInProgress = pos_cards_views_Page.allCardsInProgress;
//
//       List<WebElement> listPointsOfSaleAll = pos_cards_views_Page.allCards;


//       for (WebElement pos : listPointsOfSaleInProgress){
//           System.out.println(pos.findElement(By.xpath("//div[@class='o_primary']")).getText());
//           System.out.println(pos.getTagName());
//           System.out.println(pos.findElement(By.xpath("//")));
//       }
//

        //div[@class='container o_kanban_card_manage_pane']


       List<WebElement> threedots = Driver.getDriver().findElements(By.xpath("//a[@class='o_kanban_manage_toggle_button']"));
       // int numberOgPos = threedots.size();
        //counter to locate popups menu
        int counter=1;
        String kanaban_card_locator = "";
       for (WebElement th:threedots){
           th.click();
           //SeleniumUtils.waitForVisibility(Driver.getDriver().findElement(By.xpath("//div[@class='container o_kanban_card_manage_pane']")),3);
           kanaban_card_locator = "(//div[@class='container o_kanban_card_manage_pane'])"+"["+counter+"]";
           Assert.assertTrue(Driver.getDriver().findElement(By.xpath(kanaban_card_locator)).isDisplayed());
           Assert.assertTrue((Driver.getDriver().findElement(By.xpath(kanaban_card_locator+"//a[.='Sessions']"))).isDisplayed(), "Sessions is not displayed "+counter);
           Assert.assertTrue((Driver.getDriver().findElement(By.xpath(kanaban_card_locator+"//a[.='Sales Orders']"))).isDisplayed(), "Sales Orders is not displayed "+counter);
           Assert.assertTrue((Driver.getDriver().findElement(By.xpath(kanaban_card_locator+"//a[.='Orders']"))).isDisplayed(),"Orders is not displayed "+counter);
           Assert.assertTrue((Driver.getDriver().findElement(By.xpath(kanaban_card_locator+"//a[.='Settings']"))).isDisplayed(), "Settings is not displayed "+counter);

           counter++;
           th.click();

       }


     //  Driver.closeDriver();









    }



}



