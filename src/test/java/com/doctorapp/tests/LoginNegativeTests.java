package com.doctorapp.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginNegativeTests extends TestBase{

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

    @Test
    public void loginNegativeTestWithNullMail() {
        clickOnSignInLink();
        type(By.id("formLoginEmail"), "    ");
        type(By.id("formLoginPassword"), password());
        clickOnSignUpButton();
        Assert.assertTrue(isAlertWindowPresent());
    }

    @Test
    public void loginNegativeTestWithNullPassword() {
        clickOnSignInLink();
        type(By.id("formLoginEmail"), "iv_ivanov@gmail.com");
        type(By.id("formLoginPassword"), "         ");
        clickOnSignUpButton();
        Assert.assertTrue(isAlertWindowPresent());
    }
}
