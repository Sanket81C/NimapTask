package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    private WebDriver driver;

    By signUpLink = By.xpath("//a[contains(@class,'kt-login__signup-link') or contains(@class,'kt-link kt-login__signup-link')]");
    By nameField = By.xpath("//input[contains(@id,'mat-input')]");
    By mobileField = By.xpath("//input[contains(@placeholder,'Mobile No')]");
    By emailField = By.xpath("//input[contains(@placeholder,'Email Id')]");
    By signUpButton = By.id("kt_login_signin_submit");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openSignUpForm() {
        driver.findElement(signUpLink).click();
    }

    public void signUpUser(String name, String mobile, String email) {
        openSignUpForm();
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(mobileField).sendKeys(mobile);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(signUpButton).click();
    }
}
