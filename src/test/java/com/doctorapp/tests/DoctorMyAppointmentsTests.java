package com.doctorapp.tests;

import org.openqa.selenium.By;
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
        click(By.cssSelector(".nav-item:nth-child(1) > .\\\"nav-link"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".nav-item:nth-child(1) > .\\\"nav-link")));

    }

    @Test
    public void editAppointmentsTest() {
        editAppointmentData();
        Assert.assertTrue(isElementPresent(By.cssSelector("tr:nth-child(1) > td:nth-child(1)")));
    }

}
