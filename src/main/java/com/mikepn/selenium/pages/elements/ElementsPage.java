package com.mikepn.selenium.pages.elements;

import com.mikepn.selenium.pages.HomePage;
import org.openqa.selenium.By;

import static com.mikepn.selenium.utils.JavascriptUtil.scrollToElementJs;

public class ElementsPage extends HomePage {

    private By webTableMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By links = By.xpath("//li[@id='item-5']/span[text()='Links']");
    private By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-8']/span[text()='Dynamic Properties']");
    private By textBoxMenuItem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");



   public TextBoxPage clickTextBox(){
       scrollToElementJs(textBoxMenuItem);
       click(textBoxMenuItem);
       return new TextBoxPage();
   }


   public DynamicPropertiesPage clickDynamicProperties(){
       scrollToElementJs(dynamicPropertiesMenuItem);
       click(dynamicPropertiesMenuItem);
       return new DynamicPropertiesPage();
   }

   public LinksPage clickLinks(){
       scrollToElementJs(links);
       click(links);
       return new LinksPage();
   }

   public WebTablePage clickWebTables(){
       scrollToElementJs(webTableMenuItem);
       click(webTableMenuItem);
       return new WebTablePage();
   }
}
