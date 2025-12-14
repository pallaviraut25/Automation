package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.BaseClass;

public class MouseActions extends BaseClass {

	public static void main(String[] args) {

		launch_browser("chrome");

		HitUrl("https://www.railyatri.in/");

		Actions act = new Actions(driver);

		WebElement ts = driver.findElement(By.cssSelector("input#pnrField"));

		// act.moveToElement(ts).click().build().perform();

		// act.moveToElement(ts).contextClick().build().perform();

		act.moveToElement(ts).click().sendKeys("1234").doubleClick().build().perform();
		
		

	}

}
