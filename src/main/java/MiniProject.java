import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class MiniProject {

    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));

        // Login
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")))
                .sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button"))).click();

        // Add product to cart
        wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")))
                .click();

        // Go to cart
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(5000);

        // Checkout
        wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout"))).click();

        // Fill details
        driver.findElement(By.id("first-name")).sendKeys("Test");
        driver.findElement(By.id("last-name")).sendKeys("User");
        driver.findElement(By.id("postal-code")).sendKeys("12345");

        driver.findElement(By.id("continue")).click();

        // Finish
        wait.until(ExpectedConditions.elementToBeClickable(By.id("finish"))).click();

        System.out.println("Order placed successfully");
        Thread.sleep(5000);

        driver.quit();
    }
}