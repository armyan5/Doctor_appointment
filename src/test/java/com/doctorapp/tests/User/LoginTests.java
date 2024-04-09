package com.doctorapp.tests.User;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {

        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"), "iv_ivanov@gm.com");
        type(By.id("formLoginPassword"), "123S!fghjk");
        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Logout')]")));
    }


    @Test
    public void loginNegativeTestWithNotValidMail() {

        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"), "iv_ivan@gmail.com");
        type(By.id("formLoginPassword"), "123S!fghjk");
        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".modal-header")));
    }


    @Test
    public void loginNegativeTestWithNotValidPassword() {
        click(By.cssSelector(".p-3:nth-child(1) > strong"));
        type(By.id("formLoginEmail"), "iv_ivanov@gm.com");
        type(By.id("formLoginPassword"), "123S!Csak");
        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".modal-header")));
    }

}
