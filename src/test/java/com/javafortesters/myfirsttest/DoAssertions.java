package com.javafortesters.myfirsttest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DoAssertions {

    private WebDriver driver;

    public DoAssertions(WebDriver driver) {
        this.driver = driver;
    }

    public void checkValues(String expectedResult, String actualResult) {
        Assert.assertEquals("Check the expected result with actual result",expectedResult,actualResult);
    }
}
