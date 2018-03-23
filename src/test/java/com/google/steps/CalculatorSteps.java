package com.google.steps;

import com.google.WebDriverManager;
import com.google.pages.GoogleCalculatorPage;
import com.google.pages.GoogleHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CalculatorSteps {
    private GoogleHomePage googleHomePage;
    private GoogleCalculatorPage googleCalculatorPage;

    public CalculatorSteps(GoogleHomePage googleHomePage, GoogleCalculatorPage googleCalculatorPage) {
        this.googleHomePage = googleHomePage;
        this.googleCalculatorPage = googleCalculatorPage;
    }

    @Given("^website '(.*)' is opened$")
    public void openWebsiteWithWebAddress(String webAddress){
        WebDriverManager.getDriver().get(webAddress);
    }

    @When("^navigated to '(.*)' page$")
    public void navigateToParticularPage(String query) {
        googleHomePage.openParticularPage(query);
    }

    @When("^(?:user |)clicks on '(.*)', '(.*)', '(.*)' and '(.*)' buttons consistently$")
    public void clickOnCalculatorButton(String firstArgument, String operation, String secondArgument, String equals) {
        googleCalculatorPage.clickOnCalculatorButton(firstArgument);
        googleCalculatorPage.clickOnCalculatorButton(operation);
        googleCalculatorPage.clickOnCalculatorButton(secondArgument);
        googleCalculatorPage.clickOnCalculatorButton(equals);
    }

    @Then("^received result is '(.*)'$")
    public void verifyResult(String expectedResult) {
        String actualResult = googleCalculatorPage.getCalculatorFieldContent();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
