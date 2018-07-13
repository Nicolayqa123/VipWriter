package com.vipwriters;

import io.qameta.allure.Attachment;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestWatcher1 extends WebDriverSettings{

    @Rule
    public TestWatcher watcher = new TestWatcher() {

        @Override
        protected void starting(Description description) {
            System.setProperty("webdriver.gecko.driver", "C://Programms/geckodriver.exe");
            driver = new FirefoxDriver();
            System.setProperty("webdriver.chrome.driver", "C://Programms/chromedriver.exe");
            //  driver = new ChromeDriver();
            System.setProperty("webdriver.ie.driver", "C://Programms/IEDriverServer.exe");
            // driver = new InternetExplorerDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();

        }

        @Override
        protected void finished(Description description) {
            makeScreenshotOnFailure();
            driver.quit();
        }

        @Override
        protected void failed(Throwable e, Description description) {
            makeScreenshotOnFailure();
        }

        @Attachment("Screenshot on failure")
        public byte[] makeScreenshotOnFailure() {
            return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        }

    };
}
