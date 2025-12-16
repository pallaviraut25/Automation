package automateSites;

import dynamic_code.BaseClass;

public class JavascriptExecutor extends BaseClass {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");
		screenshot("TakeScreenshot", "LaunchBrowser");

		HitUrl("https://www.railyatri.in/");
		screenshot("TakeScreenshot", "HitUrl");
		org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;

		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,500)");
		screenshot("TakeScreenshot", "ScrollDown");
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		screenshot("TakeScreenshot", "TopToBottom");
		Thread.sleep(4000);

		js.executeScript("window.scrollTo(0,0)");
		screenshot("TakeScreenshot", "BottomToTop");

		// To Refresh

		Thread.sleep(4000);
		js.executeScript("window.history.go(0)");
		screenshot("TakeScreenshot", "Refresh");

		// To Back

		Thread.sleep(4000);
		js.executeScript("window.history.back()");
		screenshot("TakeScreenshot", "Back");
		
		// To Forward

		Thread.sleep(4000);
		js.executeScript("window.history.forward()");
		screenshot("TakeScreenshot", "Forward");

		Thread.sleep(3000);
		driver.close();
	}

}
