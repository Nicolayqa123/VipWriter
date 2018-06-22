package com.vipwriters.Applied;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class AppliedDownloadFiles extends WebDriverSettings {
@Test
    public void download () throws Exception {
    WritersLogin();

            TimeUnit.SECONDS.sleep(12);
        driver.findElementByXPath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/ul/li[3]/a").click();
            TimeUnit.SECONDS.sleep(5);
        driver.findElementByXPath("/html/body/div[1]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr/td[1]/a").click();
            TimeUnit.SECONDS.sleep(5);
        driver.findElementByXPath("//*[@id=\"1973\"]").click();
    }
    }

