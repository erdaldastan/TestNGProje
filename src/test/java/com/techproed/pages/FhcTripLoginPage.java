package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FhcTripLoginPage {

    WebDriver driver;

    public FhcTripLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
    @FindBy (  id = "UserName" )   // locator yazmamız gerekiyor.
    public WebElement usernameBox;

    @FindBy (  id = "Password" )
    public WebElement passwordBox;

    @FindBy (  xpath = "//button[@type='submit']" )
    public WebElement loginButton;
}