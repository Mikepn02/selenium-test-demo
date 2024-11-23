package com.mikepn.selenium.pages.widgets;

import com.mikepn.selenium.base.BaseTest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatePickerTest extends BaseTest {
    @Test
    public void testSelectingDate(){
        String month = "November";
        String monthNumber = "11";
        String day = "16";
        String year = "2024";
        var datePickerPage = homePage.goToWidgets().clickDatePicker();

        datePickerPage.clickSelectDateField();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;

        assertEquals(actualDate, expectedDate, "" +
                "\n The actual and Expected date doesn;t match \n");
    }
}
