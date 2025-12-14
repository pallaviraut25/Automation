package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//To Maximize Window
		
		driver.manage().window().maximize();
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getPageSource();
		//driver.findElement("");
		driver.getWindowHandle();
		driver.switchTo();
		
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(3000);
		
		//Explicit Wait
		//Syntax a)WebDriver Wait
		
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		
		//wait.until(ExpectedConditions.visibilityOfAllElements("Locator"));
		
		//Syntax b)Fluent Wait
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchFieldException.class);

		//Thread.sleep
		
		
	}

}
