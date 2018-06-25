package com.vipwriters.MyOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MyOrderDetailedOrderView extends WebDriverSettings {
    @Test
    public void orderView () throws Exception {

        WritersLogin();
        driver.findElementByXPath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/ul/li[2]/a").click();
            TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr[1]/td[1]/a").click();
        assertEquals("Messages", driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]")).getText());
    }
}
