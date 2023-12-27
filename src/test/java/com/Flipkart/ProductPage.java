package com.Flipkart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BaseTest{

    private WebDriver driver;
    
    @FindBy(xpath = "//button[text()='Add to cart']")
    private WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAddToCart() throws InterruptedException {
    	Thread.sleep(5);
    	Set<String> allWindowHandles = driver.getWindowHandles();
    	List<String> windowHandlesList = new ArrayList<>(allWindowHandles);
    	driver.switchTo().window(windowHandlesList.get(1));
    	
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15)); // 5 seconds timeout

    	// Example: Wait for an element to be clickable
    	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
    	
        element.click();
        System.out.println("Scenario 3: PASS : Click on Add to Cart button successfully...");
        Thread.sleep(10);
        driver.navigate().refresh();
        WebDriverWait waitGoToCart = new WebDriverWait(driver,Duration.ofSeconds(15)); // 5 seconds timeout

    	// Example: Wait for an element to be clickable
    	WebElement gotocartElement = waitGoToCart.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='GO TO CART']")));
    	if(gotocartElement.isDisplayed()) {
    		System.out.println("Scneario 4 : PASS : Product Added to cart successfully...");
    	}
    }
}
