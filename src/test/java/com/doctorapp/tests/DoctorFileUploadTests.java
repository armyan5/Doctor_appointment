package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorFileUploadTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnSignInLink();
        app.getDoctor().fillDoctorLoginData();
        app.getUser().clickOnSignUpButton();
        app.getDashboard().clickOnProfileLink();
    }


    @Test
    public void photoUploadTest() {
        app.getDashboard().uploadPhoto();
        app.getDashboard().scrollAndClikSave();
        Assert.assertTrue(app.getDashboard().isPhotoPresent());
    }

}
