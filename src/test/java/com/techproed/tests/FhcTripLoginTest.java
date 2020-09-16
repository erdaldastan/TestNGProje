package com.techproed.tests;

import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FhcTripLoginTest extends TestBase {

    @Test (groups = {"fhctrip", "login"})
    public void test() {
        driver.get("http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");
        FhcTripLoginPage loginPage = new FhcTripLoginPage(driver);
        loginPage.usernameBox.sendKeys("manager2");
        loginPage.passwordBox.sendKeys("Man1ager2!");
        loginPage.loginButton.click();
    }
}
