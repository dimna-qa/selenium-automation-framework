import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage{

    WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    By cartIcon = By.className("shopping_cart_link");

    // Actions
    public void addProductToCart() {
        driver.findElement(addToCart).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}