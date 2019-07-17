package com.support;

import com.vipwriters.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class AssignAndNoAssignWriter extends WebDriverSettings {
    @Test
    public void ANA() throws Exception {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
      //  RegisteredStep3NewOrder();
        LoginSupport();
            TimeUnit.SECONDS.sleep(5);
        driver.get("https://support.urgentpapers.org/orders");
        driver.findElement(By.cssSelector("#main-container > div > div.row.orders-row > div.col-lg-12.order-top-blocks > div > div > form > div.col-md-12.block.orders-inputs-block > button")).click();
        jse.executeScript("scroll(0, 250);");
        TimeUnit.SECONDS.sleep(5);
        driver.findElementByCssSelector("#main-container > div > div:nth-child(2) > div > div > div > div:nth-child(2) > div > div > table > tbody > tr:nth-child(1) > td:nth-child(1)").click();
        driver.findElementByXPath("//*[@id=\"orders\"]/thead/tr/th[1]").click();
        String number = driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").getText();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").click();
            TimeUnit.SECONDS.sleep(5);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]/a").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Paid");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();
            TimeUnit.SECONDS.sleep(10);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/button").click();
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div[1]/div[1]/div/div/div[1]/ul/li[1]/a").click();
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)").sendKeys("Case published");
        driver.findElementByCssSelector("#stateChangeModal > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)").click();
            TimeUnit.SECONDS.sleep(5);
        WritersLogin();
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr/td[1]/a").click();
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[3]/div/textarea").sendKeys("test1");
        jse.executeScript("scroll(0, 250);");
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[4]/div/div/input").click();
            TimeUnit.SECONDS.sleep(5);
        WritersLoginNic();
        driver.findElementByXPath("//*[@id=\"availableOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr/td[1]/a").click();
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[3]/div/textarea").sendKeys("test2");
        jse.executeScript("scroll(0, 250);");
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[4]/div/div/input").click();
            TimeUnit.SECONDS.sleep(5);
        LoginSupport();
        driver.get("https://support.urgentpapers.org/orders");
        driver.findElementByXPath("//*[@id=\"orders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"main\"]/div[1]/div/div[1]/div[4]/div/div/button").click();
        driver.findElementByXPath("//*[@id=\"orders\"]/tbody/tr[1]/td[1]/a").click();
        driver.findElementByXPath("//*[@id=\"collapseFour\"]/div/div/table/tbody/tr[2]/td[3]/button").click();
        driver.switchTo().alert().accept();

        WritersLogin();
        driver.get("https://writer.urgentpapers.org/orders/my");
        driver.findElementByXPath("//*[@id=\"myOrders_filter\"]/label/input").sendKeys(number);
        driver.findElementByXPath("//*[@id=\"myOrders\"]/tbody/tr/td[1]/a").click();
        driver.findElementByXPath("/html/body/div[3]/div[1]/div[1]/div[1]/div/div[2]/a").click();
        driver.get("https://writer.urgentpapers.org/orders/my");
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"myOrders\"]/tbody/tr[1]/td[1]/a")).equals(number));

        WritersLoginNic();
        driver.get("https://writer.urgentpapers.org/orders/my");
        Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"myOrders\"]/tbody/tr/td")).equals(number));


    }
}
