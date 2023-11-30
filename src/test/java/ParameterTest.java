import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Parameters({"URL", "BrowserType"})
    @Test
    public void testParameters(String url, String browser) {
        System.out.println("Url of application: " + url);
        switch (browser) {
            case "Microsoft Edge":
                System.out.println("Starting MS edge browser");
                break;
            case "Firefox":
                System.out.println("Starting Firefox browser");
                break;
            case "Chrome":
                System.out.println("Starting firefox browser");
                break;
        }
    }
}
