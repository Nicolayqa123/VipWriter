package com.Pro_Papers.UnpaidOrders;

import com.vipwriters.WebDriverSettingsChrome;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SendMessageInOrder extends WebDriverSettingsChrome {

    public void DetaileOrderPap () {
        LoginPap();

        WebElement previousOrders = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[3]/a"));
        WebElement order10273 = driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/table/tbody/tr/td[1]/a"));

        previousOrders.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByCssSelector("tr.ng-scope:nth-child(1) > td:nth-child(1) > a:nth-child(1)").click();

    }


    @Test
    public void SendMessageInOrder1 () {

        DetaileOrderPap();
        driver.findElementByXPath("/html/body/div[1]/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/button").click();
        driver.findElementByCssSelector(".col-md-12").sendKeys("Test");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[1]/a/span").click();
    }
    @Test
    public void SendMessageInOrderMax () {
        DetaileOrderPap();
        driver.findElementByXPath("/html/body/div[1]/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/button").click();
        driver.findElementByCssSelector(".col-md-12").sendKeys("TestTestT estTes tTestTest TestTes tTestTestT estTestTestTestTestTestTestTestTestTestTestTestTestTestTestTestTest" +
                "TestTestTestTestTestTestTestTestT estTestTestTestTestTestTestTestTestTestTe stTestTestTestT estTestTestTestTe stTestTestTestTestTestTestTestTest" +
                "TestTestTestTestTest TestTestTestTes tTestTestTestTe stTestTes tTestTestTe stTestTestTestTes tTestTestTestTes tTestTestTestTest" +
                "TestTestTest TestTestT estTestTestT estTestTes tTestTestTestTestT estT estTes tTestTestTestTe stTestTestTestTestTestTestTestTestTestTestTestTestTest" +
                "TestTestTestTestTes tTestTestTestTe stTestTestTest TestTestTestTestT estTest TestTestTestTestTe tTestTestTestTestTestTestTestTestTestTest");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[1]/a/span").click();
    }
    @Test
    public void SendMessageInOrderMin () {
        DetaileOrderPap();
        driver.findElementByXPath("/html/body/div[1]/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/button").click();
        driver.findElementByCssSelector(".col-md-12").sendKeys("1");
        driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[1]/a/span").click();
    }
}
