package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.BaseClass;

public class DragAndDrop extends BaseClass {

	public static void main(String[] args) {

		launch_browser("chrome");

		HitUrl("https://jqueryui.com/droppable/");

		WebElement IF = driver.findElement(By.cssSelector("iframe.demo-frame"));

		// Switch driver into frame
		driver.switchTo().frame(IF);

		Actions act = new Actions(driver);

		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));

		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));

		// act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();

		// act.dragAndDrop(drag, drop).build().perform();

		act.clickAndHold(drag).release(drop).build().perform();
 
		
		//we need to switch driver outside to frame
		
		driver.switchTo().defaultContent();
         driver.findElement(By.xpath("//a[text()=\"Draggable\"]")).click();
 
	}

}

