package com.vipwriters;

import com.PageWriter.Lending;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ForgotPassword extends WebDriverSettings {


    public void forgotpassword() throws Exception{

        driver.get("https://writer.urgentpapers.org");

        Lending.loginButton(driver).click();

        assertEquals("", driver.findElement(By.cssSelector("#loginForm > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")).getText());
    }


    public void ForgotPasswordNoValid() throws Exception{

        driver.get("https://client.urgentpapers.org/");

        driver.findElement(loginClient).click();
        driver.findElement(resetPasswordClient).click();
            TimeUnit.SECONDS.sleep(3);
        driver.findElement(resetPasswordCMail).sendKeys("Test@test.com");
        driver.findElement(resetPasswordCSend).click();
            TimeUnit.SECONDS.sleep(3);
        assertEquals("The email address is invalid", driver.findElement(By.xpath("//*[@id=\"sendResetPasswordEmailForm\"]/div[2]/p")).getText());
    }

    public void ForgotPasswordEmptyFields()throws Exception {

        driver.get("https://client.urgentpapers.org/");
            TimeUnit.SECONDS.sleep(5);
        WebElement login =  driver.findElement(By.xpath("/html/body/div/div/div/div[1]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement forgotbutton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[5]/a"));
        login.click();
        forgotbutton.click();
            TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.xpath("//*[@id=\"sendResetPasswordEmail\"]")).click();
            TimeUnit.SECONDS.sleep(3);
        assertEquals("The user's email is required", driver.findElement(By.xpath("//*[@id=\"sendResetPasswordEmailForm\"]/div[2]/p")).getText());
    }



}
