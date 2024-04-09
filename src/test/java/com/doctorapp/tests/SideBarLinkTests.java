package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SideBarLinkTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        clickOnSignInLink();
        fillLoginDate();
        clickOnSignUpButton();
    }

    @Test
    public void profileLinkTest() {
        clickOnProfileLink();
        Assert.assertTrue(isMyProfilePresent());
    }


    @Test
    public void myAppointmentsLinkTest() {
        clickOnMyAppointmentsLink();
        Assert.assertTrue(isAppointPagePresent());
    }


    @Test
    public void upcomingAppointmentsTest() {
        Assert.assertTrue(isAppointPagePresent());
    }
}

