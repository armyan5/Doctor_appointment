package com.doctorapp.tests.User;

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
        type(By.id("formLoginEmail"), "iv_ivanov@gm.com");
        type(By.id("formLoginPassword"), "123S!fghjk");
        click(By.cssSelector(".w-100"));
        click(By.cssSelector(".nav-item:nth-child(1) > .\\\"nav-link"));
    }


    @Test
    public void addNewAppointmentsTest() {
        click(By.cssSelector(".btn-danger:nth-child(1)"));
        click(By.cssSelector(".form-control"));
        driver.findElement(By.name("appointmentDate")).sendKeys("17 4 2024");
        click(By.cssSelector(".form-select"));
        new Select(driver.findElement(By.name("doctorId"))).selectByVisibleText("Dr. Michael Smith");
        click(By.cssSelector(".form-check:nth-child(2) > .form-check-label"));
        click(By.cssSelector(".btn-primary"));
        Assert.assertTrue(isElementPresent(By.cssSelector("tr:nth-child(1) > td:nth-child(1)")));

    }

}
