package com.mikepn.selenium.pages.wait;

import com.mikepn.selenium.base.BaseTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicWaitTest extends BaseTest {

    @Test
    public void testVisibleAfterButton(){
        var dynamicPage = homePage.getElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButton();
        String expectedText = "Visible After 5 Seconds";
        assertEquals(actualText, expectedText, "\n Actual and Expected Text Do not match \n");
    }

    @Test
    public void testProgressBar(){
        var progressBar = homePage.goToWidgets().clickProgressBar();
        progressBar.clickStartButton();
        String actualValue = progressBar.getProgressValue();
        String expectedValue = "100%";

        assertEquals(actualValue, expectedValue, "\n Actual and Expected Value Do not match \n");
    }
}
