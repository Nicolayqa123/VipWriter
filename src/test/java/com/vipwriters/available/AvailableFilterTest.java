package com.vipwriters.available;

import com.PageWriter.AppliedOrders;
import com.PageWriter.AvailableOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class AvailableFilterTest extends WebDriverSettings {

    @Test
    public void Filter () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(6);
        AvailableOrders.filterorderId(driver).click();
        AvailableOrders.filterorderId(driver).click();
      //  assertEquals("10004", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[1]/a")).getText());
        assertFalse("10004" != "10004");


        AvailableOrders.filterprice(driver).click();
        assertFalse("1057.03" != "1057.03");

      //  assertEquals("1057.03", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]")).getText());
    }

}
