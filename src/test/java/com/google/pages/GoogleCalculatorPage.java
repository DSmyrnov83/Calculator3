package com.google.pages;

import org.openqa.selenium.By;

public class GoogleCalculatorPage extends AbstractPage {

    private By calculatorField = By.xpath("//span[@id='cwos']");

    private static final String CALCULATOR_BUTTON_TEMPLATE = "//span[@class='cwbts' and text()='%s']";

    public void clickOnCalculatorButton(String buttonName) {
        String locator = String.format(CALCULATOR_BUTTON_TEMPLATE,buttonName);
        getElement(By.xpath(locator)).click();
    }

    public String getCalculatorFieldContent() {
        return getElement(calculatorField).getText();
    }
}
