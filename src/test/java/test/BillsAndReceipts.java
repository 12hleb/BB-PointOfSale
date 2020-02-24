package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.POS_Detail_Page;
import utiles.Driver;
import utiles.SeleniumUtils;

import java.util.Set;

public class BillsAndReceipts {

    POS_Detail_Page dp = new POS_Detail_Page();
    LoginPageTest lp = new LoginPageTest();

    @BeforeTest
    public void navigateToBillAndReceiptsBlock() {
        lp.positiveLoginScenario();
        lp.navigateToPointOfSalePage();
        lp.navigateToListViewPos();
        lp.navigateToEditMode("phone");
        SeleniumUtils.scrollDown(Driver.getDriver(),400);

    }
    @Test
    public void checkBoxIsBarNotSelected() {
        if (dp.isBarRestuarantCheckBox.isSelected()) {
            dp.isBarRestuarantCheckBox.click();
        }
    }

    @Test(dependsOnMethods = "checkBoxIsBarNotSelected" )
    public void verificationOfCheckBoxHeaderIsSelected(){
        SeleniumUtils.scrollToElement(Driver.getDriver(),dp.inventoryTitle);
        if(!dp.headerFooterCheckBox.isSelected()) {
            dp.headerFooterCheckBox.click();
        }
        Assert.assertTrue(dp.headerFooterCheckBox.isSelected(),"Header and Footer checkbox is not selected!");
    }
    @AfterTest
    public void saveButtonSave(){
        dp.saveButton.click();
    }
    @Test
    public void CheckBoxInvoicingIsSelected() {
        SeleniumUtils.scrollToElement(Driver.getDriver(), dp.inventoryTitle);
        if (!dp.invoicingCheckBox.isSelected()) {
            dp.invoicingCheckBox.click();
        }
    }
    @Test
    public void CheckBoxAutomaticReceiptIsSelected() {
        SeleniumUtils.scrollToElement(Driver.getDriver(), dp.inventoryTitle);
        if (!dp.automaticReceiptPrintingCheckBox.isSelected()) {
            dp.automaticReceiptPrintingCheckBox.click();
        }
    }

    @AfterTest(dependsOnMethods = "saveButtonSave")
    public void verificationOfChecksBoxes(){
        SeleniumUtils.scrollToElement(Driver.getDriver(),dp.inventoryTitle);
        Assert.assertTrue(dp.headerFooterCheckBox.isSelected(),"Header and Footer checkbox is not selected!");
        Assert.assertTrue(dp.automaticReceiptPrintingCheckBox.isSelected(),"Automatic receipt checkbox is not selected!");
        Assert.assertTrue(dp.invoicingCheckBox.isSelected(),"Header and Footer checkbox is not selected!");
    }
}
