package com.vipwriters.available;

import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AvailableSendMessageInOrder extends WebDriverSettings {

    @Test
    public void SendMessageToClient() {

        driver.get("https://writer.urgentpapers.org");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input"));
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.click();
        username.sendKeys("nicolayqa@gmail.com");
        password.sendKeys("nicolayqa");
        loginButton.click();
        try {
            TimeUnit.SECONDS.sleep(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement available = driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/a"));
        WebElement order = driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a"));
        available.click();
        order.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"send-new-button\"]/span").click();
        driver.findElementByXPath("//*[@id=\"newMessageForm\"]/div[1]/select").click();
        driver.findElementByXPath("//*[@id=\"newMessageForm\"]/div[1]/select/option[2]").click();
        driver.findElementByXPath("//*[@id=\"textarea-expand\"]").sendKeys("test1test2test3");
        driver.findElementByXPath("//*[@id=\"newMessageForm\"]/button[2]").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        @Test
        public void SendMessageToClientMax() {

            driver.get("https://writer.urgentpapers.org");
            WebElement login = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"));
            WebElement username = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input"));
            WebElement password = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input"));
            WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input"));
            try {
                TimeUnit.SECONDS.sleep(6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            login.click();
            username.sendKeys(mail);
            password.sendKeys(pass);
            loginButton.click();
            try {
                TimeUnit.SECONDS.sleep(12);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement available = driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/a"));
            WebElement order = driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a"));
            available.click();
            order.click();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElementByXPath("//*[@id=\"send-new-button\"]/span").click();
            driver.findElementByXPath("//*[@id=\"newMessageForm\"]/div[1]/select").click();
            driver.findElementByXPath("//*[@id=\"newMessageForm\"]/div[1]/select/option[2]").click();
            driver.findElementByXPath("//*[@id=\"textarea-expand\"]").sendKeys("test1test2test3test1test2test3test1test2test3" +
                    "test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3" +
                    "test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3" +
                    "test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3" +
                    "test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3" +
                    "test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3" +
                    "test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3test1test2test3");
            driver.findElementByXPath("//*[@id=\"newMessageForm\"]/button[2]").click();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    @Test
    public void SendMessageToClientMin() {

        driver.get("https://writer.urgentpapers.org");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input"));
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.click();
        username.sendKeys(mail);
        password.sendKeys(pass);
        loginButton.click();
        try {
            TimeUnit.SECONDS.sleep(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement available = driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/a"));
        WebElement order = driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a"));
        available.click();
        order.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"send-new-button\"]/span").click();
        driver.findElementByXPath("//*[@id=\"newMessageForm\"]/div[1]/select").click();
        driver.findElementByXPath("//*[@id=\"newMessageForm\"]/div[1]/select/option[2]").click();
        driver.findElementByXPath("//*[@id=\"textarea-expand\"]").sendKeys("1");
        driver.findElementByXPath("//*[@id=\"newMessageForm\"]/button[2]").click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"send-new-button\"]").click();

    }
    @Test
    public void SendMessageToClientEmptyField() {

        driver.get("https://writer.urgentpapers.org");
        WebElement login = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input"));
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.click();
        username.sendKeys(mail);
        password.sendKeys(pass);
        loginButton.click();
        try {
            TimeUnit.SECONDS.sleep(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement available = driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/a"));
        WebElement order = driver.findElement(By.xpath("//*[@id=\"availableOrders\"]/tbody/tr[1]/td[1]/a"));
        available.click();
        order.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"send-new-button\"]/span").click();
        driver.findElementByXPath("//*[@id=\"newMessageForm\"]/button[2]").click();
        assertEquals("Please select a recipient", driver.findElement(By.xpath("//*[@id=\"newMessageForm\"]/div[1]/span")).getText());
        assertEquals("Please enter a message", driver.findElement(By.xpath("//*[@id=\"newMessageForm\"]/div[2]/p")).getText());

    }
    }

