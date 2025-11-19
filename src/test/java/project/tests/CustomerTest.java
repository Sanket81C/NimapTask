package project.tests;

import org.testng.annotations.Test;
import project.BaseTest;
import project.LoginPage;
import project.CustomerPage;

public class CustomerTest extends BaseTest {

    @Test
    public void addCustomerTest() {
        LoginPage login = new LoginPage(driver);
        login.login("sanketchougule081@gmail.com", "SANket@90");

        CustomerPage customer = new CustomerPage(driver);
        customer.addNewCustomer("Automation_Customer_01");
    }
}
