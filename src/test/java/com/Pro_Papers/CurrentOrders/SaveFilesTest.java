package com.Pro_Papers.CurrentOrders;

import com.PageClient.DetailedOrder;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SaveFilesTest extends WebDriverSettings {
    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    @Test
    public void sf() throws Exception {
        LoginPap();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElement(currentOrdersOrder10292).click();
        jse.executeScript("scroll(0, 950);");
        TimeUnit.SECONDS.sleep(7);
        DetailedOrder.addNewFile(driver).click();
        setClipboardData("C:\\Test.docx");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        TimeUnit.SECONDS.sleep(2);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        TimeUnit.SECONDS.sleep(2);
        jse.executeScript("scroll(0, 1050);");
        driver.findElement(aNFUpload).click();
        TimeUnit.SECONDS.sleep(10);
        assertEquals(" Test.docx", driver.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/div[2]/div/div/div[2]/a/button")).getText());
    }
}
