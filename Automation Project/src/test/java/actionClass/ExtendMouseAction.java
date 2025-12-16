package actionClass;

import org.openqa.selenium.By;

import dynamic_code.BaseClass;

public class ExtendMouseAction extends BaseClass {

	public static void main(String[] args) {
		
		launch_browser("chrome");
		
		//HitUrl("https://jqueryui.com/slider/");
		//mouseAction(By.xpath("//a[text()=\"Themes\"]"));
		//slider(By.cssSelector("iframe.demo-frame"), By.xpath("//span[@tabindex=\"0\"]"));
		
		HitUrl("https://jqueryui.com/droppable/");
		
		dragAndDrop(By.cssSelector("iframe.demo-frame"),By.cssSelector("div#draggable") ,By.cssSelector("div#droppable") );
		
	}

}
