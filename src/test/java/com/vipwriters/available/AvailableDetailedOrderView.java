package com.vipwriters.available;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AvailableDetailedOrderView extends WebDriverSettings {



    @Test
    public void orderView() throws Exception {

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        driver.findElementByCssSelector("tr.odd:nth-child(2) > td:nth-child(1) > a:nth-child(1)").click();
        TimeUnit.SECONDS.sleep(5);
        String condition = driver.findElementByXPath("//*[@id=\"order-info\"]/header/span").getText();
        assertEquals(condition, driver.findElement(By.xpath("//*[@id=\"order-info\"]/header/span")).getText());
    }
}

