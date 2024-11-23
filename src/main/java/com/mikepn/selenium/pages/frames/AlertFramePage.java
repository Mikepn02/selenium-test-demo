package com.mikepn.selenium.pages.frames;

import com.mikepn.selenium.pages.HomePage;
import org.openqa.selenium.By;

import static com.mikepn.selenium.utils.JavascriptUtil.scrollToElementJs;

public class AlertFramePage extends HomePage {
    private By modalDialogMenuItem = By.xpath("//li[@id='item-4']/span[text() ='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");
    private By framesMenuItem = By.xpath("//li[@id='item-2']/span[text()='Frames']");
    private By browserWindowsMenuItem = By.xpath("//li[@id='item-0']/span[text()='Browser Windows']");


    public BrowserWindowPage clickBrowserWindow(){
        scrollToElementJs(browserWindowsMenuItem);
        click(browserWindowsMenuItem);
        return new BrowserWindowPage();
    }

    public FramesPage clickFrames(){
        scrollToElementJs(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }
    public AlertsPage clickAlerts(){
        scrollToElementJs(alertsMenuItem);
        click(alertsMenuItem);
        return  new AlertsPage();
    }

    public ModalDialogsPage clickModalDialogs(){
        scrollToElementJs(modalDialogMenuItem);
        click(modalDialogMenuItem);
        return new ModalDialogsPage();
    }
}
