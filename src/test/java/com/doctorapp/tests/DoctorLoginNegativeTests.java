package com.doctorapp.tests;

import com.doctorapp.fw.UserHelper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoctorLoginNegativeTests extends TestBase{

    @Test
    public void loginNegativeTestWithNotValidMail() {

        app.getUser().clickOnSignInLink();
        app.getDoctor().type(By.id("formLoginEmail"), "ith@gm.com");
        app.getDoctor().type(By.id("formLoginPassword"), UserHelper.password());
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getDashboard().isAlertWindowPresent());
    }

    @Test
    public void loginNegativeTestWithNotValidPassword() {
        app.getUser().clickOnSignInLink();
        app.getDoctor().fieldDoctorEmail();
        app.getDoctor().type(By.id("formLoginPassword"), "123S!csAk");
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getDashboard().isAlertWindowPresent());
    }

    @Test
    public void loginNegativeTestWithNullMail() {

        app.getUser().clickOnSignInLink();
        app.getDoctor().type(By.id("formLoginEmail"), "     ");
        app.getDoctor().type(By.id("formLoginPassword"), UserHelper.password());
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getDashboard().isAlertWindowPresent());
    }

    @Test
    public void loginNegativeTestWithNullPassword() {
        app.getUser().clickOnSignInLink();
        app.getDoctor().fieldDoctorEmail();
        app.getDoctor().type(By.id("formLoginPassword"), "       ");
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getDashboard().isAlertWindowPresent());
    }

}
