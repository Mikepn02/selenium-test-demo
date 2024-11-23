package com.mikepn.selenium.pages.windows;

import com.mikepn.selenium.base.BaseTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.mikepn.selenium.utils.GetUtil.getCurrentURL;

public class WindowsTest extends BaseTest {
    @Test
    public void testNewwindowsURL() {
        var windowspage = homePage.goToAlertFrame().clickBrowserWindow();
        windowspage.clickNewWindow();
        windowspage.switchToNewWindow();
        String actualURL = getCurrentURL();
        String expectedURL = "https://demoqa.com/sample";
        assertEquals(actualURL, expectedURL, "\n Actual and Expected URL do not match\n");
    }
}
