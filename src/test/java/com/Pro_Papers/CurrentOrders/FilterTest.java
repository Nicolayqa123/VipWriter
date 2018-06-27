package com.Pro_Papers.CurrentOrders;

import com.vipwriters.WebDriverSettings;;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.assertEquals;

public class FilterTest extends WebDriverSettings {

    @Test
    public void Filter1 () throws Exception {
        LoginPap();

        String order1 = driver.findElementByCssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)").getText();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        String order2 = driver.findElementByCssSelector(".table > tbody:nth-child(2) > tr:nth-child(51) > td:nth-child(1) > a:nth-child(1)").getText();
        assertEquals(order1, driver.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)")).getText());
        driver.findElementByCssSelector("th.case").click();
        assertEquals(order2, driver.findElement(By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)")).getText());
    }
}
