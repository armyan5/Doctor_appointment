package com.doctorapp.fw;

import com.doctorapp.models.SignUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public static String password() {
        return "123S!fghjk";
    }

    public static String email() {
        return "iv_ivanov@gm.com";
    }

    public void clickOnSignOutButton() {
        click(By.xpath("//a[contains(text(),'Logout')]"));
    }

    public boolean isSignUpButtonPresent() {
        return isElementPresent(By.cssSelector(".w-100"));
    }

    public boolean isErrorTextPresent() {
        return isElementPresent(By.cssSelector(".error-text"));
    }

    public boolean isSignUpLinkPresent() {
        return isElementPresent(By.cssSelector(".p-3:nth-child(2) > strong"));
    }

    public void clickOnSignUpButton() {
        click(By.cssSelector(".w-100"));
    }

    public void fillSignUpRegisterForm(SignUp signUp) {
        type(By.id("formRegistrationFirstName"), signUp.getFirstName());
        type(By.id("formRegistrationLastName"), signUp.getLastName());
        type(By.id("formRegistrationBasicEmail"), signUp.getEmail());
        type(By.id("formRegistrationPassword"), signUp.getPassword());
    }

    public void clickOnSignUpLink() {
        click(By.cssSelector(".p-3:nth-child(2) > strong"));
    }

    public void fillSignInForm() {
        type(By.id("formLoginEmail"), UserHelper.email());
        type(By.id("formLoginPassword"), UserHelper.password());
    }

    public void clickOnSignInLink() {
        click(By.cssSelector(".p-3:nth-child(1) > strong"));
    }

    public boolean isLogOutLinkPresent() {
        return isElementPresent(By.xpath("//a[contains(text(),'Logout')]"));
    }

    public void fillPatientProfileForm(String address, String phone) {
        doubleClick(By.id("formPhone"));
        type(By.id("formPhone"), phone);
        doubleClick(By.id("formAddress"));
        type(By.id("formAddress"), address);
    }

    public void fillLoginDate() {
        type(By.id("formLoginEmail"), UserHelper.email());
        type(By.id("formLoginPassword"), UserHelper.password());
    }
}
