package com.mikepn.selenium.pages.widgets;

import org.openqa.selenium.By;

import static com.mikepn.selenium.utils.GetUtil.getText;
import static com.mikepn.selenium.utils.WaitUtil.FluentWait;


public class ProgressBarPage extends WidgetPage{
    private By startButton = By.id("startStopButton");
    private By progressValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");

    public void clickStartButton() {
        click(startButton);
    }

    public String getProgressValue() {
        FluentWait(30 , progressValue);
        return getText(progressValue);
    }
}
