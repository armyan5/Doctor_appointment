package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorMyAppointmentsTests extends TestBase {

    @BeforeMethod
    public void precondition() {

        app.getUser().clickOnSignInLink();
        app.getDoctor().fillDoctorLoginData();
        app.getUser().clickOnSignUpButton();

    }

    @Test
    public void viewMyAppointmentsTest() {
        app.getDashboard().clickOnMyAppointmentsLink();
        Assert.assertTrue(app.getDashboard().isAppointmentViewPagePresent());

    }

    @Test
    public void editAppointmentsTest() {
        app.getDashboard().editAppointmentData();
        Assert.assertTrue(app.getDashboard().isMyAppointmentsPresent());
    }

}
