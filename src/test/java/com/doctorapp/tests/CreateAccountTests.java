package com.doctorapp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void createNewAccountPositiveTest() {

        click(By.cssSelector(".p-3:nth-child(2) > strong"));
        type(By.id("formRegistrationFirstName"), "Test");
        type(By.id("formRegistrationLastName"), "Testovich");
        type(By.id("formRegistrationBasicEmail"), "Testovich@gm.com");
        type(By.id("formRegistrationPassword"), "Testovich");
        click(By.cssSelector(".w-100"));
       /* WebElement iframe = driver.findElement(By.cssSelector(".w-100"));
        new Actions(driver)
                .scrollToElement(iframe)
                .perform();
         driver.findElement(By.cssSelector(".w-100")).click();*/
        // Assert

    }

    @Test
    public void newExistAccountNegativeTestWithWrongEmail() {

        click(By.cssSelector(".p-3:nth-child(2) > strong"));

        type(By.id("formRegistrationFirstName"), "Test");
        type(By.id("formRegistrationLastName"), "Testovich");
        type(By.id("formRegistrationBasicEmail"), "Testovich");
        type(By.id("formRegistrationPassword"), "Testovich123$");
        click(By.cssSelector(".w-100"));

        // Assert

    }


    @Test
    public void newExistAccountNegativeTestWithWrongPassword() {

        click(By.cssSelector(".p-3:nth-child(2) > strong"));

        type(By.id("formRegistrationFirstName"), "Test");
        type(By.id("formRegistrationLastName"), "Testovich");
        type(By.id("formRegistrationBasicEmail"), "Testovich@gm.com");
        type(By.id("formRegistrationPassword"), "Testovich");
        click(By.cssSelector(".w-100"));

        // Assert

    }

}
