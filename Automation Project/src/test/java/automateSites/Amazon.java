package automateSites;

import java.io.IOException;

import dynamic_code.BaseClass;

public class Amazon extends BaseClass {

	public static void main(String[] args) throws Throwable {

		launch_browser("Chrome");

		HitUrl("https://www.railyatri.in/");

		//screenshot("TakeScreenshot", "HitUrlSS3");
		
		javascriptExecutor("window.scrollBy(0,document.body.scrollHeight)");
		takeScreenshot("Screenshot", "TopToBottomSS1");
	}

}
