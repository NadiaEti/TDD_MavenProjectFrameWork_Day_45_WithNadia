package com.target.testPages.HomePageTest;

import com.target.pages.HomePage;
import com.target.pages.HomePage02;
import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.target.pageElement.HomePageElements.verifySearchedProductWebElement;

public class HomePageTest02 extends WebTestBase {
   HomePage02 homePage02;

   @BeforeMethod
   public void getInIt(){
       homePage02= PageFactory.initElements(driver,HomePage02.class);
   }

    @Test
    public void verifySearchProductUsingValidProductName() {
        //HomePage homePage = new HomePage(driver);
        HomePage02 homePage02= PageFactory.initElements(driver,HomePage02.class);

        // Action method
        homePage02.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "271 results for “Diapers”";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }

    @Test
    public void verifySearchProductUsingValidProductName1() {

        //HomePage homePage = new HomePage(driver);

        // Action method
        homePage02.searchProductUsingValidProductName();

        // Verification method
        String expectedProductName = "271 results for “Diapers”";
        String actualProductName = driver.findElement(By.xpath(verifySearchedProductWebElement)).getText();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name doest match");

    }

}
