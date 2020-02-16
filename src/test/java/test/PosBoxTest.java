package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.POS_Detail_Page;
import pages.Pos_Cards_Views;
import utiles.Driver;
import utiles.SeleniumUtils;

public class PosBoxTest {

@Test
    public void verificationPosBoxHardwareProxyElements() {
    LoginPageTest lp = new LoginPageTest();
    lp.positiveLoginScenario();
    lp.navigateToPointOfSalePage();
    WebElement pOfSaleOnLeft =Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[8]/ul[4]/li[1]/a"));
    pOfSaleOnLeft.click();
    lp.navigateToEditMode("ASD");


    POS_Detail_Page pos_detail_page = new POS_Detail_Page();
//***PART ONE***
        Assert.assertTrue(pos_detail_page.posHardwareProxyTitle.isDisplayed());   //Title
        Assert.assertTrue(pos_detail_page.posCheckBox.isDisplayed());// pos check box
        Assert.assertTrue(pos_detail_page.barcodeScannerCheckBox.isDisplayed()); //scanner check box
//***PART TWO***
       pos_detail_page.isBarRestuarantCheckBox.click();
        if (pos_detail_page.isBarRestuarantCheckBox.isSelected()) {
            Assert.assertTrue(pos_detail_page.orderPrinters.isDisplayed(), "Is Bar/ Restuarant not selected ");
        }
        if (pos_detail_page.posCheckBox.isSelected()) {

            Assert.assertTrue(pos_detail_page.underOrderInterfaceIpEmptyBox.isDisplayed()); //ip empty box
            Assert.assertTrue(pos_detail_page.underOrderInterfaceIPAddressBarcodeScannerCheckBox.isDisplayed()); //Barcode Scanner
            Assert.assertTrue(pos_detail_page.underOrderInterfaceScannerElectronicCheckBox.isDisplayed()); // Electronic Scale
            Assert.assertTrue(pos_detail_page.underOrderInterfaceClassCashDrawerCheckBox.isDisplayed());//cash drawer
            Assert.assertTrue(pos_detail_page.underOrderInterfaceReceiptPrinterCheckBox.isDisplayed()); //Reciept printer
            Assert.assertTrue(pos_detail_page.underOrderInterfaceCustomerDisplayCheckBox.isDisplayed());//customer display

        }else if (!pos_detail_page.posCheckBox.isSelected()){
            Assert.assertFalse(pos_detail_page.posCheckBox.isSelected(),"there are no displayed elements");

        }
//***PART THREE***
        pos_detail_page.posCheckBox.click();
        WebElement saveButton = Driver.getDriver().findElement(By.xpath("//button[@accesskey='s']"));
    SeleniumUtils.waitForVisibility(saveButton, 3);
                saveButton.click();
        Assert.assertTrue(pos_detail_page.posCheckBox.isSelected());
        }


    }

        //Assert.assertTrue(pos_detail_page.barcodeScannerCheckBox.isDisplayed());
        //Assert.assertTrue(pos_detail_page.underBarcodeScannerDefaultNomenclatureDropdown.isDisplayed());