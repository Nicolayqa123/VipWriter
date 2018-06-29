package com.Pro_Papers;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ForgotPasswordTest extends WebDriverSettings {
    @Test
    public void forgotPassword1(){
        driver.get("https://commentality.com");


        WebElement forgotPassword = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[1]/div[3]/a"));
        WebElement mail = driver.findElement(By.xpath("//*[@id=\"reset-email\"]"));
        WebElement resetpassword = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[2]/div[3]/div/button"));

        driver.findElement(loginClient).click();
        forgotPassword.click();
        mail.sendKeys("test@test.ru");
        resetpassword.click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("We’ve sent you an email containing a link that will allow you to reset your password for the next 24 hours.", driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[3]/p[1]")).getText());

    }
    @Test
    public void forgotPasswordWrongmail(){
        driver.get("https://commentality.com");


        WebElement forgotPassword = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[1]/div[3]/a"));
        WebElement mail = driver.findElement(By.xpath("//*[@id=\"reset-email\"]"));
        WebElement resetpassword = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[2]/div[3]/div/button"));

        driver.findElement(loginClient).click();
        forgotPassword.click();
        mail.sendKeys("test@456.ru");
        resetpassword.click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("User not found.", driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[2]/div[3]")).getText());

    }
    @Test
    public void forgotPasswordNoValid(){
        driver.get("https://commentality.com");


        WebElement forgotPassword = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[1]/div[3]/a"));
        WebElement mail = driver.findElement(By.xpath("//*[@id=\"reset-email\"]"));
        WebElement resetpassword = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[2]/div[3]/div/button"));

        driver.findElement(loginClient).click();
        forgotPassword.click();
        mail.sendKeys("test@@..");
        resetpassword.click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("RESET PASSWORD", driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[2]/div[3]")).getText());

    }
}
