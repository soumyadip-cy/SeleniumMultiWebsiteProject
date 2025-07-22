package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchToUtility extends Utility{

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static String alertGetText() {
        return switchTo().alert().getText();
    }

    public static void alertAccept() {
        switchTo().alert().accept();
    }

    public static void alertDismiss() {
        switchTo().alert().dismiss();
    }

    public static void alertSendKeys(String text) {
        switchTo().alert().sendKeys(text);
    }

}
