package com.PageClient;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DetailedOrder {

    public static WebElement element = null;

    public static WebElement endChat (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"endChat\"]"));
        return element;
    }
    public static WebElement addNewFile (WebDriver driver){
        element = driver.findElement(By.cssSelector("div.content:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1)"));
        return element;
    }
}
