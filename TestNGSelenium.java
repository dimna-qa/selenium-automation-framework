import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGSelenium {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }

    @Test
    public void loginTest() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        System.out.println("Login test executed");
    }

    @Test
    public void titleTest() {
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}