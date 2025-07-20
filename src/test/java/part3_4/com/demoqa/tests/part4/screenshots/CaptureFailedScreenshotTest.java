package part3_4.com.demoqa.tests.part4.screenshots;

import org.testng.annotations.Test;
import part3.demoqa.pages.forms.PracticeFormPage;
import part3_4.com.demoqa.base.BaseTest;

public class CaptureFailedScreenshotTest extends BaseTest {

    @Test
    public void testClickSubmitWithoutScrolling() {
        PracticeFormPage practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }

}
