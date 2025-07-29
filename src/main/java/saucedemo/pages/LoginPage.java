package saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector(".login-box h3");

    public void resetFields() {
        setUsername("");
        setPassword("");
    }

    public void setUsername(String username) {
        setText(usernameField, username);
    }

    public void setPassword(String password) {
        setText(passwordField, password);
    }

    //TransitionMethod
    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }

    //ConvenienceMethod & TransitionMethod
    public ProductsPage logInToApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }
}
