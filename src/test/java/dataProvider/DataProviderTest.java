package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "loginData")
    public void login(String email, String password, boolean passed) {
        System.out.println("Login credentials: " + "\n" +
                "email: " + email + "\n" +
                "password: " + password + "\n" +
                "Sucessfull login: " + passed);

    }

    @Test(dataProviderClass = DataProviderClass.class, dataProvider = "loginData")
    public void loginTestWithDataProviderClass(String email, String password, boolean passed) {
        System.out.println("Login credentials: " + "\n" +
                "email: " + email + "\n" +
                "password: " + password + "\n" +
                "Sucessfull login: " + passed);

    }

    @DataProvider
    public Object[][] loginData() {
        return new Object[][]{{"myemail@gmail.com", "1234pwd", true},
                {"mySecondEmail@gmail.com", "1234qwerty", false},
                {"myThird@gmail.com", "1234asdf", true}};
    }
}
