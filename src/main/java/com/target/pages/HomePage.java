package com.target.pages;

import configuration.common.WebTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static com.target.pageElement.HomePageElements.searchBoxWebElement;
import static com.target.pageElement.HomePageElements.searchButtonWebElement;

public class HomePage extends WebTestBase {

    //Approach-1
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    // Action class for business flow

    // search box functionality should work with valid product name

    // Action method for search box functionality with valid product name purpose

    public static void searchProductUsingValidProductName() {
        driver.findElement(By.xpath(searchBoxWebElement)).sendKeys("Diapers");
        driver.findElement(By.xpath(searchButtonWebElement)).click();
    }

    //Modern Approach: @FindBy with How

//    @FindBy() public WebElement variableName;
//    @FindBy(how = How.XPATH,using = searchBoxWebElement) public WebElement searchBox;


    //Modern Approach: @FindBy
    @FindBy(xpath =searchBoxWebElement) public WebElement searchBox;
    @FindBy(xpath =searchButtonWebElement) public WebElement searchButton;

public void searchProductUsingValidProductName1(){
//WebElement element = driver.findElement(By.xpath(searchBoxWebElement));
searchBox.sendKeys("Diapers");
searchButton.click();
}





}
