package com.doctorapp.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DoctorHelper extends BaseHelper{
    public DoctorHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnSignOutButton() {
        click(By.xpath("//a[contains(text(),'Logout')]"));
    }


    public void fillDoctorProfileForm() {
        doubleClick(By.id("formPhone"));
        type(By.id("formPhone"), "Harvard University");
        doubleClick(By.cssSelector(".mb-3:nth-child(5) > #formPhone"));
        type(By.cssSelector(".mb-3:nth-child(5) > #formPhone"), "Chirurgie");
        scroll(By.id("formAboutMe"));
        type(By.id("formAboutMe"),"I'm Smith and i'm Doctor");
    }

    public void fillDoctorLoginData() {
        type(By.id("formLoginEmail"), "smith@gm.com");
        type(By.id("formLoginPassword"), UserHelper.password());
    }

    public void fieldDoctorEmail() {
        type(By.id("formLoginEmail"), "smith@gm.com");
    }


}
