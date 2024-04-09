package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {


    @Test
    public void isHomeComponentPresentTest() {
        Assert.assertTrue(app.getHomePage().isHomeComponentPresent());
    }


    @Test
    public void isSignInPresentTest() {
        Assert.assertTrue(app.getHomePage().isSignInButtonPresent());
    }
}
