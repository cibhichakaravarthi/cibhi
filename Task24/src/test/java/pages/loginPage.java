package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BasePage;

public class loginPage extends BasePage {

    public loginPage(WebDriver chromeDriver) {
        super(chromeDriver);
        PageFactory.initElements(chromeDriver, this);
    }

    @FindBy(id = "loginusername")
    private WebElement usernameField;

    @FindBy(id = "loginpassword")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Log in']")
    private WebElement loginButton;
    
    @FindBy(id = "logout2")
    WebElement logoutButton; // Assuming this appears upon successful login

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

	public void verifylogin(String login) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(4000); // Wait for potential changes on the page
        Assert.assertTrue(logoutButton.isDisplayed(), "Logout button is not displayed, login failed.");
		
	}
}

