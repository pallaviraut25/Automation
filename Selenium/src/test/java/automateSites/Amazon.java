package automateSites;

import java.io.IOException;

import dynamic_code.BaseClass;

public class Amazon extends BaseClass {

	public static void main(String[] args) throws Throwable {
		
		launch_browser ("Chrome");
		
		//HitUrl("https://www.amazon.in/");
		HitUrl ("https://www.railyatri.in/");
		
		//Screenshot("TakeScreenShot","YatriSS");
		
		TakeScreenShot("YatriScreenShot","RailyatriSS2");
		
	}

}
