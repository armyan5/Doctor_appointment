package com.doctorapp.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {


    @Test
    public void isHomeComponentPresentTest() {
        Assert.assertTrue(isHomeComponentPresent());
    }


    public boolean isHomeComponentPresent() {
        return isElementPresent(By.cssSelector(".banner-content > h2"));
    }


    @Test
    public void isSignInPresentTest() {
        Assert.assertTrue(isElementPresent(By.cssSelector(".p-3:nth-child(1) > strong")));
    }


    @Test
    public void isSignInPresentTest2() {
        Assert.assertTrue(isElementPresent(By.cssSelector(".swiper-slide:nth-child(3) .btn")));
    }


    @Test
    public void isSignInPresentTest3() {
        Assert.assertTrue(isElementPresent(By.cssSelector(".swiper-slide-next .btn")));
    }

    @Test
    public void isSignInPresentTest4() {
        Assert.assertTrue(isElementPresent(By.cssSelector(".swiper-slide-active .btn")));
    }


    @Test
    public void isSignInPresentTest5() {
        Assert.assertTrue(isElementPresent(By.cssSelector(".btn-danger")));
    }

}
