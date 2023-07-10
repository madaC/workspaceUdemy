
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class L09_Assertion_pt1 {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("lang=en-GB");

        driver = new ChromeDriver(options);
        driver.get("https://www.automationtesting.co.uk/index.html");

        String pageTitle = driver.getTitle();

        Assertions.assertEquals("Homepage", pageTitle);



    }
}
