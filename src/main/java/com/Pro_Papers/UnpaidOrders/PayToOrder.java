package com.Pro_Papers.UnpaidOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class PayToOrder extends WebDriverSettings {
    @Test
    public void orderPay () throws Exception {
        LoginPap();

        WebElement previousOrders = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[3]/a"));
        WebElement order10273 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/table/tbody/tr/td[1]/a"));

        previousOrders.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByCssSelector("tr.ng-scope:nth-child(1) > td:nth-child(1) > a:nth-child(1)").click();
        driver.findElementByXPath("//*[@id=\"collapseThree\"]/div/div/button").click();


    }
}
