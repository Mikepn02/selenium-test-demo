package com.mikepn.selenium.pages.interactions;

import com.mikepn.selenium.base.BaseTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SliderTest extends BaseTest {


    @Test
    public void testSlider() {
        int x=180;
        int y=0;
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(x, y);

        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "78";

        assertEquals(actualValue, expectedValue, "\n Actual and Expected values do not match \n");
    }
}
