package com.Pro_Papers.CurrentOrders;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class SendMessageInOrder extends WebDriverSettings {


    @Test
    public void SendMessageInOrder1 () throws Exception {

        DetaileOrderPap();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(addNewMessage).click();
        driver.findElement(aNMWriter).click();
        driver.findElement(aNMText).sendKeys("test");
        driver.findElement(aNMSendMessage).click();

    }
    @Test
    public void SendMessageInOrderMax () throws Exception {
        DetaileOrderPap();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(addNewMessage).click();
        driver.findElement(aNMWriter).click();
        driver.findElement(aNMText).sendKeys("TestTestT estTes tTestTest TestTes tTestTestT estTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTest\" +\n" +
                "                \"TestTestTestTestTestTestTestTestT estTestTestTestTestTestTestTestTestTestTe stTestTestTestT estTestTestTestTe stTestTestTestTestTestTestTestTest\" +\n" +
                "                \"TestTestTestTestTest TestTestTestTes tTestTestTestTe stTestTes tTestTestTe stTestTestTestTes tTestTestTestTes tTestTestTestTest\" +\n" +
                "                \"TestTestTest TestTestT estTestTestT estTestTes tTestTestTestTestT estT estTes tTestTestTestTe stTestTestTestTestTestTestTestTestTestTestTestTestTest\" +\n" +
                "                \"TestTestTestTestTes tTestTestTestTe stTestTestTest TestTestTestTestT estTest TestTestTestTestTe tTestTestTestTestTestTestTestTestTestTest");
        driver.findElement(aNMSendMessage).click();

    }
    @Test
    public void SendMessageInOrderMin () throws Exception {
        DetaileOrderPap();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(addNewMessage).click();
        driver.findElement(aNMWriter).click();
        driver.findElement(aNMText).sendKeys("1");
        driver.findElement(aNMSendMessage).click();

    }
}
