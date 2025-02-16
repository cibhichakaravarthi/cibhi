package tests;

import base.BaseTest;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.signUpPage;

public class SignUpTest extends BaseTest {
	
	//For postive scenarios
    @Test(priority = 1)
    public void testSignUpSuccess() throws Exception {
            // Initialize pages
            HomePage homePage = new HomePage(chromeDriver);
            signUpPage signUpPage = new signUpPage(chromeDriver);

            // Perform actions
            homePage.clickSignUp();
            chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            signUpPage.enterUsername("cibhi12364");
            signUpPage.enterPassword("password123");
            signUpPage.clickSignUpButton();

            // Verify sign up
            signUpPage.verifysignUp("Sign up");            
    }
    @Test(priority = 2)
    public void testSignUpFailure() throws Exception {
            // Initialize pages
            HomePage homePage = new HomePage(chromeDriver);
            signUpPage signUpPage = new signUpPage(chromeDriver);

            // Perform actions
            homePage.clickSignUp();
            chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            signUpPage.enterUsername("cibhi12349");
            signUpPage.enterPassword("password123");
            signUpPage.clickSignUpButton();
            
           
            // Verify sign up
            Assert.assertTrue(chromeDriver.findElement(By.id("nonexistentElement")).isDisplayed());

    }
}
