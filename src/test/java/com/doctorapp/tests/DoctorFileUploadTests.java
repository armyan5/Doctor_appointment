package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorFileUploadTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        clickOnSignInLink();
        fillDoctorLoginData();
        clickOnSignUpButton();
        clickOnProfileLink();
    }


    @Test
    public void photoUploadTest() {
        uploadPhoto();
        scrollAndClikSave();
        Assert.assertTrue(isPhotoPresent());
    }

}
