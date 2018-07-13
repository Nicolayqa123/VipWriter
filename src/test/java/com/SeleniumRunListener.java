package com;

import io.qameta.allure.Attachment;
import org.junit.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumRunListener extends RunListener {
    @Override
    public void testRunStarted(Description description) throws Exception {
        System.out.println("Before tests run: " + description);
    }

    /**
     * Вызывается когда все тесты завершены
     * @param result результат выполнения тестов
     */
    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("Result of the test run:");
        System.out.println("Run time: " + result.getRunTime() + " ms");
        System.out.println("Run count: " + result.getRunCount());
        System.out.println("Failure count: " + result.getFailureCount());
        System.out.println("Ignored count: " + result.getIgnoreCount());
        makeScreenshotOnFailure();
        driver.quit();
    }

    /**
     * Вызывается перед запуском каждого теста.
     * @param description описание теста, который собирается запуститься
     * (обычно имя класса и метода)
     */
    @Override
    public void testStarted(Description description) throws Exception {
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
        System.out.println("Test starts: " + description);
    }

    /**
     * Вызывается после завершения каждого теста,
     * несмотря на результат выполнения.
     * @param description описание теста, который завершился
     */
    @Override
    public void testFinished(Description description) throws Exception {
        System.out.println("Test finished: " + description);
        System.out.println("--------------------------------------");
    }

    /**
     * Вызывается когда тест завершается неудачей.
     * @param failure описывает тест, который завершился ошибкой
     * и полученное исключение.
     */
    @Override
    public void testFailure(Failure failure) throws Exception {
        System.out.println("Test failed with: "
                + failure.getException());
        makeScreenshotOnFailure();
    }

    /**
     * Вызывается когда не выполняется условие в классе Assume
     *
     * @param failure описывает тест, который не был выполнен
     * и исключение {@link AssumptionViolatedException}
     */
    @Override
    public void testAssumptionFailure(Failure failure) {
        System.out.println("Test assumes: " + failure.getException());
    }

    /**
     * Вызывается когда тест не будет запущен,
     * в основном потому что стоит аннотация @Ignore
     *
     * @param description описание теста который не будет запущен
     */
    @Override
    public void testIgnored(Description description) throws Exception {
        System.out.println("Test ignored: " + description);
        System.out.println("--------------------------------------");
    }
    public FirefoxDriver driver;





    @Attachment("Screenshot on failure")
    public byte[] makeScreenshotOnFailure() {

        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }



}

