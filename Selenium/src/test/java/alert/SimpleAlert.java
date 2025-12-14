package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.BaseClass;

public class SimpleAlert extends BaseClass {

	public static void main(String[] args) throws Throwable {

		launch_browser("chrome");

		HitUrl("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();

		Alert SA = driver.switchTo().alert();

		// Thread.sleep(3000);
		// SA.accept();

		// NoAlertPresentException:
		// System.out.println(SA.getText());

		System.out.println("--------------------Confirmation Alert-----------------");

		// driver.findElement(By.xpath("//a[text()=\"Alert with OK & Cancel//
		// \"]")).click();

		// driver.findElement(By.xpath("//button[text()=\"click the button to display a
		// confirm box \"]")).click();
		Alert CA = driver.switchTo().alert();

		// Thread.sleep(3000);
		// CA.accept();
		CA.dismiss();

		WebElement text = driver.findElement(By.cssSelector("p#demo"));
		System.out.println("The text present is as:" + text.getText());

		System.out.println("-------------------------------------------------------------------------");

		WebElement txt = driver.findElement(By.cssSelector("p#demo"));

		System.out.println("The text present is as:" + txt.getText());

		System.out.println("---------------------------------------------------------");

		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();

		driver.findElement(By.cssSelector("//button[@class=\"btn btn-info\"]"));

		Alert PA = driver.switchTo().alert();

		Thread.sleep(3000);
		PA.accept();

		PA.sendKeys("Pallavi Raut");
		PA.accept();

		WebElement txt1 = driver.findElement(By.xpath("//p[@id=\"demo1\"]"));

		System.out.println(txt1.getText());
		PA.dismiss();

	}

}
