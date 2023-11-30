import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionsTest {

    SoftAssert softAssert = new SoftAssert();
    //Soft assert will continue the execution of the test, It will not skip to the next annotation
    @BeforeClass
    public void setup() {
        System.out.println("Set up chrome system variable");
    }

    @Test
    public void assertionsTest() {
        // With soft assert we need to use assertAll at the end of the code
        // otherwise it will pass the test even if there is a failure
        System.out.println("Sign in");
        softAssert.assertEquals(true, true, "The welcome link is not as expected");
        System.out.println("Assert equals completed");
        softAssert.assertTrue(false, "Dashboard is not displayed");
        System.out.println("Assert true completed");
        softAssert.assertFalse(true, "Welcome button is not displayed");
        System.out.println("Assert false completed");

        softAssert.assertAll();
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Clean up chrome cookies");
    }
}
