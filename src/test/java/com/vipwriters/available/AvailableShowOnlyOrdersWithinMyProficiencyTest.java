package com.vipwriters.available;


import com.PageWriter.AvailableOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AvailableShowOnlyOrdersWithinMyProficiencyTest extends WebDriverSettings {

    @Test
    public void OrderWithMy () throws Exception {

        WritersLogin();
        AvailableOrders.showOnlyMy(driver).click();
        assertEquals("10044", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[1]/a")).getText());

    }
}
