package dynamic_code;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class BaseClass {

	public static WebDriver driver;
	public static Actions act;
	public static String projectpath = System.getProperty("user.dir");

	public static void launch_browser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		}

		else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		}

		System.out.println("The Browser Launch Is As:" + browser);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

	}

	public static void HitUrl(String url) {

		driver.get(url);

		System.out.println("The Title of Webpage is as:" + driver.getTitle());

	}

	public static void screenshot(String foldername, String Screenshotname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		// Foldername:"./"+foldername+"/"+Screenshotname+".png"
		File target = new File("./" + foldername + "/" + Screenshotname + ".png");

		FileHandler.copy(source, target);
	}

	public static void takeScreenshot(String foldername1, String Screenshotname1) throws IOException {

		// String projectpath = System.getProperty("user.dir");

		TakesScreenshot ts1 = (TakesScreenshot) driver;

		File source1 = ts1.getScreenshotAs(OutputType.FILE);

		// Foldername:projectpath + "\\" + foldername1 + "\\" + Screenshotname1 + ".png"
		File target1 = new File(projectpath + "\\" + foldername1 + "\\" + Screenshotname1 + ".png");

		FileHandler.copy(source1, target1);

	}

	public static void javascriptExecutor(String scroll) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(scroll);

	}

	public static void keyboardAction() {
		act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		act.keyDown(Keys.PAGE_UP).build().perform();

	}

	public static void mouseAction(By locator) {

		act = new Actions(driver);

		WebElement element = driver.findElement(locator);

		act.moveToElement(element).click().build().perform();

		// act.moveToElement(element).contextClick().build().perform();

		// act.moveToElement(element).click().sendKeys("1234").doubleClick().build().perform();

	}

	public static void dragAndDrop(By Locator, By Locator1, By Locator2) {

		WebElement IF = driver.findElement(Locator);
		driver.switchTo().frame(IF);
		act = new Actions(driver);
		WebElement drag = driver.findElement(Locator1);
		WebElement drop = driver.findElement(Locator2);

		// act.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();

		// act.dragAndDrop(drag, drop).build().perform();

		act.clickAndHold(drag).release(drop).build().perform();
		
		driver.switchTo().defaultContent();

	}

	public static void slider(By Locator1, By Locator2) {

		WebElement IF = driver.findElement(Locator1);

		driver.switchTo().frame(IF);

		act = new Actions(driver);

		WebElement slider = driver.findElement(Locator2);

		act.moveToElement(slider).clickAndHold().moveByOffset(300, 0).release().build().perform();

		act.clickAndHold(slider).moveByOffset(-100, 0).release().build().perform();

		act.dragAndDropBy(slider, 100, 0).build().perform();
		
		driver.switchTo().defaultContent();

	}

}