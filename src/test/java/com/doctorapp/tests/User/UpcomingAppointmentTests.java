package com.doctorapp.tests.User;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UpcomingAppointmentTests extends TestBase {


    @BeforeMethod
    public void precondition() {
        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"), "iv_ivanov@gm.com");
        type(By.id("formLoginPassword"), "123S!fghjk");
        click(By.cssSelector(".w-100"));

    }


    @Test
    public void upcomingAppointmentViewTest() {
        click(By.xpath("//div[@id='root']/div/div/div/div/div/div/a/img"));
        click(By.cssSelector(".appcard:nth-child(1) .mx-1"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".btn-primary")));
    }


    @Test
    void previousVisitsView() {
        click(By.xpath("//div[@id='root']/div/div/div/div/div/div/a/img"));
        click(By.cssSelector(".prevappcard:nth-child(1) .mx-1"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".mx-1")));
    }


    @Test
    public void upcomingAppointmentEditTest() {
        click(By.cssSelector(".appcard:nth-child(1) .mx-1"));
        driver.findElement(By.name("appointmentDate")).sendKeys("12.11");
        click(By.cssSelector(".form-check:nth-child(4) > .form-check-label"));
        click(By.cssSelector(".btn-primary"));
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[5]")));
    }

}