package com.mikepn.selenium.pages.widgets;

import com.mikepn.selenium.base.BasePage;
import org.openqa.selenium.By;

import java.util.List;

import static com.mikepn.selenium.utils.DropdownUtil.*;
import static com.mikepn.selenium.utils.DropdownUtil.getAllSelectedOptions;
import static com.mikepn.selenium.utils.JavascriptUtil.scrollToElementJs;

public class SelectMenuPage extends BasePage {

    private By standardMultiSelect = By.id("cars");

    public void selectStandardMultiSelect(String text) {
        scrollToElementJs(standardMultiSelect);
        selectVisibleText(standardMultiSelect , text);
    }

    public void selectStandardMultiSelect(int index) {
        scrollToElementJs(standardMultiSelect);
        selectByIndex(standardMultiSelect,index);
    }


    public void deselectStandardMultiSelect(String value) {
        scrollToElementJs(standardMultiSelect);
        deselectByValue(standardMultiSelect,value);
    }

    public List<String> getAllSelectedStandardMultiOptions(){
        return getAllSelectedOptions(standardMultiSelect);
    }
}
