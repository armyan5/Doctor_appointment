package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpcomingAppointmentTests extends TestBase {


    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnSignInLink();
        app.getUser().fillLoginDate();
        app.getUser().clickOnSignUpButton();
    }

    @Test
    public void upcomingAppointmentViewTest() {
        app.getDashboard().clickOnUpcomingAppLink();
        app.getDashboard().clickOnViewButton();
        Assert.assertTrue(app.getDashboard().isUpcomingAppPresent());
    }


    @Test
    void previousVisitsView() {
        app.getDashboard().clickOnUpcomingAppLink();
        app.getDashboard().clickViewButton();
        Assert.assertTrue(app.getDashboard().isViewButtonPresent());

    }


    @Test
    public void upcomingAppointmentEditTest() {
        app.getDashboard().clickOnViewButton();
        app.getDashboard().upcomingAppEdit();
        Assert.assertTrue(app.getDashboard().isEditElementPresent());
    }

}
