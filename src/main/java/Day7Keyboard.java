import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7Keyboard {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_forms.asp");

        Actions actions = new Actions(driver);

        // First input field
        WebElement firstName = driver.findElement(By.id("fname"));

        // Second input field
        WebElement lastName = driver.findElement(By.id("lname"));

        // Type text
        firstName.sendKeys("Automation");

        // CTRL + A (Select All)
        actions.keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .perform();

        // CTRL + C (Copy)
        actions.keyDown(Keys.CONTROL)
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .perform();

        // Move to second field
       // lastName.click();
        actions.sendKeys(Keys.TAB).perform();

        // CTRL + V (Paste)
        actions.keyDown(Keys.CONTROL)
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .perform();



        Thread.sleep(5000);

        driver.quit();
    }
}