package part3.demoqa.pages.widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavaScriptUtility.*;

public class DatePickerMenuPage extends WidgetsPage{

    private By selectDateField = By.xpath("//input[@id='datePickerMonthYearInput']");
    private By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.className("react-datepicker__year-select");
    private By dateTimePicker = By.id("dateAndTimePickerInput");

    //This is not a test method as test methods shouldn't have access to built-in selenium methods.
    private By dayValue(String day) {
        String dayXpath = "//div[contains(@class, 'react-datepicker__day react-datepicker__day--0')][text()='"+day+"']";
        return By.xpath(dayXpath);
    }

    public void clickDay(String day) {
//        click(dayValue(day));
        clickJS(dayValue(day));

    }

    public void clickSelectDate() {
        click(selectDateField);
    }

    public String getDate() {
        return find(selectDateField).getDomProperty("value");
    }

    public void selectMonth(String month) {
        selectByVisibleText(monthDropDown, month);
    }

    public void selectYear(String year) {
        selectByVisibleText(yearDropDown, year);
    }
}
