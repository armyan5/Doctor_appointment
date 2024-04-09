package com.doctorapp.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoctorLoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {

        clickOnSignInLink();
        fillDoctorLoginData();
        clickOnSignUpButton();
        Assert.assertTrue(isLogOutLinkPresent());
    }

    @Test
    public void loginNegativeTestWithNotValidMail() {

        clickOnSignInLink();
        type(By.id("formLoginEmail"), "ith@gm.com");
        type(By.id("formLoginPassword"), password());
        clickOnSignUpButton();
        Assert.assertTrue(isAlertWindowPresent());
    }

    @Test
    public void loginNegativeTestWithNotValidPassword() {
        clickOnSignInLink();
        type(By.id("formLoginEmail"), "smith@gm.com");
        type(By.id("formLoginPassword"), "123S!csAk");
        clickOnSignUpButton();
        Assert.assertTrue(isAlertWindowPresent());
    }
}
