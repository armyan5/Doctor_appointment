package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorMyAppointmentsTests extends TestBase {

    @BeforeMethod
    public void precondition() {

        clickOnSignInLink();
        fillDoctorLoginData();
        clickOnSignUpButton();

    }

    @Test
    public void viewMyAppointmentsTest() {
        clickOnMyAppointmentsLink();
        Assert.assertTrue(isAppointmentViewPagePresent());

    }

    @Test
    public void editAppointmentsTest() {
        editAppointmentData();
        Assert.assertTrue(isMyAppointmentsPresent());
    }

}
