package com.doctorapp.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends TestBase{

    @Test
    public void loginPositiveTest() {

        click(By.cssSelector(".p-3:nth-child(1) > strong"));

        type(By.id("formLoginEmail"),"iv_ivanov@gm.com");
        type(By.id("formLoginPassword"),"123S!fghjk");

        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Logout')]")));
    }

    @Test
    public void loginNegativeTestWithNotValidMail() {
        click(By.cssSelector(".p-3:nth-child(1) > strong"));

        type(By.id("formLoginEmail"),"iv_ivan@gmail.com");
        type(By.id("formLoginPassword"),"123S!fghjk");

        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".modal-header")));
    }


    @Test
    public  void loginNegativeTestWithNotValidPassword() {
        click(By.cssSelector(".p-3:nth-child(1) > strong"));

        type(By.id("formLoginEmail"),"iv_ivanov@gm.com");
        type(By.id("formLoginPassword"),"123S!");

        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".modal-header")));
    }

    private boolean isAlertAppears() {

        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.alertIsPresent());

        if (alert == null) {
            return false;
        }else {
            return true;
        }

    }
}
