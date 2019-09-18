package com.Pro_Papers;

import com.vipwriters.WebDriverSettings;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Banner extends WebDriverSettings{
    public void BannerCheck () throws Exception {
        Random r = new Random();
        int x = r.nextInt(10000) + 1;

        driver.get(ProPapers_StageUrl);
        TimeUnit.SECONDS.sleep(15);
        driver.findElementById("wl_custom_fields_holder").sendKeys(x + "testBanner@ya.ru");
        driver.findElementByCssSelector("#try_luck_btn").click();
        TimeUnit.SECONDS.sleep(10);
        String sum_discount = driver.findElementByXPath("//*[@id=\"root-container\"]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[1]/span/text()[1]").getText();
        String code_discount = driver.findElementByXPath("//*[@id=\"root-container\"]/div/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/text()[2]").getText();
        driver.findElementByCssSelector("#root-container > div > div:nth-child(1) > div > div.wlo_panel.wlo_hidden1.wlo_gpuac > div.wlo_content.ed_flex.ed_flex_vert > div.wlo_form.wlo_gpuac.ed_flex_item.ed_flex.ed_flex_vert.ed_flex_center > div.wlo_thank_you.wlo_gpuac > div.wlo_btn.wlo_copy_code.not4freeprod").click();



    }
}
// oFP4n3AzqD