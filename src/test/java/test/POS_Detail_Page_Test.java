package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.POS_Detail_Page;
import utiles.Config;
import utiles.Driver;

import java.util.Properties;

public class POS_Detail_Page_Test {

    //creating object of the POM
    POS_Detail_Page pos_detail_page = new POS_Detail_Page();
    LoginPage logInPage = new LoginPage();

    @BeforeMethod
    public void setUp(){
        //going to the page, from the config properties(project.properties)
        Driver.getDriver().get(Config.getProperty("url"));
    }

    @Test
    public void login(){
        //userName
        String userName = Config.getProperty("userNameInput");
        logInPage.userNameInput.sendKeys(userName);
        //Password
        String password = Config.getProperty("passwordInput");
        logInPage.passwordInput.sendKeys(password);
        //LogInButton
        logInPage.buttonLogIn.click();




    }
}
