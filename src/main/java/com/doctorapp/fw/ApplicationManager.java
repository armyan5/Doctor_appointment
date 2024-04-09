package com.doctorapp.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ApplicationManager {

    static WebDriver driver;

    UserHelper user;
    DoctorHelper doctor;
    HomePageHelper homePage;
    DashboardHelper dashboard;


    public void init() {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        driver.get("http://localhost:3000/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        doctor = new DoctorHelper(driver);
        homePage = new HomePageHelper(driver);
        dashboard = new DashboardHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public UserHelper getUser() {
        return user;
    }

    public DoctorHelper getDoctor() {
        return doctor;
    }

    public HomePageHelper getHomePage() {
        return homePage;
    }

    public DashboardHelper getDashboard() {
        return dashboard;
    }
}
