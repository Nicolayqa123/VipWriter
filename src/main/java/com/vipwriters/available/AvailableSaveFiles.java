package com.vipwriters.available;

import com.PageWriter.AvailablePage;
import com.PageWriter.DetailedOrder;
import com.vipwriters.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class AvailableSaveFiles extends WebDriverSettings {

    @Test
    public void dropfile ()throws Exception {
    WritersLogin();
        AvailablePage.order10004(driver).click();
        DetailedOrder.uploadFile(driver).click();
        DetailedOrder.fileRecipientClient(driver).click();
        DetailedOrder.fileTypeAditiMater(driver).click();
        DetailedOrder.drop(driver).click();
        TestFileDrop();
        DetailedOrder.confirm(driver).click();
        assertEquals("File successfully !", driver.findElement(By.xpath("//*[@id=\"swal2-title\"]")).getText());


    }


}