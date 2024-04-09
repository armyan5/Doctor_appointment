package com.doctorapp.tests.Doctor;

import com.doctorapp.tests.User.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorFileUploadTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"), "smith@gm.com");
        type(By.id("formLoginPassword"), "123S!fghjk");
        click(By.cssSelector(".w-100"));
        click(By.cssSelector(".nav-item:nth-child(2) > .\\\"nav-link"));

    }


    @Test
    public void photoUploadTest() {
        driver.findElement(By.id("photoFile")).sendKeys("C:/Users/AIT TR Student/Desktop/Doctor.jpg");
        scroll(By.cssSelector(".btn-primary:nth-child(1)"));
        click(By.cssSelector(".btn-primary:nth-child(1)"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".profile_photo__file__view > img")));

    }

}
