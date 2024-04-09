package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        clickOnSignInLink();
        fillLoginDate();
        clickOnSignUpButton();
    }

    @Test
    public void editProfileTests() {
        clickOnProfileLink();
        fillPatientProfileForm("An der Kesser 1-3", "015155755557");
        scrollAndClikSave();
        Assert.assertTrue(isMyProfilePresent());

    }

}