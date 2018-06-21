package com.vipwriters.Applied;

import com.vipwriters.WebDriverSettings;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class AppliedFilter extends WebDriverSettings {

    public void Filter () throws Exception {
        driver.get("https://writer.urgentpapers.org");

        WritersLogin();
        driver.findElementByXPath("/html/body/div[2]/div/div/ul/li[3]/a").click();
        driver.findElementByXPath("//*[@id=\"availableOrders\"]/thead/tr/th[1]").click();
        assertEquals("10044", driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a")).getText());

        driver.findElementByXPath("//*[@id=\"availableOrders\"]/thead/tr/th[11]").click();
        driver.findElementByXPath("//*[@id=\"availableOrders\"]/thead/tr/th[11]").click();
        assertEquals("Applied", driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[11]/p")).getText());
    }



    }

