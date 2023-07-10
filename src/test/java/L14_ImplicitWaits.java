import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L14_ImplicitWaits {

    //instance variable - created when an object of the class in created
    //can be accessed only by creating objects
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
    void test() {
        //driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        String loaderURL = "https://www.automationtesting.co.uk/loader.html";
        driver.get(loaderURL);

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        WebElement buttonLoad = driver.findElement(By.cssSelector("button#loaderBtn"));
        buttonLoad.click();

        String expectedHeading = "And you have clicked the button!";
        String  heading= driver.findElement(By.cssSelector("p#p_wording")).getText();

        assertEquals(expectedHeading, heading);

    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
}
