package com.Pro_Papers.PreviousOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class SaveFiles extends WebDriverSettings {


    @Test
    public void sf() throws Exception {
        LoginPap();

        driver.findElement(previousOrders).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, -350);");
        driver.findElement(order10272).click();
        jse.executeScript("scroll(0, 350);");
        TimeUnit.SECONDS.sleep(7);
        driver.findElement(addNewFile).click();
        TestFileDrop();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(aNFUpload).click();
    }
}
