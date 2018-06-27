package com.vipwriters;

import com.PageWriter.Lending;
import com.Screenshot;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;



import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;



import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class WebDriverSettings  {


    public FirefoxDriver driver;

    //  public ChromeDriver driver;
//  public InternetExplorerDriver driver;
    //  @FindBy(xpath = ("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"))
    //  public WebElement password;

    //  @FindBy(xpath= ("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"))
    //  public WebElement login;


    // String mail = "nicolayqa@gmail.com";
    // String pass = "nicolayqa";

    public String mail = "gennadii2@test.com";
    public String pass = "123456";

    @Before
    public void setup() {

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

@After
public void close() {

    driver.quit();


}



   /* @AfterMethod
    public static void   screenshot(ITestResult result) throws Exception {
        if (!result.isSuccess()) {
            try {
                WebDriver returned = new Augmenter().augment(driver);
                if (returned != null) {
                    File f = ((TakesScreenshot) returned)
                            .getScreenshotAs(OutputType.FILE);
                    try {
                        FileUtils.copyFile(f, new File("C:\\Test_results\\"
                                + result.getName() + ".jpg"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (ScreenshotException se) {
                se.printStackTrace();
            }
        }
    }*/






    public void WritersLogin() throws Exception {
        driver.get("https://writer.urgentpapers.org/");
        Lending.loginForm(driver).click();
        Lending.userName(driver).sendKeys(mail);
        Lending.password(driver).sendKeys(pass);
        Lending.loginButton(driver).click();
        TimeUnit.SECONDS.sleep(4);
    }
    public void TestFileDrop() throws Exception {
        setClipboardData("C:\\Test.docx");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        TimeUnit.SECONDS.sleep(2);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void WritersLoginNic() {
        driver.get("https://writer.urgentpapers.org");

        WebElement login = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a"));
        WebElement username = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.click();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        username.sendKeys("NicolayQa@gmail.com");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        password.sendKeys("nicolayqa");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginButton.click();
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
    }
    public void RegisteredFormJustRequiredField1() {

        Random r = new Random();
        int x = r.nextInt(1000) + 1;

        String regmail = x + "test@test.com";
        String regpass = "Password123";


        driver.get("https://writer.urgentpapers.org/signUp/aboutMe");
        driver.manage().window().maximize();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByCssSelector("div.row-fluid:nth-child(1) > div:nth-child(1) > input:nth-child(2)").sendKeys("Nicoas");
        driver.findElementByCssSelector("div.col-lg-6:nth-child(2) > input:nth-child(2)").sendKeys("Qa1s");
        driver.findElementByCssSelector("div.row-fluid:nth-child(2) > div:nth-child(1) > input:nth-child(2)").click();
        driver.findElementByCssSelector("div.row-fluid:nth-child(2) > div:nth-child(1) > input:nth-child(2)").sendKeys("england");
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[3]/div/span[1]/input").click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 250);");

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByCssSelector("a.btn-red").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByCssSelector("a.btn-red").click();

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        jse.executeScript("window.scrollBy(0,-250)", "");

        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[1]/div[1]/input").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[1]/div[1]/input").sendKeys(regmail);
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[2]/div[1]/input").sendKeys("Oslo");
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[2]/div[2]/span/input").sendKeys("Ukraine");
        driver.findElementByXPath("//*[@id=\"primaryPhone\"]").sendKeys("501245478");
        jse.executeScript("scroll(0, 250);");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[4]/div/span/input[1]").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/ul/li[3]/a").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"s2id_disciplines\"]/ul").click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[1]").click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByXPath("//*[@id=\"s2id_disciplines\"]/ul").click();
        driver.findElementByXPath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[3]").click();
        //*[@id="select2-drop"]/ul/li[1]/ul/li[1]

        //*[@id="select2-result-label-841"]
        //*[@id="select2-result-label-842"]
        //*[@id="select2-result-label-843"]
        driver.findElementByXPath("//*[@id=\"s2id_disciplines\"]/ul").click();
        driver.findElementByXPath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[2]").click();
        driver.findElementByXPath("//*[@id=\"s2id_disciplines\"]/ul").click();
        driver.findElementByXPath("//*[@id=\"select2-drop\"]/ul/li[1]/ul/li[4]").click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[2]/div/input").sendKeys("Cultura");
        jse.executeScript("scroll(0, 350);");
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div[3]/div/div/input[1]").click();
        driver.findElementByXPath("//*[@id=\"citationStyles\"]/li[1]/input").click();
        driver.findElementByXPath("//*[@id=\"academicDegree\"]").click();
        driver.findElementByXPath("//*[@id=\"academicDegree\"]/option[4]").click();


        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/ul/li[3]/a").click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByCssSelector("div.row-fluid:nth-child(1) > div:nth-child(1) > input:nth-child(2)").click();
        driver.findElementByCssSelector("div.row-fluid:nth-child(1) > div:nth-child(1) > input:nth-child(2)").sendKeys(regmail);

        driver.findElementByName("newpass").click();
        driver.findElementByName("newpass").sendKeys(regpass);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElementByName("rePassword").click();
        driver.findElementByName("rePassword").sendKeys(regpass);
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/div[1]/section/div/div[1]/div[4]/div/input").click();

        driver.findElementByXPath("//*[@id=\"learnedFrom\"]/li[1]/input").click();
        driver.findElementByXPath("//*[@id=\"signUpWizard\"]/div[2]/ul/li[2]/a").click();
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Sign In", driver.findElement(By.xpath("//*[@id=\"signinForm\"]/div/div[1]/h3")).getText());
//*[@id="signinForm"]/div/div[1]/h3

