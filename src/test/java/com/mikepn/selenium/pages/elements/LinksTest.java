package com.mikepn.selenium.pages.elements;

import com.mikepn.selenium.base.BaseTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinksTest extends BaseTest {

    @Test
    public void testWebLink() {
        var linksPage = homePage.getElements().clickLinks();
        linksPage.clickBadRequestLink();
        String actualResponse =  linksPage.getLinkResponse();

        assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"),
                "\n Actual Response (" + actualResponse + ") \n Does not contain 400 and Bad Request");
    }
}
