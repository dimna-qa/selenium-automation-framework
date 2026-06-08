import org.testng.annotations.Test;

public class GroupDemo {

    @Test(groups = "smoke")
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test(groups = "smoke")
    public void searchTest() {
        System.out.println("Search Test");
    }

    @Test(groups = "regression")
    public void checkoutTest() {
        System.out.println("Checkout Test");
    }
}