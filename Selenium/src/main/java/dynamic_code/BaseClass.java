package dynamic_code;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
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

	public static void Screenshot(String foldername, String Screenshotname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		// folder name="./folder name/screenShotname.png"
		File target = new File("./" + foldername + "/" + "ScreenShotname.png");

		FileHandler.copy(source, target);

	}

	public static void TakeScreenShot(String foldername, String Screenshotname) throws Throwable {

		String projectpath = System.getProperty("user.dir");

		TakesScreenshot ts1 = (TakesScreenshot) driver;

		File source1 = ts1.getScreenshotAs(OutputType.FILE);

		// Foldername=projectpath+"\\foldername+screenshotname.png"

		File target1 = new File(projectpath + "\\" + foldername + "ScreenShotname.png");

		FileHandler.copy(source1, target1);

	}

	public static void MouseAction(By locator) {

		Actions act = new Actions(driver);

		// act.keyDown(Keys.PAGE_DOWN).build().perform();

		// act.keyDown(Keys.PAGE_UP).build().perform();

		WebElement element = driver.findElement(locator);

	}

}
