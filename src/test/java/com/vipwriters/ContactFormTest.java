package com.vipwriters;

import com.PageWriter.ContacteUs;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ContactFormTest extends WebDriverSettings {

    @Test
    public void ContactForm1 () throws InterruptedException  {

        driver.get("https://writer.urgentpapers.org/contacts");
        TimeUnit.SECONDS.sleep(4);

        ContacteUs.subjectOther(driver).sendKeys("Test1");
        ContacteUs.senderEmail(driver).sendKeys("12as23da@gmail.com");
        ContacteUs.name(driver).sendKeys("Nico1");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 900);");
        ContacteUs.phone(driver).sendKeys("0504578965");
        ContacteUs.messageText(driver).sendKeys("Testeeeeeeeee");
        ContacteUs.send(driver).click();
        TimeUnit.SECONDS.sleep(4);
        assertEquals("Message sucessfully sent", driver.findElement(By.id("success-sent-message")).getText());

    }

    @Test
    public void ContactFormMin () throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/contacts");
        ContacteUs.subjectOther(driver).sendKeys("1");
        ContacteUs.senderEmail(driver).sendKeys("a@g.com");
        ContacteUs.name(driver).sendKeys("1");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 900);");
        ContacteUs.phone(driver).sendKeys("5");
        ContacteUs.messageText(driver).sendKeys("e");
        ContacteUs.send(driver).click();
        TimeUnit.SECONDS.sleep(2);
        assertEquals("Message sucessfully sent", driver.findElement(By.id("success-sent-message")).getText());

  }

    @Test
    public void ContactFormMax () throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/contacts");
        ContacteUs.subjectOther(driver).sendKeys("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        ContacteUs.senderEmail(driver).sendKeys("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234@ya.ru");
        ContacteUs.name(driver).sendKeys("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 900);");
        ContacteUs.phone(driver).sendKeys("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        ContacteUs.messageText(driver).sendKeys("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        ContacteUs.send(driver).click();
        TimeUnit.SECONDS.sleep(2);
        assertEquals("Message sucessfully sent", driver.findElement(By.id("success-sent-message")).getText());


          }
    @Test
    public void ContactFormRequiredField () throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/contacts");
        ContacteUs.subjectOther(driver).sendKeys("Test1");
        ContacteUs.senderEmail(driver).sendKeys("12as23da@gmail.com");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 900);");
        ContacteUs.messageText(driver).sendKeys("Testeeeeeeeee");
        ContacteUs.send(driver).click();
        TimeUnit.SECONDS.sleep(4);
        assertEquals("Message sucessfully sent", driver.findElement(By.id("success-sent-message")).getText());
    }
    @Test
    public void UnContactFormEmptyFields() throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/contacts");
        ContacteUs.subjectOther(driver).sendKeys("");
        ContacteUs.senderEmail(driver).sendKeys("");
        ContacteUs.name(driver).sendKeys("");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 900);");
        ContacteUs.phone(driver).sendKeys("");
        ContacteUs.messageText(driver).sendKeys("");
        ContacteUs.send(driver).click();


        assertEquals("Please specify your subject", driver.findElement(By.id("subjectOtherError")).getText());
        assertEquals("Please specify valid email address", driver.findElement(By.id("senderEmailError")).getText());
        assertEquals("Please enter a message", driver.findElement(By.id("messageTextError")).getText());

    }
    }



