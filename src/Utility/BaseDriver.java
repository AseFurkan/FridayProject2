package Utility;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver; //Singleton web driver
    public static WebDriverWait wait;

    static {   // public static driverBaslat() // bunun şartı extens olması ve basta yer alması
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //    driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }

    public void Login() {

        driver.get("https://demowebshop.tricentis.com/");
        MyFunction.Wait(2);

        WebElement loginbutton = driver.findElement(By.cssSelector("[class='ico-login']"));
        loginbutton.click();


        WebElement emailkutusu = driver.findElement(By.cssSelector("[class='email']"));
        emailkutusu.sendKeys("alper2344@gmail.com");


        WebElement sifrekutusu = driver.findElement(By.cssSelector("[class='password']"));
        sifrekutusu.sendKeys("Alper2344");
        MyFunction.Wait(2);

        WebElement loginbutton2 = driver.findElement(By.cssSelector(" [class='button-1 login-button']"));
        loginbutton2.click();


    }

    public static void BekleVeKapat() {
        MyFunction.Wait(3);
        driver.quit();
    }
}
