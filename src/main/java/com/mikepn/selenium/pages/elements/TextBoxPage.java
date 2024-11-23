package com.mikepn.selenium.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.mikepn.selenium.utils.ActionUtil.sendKeys;
import static com.mikepn.selenium.utils.GetUtil.getText;
import static com.mikepn.selenium.utils.JavascriptUtil.scrollToElementJs;
import static com.mikepn.selenium.utils.WaitUtil.explicitWait;

public class TextBoxPage extends ElementsPage {

    private By fullNameField = By.id("userName");
    private By currentAddress = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");


    public String getCurrentAddress() {
      explicitWait(5 , currentAddressResult);
      return getText(currentAddressResult);
    }

    public void clickSubmitButton() {
        scrollToElementJs(submitButton);
        click(submitButton);
    }

    public void setCurrentAddress(String address){
        find(currentAddress).sendKeys(address + Keys.ENTER);
    }

    public void setFullName(String name) {
        scrollToElementJs(fullNameField);
        sendKeys(find(fullNameField), name);
    }

    public void setEmail(String email) {
        setFullName(Keys.chord(Keys.TAB, email));
    }
}
