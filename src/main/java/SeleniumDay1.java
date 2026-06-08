import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay1 {

    public static void main(String[] args) {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open Google website
        driver.get("https://www.google.com");

        // Print page title
        System.out.println("Page Title: " + driver.getTitle());

        // Print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Close the browser
        driver.quit();
    }
}