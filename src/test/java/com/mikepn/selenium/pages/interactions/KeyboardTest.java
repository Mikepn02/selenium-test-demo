package com.mikepn.selenium.pages.interactions;

import com.mikepn.selenium.base.BaseTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KeyboardTest extends BaseTest {

    @Test
    public void testAppUsingKeyboard(){
        var textBoxPage = homePage.getElements().clickTextBox();
        textBoxPage.setFullName("Nzabera Mike Peter");
        textBoxPage.setEmail("nzaberamikepeter@gmail.com");
        textBoxPage.setCurrentAddress("1234 Selenium Avenue");
        textBoxPage.setCurrentAddress("Suite 3400");
        textBoxPage.setCurrentAddress("Mukamira, Nyabihu");

        textBoxPage.clickSubmitButton();

        String actualAddress = textBoxPage.getCurrentAddress();
        assertTrue(actualAddress.contains("Suite 3400"), "\n Actual address does not contain Suite 3400 \n");
    }
}
