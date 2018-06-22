package com;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshot {

public static void takeScreenshot(WebDriver driver, String fileName) throws Exception{

    fileName = fileName + ".png";
    String directory = "C:\\Programms\\PNG\\" + fileName;
    File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   // FileUtils.copyFile(sourceFile, new File(directory + fileName));

}


  /*  public  void   close() throws Exception {


        File screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        String path = "C:/target/screenshots/" + screenshot.getName();
        try {
            FileUtils.copyFile(screenshot, new File(path));
        } catch (IOException e) {
        }

        }
*/


}
