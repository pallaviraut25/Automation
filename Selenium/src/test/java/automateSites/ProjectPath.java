package automateSites;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import dynamic_code.BaseClass;

public class ProjectPath extends BaseClass {

	public static void main(String[] args) throws Throwable {

		String projectpath = System.getProperty("user.dir");

		System.out.println(projectpath);

		launch_browser("Chrome");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		// Folder Path="\\Folder name\\screenshotname.png"

		File target = new File(projectpath + "\\TakeScreenShot\\SS1.png");

		FileHandler.copy(source, target);

		HitUrl("https://www.amazon.in/");

		TakesScreenshot ts1 = (TakesScreenshot) driver;

		File source1 = ts1.getScreenshotAs(OutputType.FILE);

		// Folder Path="\\Folder name\\screenshotname.png"

		File target1 = new File(projectpath + "\\TakeScreenShot\\SS2.png");

		FileHandler.copy(source1, target1);

	}

}
