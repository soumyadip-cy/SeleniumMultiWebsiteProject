package demoqa.pages.widgets;

import org.openqa.selenium.By;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.*;

public class SelectMenuPage extends WidgetsPage {

    private final By standardMultiSelect = By.id("cars");

    public void selectStandardMultiVisibleText(String text) {
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect, text);
    }

    public void deselectStandardMulitVisibleText(String text) {
        scrollToElementJS(standardMultiSelect);
        deselectByVisibleText(standardMultiSelect, text);
    }

    public void selectStandardMultiValue(String value) {
        scrollToElementJS(standardMultiSelect);
        selectByValue(standardMultiSelect, value);
    }

    public void deselectStandardMulitValue(String value) {
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }

    public void selectStandardMultiIndex(int index) {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    public void deselectStandardMulitIndex(int index) {
        scrollToElementJS(standardMultiSelect);
        deselectByIndex(standardMultiSelect, index);
    }

    public List<String> getAllSelectedStandardMultiOptions() {
        scrollToElementJS(standardMultiSelect);
        return getAllSelectedOptions(standardMultiSelect);
    }
}
