package com.vipwriters.available;

import com.vipwriters.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AvailablePageSwitching extends WebDriverSettings {
    @Test
    public  void pageSwitch () throws Exception{
       WritersLogin();
       TimeUnit.SECONDS.sleep(6);
        Select dropdown = new Select(driver.findElement(By.name("availableOrders_length")));
        dropdown.selectByValue("10");
        String order1 = driver.findElementByXPath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[1]/a").getText();
        driver.findElementByCssSelector(".pagination > li:nth-child(3) > a:nth-child(1)").click();

        Assert.assertFalse(driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/div[2]/table/tbody/tr[1]/td[1]/a")).equals(order1));
    }
}
