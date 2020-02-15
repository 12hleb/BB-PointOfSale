package test;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utiles.Config;
import utiles.Driver;
import utiles.SeleniumUtils;

import java.security.Key;


public class CreatePOS_Test {
    Pos_Cards_Views posCV = new Pos_Cards_Views();
    PosListViewPage posLV = new PosListViewPage();
    POSCreatePage posCreatePage = new POSCreatePage();
    POS_Detail_Page posDetailPage = new POS_Detail_Page();


    @BeforeMethod
    public void openListView() {
        DefaultPage.getToPOSModule(); // login and navigate to POS module
        SeleniumUtils.waitForVisibility(posCV.listBox, 15);  // wait until list icon element display
        posCV.listBox.click();
    }


    @Test(priority = 1)
    public void verificationOfButtons() {

        posLV.createButton.click();

        String expectedTitle = "New - Odoo";
        SeleniumUtils.waitForTitleLoaded(expectedTitle,10);
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Title verification FAILED");

        Assert.assertTrue(posCreatePage.newTextUnderCreatePOS.isDisplayed(), "New word is not displayed");
        Assert.assertTrue(posCreatePage.savePOSButton.isDisplayed(), "Save button is not displayed");
        Assert.assertTrue(posCreatePage.discardButton.isDisplayed(), "Discard button is not displayed");
        Assert.assertTrue(posCreatePage.nameInputBoxOfPOS.isDisplayed(), "Input box is not displayed");
    }

    @Test(priority = 3)
    public void validationOfDiscardButton() {

        posLV.createButton.click();
        posCreatePage.nameInputBoxOfPOS.sendKeys("cbvc");
        posCreatePage.discardButton.click();
        //SeleniumUtils.pause(3);
        SeleniumUtils.waitForVisibility(posCreatePage.warningMessageSubmit, 15);
        posCreatePage.warningMessageSubmit.click();


        String expectedTitle = "Point of Sale - Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        SeleniumUtils.waitForTitleLoaded(expectedTitle,10);
        Assert.assertEquals(expectedTitle, actualTitle, "Title verification with discard button FAILED");
    }

    @Test(priority = 2)
    public void savePOSWithoutName() {

        posLV.createButton.click();

        if (posCreatePage.nameInputBoxOfPOS.getText().isEmpty()) {
            posCreatePage.savePOSButton.click();
        }
        SeleniumUtils.waitForVisibility(posCreatePage.errorMessage, 15);
        //Checking if error (toast) notification is appear
        Assert.assertTrue(posCreatePage.errorMessage.isDisplayed(), "Error message is not displayed");
    }

   @Test(priority = 4)
    public void createNewPosValidation() {

        SeleniumUtils.waitForClickability(posLV.createButton,10);
        posLV.createButton.click();

        //Enter name of POS
        posCreatePage.nameInputBoxOfPOS.sendKeys(Config.getProperty("nameNewPos"));
        //Choose operation type
        posDetailPage.underOperationTypeDropDown.click();
        SeleniumUtils.waitForVisibility(Driver.getDriver().findElement(By.linkText("YourCompany: 7yy")), 15);
        Driver.getDriver().findElement(By.linkText("YourCompany: 7yy")).click();

        //click save
        posCreatePage.savePOSButton.click();

        //verify title change to "nameOfThePOS (not used)"
        String expectedTitle = Config.getProperty("nameNewPos") + " (not used) - Odoo";
        SeleniumUtils.waitForTitleLoaded(expectedTitle,10);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test     (dependsOnMethods = "createNewPosValidation")
    public void verificationOfNewPOS() {

        SeleniumUtils.waitForVisibility(posLV.searchField,10);
        posLV.searchField.sendKeys(Config.getProperty("nameNewPos") + Keys.ENTER);
        SeleniumUtils.waitForVisibility(posLV.firstPosInList, 15);
        String actualName = posLV.firstPosInList.getText();
        Assert.assertTrue(actualName.contains(Config.getProperty("nameNewPos")), "POS names mismatch");

    }

    @AfterClass
    public void closeBrowser() {
        Driver.closeDriver();
    }


}
