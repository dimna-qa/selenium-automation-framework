import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Day8Tables {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");

        /*List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));

        for (WebElement row : rows) {
            System.out.println(row.getText());
        }*/

        List<WebElement> lastNames = driver.findElements(
                By.xpath("//table[@id='table1']//td[1]")
        );

        for (WebElement name : lastNames) {
            System.out.println(name.getText());
        }
        driver.findElement(
                By.xpath("//td[text()='Bach']/following-sibling::td/a[text()='edit']")
        ).click();
        Thread.sleep(5000);

        driver.quit();
    }
}