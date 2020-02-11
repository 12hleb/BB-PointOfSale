package utiles;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
}

