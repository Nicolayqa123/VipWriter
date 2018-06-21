package com.vipwriters.MyOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class MyOrdersDownloadFiles extends WebDriverSettings {
    @Test
    public void Download () throws Exception {
        WritersLogin();
        driver.findElementByXPath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/ul/li[2]/a").click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElementByXPath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/label/input").sendKeys("10015");
            TimeUnit.SECONDS.sleep(1);
        driver.findElementByXPath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/a").click();
            TimeUnit.SECONDS.sleep(5);
        driver.findElementByXPath("//*[@id=\"455\"]").click();


    }
}
