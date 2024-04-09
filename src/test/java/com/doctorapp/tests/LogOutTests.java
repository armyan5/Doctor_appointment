package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        clickOnSignInLink();
        fillLoginDate();
        clickOnSignUpButton();
    }

    @Test
    public void LogOutPositiveTest() {
        clickOnSignOutButton();
        Assert.assertTrue(isSignInButtonPresent());

    }
}
