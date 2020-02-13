package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utiles.Config;
import utiles.Driver;
import utiles.SeleniumUtils;

public class DefaultPage {

    public DefaultPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static void getToPOSModule (){
        LoginPage lg = new LoginPage();
        Driver.getDriver().get(Config.getProperty("url"));
        lg.userNameInput.sendKeys(Config.getProperty("userNameInput"));
        lg.passwordInput.sendKeys(Config.getProperty("passwordInput"));
        SeleniumUtils.highLighterMethod(Driver.getDriver(),lg.buttonLogIn);

        lg.buttonLogIn.click();

        if(Config.getProperty("browser").equals("safari")) { // for case if you run in Safari, simple .click doesn't work, need to use JS.
            JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
            executor.executeScript("arguments[0].click();", lg.buttonLogIn);
        }

        String posModule = "//span[contains(text(), 'Point of Sale')][1]";

        Driver.getDriver().findElement(By.xpath(posModule)).click();


    }

}
