import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class L04_Checkboxes {
    public static void main(String[] args) {
        //WebDriverManager is an open-source Java library that carries out the management
        // (i.e., download, setup, and maintenance) of the drivers required by Selenium WebDriver (e.g., chromedriver, geckodriver, msedgedriver, etc.)
        // in a fully automated manner.
        WebDriverManager.chromedriver().setup();

        //declaration of the driver
        WebDriver driver;

        //class to manage options specific to chromeDriver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("lang=en-GB");

        //instantiate a webdriver object to drive the Chrome browser with certain options
        //A WebDriver implementation that controls a Chrome browser running on the local machine
        driver = new ChromeDriver(options);

        //navigate to the web page
        driver.get("https://www.automationtesting.co.uk/dropdown.html");



        //Represents an HTML element. Generally, all interesting operations to do with interacting with a page will be performed through this interface.
        //all elements that exist on a page will be accessed through a WebElement
        //define a WebElement (interface)
        WebElement selectElement = driver.findElement(By.cssSelector("input#cb_red"));
        boolean resultRed = selectElement.isSelected();
        System.out.println(resultRed);

        //"input#cb_green"
        boolean resultGreen = driver.findElement(By.cssSelector("input#cb_green")).isSelected();
        System.out.println(resultGreen);



    }
}
