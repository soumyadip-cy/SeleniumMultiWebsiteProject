package part3_4.com.demoqa.tests.part4.modals;

import org.testng.Assert;
import org.testng.annotations.*;
import part3.demoqa.pages.alertsFramesWindows.AlertsFramesWindowsPage;
import part3.demoqa.pages.alertsFramesWindows.ModalPage;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void testSmallModalDialog() {
        AlertsFramesWindowsPage afwPage = homePage.goToAlertsFramesWindows();
        ModalPage modalPage = afwPage.goToModalPage();
        modalPage.clickSmallModalButton();
        String actualModalText = modalPage.getModalText();
        Assert.assertTrue(actualModalText.contains("small modal"),
                "\n Text doesn't contain 'small modal'\n");
        modalPage.clickCloseButton();
    }

    @Test
    public void testLargeModalDialog() {
        ModalPage modalPage = homePage.goToAlertsFramesWindows().goToModalPage();
        modalPage.clickLargeModalButton();
        String actualModalText = modalPage.getModalText();
        Assert.assertTrue(actualModalText.contains("Lorem Ipsum"),
                "\n Text doesn't contain 'Lorem Ipsum'\n");
        modalPage.clickXButton();
    }

}
