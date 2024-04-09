package com.doctorapp.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorLogOutTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        clickOnSignInLink();
        fillDoctorLoginData();
        clickOnSignUpButton();
    }


    @Test
    public void LogOutPositiveTest() {
        clickOnSignOutButton();
        Assert.assertTrue(isElementPresent(By.cssSelector(".p-3:nth-child(1) > strong")));

    }
}
