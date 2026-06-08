import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;

public class LoginTest {

    WebDriver driver;
    LoginPage login;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        login = new LoginPage(driver);
    }

    @Test
    public void loginTest() {
        login.login("standard_user", "secret_sauce");
        System.out.println("Login successful");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}