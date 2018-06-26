package com;

public class AbstractTest {
    @Override
    public void onTestFailure(ITestResult tr){
        Object currentClass = tr.getInstance();
        WebDriver driver = ((AbstractTest) currentClass).getDriver();
        byte[] srcFile =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        saveScreenshot(srcFile);
    }
    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] saveScreenshot(byte[] screenshot){
        return screenshot;
    }
}
