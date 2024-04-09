package com.doctorapp.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorUpcomingAppointmentTests extends TestBase {

    @BeforeMethod
    public void precondition() {

        clickOnSignInLink();
        fillDoctorLoginData();
        clickOnSignUpButton();

    }

    @Test
    public void upcomingAppointmentViewTest() {
        click(By.xpath("//div[@id='root']/div/div/div/div/div/div/a/img"));
        click(By.cssSelector(".appcard:nth-child(1) .mx-1"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".btn-primary")));
    }

    @Test
    public void doctorUpcomingAppointmentEditTest() {
        editUpcomingAppointmentsData();
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[5]")));
    }

}
