package com.mikepn.selenium.pages.elements;

import org.openqa.selenium.By;

import static com.mikepn.selenium.utils.JavascriptUtil.scrollToElementJs;

public class LinksPage extends ElementsPage{

    private By badRequestLink = By.id("bad-request");
    private By linkResponseLink = By.id("linkResponse");


    public void clickBadRequestLink() {
        scrollToElementJs(badRequestLink);
        click(badRequestLink);
    }

    public String getLinkResponse() {
        delay(2000);
        return find(linkResponseLink).getText();
    }
}
