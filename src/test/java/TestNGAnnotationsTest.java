import org.testng.annotations.*;

public class TestNGAnnotationsTest {

    @Test
    public void searchCustomer() {
        System.out.println("Search for customer");
    }

    @Test
    public void searchProduct() {
        System.out.println("Search for product");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Set chrome system property");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Open up chrome browser");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Open up application under test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Sign in");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Sign out");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Close application under test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Close browser");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Clean up browser cookies");
    }
}