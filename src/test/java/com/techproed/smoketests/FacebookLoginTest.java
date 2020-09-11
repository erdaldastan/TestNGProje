package com.techproed.smoketests;

import com.techproed.pages.FacebookLoginPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

import javax.security.auth.login.Configuration;

public class FacebookLoginTest extends TestBase {

    @Test
    public void girisTest() {
        driver.get("http://facebook.com");

        FacebookLoginPage loginPage = new FacebookLoginPage(driver);
        loginPage.emailBox.sendKeys(ConfigurationReader.getProperty("fb_email"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("fb_pass"));

    }

}
