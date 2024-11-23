package com.mikepn.selenium.forms;

import com.mikepn.selenium.base.BaseTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CheckBoxTest extends BaseTest {


    @Test
    public void testCheckBox() {
        var formsPage = homePage.gotToForms().clickPracticeForm();
        formsPage.clickSportsHobbyCheckBox();
        formsPage.clickReadingHobbyCheckBox();
        formsPage.clickMusicHobbyCheckBox();
        formsPage.unclickReadingHobbyCheckBox();

        boolean isReadingSelected = formsPage.isReadingHobbyCheckBoxSelected();
        assertFalse(isReadingSelected,
                "\n The Reading checkbox is selected \n");
    }
}
