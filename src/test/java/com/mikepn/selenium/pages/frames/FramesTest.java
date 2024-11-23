package com.mikepn.selenium.pages.frames;

import com.mikepn.selenium.base.BaseTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FramesTest extends BaseTest {
    @Test
    public void testFramesBigBox(){
        var framesPage = homePage.goToAlertFrame().clickFrames();
        String actualBigboxText = framesPage.getTextInBigFrame();
        String expectedBigboxText = "This is a sample page";

        assertEquals(actualBigboxText, expectedBigboxText , "" +
                "\n The actual and expected text don not match \n");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";

        assertEquals(actualHeaderText , expectedHeaderText, "" +
                "\n The actual and expected header texts do not match \n");
    }

    @Test
    public void testFramesSmallBox(){
        var framesPage = homePage.goToAlertFrame().clickFrames();
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";

        assertEquals(actualSmallBoxText, expectedSmallBoxText, "" +
                "\n Actual and Expected texts do not match \n");

        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";

        assertEquals(actualHeaderText , expectedHeaderText, "" +
                "\n The actual and expected header texts do not match \n");
    }


}
