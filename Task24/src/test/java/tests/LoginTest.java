package tests;

import base.BaseTest;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.loginPage;

public class LoginTest extends BaseTest {
	//For positive scenarios 
    @Test(priority = 1)
    public void testLoginSuccess() throws Exception {
        
            // Initialize pages
            HomePage homePage = new HomePage(chromeDriver);
            loginPage loginPage = new loginPage(chromeDriver);

            // Perform actions
            homePage.clickLogin();
            chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            loginPage.enterUsername("cibhi12337");
            loginPage.enterPassword("password123");
            loginPage.clickLoginButton();

            // Check for alert and handle it
            try {
                Alert alert = chromeDriver.switchTo().alert();
                String alertText = alert.getText();
                alert.accept(); // Close the alert
                throw new RuntimeException("Login failed with alert: " + alertText);
            } catch (NoAlertPresentException e) {
                // No alert present, proceed with verification
            }
            // Verify login
            loginPage.verifylogin("Login Verified");

    }
    //for failed test scenarios
    @Test(priority = 2)
    public void testLoginFaliure() throws Exception {
        
        // Initialize pages
        HomePage homePage = new HomePage(chromeDriver);
        loginPage loginPage = new loginPage(chromeDriver);

        // Perform actions
        homePage.clickLogin();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.enterUsername("cibhi12311");
        loginPage.enterPassword("password123");
        loginPage.clickLoginButton();

        // Check for alert and handle it
        try {
            Alert alert = chromeDriver.switchTo().alert();
            String alertText = alert.getText();
            alert.accept(); // Close the alert
            throw new RuntimeException("Login failed with alert: " + alertText);
        } catch (NoAlertPresentException e) {
            // No alert present, proceed with verification
        }
        // Verify login
        loginPage.verifylogin("Login Verified");

}
}