package com.Pro_Papers.PreviousOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.assertEquals;

public class FilterTest extends WebDriverSettings {
    @Test
    public void Filter1 () throws Exception {
        LoginPap();

        driver.findElement(previousOrders).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -350);");
        String order1 = driver.findElementByCssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)").getText();
        jse.executeScript("scroll(0, 500);");
        String order2 = driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/table/tbody/tr[30]/td[1]").getText();

        driver.findElementByCssSelector("th.case").click();
        assertEquals(order2, driver.findElementByCssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)").getText());
        driver.findElementByCssSelector("th.case").click();
        assertEquals(order1, driver.findElementByCssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)").getText());
    }
}
