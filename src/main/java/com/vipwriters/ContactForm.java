package com.vipwriters;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ContactForm extends WebDriverSettings {

    @Test
    public void ContactForm1 () throws InterruptedException  {

        driver.get("https://writer.urgentpapers.org/contacts");
        TimeUnit.SECONDS.sleep(4);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 600);");
        WebElement subject =  driver.findElement(By.name("subjectOther"));
        WebElement email =  driver.findElement(By.name("senderEmail"));
        WebElement name =  driver.findElement(By.name("senderName"));
        WebElement phone =  driver.findElement(By.name("senderPhone"));
        WebElement message =  driver.findElement(By.name("messageText"));
        WebElement send =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div/div/form/div[6]/input"));
        driver.manage().window().maximize();
        subject.click();
        subject.sendKeys("Test1");
        email.sendKeys("12as23da@gmail.com");
        name.sendKeys("Nico1");
        phone.sendKeys("0504578965");
        message.sendKeys("Testeeeeeeeee");
        TimeUnit.SECONDS.sleep(3);

        driver.findElement(By.xpath("//*[@id=\"contactUsForm\"]/div[6]/input")).click();
        send.click();
        TimeUnit.SECONDS.sleep(4);
assertEquals("Message sucessfully sent", driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/div/div/form/div[6]/span")).getText());
    }

    @Test
    public void ContactFormMin () throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/contacts");
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 600);");
        WebElement subject =  driver.findElement(By.name("subjectOther"));
        WebElement email =  driver.findElement(By.name("senderEmail"));
        WebElement name =  driver.findElement(By.name("senderName"));
        WebElement phone =  driver.findElement(By.name("senderPhone"));
        WebElement message =  driver.findElement(By.name("messageText"));
        WebElement send =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div/div/form/div[6]/input"));

        subject.sendKeys("1");
        email.sendKeys("a@g.com");
        name.sendKeys("1");
        phone.sendKeys("5");
        message.sendKeys("e");
        TimeUnit.SECONDS.sleep(2);
        send.click();
        TimeUnit.SECONDS.sleep(4);
        assertEquals("Message sucessfully sent", driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/div/div/form/div[6]/span")).getText());
    }

    @Test
    public void ContactFormMax () throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/contacts");
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 600);");
        WebElement subject =  driver.findElement(By.name("subjectOther"));
        WebElement email =  driver.findElement(By.name("senderEmail"));
        WebElement name =  driver.findElement(By.name("senderName"));
        WebElement phone =  driver.findElement(By.name("senderPhone"));
        WebElement message =  driver.findElement(By.name("messageText"));
        WebElement send =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div/div/form/div[6]/input"));

        subject.sendKeys("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        email.sendKeys("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890va@g.com");
        name.sendKeys("112345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        phone.sendKeys("51234567890");
        message.sendKeys("e1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        jse.executeScript("scroll(0, 600);");
        TimeUnit.SECONDS.sleep(2);
        send.click();
        TimeUnit.SECONDS.sleep(4);
        assertEquals("Message sucessfully sent", driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/div/div/form/div[6]/span")).getText());
    }
    @Test
    public void ContactFormRequiredField () throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/contacts");
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 600);");
        WebElement subject =  driver.findElement(By.name("subjectOther"));
        WebElement email =  driver.findElement(By.name("senderEmail"));
        WebElement name =  driver.findElement(By.name("senderName"));
        WebElement phone =  driver.findElement(By.name("senderPhone"));
        WebElement message =  driver.findElement(By.name("messageText"));
        WebElement send =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div/div/form/div[6]/input"));

        subject.sendKeys("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        email.sendKeys("12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890va@g.com");
      //  name.sendKeys("112345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
      //  phone.sendKeys("51234567890");
        message.sendKeys("e1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        jse.executeScript("scroll(0, 600);");
        TimeUnit.SECONDS.sleep(2);
        send.click();
        TimeUnit.SECONDS.sleep(4);
        assertEquals("Message sucessfully sent", driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[2]/div/div/form/div[6]/span")).getText());
    }
    @Test
    public void UnContactFormEmptyFields() throws InterruptedException {
        driver.get("https://writer.urgentpapers.org/contacts");
        driver.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 600);");
        WebElement subject =  driver.findElement(By.name("subjectOther"));
        WebElement email =  driver.findElement(By.name("senderEmail"));
        WebElement name =  driver.findElement(By.name("senderName"));
        WebElement phone =  driver.findElement(By.name("senderPhone"));
        WebElement message =  driver.findElement(By.name("messageText"));
        WebElement send =  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[2]/div/div/form/div[6]/input"));
        jse.executeScript("scroll(0, 600);");
        TimeUnit.SECONDS.sleep(4);
        send.click();
        assertEquals("Please specify your subject", driver.findElement(By.cssSelector(".error")).getText());
        assertEquals("Please specify valid email address", driver.findElement(By.cssSelector("div.form-group:nth-child(2) > label:nth-child(3)")).getText());
        assertEquals("Please enter a message", driver.findElement(By.cssSelector("#messageText")).getText());

    }
    }



