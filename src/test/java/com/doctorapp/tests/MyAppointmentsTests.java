package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAppointmentsTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().clickOnSignInLink();
        app.getUser().fillLoginDate();
        app.getUser().clickOnSignUpButton();
        app.getDashboard().clickOnMyAppointmentsLink();
    }


    @Test
    public void addNewAppointmentsTest() {
        app.getDashboard().clickOnAddNewButton();
        app.getDashboard().clickOnData();
        app.getDashboard().fieldData();
        app.getDashboard().chooseDoctor();
        app.getDashboard().chooseTime();
        app.getDashboard().clickOnSaveButton();
        Assert.assertTrue(app.getDashboard().isMyAppointmentsPresent());

    }

}
