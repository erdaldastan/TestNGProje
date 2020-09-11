package com.techproed.smoketests;

import com.techproed.pages.FhcTripLoginPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class FhcTripLoginTest extends TestBase {

    @Test
    public void  test() {
        driver.get(ConfigurationReader.getProperty("fhc_login"));

        FhcTripLoginPage loginPage = new FhcTripLoginPage(driver);
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();
    }

}
