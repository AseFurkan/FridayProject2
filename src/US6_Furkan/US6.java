package US6_Furkan;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class US6 extends BaseDriver {

@Test
    public void Test1() {

    driver.get("https://demowebshop.tricentis.com/");
    MyFunction.Wait(2);

    WebElement loginbutton=driver.findElement(By.cssSelector("[class='ico-login']"));
    loginbutton.click();
    MyFunction.Wait(2);

    WebElement emailkutusu=driver.findElement(By.cssSelector("[class='email']"));
    emailkutusu.sendKeys("alper2344@gmail.com");
    MyFunction.Wait(2);

    WebElement sifrekutusu=driver.findElement(By.cssSelector("[class='password']"));
    sifrekutusu.sendKeys("Alper2344");
    MyFunction.Wait(2);

    WebElement loginbutton2=driver.findElement(By.cssSelector(" [class='button-1 login-button']"));
    loginbutton2.click();

    MyFunction.Wait(5);

    MyFunction.Wait(2);
    WebElement text1=driver.findElement(By.xpath("(//*[@href='/build-your-cheap-own-computer'])[4]"));
    String text1Str=text1.getText();

    WebElement urunEkleme=driver.findElement(By.xpath("(//*[@class='button-2 product-box-add-to-cart-button'])[3]"));
    urunEkleme.click();

    MyFunction.Wait(5);

    WebElement SepeteTikla=driver.findElement(By.xpath("(//*[@class='cart-label'])[1]"));
   SepeteTikla.click();


   WebElement text2=driver.findElement(By.linkText("Build your own cheap computer"));
    String text2Str=text2.getText();

    Assert.assertTrue("Yanlış ürün eklendi",text1Str.equals(text2Str));


    WebElement selectCountry=driver.findElement(By.id("CountryId"));
    Select secim=new Select(selectCountry);
    secim.selectByIndex(5);

    WebElement agreeButton=driver.findElement(By.id("termsofservice"));
    agreeButton.click();

    WebElement checkoutButton=driver.findElement(By.cssSelector("[class='button-1 checkout-button']"));
    checkoutButton.click();

    WebElement company=driver.findElement(By.id("BillingNewAddress_Company"));


    Actions actions = new Actions(driver);
    MyFunction.Wait(6);
    actions.click(company)
            .sendKeys("Team7").sendKeys(Keys.TAB)
            .sendKeys(Keys.ENTER).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER)
            .sendKeys(Keys.TAB).sendKeys(Keys.DOWN)
            .sendKeys(Keys.TAB).sendKeys("istanbul")
            .sendKeys(Keys.TAB).sendKeys("Ankara/Çankaya")
            .sendKeys(Keys.TAB).sendKeys("ankara/mamak")
            .sendKeys(Keys.TAB).sendKeys("7858")
            .sendKeys(Keys.TAB).sendKeys("02162121613")
            .sendKeys(Keys.TAB).sendKeys("02162121614")
        //    .sendKeys(Keys.TAB).sendKeys("0542542541")

            .build().perform();



WebElement cntn1=driver.findElement(By.cssSelector("[onclick='Billing.save()']"));

    cntn1.click();

    WebElement inStore=driver.findElement(By.id("PickUpInStore"));
    inStore.click();

    MyFunction.Wait(2);

    WebElement cntn=driver.findElement(By.cssSelector("[onclick='Shipping.save()']"));
    cntn.click();

    WebElement metinCard=driver.findElement(By.xpath("(//*[@for='paymentmethod_0'])[2]"));
    String card=metinCard.getText();


    WebElement cntn2=driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"));
    cntn2.click();

    WebElement metin2Card=driver.findElement(By.xpath("//*[text()='You will pay by COD']"));
    String card2=metinCard.getText();
    boolean cod=true;
if ((card2.contains("COD")&&card.contains("COD"))){
    cod=false;}


    Assert.assertTrue("Ödeme yöntemi doğrulanmadı",cod);

    MyFunction.Wait(2);
    WebElement cntn3=driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"));
    cntn3.click();

    WebElement subTotal=driver.findElement(By.xpath("(//*[@class='product-price'])[1]"));
    double a=Double.valueOf(subTotal.getText());

    WebElement sipfee=driver.findElement(By.xpath("(//*[@class='product-price'])[3]"));
    double b=Double.valueOf(sipfee.getText());

    WebElement sumtotal=driver.findElement(By.cssSelector("[class='product-price order-total'] strong"));
    double c=Double.valueOf(sumtotal.getText());

    Assert.assertTrue("Hatalı Sepet Tutarı", ((a+b)==c));

    MyFunction.Wait(2);
    WebElement cnfirm=driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"));
    cnfirm.click();

    MyFunction.Wait(2);
    WebElement success=driver.findElement(By.xpath("//*[text()='Your order has been successfully processed!']"));

    Assert.assertTrue("Sipariş verilemedi" , success.getText().contains("Your order has been successfully processed!"));


    BekleVeKapat();

}
}
