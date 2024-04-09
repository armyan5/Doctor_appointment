package com.doctorapp.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {

        clickOnSignInLink();
        fillSignInForm();
        clickOnSignUpButton();
        Assert.assertTrue(isLogOutLinkPresent());
    }


    @Test
    public void loginNegativeTestWithNotValidMail() {

        clickOnSignInLink();
        type(By.id("formLoginEmail"), "iv_ivan@gmail.com");
        type(By.id("formLoginPassword"), password());
        clickOnSignUpButton();
        Assert.assertTrue(isAlertWindowPresent());
    }


    @Test
    public void loginNegativeTestWithNotValidPassword() {
        clickOnSignInLink();
        type(By.id("formLoginEmail"), email());
        type(By.id("formLoginPassword"), "123S!Csak");
        clickOnSignUpButton();
        Assert.assertTrue(isAlertWindowPresent());
    }

}
