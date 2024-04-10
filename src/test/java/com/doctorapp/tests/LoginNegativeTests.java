package com.doctorapp.tests;

import com.doctorapp.fw.UserHelper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginNegativeTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isSignUpLinkPresent()) {
            app.getUser().clickOnSignOutButton();
        }
    }

    @Test
    public void loginNegativeTestWithNotValidMail() {
        app.getUser().clickOnSignInLink();
        app.getUser().type(By.id("formLoginEmail"), "iv_ivan@gmail.com");
        app.getUser().type(By.id("formLoginPassword"), UserHelper.password());
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getDashboard().isAlertWindowPresent());
    }


    @Test
    public void loginNegativeTestWithNotValidPassword() {
        app.getUser().clickOnSignInLink();
        app.getUser().type(By.id("formLoginEmail"), UserHelper.email());
        app.getUser().type(By.id("formLoginPassword"), "123S!Csak");
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getDashboard().isAlertWindowPresent());
    }

    @Test
    public void loginNegativeTestWithNullMail() {
        app.getUser().clickOnSignInLink();
        app.getUser().type(By.id("formLoginEmail"), "    ");
        app.getUser().type(By.id("formLoginPassword"), UserHelper.password());
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getDashboard().isAlertWindowPresent());
    }

    @Test
    public void loginNegativeTestWithNullPassword() {
        app.getUser().clickOnSignInLink();
        app.getUser().type(By.id("formLoginEmail"), "iv_ivanov@gmail.com");
        app.getUser().type(By.id("formLoginPassword"), "         ");
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getDashboard().isAlertWindowPresent());
    }
}
