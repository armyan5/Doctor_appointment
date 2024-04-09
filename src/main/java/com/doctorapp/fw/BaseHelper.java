package com.doctorapp.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseHelper {
    public WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
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
}