//        selectByVisibleText:Select selectByVisibleText = new Select(driver.findElement(By.id(“id_of_some_element”)));
//        selectByVisibleText.selectByVisibleText(“some_visible_text”);
    }
    public void LoginPap() throws Exception {
        driver.get("https://client.urgentpapers.org/");

        driver.findElement(loginClient).click();
        driver.findElement(loginClientUserName).sendKeys("nicolaychiuri@gmail.com");
        driver.findElement(loginClientPassword).sendKeys("nicolay");
        driver.findElement(loginClientSubmit).click();
        TimeUnit.SECONDS.sleep(10);
    }
    public void RegisteredStep2() throws Exception {

        LoginPap();
        driver.get("https://client.urgentpapers.org/my/new_order");
        String asdf = driver.findElementByXPath("//*[@id=\"details\"]/div[1]/label[1]").getText();
        WebElement topic11 = driver.findElementByXPath("//*[@id=\"details\"]/div[5]/textarea");

        driver.findElementByXPath("//*[@id=\"details\"]/div[1]/label[2]/select").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[1]/label[2]/select/optgroup[1]/option[8]").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[3]/label[2]/select").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[3]/label[2]/select/optgroup[1]/option[4]").click();
        for (int i = 1; i <= 3; i++) {

            driver.findElement(oNSteps2Topic).sendKeys("as dfg hjkl");
            driver.findElement(oNsteps2PaperDetails).sendKeys("asdfghjkl");
            driver.findElement(oNsteps2PaperDetails).sendKeys("  ");
        }
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElementByXPath("//*[@id=\"details\"]/div[9]/label[2]/select").click();
        driver.findElementByXPath("//*[@id=\"details\"]/div[9]/label[2]/select/option[3]").click();
        driver.findElement(oNSteps2NumberOfRef).sendKeys("2");
        driver.findElement(oNSteps3).click();
    }
    public void RegisteredStep3Inquiry() throws Exception {
        Random r = new Random();
        int x = r.nextInt(20) + 1;
        int y = r.nextInt(20) + 1;
        int z = r.nextInt(20) + 1;
        int a = r.nextInt(20) + 1;

        LoginPap();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://commentality.com/my/new_inquiry");

        WebElement typeOfPaper = driver.findElement(By.xpath("//*[@id=\"details\"]/div[1]/label[2]/select"));
        WebElement adminEssay = driver.findElement(By.xpath("//*[@id=\"details\"]/div[1]/label[2]/select/optgroup[1]/option[1]"));
        WebElement subject = driver.findElement(By.xpath("//*[@id=\"details\"]/div[3]/label[2]/select"));
        WebElement arch = driver.findElement(By.xpath("//*[@id=\"details\"]/div[3]/label[2]/select/optgroup[1]/option[1]"));
        WebElement topic = driver.findElement(By.xpath("//*[@id=\"details\"]/div[5]/textarea"));
        WebElement paperDetails = driver.findElement(By.xpath("//*[@id=\"details\"]/div[7]/textarea"));
        WebElement paperFormat = driver.findElement(By.xpath("//*[@id=\"details\"]/div[9]/label[2]/select"));
        WebElement apa = driver.findElement(By.xpath("//*[@id=\"details\"]/div[9]/label[2]/select/option[1]"));
        WebElement numbOfRence = driver.findElement(By.xpath("//*[@id=\"inputnumberof\"]"));
        WebElement addMaterial = driver.findElement(By.xpath("//*[@id=\"details\"]/div[12]/button"));
        WebElement step3 = driver.findElement(By.xpath("//*[@id=\"details\"]/button"));


        typeOfPaper.click();
        adminEssay.click();
        subject.click();
        arch.click();
        topic.sendKeys("test tesst test");
        paperDetails.sendKeys("test test test");
        paperFormat.click();
        apa.click();
        numbOfRence.sendKeys("5");
        step3.click();

        WebElement academicLevel = driver.findElement(By.name("academic_level"));
        WebElement bachelor = driver.findElement(By.xpath("//*[@id=\"price\"]/div[2]/label[2]/select/option[3]"));
        WebElement numberOfPages = driver.findElement(By.xpath("//*[@id=\"numberOfPages\"]"));
        WebElement nOproblems = driver.findElement(By.xpath("//*[@id=\"price\"]/div[5]/input"));
        WebElement nOslides = driver.findElement(By.xpath("//*[@id=\"price\"]/div[6]/input"));
        WebElement MCQ = driver.findElement(By.xpath("//*[@id=\"price\"]/div[7]/input"));
        WebElement deadline = driver.findElement(By.xpath("//*[@id=\"price\"]/div[9]/label[2]/select"));
        WebElement days7 = driver.findElement(By.xpath("//*[@id=\"price\"]/div[9]/label[2]/select/option[9]"));
        WebElement termOfUse = driver.findElement(By.xpath("//*[@id=\"price\"]/div[15]/label/input"));
        WebElement pay = driver.findElement(By.xpath("//*[@id=\"price\"]/button"));


        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        academicLevel.click();
        bachelor.click();
        numberOfPages.sendKeys(x+"1");
        nOproblems.sendKeys(y+"1");
        nOslides.sendKeys(z+"1");
        MCQ.sendKeys(a+"1");
        deadline.click();
        days7.click();
        termOfUse.click();
        pay.click();



    }
    public void RegisteredStep3NewOrder()throws Exception{
        Random r = new Random();
        int x = r.nextInt(20) + 1;
        int y = r.nextInt(20) + 1;
        int z = r.nextInt(20) + 1;
        int a = r.nextInt(20) + 1;

        LoginPap();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.get("https://commentality.com/my/new_order");

        WebElement typeOfPaper = driver.findElement(By.xpath("//*[@id=\"details\"]/div[1]/label[2]/select"));
        WebElement adminEssay = driver.findElement(By.xpath("//*[@id=\"details\"]/div[1]/label[2]/select/optgroup[1]/option[1]"));
        WebElement subject = driver.findElement(By.xpath("//*[@id=\"details\"]/div[3]/label[2]/select"));
        WebElement arch = driver.findElement(By.xpath("//*[@id=\"details\"]/div[3]/label[2]/select/optgroup[1]/option[1]"));
        WebElement topic = driver.findElement(By.xpath("//*[@id=\"details\"]/div[5]/textarea"));
        WebElement paperDetails = driver.findElement(By.xpath("//*[@id=\"details\"]/div[7]/textarea"));
        WebElement paperFormat = driver.findElement(By.xpath("//*[@id=\"details\"]/div[9]/label[2]/select"));
        WebElement apa = driver.findElement(By.xpath("//*[@id=\"details\"]/div[9]/label[2]/select/option[1]"));
        WebElement numbOfRence = driver.findElement(By.xpath("//*[@id=\"inputnumberof\"]"));
        WebElement addMaterial = driver.findElement(By.xpath("//*[@id=\"details\"]/div[12]/button"));
        WebElement step3 = driver.findElement(By.xpath("//*[@id=\"details\"]/button"));


        typeOfPaper.click();
        adminEssay.click();
        subject.click();
        arch.click();
        topic.sendKeys("test tesst test");
        paperDetails.sendKeys("test test test");
        paperFormat.click();
        apa.click();
        numbOfRence.sendKeys("5");
        step3.click();

        WebElement academicLevel = driver.findElement(By.name("academic_level"));
        WebElement bachelor = driver.findElement(By.xpath("//*[@id=\"price\"]/div[2]/label[2]/select/option[3]"));
        WebElement numberOfPages = driver.findElement(By.xpath("//*[@id=\"numberOfPages\"]"));
        WebElement nOproblems = driver.findElement(By.xpath("//*[@id=\"price\"]/div[5]/input"));
        WebElement nOslides = driver.findElement(By.xpath("//*[@id=\"price\"]/div[6]/input"));
        WebElement MCQ = driver.findElement(By.xpath("//*[@id=\"price\"]/div[7]/input"));
        WebElement deadline = driver.findElement(By.xpath("//*[@id=\"price\"]/div[9]/label[2]/select"));
        WebElement days7 = driver.findElement(By.xpath("//*[@id=\"price\"]/div[9]/label[2]/select/option[9]"));
        WebElement termOfUse = driver.findElement(By.xpath("//*[@id=\"price\"]/div[15]/label/input"));
        WebElement pay = driver.findElement(By.xpath("//*[@id=\"price\"]/button"));


        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        academicLevel.click();
        bachelor.click();
        numberOfPages.sendKeys(x+"");
        nOproblems.sendKeys(y+"");
        nOslides.sendKeys(z+"");
        MCQ.sendKeys(a+"");
        deadline.click();
        days7.click();
        termOfUse.click();
        pay.click();



    }
    public void LoginSupport()throws Exception{
        driver.get("https://support.vip-writers.commentality.com/signIn");
        driver.manage().window().maximize();
        WebElement login = driver.findElement(By.xpath("/html/body/div/div/form/div/div[2]/input"));
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/form/div/div[3]/input"));
        WebElement signIn = driver.findElement(By.xpath("/html/body/div/div/form/div/div[4]/button"));
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        login.sendKeys("support@test.com");
        password.sendKeys("Password1");
        signIn.click();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void DetaileOrderPap  () throws Exception {
        LoginPap();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 350);");
        driver.findElement(currentOrdersOrder10292).click();

    }
    public static void setClipboardData(String string) {
        StringSelection stringSelection = new StringSelection(string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
    }

    public By login1 = By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/nav/ul/li[10]/a");
    public By username1 = By.xpath("//*[@id=\"signinForm\"]/div/div[2]/input");
    public By passworf1 = By.xpath("//*[@id=\"signinForm\"]/div/div[3]/input");
    public By loginButton1 = By.xpath("//*[@id=\"signinForm\"]/div/div[4]/input");
    public By sendMailUs = By.xpath("//*[@id=\"contactUsForm\"]/div[5]/div/button");


    public By loginClient = By.cssSelector("button.green:nth-child(2)");
    public By loginClientUserName = By.id("login-email");
    public By loginClientPassword = By.id("login-password");
    public By loginClientSubmit = By.id("button-login");
    public By resetPasswordClient = By.cssSelector("forgotbutton");
    public By resetPasswordCMail = By.id("reset-email");
    public By resetPasswordCSend = By.id("reset-password");
    public By contacteUsClient = By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[2]/li[5]/a");
    public By contacteUsClientMessage = By.name("message");
    public By contacteUsClientCallBack = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/form/button[1]");
    public By contacteUsClientEmail = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[2]/div/div[2]/div[2]/form/button[2]");
    public By currentOrders = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[1]/div[2]/ul[1]/li[1]/a");
    public By currentOrdersOrder10292 = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(48) > td:nth-child(1) > a:nth-child(1)");
    public By addNewMessage = By.xpath("//*[@id=\"collapseTwo\"]/div/div[1]/div/button");
    public By aNMWriter = By.xpath("//*[@id=\"collapseTwo\"]/div/div[1]/div[2]/div/label[1]");
    public By aNMSupport = By.xpath("//*[@id=\"collapseTwo\"]/div/div[1]/div[2]/div/label[2]");
    public By aNMText = By.xpath("//*[@id=\"collapseTwo\"]/div/div[1]/div[2]/textarea");
    public By aNMSendMessage = By.xpath("//*[@id=\"collapseTwo\"]/div/div[1]/div[2]/button");
    public By addNewFile = By.xpath("//*[@id=\"collapseFour\"]/div/div[1]/div/button");
    public By aNFWriter = By.xpath("//*[@id=\"collapseFour\"]/div/div[1]/div/div/label[1]");
    public By aNFSupport = By.xpath("//*[@id=\"collapseFour\"]/div/div[1]/div/div/label[2]");
    public By aNFUpload = By.xpath("//*[@id=\"collapseFour\"]/div/div[1]/div[2]/button");
    public By sortById = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[2]/div/div/table/thead/tr/th[1]");
    public By sortByTopic = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[2]/div/div/table/thead/tr/th[2]");
    public By previousOrders = By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[1]/li[3]/a/span");
    public By order10272 = By.cssSelector(".table > tbody:nth-child(2) > tr:nth-child(26) > td:nth-child(1) > a:nth-child(1)");
    public By profile = By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[1]/div[2]/ul[2]/li[1]/a");
    public By profileChangePassword = By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div[1]/div[2]/a[1]");
    public By profileChPCurrentPassword = By.name("current");
    public By profileChPNewPassword = By.name("new");
    public By profileChPRepeatNewPassword = By.name("repeat");
    public By profileChPButton = By.xpath("//*[@id=\"mm-0\"]/div[3]/div/div[2]/div/div/form/div/div[4]/button");
    public By profileName = By.name("firstName");
    public By profileLastName = By.name("lastName");
    public By profileMail = By.name("email");
    public By profilePhone = By.xpath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[5]/td[2]/div/input");
    public By profileCountry = By.id("select2-countryCode-ou-container");
    public By profileSaveChanges = By.xpath("//*[@id=\"collapseFive\"]/div/table/tbody/tr[11]/td[2]/button");
    public By orderNow = By.id("button-order");
    public By oNFirstName = By.name("firstName");
    public By oNLastName = By.name("lastName");
    public By oNMail = By.cssSelector("#customer > div:nth-child(3) > div:nth-child(2) > input:nth-child(1)");
    public By onConfirmMail = By.cssSelector("#customer > div:nth-child(4) > div:nth-child(2) > input:nth-child(1)");
    public By oNPassword = By.cssSelector("div.form-group:nth-child(5) > div:nth-child(2) > input:nth-child(1)");
    public By oNComfPassword = By.name("passwordConfirm");
    public By oNPhone = By.cssSelector(".react-tel-input > input:nth-child(1)");
    public By oNStep2 = By.id("go_to_step2_button");
    public By oNSteps2Topic = By.name("topic");
    public By oNsteps2PaperDetails = By.name("paper_details");
    public By oNSteps2NumberOfRef = By.name("number_of_references");
    public By oNSteps3 = By.cssSelector("button.btn:nth-child(15)");
    public By oNSteps3NumberOfPages = By.id("numberOfPages");
    public By oNSteps3NumberOfProblem = By.name("number_of_problems");
    public By oNSteps3NumberOfSlides = By.name("number_of_slides");
    public By oNSteps3NumberOfQuestions = By.name("number_of_questions");
    public By oNSteps3IAgree = By.name("agree");
    public By oNStep3Pay = By.cssSelector("button.btn:nth-child(19)");



    public void CheckTitle_gb() {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Great Britain");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_ca () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Canada");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_au () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Australia");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_cn () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers China");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);

    }
    public void CheckTitle_sa () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers KSA");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_ae () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers UAE");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_qa () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Qatar");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_ie () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Ireland");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_hk () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Hong Kong");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_sg () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Singapore");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_nl () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Nederland");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_kw () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Kuwait");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_lb () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Lebanon");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_om () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Oman");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_nz () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers New Zeland");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_il () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Israel");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_de () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Germany");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_fr () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers France");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_jp () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Japan");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_se () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Sweden");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_dk () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Denmark");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_mt () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Malta");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }
    public void CheckTitle_bn () {
        String url = driver.getCurrentUrl();
        String tie = driver.getTitle();
        boolean title = driver.getTitle().contains("Pro-Papers Brunei Darussalam");
        if(title)
            System.out.println("Good");
        else if(!title)
            System.out.println(tie + url);
    }







  }