package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import utiles.Config;
import utiles.Driver;
import utiles.SeleniumUtils;

public class LoginPageTest {

    @Test
    public void positiveLoginScenario(){

        String userName = Config.getProperty("userNameInput");
        String password = Config.getProperty("passwordInput");


        Driver.getDriver().get(Config.getProperty("url"));  // open the brawser on the url page
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

//    @AfterTest
//    public void navigateToPointOfSalePage(){ // how to be with intermediate page? for it create a class too?
//        SeleniumUtils.pause(2);
//        Driver.getDriver().findElement(By.xpath("//span[contains(text(), 'Point of Sale')][1]")).click();
//    }

}
