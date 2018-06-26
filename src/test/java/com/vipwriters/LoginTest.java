package com.vipwriters;


import com.PageWriter.Lending;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class LoginTest extends WebDriverSettings {

    @Listeners({CustomTestListener.class})
    public abstract class TestBase {
        // You code here
    }

        @Test
        public void Loginuser() throws Exception {

            driver.get("https://writer.urgentpapers.org/");
            Lending.loginForm(driver).click();
            Lending.userName(driver).sendKeys(mail);
            Lending.password(driver).sendKeys(pass);
            Lending.loginButton(driver).click();
            TimeUnit.SECONDS.sleep(7);
            assertEquals("Available Orders", driver.findElement(By.cssSelector("#root > div > div > div.writers-content > div:nth-child(2) > h2")).getText());

        }

        public void UnLoginNoValid() throws InterruptedException {

            driver.get("https://writer.urgentpapers.org/");
            WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/header/div/div[2]/nav/ul/li[11]/a"));
            WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[2]/input"));
            WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[3]/input"));
            WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[4]/input"));
            driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
            TimeUnit.SECONDS.sleep(3);
            login.click();
            TimeUnit.SECONDS.sleep(2);
            username.sendKeys("asdasd@ya.ru");
            password.sendKeys("asdasdasd");
            loginButton.click();
            TimeUnit.SECONDS.sleep(1);
            assertEquals("Please enter a correct username and password.", driver.findElement(By.cssSelector(".label")).getText());
        }


        public void UnLoginEmptyFields() throws InterruptedException {

            driver.get("https://writer.urgentpapers.org/");
            WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/header/div/div[2]/nav/ul/li[11]/a"));
            WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[2]/input"));
            WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[3]/input"));
            WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div/div[4]/input"));
            driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
            TimeUnit.SECONDS.sleep(3);
            login.click();
            TimeUnit.SECONDS.sleep(2);
            loginButton.click();
            TimeUnit.SECONDS.sleep(1);
            assertEquals("Please enter a correct username and password.", driver.findElement(By.cssSelector(".label")).getText());

        }

    }
