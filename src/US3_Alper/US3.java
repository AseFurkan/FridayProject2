package US3_Alper;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US3 extends BaseDriver {


    @Test
    public void Test2() {


        driver.get("https://demowebshop.tricentis.com/");
        MyFunction.Wait(2);


        WebElement login = driver.findElement(By.xpath("//*[@href='/login']"));
        login.click();
        MyFunction.Wait(2);


        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.sendKeys("alper2344@gmail.com");
        MyFunction.Wait(2);


        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Alper2344");
        MyFunction.Wait(2);


        WebElement btnClick = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        btnClick.click();
        MyFunction.Wait(2);


        WebElement logOut = driver.findElement(By.xpath("//*[@href='/logout']"));
        logOut.click();
        MyFunction.Wait(2);

        BekleVeKapat();


    }
}
