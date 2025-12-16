package automateSites;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import dynamic_code.BaseClass;

public class ProjectPath extends BaseClass {

	public static void main(String[] args) throws IOException {

		String projectpath = System.getProperty("user.dir");

		// System.out.println(projectpath);

		launch_browser("chrome");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		// Folder Path:projectpath+"\\Foldername\\Screenshotname.png"
		File target = new File(projectpath + "\\TakeScreenshot\\ChromeSS2.png");

		FileHandler.copy(source, target);

		HitUrl("https://www.amazon.in/");
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;

		File source1 = ts1.getScreenshotAs(OutputType.FILE);

		// Folder Path:projectpath+"\\Foldername\\Screenshotname.png"
		File target1 = new File(projectpath + "\\TakeScreenshot\\HitUrlSS2.png");

		FileHandler.copy(source1, target1);
	}

}
