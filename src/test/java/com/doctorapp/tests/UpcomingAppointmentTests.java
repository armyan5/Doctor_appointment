package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpcomingAppointmentTests extends TestBase {


    @BeforeMethod
    public void precondition() {
        clickOnSignInLink();
        fillLoginDate();
        clickOnSignUpButton();
    }

    @Test
    public void upcomingAppointmentViewTest() {
        clickOnUpcomingAppLink();
        clickOnViewButton();
        Assert.assertTrue(isUpcomingAppPresent());
    }


    @Test
    void previousVisitsView() {
        clickOnUpcomingAppLink();
        clickViewButton();
        Assert.assertTrue(isViewButtonPresent());

    }


    @Test
    public void upcomingAppointmentEditTest() {
        clickOnViewButton();
        upcomingAppEdit();
        Assert.assertTrue(isEditElementPresent());
    }

}
