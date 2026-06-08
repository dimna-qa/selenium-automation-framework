import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Day4Waits {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        // Create wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for username field and enter text
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")))
                .sendKeys("standard_user");

        // Password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click login
        //driver.findElement(By.id("login-button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button"))).click();

        // Wait for product page title
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));

        // Print title
        System.out.println(driver.getTitle());

        driver.quit();
    }
}