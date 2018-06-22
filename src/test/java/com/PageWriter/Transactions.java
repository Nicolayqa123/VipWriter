package com.PageWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Transactions {
    public static WebElement element = null;



    public static WebElement transactions (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/ul/li[6]/a"));
        return element;
    }

}
