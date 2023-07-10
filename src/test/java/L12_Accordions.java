import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L12_Accordions {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("lang=en-GB");

        driver = new ChromeDriver(options);
        //load a new web page in the current browser window
        //the method will block until the load is complete
        driver.get("https://www.automationtesting.co.uk/accordion.html");

        //WebElement firstAccordion = driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)"));
        //firstAccordion.click();
       // Thread.sleep(2000);
        //firstAccordion.click();

        for (int i =0; i<10; i++) {
            WebElement firstAccordion = driver.findElement(By.cssSelector(".accordion > div:nth-of-type(1)"));
            firstAccordion.click();
            firstAccordion.click();
        }
        driver.quit();

    }
}
