package com.demoqa.tests.screenshots;

import org.testng.annotations.Test;
import demoqa.pages.forms.PracticeFormPage;
import com.demoqa.base.BaseTest;

public class CaptureFailedScreenshotTest extends BaseTest {

    @Test
    public void testClickSubmitWithoutScrolling() {
        PracticeFormPage practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }

}
