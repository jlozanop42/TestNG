import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class PriorityExecutionTest {
    @BeforeClass
    public void setup() {
        System.out.println("Set up chrome system variable");
    }

    public void signIn() {
        System.out.println("Sign in");
    }

    public void searchTShirt() {
        System.out.println("Search T-Shirt");
    }

    public void signOut() {
        System.out.println("Sign out");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Clean up chrome cookies");
    }

}
