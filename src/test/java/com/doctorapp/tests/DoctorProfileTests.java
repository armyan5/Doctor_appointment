package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorProfileTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnSignInLink();
        app.getDoctor().fillDoctorLoginData();
        app.getUser().clickOnSignUpButton();
    }

    @Test
    public void editProfileTests() {
        app.getDashboard().clickOnProfileLink();
        app.getDoctor().fillDoctorProfileForm();
        app.getDashboard().scrollAndClikSave();
        Assert.assertTrue(app.getDashboard().isMyProfilePresent());

    }

}
