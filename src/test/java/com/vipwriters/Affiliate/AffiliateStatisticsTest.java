package com.vipwriters.Affiliate;

import com.PageWriter.Lending;
import com.vipwriters.WebDriverSettings;
import com.vipwriters.WebDriverSettingsChrome;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AffiliateStatisticsTest extends WebDriverSettings {



    Random r = new Random();
    int x = r.nextInt(1000) + 1;

    public String regmail = x + "test@test.com";
    public String regpass = "Password123";


    @Test
    public void Statistics() throws Exception {

        WritersLogin();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementByXPath("//*[@id=\"root\"]/div/div/div[1]/ul/li[8]/a").click();
            TimeUnit.SECONDS.sleep(5);
        int oldref = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[2]")).hashCode();

        RegisteredRefWriter();

        Lending.userName(driver).sendKeys(mail);
        Lending.password(driver).sendKeys(pass);
        Lending.loginButton(driver).click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//*[@id=\"root\"]/div/div/div[1]/ul/li[8]/a").click();
        TimeUnit.SECONDS.sleep(10);

        int newref = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[1]/table/tbody/tr[1]/td[2]")).hashCode();
assertTrue(oldref != newref);

    }

}
