package Task21;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class nestedFrame extends mainChorme {
	@Test
	public void test1() throws InterruptedException {
		
		//load url
		chromeDriver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//switch to top frame
		chromeDriver.switchTo().frame("frame-top");
		
		//verify there are 3 frames
		List<WebElement> frames = chromeDriver.findElements(By.xpath("//frame"));
        if (frames.size() == 3) {
            System.out.println("There are three frames on the page");
        } else {
            System.out.println("The number of frames is not three");
        }
        
        //switch to left frame
        chromeDriver.switchTo().frame("frame-left");
        
        // Verify that the left frame has a text "LEFT"
        WebElement left = chromeDriver.findElement(By.xpath("//body[contains(text(), 'LEFT')]"));
        if (left.getText().contains("LEFT")) {
            System.out.println("Left frame has the text LEFT");
        } else {
            System.out.println("Left frame does not have the text LEFT");
        }
        
        //switch to top frame
        chromeDriver.switchTo().parentFrame();
        
        //switch to middle
        chromeDriver.switchTo().frame("frame-middle");
        
        // Verify that the left frame has a text "MIDDLE"
        WebElement middle = chromeDriver.findElement(By.xpath("//div[@id='content']"));
        if (middle.getText().contains("MIDDLE")) {
            System.out.println("Middle frame has the text MIDDLE");
        } else {
            System.out.println("Middle frame does not have the text MIDDLE");
        }
        
        //switch to top frame
        chromeDriver.switchTo().parentFrame();
        
        //switch to right
        chromeDriver.switchTo().frame("frame-right");
        
        // Verify that the left frame has a text "MIDDLE"
        WebElement right = chromeDriver.findElement(By.xpath("//body[contains(text(), 'RIGHT')]"));
        if (right.getText().contains("RIGHT")) {
            System.out.println("Right frame has the text RIGHT");
        } else {
            System.out.println("Right frame does not have the text Right");
        }
        
        //switch to top frame
        chromeDriver.switchTo().parentFrame();
        
        //swtich to default frame
        chromeDriver.switchTo().defaultContent();
        
        //switch to right
        chromeDriver.switchTo().frame("frame-bottom");
        
        // Verify that the left frame has a text "MIDDLE"
        WebElement bottom = chromeDriver.findElement(By.xpath("//body[contains(text(), 'BOTTOM')]"));
        if (bottom.getText().contains("BOTTOM")) {
            System.out.println("Bottom frame has the text BOTTOM");
        } else {
            System.out.println("Bottom frame does not have the text BOTTOM");
        }
        
        //switch to top frame
        chromeDriver.switchTo().parentFrame();
        chromeDriver.switchTo().defaultContent();
        
        //This page doesnot have page title so I am using pageurl
        
        //verify page url is frame
        String url = "https://the-internet.herokuapp.com/nested_frames";
        String pageUrl = chromeDriver.getCurrentUrl();
        Thread.sleep(2000);
        if(pageUrl.equals(url)) {
        	System.out.println("we landed on correct page");
        }
        else {
        	System.out.println("we wrongly landed. It is: " +pageUrl);
        }
	}

}
