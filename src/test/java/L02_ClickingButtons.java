import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L02_ClickingButtons {
    public static void main(String[] args) {
        //WebDriverManager is an open-source Java library that carries out the management
        // (i.e., download, setup, and maintenance) of the drivers required by Selenium WebDriver (e.g., chromedriver, geckodriver, msedgedriver, etc.)
        // in a fully automated manner.
        //declaration of the driver
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        //class to manage options specific to chromeDriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("lang=en-GB");

        //instantiate a webdriver object to drive the Chrome browser with certain options
        //A WebDriver implementation that controls a Chrome browser running on the local machine
        driver = new ChromeDriver(options);

        //navigate to the web page
        driver.get("https://www.automationtesting.co.uk/buttons.html");

        //Represents an HTML element. Generally, all interesting operations to do with interacting with a page will be performed through this interface.
        //all elements that exist on a page will be accessed through a WebElement
        //define a WebElement (interface)
        //WebElement element= driver.findElement(By.cssSelector("button[id='btn_three']"));
        WebElement button= driver.findElement(By.cssSelector("button#btn_three"));
        button.click();

        driver.get("https://www.automationtesting.co.uk/contactForm.html");
        WebElement firstName = driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.sendKeys("Madalina");

        WebElement lastName = driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.sendKeys("Grigor");

        WebElement emailAddress = driver.findElement(By.cssSelector("input[name='email']"));
        firstName.sendKeys("test@udemy.com");

        WebElement commentsArea = driver.findElement(By.cssSelector("textarea[name='message']"));
        commentsArea.sendKeys("This is a message");




    }
}
