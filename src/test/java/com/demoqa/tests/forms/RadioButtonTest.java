package com.demoqa.tests.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        Assert.assertTrue(formsPage.isFemaleSelected(), "\nFemale Radio Button is not selected !\n");
    }
}
