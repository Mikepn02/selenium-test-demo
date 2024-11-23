package com.mikepn.selenium.pages.widgets;

import org.openqa.selenium.By;

import static com.mikepn.selenium.utils.ActionUtil.dragAndDropBy;
import static com.mikepn.selenium.utils.GetUtil.getAttribute;

public class SliderPage extends WidgetPage{
    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private By sliderValue = By.id("sliderValue");


    public String getSliderValue(){
        return getAttribute(sliderValue, "value");
    }

    public void moveSlider(int x , int y){
        dragAndDropBy(find(slider),x,y);
    }
}
