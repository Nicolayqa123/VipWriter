package com.vipwriters.available;

import com.vipwriters.WebDriverSettings;
import org.openqa.selenium.By;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class AvailableApplyForCase extends WebDriverSettings {


    public void ForCase () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        driver.findElementByCssSelector("tr.odd:nth-child(2) > td:nth-child(1) > a:nth-child(1)").click();
        TimeUnit.SECONDS.sleep(4);
        driver.findElementByName("price").sendKeys("150");
        driver.findElementByName("reason").sendKeys("testtesttesttest");
        TimeUnit.SECONDS.sleep(4);

        boolean present;
        try {
            driver.findElement(By.cssSelector("input.btn"));
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
      //  assertEquals("Apply", driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/div/div/div/div/div/form/div[4]/div/div/input")).getText());

    }
}
