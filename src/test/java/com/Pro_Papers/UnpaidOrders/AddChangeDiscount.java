package com.Pro_Papers.UnpaidOrders;

import com.vipwriters.WebDriverSettings;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AddChangeDiscount extends WebDriverSettings {

    public void changes() throws Exception {
        LoginPap();



        driver.findElement(previousOrders).click();
        driver.findElementByCssSelector("tr.ng-scope:nth-child(1) > td:nth-child(1) > a:nth-child(1)").click();
        driver.findElementByCssSelector(".btn-success").click();
        driver.findElementByCssSelector(".form-control").sendKeys("123456");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/div[2]/div/form/div/button").click();

        assertEquals("Discount not found", driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div[1]/div[2]/div[2]/div/form/div/p")).getText());


    }
}
