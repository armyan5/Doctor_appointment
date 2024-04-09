package com.doctorapp.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
        if (text != null) {
            click(locator);
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
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

    public void uploadPhoto() {
        driver.findElement(By.id("photoFile")).sendKeys("C:/Users/AIT TR Student/Desktop/Doctor.jpg");
    }

    public void fieldDoctorEmail() {
        type(By.id("formLoginEmail"), "smith@gm.com");
    }

    public boolean isHomeComponentPresent() {
        return isElementPresent(By.cssSelector(".banner-content > h2"));
    }

    public boolean isSignInButtonPresent() {
        return isElementPresent(By.cssSelector(".p-3:nth-child(1) > strong"));
    }

    public void clickOnMyAppointmentsLink() {
        click(By.cssSelector(".nav-item:nth-child(1) > .\\\"nav-link"));
    }

    public boolean isAppointmentViewPagePresent() {
        return isElementPresent(By.cssSelector(".nav-item:nth-child(1) > .\\\"nav-link"));
    }

    public boolean isMyAppointmentsPresent() {
        return isElementPresent(By.cssSelector("tr:nth-child(1) > td:nth-child(1)"));
    }

    public boolean isMyProfilePresent() {
        return isElementPresent(By.cssSelector(".my-4:nth-child(1)"));
    }

    public void clickOnUpcomingAppLink() {
        click(By.xpath("//div[@id='root']/div/div/div/div/div/div/a/img"));
    }

    public void clickOnViewButton() {
        click(By.cssSelector(".appcard:nth-child(1) .mx-1"));
    }

    public boolean isUpcomingAppPresent() {
        return isElementPresent(By.cssSelector(".btn-primary"));
    }

    public boolean isEditElementPresent() {
        return isElementPresent(By.xpath("(//button[@type='button'])[5]"));
    }

    public void uploadPhotoUser() {
        driver.findElement(By.id("photoFile")).sendKeys("C:/Users/AIT TR Student/Desktop/patient.jpg");
    }

    public boolean isPhotoPresent() {
        return isElementPresent(By.cssSelector(".profile_photo__file__view > img"));
    }

    public boolean isAppointPagePresent() {
        return isElementPresent(By.cssSelector(".text-primary"));
    }

    public void clickOnSaveButton() {
        click(By.cssSelector(".btn-primary"));
    }

    public void chooseTime() {
        click(By.cssSelector(".form-check:nth-child(2) > .form-check-label"));
    }

    public void chooseDoctor() {
        click(By.cssSelector(".form-select"));
        new Select(driver.findElement(By.name("doctorId"))).selectByVisibleText("Dr. Michael Smith");
    }

    public void fieldData() {
        driver.findElement(By.name("appointmentDate")).sendKeys("17 4 2024");
    }

    public void clickOnData() {
        click(By.cssSelector(".form-control"));
    }

    public void clickOnAddNewButton() {
        click(By.cssSelector(".btn-danger:nth-child(1)"));
    }

    public boolean isViewButtonPresent() {
        return isElementPresent(By.cssSelector(".mx-1"));
    }

    public void clickViewButton() {
        click(By.cssSelector(".prevappcard:nth-child(1) .mx-1"));
    }

    public void upcomingAppEdit() {
        editData();
        click(By.cssSelector(".form-check:nth-child(4) > .form-check-label"));
        clickOnSaveButton();
    }

    public void editData() {
        driver.findElement(By.name("appointmentDate")).sendKeys("12.11");
    }
}

