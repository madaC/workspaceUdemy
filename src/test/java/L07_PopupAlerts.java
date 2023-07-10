import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L07_PopupAlerts {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("lang=en-GB");

        driver = new ChromeDriver(options);
        driver.get("https://www.automationtesting.co.uk/popups.html");

        WebElement alertElement = driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']"));
        alertElement.click();

        Thread.sleep(3000);
        driver.switchTo().alert().accept();

    }
}
