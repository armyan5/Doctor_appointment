package com.doctorapp.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FileUploadTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        clickOnSignInLink();
        fillLoginDate();
        clickOnSignUpButton();
        clickOnProfileLink();

    }


    @Test
    public void photoUploadTest() {
        driver.findElement(By.id("photoFile")).sendKeys("C:/Users/AIT TR Student/Desktop/patient.jpg");
        scrollAndClikSave();
        Assert.assertTrue(isElementPresent(By.cssSelector(".profile_photo__file__view > img")));

    }

}
