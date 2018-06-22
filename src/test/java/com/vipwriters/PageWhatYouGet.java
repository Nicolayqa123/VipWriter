package com.vipwriters;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class PageWhatYouGet extends WebDriverSettings {
    @Test
    public void whatYouget () {
        driver.get("https://writer.urgentpapers.org/whatyouget");
        driver.manage().window().maximize();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");
        assertEquals("Free registration\n" +
                "High salary\n" +
                "Interesting orders to work on\n" +
                "24/7 assistance", driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/ul")).getText());
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"headingTwo\"]/h4/a").click();
        assertEquals("Wide range of academic fields\n" +
                "Different types of papers\n" +
                "Different academic levels\n" +
                "Your own workload", driver.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/ul")).getText());
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"headingThree\"]/h4/a").click();
        assertEquals("Talented and skilled writers\n" +
                "Writers experienced in academic and non-academic writing\n" +
                "Writers with excellent written English\n" +
                "Writers willing to turn their knowledge into cash", driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/ul")).getText());
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jse.executeScript("scroll(0, 250);");
        driver.findElementByXPath("/html/body/div/div[3]/div[2]/div/div/div/div[4]/div[1]/h4/a").click();
        assertEquals("Mathematics\n" +
                "Engineering\n" +
                "MATLAB\n" +
                "SPSS\n" +
                "Physics\n" +
                "Technology\n" +
                "Medicine\n" +
                "Communication", driver.findElement(By.xpath("//*[@id=\"collapseFour\"]/div/ul")).getText());
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
