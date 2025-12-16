package automateSites;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FaceBookScreenShot {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.xpath("//input[@name=\"email\"]"));

		email.click();

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("./FaceBookScreenShot/chromeSS1.png");

		FileHandler.copy(source, target);

		email.sendKeys("rautpallavi168");

		TakesScreenshot ts1 = (TakesScreenshot) driver;

		File source1 = ts1.getScreenshotAs(OutputType.FILE);

		File target1 = new File("./FaceBookScreenShot/chromeSS2.png");

		FileHandler.copy(source1, target1);

		WebElement pass = driver.findElement(By.xpath("//input[@ type=\"password\"]"));

		pass.click();
		pass.sendKeys("23456");
		
		TakesScreenshot ts2 = (TakesScreenshot) driver;

		File source2 = ts2.getScreenshotAs(OutputType.FILE);

		File target2 = new File("./FaceBookScreenShot/chromeSS3.png");

		FileHandler.copy(source2, target2);

	}

}