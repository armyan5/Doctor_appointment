package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DoctorLoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {

        clickOnSignInLink();
        fillDoctorLoginData();
        clickOnSignUpButton();
        Assert.assertTrue(isLogOutLinkPresent());
    }


}
