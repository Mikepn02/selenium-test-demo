package com.mikepn.selenium.pages.widgets;

import com.mikepn.selenium.base.BaseTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SelectMultiDropdownTest extends BaseTest {

    @Test
    public void testMultiDropdown(){
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMultiSelect("Volvo");
        selectMenuPage.selectStandardMultiSelect(1);
        selectMenuPage.selectStandardMultiSelect("Audi");
        selectMenuPage.selectStandardMultiSelect(2);

        selectMenuPage.deselectStandardMultiSelect("saab");
        List<String> actualSelectedMultiOptions = selectMenuPage.getAllSelectedStandardMultiOptions();

        assertTrue(actualSelectedMultiOptions.contains("Volvo"));
        assertTrue(actualSelectedMultiOptions.contains("Opel"));
        assertTrue(actualSelectedMultiOptions.contains("Audi"));
        assertFalse(actualSelectedMultiOptions.contains("Saab"), "" +
                "\n Saab is selected as an option \n");
    }
}
