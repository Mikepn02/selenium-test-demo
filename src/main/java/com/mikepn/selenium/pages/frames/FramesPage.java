package com.mikepn.selenium.pages.frames;

import org.openqa.selenium.By;

import static com.mikepn.selenium.utils.SwitchUtil.*;
import static com.mikepn.selenium.utils.SwitchUtil.switchToDefaultContent;

public class FramesPage extends AlertFramePage {
    private By textInFrame = By.id("sampleHeading");
    private String iFrameBox = "frame1";
    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }

    private void switchToBigBox(){
        switchToFrameString(iFrameBox);
    }
    private void switchToSmallBox(){
//        switchToFrameIndex(3);
        switchToFrameElement(find(iFrameSmallBox));
    }

    public String getTextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }


    public String getTextInSmallFrame(){
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
