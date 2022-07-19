package com.target.testPages.HomePageTest;

import com.target.pages.HomePage;
import com.target.pages.TargetHomePage;
import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.target.pageElement.HomePageElements.verifySearchedProductWebElement;
import static com.target.pageElement.TargetHomePageElements.*;

public class TargetHomePageTest extends WebTestBase {


    @Test(enabled = false)
    public void verifySearchProductUsingValidProductName() {
        //Approach-1
        HomePage homePage = new HomePage(driver);


        // Action method
        homePage.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "85 results for “Diapers”";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }

    @Test(enabled = false)
    public void verifyTargetFindStoreDirectory() {
        TargetHomePage targetHomePage = new TargetHomePage(driver);
        targetHomePage.targetFindStoreDirectory();

        // Verification method
        String expectedProductName = "Target Store Directory";
        String actualProductName = driver.findElement(By.xpath(verifyTargetStoreDirectoryWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }
    @Test(enabled = false)
    public void verifyTargetCategories() {
        TargetHomePage targetHomePage = new TargetHomePage(driver);
        targetHomePage.targetCategories();

        // Verification method
        String expectedProductName = "Grocery";
        String actualProductName = driver.findElement(By.xpath(verifyCategoriesWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }
    @Test
    public void verifyTargetWhatsNew() {
        TargetHomePage targetHomePage = new TargetHomePage(driver);
        targetHomePage.targetWhatsNew();

        // Verification method
        String expectedProductName = "New in Beauty";
        String actualProductName = driver.findElement(By.xpath(verifyWhatsNewWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }
}