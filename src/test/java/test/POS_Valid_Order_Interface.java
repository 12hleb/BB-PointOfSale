package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import utiles.Config;
import utiles.Driver;
import utiles.SeleniumUtils;

public class POS_Valid_Order_Interface {

    PointOfSaleImport posImportTest = new PointOfSaleImport ();


    LoginPageTest lp = new LoginPageTest();
    Pos_Cards_Views posCardsViewPage = new Pos_Cards_Views();
    PosListViewPage posListViewPage = new PosListViewPage();
    POS_Detail_Page pos_detail_page = new POS_Detail_Page();
    @BeforeClass
    public void openListView(){
        DefaultPage.getToPOSModule();
        SeleniumUtils.waitForVisibility(posCardsViewPage.listBox,4);
        posCardsViewPage.listBox.click();
        lp.navigateToEditMode("asd");
        pos_detail_page.editButton.click();
    }

    @Test
    public void verificationOfDisplayingOrderElementsOptions() {
        //1 - verifying that elements are displayed
        Assert.assertTrue(pos_detail_page.orderInterfaceTitle.isDisplayed());
        Assert.assertTrue(pos_detail_page.categoryPicturesCheckBox.isDisplayed());
        Assert.assertTrue(pos_detail_page.virtualKeyboardCheckBox.isDisplayed());
        Assert.assertTrue(pos_detail_page.setStartCategoryCheckBox.isDisplayed());
        Assert.assertTrue(pos_detail_page.largeScrollBarsCheckBox.isDisplayed());

        //2 - veryfiing that options for bar/restaurant are displayed (if this POS is bar/restaurant)
        if (pos_detail_page.isBarRestuarantCheckBox.isSelected()) {
            // table management
            Assert.assertTrue(pos_detail_page.tableManagmentCheckBox.isDisplayed());

            if (pos_detail_page.tableManagmentCheckBox.isSelected()) {
                WebElement floorsLabel = Driver.getDriver().findElement(By.xpath("//label[@class='o_form_label o_light_label' and .='Floors']"));
                Assert.assertTrue(floorsLabel.isDisplayed());

                WebElement floorsDropdown = Driver.getDriver().findElement(By.xpath("//div[@class='o_field_many2manytags o_input o_field_widget'][1]"));
                Assert.assertTrue(floorsDropdown.isDisplayed());
                WebElement floorsLink = Driver.getDriver().findElement(By.xpath("//span[.='Floors']"));
                Assert.assertTrue(floorsLink.isDisplayed());
            }

            Assert.assertTrue(pos_detail_page.orderlineNotesCheckBox.isDisplayed());


        }
        //3- veryfying that options for bar/restaurant are not displayed (if this POS is not bar/restaurant)
        else {
            Assert.assertFalse(pos_detail_page.tableManagmentCheckBox.isDisplayed());
            Assert.assertFalse(pos_detail_page.orderlineNotesCheckBox.isDisplayed());
        }

        //4- checking Category pictures

        if (pos_detail_page.categoryPicturesCheckBox.isSelected()) {
            WebElement categoriesLink = Driver.getDriver().findElement(By.xpath("//span[.='Categories']"));
            Assert.assertTrue(categoriesLink.isDisplayed());

        }
    }

        //5 - checking Large Scrollbars

//        if (pos_detail_page.largeScrollBarsCheckBox.isSelected()){
//
//        }



   // @AfterClass
    public void closing(){
        Driver.closeDriver();
    }


    }




