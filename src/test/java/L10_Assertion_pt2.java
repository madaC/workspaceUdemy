import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L10_Assertion_pt2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("lang=en-GB");

        driver = new ChromeDriver(options);
        driver.get("https://www.automationtesting.co.uk/index.html");

        WebElement testStore = driver.findElement(By.linkText("TEST STORE"));
        testStore.click();

        WebElement firstItem = driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']"));
        firstItem.click();

        WebElement addToCart = driver.findElement(By.cssSelector("button[data-button-action='add-to-cart']"));
        addToCart.click();

        Thread.sleep(2000);

        //WebElement value = driver.findElement(By.xpath("//p[contains(@class,  'product-total')]"));
        //WebElement value = driver.findElement(By.xpath("//p[@class='product-total']"));
        WebElement value = driver.findElement(By.cssSelector(".product-total > .value"));
        //WebElement value = driver.findElement(By.xpath("//p[@class='product-total']/span[2]"));

        String total = value.getText();

        Assertions.assertEquals("$26.12", total);

    }
}
