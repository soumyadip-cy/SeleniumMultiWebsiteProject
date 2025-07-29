package com.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginFailTest {

    //This declares the creation of a driver object from the interface WebDriver
    //that would store an instance of a browser's driver
    WebDriver driver;

    //This annotation would make this run before any method is run in the test suite.
    //This annotation also makes sure that it is run only once per execution of the test suite.
    @BeforeClass
    public void setUp() {
        //Instantiates a ChromeDriver object
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    //This annotation makes this method to run after the execution of the test methods
    @AfterClass
    public void tearDown() {
        //Closes the current window
//        driver.close();
        //Closes all the windows and also quits the driver
        driver.quit(); //Standard for Selenium
    }

    //This annotation is used to signal that this method is a test
    @Test
    public void testLoggingIntoApplication() throws InterruptedException {

        Thread.sleep(2000);
        WebElement loginTextbox = driver.findElement(By.name("username"));
        WebElement passwordTextbox = driver.findElement(By.name("password"));
//        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        loginTextbox.sendKeys("Admin");
        passwordTextbox.sendKeys("admin1234");
//        loginButton.click();

        Thread.sleep(1000);
        driver.findElement(By.tagName("button")).click();

//        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String actualResult = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
        String expectedResult = "Invalid credentials";

        Assert.assertEquals(actualResult, expectedResult);

        Thread.sleep(1000);
    }

}
