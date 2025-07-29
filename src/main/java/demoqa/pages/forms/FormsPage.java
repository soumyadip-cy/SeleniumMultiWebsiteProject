package demoqa.pages.forms;

import org.openqa.selenium.By;
import demoqa.pages.HomePage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {

    private By practiceFormMenuItem = By.xpath("//div[@id='app']//li[@id='item-0']//span[text()='Practice Form']/..");

    public PracticeFormPage clickPracticeForm() {
        scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }

}
