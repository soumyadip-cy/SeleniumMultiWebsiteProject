package utilities;

import org.openqa.selenium.WebDriver;
import part3.demoqa.pages.BasePage;

public class Utility {

    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }
}
