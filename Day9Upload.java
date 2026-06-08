import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9Upload {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        // Locate file input
        WebElement upload = driver.findElement(By.id("file-upload"));

        // Send file path
        upload.sendKeys("C:\\Users\\lenovo\\Desktop\\testfile.txt");

        // Click upload
        driver.findElement(By.id("file-submit")).click();

        System.out.println("File uploaded successfully");

        driver.quit();
    }
}