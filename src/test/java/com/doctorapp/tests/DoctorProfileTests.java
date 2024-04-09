package com.doctorapp.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorProfileTests extends TestBase {


    @BeforeMethod
    public void precondition() {

        clickOnSignInLink();
        fillDoctorLoginData();
        clickOnSignUpButton();
    }

    @Test
    public void editProfileTests() {
        clickOnProfileLink();
        fillDoctorProfileForm();
        scrollAndClikSave();
        Assert.assertTrue(isElementPresent(By.cssSelector(".my-4:nth-child(1)")));

    }

}
