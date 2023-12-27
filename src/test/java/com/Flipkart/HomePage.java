package com.Flipkart;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest{

    private WebDriver driver;
    
    @FindBy(xpath = "//img[@title='Flipkart']")
    private WebElement flipkartLink;
    
    @FindBy(name = "q")
    private WebElement searchbox;
    
    public HomePage(WebDriver driver) {
        this.setDriver(driver);
        PageFactory.initElements(driver, this);
    }
  
    public boolean isFlipkartLinkDisplayed() {
    	if(flipkartLink.isDisplayed()) {
    		System.out.println("Scenario 1 : PASS : Flipkart Logo is available...");
    	}
        return flipkartLink.isDisplayed();
    }

	public void enterSearchText() {
		searchbox.sendKeys("MacBook air m2");
		searchbox.sendKeys(Keys.RETURN);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
