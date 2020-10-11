package com.javafortesters.myfirsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWebElementWait {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement element = null;

    public MyWebElementWait(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElement (By locator, int waitSec) {
        wait = new WebDriverWait(driver,waitSec);

        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            System.out.println("Element found");
        }
        catch (Exception e) {
            System.out.println("Element not found");
        }
        return element;
    }

    public WebElement waitForClickableElement (By locator, int waitSec) {
        wait = new WebDriverWait(driver,waitSec);

        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            System.out.println("Element found");
        }
        catch (Exception e) {
            System.out.println("Element not found");
        }
        return element;
    }
}
