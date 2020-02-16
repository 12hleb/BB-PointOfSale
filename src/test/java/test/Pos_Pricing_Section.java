package test;

import org.apache.http.util.Asserts;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.POS_Detail_Page;

public class Pos_Pricing_Section {



    LoginPageTest lp =new LoginPageTest();

    @Test

    public void pricing_Section() {

        POS_Detail_Page nani = new  POS_Detail_Page();

        lp.positiveLoginScenario();

        lp.navigateToPointOfSalePage();

        lp.navigateToListViewPos();
      //  lp.navigateToEditMode("Anew");

        nani.phone.click();

        nani.editButton.click();

        Assert.assertTrue(nani.pricingTitle.isDisplayed());


        Assert.assertTrue(nani.productPricesTitle.isDisplayed());


       nani.taxExcludedPricesCheckBox.click();
      nani.taxIncludedPricesCheckBox.click();

     Assert.assertTrue(nani.menageTaxIncludedPricesCheckBox.isDisplayed());

      nani. globalDiscountsPageCheckBox.click();

     // nani.underGLobalDIscountDropDown.click();

      //Assert.assertTrue(nani.underGLobalDiscountBox.isDisplayed());

      nani.priceListCheckBox.click();

//      nani. underPricelistDropDown1.click();
//      Assert.assertTrue(nani.underPricelistDropDown1.isDisplayed());
//
//      nani.underPricelistDropDown2.click();
//      Assert.assertTrue(nani.underPricelistDropDown2.isDisplayed());

      // nani.underPricelistErrowButton.click();

     //nani.underPricelistLink.click();

      //nani.loyaltyProgramCheckBox.click();

     // Assert.assertTrue(nani.upgradeNowButton.isDisplayed());
     // Assert.assertTrue(nani.cancelButton.isDisplayed());
    //nani.xButton.click();

   // nani.priceControlCheckBox.click();




    }
}
