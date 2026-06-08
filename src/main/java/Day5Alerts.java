import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5Alerts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click alert button
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(4000);
        // Print alert text
        System.out.println(alert.getText());

        // Accept alert
        alert.accept();

        driver.quit();
    }
}