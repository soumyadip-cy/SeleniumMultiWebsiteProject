package com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {

    private void errorMessageCheck(String expectedErrorMessage) {

        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(
                actualErrorMessage.contains(expectedErrorMessage),
                "Didn't get the expected error message"
        );

    }

    @BeforeMethod
    public void refresh() {

        //If the login page is not refreshed before the start of every test,
        //then the previous error message is captured by the program,
        //as the element stays with the previous error message before
        //the new error message appears.
        driver.navigate().refresh();

    }

    @Test
    public void testLoginErrorMessage() {

        loginPage.setUsername("standard_user");
        loginPage.setPassword("not_secret_sauce");
        loginPage.clickLoginButton();

        String expectedErrorMessage = "Username and password do not match any user in this service";

        errorMessageCheck(expectedErrorMessage);

    }

    @Test
    public void testNoUsernameError() {

        loginPage.setUsername("");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();

        String expectedErrorMessage = "Username is required";

        errorMessageCheck(expectedErrorMessage);

    }

    @Test
    public void testNoPasswordError() {

        loginPage.setUsername("standard_user");
        loginPage.setPassword("");
        loginPage.clickLoginButton();

        String expectedErrorMessage = "Password is required";

        errorMessageCheck(expectedErrorMessage);

    }
}
