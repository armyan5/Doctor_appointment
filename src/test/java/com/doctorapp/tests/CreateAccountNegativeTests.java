package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountNegativeTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (!isSignUpLinkPresent()) {
            clickOnSignOutButton();
        }
    }


    @Test
    public void newExistAccountNegativeTestWithWrongEmail() {

        clickOnSignUpLink();
        fillSignUpRegisterForm(new SignUp()
                .setFirstName("Test")
                .setLastName("Testovich")
                .setEmail("Testovich")
                .setPassword("Testovich123$"));
        clickOnSignUpButton();
        Assert.assertTrue(isSignUpButtonPresent());

    }


    @Test
    public void newExistAccountNegativeTestWithWrongPassword() {

        clickOnSignUpLink();
        fillSignUpRegisterForm(new SignUp()
                .setFirstName("Test")
                .setLastName("Testovich")
                .setEmail("Testovich@gm.com")
                .setPassword("Testovich"));
        clickOnSignUpButton();
        Assert.assertTrue(isSignUpButtonPresent());

    }

    @Test
    public void newExistAccountNegativeTestWithWrongFirstName() {

        clickOnSignUpLink();
        fillSignUpRegisterForm(new SignUp()
                .setFirstName("1231234")
                .setLastName("Testovich")
                .setEmail("Testovich@gm.com")
                .setPassword("Testovich123$"));
        clickOnSignUpButton();
        Assert.assertTrue(isSignUpButtonPresent());

    }

    @Test
    public void newExistAccountWithSameData() {

        clickOnSignUpLink();
        fillSignUpRegisterForm(new SignUp()
                .setFirstName("Test")
                .setLastName("Testovich")
                .setEmail("Testovich@gm.com")
                .setPassword("Testovich123$"));
        clickOnSignUpButton();
        Assert.assertTrue(isErrorTextPresent());
    }

    @Test
    public void newExistAccountWithNullFirstName() {

        clickOnSignUpLink();
        fillSignUpRegisterForm(new SignUp()
                .setFirstName("    ")
                .setLastName("Testovich")
                .setEmail("Testovich@gm.com")
                .setPassword("Testovich123$"));
        clickOnSignUpButton();
        Assert.assertTrue(isSignUpButtonPresent());
    }

    @Test
    public void newExistAccountWithNullLastName() {

        clickOnSignUpLink();
        fillSignUpRegisterForm(new SignUp()
                .setFirstName("Test")
                .setLastName("      ")
                .setEmail("Testovich@gm.com")
                .setPassword("Testovich123$"));
        clickOnSignUpButton();
        Assert.assertTrue(isSignUpButtonPresent());
    }

    @Test
    public void newExistAccountWithNullEmail() {

        clickOnSignUpLink();
        fillSignUpRegisterForm(new SignUp()
                .setFirstName("Test")
                .setLastName("Testovich")
                .setEmail("        ")
                .setPassword("Testovich123$"));
        clickOnSignUpButton();
        Assert.assertTrue(isSignUpButtonPresent());
    }


    @Test
    public void newExistAccountWithNullPassword() {

        clickOnSignUpLink();
        fillSignUpRegisterForm(new SignUp()
                .setFirstName("Test")
                .setLastName("Testovich")
                .setEmail("Testovich@gm.com")
                .setPassword("       "));
        clickOnSignUpButton();
        Assert.assertTrue(isSignUpButtonPresent());
    }
}
