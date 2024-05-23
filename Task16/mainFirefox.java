package Task16;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class mainFirefox {
	
	FirefoxDriver fireFoxDriver;

	    @Before
	    public void setUp() {
	    	// load firefox driver
	        fireFoxDriver = new FirefoxDriver();
	        fireFoxDriver.manage().window().maximize();
	    }

	    @After
	    public void tearDown(){
	    	// close the firefox
	    	fireFoxDriver.quit();
	    }

		
	}


