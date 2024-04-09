package com.doctorapp.tests.User;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void createNewAccountPositiveTest() {

        click(By.cssSelector(".p-3:nth-child(2) > strong"));
        type(By.id("formRegistrationFirstName"), "Test");
        type(By.id("formRegistrationLastName"), "Testovich");
        type(By.id("formRegistrationBasicEmail"), "Testovich@gm.com");
        type(By.id("formRegistrationPassword"), "Testovich123?");
        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[contains(text(),'Logout')]")));

    }

    @Test
    public void newExistAccountNegativeTestWithWrongEmail() {

        click(By.cssSelector(".p-3:nth-child(2) > strong"));
        type(By.id("formRegistrationFirstName"), "Test");
        type(By.id("formRegistrationLastName"), "Testovich");
        type(By.id("formRegistrationBasicEmail"), "Testovich");
        type(By.id("formRegistrationPassword"), "Testovich123$");
        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".w-100")));

    }


    @Test
    public void newExistAccountNegativeTestWithWrongPassword() {

        click(By.cssSelector(".p-3:nth-child(2) > strong"));
        type(By.id("formRegistrationFirstName"), "Test");
        type(By.id("formRegistrationLastName"), "Testovich");
        type(By.id("formRegistrationBasicEmail"), "Testovich@gm.com");
        type(By.id("formRegistrationPassword"), "Testovich");
        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".w-100")));

    }

    @Test
    public void newExistAccountNegativeTestWithWrongFirstName() {

        click(By.cssSelector(".p-3:nth-child(2) > strong"));
        type(By.id("formRegistrationFirstName"), "1231234");
        type(By.id("formRegistrationLastName"), "Testovich");
        type(By.id("formRegistrationBasicEmail"), "Testovich@gm.com");
        type(By.id("formRegistrationPassword"), "Testovich123$");
        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".w-100")));

    }

    @Test
    public void newExistAccountWithSameData() {

        click(By.cssSelector(".p-3:nth-child(2) > strong"));
        type(By.id("formRegistrationFirstName"), "Test");
        type(By.id("formRegistrationLastName"), "Testovich");
        type(By.id("formRegistrationBasicEmail"), "Testovich@gm.com");
        type(By.id("formRegistrationPassword"), "Testovich123$");
        click(By.cssSelector(".w-100"));
        Assert.assertTrue(isElementPresent(By.cssSelector(".error-text")));
    }

}
