package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnSignInLink();
        app.getUser().fillLoginDate();
        app.getUser().clickOnSignUpButton();
    }

    @Test
    public void editProfileTests() {
        app.getDashboard().clickOnProfileLink();
        app.getUser().fillPatientProfileForm("An der Kesser 1-3", "015155755557");
        app.getDashboard().scrollAndClikSave();
        Assert.assertTrue(app.getDashboard().isMyProfilePresent());

    }

}