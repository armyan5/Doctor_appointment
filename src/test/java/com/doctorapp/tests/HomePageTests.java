package com.doctorapp.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {


    @Test
    public void isHomeComponentPresentTest() {
        Assert.assertTrue(isHomeComponentPresent());
    }


    @Test
    public void isSignInPresentTest() {
        Assert.assertTrue(isSignInButtonPresent());
    }
}
