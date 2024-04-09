package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SideBarLinkTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnSignInLink();
        app.getUser().fillLoginDate();
        app.getUser().clickOnSignUpButton();
    }

    @Test
    public void profileLinkTest() {
        app.getDashboard().clickOnProfileLink();
        Assert.assertTrue(app.getDashboard().isMyProfilePresent());
    }


    @Test
    public void myAppointmentsLinkTest() {
        app.getDashboard().clickOnMyAppointmentsLink();
        Assert.assertTrue(app.getDashboard().isAppointPagePresent());
    }


    @Test
    public void upcomingAppointmentsTest() {
        Assert.assertTrue(app.getDashboard().isAppointPagePresent());
    }
}

