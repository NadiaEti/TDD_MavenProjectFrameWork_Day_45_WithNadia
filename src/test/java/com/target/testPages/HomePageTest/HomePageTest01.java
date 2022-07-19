package com.target.testPages.HomePageTest;

import com.target.pages.HomePage;
import com.target.pages.HomePage01;
import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.target.pageElement.HomePageElements.verifySearchedProductWebElement;

public class HomePageTest01 extends WebTestBase {
    @Test(enabled = false)
    public void verifySearchProductUsingValidProductName() {

        //Another Approach

        HomePage01 homePage01 = new HomePage01();
        // Action method
        homePage01.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "85 results for “Diapers”";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }

}
