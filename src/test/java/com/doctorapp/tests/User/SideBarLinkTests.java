package com.doctorapp.tests.User;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SideBarLinkTests extends TestBase {

    @BeforeMethod
    public void precondition() {

        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"),"iv_ivanov@gm.com");
        type(By.id("formLoginPassword"),"123S!fghjk");
        click(By.cssSelector(".w-100"));
    }

    @Test
    public void profileLinkTest() {
        click(By.cssSelector(".nav-item:nth-child(2) > .\\\"nav-link"));
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

