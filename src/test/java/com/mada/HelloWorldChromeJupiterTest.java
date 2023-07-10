package com.mada;


import com.borland.silk.keyworddriven.annotations.Keyword;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloWorldChromeJupiterTest {


    //we declare a Java attribute using the interface WebDriver,
    // we use this "instance?" variable to control web browsers
    private WebDriver driver;

    @Keyword
    static void setupClass() {
        // we call WebDriverManager to manage the required driver
        WebDriverManager.chromedriver().setup();

    }

    @Keyword
    void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("lang=en-GB");
        //we instantiate the WebDriver object to control Chrome, we create an object of the type ChromeDriver
        driver = new ChromeDriver(options);
    }

    @Keyword
    void test() {
        String sutURL = "https://bonigarcia.dev/selenium-webdriver-java/";
        //we open the practice site using the get() method of our webdriver variable
        driver.get(sutURL);

        String title = driver.getTitle();

        //verify the title
        assertThat(title).isEqualTo("Hands-On Selenium WebDriver with Java");

        //assertions using Junit
        //get the URL currently loaded in the browser - we confirm the current URL is still the same
        assertEquals(sutURL, driver.getCurrentUrl());

        //check that the source HTML of the page contains a given tag
        assertThat(driver.getPageSource()).containsIgnoringCase("</html>");
    }

    @Keyword
    void testSessionId() {
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");

        SessionId sessionId = ((RemoteWebDriver) driver).getSessionId();
        assertThat(sessionId).isNotNull();

    }


    @Keyword
    void teardown() {
        driver.quit();
    }

}
