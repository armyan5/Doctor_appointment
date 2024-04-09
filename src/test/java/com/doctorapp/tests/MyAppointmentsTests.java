package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAppointmentsTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        clickOnSignInLink();
        fillLoginDate();
        clickOnSignUpButton();
        clickOnMyAppointmentsLink();
    }


    @Test
    public void addNewAppointmentsTest() {
        clickOnAddNewButton();
        clickOnData();
        fieldData();
        chooseDoctor();
        chooseTime();
        clickOnSaveButton();
        Assert.assertTrue(isMyAppointmentsPresent());

    }

}
