package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By emailInput = By.xpath("//input[contains(@placeholder,'Email Id / Mobile No')]");
    private By passwordInput = By.xpath("//input[contains(@placeholder,'Password')]");
    private By loginButton = By.id("kt_login_signin_submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://testffc.nimapinfotech.com/auth/login");
    }

    public void login(String email, String password) {
        open();
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
