package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static part3.demoqa.pages.BasePage.delay;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMultiVisibleText("Volvo");
        delay(500);
        selectMenuPage.selectStandardMultiIndex(1);
        delay(500);
        selectMenuPage.selectStandardMultiValue("audi");
        delay(500);
        selectMenuPage.selectStandardMultiIndex(2);
        delay(500);
        selectMenuPage.deselectStandardMulitVisibleText("Audi");
        delay(500);
        selectMenuPage.deselectStandardMulitIndex(2);
        delay(500);
        selectMenuPage.deselectStandardMulitIndex(0);
        delay(500);
        selectMenuPage.deselectStandardMulitValue("saab");
        delay(500);
    }
}
