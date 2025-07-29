package com.demoqa.tests.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoqa.base.BaseTest;

import java.util.List;

import static demoqa.pages.BasePage.delay;

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
        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();
        for(String opt : new String[]{"Volvo", "Opel", "Saab", "Audi"}) {
            Assert.assertTrue(actualSelectedOptions.contains(opt), opt+" : not found !");
        }
        delay(500);
        selectMenuPage.deselectStandardMulitVisibleText("Audi");
        delay(500);
        selectMenuPage.deselectStandardMulitIndex(2);
        delay(500);
        selectMenuPage.deselectStandardMulitIndex(0);
        delay(500);
        selectMenuPage.deselectStandardMulitValue("saab");
    }
}
