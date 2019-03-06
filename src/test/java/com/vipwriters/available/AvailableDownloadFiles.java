package com.vipwriters.available;

import com.PageWriter.AvailableOrders;
import com.PageWriter.DetailedOrder;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class AvailableDownloadFiles extends WebDriverSettings {
@Test
    public void download () throws Exception {
        WritersLogin();
        TimeUnit.SECONDS.sleep(4);
      //  AvailableOrders.searchOrder(driver).sendKeys("10004");
    AvailableOrders.orderAvailable(driver).click();
//    DetailedOrder.downloadFile(driver).click();
    TimeUnit.SECONDS.sleep(4);
    String text =  driver.findElementByXPath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div/div[3]/div[1]").getCssValue("1231");
    System.out.println(text);
    // driver.findElementById("2193").click();

    }
}
