package tests;

import base.BaseTest;
import java.time.Duration;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.signUpPage;

public class SignUpTest extends BaseTest {

    @Test
    public void testSignUp() throws Exception {
            // Initialize pages
            HomePage homePage = new HomePage(chromeDriver);
            signUpPage signUpPage = new signUpPage(chromeDriver);

            // Perform actions
            homePage.clickSignUp();
            chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            signUpPage.enterUsername("cibhi12343");
            signUpPage.enterPassword("password123");
            signUpPage.clickSignUpButton();
            Thread.sleep(2000);

            // Verify sign up
            signUpPage.verifysignUp("Sign up");            
    }
}
