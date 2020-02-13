package test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.PosListViewPage;
import pages.Pos_Cards_Views;
import utiles.Config;
import utiles.Driver;
import utiles.SeleniumUtils;

public class CreatePOS_Test {
    Pos_Cards_Views posCV = new Pos_Cards_Views();
    PosListViewPage posLV = new PosListViewPage();


    @BeforeClass
    public void getToPos(){
        DefaultPage.getToPOSModule(); // login and navigate to POS module
    }

    @Test
    public void openListView(){

        SeleniumUtils.waitForVisibility(posCV.listBox,7);  // wait until list icon element display
        posCV.listBox.click();
       posLV.createButton.click();






    }




}
