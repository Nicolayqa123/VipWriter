package com.vipwriters.available;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class AvailableDownloadFiles extends WebDriverSettings {
@Test
    public void download () throws Exception {
        WritersLogin();
        TimeUnit.SECONDS.sleep(12);
        driver.findElementByCssSelector("tr.odd:nth-child(27) > td:nth-child(1) > a:nth-child(1)").click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElementById("68").click();


    }
}
