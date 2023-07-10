import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.assertj.core.api.Assertions.assertThat;

public class L13_HiddenElements {
    private WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("lang=en-GB");

        driver = new ChromeDriver(options);

    }

    @Test
    void hiddenElements() {
        driver.get("https://www.automationtesting.co.uk/hiddenElements.html");
       // WebElement hiddenElement = driver.findElement(By.cssSelector(".col-12 col-12-small > p:nth-of-type(2)"));
        assertThat(driver.findElement(By.cssSelector(".col-12 col-12-small > p:nth-of-type(2)")).isDisplayed()).isFalse();

    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}
