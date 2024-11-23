package com.mikepn.selenium.pages.forms;

import org.openqa.selenium.By;

import static com.mikepn.selenium.utils.JavascriptUtil.clickJs;
import static com.mikepn.selenium.utils.JavascriptUtil.scrollToElementJs;

public class PracticeFormPage extends FormsPage{

    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckBox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckBox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckBox = By.id("hobbies-checkbox-3");
    private By submitButton = By.id("submit");


    public void clickFemaleRadioButton() {
        scrollToElementJs(femaleRadioButton);
        clickJs(femaleRadioButton);
    }


    public boolean isFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsHobbyCheckBox(){
       if(!find(sportsHobbyCheckBox).isSelected()){
           scrollToElementJs(sportsHobbyCheckBox);
           clickJs(sportsHobbyCheckBox);
       }
    }


    public void clickReadingHobbyCheckBox(){
        if(!find(readingHobbyCheckBox).isSelected()){
            scrollToElementJs(readingHobbyCheckBox);
            clickJs(readingHobbyCheckBox);
        }
    }


    public void unclickReadingHobbyCheckBox(){
        if(find(readingHobbyCheckBox).isSelected()){
            scrollToElementJs(readingHobbyCheckBox);
            clickJs(readingHobbyCheckBox);
        }
    }


    public void clickMusicHobbyCheckBox(){
        if(!find(musicHobbyCheckBox).isSelected()){
            scrollToElementJs(musicHobbyCheckBox);
            clickJs(musicHobbyCheckBox);
        }
    }

    public boolean isReadingHobbyCheckBoxSelected() {
        return find(readingHobbyCheckBox).isSelected();
    }

    public void clickSubmitButton() {
        click(submitButton);
    }
}
