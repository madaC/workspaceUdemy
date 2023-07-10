import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class L06_DropDownMenu {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("lang=en-GB");

        driver = new ChromeDriver(options);
        driver.get("https://www.automationtesting.co.uk/dropdown.html");

        WebElement select = driver.findElement(By.cssSelector("select#cars"));
        Select menuItem = new Select(select);
        //menuItem.selectByVisibleText("BMW");
        menuItem.selectByValue("bmw");
        driver.quit();

    }

}
