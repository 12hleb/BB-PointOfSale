package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.POS_Detail_Page;
import pages.Pos_Cards_Views;
import utiles.Config;
import utiles.Driver;
import utiles.SeleniumUtils;

import java.util.List;

public class POSTaxSection {


    WebDriver driver;
    LoginPageTest lp = new LoginPageTest();


    @Test
    public void taxPosSection() throws InterruptedException {
        lp.positiveLoginScenario();
        lp.navigateToPointOfSalePage();

        Pos_Cards_Views cv = new Pos_Cards_Views();
        SeleniumUtils.waitForVisibility(cv.listBox, 3);
        cv.listBox.click();
        POS_Detail_Page pd = new POS_Detail_Page();

        pd.asdButton.click();
        pd.editButton.click();
        pd.fiscalPositionPerOrderCheckBox.click();
        pd.underFiscalPositionPerOrderDropDown.isDisplayed();

        Assert.assertTrue(pd.underFiscalPositionPerOrderDropDown.isDisplayed());

        String expectedText = "Taxes";

        WebElement taxesText = Driver.getDriver().findElement(By.xpath("//h2[.='Taxes']"));
        String actualText = taxesText.getText();
        System.out.println(actualText);
        Assert.assertTrue(actualText.equals(expectedText));


        SeleniumUtils.pause(3);
        pd.fiscalPositionCheckBox.click();
        pd.underFiscalPositionDropDown.isDisplayed();
        Assert.assertTrue( pd.underFiscalPositionDropDown.isDisplayed());




        pd.saveButton.click();


    }

}













