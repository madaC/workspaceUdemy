import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L08_RadioButtons {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("lang=en-GB");

        driver = new ChromeDriver(options);
        driver.get("https://www.automationtesting.co.uk/dropdown.html");

       // [for='demo-priority-normal']
        //[for='demo-priority-low']
        //[for='demo-priority-high']

        WebElement radioOne = driver.findElement(By.cssSelector("[for='demo-priority-low']"));
        radioOne.click();

        WebElement radioTwo = driver.findElement(By.cssSelector("[for='demo-priority-normal']"));
        radioTwo.click();



    }
}
