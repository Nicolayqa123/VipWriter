package com.vipwriters;

import io.qameta.allure.Attachment;

public class ActionSequence extends WebDriverSettings {
    @Attachment
    public String performedActions(ActionSequence actionSequence) {
        return actionSequence.toString();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
