package com.Pro_Papers.CurrentOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.assertEquals;

public class DetailedOrderViewTest extends WebDriverSettings {
    @Test
    public void DetaileOrder () throws Exception {
        LoginPap();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElement(currentOrdersOrder10292).click();

        assertEquals("Deadline:", driver.findElement(By.cssSelector(".dedline")).getText());
    }
}
