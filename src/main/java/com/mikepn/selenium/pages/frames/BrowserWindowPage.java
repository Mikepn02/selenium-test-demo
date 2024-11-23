package com.mikepn.selenium.pages.frames;

import org.openqa.selenium.By;

import java.util.Set;

import static com.mikepn.selenium.utils.SwitchUtil.switchToWindow;

public class BrowserWindowPage extends AlertFramePage {
    private By newWindowButton = By.id("windowButton");

    public void clickNewWindow() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {

        String currentHandler = driver.getWindowHandle();
        System.out.println("Main window ID: " + currentHandler);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("Number of open windows: " + allHandles.size());

        for (String handle : allHandles) {
            if(currentHandler.equals(handle)) {
                System.out.println("1st window id: " + handle);
            }else{
                switchToWindow(handle);
                System.out.println("Second window id: " + handle);
            }
        }
    }
}
