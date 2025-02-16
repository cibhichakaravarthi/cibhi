package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    public WebDriver chromeDriver;
    public WebDriverWait wait;

    public BasePage(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
        this.wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10)); // Implicit wait of 10 seconds
        PageFactory.initElements(chromeDriver, this);
    }
}
