package com.vipwriters.Payments;

import com.PageWriter.Transactions;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PaymentsReason extends WebDriverSettings {
    @Test
    public void reaso () throws Exception {
       // WritersLogin();
        WritersLogin();
        TimeUnit.SECONDS.sleep(3);
        Transactions.transactions(driver).click();
        TimeUnit.SECONDS.sleep(3);
        Transactions.reasonEarn(driver).click();
        TimeUnit.SECONDS.sleep(3);
        assertEquals("Cancell", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[3]")).getText());

        Transactions.reasonCancell(driver).click();
        assertEquals("Bonus", driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[3]")).getText());



    }
}
