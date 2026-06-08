import org.testng.annotations.Test;

public class PriorityDemo {

    @Test(priority = 1)
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test(priority = 2)
    public void addToCartTest() {
        System.out.println("Add to Cart");
    }

    @Test(priority = 3)
    public void checkoutTest() {
        System.out.println("Checkout");
    }
}