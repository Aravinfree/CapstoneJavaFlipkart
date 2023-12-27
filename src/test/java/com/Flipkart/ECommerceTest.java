package com.Flipkart;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ECommerceTest extends BaseTest {
	
	HomePage homePage;
    SearchResultPage searchResultPage;
    ProductPage productPage;
    
    
    @BeforeClass
    public void setUpPages() {
    	
        homePage = new HomePage(driver);
        searchResultPage = new SearchResultPage(driver);
        productPage = new ProductPage(driver);
        driver.get("https://www.flipkart.com/");
    }
    
    @Test(priority = 1, enabled = true)
    public void verifyFlipkartPresence() {
    	
    	//driver.get("https://www.flipkart.com/");
    	Assert.assertTrue(homePage.isFlipkartLinkDisplayed(), "Flipkart link is not displayed.");
    }
    @Test(priority = 2, enabled = true)
    public void SearchText() {
        homePage.enterSearchText();
    }
    
    @Test(priority = 3, enabled = true)
    public void NavigateResult() {
    	searchResultPage.clickOnFirstResult();
    }
    @Test(priority = 4, enabled = true)
    public void clickOnAddToCartAndVerify() {
    	try {
			productPage.clickOnAddToCart();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}
