import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.openqa.selenium.io.FileHandler;

public class Day9Screenshot {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        // Take screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save screenshot
        FileHandler.copy(src, new File("screenshot.png"));

        System.out.println("Screenshot saved");
        Thread.sleep(5000);

        driver.quit();
    }
}