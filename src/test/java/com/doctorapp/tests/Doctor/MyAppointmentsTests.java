package com.doctorapp.tests.Doctor;

import com.doctorapp.tests.User.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAppointmentsTests extends TestBase {

    @BeforeMethod
    public void precondition() {

        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"), "smith@gm.com");
        type(By.id("formLoginPassword"), "123S!fghjk");
        click(By.cssSelector(".w-100"));

    }

    @Test
    public void viewMyAppointmentsTest() {
        click(By.cssSelector(".nav-item:nth-child(1) > .\\\"nav-link"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".nav-item:nth-child(1) > .\\\"nav-link")));

    }

    @Test
    public void editAppointmentsTest() {
        click(By.cssSelector(".nav-item:nth-child(1) > .\\\"nav-link"));
        click(By.cssSelector("tr:nth-child(1) a > .mx-1"));
        driver.findElement(By.name("appointmentDate")).sendKeys("19 4 2024");
        click(By.cssSelector(".form-check:nth-child(7) > .form-check-label"));
        scroll(By.cssSelector(".btn-primary"));
        click(By.cssSelector(".btn-primary"));
        Assert.assertTrue(isElementPresent(By.cssSelector("tr:nth-child(1) > td:nth-child(1)")));
    }
}
