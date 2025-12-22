package testNG;

import org.testng.annotations.Test;

//6 Test Cases--3 High--2 Medium--1 Low
public class Groups {
	@Test(groups = { "High" },priority = 1)
	public void launchBrowser() {
		System.out.println("launchBrowser");
	}

	@Test(groups = { "High" },priority = 2)
	public void HitUrl() {
		System.out.println("HitUrl");
	}

	@Test(groups = { "High" },priority =3 )
	public void search() {
		System.out.println("search");
	}

	@Test(groups = { "Medium" },priority = 4)
	public void click() {
		System.out.println("click");
	}

	@Test(groups = { "Medium" },priority =5 )
	public void senddata() {
		System.out.println("senddata");
	}

	@Test(groups = { "Low" },priority = 6)
	public void overlap() {
		System.out.println("overlap");
	}

}
