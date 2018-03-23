package com.google.pages;

import org.openqa.selenium.By;

public class GoogleHomePage extends AbstractPage {

    private By googleSearchField = By.xpath("//input[@type='text']");
    private By googleSearchButton = By.xpath("(//li//input[@type='button'])[1]");

    public void openParticularPage(String query) {
        getElement(googleSearchField).sendKeys(query);
        getElement(googleSearchButton).click();
    }
}
