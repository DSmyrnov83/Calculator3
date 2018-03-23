package com.google.pages;

import com.google.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    private static final Long TIMEOUT = 30L;

    protected void waitForElementPresent(final By locator) {
        new WebDriverWait(WebDriverManager.getDriver(), TIMEOUT).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected WebElement getElement(final By locator) {
        waitForElementPresent(locator);
        return WebDriverManager.getDriver().findElement(locator);
    }
}
