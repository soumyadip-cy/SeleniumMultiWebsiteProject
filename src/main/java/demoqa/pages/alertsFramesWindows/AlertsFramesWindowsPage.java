package demoqa.pages.alertsFramesWindows;

import org.openqa.selenium.By;
import demoqa.pages.HomePage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsFramesWindowsPage extends HomePage {

    private By browserWindowsMenuItem = By.xpath("//span[text()='Browser Windows']");
    private By alertsMenuItem = By.xpath("//span[text()='Alerts']");
    private By framesMenuItem = By.xpath("//span[text()='Frames']");
    private By nestedFramesMenuItem = By.xpath("//span[text()='Nested Frames']");
    private By modalMenuItem = By.xpath("//span[text()='Modal Dialogs']");

    public ModalPage goToModalPage() {
        scrollToElementJS(modalMenuItem);
        click(modalMenuItem);
        return new ModalPage();
    }

    public AlertsPage goToAlertsPage() {
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }

}
