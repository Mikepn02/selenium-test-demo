package com.mikepn.selenium.pages.modals;

import com.mikepn.selenium.base.BaseTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModalTest extends BaseTest {
    @Test
    public void testModalDialog() {
        var afwPage = homePage.goToAlertFrame().clickModalDialogs();
        var modalDialogsPage = afwPage.clickModalDialogs();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();



        assertTrue(actualText.contains("small modal"),
                "\n The Message doesn't contain the small modal \n");

        modalDialogsPage.clickCloseButton();
    }
}
