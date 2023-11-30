import org.testng.annotations.Test;

public class DependencyTest {
    // OrangeHRM demo https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

    @Test(groups = "initialize")
    public void test1SetupChrome() {
        System.out.println("Test 1: Setup chrome");
    }

    @Test(dependsOnGroups = "initialize", groups = "env_application")
    public void test2OpenOrangeHRM() {
        System.out.println("Test 2: Open Application");
    }

    @Test(dependsOnGroups = "env_application")
    public void test3SignIn() {
        System.out.println("Test 3: Sign in");
    }

    @Test(dependsOnGroups = "env_application")
    public void test4SearchUser() {
        System.out.println("Test 4: Search for a user");
    }

    @Test(dependsOnGroups = "env_application")
    public void test5SearchEmployee() {
        System.out.println("Test 5: Search employee");
    }

    @Test(dependsOnGroups = "env_application")
    public void test6SearchCandidate() {
        System.out.println("Test 6: Search candidate");
    }

    @Test(dependsOnGroups = "env_application")
    public void test7SignOut() {
        System.out.println("Test 7: Sign out");
    }

}
