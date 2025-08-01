package com.demoqa.base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import demoqa.pages.BasePage;
import demoqa.pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

import static demoqa.pages.BasePage.delay;
import static utilities.Utility.setUtilityDriver;


public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private final String DEMOQA_URL = "https://demoqa.com/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    // Takes screenshot after failure of a test
    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult) {
        if(ITestResult.FAILURE == testResult.getStatus()) {
            //Contains a reference to WebDriver cast to TakesaScreenshot interface for it to be able to take screenshots.
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            //Performs taking of a screenshot and gives output as a file and stores its location.
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            //The destination of the screenshots to be copied to
            File destination = new File(System.getProperty("user.dir") + "/resources/screenshots/("
                    + java.time.LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy--hh-mm-ss-a")) + ")" + testResult.getName() + ".png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Screenshot location: "+destination);
            }
        }
    }

    @AfterClass
    public void tearDown() {
        delay(500);
        driver.quit();
    }
}
