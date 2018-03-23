package com.google.steps;

import com.google.WebDriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void executedBeforeEach() {
        WebDriverManager.getDriver().manage().window().maximize();
    }

    @After
    public void executedAfterEach() {
        WebDriverManager.getDriver().quit();
    }

}
