package test;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.POS_Detail_Page;
import utiles.Config;
import utiles.Driver;

public class POS_Payments_Detail_Test {

    POS_Detail_Page pos_detail_page = new POS_Detail_Page();
    LoginPageTest loginPageTest = new LoginPageTest();

    //private @FindBy (xpath = "")

    @Test
    public void configurePyaments(){
        loginPageTest.positiveLoginScenario();
        loginPageTest.navigateToPointOfSalePage();

    }
}
