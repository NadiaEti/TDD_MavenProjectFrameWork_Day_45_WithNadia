package com.target.testPages.HomePageTest;

import com.target.pages.HomePage;
import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.target.pageElement.HomePageElements.*;
import static com.target.pages.HomePage.*;
import static configuration.common.WebTestBase.driver;

public class HomePageTest extends WebTestBase {
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

}
