package com.doctorapp.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SideBarLinkTests extends TestBase {

    @BeforeMethod
    public void precondition() {

        clickOnSignInLink();
        fillLoginDate();
        clickOnSignUpButton();
    }

    @Test
    public void profileLinkTest() {
        clickOnProfileLink();
        Assert.assertTrue(isElementPresent(By.cssSelector(".my-4:nth-child(1)")));
    }


    @Test
    public void myAppointmentsLinkTest() {
        click(By.cssSelector(".nav-item:nth-child(1) > .\\\"nav-link"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".text-primary")));
    }


    @Test
    public void upcomingAppointmentsTest() {
        Assert.assertTrue(isElementPresent(By.cssSelector(".text-primary")));
    }

}

