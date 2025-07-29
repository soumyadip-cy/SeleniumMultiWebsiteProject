package com.demoqa.tests.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoqa.base.BaseTest;

public class WebTablesTest extends BaseTest {

    @Test
    public void testWebTable() {
        String email = "alden@example.com";
        String newAge = "70";
        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge(newAge);
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);
        Assert.assertEquals(actualAge, newAge, "\nAge is not 70\n");
    }
}
