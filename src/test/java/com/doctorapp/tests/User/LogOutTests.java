package com.doctorapp.tests.User;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOutTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"), "iv_ivanov@gm.com");
        type(By.id("formLoginPassword"), "123S!fghjk");
        click(By.cssSelector(".w-100"));
    }


    @Test
    public void LogOutPositiveTest() {
        click(By.xpath("//a[contains(text(),'Logout')]"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".p-3:nth-child(1) > strong")));

    }
}
