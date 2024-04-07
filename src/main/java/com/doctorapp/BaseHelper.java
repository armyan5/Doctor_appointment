package com.doctorapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BaseHelper {

    WebDriver driver;
    JavascriptExecutor js;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }


    public void clickWithJS(By locator, int x, int y) {
        js.executeScript("window.scrollBy(" + x + "," + y + " )");
        click(locator);
    }
}
