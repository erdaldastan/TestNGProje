package com.techproed.tests;

import com.techproed.pages.FhcTripHotelCreatePage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FhcTripHotelCreateTest extends TestBase {

    public void giris(){
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!"+ Keys.ENTER);
    }
    @Test (groups = {"fhctrip", "hotelolusturma"})
    public void test(){
        giris();
        FhcTripHotelCreatePage fhcTripHotelCreatePage = new FhcTripHotelCreatePage(driver);
        fhcTripHotelCreatePage.codeBox.sendKeys("1234");
        fhcTripHotelCreatePage.addressBox.sendKeys("Çıkmaz sk.");
        fhcTripHotelCreatePage.emailBox.sendKeys("techproed@techproed.com");
        fhcTripHotelCreatePage.nameBox.sendKeys("Techproed");
        fhcTripHotelCreatePage.phoneBox.sendKeys("1223454534");

        Select select = new Select(fhcTripHotelCreatePage.selectBox);
        select.selectByIndex(2);
        fhcTripHotelCreatePage.saveButton.click();
    }
}