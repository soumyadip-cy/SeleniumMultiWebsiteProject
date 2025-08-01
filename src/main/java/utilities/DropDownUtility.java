package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownUtility extends Utility {

    private static Select findDropDown(By locator) {
        return new Select(driver.findElement(locator));
    }

    //These methods are static so that they can be accessed without creating an object of the class.
    public static void selectByVisibleText(By locator, String text) {
        findDropDown(locator).selectByVisibleText(text);
    }

    public static void deselectByVisibleText(By locator, String text) {
        findDropDown(locator).deselectByVisibleText(text);
    }

    public static void selectByIndex(By locator, int index) {
        findDropDown(locator).selectByIndex(index);
    }

    public static void deselectByIndex(By locator, int index) {
        findDropDown(locator).deselectByIndex(index);
    }

    public static void selectByValue(By locator, String value) {
        findDropDown(locator).selectByValue(value);
    }

    public static void deselectByValue(By locator, String value) {
        findDropDown(locator).deselectByValue(value);
    }

    public static List<String> getAllSelectedOptions(By locator) {
        List<WebElement> allSelectedOptions =
                findDropDown(locator).getAllSelectedOptions();
        return allSelectedOptions.stream()
                .map(WebElement::getText).collect(Collectors.toList());
    }
}
