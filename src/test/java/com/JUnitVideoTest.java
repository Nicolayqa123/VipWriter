package com;

import com.automation.remarks.junit.VideoRule;
import com.automation.remarks.video.annotations.Video;
import com.vipwriters.WebDriverSettings;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class JUnitVideoTest extends WebDriverSettings {
    @Rule
    public VideoRule videoRule = new VideoRule();

    @Test
    @Video
    public void shouldFailAndCreateRecordWithTestName()throws Exception {
        Thread.sleep(5000);
        assert false;
    }

    @Test
    @Video(name = "second_test")
    public void videoShouldHaveNameSecondTest() throws Exception {
        Thread.sleep(10000);
        assertTrue(false);
    }
}

