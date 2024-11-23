package com.mikepn.selenium.utils;

import com.mikepn.selenium.base.BasePage;
import org.openqa.selenium.WebDriver;

public class Util {

    public static WebDriver driver;

    public static void setUtilDriver() {
        driver = BasePage.driver;
    }
}
