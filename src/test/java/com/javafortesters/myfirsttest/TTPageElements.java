package com.javafortesters.myfirsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TTPageElements {

    private WebDriver driver;
    private WebElement element;
    private MyWebElementWait webElementWait;

    public TTPageElements(WebDriver driver) {
        this.driver = driver;
        webElementWait = new MyWebElementWait(driver);
    }

    private WebElement findAbout() {
        element = driver.findElement(By.xpath("//ul[@class='tp-text-links']//a[@title='About']"));
        return element;
    }

    public void clickAbout() {
        findAbout().click();
    }

    private WebElement findBreadcrumb () {
        element = webElementWait.waitForElement(By.cssSelector("a[title='Home']"),3);
        //driver.findElement(By.cssSelector("a[title='Home']"));
        return element;
    }

    public void clickBreadcrumb () {
        findBreadcrumb().click();
    }

    private WebElement findConsultation () {
        element = webElementWait.waitForElement(By.xpath("//a[@class=' first-level ']/span[text()='Consultation']"),3);
        return element;
    }

    public void clickConsultation () {
        findConsultation().click();
    }

    private WebElement findSearchField () {
        element = webElementWait.waitForElement(By.xpath("//form[@id='search-form']//input[@name='tt-search-form__input']"),2);
        return element;
    }

    public void searchTaxTechnical(String searchKey) {
        findSearchField().sendKeys(searchKey);
        element = webElementWait.waitForElement(By.xpath("//form[@id='search-form']//button[@type='submit']"),4);
        element.click();
    }

    public WebElement buttonField () {
        element = webElementWait.waitForElement(By.className("dropdown-toggle"),3);
        return element;
    }

    private WebElement findTPLink() {
        element = webElementWait.waitForClickableElement(By.cssSelector(".tp-text-links>li>a[title='IR Tax Policy']"),3);
        return element;
    }

    public void clickTPLink() {
        findTPLink().click();
    }

    private WebElement findIRMain () {
        element = driver.findElement(By.xpath("//header//a[@title='IR main site']"));
        return element;
    }

    public void  clickIRMain () {
        findIRMain().click();
    }
}
