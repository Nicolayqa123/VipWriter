package com.vipwriters.Payments;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PaymentsFilter extends WebDriverSettings {
    @Test
    public void filter12 (){
        driver.get("https://writer.urgentpapers.org");

        WebElement login =  driver.findElement(By.xpath("/html/body/div/div/div/div[1]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement username =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[2]/input"));
        WebElement password =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[3]/input"));
        WebElement loginButton =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[4]/input"));

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.click();
        username.sendKeys(mail);
        password.sendKeys(pass);
        loginButton.click();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[5]/a").click();

    //    driver.findElementByXPath("//*[@id=\"availableOrders\"]/thead/tr/th[1]").click();
    //    assertEquals("10044", driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a")).getText());

        driver.findElementByXPath("//*[@id=\"paymentHistory\"]/thead/tr[2]/th[1]").click();
        driver.findElementByXPath("//*[@id=\"paymentHistory\"]/thead/tr[2]/th[1]").click();
    }
}
