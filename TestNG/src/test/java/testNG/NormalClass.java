package testNG;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import dynamic_code.BaseClass;

public class NormalClass extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		act = new Actions(driver);

		System.out.println("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			takeScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			screenshot("FailedListenersSS", "Kids");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
	}

	@Override
	public void onStart(ITestContext context) {
		launch_browser("chrome");
		HitUrl("https://www.snapdeal.com/");
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
	}

	public static void main(String[] args) {

	}

}
