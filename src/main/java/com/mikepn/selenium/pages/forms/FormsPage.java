package com.mikepn.selenium.pages.forms;

import com.mikepn.selenium.pages.HomePage;
import org.openqa.selenium.By;

import static com.mikepn.selenium.utils.JavascriptUtil.scrollToElementJs;

public class FormsPage extends HomePage {
   private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

   public PracticeFormPage clickPracticeForm() {
       scrollToElementJs(practiceFormMenuItem);
       click(practiceFormMenuItem);
       return new PracticeFormPage();
   }
}
