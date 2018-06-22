package com.vipwriters.Applied;

import com.vipwriters.WebDriverSettings;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AppliedDetailedOrderView extends WebDriverSettings {

    public void order () throws Exception {

        WritersLogin();
            TimeUnit.SECONDS.sleep(8);
        driver.findElementByXPath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a").click();
            TimeUnit.SECONDS.sleep(5);
        assertEquals("Inquiry applied", driver.findElement(By.xpath("//*[@id=\"order-info\"]/header/span")).getText());

    }
}
