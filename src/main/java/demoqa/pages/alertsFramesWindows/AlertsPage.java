package demoqa.pages.alertsFramesWindows;

import org.openqa.selenium.By;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsPage extends AlertsFramesWindowsPage{

    private By alertButton = By.id("alertButton");
    private By timerAlertButton = By.id("timerAlertButton");
    private By confirmButton = By.id("confirmButton");
    private By promptButton = By.id("promtButton");
    private By confirmResult = By.id("confirmResult");
    private By promptResult = By.id("promptResult");

    public void clickAlertButton() {
        scrollToElementJS(alertButton);
        click(alertButton);
    }

    public void clickTimerAlertButton() {
        scrollToElementJS(timerAlertButton);
        click(timerAlertButton);
    }

    public void clickConfirmButton() {
        scrollToElementJS(confirmButton);
        click(confirmButton);
    }

    public void clickPromptButton() {
        scrollToElementJS(promptButton);
        click(promptButton);
    }

    public String getConfirmResult() {
        scrollToElementJS(confirmResult);
        return find(confirmResult).getText();
    }

    public String getPromptResult() {
        scrollToElementJS(promptResult);
        return find(promptResult).getText();
    }

}
