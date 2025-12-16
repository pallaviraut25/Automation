package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.BaseClass;

public class Slider extends BaseClass {

	public static void main(String[] args) {

		launch_browser("chrome");

		HitUrl("https://jqueryui.com/slider/");

		WebElement IF = driver.findElement(By.xpath("//Iframe[@class=\"demo-frame\"]"));

		driver.switchTo().frame(IF);

		Actions act = new Actions(driver);

		WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));

		act.moveToElement(slider).clickAndHold().moveByOffset(300, 0).release().build().perform();

		act.clickAndHold(slider).moveByOffset(-100, 0).release().build().perform();
		
		act.dragAndDropBy(slider, 100, 0).build().perform();
		
		//switch driver outside the frame
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()=\"Selectable\"]")).click();
		
	}

}
