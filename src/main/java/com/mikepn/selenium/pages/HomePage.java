package com.mikepn.selenium.pages;

import com.mikepn.selenium.base.BasePage;
import com.mikepn.selenium.frames.AlertFramePage;
import com.mikepn.selenium.pages.elements.ElementsPage;
import com.mikepn.selenium.pages.forms.FormsPage;
import com.mikepn.selenium.pages.widgets.WidgetPage;
import org.openqa.selenium.By;

import static com.mikepn.selenium.utils.JavascriptUtil.scrollToElementJs;

public class HomePage extends BasePage {


    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Element']");
    private By widgetCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By alertFrames = By.xpath("//div[@id='app']//h5[contains(text(), 'Frames')]");


    public FormsPage gotToForms(){
        scrollToElementJs(formsCard);
        click(formsCard);
        return new FormsPage();
    }


    public AlertFramePage goToAlertFrame(){
        scrollToElementJs(alertFrames);
        click(alertFrames);
        return new AlertFramePage();
    }


    public ElementsPage getElements(){
        scrollToElementJs(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetPage goToWidgets(){
        scrollToElementJs(widgetCard);
        click(widgetCard);
        return new WidgetPage();
    }



}