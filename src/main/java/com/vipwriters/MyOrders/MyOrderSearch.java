package com.vipwriters.MyOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MyOrderSearch extends WebDriverSettings {

    @Test
    public void search () throws Exception {
        driver.get("https://writer.urgentpapers.org");

        WritersLogin();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]").click();
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[2]").click();
        driver.findElementByXPath("//*[@id=\"myOrders_filter\"]/label").sendKeys("10032");
        assertEquals("10032", driver.findElement(By.xpath("//*[@id=\"myOrders\"]/tbody/tr/td[1]/a")).getText());

    }
}
