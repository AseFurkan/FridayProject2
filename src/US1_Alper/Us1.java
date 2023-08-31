package US1_Alper;


import Utility.BaseDriver;

import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Us1  extends BaseDriver {


    @Test
    public void Test1() {

        driver.get("https://demowebshop.tricentis.com/");
        MyFunction.Wait(2);

        WebElement register = driver.findElement(By.xpath("//*[@href='/register']"));
        register.click();
        MyFunction.Wait(2);



        WebElement genderMale = driver.findElement(By.xpath("//input[@id='gender-male']"));
        genderMale.click();
        MyFunction.Wait(2);



        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Alper");
        MyFunction.Wait(2);


        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Aygun");
        MyFunction.Wait(2);


        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("alper2344@gmail.com");
        MyFunction.Wait(2);


        WebElement pasword = driver.findElement(By.xpath("//input[@id='Password']"));
        pasword.sendKeys("Alper2344");
        MyFunction.Wait(2);


        WebElement confirmPasword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPasword.sendKeys("Alper2344");
        MyFunction.Wait(2);


        WebElement registerBtn = driver.findElement(By.xpath("//input[@id='register-button']"));
        registerBtn.click();
        MyFunction.Wait(2);



        BekleVeKapat();

    }
}



