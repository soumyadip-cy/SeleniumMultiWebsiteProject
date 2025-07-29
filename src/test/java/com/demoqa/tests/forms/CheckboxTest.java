package com.demoqa.tests.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.unclickReadingCheckbox();

        Assert.assertFalse(formsPage.isReadingCheckboxSelected(), "\nReading checkbox is selected\n");
    }
}
