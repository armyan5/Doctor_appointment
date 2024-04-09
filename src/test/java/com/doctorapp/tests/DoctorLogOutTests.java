package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorLogOutTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnSignInLink();
        app.getDoctor().fillDoctorLoginData();
        app.getUser().clickOnSignUpButton();
    }

    @Test
    public void LogOutPositiveTest() {
        app.getUser().clickOnSignOutButton();
        Assert.assertTrue(app.getHomePage().isSignInButtonPresent());

    }

}
