package part3_4.com.demoqa.tests.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.demoqa.pages.alertsFramesWindows.AlertsPage;
import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;
import static part3.demoqa.pages.BasePage.delay;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert() {
        AlertsPage alertsPage = homePage.goToAlertsFramesWindows().goToAlertsPage();
        alertsPage.clickAlertButton();
        String actualText = alertGetText();
        Assert.assertTrue(actualText.contains("You clicked a button"),
                "\n Alert text do not match with the expected text. \n");
        alertAccept();
    }

    @Test
    public void testTimerAlert() {
        AlertsPage alertsPage = homePage.goToAlertsFramesWindows().goToAlertsPage();
        alertsPage.clickTimerAlertButton();
        delay(5000);
        String actualText = alertGetText();
        Assert.assertTrue(actualText.contains("5 seconds"),
                "\n Alert text do not match with the expected text. \n");
        alertAccept();
    }

    @Test
    public void testConfirmationAlertOk() {
        AlertsPage alertsPage = homePage.goToAlertsFramesWindows().goToAlertsPage();
        alertsPage.clickConfirmButton();
        alertAccept();
        Assert.assertTrue(alertsPage.getConfirmResult().contains("Ok"),
                "\n Confirmation Alert doesn't contain the term Ok \n");
    }

    @Test
    public void testConfirmationAlertCancel() {
        AlertsPage alertsPage = homePage.goToAlertsFramesWindows().goToAlertsPage();
        alertsPage.clickConfirmButton();
        alertDismiss();
        Assert.assertTrue(alertsPage.getConfirmResult().contains("Cancel"),
                "\n Confirmation Alert doesn't contain the term Cancel \n");
    }

    @Test
    public void testPromptAlert() {
        AlertsPage alertsPage = homePage.goToAlertsFramesWindows().goToAlertsPage();
        alertsPage.clickPromptButton();
        String expectedText = "Expecto Textonas";
        alertSendKeys(expectedText);
        alertAccept();
        Assert.assertEquals(alertsPage.getPromptResult(), "You entered "+expectedText,
                "\n Alert text do not match with the expected text. \n");
    }

}
