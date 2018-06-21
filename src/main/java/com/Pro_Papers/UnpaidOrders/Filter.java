package com.Pro_Papers.UnpaidOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Filter extends WebDriverSettings {
    @Test
    public void Filter1 () throws Exception {
        LoginPap();

        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[2]/a").click();
        String order1 = driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/table/tbody/tr[1]/td[1]").getText();
        String order2 = driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/table/tbody/tr[42]/td[1]").getText();


        driver.findElementByCssSelector("th.case").click();
        assertEquals(order2, driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/table/tbody/tr[1]/td[1]/a")).getText());
        driver.findElementByCssSelector("th.case").click();
        assertEquals(order1, driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/table/tbody/tr[1]/td[1]/a")).getText());
    }
}
