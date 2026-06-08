import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6Dropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));

        Select select = new Select(dropdown);

        // Select by visible text
        select.selectByVisibleText("Option 1");
        Thread.sleep(4000);
        // OR
        // select.selectByIndex(2);

        // OR
        // select.selectByValue("1");

        driver.quit();
    }
}