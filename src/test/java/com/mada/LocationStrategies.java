package com.mada;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.*;

public class LocationStrategies {
     /*
    There are three steps when creating an object from a class −
     Declaration − A variable declaration with a variable name with an object type.
     Instantiation − The 'new' keyword is used to create the object.
     Initialization − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.
     */

    //we declare a variable using the interface webdriver
    WebDriver driver;

    @BeforeAll
    static void setupClass() {
        //we call WebDriverManager to manage the required driver
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("lang=en-GB");
        //we instantiate/initialize the WebDriver object to control Chrome, we create an object of the type ChromeDriver
        //start the session
        driver = new ChromeDriver(options);

    }

    @Test
    void testByTagName() {
        //take action on browser and navigate to a web page
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
        String title = driver.getTitle();
        System.out.println(title);

        //explicit wait -  to wait for the textarea button to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textarea = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea")));

        assertThat(textarea.getDomAttribute("rows")).isEqualTo("3");

    }

    @Test
    public void testByHtmlAttributes() {


    }

    @AfterEach
    //end the session
    void teardown() {driver.quit();}




}
