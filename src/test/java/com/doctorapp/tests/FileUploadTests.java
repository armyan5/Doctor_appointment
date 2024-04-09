package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FileUploadTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnSignInLink();
        app.getUser().fillLoginDate();
        app.getUser().clickOnSignUpButton();
        app.getDashboard().clickOnProfileLink();

    }

    @Test
    public void photoUploadTest() {
        app.getDashboard().uploadPhotoUser();
        app.getDashboard().scrollAndClikSave();
        Assert.assertTrue(app.getDashboard().isPhotoPresent());

    }

}
