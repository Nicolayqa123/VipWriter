package com.vipwriters.available;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AvailableShowEntries extends WebDriverSettings {
    @Test
    public void ShowEnt () {

        driver.get("https://writer.urgentpapers.org");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input"));

        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.click();
        username.sendKeys("nicolayqa@gmail.com");
        password.sendKeys("nicolayqa");
        loginButton.click();
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"availableOrders_length\"]/label/select").click();
        driver.findElementByXPath("//*[@id=\"availableOrders_length\"]/label/select/option[1]").click();
      //  assertEquals("10223", driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr/td[1]/a")).getText());

    }
}
