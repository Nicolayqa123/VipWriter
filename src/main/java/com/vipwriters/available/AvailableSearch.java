package com.vipwriters.available;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class AvailableSearch extends WebDriverSettings {
    @Test
    public void Search () throws Exception {
        WritersLogin();
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label").sendKeys("10223");
        assertEquals("10223", driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr/td[1]/a")).getText());
    }
}
