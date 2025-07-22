package part3.demoqa.pages;

import org.openqa.selenium.By;
import part3.demoqa.pages.alertsFramesWindows.AlertsFramesWindowsPage;
import part3.demoqa.pages.elements.ElementsPage;
import part3.demoqa.pages.forms.FormsPage;
import part3.demoqa.pages.widgets.WidgetsPage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By alertsFramesWindowsCard = By.xpath("//div[@id='app']//h5[contains(text(), 'Alerts')]");

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements() {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets() {
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public AlertsFramesWindowsPage goToAlertsFramesWindows() {
        scrollToElementJS(alertsFramesWindowsCard);
        click(alertsFramesWindowsCard);
        return new AlertsFramesWindowsPage();
    }

}
