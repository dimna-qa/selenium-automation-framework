import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.*;

public class EndToEndTest {

    WebDriver driver;
    LoginPage login;
    ProductsPage products;
    CheckoutPage checkout;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        login = new LoginPage(driver);
        products = new ProductsPage(driver);
        checkout = new CheckoutPage(driver);
    }

    @Test
    public void completeFlow() {

        login.login("standard_user", "secret_sauce");

        products.addProductToCart();
        products.goToCart();

        checkout.clickCheckout();
        checkout.enterDetails("Test", "User", "12345");
        checkout.finishOrder();

        System.out.println("Order completed");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}