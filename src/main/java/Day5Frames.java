import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5Frames {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");

        // Switch to frame
        driver.switchTo().frame("mce_0_ifr");

        // Type inside frame
        driver.findElement(By.id("tinymce")).clear();
        driver.findElement(By.id("tinymce")).sendKeys("Hello Frame!");

        // Switch back to main page
        driver.switchTo().defaultContent();

        driver.quit();
    }
}