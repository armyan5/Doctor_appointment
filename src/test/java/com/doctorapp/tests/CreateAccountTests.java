package com.doctorapp.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!isSignUpLinkPresent()) {
            clickOnSignOutButton();
        }
    }

    @Test
    public void createNewAccountPositiveTest() {

        clickOnSignUpLink();

        fillSignUpRegisterForm(new SignUp("Test", "Testovich", "Testovich@gm.com", "Testovich123?"));
        clickOnSignUpButton();
        Assert.assertTrue(isLogOutLinkPresent());

    }

    @Test
    public void newExistAccountNegativeTestWithWrongEmail() {

        clickOnSignUpLink();
        fillSignUpRegisterForm(new SignUp("Test", "Testovich", "Testovich", "Testovich123$"));
        clickOnSignUpButton();
        Assert.assertTrue(isSignUpButtonPresent());

    }


    @Test
    public void newExistAccountNegativeTestWithWrongPassword() {

        clickOnSignUpLink();
        fillSignUpRegisterForm(new SignUp("Test", "Testovich", "Testovich@gm.com", "Testovich"));
        clickOnSignUpButton();
        Assert.assertTrue(isSignUpButtonPresent());

    }

    @Test
    public void newExistAccountNegativeTestWithWrongFirstName() {

        clickOnSignUpLink();
        fillSignUpRegisterForm(new SignUp("1231234", "Testovich", "Testovich@gm.com", "Testovich123$"));
        clickOnSignUpButton();
        Assert.assertTrue(isSignUpButtonPresent());

    }

    @Test
    public void newExistAccountWithSameData() {

        clickOnSignUpLink();
        fillSignUpRegisterForm(new SignUp("Test", "Testovich", "Testovich@gm.com", "Testovich123$"));
        clickOnSignUpButton();
        Assert.assertTrue(isErrorTextPresent());
    }

}
