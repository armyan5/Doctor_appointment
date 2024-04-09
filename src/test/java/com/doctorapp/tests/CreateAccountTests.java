package com.doctorapp.tests;

import com.doctorapp.models.SignUp;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getUser().isSignUpLinkPresent()) {
            app.getUser().clickOnSignOutButton();
        }
    }

    @Test
    public void createNewAccountPositiveTest() {

        app.getUser().clickOnSignUpLink();

        app.getUser().fillSignUpRegisterForm(new SignUp()
                .setFirstName("Test")
                .setLastName("Testovich")
                .setEmail("Testovich@gm.com")
                .setPassword("Testovich123?"));
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getUser().isLogOutLinkPresent());

    }

    @Test
    public void newExistAccountNegativeTestWithWrongEmail() {

        app.getUser().clickOnSignUpLink();
        app.getUser().fillSignUpRegisterForm(new SignUp()
                .setFirstName("Test")
                .setLastName("Testovich")
                .setEmail("Testovich")
                .setPassword("Testovich123$"));
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getUser().isSignUpButtonPresent());

    }


    @Test
    public void newExistAccountNegativeTestWithWrongPassword() {

        app.getUser().clickOnSignUpLink();
        app.getUser().fillSignUpRegisterForm(new SignUp()
                .setFirstName("Test")
                .setLastName("Testovich")
                .setEmail("Testovich@gm.com")
                .setPassword("Testovich"));
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getUser().isSignUpButtonPresent());

    }

    @Test
    public void newExistAccountNegativeTestWithWrongFirstName() {

        app.getUser().clickOnSignUpLink();
        app.getUser().fillSignUpRegisterForm(new SignUp()
                .setFirstName("1231234")
                .setLastName("Testovich")
                .setEmail("Testovich@gm.com")
                .setPassword("Testovich123$"));
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getUser().isSignUpButtonPresent());

    }

    @Test
    public void newExistAccountWithSameData() {

        app.getUser().clickOnSignUpLink();
        app.getUser().fillSignUpRegisterForm(new SignUp()
                .setFirstName("Test")
                .setLastName("Testovich")
                .setEmail("Testovich@gm.com")
                .setPassword("Testovich123$"));
        app.getUser().clickOnSignUpButton();
        Assert.assertTrue(app.getUser().isErrorTextPresent());
    }

}
