package testNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(dependsOnMethods = "launchBrowser", priority = 1)
	public void HitUrl() {
		System.out.println("HitUrl");
	}

	@Test
	public void launchBrowser() {
		System.out.println("launchBrowser");
	}

	@Test(priority = 2)
	public void click() {
		System.out.println("click");
	}

	@Test(priority = 3)
	public void search() {
		System.out.println("search");
	}

}
