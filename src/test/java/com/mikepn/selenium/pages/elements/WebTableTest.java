package com.mikepn.selenium.pages.elements;

import com.mikepn.selenium.base.BaseTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable(){
        String email = "cierra@example.com";
        String expectedAge = "68";
        var webTablePage = homePage.getElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("68");
        webTablePage.clickSubmitButton();

        String actualAge = webTablePage.getTableAge(email);

        assertEquals(actualAge , expectedAge ,
                "\n Actual and Expected age don not match \n");
    }
}
