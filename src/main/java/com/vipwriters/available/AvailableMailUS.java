package com.vipwriters.available;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AvailableMailUS extends WebDriverSettings {

    @Test
    public void mailUs () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/ul/li[8]/a")).click();
        TimeUnit.SECONDS.sleep(4);
        Select dropdown = new Select(driver.findElement(By.name("subject")));
        dropdown.selectByValue("other");
        driver.findElement(By.name("subjectOther")).sendKeys("Test");
        driver.findElement(By.name("messageText")).sendKeys("testtest");
        driver.findElement(By.cssSelector(".btn")).click();
    }

    @Test
    public void UnmailUsEmpty () throws Exception{

        WritersLogin();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div/ul/li[8]/a")).click();
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(By.cssSelector(".btn")).click();
        assertEquals("Please specify your subject", driver.findElement(By.cssSelector("div.col-md-3:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)")).getText());
        assertEquals("Please specify message", driver.findElement(By.cssSelector("div.has-error:nth-child(2) > span:nth-child(1)")).getText());
    }

}
