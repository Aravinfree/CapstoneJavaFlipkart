package com.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    protected WebDriver driver;
   
    @BeforeSuite
    public void setUp() throws InterruptedException {
        // Initialize WebDriver (e.g., ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\WorkSpace\\CapstoneJava_Flipkart\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	
    }

    @AfterSuite
    public void tearDown() {
        // Close the WebDriver instance
        if (driver != null) {
            driver.quit();
        }
    }
}
