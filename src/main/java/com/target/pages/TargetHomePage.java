package com.target.pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.target.pageElement.HomePageElements.searchBoxWebElement;
import static com.target.pageElement.HomePageElements.searchButtonWebElement;
import static com.target.pageElement.TargetHomePageElements.*;

public class TargetHomePage extends WebTestBase {

    //Approach-1
    public TargetHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    // Action class for business flow

    // search box functionality should work with valid product name

    // Action method for search box functionality with valid product name purpose

    public static void searchProductUsingValidProductName1() {
        driver.findElement(By.xpath(searchBoxWebElement)).sendKeys("Diapers");
        driver.findElement(By.xpath(searchButtonWebElement)).click();
    }


    //Modern Approach: @FindBy
    @FindBy(xpath = searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(xpath = searchButtonWebElement)
    public WebElement searchButton;

    public void searchProductUsingValidProductName() {
//WebElement element = driver.findElement(By.xpath(searchBoxWebElement));
        searchBox.sendKeys("Diapers");
        searchButton.click();
    }

    //Modern Approach: @FindBy
    @FindBy(css = FindStoreWebElement)
    public WebElement findStore;
    @FindBy(css = viewStoreDirectoryWebElement)
    public WebElement viewStoreDirectory;

    public void targetFindStoreDirectory() {
//WebElement element = driver.findElement(By.xpath(searchBoxWebElement));
        findStore.click();
        viewStoreDirectory.click();
    }

    //Modern Approach: @FindBy
    @FindBy(xpath = categoriesWebElement)
    public WebElement categories;
    @FindBy(xpath = targetGroceryWebElement)
    public WebElement grocery;


    public void targetCategories() {
//WebElement element = driver.findElement(By.xpath(searchBoxWebElement));
        categories.click();
        grocery.click();

    }

    //Modern Approach: @FindBy
    @FindBy(xpath = whatsNewWebElement)
    public WebElement WhatsNew;
    @FindBy(xpath = beautyNewArrivalsWebElement)
    public WebElement BeautyNewArrivals;
    @FindBy(xpath = collegeShopWebElement)
    public WebElement collegeShop;


    public void targetWhatsNew() {
//WebElement element = driver.findElement(By.xpath(searchBoxWebElement));
        WhatsNew.click();
        BeautyNewArrivals.click();
        collegeShop.click();
    }


}
