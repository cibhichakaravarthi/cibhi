package Task18;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends mainChorme {
	@Test
	public void test1(){
		//load url
		chromeDriver.get("https://jqueryui.com/droppable/");
		
		//switeh to frame
		chromeDriver.switchTo().frame(chromeDriver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//Find source and target elements
		WebElement source = chromeDriver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = chromeDriver.findElement(By.xpath("//div[@id='droppable']"));
		
		//perform drap and drop operation
		Actions action = new Actions(chromeDriver);
		action.dragAndDrop(source, target).perform();
		
		//Verify that the drag and drop operation is successful by checking the color property of the target CSS
       		String backGround = target.getCssValue("background-color");
        	System.out.println("Background color after drag and drop: " + backGround);
		
        	//Verify that the text of the target element changes
        	String targetText = target.getText();
        	if(targetText.equals("Dropped!")) {
            		System.out.println("Drag and drop operation was successful.");
        	}
        	else {
            		System.out.println("Drag and drop operation was failed.");

        	}
	}
}


