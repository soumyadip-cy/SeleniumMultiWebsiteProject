package part3.demoqa.pages.alertsFramesWindows;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ModalPage extends AlertsFramesWindowsPage {

    private By smallModalButton = By.xpath("//button[text()='Small modal']");
    private By largeModalButton = By.xpath("//button[text()='Large modal']");
    private By modalContent = By.xpath("//div[@class='modal-body']");
    private By closeButton = By.xpath("//button[text()='Close']");
    private By xButton = By.xpath("//button/span[text()='Close']/..");

    public void clickSmallModalButton() {
        scrollToElementJS(smallModalButton);
        click(smallModalButton);
    }

    public void clickLargeModalButton() {
        scrollToElementJS(largeModalButton);
        click(largeModalButton);
    }

    public String getModalText() {
        return find(modalContent).getText();
    }

    public void clickCloseButton() {
        scrollToElementJS(closeButton);
        click(closeButton);
    }

    public void clickXButton() {
        scrollToElementJS(xButton);
        click(xButton);
    }

}
