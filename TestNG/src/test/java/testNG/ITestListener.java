package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dynamic_code.BaseClass;

@Listeners(NormalClass.class)
public class ITestListener extends BaseClass {
	@Test(priority = 1)
	public void launch_Browser() {
		System.out.println("launch_Browser");

	}

	@Test(priority = 2)
	public void HitUrl() {
		System.out.println("HitUrl");
	}

	@Test(priority = 3)
	public void menSFashion() {
		WebElement menSFashion = driver.findElement(By.xpath("//div[text()=\"Men's Fashion\"]"));
		act.moveToElement(menSFashion).build().perform();
		System.out.println("menSFashion");
	}

	@Test(priority = 4)
	public void womenSFashion() {
		WebElement womenSFashion = driver.findElement(By.xpath("//div[text()=\"Women's Fashion\"]"));
		act.moveToElement(womenSFashion).build().perform();
		System.out.println("womenSFashion");
	}

	@Test(priority = 5)
	public void HomeAndKitchen() {
		WebElement HomeAndKitchen = driver.findElement(By.xpath("//div[text()=\"Home & Kitchen\"]"));
		act.moveToElement(HomeAndKitchen).build().perform();
		System.out.println("HomeAndKitchen");
	}

	@Test(priority = 6)
	public void Kids() {
		WebElement Kids = driver.findElement(By.xpath("//div[text()=\"Kid's Fashio\"]"));
		act.moveToElement(Kids).build().perform();
		System.out.println("Kids");
	}

	@Test(priority = 7)
	public void Searchbar() {
		WebElement Searchbar = driver.findElement(By.xpath("//input[@class=\"search-box-input\"]"));
		Searchbar.click();
		Searchbar.sendKeys("Kitchen Product");
		System.out.println("Searchbar");
	}

	@Test(priority = 8)
	public void TopToBottom() {
		javascriptExecutor("window.scrollBy(0,document.body.scrollHeight)");

		System.out.println("TopToBottom");
	}
	@Test(priority = 8)
	public void MobileAccessories() {
		driver.findElement(By.xpath("//a[text()=\"Mobiles Accessories\"]")).click();

		System.out.println("MobileAccessories");
	}

}
