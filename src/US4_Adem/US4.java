package US4_Adem;


import Utility.MyFunction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.BaseDriver.BekleVeKapat;
import static Utility.BaseDriver.driver;

public class US4{



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
        MyFunction.Wait(2);


        BekleVeKapat();

    }
}
