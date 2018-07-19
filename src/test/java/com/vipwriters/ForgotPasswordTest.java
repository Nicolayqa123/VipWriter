package com.vipwriters;

import com.PageWriter.Lending;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ForgotPasswordTest extends WebDriverSettings {

@Test
    public void forgotpassword() throws Exception{

        driver.get("https://writer.urgentpapers.org");
    TimeUnit.SECONDS.sleep(3);
        Lending.loginForm(driver).click();
        Lending.forgotPassword(driver).click();
        Lending.forgotPasswordMail(driver).sendKeys(mail);
        Lending.forgotPasswordSend(driver).click();

        assertEquals("The password reset link was sent to you via email. Please navigate it to change your password.\n" +
                "If the email does not arrive, please contact support administrator.", driver.findElement(By.xpath("//*[@id=\"sendResetPasswordEmailForm\"]/p")).getText());
    }

@Test
    public void ForgotPasswordNoValid() throws Exception{

        driver.get("https://writer.urgentpapers.org");
        TimeUnit.SECONDS.sleep(3);
        Lending.loginForm(driver).click();
        Lending.forgotPassword(driver).click();
        Lending.forgotPasswordMail(driver).sendKeys("test@@..com");
        Lending.forgotPasswordSend(driver).click();

        assertEquals("Enter valid email.", driver.findElement(By.xpath("//*[@id=\"sendResetPasswordEmailForm\"]/div[2]/div[1]/p")).getText());
    }
@Test
    public void ForgotPasswordEmptyFields()throws Exception {

        driver.get("https://writer.urgentpapers.org");
        TimeUnit.SECONDS.sleep(3);
        Lending.loginForm(driver).click();
        Lending.forgotPassword(driver).click();
        Lending.forgotPasswordMail(driver).sendKeys("");
        Lending.forgotPasswordSend(driver).click();
        assertEquals("Email cannot be empty.", driver.findElement(By.xpath("//*[@id=\"sendResetPasswordEmailForm\"]/div[2]/div[1]/p")).getText());
    }



}
