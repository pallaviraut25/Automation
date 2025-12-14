package automateSites;

import dynamic_code.BaseClass;

public class JavascriptExecutor extends BaseClass {

	public static void main(String[] args) throws Throwable {

		Thread.sleep(4000);
		launch_browser("chrome");
		
		//screenshot("TakeScreenShot","LaunchBrowser");
		Thread.sleep(4000);
		HitUrl("https://www.amazon.in/");
		//screenshot("TakeScreenShot","HitUrl");

		org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,400)");
		//screenshot("TakeScreenShot","scrollBy");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//screenshot("TakeScreenShot","document");
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,0)");
		//screenshot("TakeScreenShot","scrollto");
		Thread.sleep(4000);
		// to refresh
		js.executeScript("window.history.go(0)");
		//screenshot("TakeScreenShot","refresh");
		Thread.sleep(4000);
		// forward
		js.executeScript("window.history.forward()");
		//screenshot("TakeScreenShot","forward");
		Thread.sleep(4000);
		// Back
		js.executeScript("window.history.back()");

		driver.close();

	}

}
