package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorUpcomingAppointmentTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        clickOnSignInLink();
        fillDoctorLoginData();
        clickOnSignUpButton();

    }

    @Test
    public void upcomingAppointmentViewTest() {
        clickOnUpcomingAppLink();
        clickOnViewButton();
        Assert.assertTrue(isUpcomingAppPresent());
    }

    @Test
    public void doctorUpcomingAppointmentEditTest() {
        editUpcomingAppointmentsData();
        Assert.assertTrue(isEditElementPresent());
    }

}
