package com.mikepn.selenium.forms;

import com.mikepn.selenium.base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.gotToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadionButtonSelected = formsPage.isFemaleRadioButtonSelected();
        assertTrue(isFemaleRadionButtonSelected,
                "\n Female Radion Button is not selected \n");
    }
}
