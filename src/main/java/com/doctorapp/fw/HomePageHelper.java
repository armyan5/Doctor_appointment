package com.doctorapp.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isHomeComponentPresent() {
        return isElementPresent(By.cssSelector(".banner-content > h2"));
    }

    public boolean isSignInButtonPresent() {
        return isElementPresent(By.cssSelector(".p-3:nth-child(1) > strong"));
    }
}
