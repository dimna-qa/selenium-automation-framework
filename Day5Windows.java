import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Day5Windows {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");

        // Click link to open new window
        driver.findElement(By.linkText("Click Here")).click();

        // Get window handles
        Set<String> windows = driver.getWindowHandles();

        for (String win : windows) {
            driver.switchTo().window(win);
        }

        System.out.println(driver.getTitle());

        driver.quit();
    }
}