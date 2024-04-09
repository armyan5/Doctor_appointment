package com.doctorapp.tests.Doctor;

import com.doctorapp.tests.User.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoctorLoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {

        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"), "smith@gm.com");
        type(By.id("formLoginPassword"), "123S!fghjk");
        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Logout')]")));
    }

    @Test
    public void loginNegativeTestWithNotValidMail() {

        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"), "ith@gm.com");
        type(By.id("formLoginPassword"), "123S!fghjk");
        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".modal-header")));
    }

    @Test
    public void loginNegativeTestWithNotValidPassword() {
        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"), "smith@gm.com");
        type(By.id("formLoginPassword"), "123S!csAk");
        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".modal-header")));
    }
}
