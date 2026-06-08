import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        System.out.println("The page title is "+driver.getTitle());

        // Enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click login
        driver.findElement(By.id("login-button")).click();

        System.out.println(driver.getCurrentUrl());

        Thread.sleep(8000);

        driver.quit();
    }
}