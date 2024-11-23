package com.mikepn.selenium.pages.elements;

import org.openqa.selenium.By;

import static com.mikepn.selenium.utils.GetUtil.getText;
import static com.mikepn.selenium.utils.WaitUtil.explicitWait;

public class DynamicPropertiesPage extends ElementsPage{

    private By visibleAfterButton = By.id("visibleAfter");

    public String getVisibleAfterButton() {
        explicitWait(5 , visibleAfterButton);
        String visibleText = getText(visibleAfterButton);
        return visibleText;
    }
}
