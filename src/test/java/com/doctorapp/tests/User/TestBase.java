package com.doctorapp.tests.User;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;


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


}

