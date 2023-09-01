package US7_Mustafa;

import US4_Adem.US4;
import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class US7 extends BaseDriver {
    @Test
    public void Test1() {
        US4 login = new US4();
        login.Test1();

        MyFunction.Wait(1);
        WebElement computers = driver.findElement(By.xpath("//*[@class='list'] /li[2]/a"));
        computers.click();

        MyFunction.Wait(1);
        WebElement desktops = driver.findElement(By.xpath("//*[@class='sub-category-grid']/div[1]"));
        desktops.click();

        MyFunction.Wait(1);
        WebElement cheapComputer = driver.findElement(By.linkText("Build your own cheap computer"));
        cheapComputer.click();

        MyFunction.Wait(1);
        WebElement addChart = driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']"));
        addChart.click();

        MyFunction.Wait(4);
        WebElement chart = driver.findElement(By.xpath("//li[@id='topcartlink']"));
        chart.click();

        MyFunction.Wait(1);
        WebElement varMi = driver.findElement(By.xpath("//*[@class='cart-item-row']"));
        Assert.assertTrue("Ürün sepette yok", varMi.getText().contains("Build your own cheap computer"));

        MyFunction.Wait(1);
        WebElement enterCouponCode = driver.findElement(By.name("discountcouponcode"));
        enterCouponCode.sendKeys("Kupon mevcut değil.");

        MyFunction.Wait(1);
        WebElement enterGiftCardCode = driver.findElement(By.name("giftcardcouponcode"));
        enterGiftCardCode.sendKeys("Hediye kartı mevcut değil.");

        MyFunction.Wait(1);
        WebElement readingTerms = driver.findElement(By.cssSelector("[name='termsofservice']"));
        readingTerms.click();

        MyFunction.Wait(1);
        WebElement checkout = driver.findElement(By.cssSelector("[name='checkout']"));
        checkout.click();

        MyFunction.Wait(1);
        List<WebElement> Continue = driver.findElements(By.xpath("//input[@type='button' and @value='Continue']"));
        for (WebElement e : Continue) {
            MyFunction.Wait(1);
            e.click();
        }

        MyFunction.Wait(1);
        WebElement Confirm = driver.findElement(By.xpath("//input[@value='Confirm']"));
        Confirm.click();

        MyFunction.Wait(1);
        WebElement done = driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));
        Assert.assertTrue("Siparişiniz tamamlanmadı", done.getText().contains("successfully"));

        BekleVeKapat();
    }

}
