package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.POS_Detail_Page;
import pages.PointOfSaleImport;
import pages.PosListViewPage;
import pages.Pos_Cards_Views;
import utiles.Driver;
import utiles.SeleniumUtils;
public class POS_Import_Test {
    PointOfSaleImport posImportTest = new PointOfSaleImport ();
    LoginPageTest lp =new LoginPageTest();
    @Test
    public void testPosImport(){
        lp.positiveLoginScenario();
        lp.navigateToPointOfSalePage();
        Pos_Cards_Views cv = new  Pos_Cards_Views();
        cv.listBox.click();
        // clicking import button
        WebElement importButton = Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-sm btn-default o_button_import']"));
        importButton.click();
        // clicking load File button
        Driver.getDriver().findElement(By.xpath("//label[@class='btn btn-primary']")).click();
        // clicking cancel button
        Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-sm btn-default o_import_cancel']")).click();
        // clicking help link if you need
        // Driver.getDriver().findElement(By.xpath("//a[@class='pull-right']")).click();
    }
}
