package utiles;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

//  PAUSE
    public static void pause(int seconds){

        try{
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

//  HIGH LIGHT
    public static void highLighterMethod(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', ' border: 2px solid red;');", element);
    }

    public static void waitForVisibility(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public static void scrollDown (WebDriver driver, int px){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+px+")");  //if px= 400 this will scroll down in the middle of the page,
                                                        // if you want to scroll more, add instead of 400 => 600 for ex
    }
}

