package com.doctorapp.tests.Doctor;

import com.doctorapp.tests.User.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorProfileTests extends TestBase {


    @BeforeMethod
    public void precondition() {

        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"), "smith@gm.com");
        type(By.id("formLoginPassword"), "123S!fghjk");
        click(By.cssSelector(".w-100"));
    }

    @Test
    public void editProfileTests() {
        click(By.cssSelector(".nav-item:nth-child(2) > .\\\"nav-link"));
        doubleClick(By.id("formPhone"));
        type(By.id("formPhone"), "Harvard University");
        doubleClick(By.cssSelector(".mb-3:nth-child(5) > #formPhone"));
        type(By.cssSelector(".mb-3:nth-child(5) > #formPhone"), "Chirurgie");
        scroll(By.id("formAboutMe"));
        type(By.id("formAboutMe"),"I'm Smith and i'm Doctor");
        scroll(By.cssSelector(".btn-primary:nth-child(1)"));
        click(By.cssSelector(".btn-primary:nth-child(1)"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".my-4:nth-child(1)")));

    }
}
