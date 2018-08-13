package com.vipwriters.available;

import com.PageWriter.AvailableOrders;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class AvailableDetailedOrderViewTest extends WebDriverSettings {



    @Test
    public void orderView() throws Exception {

        WritersLogin();
        AvailableOrders.searchOrder(driver).sendKeys("10004");
        AvailableOrders.order10004(driver).click();
        assertEquals("Case published", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/h2/span")).getText());
    }
}

