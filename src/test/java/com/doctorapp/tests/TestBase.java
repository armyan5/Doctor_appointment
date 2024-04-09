package com.doctorapp.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;

    public static String password() {
        return "123S!fghjk";
    }

    public static String email() {
        return "iv_ivanov@gm.com";
    }


    @BeforeMethod
    public void init() {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        driver.get("http://localhost:3000/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }


    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }


    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }


    public void click(By locator) {
        driver.findElement(locator).click();
    }


    public void doubleClick(By locator) {
        WebElement clickable = driver.findElement(locator);
        new Actions(driver)
                .doubleClick(clickable)
                .perform();
    }

    public void scroll(By locator) {
        WebElement iframe = driver.findElement(locator);
        new Actions(driver)
                .scrollToElement(iframe)
                .perform();
    }


    public void clickOnSignOutButton() {
        click(By.xpath("//a[contains(text(),'Logout')]"));
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
        type(By.id("formLoginEmail"), TestBase.email());
        type(By.id("formLoginPassword"), TestBase.password());
    }

    public void clickOnSignInLink() {
        click(By.cssSelector(".p-3:nth-child(1) > strong"));
    }

    public boolean isLogOutLinkPresent() {
        return isElementPresent(By.xpath("//a[contains(text(),'Logout')]"));
    }

    public boolean isAlertWindowPresent() {
        return isElementPresent(By.cssSelector(".modal-header"));
    }

    public boolean isSignUpButtonPresent() {
        return isElementPresent(By.cssSelector(".w-100"));
    }

    public boolean isErrorTextPresent() {
        return isElementPresent(By.cssSelector(".error-text"));
    }

    public void fillDoctorProfileForm() {
        doubleClick(By.id("formPhone"));
        type(By.id("formPhone"), "Harvard University");
        doubleClick(By.cssSelector(".mb-3:nth-child(5) > #formPhone"));
        type(By.cssSelector(".mb-3:nth-child(5) > #formPhone"), "Chirurgie");
        scroll(By.id("formAboutMe"));
        type(By.id("formAboutMe"),"I'm Smith and i'm Doctor");
    }

    public void clickOnProfileLink() {
        click(By.cssSelector(".nav-item:nth-child(2) > .\\\"nav-link"));
    }

    public void scrollAndClikSave() {
        scroll(By.cssSelector(".btn-primary:nth-child(1)"));
        click(By.cssSelector(".btn-primary:nth-child(1)"));
    }

    public void fillPatientProfileForm(String address, String phone) {
        doubleClick(By.id("formPhone"));
        type(By.id("formPhone"), phone);
        doubleClick(By.id("formAddress"));
        type(By.id("formAddress"), address);
    }

    public void fillLoginDate() {
        type(By.id("formLoginEmail"), email());
        type(By.id("formLoginPassword"), password());
    }

    public void fillDoctorLoginData() {
        type(By.id("formLoginEmail"), "smith@gm.com");
        type(By.id("formLoginPassword"), password());
    }

    public void editAppointmentData() {
        click(By.cssSelector(".nav-item:nth-child(1) > .\\\"nav-link"));
        click(By.cssSelector("tr:nth-child(1) a > .mx-1"));
        driver.findElement(By.name("appointmentDate")).sendKeys("19 4 2024");
        click(By.cssSelector(".form-check:nth-child(7) > .form-check-label"));
        scroll(By.cssSelector(".btn-primary"));
        click(By.cssSelector(".btn-primary"));
    }

    public void editUpcomingAppointmentsData() {
        click(By.cssSelector(".appcard:nth-child(1) .mx-1"));
        driver.findElement(By.name("appointmentDate")).sendKeys("12 4 2024");
        click(By.cssSelector(".form-check:nth-child(4) > .form-check-label"));
        scroll(By.cssSelector(".btn-primary"));
        click(By.cssSelector(".btn-primary"));
    }
}

