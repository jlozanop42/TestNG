import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityExecutionTest {
    @BeforeClass
    public void setup() {
        System.out.println("Set up chrome system variable");
    }

    @Test(priority = 1)
    public void signIn() {
        System.out.println("Sign in");
    }

    @Test(priority = 2)
    public void searchTShirt() {
        System.out.println("Search T-Shirt");
    }

    @Test(priority = 3)
    public void signOut() {
        System.out.println("Sign out");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Clean up chrome cookies");
    }

}
