package com.vipwriters;

import com.PageWriter.MailUs;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class MailUSFormTest extends WebDriverSettings {

    @Test
    public void mailUs () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        MailUs.mailUs(driver).click();
        MailUs.subjectQuestion(driver).click();
        MailUs.message(driver).sendKeys("test text mail US");
        MailUs.sendMessage(driver).click();
        assertEquals("Message sucessfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }
    @Test
    public void mailUsmin () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        MailUs.mailUs(driver).click();
        MailUs.subjectQuestion(driver).click();
        MailUs.message(driver).sendKeys("t");
        MailUs.sendMessage(driver).click();
        assertEquals("Form is not valid!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }
    @Test
    public void mailUsmax () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        MailUs.mailUs(driver).click();
        MailUs.subjectQuestion(driver).click();
        MailUs.message(driver).sendKeys("test test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeesttest test test teeeeeeeest");
        MailUs.sendMessage(driver).click();
        assertEquals("Message sucessfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }
    @Test
    public void mailUsEmptySubject () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        MailUs.mailUs(driver).click();
        MailUs.message(driver).sendKeys("trdf hfd ghfyg ");
        MailUs.sendMessage(driver).click();
        assertEquals("Form is not valid!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }
    @Test
    public void mailUsOther () throws Exception{

        WritersLogin();
        TimeUnit.SECONDS.sleep(8);
        MailUs.mailUs(driver).click();
        MailUs.subjectOther(driver).click();
        MailUs.customSubject(driver).sendKeys("asda asd asd");
        MailUs.message(driver).sendKeys("test text mail US");
        MailUs.sendMessage(driver).click();
        assertEquals("Message sucessfully sent!", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());

    }
}
