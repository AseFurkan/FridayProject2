package US2_Burcu;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US2 extends BaseDriver {


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
        email.sendKeys("alper2344@gmail.com");
        MyFunc.Bekle(2);

        WebElement pasword = driver.findElement(By.xpath("//input[@id='Password']"));
        pasword.sendKeys("Alper2344");
        MyFunc.Bekle(2);

        WebElement confirmPasword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPasword.sendKeys("Alper2344");
        MyFunc.Bekle(2);

        WebElement registerBtn = driver.findElement(By.xpath("//input[@id='register-button']"));
        registerBtn.click();
        MyFunc.Bekle(2);

        WebElement errorMesage = driver.findElement(By.xpath("//*[@class='validation-summary-errors']"));
        System.out.println(errorMesage.getText());
        MyFunc.Bekle(2);

        Assert.assertTrue("Hata mesajı görüntülendi",errorMesage.getText().contains("already"));






       BekleVeKapat();


    }
}
