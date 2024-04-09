package com.doctorapp.tests;

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

}
