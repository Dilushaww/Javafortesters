package com.javafortesters.myfirsttest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class TTTCsRefactored {

    private WebDriver driver;
    private String url = "https://www.taxtechnical.ird.govt.nz/";
    private TTPageElements pageElements;
    private DoAssertions da;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        pageElements = new TTPageElements(driver);
        da = new DoAssertions(driver);
    }

    @Test
    public void testBreadcrumbAbout() {
        pageElements.clickAbout();
        pageElements.clickBreadcrumb();
        da.checkValues("https://www.taxtechnical.ird.govt.nz/",driver.getCurrentUrl());
    }

    @Test
    public void externalLinkIRMain() throws InterruptedException {
        pageElements.clickIRMain();
    }

    @Test
    public void externalLinkTP() {
        pageElements.clickTPLink();
    }

    @Test
    public void testBreadcrumb() {
        pageElements.clickConsultation();
        pageElements.clickBreadcrumb();
        da.checkValues("https://www.taxtechnical.ird.govt.nz/",driver.getCurrentUrl());
    }

    @Test
    public void searchBestMatchResult() {
        pageElements.searchTaxTechnical("My tax");
        da.checkValues("Best match",pageElements.buttonField().getText());
    }

    @After
    public void tearDown() throws Exception {
       Thread.sleep(1000);
        driver.quit();
    }
}