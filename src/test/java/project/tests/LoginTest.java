package project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import project.BaseTest;
import project.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {
        LoginPage login = new LoginPage(driver);
        login.login("sanketchougule081@gmail.com", "SANket@90");

        // simple assertion: check URL contains dashboard or user is redirected
        String current = driver.getCurrentUrl();
        Assert.assertTrue(current.contains("dashboard") || current.contains("/auth/login") == false,
                "Login may have failed. Current URL: " + current);
    }
}
