package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.BaseClass;

public class KeyBoardActions extends BaseClass {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");

		HitUrl("https://www.jeevansathi.com/");

		// Keyboard Action--KeyDown--Page Down

		// Create Object of action Class,pass parameter--driver

		Actions act = new Actions(driver);
		// Thread.sleep(3000);
		// act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		// Thread.sleep(3000);
		// act.keyDown(Keys.PAGE_DOWN).build().perform();
		
		// Thread.sleep(3000);
		// act.keyDown(Keys.PAGE_UP).build().perform();
		
		//Thread.sleep(3000);
		// act.keyDown(Keys.PAGE_UP).build().perform();
		
		//Thread.sleep(3000);
		//act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//Thread.sleep(3000);
		//act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//Thread.sleep(3000);
		//act.sendKeys(Keys.PAGE_UP).build().perform();
		
		//Thread.sleep(3000);
		//act.sendKeys(Keys.PAGE_UP).build().perform();

		WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		email.click();
		email.sendKeys("rautpallavi168");
		
		//Select all--Control press and hold and press a
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.TAB).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}
}
