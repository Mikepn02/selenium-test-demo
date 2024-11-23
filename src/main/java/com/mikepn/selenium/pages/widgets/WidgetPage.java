package com.mikepn.selenium.pages.widgets;

import com.mikepn.selenium.pages.HomePage;
import org.openqa.selenium.By;

import static com.mikepn.selenium.utils.JavascriptUtil.scrollToElementJs;

public class WidgetPage extends HomePage {

    private By selectMenuItem = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private By datePickerMenuItem = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");
    private By progressBarMenuItem = By.xpath("//li[@id='item-4']/span[text()='Progress Bar']");
    private By sliderMenuItem = By.xpath("//li[@id='item-3']/span[text() ='Slider']");

    public SliderPage clickSlider(){
        scrollToElementJs(sliderMenuItem);
        click(sliderMenuItem);
        return new SliderPage();
    }

    public ProgressBarPage clickProgressBar(){
        scrollToElementJs(progressBarMenuItem);
        click(progressBarMenuItem);
        return new ProgressBarPage();
    }

    public SelectMenuPage clickSelectMenu() {
        scrollToElementJs(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

    public DatePickerMenuPage clickDatePicker(){
        scrollToElementJs(datePickerMenuItem);
        click(datePickerMenuItem);
        return new DatePickerMenuPage();
    }
}
