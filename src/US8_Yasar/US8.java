package US8_Yasar;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US8 extends BaseDriver {

    @Test
    public void test(){
        Login();


        WebElement mailAdress= driver.findElement(By.xpath("(//a[@href='/customer/info' and @class='account'])[1]"));
        mailAdress.click();
        MyFunction.Wait(2);
        WebElement orders=driver.findElement(By.cssSelector("[href='/customer/orders'][class='inactive']"));
        orders.click();
        MyFunction.Wait(2);
        WebElement details=driver.findElement(By.cssSelector("[class='button-2 order-details-button']"));
        details.click();
        MyFunction.Wait(2);
        WebElement pdf=driver.findElement(By.cssSelector("[class='button-2 pdf-order-button']"));
        Assert.assertTrue("İndirme başarısız",pdf.isDisplayed());

        BekleVeKapat();
    }
}
