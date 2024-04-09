package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorUpcomingAppointmentTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnSignInLink();
        app.getDoctor().fillDoctorLoginData();
        app.getUser().clickOnSignUpButton();

    }

    @Test
    public void upcomingAppointmentViewTest() {
        app.getDashboard().clickOnUpcomingAppLink();
        app.getDashboard().clickOnViewButton();
        Assert.assertTrue(app.getDashboard().isUpcomingAppPresent());
    }

    @Test
    public void doctorUpcomingAppointmentEditTest() {
        app.getDashboard().editUpcomingAppointmentsData();
        Assert.assertTrue(app.getDashboard().isEditElementPresent());
    }

}
