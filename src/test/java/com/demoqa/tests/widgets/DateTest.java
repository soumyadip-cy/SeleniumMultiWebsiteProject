package com.demoqa.tests.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {

    private String getMonthNumber(String month) {
        return switch (month) {
            case "January" -> "1";
            case "February" -> "2";
            case "March" -> "3";
            case "April" -> "4";
            case "May" -> "5";
            case "June" -> "6";
            case "July" -> "7";
            case "August" -> "8";
            case "September" -> "9";
            case "October" -> "10";
            case "November" -> "11";
            case "December" -> "12";
            default -> "0";
        };
    }

    @Test
    public void testSelectingDate() {

        String year = "2077";
        String month = "December";
        String day = "31";

        var datePickerPage = homePage.goToWidgets().clickDatePicker();

        datePickerPage.clickSelectDate();
        datePickerPage.selectYear(year);
        datePickerPage.selectMonth(month);
        datePickerPage.clickDay(day);
        String actualDate = datePickerPage.getDate();
        String expectedDate = getMonthNumber(month)+"/"+day+"/"+year;

        Assert.assertEquals(actualDate, expectedDate, "Expected date is not same as actual date !");
    }
}
