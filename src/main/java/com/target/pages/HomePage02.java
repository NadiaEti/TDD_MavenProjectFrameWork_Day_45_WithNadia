package com.target.pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.target.pageElement.HomePageElements.searchBoxWebElement;
import static com.target.pageElement.HomePageElements.searchButtonWebElement;

public class HomePage02 extends WebTestBase {


    // Action class for business flow

    // search box functionality should work with valid product name

    // Action method for search box functionality with valid product name purpose


    //Modern Approach: @FindBy
    @FindBy(xpath =searchBoxWebElement) public WebElement searchBox;
    @FindBy(xpath =searchButtonWebElement) public WebElement searchButton;

public void searchProductUsingValidProductName(){
//WebElement element = driver.findElement(By.xpath(searchBoxWebElement));
searchBox.sendKeys("Diapers");
searchButton.click();
}





}
