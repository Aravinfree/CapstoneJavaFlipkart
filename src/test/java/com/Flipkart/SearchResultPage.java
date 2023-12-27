package com.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BaseTest {

	private WebDriver driver;
	
    @FindBy(xpath = "//div[@data-id][1]//a[@target='_blank']")
    private WebElement firstResult;

    public SearchResultPage(WebDriver driver) {
    	this.setDriver(driver);
        PageFactory.initElements(driver, this);
    }
    
    public void clickOnFirstResult() {
        firstResult.click();
        System.out.println("Scenario 2: PASS : Click on First element successful...");
    }

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}

