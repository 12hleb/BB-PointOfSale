package test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;
import utiles.Config;
import utiles.Driver;
import utiles.SeleniumUtils;

public class POS_Bar_Restaurant {
    //LoginPage lp = new LoginPage();
    //LoginPage lp = new LoginPage();
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
    public void testingBarRestaurantOptions(){





        if (pos_detail_page.isBarRestuarantCheckBox.isSelected()){
            Assert.assertTrue(pos_detail_page.tableManagmentCheckBox.isDisplayed(), "Bar/restaurant Table management is NOT displayed");
            Assert.assertTrue(pos_detail_page.orderlineNotesCheckBox.isDisplayed(), "Bar/restaurant orderOnline Notes is NOT displayed");
            Assert.assertTrue(pos_detail_page.billPrintingCheckBox.isDisplayed(), "Bar/restaurant bill printing is NOT displayed");
            Assert.assertTrue(pos_detail_page.billSplittingCheckBox.isDisplayed(), "Bar/restaurant bill splitting is NOT displayed");
            Assert.assertTrue(pos_detail_page.tipsCheckBox.isDisplayed(), "Bar/restaurant Tips is NOT displayed");
            Assert.assertTrue(pos_detail_page.orderPrinters.isDisplayed(), "Bar/restaurant Order Printers is NOT displayed");

            pos_detail_page.isBarRestuarantCheckBox.click();
            pos_detail_page.saveButton.click();
            SeleniumUtils.waitForVisibility(pos_detail_page.isBarRestuarantCheckBox, 3);
            Assert.assertFalse(pos_detail_page.isBarRestuarantCheckBox.isSelected(), "Unchecking POS as Bar/restaurant is not saved");


        }

        else {
            Assert.assertFalse(pos_detail_page.tableManagmentCheckBox.isDisplayed(), "Bar/restaurant Table management is displayed");
            Assert.assertFalse(pos_detail_page.orderlineNotesCheckBox.isDisplayed(), "Bar/restaurant orderOnline Notes is displayed");
            Assert.assertFalse(pos_detail_page.billPrintingCheckBox.isDisplayed(), "Bar/restaurant bill printing is displayed");
            Assert.assertFalse(pos_detail_page.billSplittingCheckBox.isDisplayed(), "Bar/restaurant bill splitting is displayed");
            Assert.assertFalse(pos_detail_page.tipsCheckBox.isDisplayed(), "Bar/restaurant Tips is  displayed");
            Assert.assertFalse(pos_detail_page.orderPrinters.isDisplayed(), "Bar/restaurant Order Printers is displayed");

            pos_detail_page.isBarRestuarantCheckBox.click();
            pos_detail_page.saveButton.click();
            SeleniumUtils.waitForVisibility(pos_detail_page.isBarRestuarantCheckBox, 3);
            Assert.assertTrue(pos_detail_page.isBarRestuarantCheckBox.isSelected(), "Checking POS as Bar/restaurant is not saved");



        }


    }

       // @Test
        public void changingOfBarRestaurant(){

        if (pos_detail_page.isBarRestuarantCheckBox.isSelected()) {


            pos_detail_page.isBarRestuarantCheckBox.click();
            pos_detail_page.saveButton.click();
            Assert.assertFalse(pos_detail_page.isBarRestuarantCheckBox.isSelected(), "Unchecking POS as Bar/restaurant is not saved");
        }
        else {

            pos_detail_page.isBarRestuarantCheckBox.click();
            pos_detail_page.saveButton.click();
            Assert.assertTrue(pos_detail_page.isBarRestuarantCheckBox.isSelected(), "Checking POS as Bar/restaurant is not saved");

        }

        }

       // @AfterClass
        public void closing(){
            Driver.closeDriver();
        }


}

