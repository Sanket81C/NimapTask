package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage {

    private WebDriver driver;

    private By myCustomersBtn = By.xpath("//span[text()='My Customers']");
    private By newCustomerBtn = By.xpath("//span[text()='New Customer']");
    private By customerNameField = By.xpath("//input[@placeholder='Customer Name' or @id='mat-input-9']");
    private By RefNo=By.id("mat-input-29");
    private By saveBtn = By.xpath("//span[text()='Save']");

    public CustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCustomersSection() {
        driver.findElement(myCustomersBtn).click();
    }

    public void addNewCustomer(String customerName) {
        openCustomersSection();
        driver.findElement(newCustomerBtn).click();
        driver.findElement(customerNameField).sendKeys(customerName);
        driver.findElement(saveBtn).click();
    }
}
