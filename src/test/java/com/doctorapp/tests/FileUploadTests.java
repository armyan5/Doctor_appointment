package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FileUploadTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        clickOnSignInLink();
        fillLoginDate();
        clickOnSignUpButton();
        clickOnProfileLink();

    }

    @Test
    public void photoUploadTest() {
        uploadPhotoUser();
        scrollAndClikSave();
        Assert.assertTrue(isPhotoPresent());

    }

}
