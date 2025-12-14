package automateSites;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import dynamic_code.BaseClass;

public class AmazonScreenShot extends BaseClass {

	public static void main(String[] args) throws IOException {

		launch_browser("Chrome");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("./Screenshot/chromeSS1.png");

		FileHandler.copy(source, target);

		HitUrl("https://www.amazon.in/");

		TakesScreenshot ts1 = (TakesScreenshot) driver;

		File source1 = ts1.getScreenshotAs(OutputType.FILE);

		File target1 = new File("./Screenshot/HitUrlSS2.png");

		FileHandler.copy(source1, target1);

	}

}
