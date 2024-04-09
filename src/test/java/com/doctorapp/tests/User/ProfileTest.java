package com.doctorapp.tests.User;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileTest extends TestBase {

    @BeforeMethod
    public void precondition() {

        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"), "iv_ivanov@gm.com");
        type(By.id("formLoginPassword"), "123S!fghjk");
        click(By.cssSelector(".w-100"));
    }

    @Test
    public void editProfileTests() {
        click(By.cssSelector(".nav-item:nth-child(2) > .\\\"nav-link"));
        doubleClick(By.id("formPhone"));
        type(By.id("formPhone"), "015155755557");
        doubleClick(By.id("formAddress"));
        type(By.id("formAddress"), "An der Kesser 1-3");
        scroll(By.cssSelector(".btn-primary:nth-child(1)"));
        click(By.cssSelector(".btn-primary:nth-child(1)"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".my-4:nth-child(1)")));

    }

}