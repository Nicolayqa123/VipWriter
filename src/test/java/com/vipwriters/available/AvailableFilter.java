package com.vipwriters.available;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AvailableFilter extends WebDriverSettings {

    @Test
    public void Filter () throws Exception{

        driver.get("https://writer.urgentpapers.org");

        WebElement login =  driver.findElement(By.xpath("/html/body/div/div/div/div[1]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement username =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[2]/input"));
        WebElement password =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[3]/input"));
        WebElement loginButton =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[4]/input"));

        TimeUnit.SECONDS.sleep(3);
        login.click();
        username.sendKeys("nicolayqa@gmail.com");
        password.sendKeys("nicolayqa");
        loginButton.click();
        TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//*[@id=\"availableOrders\"]/thead/tr/th[1]").click();
        assertEquals("10475", driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a")).getText());

        driver.findElementByXPath("//*[@id=\"availableOrders\"]/thead/tr/th[11]").click();
        driver.findElementByXPath("//*[@id=\"availableOrders\"]/thead/tr/th[11]").click();
        assertEquals("Applied", driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[11]/p")).getText());
    }

}
