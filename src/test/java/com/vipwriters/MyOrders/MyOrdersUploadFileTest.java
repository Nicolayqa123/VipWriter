package com.vipwriters.MyOrders;

import com.PageWriter.DetailedOrder;
import com.PageWriter.MyOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MyOrdersUploadFileTest extends WebDriverSettings {

    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }


    @Test
    public void dropfiles1() throws Exception {
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        WritersLogin();
        TimeUnit.SECONDS.sleep(1);
        MyOrders.myOrders(driver).click();
        MyOrders.OrderInProgress(driver).click();
        DetailedOrder.uploadFile(driver).click();
        DetailedOrder.fileRecipientClient(driver).click();
        DetailedOrder.fileTypeAditiMater(driver).click();
        jse.executeScript("scroll(0, 850);");
        TimeUnit.SECONDS.sleep(1);
        DetailedOrder.drop(driver).sendKeys("C:\\Users\\Administrator\\Desktop\\Test.docx");
        TestFileDrop();
        jse.executeScript("scroll(0, 550);");
        TimeUnit.SECONDS.sleep(1);
        DetailedOrder.confirm(driver).click();
        TimeUnit.SECONDS.sleep(2);
      //  driver.findElementById("2261").click();
     //   driver.findElementByXPath("/html/body/div[2]/div/div[3]/button[1]").click();
        jse.executeScript("scroll(0, 850);");
        assertEquals("The file was successfully uploaded.", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }



}