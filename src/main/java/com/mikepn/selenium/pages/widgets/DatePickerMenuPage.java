package com.mikepn.selenium.pages.widgets;

import org.openqa.selenium.By;

import static com.mikepn.selenium.utils.DropdownUtil.selectVisibleText;

public class DatePickerMenuPage extends WidgetPage{

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.cssSelector(".react-datepicker__year-select");


    public By dayValue(String day){
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
    }

    public void clickDay(String day){
        click(dayValue(day));
    }

    public boolean isDayInMonth(String day){
        return find(dayValue(day)).isDisplayed();
    }


    public void clickSelectDateField() {
        click(selectDateField);
    }

    public String getDate(){
        return find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month){
        selectVisibleText(monthDropDown ,month);
    }

    public void selectYear(String year){
        selectVisibleText(yearDropDown,year);
    }


}
