package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider
    public static Object[][] loginData() {
        return new Object[][]{{"myemail@gmail.com", "1234pwd", true},
                {"mySecondEmail@gmail.com", "1234qwerty", false},
                {"myThird@gmail.com", "1234asdf", true}};
    }
}
