package part3.demoqa.pages.widgets;

import org.openqa.selenium.By;
import part3.demoqa.pages.HomePage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {

    private By selectMenuMenuItem = By.xpath("//span[text()='Select Menu']");
    private By selectDatePickerMenuItem = By.xpath("//span[text()='Date Picker']");

    public SelectMenuPage clickSelectMenu() {
        scrollToElementJS(selectMenuMenuItem);
        click(selectMenuMenuItem);
        return new SelectMenuPage();
    }

    public DatePickerMenuPage clickDatePicker() {
        scrollToElementJS(selectDatePickerMenuItem);
        click(selectDatePickerMenuItem);
        return new DatePickerMenuPage();
    }
}
