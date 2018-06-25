package com.Pro_Papers.CurrentOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SaveFiles extends WebDriverSettings {


    @Test
    public void sf() throws Exception {
        LoginPap();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElement(currentOrdersOrder10292).click();
        jse.executeScript("scroll(0, 350);");
        TimeUnit.SECONDS.sleep(7);
        driver.findElement(addNewFile).click();
        TestFileDrop();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(aNFUpload).click();
        TimeUnit.SECONDS.sleep(10);
        assertEquals(" Test.docx", driver.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[2]/div/div/div[2]/a/button")).getText());
    }
}
