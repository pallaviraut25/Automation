package windowHandles;

import org.openqa.selenium.JavascriptExecutor;

import dynamic_code.BaseClass;

public class WindowHandles extends BaseClass {

	public static void main(String[] args) {

		launch_browser("chrome");

		HitUrl("https://www.naukri.com/");

		// JavascriptExecutor("window.scrollBy(0,document.body.scrollHeight)");

	}

}
