package com.doctorapp.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoctorLoginNegativeTests extends TestBase{

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
        fieldDoctorEmail();
        type(By.id("formLoginPassword"), "123S!csAk");
        clickOnSignUpButton();
        Assert.assertTrue(isAlertWindowPresent());
    }

    @Test
    public void loginNegativeTestWithNullMail() {

        clickOnSignInLink();
        type(By.id("formLoginEmail"), "     ");
        type(By.id("formLoginPassword"), password());
        clickOnSignUpButton();
        Assert.assertTrue(isAlertWindowPresent());
    }

    @Test
    public void loginNegativeTestWithNullPassword() {
        clickOnSignInLink();
        fieldDoctorEmail();
        type(By.id("formLoginPassword"), "       ");
        clickOnSignUpButton();
        Assert.assertTrue(isAlertWindowPresent());
    }

}
