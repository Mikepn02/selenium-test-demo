package com.mikepn.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptUtil extends Util {

    public static void scrollToElementJs(By locator) {
        WebElement element = driver.findElement(locator);
        String jsScript = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor) driver).executeScript(jsScript, element);
    }

    public static void clickJs(By locator) {
        WebElement element = driver.findElement(locator);
        String jsScript =  "arguments[0].click();";
        ((JavascriptExecutor) driver).executeScript(jsScript, element);
    }
}
