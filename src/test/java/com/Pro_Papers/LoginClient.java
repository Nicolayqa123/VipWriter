package com.Pro_Papers;

import com.vipwriters.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class LoginClient extends WebDriverSettings {

    @Test
    public void Login1() throws InterruptedException {
        driver.get(ProPapers_ProdUrl);

        driver.findElement(loginClient).click();
        driver.findElement(loginClientUserName).sendKeys(mailPro);
        driver.findElement(loginClientPassword).sendKeys(passPro);
        driver.findElement(loginClientSubmit).click();
        TimeUnit.SECONDS.sleep(10);
        Assert.assertFalse("NicolayQA", Boolean.parseBoolean(driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[1]/div[2]/span[1]").getText()));

    }

    /*public static void main(String[] args) throws InterruptedException {

        FirefoxDriver driver;
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");

        driver = new FirefoxDriver();

        driver.get("https://client.urgentpapers.org");

        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div/ul/li[6]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("Kallyan2@ya.ru");
        driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/div[1]/button")).click();
        TimeUnit.SECONDS.sleep(10);
        Assert.assertFalse("NicolayQA", Boolean.parseBoolean(driver.findElementByXPath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[1]/div[2]/span[1]").getText()));

    }*/

   /* @After
    public void closes(ITestResult testResult) throws Exception {

        if (testResult.getStatus() == ITestResult.CREATED) {
            takeScreenshot(driver, testResult.getName());
        }
        driver.quit();

    }*/

    public void LoginUserWrongPassword()throws InterruptedException {
        driver.get("https://client.urgentpapers.org/");

        driver.findElement(loginClient).click();
        driver.findElement(loginClientUserName).sendKeys("nicolayqa@gmail.com");
            TimeUnit.SECONDS.sleep(3);
        driver.findElement(loginClientPassword).sendKeys("asdasda456");
        driver.findElement(loginClientSubmit).click();
            TimeUnit.SECONDS.sleep(2);
        assertEquals("Invalid credentials", driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[1]/div[4]")).getText());

    }

    public void LoginUserIsBlocked()throws Exception {
        driver.get("https://client.urgentpapers.org/");


        driver.findElement(loginClient).click();
        driver.findElement(loginClientUserName).sendKeys("nicolayqa@gmail.com");
            TimeUnit.SECONDS.sleep(3);
        driver.findElement(loginClientPassword).sendKeys("nicolayqa");
        driver.findElement(loginClientSubmit).click();
            TimeUnit.SECONDS.sleep(2);
        assertEquals("Authorization has been denied for this request.", driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[2]/div/div/div[1]/div[4]")).getText());

    }
    public void LoginPap() {
        driver.get("https://client.urgentpapers.org/");


        driver.findElement(loginClient).click();
        driver.findElement(loginClientUserName).sendKeys("nicolaychiuri@gmail.com");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(loginClientPassword).sendKeys("nicolay");
        driver.findElement(loginClientSubmit).click();
        assertEquals("NicolayQA", driver.findElement(By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[1]/div[2]/span[1]")).getText());
    }





}
