package com.PageWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUp {
    public static WebElement element = null;

    public static WebElement signUpForm (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/header/div/div[2]/nav/ul/li[11]/a"));
        return element;
    }
    public static WebElement firsName (WebDriver driver){
        element = driver.findElement(By.name("firstName"));
        return element;
    }
    public static WebElement lastName (WebDriver driver){
        element = driver.findElement(By.name("lastName"));
        return element;
    }
    public static WebElement language (WebDriver driver){
        element = driver.findElement(By.name("languageSpoken"));
        return element;
    }
    public static WebElement genderMale (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div[3]/div/span[1]/label[1]/input"));
        return element;
    }
    public static WebElement aboutMe (WebDriver driver){
        element = driver.findElement(By.id("aboutMe"));
        return element;
    }
    public static WebElement next (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"signUpWizard\"]/div[2]/div/div/div/ul/li[2]/a"));
        return element;
    }
    public static WebElement primaryEmail (WebDriver driver){
        element = driver.findElement(By.name("primaryEmail"));
        return element;
    }
    public static WebElement altEmail (WebDriver driver){
        element = driver.findElement(By.name("altEmail"));
        return element;
    }
    public static WebElement cityName (WebDriver driver){
        element = driver.findElement(By.name("cityName"));
        return element;
    }

    public static WebElement phone (WebDriver driver){
        element = driver.findElement(By.id("primaryPhone"));
        return element;
    }
    public static WebElement specialization (WebDriver driver){
        element = driver.findElement(By.name("univerSpec"));
        return element;
    }
    public static WebElement styles (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"citationStyleIds\"]/li[3]/label/input"));
        return element;
    }
    public static WebElement newpass (WebDriver driver){
        element = driver.findElement(By.name("newpass"));
        return element;
    }
    public static WebElement rePassword (WebDriver driver){
        element = driver.findElement(By.name("rePassword"));
        return element;
    }
    public static WebElement iHaveRead (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"signUpWizard\"]/div[2]/div/div/section/div/div[1]/div[4]/div/label/input"));
        return element;
    }
    public static WebElement finish (WebDriver driver){
        element = driver.findElement(By.id("signup-finish-button"));
        return element;
    }
    public static WebElement country (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"select2-j03e-result-78nz-211\"]"));
        return element;
    }
    public static WebElement disciplinesFilm (WebDriver driver){
        element = driver.findElement(By.id("select2-j8r7-result-aegm-4"));
        return element;
    }
    public static WebElement disciplinesMusic (WebDriver driver){
        element = driver.findElement(By.id("select2-j8r7-result-th7g-6"));
        return element;
    }
    public static WebElement disciplinesBusiness (WebDriver driver){
        element = driver.findElement(By.id("select2-j8r7-result-zoa9-13"));
        return element;
    }
    public static WebElement academicDegree (WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"highestVerifiableDegree\"]/option[3]"));
        return element;
    }
    public static WebElement altPhone (WebDriver driver){
        element = driver.findElement(By.id("alterPhone"));
        return element;
    }

}
