package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Calculator3/chromedriver.exe"); //here it needs to change chromedriver file location
            driver = new ChromeDriver();
        }
        return driver;
    }
}
