package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {
        app.getUser().clickOnSignInLink();
        app.getUser().fillSignInForm();
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getUser().isLogOutLinkPresent());
    }

}
