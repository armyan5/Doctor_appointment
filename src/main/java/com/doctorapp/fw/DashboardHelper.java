package com.doctorapp.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DashboardHelper extends BaseHelper {
    public DashboardHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isAlertWindowPresent() {
        return isElementPresent(By.cssSelector(".modal-header"));
    }


    public void clickOnProfileLink() {
        click(By.cssSelector(".nav-item:nth-child(2) > .\\\"nav-link"));
    }

    public void scrollAndClikSave() {
        scroll(By.cssSelector(".btn-primary:nth-child(1)"));
        click(By.cssSelector(".btn-primary:nth-child(1)"));
    }

    public void editAppointmentData() {
        click(By.cssSelector(".nav-item:nth-child(1) > .\\\"nav-link"));
        click(By.cssSelector("tr:nth-child(1) a > .mx-1"));
        driver.findElement(By.name("appointmentDate")).sendKeys("18 4 2024");
        click(By.cssSelector(".form-check:nth-child(7) > .form-check-label"));
        scroll(By.cssSelector(".btn-primary"));
        click(By.cssSelector(".btn-primary"));
    }

    public void editUpcomingAppointmentsData() {
        click(By.cssSelector(".appcard:nth-child(1) .mx-1"));
        driver.findElement(By.name("appointmentDate")).sendKeys("18 4 2024");
        click(By.cssSelector(".form-check:nth-child(5) > .form-check-label"));
        scroll(By.cssSelector(".btn-primary"));
        click(By.cssSelector(".btn-primary"));
    }

    public void uploadPhoto() {
        driver.findElement(By.id("photoFile")).sendKeys("C:/Users/AIT TR Student/Desktop/Doctor.jpg");
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
