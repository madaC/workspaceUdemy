import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class L11_PopUps {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("lang=en-GB");

        driver = new ChromeDriver(options);
        driver.get("https://www.automationtesting.co.uk/popups.html");

        WebElement popUp = driver.findElement(By.cssSelector("[onclick='popup\\(\\)']"));
        popUp.click();

        //the driver is getting the id of the window that the focus is on
        String MainWindow = driver.getWindowHandle();

        //using a set to store all the open window handle id's
        Set<String> handles = driver.getWindowHandles();

        //Iterator interface is an object that can be used to loop through a collection
        //creating an iterator object to parse through eac value in the set
        Iterator<String> iterate = handles.iterator();

        //while loop checks to see if there is a next value in the set
        while(iterate.hasNext()) {
            //child variable stores the value of the next window handle id
            String child = iterate.next();

            if(!MainWindow.equalsIgnoreCase(child)) {
                Thread.sleep(3000);
                //switches focus to the child window
                driver.switchTo().window(child);
                driver.close();
            }
        }

        Thread.sleep(3000);
        //bring focus back to the main window
        driver.switchTo().window(MainWindow);
        driver.quit();



    }
}
