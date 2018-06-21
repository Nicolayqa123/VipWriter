package com.vipwriters.MyOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MyOrderPageSwitching extends WebDriverSettings {
    @Test
    public void Pageswitch() throws Exception {
        WritersLogin();
        driver.findElementByXPath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/ul/li[2]/a").click();
        TimeUnit.SECONDS.sleep(3);
        Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/div/div[1]/div[1]/label/select")));
        dropdown.selectByValue("10");
        driver.findElementByXPath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/div/div[4]/ul/li[3]/a").click();
        assertEquals("Showing 1 to 20 of 29 entries", driver.findElement(By.id("availableOrders_info")).getText());
    }
}