import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Day6Actions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement image = driver.findElement(By.xpath("(//img)[1]"));

        /*Actions actions = new Actions(driver);

        // Hover
        actions.moveToElement(image).perform();

        // Wait until text appears (REAL WAIT)
        WebElement text = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5"))
        );

        System.out.println(text.getText());*/

        Actions actions = new Actions(driver);

        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(source, target).perform();

        driver.quit();
    }
}