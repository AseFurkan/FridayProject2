package US5_Burcu;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class US5 extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Bekle(2);

        WebElement register = driver.findElement(By.xpath("//*[@href='/register']"));
        register.click();
        MyFunc.Bekle(2);


        WebElement genderMale = driver.findElement(By.xpath("//input[@id='gender-male']"));
        genderMale.click();
        MyFunc.Bekle(2);


        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Alper");
        MyFunc.Bekle(2);

        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Aygun");
        MyFunc.Bekle(2);

        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("");
        MyFunc.Bekle(2);

        WebElement pasword = driver.findElement(By.xpath("//input[@id='Password']"));
        pasword.sendKeys("");
        MyFunc.Bekle(2);

        WebElement confirmPasword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPasword.sendKeys("");
        MyFunc.Bekle(2);

        WebElement registerBtn = driver.findElement(By.xpath("//input[@id='register-button']"));
        registerBtn.click();
        MyFunc.Bekle(2);

        WebElement epostaRecuidded = driver.findElement(By.xpath("//span[@for='Email']"));
        epostaRecuidded.getText();
        MyFunc.Bekle(2);

        WebElement passwordError = driver.findElement(By.xpath("//span[@for='Password']"));
        passwordError.getText();
        MyFunc.Bekle(2);

        WebElement rePasswordError = driver.findElement(By.xpath("//span[@for='ConfirmPassword']"));
        rePasswordError.getText();
        MyFunc.Bekle(1);

        Assert.assertTrue("EPOSTA HATA MESAJI=", epostaRecuidded.getText().contains("Email"));
        System.out.println("EPOSTA HATA MESAJı=" + epostaRecuidded.getText());
        Assert.assertTrue("PASSWORD HATA MESAJI=", passwordError.getText().contains("Password"));
        System.out.println("PASSWORD HATA MESAJI = " + passwordError.getText());
        Assert.assertTrue("CONFİRMPASSWORD HATA MESAJI=", rePasswordError.getText().contains("required"));
        System.out.println("CONFİRMPASSWORD HATA MESAJI= " + rePasswordError.getText());


        BekleVeKapat();


    }


}


