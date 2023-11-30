import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAssertionsTest {
    @BeforeClass
    public void setup() {
        System.out.println("Set up chrome system variable");
    }

    @Test
    public void assertionsTest() {
        System.out.println("Sign in");
        Assert.assertEquals(true, true, "The welcome link is not as expected");
        System.out.println("Assert equals completed");
        Assert.assertTrue(false, "Dashboard is not displayed");
        System.out.println("Assert true completed");
        Assert.assertFalse(true, "Welcome button is not displayed");
        System.out.println("Assert false completed");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Clean up chrome cookies");
    }
}
